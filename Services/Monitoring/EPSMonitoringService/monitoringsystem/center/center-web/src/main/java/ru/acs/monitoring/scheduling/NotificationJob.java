package ru.acs.monitoring.scheduling;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import ru.acs.monitoring.services.notification.NotificationService;

/**
 * JOb для отсылки уведомлений
 * 
 * @author fmv
 * 
 */
public class NotificationJob extends QuartzJobBean implements StatefulJob {
	private static final Logger log = LoggerFactory.getLogger(NotificationJob.class);
	private NotificationService service;

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		log.info("Запущен Job рассылки уведомлений");
		if (service != null) {
			service.run();
		} else {
			log.warn("Не установлен сервис уведомлений");
		}
		log.info("Завершен Job рассылки уведомлений");
	}
	
	public void setService(NotificationService service) {
		this.service = service;
	}

}
