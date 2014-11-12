/**
 * Парсер описания хоста
 * 
 * @author bad
 */
package ru.acs.monitoring.namespace;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

import ru.acs.monitoring.services.HostSettings;

public class HostBeanDefinitionParser extends AttributeBaseBeanDefinitionParser {

	private BeanDefinitionCreatingUtils utils = new BeanDefinitionCreatingUtils();

	private static String ELEMENT_PORT = "port";
	private static String ATTRIBUTE_ADDRESS = "address";
	private static String ATTRIBUTE_TIMEOUT = "timeout";

	@Override
	protected boolean shouldGenerateId() {
		return true;
	}

	@Override
	@SuppressWarnings(value = "unchecked")
	protected void doParse(Element element, ParserContext parserContext,
			BeanDefinitionBuilder builder) {
		ManagedList queues = new ManagedList();
		for (Element child : utils.getChildElements(element, ELEMENT_PORT)) {
			BeanDefinition beanDefinition = new PortBeanDefinitionParser()
					.parse(child, parserContext);
			queues.add(beanDefinition);
		}
		builder.addPropertyValue("scannedPorts", queues);
		utils.addStringProperty(element, ATTRIBUTE_ADDRESS, builder, "address");
		utils
				.addIntegerProperty(element, ATTRIBUTE_TIMEOUT, builder,
						"timeout");
		super.doParse(element, builder);
	}

	@Override
	protected Class<?> getBeanClass(Element element) {
		return HostSettings.class;
	}

}
