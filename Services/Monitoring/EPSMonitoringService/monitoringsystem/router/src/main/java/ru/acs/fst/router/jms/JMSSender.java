package ru.acs.fst.router.jms;

import com.ibm.mq.jms.MQQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.*;

import ru.acs.fst.router.Sender;


/**
 * Класс для отправки сообщений по JMS
 *
 * @author fmv
 */
public class JMSSender implements Sender {

    final static Logger log = LoggerFactory.getLogger(JMSSender.class);

    /**
     * шаблон для отправки
     */
    private JmsTemplate jmsTemplate;

    private int charSet = 0;

    /**
     * Отправить сообщение адресату указанному в jmsTemplate
     *
     * @param mess - сообщение
     */
    public void send(final byte[] mess) {
        log.info("Отправка сообщения по JMS на адрес '" + getJmsTemplate().getDefaultDestination() + '\'');
        jmsTemplate.send(getMessageCreator(mess));

    }

    private MessageCreator getMessageCreator(final byte[] mess) {
        return new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                BytesMessage byteMess = session.createBytesMessage();
                byteMess.writeBytes(mess);
                return byteMess;
            }
        };
    }

    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    @Required
    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendToQueue(String receiveQueue, String receiveQueueManager, byte[] message) {
        sendToQueue(receiveQueue, receiveQueueManager, 4, message);
    }

    public void sendToQueue(String receiveQueue, String receiveQueueManager, int priority, byte[] message) {
        Destination dest = null;
        try {
            dest = new MQQueue(receiveQueueManager, receiveQueue);
            ((MQQueue) dest).setTargetClient(1);
            ((MQQueue) dest).setPriority(priority);
            if (charSet != 0) {
                ((MQQueue) dest).setCCSID(charSet);
            }
        } catch (JMSException e) {
            throw new RuntimeException("JMS Exception: " + e.getMessage(), e);
        }
        log.info("Отправка сообщения по JMS на адрес '" + dest + '\'');
        jmsTemplate.send(dest, getMessageCreator(message));

    }

    public int getCharSet() {
        return charSet;
    }

    public void setCharSet(int charSet) {
        this.charSet = charSet;
    }
}
