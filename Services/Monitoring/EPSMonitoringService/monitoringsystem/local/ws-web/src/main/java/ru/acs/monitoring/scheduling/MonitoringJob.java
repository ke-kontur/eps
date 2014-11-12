package ru.acs.monitoring.scheduling;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;
import org.springframework.scheduling.quartz.QuartzJobBean;

import ru.acs.monitoring.MonitoringService;

/**
 * Задача , которая будет вызывать процесс мониторинга.
 * Его нужно включить если будут подключена уведомители для сервиса мониторинга
 * @author fmv
 *
 */
public class MonitoringJob extends QuartzJobBean implements StatefulJob {
	private static final Log log = LogFactory.getLog(MonitoringJob.class);
	
	MonitoringService monitoringService;

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		log.debug("MonitoringJob Run");
		if (monitoringService!=null){
			log.debug("Запуск процесса мониторига...");
			monitoringService.scan();
		}
	}

	public MonitoringService getMonitoringService() {
		return monitoringService;
	}

	public void setMonitoringService(MonitoringService monitoringService) {
		this.monitoringService = monitoringService;
	}


}
