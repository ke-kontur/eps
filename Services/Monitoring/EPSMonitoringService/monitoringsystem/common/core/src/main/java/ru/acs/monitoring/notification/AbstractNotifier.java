package ru.acs.monitoring.notification;

import java.util.List;

import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.monitoring.domain.MonitoringInfoWrapper;

public abstract class AbstractNotifier implements Notifier {
	Severity sendSeverity=Severity.WARNING;
	
	/*
	 * (non-Javadoc)
	 * @see ru.acs.monitoring.notification.Notifier#getSendSeverity()
	 */
	public Severity getSendSeverity() {
		return sendSeverity;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.acs.monitoring.notification.Notifier#setSendSeverity(ru.acs.fts.dto.monitoring.Severity)
	 */
	public void setSendSeverity(Severity sendSeverity) {
		this.sendSeverity = sendSeverity;
	}
	
	public void notify(List<MonitoringInfoWrapper> infos) {
		if (infos!=null){
			for (MonitoringInfoWrapper monitoringInfo : infos) {
				notify(monitoringInfo);
			}
		}
		
	}
}
