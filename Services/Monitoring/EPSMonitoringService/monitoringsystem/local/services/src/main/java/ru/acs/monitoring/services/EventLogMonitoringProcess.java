package ru.acs.monitoring.services;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ru.acs.fts.dto.adapters.DateUtilities;
import ru.acs.fts.dto.monitoring.EventLogMonitoringInfo;
import ru.acs.fts.dto.monitoring.EventLogMonitoringInfos;
import ru.acs.fts.dto.monitoring.MonitoringAttribute;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.monitoring.common.utils.SeverityUtils;
import ru.acs.monitoring.utils.WMI;

public class EventLogMonitoringProcess implements MonitoringProcess {
	final static Logger log = LoggerFactory
			.getLogger(EventLogMonitoringProcess.class);

	/**
	 * Список описаний проверок системных журналов
	 */

	List<EventLogCheckSettings> logEventCheckSettings;
	
	@Override
	public MonitoringAttribute getAddedOrDefaultAtribute(MonitoringInfo info) {		
		return info.getEventLogInfos();
	}

	public void fillMonitoringInfo(MonitoringInfo info) {
		WMI wmi;

		try {
			wmi = new WMI();
		} catch (Throwable th) {
			log.error("Сбой при инициализации WMI-библиотеки", th);
			return;
		}

		if (logEventCheckSettings == null || logEventCheckSettings.size() == 0) {
			log.info(getProcessName() + " не запущен, так как не настроен список проверок системных журналов!");
			return;
		}

		EventLogMonitoringInfos eventMonInfo = new EventLogMonitoringInfos();
		eventMonInfo.setName("Мониторинг системных журналов");
		eventMonInfo
				.setDescription("Информация мониторинга системных журналов");
		for (EventLogCheckSettings check : logEventCheckSettings)
			eventMonInfo.getEventLogChecks().add(getEventLogMonitoringInfo(check, wmi));
		
		eventMonInfo.setSeverity(SeverityUtils.getMaxSeverity(eventMonInfo));
		eventMonInfo.setUpdateTime(DateUtilities
				.gregorianToXml(GregorianCalendar.getInstance()));
		info.setEventLogInfos(eventMonInfo);
	}
	
	private EventLogMonitoringInfo getEventLogMonitoringInfo(EventLogCheckSettings check,WMI wmi) {
		EventLogMonitoringInfo eventLogInfo = new EventLogMonitoringInfo();
		eventLogInfo.setName(check.getName());
		eventLogInfo.setDescription(check.getDescription());
		eventLogInfo.setLogName(check.getLogName());
		eventLogInfo.setSourceName(check.getSourceName());
		eventLogInfo.setInterval(check.getInterval());
		eventLogInfo.setMaxErrorCount(check.getMaxErrorCount());
		
		eventLogInfo.setSeverity(Severity.INFO);
		try {
			Calendar now = Calendar.getInstance();
			Calendar begin = Calendar.getInstance();
			begin.add(Calendar.DAY_OF_YEAR, -1 * check.getInterval());
			int errorCount = wmi.getEventLogErrorsCount(check.getLogName(),
					check.getSourceName(), begin.getTime(), now.getTime());
			if (errorCount > check.getMaxErrorCount())				
				eventLogInfo.setSeverity(Severity.WARNING);
			eventLogInfo.setErrorCount(errorCount);
		} catch (Exception exc) {
			log.info("Сбой при выполнении проверки " + check.getName(), exc);				
			eventLogInfo.setSeverity(Severity.ERROR);
		}
		
		return eventLogInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ru.acs.monitoring.services.MonitoringProcess#getProcessName()
	 */
	public String getProcessName() {
		return "Сервис мониторинга системных журналов";
	}

	@Autowired(required = false)
	public void setLogEventCheckSettings(
			List<EventLogCheckSettings> logEventCheckSettings) {
		this.logEventCheckSettings = logEventCheckSettings;
	}

}
