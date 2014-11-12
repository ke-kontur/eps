/**
 * Хандлер специализированного нэймспэйса
 * 
 * @author bad
 */
package ru.acs.monitoring.namespace;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MonitoringNamespaceHandler extends NamespaceHandlerSupport {

	private static String ELEMENT_MONITORING = "monitoring";
	private static String ELEMENT_SERVICES = "services";
	private static String ELEMENT_SYSTEM = "system";
	private static String ELEMENT_DISK = "hardDrive";
	private static String ELEMENT_SIGNATURE = "signature";
	private static String ELEMENT_QUEUE_MANAGER = "queueManager";
	private static String ELEMENT_HOST = "host";
	private static String ELEMENT_EVENT_LOG_CHECK = "eventLogCheck";
	private static String ELEMENT_DB = "database";
	private static String ELEMENT_MESSAGE_PROCESSING = "messageProcessing";
	private static String ELEMENT_REMOTE_SERVICES = "remoteServices";
    private static String ELEMENT_MAILBOX = "mailbox";

	@Override
	public void init() {
		registerBeanDefinitionParser(ELEMENT_MONITORING,
				new MonitoringBeanDefinitionParser());
		registerBeanDefinitionParser(ELEMENT_SERVICES,
				new ServicesBeanDefinitionParser());
		registerBeanDefinitionParser(ELEMENT_DISK,
				new DiskBeanDefinitionParser());
		registerBeanDefinitionParser(ELEMENT_SYSTEM,
				new SystemBeanDefinitionParser());
		registerBeanDefinitionParser(ELEMENT_SIGNATURE,
				new SignatureBeanDefinitionParser());
		registerBeanDefinitionParser(ELEMENT_QUEUE_MANAGER,
				new QueueManagerBeanDefinitionParser());
		registerBeanDefinitionParser(ELEMENT_HOST,
				new HostBeanDefinitionParser());
		registerBeanDefinitionParser(ELEMENT_EVENT_LOG_CHECK,
				new EventLogCheckBeanDefinitionParser());
		registerBeanDefinitionParser(ELEMENT_DB,
				new DBBeanDefinitionParser());
		registerBeanDefinitionParser(ELEMENT_MESSAGE_PROCESSING,
				new MessageProcessingBeanDefinitionParser());
		registerBeanDefinitionParser(ELEMENT_REMOTE_SERVICES,
				new RemoteServicesBeanDefinitionParser());
        registerBeanDefinitionParser(ELEMENT_MAILBOX,
                new MailBoxBeanDefinitionParser());
	}

}
