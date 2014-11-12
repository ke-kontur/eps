package ru.acs.fst.router.jms;


import com.ibm.mq.*;
import com.ibm.mq.jms.MQQueueConnectionFactory;
import ru.acs.fst.router.Sender;
import ru.acs.fst.router.camel.component.MQConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;


/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 13.11.2009
 * Time: 18:50:45
 * To change this template use File | Settings | File Templates.
 */
public class MqRemoteSender implements Sender, InitializingBean {
    final static Logger log = LoggerFactory.getLogger(MqRemoteSender.class);
    private String hostName;
    private String channel = "SYSTEM.DEF.SVRCONN";
    private int port = 1414;
    private int charSet = 0;
    private String queueManager;
    private String queueName;

    private MQConfiguration configuration = null;

    public void send(byte[] message) {
        sendToQueue(queueName, queueManager, message);
    }

    public void sendToQueue(String receiveQueue, String receiveQueueManager, byte[] message) {
        sendToQueue(queueName, queueManager, 4, message);
    }

    public void sendToQueue(String receiveQueue, String receiveQueueManager, int priority, byte[] message) {
        log.info("Отправка сегментированного сообщения по JMS на адрес '" + receiveQueue + "@" + receiveQueueManager + "' через " + queueManager + ". Приоритет = " + priority);
        MQEnvironment.hostname = hostName;
        MQEnvironment.channel = channel;
        MQEnvironment.port = port;
        MQEnvironment.properties.put(MQC.TRANSPORT_PROPERTY, MQC.TRANSPORT_MQSERIES);
        try {
            MQQueueManager mqManager = new MQQueueManager(queueManager);
            int openOptions = MQC.MQOO_OUTPUT | MQC.MQOO_SET_IDENTITY_CONTEXT;
            ;// MQC.MQOO_INPUT_AS_Q_DEF|

            MQQueue defaultQ = new MQQueue(mqManager, receiveQueue, openOptions, receiveQueueManager, null, null);

            // Framing message to send
            MQMessage msg = new MQMessage();
            msg.messageFlags = MQC.MQMF_SEGMENTATION_ALLOWED;
            msg.priority = priority;
            if (charSet != 0) {
                msg.characterSet = charSet;
            }
            msg.write(message);

            MQPutMessageOptions mqpo = new MQPutMessageOptions(); //Blank options
            mqpo.options = MQC.MQPMO_LOGICAL_ORDER | MQC.MQPMO_SET_IDENTITY_CONTEXT | MQC.MQPMO_SYNCPOINT;

            defaultQ.put(msg); //Put the message in queue

            defaultQ.close();
            mqManager.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getQueueManager() {
        return queueManager;
    }

    public void setQueueManager(String queueManager) {
        this.queueManager = queueManager;
    }

    public int getCharSet() {
        return charSet;
    }

    public void setCharSet(int charSet) {
        this.charSet = charSet;
    }

    public void setMqQueueConnectionFactory(MQQueueConnectionFactory cf) {
        setHostName(cf.getHostName());
        setPort(cf.getPort());
        setQueueManager(cf.getQueueManager());
        setChannel(cf.getChannel());
    }

    public void setConfiguration(MQConfiguration configuration) {
        this.configuration = configuration;
    }

    public void afterPropertiesSet() throws Exception {
        if (configuration != null) {
            hostName = configuration.getHostName();
            channel = configuration.getChannel();
            port = configuration.getPort();
            queueManager = configuration.getQueueManager();
            charSet = configuration.getCharSet();
            if (queueName != null) {
                queueName = configuration.getQueueName();
            }
        }
    }
}
