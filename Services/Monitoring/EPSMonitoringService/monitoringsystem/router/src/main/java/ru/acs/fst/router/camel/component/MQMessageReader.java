package ru.acs.fst.router.camel.component;

import com.ibm.mq.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import ru.acs.fst.router.RouterException;
import ru.acs.fst.router.Sender;
import ru.acs.fst.router.camel.component.MQConfiguration;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 09.06.2010
 * Time: 18:32:05
 * To change this template use File | Settings | File Templates.
 */
public class MQMessageReader implements InitializingBean {
    final static Logger log = LoggerFactory.getLogger(MQMessageReader.class);
    MQConfiguration configuration;

    MQQueueManager mqManager;
    Sender sender;

    public MQMessageReader(MQConfiguration configuration) {
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
        int openOptions = MQC.MQOO_INPUT_SHARED | MQC.MQOO_FAIL_IF_QUIESCING;
        MQQueue myQueue = null;
        try {

            myQueue = mqManager.accessQueue(queueName, openOptions);
        } catch (MQException e) {
            throw new RouterException(e);
        }
        MQMessage message = new MQMessage();
        MQGetMessageOptions gmo = new MQGetMessageOptions();
        gmo.options = MQC.MQGMO_COMPLETE_MSG | MQC.MQGMO_WAIT | MQC.MQGMO_SYNCPOINT;
        //| MQC.MQGMO_NO_SYNCPOINT;
        gmo.waitInterval = 2000;
        try {
            myQueue.get(message, gmo);
            byte[] body = new byte[message.getMessageLength()];
            message.readFully(body);
            return body;
        } catch (MQException e) {
            if (e.reasonCode != 2033) {
                throw new RouterException(e);
            }
        } catch (IOException e) {
            throw new RouterException(e);
        }
        finally {
            try {
                myQueue.close();
            } catch (MQException e) {
                log.warn("Ошибка закрытия соединения с очередью", e);
            }
        }

        return null;
    }

    public void sendMessage(String queueManagerName, String queueName, byte[] message) {
        // Framing message to send
        MQMessage msg = new MQMessage();
        msg.messageFlags = MQC.MQMF_SEGMENTATION_ALLOWED;
        try {
            msg.write(message);
        } catch (IOException e) {
            throw new RouterException(e);


        }

        MQPutMessageOptions mqpo = new MQPutMessageOptions(); //Blank options
        mqpo.options = MQC.MQPMO_LOGICAL_ORDER | MQC.MQPMO_SET_IDENTITY_CONTEXT | MQC.MQPMO_SYNCPOINT;

        int openOptions = MQC.MQOO_OUTPUT | MQC.MQOO_SET_IDENTITY_CONTEXT;
        ;// MQC.MQOO_INPUT_AS_Q_DEF|        
        try {
            log.info("Отправляем сообщение в " + queueName + "@" + queueManagerName);
            MQQueue defaultQ = new MQQueue(mqManager, queueName, openOptions, queueManagerName, null, null);
            //MQQueue defaultQ = new MQQueue ( mqManager, queueName, openOptions);

            defaultQ.put(msg); //Put the message in queue
            defaultQ.close();
        } catch (MQException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
             throw new RouterException(e);
        }
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
        //  log.debug("NOOP. Работаем вне транзакции");
//TODO не работает так, ошибка 2012 - MQ  не настроен для работы с транзакциями
        log.debug("MQ Begin");
        try {
            mqManager.begin();
        } catch (MQException e) {
            // throw new RouterException("Ошибка старта транзакции",e);
        }
    }

    public void commit() {
        //     log.debug("NOOP. Работаем вне транзакции");
        log.debug("MQ Commit");
        try {
            mqManager.commit();
        } catch (MQException e) {
            throw new RouterException("Ошибка коммита транзакции", e);
        }
    }

    public void rollback() throws MQException {
        //  log.debug("NOOP. Работаем вне транзакции");
        log.debug("MQ rollback");
        mqManager.backout();
    }

}
