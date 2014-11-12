package ru.acs.fst.router.camel.component;

import org.apache.camel.spi.PollingConsumerPollStrategy;
import org.apache.camel.Consumer;
import org.apache.camel.Endpoint;

/**
 * Управление транзакциями при обработке
 */
public class MQPollingConsumerPollStrategy implements PollingConsumerPollStrategy {
    public void begin(Consumer consumer, Endpoint endpoint) {
        ((MQEndpoint)endpoint).getReader().begin();
    }

    public void commit(Consumer consumer, Endpoint endpoint) {
        ((MQEndpoint)endpoint).getReader().commit();
    }

    public boolean rollback(Consumer consumer, Endpoint endpoint, int retryCounter, Exception cause) throws Exception {
        ((MQEndpoint)endpoint).getReader().rollback();
        return true;
    }
}
