package ru.acs.fst.router.camel.component.mq.jms;

import javax.jms.*;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 12.08.2010
 * Time: 20:23:46
 * To change this template use File | Settings | File Templates.
 */
public class MQConnection implements Connection{
    public Session createSession(boolean transacted, int acknowledgeMode) throws JMSException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getClientID() throws JMSException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setClientID(String clientID) throws JMSException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public ConnectionMetaData getMetaData() throws JMSException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public ExceptionListener getExceptionListener() throws JMSException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setExceptionListener(ExceptionListener listener) throws JMSException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void start() throws JMSException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void stop() throws JMSException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void close() throws JMSException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public ConnectionConsumer createConnectionConsumer(Destination destination, String messageSelector, ServerSessionPool sessionPool, int maxMessages) throws JMSException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public ConnectionConsumer createDurableConnectionConsumer(Topic topic, String subscriptionName, String messageSelector, ServerSessionPool sessionPool, int maxMessages) throws JMSException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
