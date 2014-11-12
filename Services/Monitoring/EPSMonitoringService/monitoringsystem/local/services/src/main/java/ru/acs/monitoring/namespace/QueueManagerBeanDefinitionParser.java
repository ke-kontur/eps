/**
 * Парсер описания менеджера очередей
 * 
 * @author bad
 */
package ru.acs.monitoring.namespace;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

import ru.acs.fts.mqmonitoring.QManagerMonitorConfig;
import ru.acs.fts.mqmonitoring.QueueMonitorConfig;

public class QueueManagerBeanDefinitionParser extends
AbstractSingleBeanDefinitionParser {
	
	private BeanDefinitionCreatingUtils utils = new BeanDefinitionCreatingUtils();

	private static String ELEMENT_QUEUE = "queue";
	private static String ATTRIBUTE_NAME = "name";
	private static String ATTRIBUTE_PORT = "port";
	private static String ATTRIBUTE_HOST = "host";
	private static String ATTRIBUTE_CHANNEL = "channel";
	private static String ATTRIBUTE_LOCAL_MANAGER = "localManager";
	private static String ATTRIBUTE_QUEUE_NAME = "name";
	private static String ATTRIBUTE_QUEUE_MAX_DEPTH = "maxDepth";
	private static String ATTRIBUTE_QUEUE_MAX_INTERVAL = "maxInterval";

	@Override
	protected boolean shouldGenerateId() {
		return true;
	}

	@Override
	@SuppressWarnings(value="unchecked")
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		ManagedList queues = new ManagedList();		
		for (Element child: utils.getChildElements(element, ELEMENT_QUEUE)) {			
			BeanDefinitionBuilder queueBuilder = BeanDefinitionBuilder.rootBeanDefinition(QueueMonitorConfig.class);
			parseQueue(child, queueBuilder);
			queues.add(queueBuilder.getBeanDefinition());
		}
		builder.addPropertyValue("queueMonitorConfigs", queues);		
		utils.addStringProperty(element, ATTRIBUTE_NAME, builder, "QManagerName");
		utils.addStringProperty(element, ATTRIBUTE_HOST, builder, "host");
		utils.addStringProperty(element, ATTRIBUTE_CHANNEL, builder, "channel");
		utils.addIntegerProperty(element, ATTRIBUTE_PORT, builder, "port");
		utils.addBooleanProperty(element, ATTRIBUTE_LOCAL_MANAGER, builder, "localManager");	
		
		super.doParse(element, builder);
	}
	
	private void parseQueue(Element element, BeanDefinitionBuilder builder) {
		utils.addStringProperty(element, ATTRIBUTE_QUEUE_NAME, builder, "queueName");
		utils.addIntegerProperty(element, ATTRIBUTE_QUEUE_MAX_DEPTH, builder, "maxDepth");
		utils.addIntegerProperty(element, ATTRIBUTE_QUEUE_MAX_INTERVAL, builder, "maxInterval");
	}	
	
	@Override
	protected Class<?> getBeanClass(Element element) {
		return QManagerMonitorConfig.class;
	}

}
