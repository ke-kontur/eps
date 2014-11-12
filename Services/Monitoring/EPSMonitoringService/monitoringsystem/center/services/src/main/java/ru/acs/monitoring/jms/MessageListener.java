package ru.acs.monitoring.jms;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.Message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.monitoring.BusinessObject;
import ru.acs.monitoring.MonitoringRuntimeException;
import ru.acs.monitoring.bo.MIProcessingStrategy;

/**
 * Листенер сообщений для Центра
 * @author fmv
 *
 */
public class MessageListener implements javax.jms.MessageListener {
	final static Logger log = LoggerFactory.getLogger(MessageListener.class);
	
	protected MIProcessingStrategy processingStrategy;
	
	public void onMessage(Message message) {
		log.info("Получено сообщение: " + message);
		if (message instanceof BytesMessage) {
			try {
				byte[] byteMess = new byte[(int) ((BytesMessage) message).getBodyLength()];
				((BytesMessage) message).readBytes(byteMess);
				processMessage(byteMess);
			} catch (JMSException ex) {
				throw new RuntimeException(ex);
			}
		} else {
			throw new IllegalArgumentException("Message must be of type BytesMessage");
		}

	}

	private void processMessage(byte[] byteMess) {
		MessageCreator mc = new MessageCreator();
		BusinessObject bo = mc.createBusinessObject(byteMess);
		log.info("Обрабатывается сообщение с EnvelopeID= " + bo.getContext().getRoutingInf().getEnvelopeID() + ", MessageKind= "
				+ bo.getContext().getApplicationInf().getMessageKind());
		runDoc(bo);
	}

	private void runDoc(BusinessObject bo) {
		log.info("Обрабатывается документ с DocumentID= " + bo.getContext().getDoc().getDocumentID() + ", DocumentType= "
				+ bo.getContext().getDoc().getClass().getName());

		if (bo.getContext().getDoc() instanceof MonitoringInfo) {
			processingStrategy.run(bo);			
		} else {
			throw new MonitoringRuntimeException("Message not registered for this system!");
		}
		return;

	}

	@Autowired
	public void setProcessingStrategy(MIProcessingStrategy processingStrategy) {
		this.processingStrategy = processingStrategy;
	}
}
