package ru.acs.monitoring.app.monitoring.conn;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ru.acs.fts.dto.OXMConverter;
import ru.acs.fts.dto.monitoring.MonitoringAttribute;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.fts.webconsole.monitoring.common.client.data.State;
import ru.acs.monitoring.app.monitoring.conn.client.MonitoringService;
import ru.acs.monitoring.app.monitoring.conn.client.model.CommonInfo;
import ru.acs.monitoring.app.monitoring.conn.client.model.StateInfo;
import ru.acs.monitoring.common.utils.SeverityUtils;
import ru.acs.monitoring.domain.Connection;
import ru.acs.monitoring.domain.MonitoringInf;
import ru.acs.monitoring.notification.NotifierUtils;
import ru.acs.monitoring.services.ConnectionsService;
import ru.acs.monitoring.services.MonitoringInfoService;
import ru.acs.monitoring.utils.XsltUtils;

/**
 * Реализация {@code MonitoringService}.
 * 
 * @author Алексей Селиванов
 * @author fmv
 */
public class MonitoringServiceImpl implements MonitoringService {

	private static final Log LOG = LogFactory.getLog(MonitoringServiceImpl.class);

	private ConnectionsService connService;
	private MonitoringInfoService service;
	private static OXMConverter converter = new OXMConverter();

	// lazy
	private void initServices() {
	}

	/** {@inheritDoc} */
	public List<CommonInfo> getActualInfo() {
		initServices();

		Collection<MonitoringInf> infs = service.getLastMonitoringInf();
		Collection<MonitoringInf> prevInfs = service.getPreLastMonitoringInf();
		Collection<Connection> connections = connService.getAll();

		List<CommonInfo> commons = new LinkedList<CommonInfo>();

		for (Connection connection : connections) {
			if (connection.isDisplay()) {
				try {
					commons.add(convert(connection, infs, prevInfs));
				} catch (UnsupportedEncodingException ex) {
					LOG.error(ex);
				}
			}
		}

		return commons;
	}

	/** {@inheritDoc} */
	public String getXmlByMonitoringInfId(Long id) {
		initServices();
		String monitoringInfoXML = service.getMonitoringXML(service.getMonitoringInfById(id));
		if (monitoringInfoXML != null) {
			XsltUtils xslt = new XsltUtils();
			return xslt.transformMonitoringInfoAsStr(monitoringInfoXML);
		}
		return null;
	}
	
	private MonitoringInf findMonitoringInf(Connection connection, Collection<MonitoringInf> infs) {		
		for (MonitoringInf inf : infs) 
			if (inf.getConnection().equals(connection)) 
				return inf;			
		return null;
	}
	
	private MonitoringInfo getMonitoringInfo(MonitoringInf found) throws UnsupportedEncodingException {
		if (found == null)
			return null;
		
		String xml = service.getMonitoringXML(found);
		if (xml == null) 
			return null;
		
		return (MonitoringInfo) converter.unmarshall(xml.getBytes("UTF-8"));
	}

	private CommonInfo convert(Connection connection, Collection<MonitoringInf> infs, Collection<MonitoringInf> prevInfs)
			throws UnsupportedEncodingException {

		CommonInfo common = new CommonInfo();

		common.setConnectionId(connection.getId());
		common.setName(connection.getName());

		MonitoringInf found = findMonitoringInf(connection, infs);	

		if (found == null) {
			common.setState(new StateInfo(State.UNAVAILABLE));
			return common;
		}
		common.setMonitoringInfId(found.getId());
		
		MonitoringInfo info = getMonitoringInfo(found);
		
		if (info == null) {
			common.setState(new StateInfo(State.UNAVAILABLE));
			return common;
		}
		
		MonitoringInfo prev = getMonitoringInfo(findMonitoringInf(connection, prevInfs));		

		common.setState(new StateInfo(convert(info.getSeverity())));

		common.setDbState(getStateInfo(info.getDatabaseInfos(), prev != null? prev.getDatabaseInfos(): null));
		common.setMqState(getStateInfo(info.getMqMonitoringInfo(), prev != null? prev.getMqMonitoringInfo(): null));
		common.setServicesState(getStateInfo(info
				.getSytemServicesInfo(), prev != null? prev.getSytemServicesInfo(): null));
		common.setHostsState(getStateInfo(info.getHostInfos(), prev != null? prev.getHostInfos(): null));
		common.setEventLogState(getStateInfo(info.getEventLogInfos(), prev != null? prev.getEventLogInfos(): null));
		common.setSystemState(getStateInfo(info.getSystemInfo(), prev != null? prev.getSystemInfo(): null));
		if (info.getSignaturesInfo() != null) {
			
			Severity newSeverity = SeverityUtils.getMaxSeverity(info.getSignaturesInfo());
			if (prev != null) {
				Severity prevSeverity = SeverityUtils.getMaxSeverity(prev.getSignaturesInfo());
				prev.getSignaturesInfo().setSeverity(prevSeverity);
			}
			info.getSignaturesInfo().setSeverity(newSeverity);
			
			common.setSignState(getStateInfo(info.getSignaturesInfo(),
					prev != null ? prev.getSignaturesInfo() : null));
		}
		if (info.getMessagesProcessingInfos() != null) {
			
			State newState = convert(SeverityUtils
			.getMaxSeverity(info.getMessagesProcessingInfos()));
			
			if (prev == null)
				common.setMessageProcessingState(new StateInfo(newState));
			else {			
				boolean equals = NotifierUtils.areAtributesEquals(info.getMessagesProcessingInfos(), prev.getMessagesProcessingInfos());				
				common.setMessageProcessingState(new StateInfo(newState, !equals));
			}
		}

		return common;
	}
	
	private StateInfo getStateInfo(MonitoringAttribute attribute, MonitoringAttribute prevAttribute) {
		if (attribute == null)
			return null;
		
		if (prevAttribute == null)
			return new StateInfo(convert(attribute.getSeverity()));
		
		boolean equals = NotifierUtils.areAtributesEquals(attribute, prevAttribute);
		
		return new StateInfo(convert(attribute.getSeverity()), !equals);
	}
	
	
	


	private State convert(Severity severity) {
		switch (severity) {
		case INFO:
			return State.NORMAL;
		case WARNING:
			return State.WARNING;
		case ERROR:
			return State.ERROR;
		default:
			return null;
		}
	}

	static final State[] STATES = { State.NORMAL, State.WARNING, State.ERROR };

	@Autowired
	public void setConnService(ConnectionsService connService) {
		this.connService = connService;
	}

	@Autowired
	public void setService(MonitoringInfoService service) {
		this.service = service;
	}
	
	
	
	
	@XmlRootElement
	public static class AttributeWrapper {
		MonitoringAttribute attribute;

		public MonitoringAttribute getAttribute() {
			return attribute;
		}

		public void setAttribute(MonitoringAttribute attribute) {
			this.attribute = attribute;
		}
	}
}