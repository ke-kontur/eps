package ru.acs.monitoring.services;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.monitoring.dao.MonitoringInfoDAO;

public class DbCleanerService {
	private static final Logger log = LoggerFactory.getLogger(DbCleanerService.class);
	MonitoringInfoDAO monitoringDAO;
	DbCleanerServiceSettings settings = new DbCleanerServiceSettings(30);
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void cleanDb(){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, -1 * settings.getStoringPeriod());
		log.debug("Производится чистка БД до "+calendar.getTime());
		int result  = monitoringDAO.delete(calendar.getTime());
		log.debug("Удалено записей: "+result);		
	}

	@Autowired
	public void setMonitoringDAO(MonitoringInfoDAO monitoringDAO) {
		this.monitoringDAO = monitoringDAO;
	}

	@Autowired(required = false)
	public void setSettings(DbCleanerServiceSettings settings) {
		this.settings = settings;
	}
}
