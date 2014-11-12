package ru.acs.monitoring.services.collect;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.monitoring.MonitoringRuntimeException;
import ru.acs.monitoring.MonitoringService;
import ru.acs.monitoring.domain.CommonSettings;
import ru.acs.monitoring.domain.Connection;
/**
 * Запрос информации от агентов через WS
 * @author fmv
 *
 */
public class MIWsRequester {
	final static Logger log = LoggerFactory.getLogger(MIWsRequester.class);
	final static String Ws_Service_Name = "MonitoringService";
	CommonSettings settings;
	
	public MonitoringInfo getMonitoringInfo(Connection connection) {
		if (connection.getWsUrl()==null){
			log.error("Запрос информации для "+connection.getName()+" не произведен: не установлен URL веб сервиса!");
			return null;
		}
		String url = getWsUrl(connection);
		MonitoringInfo info = null;	
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(MonitoringService.class);
		factory.setAddress(url);
		Client cl = null;
		HTTPConduit conduit = null;
		try {
			MonitoringService client = (MonitoringService) factory.create();
			cl = ClientProxy.getClient(client);
 	        if (client != null) {
 	            conduit = (HTTPConduit) cl.getConduit();
 	            HTTPClientPolicy policy = new HTTPClientPolicy();
 	            policy.setConnectionTimeout(Math.round(settings.getWebServiceTimeout()*1.2)*1000);
 	            policy.setReceiveTimeout(settings.getWebServiceTimeout()*1000);
 	            conduit.setClient(policy);
 	        }
			if (!connection.getUseCache()) {
				log.debug("Invoke getMonitoringInfo()....");
				info = client.getMonitoringInfo();
				log.debug("End Invoke getMonitoringInfo()....");
			} else {
				log.debug("Invoke getCachedMonitoringInfo()....");
				info = client.getCachedMonitoringInfo();
				log.debug("End Invoke getCachedMonitoringInfo()....");
			}
 	        
			
		} catch (Exception e) { // XXX разобраться какие кидаются исключения
			log.error(e.getMessage(),e);
			throw new  MonitoringRuntimeException("Ошибка получения данных от агента мониторинга, возможно агент не запущен. Ошибка при вызове веб-сервиса: "
							+ e.getMessage());
		}
		finally {
			try {
				if (conduit != null)
					conduit.close();
				if (cl != null)
					cl.destroy();
			} catch (Exception exc) { 
				log.error("Ошибка при завершении вызова веб-сервисов");
			}
		}
		return info;
	}

	private String getWsUrl(Connection connection) {
		String url = connection.getWsUrl();
		if (!url.endsWith(Ws_Service_Name)) {
			if (!url.endsWith("/")) {
				url += "/";
			}
			url += Ws_Service_Name;
		}
		return url;
	}
	@Autowired
	public void setSettings(CommonSettings settings) {
		this.settings = settings;
	}

}
