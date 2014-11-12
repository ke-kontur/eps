package ru.acs.monitoring.scheduling;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.scheduling.quartz.QuartzJobBean;

import ru.acs.monitoring.services.TimeoutScanner;

/**
 * Job для запуска сканера просроченных запросов
 * @author fmv
 *
 */
public class TimeoutScannerJob extends QuartzJobBean implements StatefulJob {
	private static final Logger log = LoggerFactory.getLogger(TimeoutScannerJob.class);
	TimeoutScanner scanner;

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		log.info("Запущен TimeoutScannerJob");
		if (scanner != null) {
			scanner.scan();
		} else {
			log.error("Не установлен сканер просроченных сообщений");
		}

	}

	@Required
	public void setScanner(TimeoutScanner scanner) {
		this.scanner = scanner;
	}

}
