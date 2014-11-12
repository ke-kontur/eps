package ru.acs.monitoring.services;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.monitoring.dao.MonitoringInfoDAO;
import ru.acs.monitoring.dao.jpa.MonitoringInfoDAOJpa;
import ru.acs.monitoring.services.collect.MonitoringInfoCollector;
import ru.acs.monitoring.services.notification.NotificationService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/beans-services.xml","/beans.xml","/monitoring-mail.xml","/monitoring-jms.xml"})
public class MonitoringTest {
		Log log = LogFactory.getLog(MonitoringTest.class);		
		MonitoringInfoCollector  collector;
		MonitoringInfoService monService;
		MonitoringInfoDAO monInfoDAO;
		NotificationService notifyService;
		TimeoutScanner timeoutScaner;
		DbCleanerService dbCleaner;
		ConnectionsService connService;
		
		
		@Test
		@Transactional
		@Rollback(value=false)
		public void test() throws Exception{
			collector.collectInfo();
			monService.getMonitoringInfList();
			log.info("end test");
		}
		@Test
		public void testStat(){
			monService.getMessageProcessingStat(new Date(),new Date(),1l,1l);
		}
				
		public void testNotify(){
			collector.collectInfo();
			notifyService.run();		
		}
		@Test
		@Transactional
		public void testTimeoutScan(){
			timeoutScaner.scan();
		}
		
		@Test
		@Transactional
		public void testCleanDb(){
			DummyMID monitoringInfoDao = new DummyMID();
			dbCleaner.setMonitoringDAO(monitoringInfoDao);
			int storingPeriod = 10;
			dbCleaner.setSettings(new DbCleanerServiceSettings(storingPeriod));
			dbCleaner.cleanDb();
			Calendar requested = Calendar.getInstance();
			requested.setTime(monitoringInfoDao.getRequestedDate());
			Calendar expected = Calendar.getInstance();
			expected.add(Calendar.DAY_OF_YEAR, -1 * storingPeriod);
			Assert.assertTrue(Math.abs(expected.getTimeInMillis() - requested.getTimeInMillis()) < 1000);
		}		
		
		
		@Autowired
		public void setCollector(MonitoringInfoCollector collector) {
			this.collector = collector;
		}
		
		@Autowired
		public void setMonService(MonitoringInfoService monService) {
			this.monService = monService;
		}
		
		@Autowired
		public void setNotifyService(NotificationService notifyService) {
			this.notifyService = notifyService;
		}
		@Autowired
		public void setTimeoutScaner(TimeoutScanner timeoutScaner) {
			this.timeoutScaner = timeoutScaner;
		}
		@Autowired
		public void setDbCleaner(DbCleanerService dbCleaner) {
			this.dbCleaner = dbCleaner;
		}
		
		@Autowired
		@Required
		public void setConnService(ConnectionsService connService) {
			this.connService = connService;
		}
		
		@Autowired
		@Required
		public void setMonInfoDAO(MonitoringInfoDAO monInfoDAO) {
			this.monInfoDAO = monInfoDAO;
		}

		class DummyMID extends MonitoringInfoDAOJpa {
			private Date requestedDate;

			@Override
			public int delete(Date to) {
				requestedDate = to;
				return 0;
			}

			public Date getRequestedDate() {
				return requestedDate;
			}			
		}		
		
}
