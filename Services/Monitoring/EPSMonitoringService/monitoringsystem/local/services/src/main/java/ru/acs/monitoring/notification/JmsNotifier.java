package ru.acs.monitoring.notification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.monitoring.common.Sender;
import ru.acs.monitoring.domain.CommonSettings;
import ru.acs.monitoring.domain.MonitoringInfoWrapper;
import ru.acs.monitoring.jms.MessageCreator;

/**
 * Уведомитель мониторинга через JMS
 * 
 * @author fmv
 * 
 */
public class JmsNotifier extends AbstractNotifier {
	final static Logger log = LoggerFactory.getLogger(JmsNotifier.class);

	/**
	 * Объект осуществляющий отправку сообщения
	 */
	Sender sender;
	
	CommonSettings settings;

	public JmsNotifier() {
		super();
		setSendSeverity(Severity.WARNING);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ru.acs.monitoring.notification.Notifier#notify(ru.acs.fts.dto.monitoring
	 * .MonitoringInfo)
	 */
	public void notify(MonitoringInfoWrapper infoWrapper) {		
		log.info("Отправка уведомления");
		sender.send(createMessage(infoWrapper.getInfo()));
	}

	/**
	 * Создание SOAP конверта с мониторинг-информацией
	 * 
	 * @param info
	 * @return
	 */
	private byte[] createMessage(MonitoringInfo info) {
		MessageCreator creator = new MessageCreator();
		return creator.createMessage(info, settings.getRoutingSenderInfo(), settings.getRoutingDefaultReceiverInfo(),settings.getMonitoringInfoMessageKind());		
	}

	@Required
	public void setSender(Sender sender) {
		this.sender = sender;
	}

	public String getNotifierName() {
		return "Уведомитель по JMS";
	}

	@Autowired
	public void setSettings(CommonSettings settings) {
		this.settings = settings;
	}

}
