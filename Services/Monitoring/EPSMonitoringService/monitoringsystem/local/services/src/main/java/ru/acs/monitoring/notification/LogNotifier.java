package ru.acs.monitoring.notification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.monitoring.common.utils.MonitoringInfoStringSerializer;
import ru.acs.monitoring.domain.MonitoringInfoWrapper;

/**
 * Простой уведомитель мониторинга в лог
 * @author fmv
 *
 */
public class LogNotifier extends AbstractNotifier {
	private static Logger log = LoggerFactory.getLogger(LogNotifier.class);
	public LogNotifier() {
		super();
		setSendSeverity(Severity.INFO);
	}
	/*
	 * (non-Javadoc)
	 * @see ru.acs.monitoring.notification.Notifier#notify(ru.acs.fts.dto.monitoring.MonitoringInfo)
	 */
	public void notify(MonitoringInfoWrapper infoWrapper) {
		MonitoringInfoStringSerializer ser = new MonitoringInfoStringSerializer();
		log.debug("Notify: "+'\n'+ser.serialize(infoWrapper.getInfo()) );
	}
	
	/*
	 * (non-Javadoc)
	 * @see ru.acs.monitoring.notification.Notifier#notifierName()
	 */
	public String getNotifierName() {		
		return "Уведомитель в лог";
	}
	

}
