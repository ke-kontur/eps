package ru.acs.monitoring.services.collect;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.dto.documents.MonitoringInquiry;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.monitoring.BusinessObject;
import ru.acs.monitoring.common.Sender;
import ru.acs.monitoring.common.utils.RandomGUID;
import ru.acs.monitoring.dao.TimerDAO;
import ru.acs.monitoring.domain.CommonSettings;
import ru.acs.monitoring.domain.Connection;
import ru.acs.monitoring.domain.Timer;
import ru.acs.monitoring.jms.MessageCreator;
/**
 * Запрос информации от агентов через MQ
 * @author fmv
 *
 */
public class MIMessageRequester {
	final static Logger log = LoggerFactory.getLogger(MIMessageRequester.class);
	Sender sender;
	CommonSettings settings;
	TimerDAO timerDao;
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public MonitoringInfo getMonitoringInfo(Connection connection) {
		String receiver = connection.getRoutingAddr();
		if (receiver==null){
			log.error("Запрос информации для "+connection.getName()+" не произведен: не установлен URL веб сервиса!");
			return null;
		}
		//TODO сделать проверку,что запрос уже отправлен, но еще нет ответа
		
		MessageCreator creator = new MessageCreator();
		MonitoringInquiry inquiry = new MonitoringInquiry();
		inquiry.setDocumentID(new RandomGUID().toString());
		inquiry.setUseCache(connection.getUseCache());
		BusinessObject bo =  new BusinessObject();
		byte[] message = creator.createMessage(inquiry, settings.getRoutingSenderInfo(),receiver , settings.getMonitoringInqMessageKind(),bo);
		saveTimerRequest(bo,connection.getId());
		sender.send(message);
		return null;
	}
	
	private void saveTimerRequest(BusinessObject bo,Long connectionId) {
		Timer timer = new Timer();
		timer.setReceiver(bo.getContext().getRoutingInf().getReceiverInformations().get(0));
		timer.setRequestId(bo.getContext().getRoutingInf().getEnvelopeID());
		timer.setStatDate(new Date());
		Calendar cal = GregorianCalendar.getInstance();
		cal.add(Calendar.MINUTE,settings.getRequestWaitTime());
		timer.setEndDate(cal.getTime());
		timer.setConnectionId(connectionId);
		timer.setMessageKind(bo.getContext().getApplicationInf().getMessageKind());
		timerDao.save(timer);
		log.info("Создан таймер с RequestId='"+timer.getRequestId()+"'");
	}

	@Required
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	
	@Autowired
	public void setSettings(CommonSettings settings) {
		this.settings = settings;
	}

	@Autowired
	public void setTimerDao(TimerDAO timerDao) {
		this.timerDao = timerDao;
	}
}
