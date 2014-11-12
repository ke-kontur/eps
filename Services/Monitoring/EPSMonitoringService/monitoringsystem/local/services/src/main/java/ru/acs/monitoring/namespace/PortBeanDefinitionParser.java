/**
 * Парсер описания TCP-порта
 * 
 * @author bad
 */
package ru.acs.monitoring.namespace;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.w3c.dom.Element;

import ru.acs.monitoring.services.HostSettings;

public class PortBeanDefinitionParser extends
AttributeBaseBeanDefinitionParser {
	
	private BeanDefinitionCreatingUtils utils = new BeanDefinitionCreatingUtils();
	private static String ATTRIBUTE_PORT = "port";	
	private static String ATTRIBUTE_TIMEOUT = "timeout";
	
	@Override
	protected boolean shouldGenerateId() {
		return true;
	}

	@Override	
	protected void doParse(Element element, BeanDefinitionBuilder builder) {	
		utils.addIntegerProperty(element, ATTRIBUTE_PORT, builder, "port");
		utils.addIntegerProperty(element, ATTRIBUTE_TIMEOUT, builder, "timeout");	
		super.doParse(element, builder);
	}
	
	@Override
	protected Class<?> getBeanClass(Element element) {
		return HostSettings.ScannedPort.class;
	}

}
