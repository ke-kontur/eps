package ru.acs.monitoring.notification;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.monitoring.domain.MonitoringInfoWrapper;

/**
 * Уведомитель о результатах мониторинга 
 * @author bad
 *
 */
public class NotificationExecutor implements Runnable{

	final static Logger log = LoggerFactory.getLogger(NotificationExecutor.class);
	/**
	 * Список уведомителей
	 */
	private List<Notifier> notificators;
	private MonitoringInfoWrapper info;
	
	public NotificationExecutor(List<Notifier> notificators, MonitoringInfoWrapper info) {
		super();
		this.notificators = notificators;
		this.info = info;
	}

	public void run() {
		if (notificators != null) {
			for (Object notif : notificators) {
				Notifier notify = (Notifier) notif;
				if (checkSeverity(info.getInfo(), notify.getSendSeverity())) {
					try {
						log.info("Запущен процесс уведомления -  "
								+ notify.getNotifierName());
						notify.notify(info);
						log.info("Процесс уведомления -  "
								+ notify.getNotifierName() + " завершен");
					} catch (Exception e) { // так должно быть, так как ни одно
						// исключение не должно обрушивать
						// процесс уведомлений
						String error = "Ошибка во время уведомлений. Процесс: "
								+ notify.getNotifierName() + ". Ошибка: "
								+ e.getMessage();
						log.error(error, e);
					}
				}
			}
		} else {
			log.debug("Уведомителей не обнаружено");
		}
	}
	
	private boolean checkSeverity(MonitoringInfo info, Severity sendSeverity) {
		if (sendSeverity == Severity.ERROR
				&& (Severity.WARNING == getMaxSeverity(info) || Severity.INFO == getMaxSeverity(info))) {
			return false;
		}
		if (sendSeverity == Severity.WARNING && Severity.INFO == getMaxSeverity(info)) {
			return false;
		}
		return true;
	}
	
	private Severity getMaxSeverity(MonitoringInfo info) {
		return info.getSeverity();
	}
}
