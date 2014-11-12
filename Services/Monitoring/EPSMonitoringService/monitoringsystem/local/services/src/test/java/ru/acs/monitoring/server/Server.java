package ru.acs.monitoring.server;

import org.apache.cxf.common.i18n.Exception;
import org.apache.cxf.frontend.ServerFactoryBean;

import ru.acs.monitoring.MonitoringService;
import ru.acs.monitoring.MonitoringServiceImpl;

public class Server {
    protected Server() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new MonitoringServiceImpl();
        ServerFactoryBean svrFactory = new ServerFactoryBean();
        svrFactory.setServiceClass(MonitoringService.class);
        svrFactory.setAddress("http://localhost:9000/MonitoringService");
        svrFactory.setServiceBean(implementor);
        //svrFactory.getServiceFactory().setDataBinding(new AegisDatabinding());
        svrFactory.create(); 
    }

    public static void main(String args[]) throws Exception, InterruptedException {
        new Server();
        System.out.println("Server ready...");
        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    } 
}
