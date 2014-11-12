package ru.acs.fst.router.camel.component;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.impl.DefaultEndpoint;
import org.apache.camel.impl.ScheduledPollConsumer;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

/**
 * ����������� ��������� �� WMQ, �� ���� ������� � �������� ���������
 */
public class MQConsumer extends ScheduledPollConsumer {
    MQEndpoint endpoint;

    public MQConsumer(DefaultEndpoint endpoint, Processor processor) {
        super(endpoint, processor);
        this.endpoint = (MQEndpoint) endpoint;
        this.setDelay(50);
        setPollStrategy(new MQPollingConsumerPollStrategy());
    }

    /**
     * ������ �� ������ ��������� � ������� ��� � ���������
     * @throws Exception
     */
    @Transactional(propagation = Propagation.REQUIRED)
    protected void poll() throws Exception {
        byte[] body = endpoint.pollMessage();
        if (body == null) {
            return;
        }
        if (log.isDebugEnabled()){
            log.debug("���� ���������!");
        }

        Exchange exchange = endpoint.createExchange(body);
        getProcessor().process(exchange);
        if (exchange.getException()!=null){
            throw  exchange.getException();
        }
        if (log.isDebugEnabled()){
            log.debug("��������� ����������!");
        }

    }
}
