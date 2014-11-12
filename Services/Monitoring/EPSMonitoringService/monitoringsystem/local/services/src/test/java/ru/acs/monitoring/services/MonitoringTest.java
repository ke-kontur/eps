package ru.acs.monitoring.services;

import java.util.Calendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.monitoring.MonitoringService;
import ru.acs.monitoring.MonitoringServiceImpl;
import ru.acs.monitoring.common.utils.MonitoringInfoStringSerializer;
import ru.acs.monitoring.utils.WMI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/monitoring-beans.xml"})
public class MonitoringTest {
		Log log = LogFactory.getLog(MonitoringTest.class);
		
		DBMonitoringProcess  dbMonitoring;
		MonitoringServiceImpl monitoringService;
		
		@Test
		public void testGetDbMonitoringInfo(){
			MonitoringInfo info  =new MonitoringInfo();
			dbMonitoring.fillMonitoringInfo(info);
			log.info(info.getDatabaseInfos()); 
		}
		
		@Test
		public void testGetMonitoringInfo(){
			MonitoringInfo info= monitoringService.getMonitoringInfo();
			Assert.assertNotNull(info);
			
			log.info(new MonitoringInfoStringSerializer().serialize(info));
		}
		@Test
		public void testMonitoringScan(){
			monitoringService.scan();
		}
		
		//@Test
		public void testWMI(){
			Calendar now = Calendar.getInstance();
			Calendar start = Calendar.getInstance();
			start.add(Calendar.MONTH, -4);
			for (int i = 0; i < 30000; i++) {
				WMI wmi = new WMI();
				int result = wmi.getEventLogErrorsCount("System", "W32Time", start.getTime(), now.getTime());
				wmi.getRunningServices();
				wmi.getTotalMemorySize();
				wmi.getWindowsFreeMemorySize();
				log.info(result);
			}
		}

		
		@Autowired
		public void setDBMonitoring(DBMonitoringProcess dbMonitoring) {
			this.dbMonitoring = dbMonitoring;
		}
		
		@Autowired
		public void setMonitoringService(MonitoringServiceImpl monitoringService) {
			this.monitoringService = monitoringService;
		}
		
		@Test
		public void tesRunWS() throws Exception{
	        ServerFactoryBean svrFactory = new ServerFactoryBean();
	        svrFactory.setServiceClass(MonitoringService.class);
	        svrFactory.setAddress("http://localhost:9001/MonitoringService");
	        svrFactory.setServiceBean(monitoringService);
	        svrFactory.create(); 	
	        System.out.println("Server ready...");
	        runWSClient();
	      //  Thread.sleep(5 *1000);
	        System.out.println("Server exiting");
	    //    System.exit(0);	        
		}
		public void runWSClient(){
			  ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
		        factory.setServiceClass(MonitoringService.class);
		            factory.setAddress("http://localhost:9001/MonitoringService");
		         //   factory.setAddress("http://localhost:8080/monitoring-ws/MonitoringService");
		        	//factory.setAddress("http://192.168.23.83:9988/monitoring-ws/MonitoringService");
		            MonitoringService wsClient = (MonitoringService)factory.create();
		        Client client = ClientProxy.getClient(wsClient);
    	        if (client != null) {
    	            HTTPConduit conduit = (HTTPConduit) client.getConduit();
    	            HTTPClientPolicy policy = new HTTPClientPolicy();
    	            policy.setConnectionTimeout(110000);
    	            policy.setReceiveTimeout(100000);
    	            conduit.setClient(policy);
    	        }
		        log.info("Invoke getMonitoringInfo()....");
		        MonitoringInfo monitoringInfo = wsClient.getMonitoringInfo();		   
				Assert.assertNotNull(monitoringInfo);
				log.info(monitoringInfo.toString());
				log.info("Client WS call ended...");
		}
		
		
		public void runClient(){
			JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		        factory.setServiceClass(MonitoringService.class);
		           // factory.setAddress("http://localhost:9000/MonitoringService");
		        //    factory.setAddress("http://localhost:8080/monitoring-ws/MonitoringService");
		        	factory.setAddress("http://192.168.23.83:9988/monitoring-ws/MonitoringService");
		        	MonitoringService client = (MonitoringService)factory.create();
		        log.info("Invoke getMonitoringInfo()....");
		        MonitoringInfo monitoringInfo = client.getMonitoringInfo();
				Assert.assertNotNull(monitoringInfo);
				log.info(monitoringInfo.toString());
				log.info("Client WS call ended...");
		}

	 
}
