package ru.acs.fst.router.camel.component;

import org.apache.camel.Producer;
import org.apache.camel.Exchange;
import org.apache.camel.Endpoint;
import org.apache.camel.impl.DefaultProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.acs.fst.router.jms.MqRemoteSender;

/**
 * Поставщик сообщений в WMQ компонент 
 */
public class MQProducer extends DefaultProducer{
    final static Logger log = LoggerFactory.getLogger(MQProducer.class);
    public MQProducer(Endpoint endpoint) {
        super(endpoint);
    }

    public void process(Exchange exchange) throws Exception {
        //отправка вне транзакции
      log.debug("process");
      ((MQEndpoint)getEndpoint()).getReader().sendMessage("QMGR1", ((MQEndpoint)getEndpoint()).getQueueName(),(byte[]) exchange.getIn().getBody());
      //TODO реализовать
    }
}
