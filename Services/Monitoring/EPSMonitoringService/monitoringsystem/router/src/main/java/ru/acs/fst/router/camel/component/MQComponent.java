package ru.acs.fst.router.camel.component;

import org.apache.camel.impl.DefaultComponent;
import org.apache.camel.Endpoint;
import org.springframework.beans.factory.annotation.Required;

import java.util.Map;

/**
 * Компонент для камела для нативной работы с WMQ  
 */
public class MQComponent extends DefaultComponent{
    MQConfiguration configuration;
   
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        return new MQEndpoint(getCamelContext(),configuration,remaining);
    }

    @Required
    public void setConfiguration(MQConfiguration configuration) {
        this.configuration = configuration;
    }
}
