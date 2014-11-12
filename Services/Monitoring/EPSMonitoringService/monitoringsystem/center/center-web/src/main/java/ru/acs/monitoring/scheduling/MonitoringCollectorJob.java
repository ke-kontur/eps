package ru.acs.monitoring.scheduling;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import ru.acs.monitoring.services.collect.MonitoringInfoCollector;

/**
 * Задача , которая будет вызывать процесс сбора информации мониторинга.
 * 
 * @author fmv
 *
 */
public class MonitoringCollectorJob extends QuartzJobBean implements StatefulJob {
	private static final Logger log = LoggerFactory.getLogger(MonitoringCollectorJob.class);
	MonitoringInfoCollector collector;
	
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		log.debug("MonitoringCollectorJob Run");
		if (collector==null){
			log.warn("Не установлен MonitoringCollector - сбор данных с локальных агентов не производится!");
			return;
		}
		collector.collectInfo();		
	}

	@Autowired
	public void setCollector(MonitoringInfoCollector collector) {
		this.collector = collector;
	}

}
