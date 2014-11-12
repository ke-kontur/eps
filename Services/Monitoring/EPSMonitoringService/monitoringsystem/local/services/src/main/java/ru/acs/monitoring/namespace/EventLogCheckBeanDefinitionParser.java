/**
 * Парсер описания проверки системного журнала
 * 
 * @author bad
 */
package ru.acs.monitoring.namespace;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

import ru.acs.monitoring.services.EventLogCheckSettings;

public class EventLogCheckBeanDefinitionParser extends AttributeBaseBeanDefinitionParser {

	private BeanDefinitionCreatingUtils utils = new BeanDefinitionCreatingUtils();
	
	private static String ATTRIBUTE_LOG_NAME = "logName";
	private static String ATTRIBUTE_SOURCE_NAME = "sourceName";
	private static String ATTRIBUTE_INTERVAL = "interval";
	private static String ATTRIBUTE_MAX_ERROR = "maxErrorCount";
	

	@Override
	protected boolean shouldGenerateId() {
		return true;
	}

	@Override	
	protected void doParse(Element element, ParserContext parserContext,
			BeanDefinitionBuilder builder) {		
		utils.addStringProperty(element, ATTRIBUTE_LOG_NAME, builder, "logName");
		utils.addStringProperty(element, ATTRIBUTE_SOURCE_NAME, builder, "sourceName");
		utils.addIntegerProperty(element, ATTRIBUTE_INTERVAL, builder, "interval");
		utils.addIntegerProperty(element, ATTRIBUTE_MAX_ERROR, builder, "maxErrorCount");
		super.doParse(element, builder);
	}

	@Override
	protected Class<?> getBeanClass(Element element) {
		return EventLogCheckSettings.class;
	}

}
