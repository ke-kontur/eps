package ru.acs.monitoring.jms;

import java.io.ByteArrayOutputStream;
import java.util.GregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.dto.BaseDocType;
import ru.acs.fts.dto.OXMConverter;
import ru.acs.fts.dto.adapters.DateUtilities;
import ru.acs.fts.dto.soap.ApplicationInf;
import ru.acs.fts.dto.soap.BodyType;
import ru.acs.fts.dto.soap.Envelope;
import ru.acs.fts.dto.soap.HeaderType;
import ru.acs.fts.dto.soap.ObjectFactory;
import ru.acs.fts.dto.soap.RoutingInf;
import ru.acs.monitoring.BusinessObject;
import ru.acs.monitoring.MonitoringRuntimeException;
import ru.acs.monitoring.common.utils.RandomGUID;

/**
 * Класс для создания SOAP сообщений
 * @author fmv
 *
 */
public class MessageCreator {
	final static Logger log = LoggerFactory.getLogger(MessageCreator.class);

	/**
	 * Создание SOAP конверта
	 * 
	 * @param doc
	 * @return
	 */
	public byte[] createMessage(BaseDocType doc, String senderInfo, RoutingInf initialRoutingInf, String messageKind) {
		return createMessage(doc, senderInfo, initialRoutingInf, messageKind, new BusinessObject());
	}
	public byte[] createMessage(BaseDocType doc, String senderInfo, String receiver, String messageKind) {
		return createMessage(doc, senderInfo, receiver, messageKind, new BusinessObject());
	}
	public byte[] createMessage(BaseDocType doc, String senderInfo,String receiver, String messageKind,
			BusinessObject bo) {
		RoutingInf routing = new RoutingInf();
		routing.setSenderInformation(receiver);
		return createMessage(doc, senderInfo, routing, messageKind, bo);
		
	}
	public byte[] createMessage(BaseDocType doc, String senderInfo,RoutingInf initialRoutingInf, String messageKind,
			BusinessObject bo) {
		ObjectFactory of = new ObjectFactory();
		Envelope envelope = of.createEnvelope();
		HeaderType header = of.createHeaderType();
		envelope.setHeader(header);
		RoutingInf routing = createRouting(of, senderInfo,initialRoutingInf);
		header.getAnies().add(routing);
		ApplicationInf appInf = createAppInf(of, messageKind);
		header.getAnies().add(appInf);

		BodyType body = of.createBodyType();
		body.getAnies().add(doc);
		envelope.setBody(body);

		bo.getContext().setRoutingInf(routing);
		bo.getContext().setApplicationInf(appInf);
		bo.getContext().setDoc(doc);

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		OXMConverter om = new OXMConverter();
		om.marshall(envelope, bos);

		log.info("Создано сообщение с EnvelopeID = " + routing.getEnvelopeID());

		return bos.toByteArray();

	}

	/**
	 * Создание RoutingInf информации
	 * 
	 * @param of
	 * @return
	 */
	private RoutingInf createRouting(ObjectFactory of,String senderInfo, RoutingInf initialRoutingInf) {
		RoutingInf rou = of.createRoutingInf();		
		rou.setEnvelopeID(new RandomGUID().toString());
		if (initialRoutingInf.getEnvelopeID()!=null){
			rou.setInitialEnvelopeID(initialRoutingInf.getEnvelopeID());			
		}
		rou.setSenderInformation(senderInfo);
		rou.setPreparationDateTime(DateUtilities.gregorianToXml(GregorianCalendar.getInstance()));
		rou.getReceiverInformations().add(initialRoutingInf.getSenderInformation());
		return rou;
	}

	/**
	 * Создание ApplicationInf
	 * 
	 * @param of
	 * @return
	 */
	private ApplicationInf createAppInf(ObjectFactory of, String messageKind) {
		ApplicationInf appinf = of.createApplicationInf();
		appinf.setMessageKind(messageKind);
		appinf.setSoftVersion("1.0");
		appinf.setSoftKind("MONITORING-SYSTEM");
		return appinf;
	}

	public BusinessObject createBusinessObject(byte[] byteMess) {
		OXMConverter om = new OXMConverter();
		Object obj = om.unmarshall(byteMess);
		if (!(obj instanceof Envelope)) {
			throw new MonitoringRuntimeException("Неверный тип сообщения. Ожидается 'Envelope', получен '"
					+ obj.getClass().getName() + "'");
		}
		Envelope envelope = (Envelope) obj;
		RoutingInf rou = getRoutingInf(envelope);
		if (rou == null) {
			throw new MonitoringRuntimeException("Неверный формат сообщения. Отсутствует заголовок RoutingInf.");
		}
		ApplicationInf appInf = getAppInf(envelope);
		if (appInf == null) {
			throw new MonitoringRuntimeException("Неверный формат сообщения. Отсутствует заголовок ApplicationInf.");
		}
		BusinessObject bo = new BusinessObject();
		bo.getContext().setApplicationInf(appInf);
		bo.getContext().setRoutingInf(rou);
		BaseDocType doc = (BaseDocType) envelope.getBody().getAnies().get(0);
		bo.getContext().setDoc(doc);
		return bo;
	}

	private ApplicationInf getAppInf(Envelope envelope) {
		for (Object header : envelope.getHeader().getAnies()) {
			if (header instanceof ApplicationInf) {
				return (ApplicationInf) header;
			}

		}
		log.warn("Не найден заголовок ApplicationInf");
		return null;

	}

	private RoutingInf getRoutingInf(Envelope envelope) {
		for (Object header : envelope.getHeader().getAnies()) {
			if (header instanceof RoutingInf) {
				return (RoutingInf) header;
			}
		}
		log.warn("Не найден заголовок RoutingInf");
		return null;
	}

}
