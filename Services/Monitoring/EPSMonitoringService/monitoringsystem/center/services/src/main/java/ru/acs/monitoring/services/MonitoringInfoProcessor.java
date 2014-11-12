package ru.acs.monitoring.services;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.dto.OXMConverter;
import ru.acs.fts.dto.adapters.DateUtilities;
import ru.acs.fts.dto.monitoring.MessageProcessingInfo;
import ru.acs.fts.dto.monitoring.MessagesProcessingInfo;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.monitoring.dao.ConnectionDAO;
import ru.acs.monitoring.dao.MessageKindDAO;
import ru.acs.monitoring.dao.MessageProcessingStatDAO;
import ru.acs.monitoring.dao.MessageProcessingSystemDAO;
import ru.acs.monitoring.dao.MonitoringInfoDAO;
import ru.acs.monitoring.domain.Connection;
import ru.acs.monitoring.domain.MessageKind;
import ru.acs.monitoring.domain.MessageProcessingStat;
import ru.acs.monitoring.domain.MessageProcessingSystem;
import ru.acs.monitoring.domain.MonitoringInf;
import ru.acs.monitoring.domain.MonitoringInfoData;
import ru.acs.monitoring.domain.MonitoringInfoWrapper;

/**
 * Обработчик информации мониторинга
 * @author fmv
 *
 */
public class MonitoringInfoProcessor {
	private static final Logger log = LoggerFactory.getLogger(MonitoringInfoProcessor.class);
	
	MonitoringInfoDAO monitoringDAO;
	ConnectionDAO connectionDAO;
	MessageKindDAO messageKindDAO;
	MessageProcessingStatDAO messageProcessingStatDAO;
	MessageProcessingSystemDAO messageProcessingSystemDAO;

	/**
	 * Обработать информацию мониторинга 
	 * @param info
	 */
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void processMonitoringInfo(MonitoringInf info) {
		process(info);
	}
	private void process(MonitoringInf info) {
		if (info.getConnection() != null && info.getConnection().getId() == null) {
			connectionDAO.save(info.getConnection());
		}
		monitoringDAO.save(info);
		processMessageProcessingStat(info);
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void processMonitoringInfo(MonitoringInfo info,Connection connection) {
		log.info("Сохранение полученной от агента '"+connection.getName()+"' информации");
		MonitoringInf inf = getMonitoringInf(info);
		inf.setConnection(connection);
		process(inf);		
	}
	/**
	 * Сохранение статистики
	 * @param inf
	 */
	private void processMessageProcessingStat(MonitoringInf inf) {
		OXMConverter converter = new OXMConverter();
		String infXml = getMonitoringInfoXML(inf);
		if (infXml == null || infXml.equals("")) {
			return;
		}
		MonitoringInfo info;
		try {
			info = (MonitoringInfo) converter.unmarshall(infXml.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			log.error(e.getMessage(), e);
			info = (MonitoringInfo) converter.unmarshall(infXml.getBytes());
		}
		if (info.getMessagesProcessingInfos() == null || info.getMessagesProcessingInfos().size() == 0) {
			return;
		}
		for (MessagesProcessingInfo procInfo : info.getMessagesProcessingInfos()) {
			MessageProcessingSystem mpSystem = getMPSystem(procInfo, inf.getConnection());
			for (MessageProcessingInfo mpInfo : procInfo.getMessageProcessingInfos()) {
				MessageKind kind = getMessageKind(mpInfo, mpSystem);
				MessageProcessingStat stat = getMessageProcessingStat(kind, DateUtilities.getCurrDate(procInfo
						.getUpdateTime()));
				stat.setSuccess(mpInfo.getSuccessCount());
				stat.setFlkError(mpInfo.getFlkErrCount());
				stat.setError(mpInfo.getErrCount());
				messageProcessingStatDAO.update(stat);
			}
		}

	}
	
	@Transactional
	public String getMonitoringInfoXML(MonitoringInf inf) {
		return monitoringDAO.getXML(inf);
	}
	
	
	private MonitoringInf getMonitoringInf(MonitoringInfo info) {
		MonitoringInf inf = new MonitoringInf();
		inf.setSeverity(info.getSeverity().toString());
		inf.setSystemId(info.getSystemId());
		inf.setSystemName(info.getSystemName());
		inf.setUpdateDate(Calendar.getInstance().getTime());
		try {
			MonitoringInfoData data = new MonitoringInfoData();
			data.setMonitoringInfoXML(new String(convertToXml(info),"UTF-8"));
			inf.setMonitoringInfoData(data);
		} catch (UnsupportedEncodingException e) {
			log.warn(e.getMessage());
			MonitoringInfoData data = new MonitoringInfoData();
			data.setMonitoringInfoXML(new String(convertToXml(info)));
			inf.setMonitoringInfoData(data);			
		}
		return inf;
	}
	
	private byte[] convertToXml(MonitoringInfo info) {
		OXMConverter conv = new OXMConverter();
		return conv.marshall(info);
	}

	private MessageProcessingStat getMessageProcessingStat(MessageKind kind, Date currDate) {
		MessageProcessingStat stat = messageProcessingStatDAO.find(kind, currDate);
		if (stat == null) {
			stat = new MessageProcessingStat();
			stat.setMessageKind(kind);
			stat.setStatDate(currDate);
			stat.setSystem(kind.getSystem());
			messageProcessingStatDAO.save(stat);
		}
		return stat;
	}

	private MessageKind getMessageKind(MessageProcessingInfo mpInfo, MessageProcessingSystem mpSystem) {
		MessageKind kind = messageKindDAO.find(mpInfo.getMessageKind(), mpSystem);
		if (kind == null) {
			kind = new MessageKind();
			kind.setCode(mpInfo.getMessageKind());
			kind.setDescription(mpInfo.getMessageDescription());
			kind.setSystem(mpSystem);
			messageKindDAO.save(kind);
		} else {
			if (mpInfo.getMessageDescription() != null && !mpInfo.getMessageDescription().equals(kind.getDescription())) {
				kind.setDescription(mpInfo.getMessageDescription());
				messageKindDAO.update(kind);
			}
		}
		return kind;
	}

	private MessageProcessingSystem getMPSystem(MessagesProcessingInfo procInfo, Connection connection) {
		MessageProcessingSystem mpSystem = messageProcessingSystemDAO.find(procInfo.getName(), connection);
		if (mpSystem == null) {
			mpSystem = new MessageProcessingSystem();
			mpSystem.setName(procInfo.getName());
			mpSystem.setDescription(procInfo.getDescription());
			mpSystem.setConnection(connection);
			messageProcessingSystemDAO.save(mpSystem);
		}
		return mpSystem;
	}

	@Autowired
	public void setMonitoringDAO(MonitoringInfoDAO monitoringDAO) {
		this.monitoringDAO = monitoringDAO;
	}

	@Autowired
	public void setConnectionDAO(ConnectionDAO connectionDAO) {
		this.connectionDAO = connectionDAO;
	}

	@Autowired
	public void setMessageKindDAO(MessageKindDAO messageKindDAO) {
		this.messageKindDAO = messageKindDAO;
	}

	@Autowired
	public void setMessageProcessingStatDAO(MessageProcessingStatDAO messageProcessingStatDAO) {
		this.messageProcessingStatDAO = messageProcessingStatDAO;
	}

	@Autowired
	public void setMessageProcessingSystemDAO(MessageProcessingSystemDAO messageProcessingSystemDAO) {
		this.messageProcessingSystemDAO = messageProcessingSystemDAO;
	}

}
