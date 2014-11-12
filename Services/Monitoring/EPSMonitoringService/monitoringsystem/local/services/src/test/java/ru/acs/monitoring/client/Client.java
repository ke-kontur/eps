package ru.acs.monitoring.client;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.junit.Assert;

import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.monitoring.MonitoringService;
public final class Client {
	private static Log log = LogFactory.getLog(Client.class);
    private Client() {
    } 

    public static void main(String args[]) throws Exception {
    	
        ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
        factory.setServiceClass(MonitoringService.class);
        if (args != null && args.length > 0 && !"".equals(args[0])) {
            factory.setAddress(args[0]);
        } else {
       //     factory.setAddress("http://localhost:9000/MonitoringService");
            factory.setAddress("http://localhost:8080/monitoring-ws/MonitoringService");
        	//factory.setAddress("http://192.168.23.83:9988/monitoring-ws/MonitoringService");
        }
        //factory.getServiceFactory().setDataBinding(new AegisDatabinding());
        MonitoringService client = (MonitoringService)factory.create();
        log.info("Invoke getMonitoringInfo()....");
        MonitoringInfo monitoringInfo = client.getMonitoringInfo();
		Assert.assertNotNull(monitoringInfo);
		log.info(monitoringInfo);
        System.exit(0);
    }

}
