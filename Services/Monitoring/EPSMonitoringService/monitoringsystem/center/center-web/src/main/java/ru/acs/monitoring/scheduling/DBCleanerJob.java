package ru.acs.monitoring.scheduling;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import ru.acs.monitoring.services.DbCleanerService;

public class DBCleanerJob extends QuartzJobBean implements StatefulJob {
	private static final Logger log = LoggerFactory.getLogger(DBCleanerJob.class);
	DbCleanerService service;
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		log.info("Запущен Job очистки БД");
		if (service != null) {
			service.cleanDb();
		} else {
			log.warn("Не настроен сервис очистки! Очистка не производится!");
		}
		log.info("Завершен Job очистки БД");

	}
	
	@Autowired
	public void setService(DbCleanerService service) {
		this.service = service;
	}

}
