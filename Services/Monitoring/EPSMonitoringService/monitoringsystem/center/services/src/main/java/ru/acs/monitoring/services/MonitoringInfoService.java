package ru.acs.monitoring.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.monitoring.dao.ConnectionDAO;
import ru.acs.monitoring.dao.MessageProcessingStatDAO;
import ru.acs.monitoring.dao.MessageProcessingSystemDAO;
import ru.acs.monitoring.dao.MonitoringInfoDAO;
import ru.acs.monitoring.domain.Connection;
import ru.acs.monitoring.domain.MessageProcessingStat;
import ru.acs.monitoring.domain.MessageProcessingSystem;
import ru.acs.monitoring.domain.MonitoringInf;

/**
 * БЛ по обработке информации MonitoringInf
 * @author fmv
 *
 */
public class MonitoringInfoService {
	final static Logger log = LoggerFactory.getLogger(MonitoringInfoService.class); 
	MonitoringInfoDAO monitoringDAO;
	ConnectionDAO connectionDAO;
	MessageProcessingStatDAO messageProcessingStatDAO;
	MessageProcessingSystemDAO messageProcessingSystemDAO;
	

	/**
	 * Получить всю информацию мониторинга (не рекоммендуется)
	 * @return
	 */
	@Transactional(propagation=Propagation.REQUIRED)
	public List<MonitoringInf> getMonitoringInfList(){
		return monitoringDAO.findAll();
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public List<MonitoringInf> getMonitoringInfList(Date from, Date to,Long connectionId, String severity,int limit,int offset){
		StringBuffer params = new StringBuffer();
		DateFormat df = SimpleDateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		params.append("[c = ").append(df.format(from)).append(", по =").append(df.format(to)).append(", connectionId=").append(connectionId).append(" , severity=").append(severity).append(", maxLimit").append(limit).append(", offset=").append(offset);
		log.info("Запрос журнала мониторинга. Параметры: "+params.toString());
		Connection connection = null;
		if (connectionId!=null){
			connection = connectionDAO.findById(connectionId);
		}
		
		return monitoringDAO.find(from, to, connection, severity, limit, offset);		
	}

	/**
	 * Получить всю статистику (не рекоммендуется)
	 * @return
	 */
	public List<MessageProcessingStat> getMessageProcessingStats(){
		return messageProcessingStatDAO.findAll();
	}
	/**
	 * Получение статистических данных по обработке сообщений
	 * @param from с даты
	 * @param to по дату
	 * @param connectionId -ид. объекта мониторинга
	 * @param systemId - ид. системы
	 * @return
	 */
	public List<MessageProcessingStat> getMessageProcessingStat(Date from, Date to, Long connectionId,Long systemId){
		MessageProcessingSystem system =null;
		if (systemId!=null){
			system = messageProcessingSystemDAO.findById(systemId);
		}
		return messageProcessingStatDAO.find(from, to, system);
	}

	
	/**
	 * Список подсистем системы сбора статистики
	 * @param connection
	 * @return
	 */
	public List<MessageProcessingSystem> getMPSystems(Connection connection){
		return messageProcessingSystemDAO.find(connection);
	}
	
	/**
	 * Список подсистем системы сбора статистики
	 * @param connectionId
	 * @return
	 */
	public List<MessageProcessingSystem> getMPSystemsByConnectionId(Long connectionId){
		Connection connection = connectionDAO.findById(connectionId);
		return messageProcessingSystemDAO.find(connection);
	}
	
	@Autowired
	public void setMonitoringDAO(MonitoringInfoDAO monitoringDAO) {
		this.monitoringDAO = monitoringDAO;
	}
	

	public MonitoringInf getMonitoringInfById(Long id) {
		return (MonitoringInf) monitoringDAO.findById(id);
	}
	@Transactional	
	public String getMonitoringXML(MonitoringInf inf) {
		return monitoringDAO.getXML(inf);
	}

	public List<MonitoringInf> getLastMonitoringInf() {
		return monitoringDAO.findLast();
	}
	
	public List<MonitoringInf> getPreLastMonitoringInf() {
		return monitoringDAO.findPreLast();
	}

	@Autowired
	public void setMessageProcessingStatDAO(MessageProcessingStatDAO messageProcessingStatDAO) {
		this.messageProcessingStatDAO = messageProcessingStatDAO;
	}
	@Autowired
	public void setMessageProcessingSystemDAO(MessageProcessingSystemDAO messageProcessingSystemDAO) {
		this.messageProcessingSystemDAO = messageProcessingSystemDAO;
	}
	@Autowired
	public void setConnectionDAO(ConnectionDAO connectionDAO) {
		this.connectionDAO = connectionDAO;
	}
	
}
