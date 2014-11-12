package ru.acs.fst.router.jms;

import com.ibm.mq.*;
import com.ibm.mq.jms.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import ru.acs.fst.router.RouterException;
import ru.acs.fst.router.Sender;
import ru.acs.fst.router.camel.component.MQConfiguration;
import ru.acs.fst.router.camel.component.LocalContext;


import javax.jms.*;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * Не готов. Только для тестов!!!
  */
public class MQTransactedMessageReader implements InitializingBean {
    final static Logger log = LoggerFactory.getLogger(MQTransactedMessageReader.class);
    MQConfiguration configuration;
    MQQueueManager mqManager;
    Sender sender;
    public static final String KEY_SESSION ="SESSION";
    public MQTransactedMessageReader(MQConfiguration configuration) {
        setConfiguration(configuration);
        try {
            afterPropertiesSet();
        } catch (Exception e) {
            throw new RuntimeException("Ошибка инициализации", e);
        }
    }

    public byte[] readMessage() {
        return readMessage(configuration.getQueueName());
    }

    public byte[] readMessage(String queueName) {
        MQQueueConnection mqQueueConnection;
        MQQueueSession session;

        try {
            mqQueueConnection = (MQQueueConnection) ((MQQueueConnectionFactory) configuration.getFactory()).createQueueConnection();
            session = ((MQQueueSession) mqQueueConnection.createSession(true, Session.AUTO_ACKNOWLEDGE));
            LocalContext.getContext().setAttribute(KEY_SESSION,session);
            //Field privateStringField = MQSession.class.getDeclaredField("qm");
            //privateStringField.setAccessible(true);
            //mqManager = (MQQueueManager) privateStringField.get(session);
        } catch (JMSException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            throw new RouterException(e);
        }

        try {
            MessageConsumer consumer = session.createConsumer((new com.ibm.mq.jms.MQQueue("TEST")));
            Field privateStringField = MQMessageConsumer.class.getDeclaredField("gmo");
            privateStringField.setAccessible(true);
            MQGetMessageOptions gmo = (MQGetMessageOptions) privateStringField.get(consumer);
            
            gmo.options |= MQC.MQGMO_COMPLETE_MSG;

            mqQueueConnection.start();
            Message message = consumer.receive();
         //   log.info(message.toString());
             byte[] mm=null;
            if (message instanceof BytesMessage){
                mm = new byte[(int) ((BytesMessage)message).getBodyLength()];
                ((BytesMessage)message).readBytes(mm);
            }
            if (message instanceof  TextMessage){
                mm= ((TextMessage)message).getText().getBytes();
            }

            //session.commit();
            return mm;
        } catch (JMSException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoSuchFieldException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return null;
    }

    public void processMessage() throws MQException, IOException {
        byte[] message = readMessage();
        if (message != null) { // нет сообщений
            sender.send(message);
        }
    }

    public void afterPropertiesSet() throws Exception {
        MQEnvironment.hostname = configuration.getHostName();
        MQEnvironment.channel = configuration.getChannel();
        MQEnvironment.port = configuration.getPort();
        MQEnvironment.properties.put(MQC.TRANSPORT_PROPERTY, MQC.TRANSPORT_MQSERIES);
        mqManager = new MQQueueManager(configuration.getQueueManager());
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    @Override
    protected void finalize() throws Throwable {
        mqManager.close();
        super.finalize();
    }

    @Required
    public void setConfiguration(MQConfiguration configuration) {
        this.configuration = configuration;
    }

    public void begin() {
        log.debug("NOOP. Работаем вне транзакции");
//TODO не работает так, ошибка 2012 - MQ  не настроен для работы с транзакциями
//        try {
//            mqManager.begin();
//        } catch (MQException e) {
//            throw new RouterException("Ошибка старта транзакции",e);
//        }
    }

    public void commit() {
  log.info("commit");
        try {
            ((Session)LocalContext.getContext().getAttribute(KEY_SESSION)).commit();
        } catch (JMSException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
//        log.debug("NOOP. Работаем вне транзакции");
//        try {
//            mqManager.commit();
//        } catch (MQException e) {
//            throw new RouterException("Ошибка коммита транзакции",e);
//        }
    }

    public void rollback() throws MQException {
          log.info("rollback");
        try {
            ((Session)LocalContext.getContext().getAttribute(KEY_SESSION)).rollback();
        } catch (JMSException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
 //       log.debug("NOOP. Работаем вне транзакции");
//        mqManager.backout();
    }

}