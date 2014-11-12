package ru.acs.monitoring.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ru.acs.fts.dto.adapters.DateUtilities;
import ru.acs.fts.dto.monitoring.MonitoringAttribute;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.MqMonitoringInfo;
import ru.acs.fts.dto.monitoring.QueueManagerInfo;
import ru.acs.fts.dto.monitoring.QueueStatus;
import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.fts.mqmonitoring.MQMonitorException;
import ru.acs.fts.mqmonitoring.QManagerMonitorConfig;
import ru.acs.fts.mqmonitoring.QManagerMonitorStatus;
import ru.acs.fts.mqmonitoring.QueueManagerMonitor;
import ru.acs.fts.mqmonitoring.QueueMonitorStatus;
import ru.acs.monitoring.common.utils.SeverityComparator;
import ru.acs.monitoring.common.utils.SeverityUtils;

public class MQMonitoringProcess implements MonitoringProcess {
	final static Logger log = LoggerFactory.getLogger(MQMonitoringProcess.class);

	List<QManagerMonitorConfig> qmConfig;
	
	@Override
	public MonitoringAttribute getAddedOrDefaultAtribute(MonitoringInfo info) {
		if (info.getMqMonitoringInfo() == null)
			info.setMqMonitoringInfo(new MqMonitoringInfo());
		return info.getMqMonitoringInfo();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ru.acs.monitoring.services.MonitoringProcess#getMonitoringInfo(ru.acs
	 * .monitoring.types.MonitoringInfo)
	 */
	public void fillMonitoringInfo(MonitoringInfo info) {
		if (qmConfig==null || qmConfig.size()==0){
			log.debug(getProcessName()+" не запущен, т.к. не настроен список менеджеров для проверки");
			return;
		}
		log.info("Запущен " + getProcessName());
		MqMonitoringInfo mqInfo = new MqMonitoringInfo();
		mqInfo.setUpdateTime(DateUtilities.xmlCalendar());
		for (QManagerMonitorConfig conf : qmConfig) {
			QueueManagerMonitor monitor = new QueueManagerMonitor(conf);
			log.debug("Проверям менеджер '" + conf.getHost() + "@" + conf.getQManagerName() + "'");
			QManagerMonitorStatus status = monitor.monitoring();
			mqInfo.getQueueManagerInfos().add(getQueueManagerInfo(status));

		}
		mqInfo.setSeverity(SeverityUtils.getMaxSeverity(mqInfo));
		info.setMqMonitoringInfo(mqInfo);
	}

	/**
	 * Формирует по нативной информации мониторинга MQ информацию мониторинга
	 * 
	 * @param status
	 * @return
	 */
	private QueueManagerInfo getQueueManagerInfo(QManagerMonitorStatus status) {
		Severity severity = Severity.INFO;
		QueueManagerInfo info = new QueueManagerInfo();
		info.setHost(status.getConfig().getHost());
		info.setQueueManagerName(status.getConfig().getQManagerName());
		info.setAvailable(status.isAvailable());
		if (!info.isAvailable()) {
			severity = Severity.ERROR;
		}

		for (QueueMonitorStatus queueStatus : status.getQueueStatuses()) {
			QueueStatus monStatus = getQueueInfo(queueStatus);
			info.getQueueStatuses().add(monStatus);
			severity=SeverityComparator.getMaxSeverity(severity,monStatus.getSeverity());
		}
		info.setUpdateTime(DateUtilities.xmlCalendar());
		info.setSeverity(severity);
		return info;
	}

	/**
	 * Преобразует объект нативного мониторинга MQ в родной для мониторинга
	 * 
	 * @param queueStatus
	 * @return
	 */
	private QueueStatus getQueueInfo(QueueMonitorStatus queueStatus) {
		QueueStatus monStatus = new QueueStatus();
		monStatus.setSeverity(Severity.INFO);
		monStatus.setAvailable(queueStatus.isAvailable());
		monStatus.setDepth(queueStatus.getDepth());
		monStatus.setExceededDepth(queueStatus.isExceededDepth());
		monStatus.setExceededInterval(queueStatus.isExceededInterval());
		monStatus.setInterval(queueStatus.getInterval()/1000);
		monStatus.setQueueName(queueStatus.getQueueName());
		monStatus.getErrors().addAll(getErrors(queueStatus.getErrors()));
		if (!monStatus.isAvailable() || monStatus.isExceededInterval()) {
			monStatus.setSeverity(Severity.ERROR);
		}else
		if (monStatus.isExceededDepth()){
			monStatus.setSeverity(Severity.WARNING);
		}

		return monStatus;
	}

	private List<String> getErrors(List<MQMonitorException> errors) {
		List<String> strErrors = new ArrayList<String>();
		for (MQMonitorException mqMonitorException : errors) {
			strErrors.add(mqMonitorException.getMessage());
		}
		return strErrors;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ru.acs.monitoring.services.MonitoringProcess#getProcessName()
	 */
	public String getProcessName() {
		return "Сервис мониторинга MQ";
	}

	public List<QManagerMonitorConfig> getQmConfig() {
		return qmConfig;
	}

	/**
	 * Установить настройки мониторуемых менеджеров и очередей
	 * 
	 * @param qmConfig
	 */
	@Autowired(required=false)
	public void setQmConfig(List<QManagerMonitorConfig> qmConfig) {
		this.qmConfig = qmConfig;
	}

}
