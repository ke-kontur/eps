package ru.acs.monitoring.scheduling;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;
import org.springframework.scheduling.quartz.QuartzJobBean;

import ru.acs.monitoring.MonitoringService;

/**
 * Задача , которая будет вызывать процесс мониторинга для обновления скэшированных
 * данных мониторинга.
 * @author bad
 *
 */
public class CacheUpdateJob extends QuartzJobBean implements StatefulJob {
	private static final Log log = LogFactory.getLog(CacheUpdateJob.class);
	
	MonitoringService monitoringService;

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		log.debug("MonitoringJob Run");
		if (monitoringService!=null){
			log.debug("Запуск процесса обновления кэша данных мониторинга...");
			monitoringService.getMonitoringInfo();
			log.debug("Процесс обновления кэша данных мониторинга завершен");
		}
	}

	public MonitoringService getMonitoringService() {
		return monitoringService;
	}

	public void setMonitoringService(MonitoringService monitoringService) {
		this.monitoringService = monitoringService;
	}


}
