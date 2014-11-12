package ru.acs.fst.router.camel.component;

import org.apache.camel.*;
import org.apache.camel.impl.DefaultEndpoint;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.impl.DefaultMessage;
import ru.acs.fst.router.camel.component.MQMessageReader;

/**
 * Endpoint ��� WMQ ����������
 *
 */
public class MQEndpoint extends DefaultEndpoint {
    MQMessageReader reader;
    String queueName;

    /**
     *
     * @param camelContext - ��������
     * @param configuration - ������
     * @param queueName - ��� ������� �� ������� ����� ����������� ������
     */
    public MQEndpoint(CamelContext camelContext, MQConfiguration configuration,String queueName) {
        super();
        setCamelContext(camelContext);
        this.reader=new MQMessageReader(configuration);
        this.queueName=queueName;        
    }

    public Producer createProducer() throws Exception {
        return new MQProducer(this);
    }

    @Override
    protected String createEndpointUri() {
        return "wmq:"+queueName;
    }

    public Consumer createConsumer(Processor processor) throws Exception {
        return new MQConsumer(this, processor);
    }

    //TODO ���������� �������� ��� ���    
    public boolean isSingleton() {
        return false;
    }

    /**
     * ������� Exchange � ���������� ���������� 
     * @param body - ���� ���������
     * @return Exchange
     */
    public Exchange createExchange(byte[] body) {
        Exchange ex = new DefaultExchange(this);
        DefaultMessage message = new DefaultMessage() ;
        message.setBody(body);
        ex.setIn(message);
        return ex;
    }

    /**
     * ������� ���������
     * @return
     */
    public byte[] pollMessage(){
        return reader.readMessage(queueName);
    }

    public MQMessageReader getReader() {
        return reader;
    }

    public String getQueueName() {
        return queueName;
    }
}
