package ru.acs.monitoring.jms;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.jms.core.JmsTemplate;

import ru.acs.fts.dto.BaseDocType;
import ru.acs.monitoring.common.Sender;

/**
 * Класс для отправки сообщений по JMS
 * @author fmv
 *
 */
public class JMSSender implements Sender {
	final static Logger log = LoggerFactory.getLogger(JMSSender.class);

	/**
	 * шаблон для отправки
	 */	
	private JmsTemplate jmsTemplate;

	/**
	 * Отправить сообщение адресату указанному в jmsTemplate
	 * @param mess - сообщение
	 */
	public void send(final byte[] mess) {
		log.info("Отправка сообщения по JMS на адрес '"+getJmsTemplate().getDefaultDestination()+'\'');
		jmsTemplate.send(new  org.springframework.jms.core.MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				BytesMessage byteMess = session.createBytesMessage();
				byteMess.writeBytes(mess);
				return byteMess;
			}
		});

	}

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}
	
	@Required
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void send(BaseDocType doc) {
		throw new UnsupportedOperationException();		
	}
}
