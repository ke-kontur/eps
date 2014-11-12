/**
 * Парсер описания локальных сервисов
 * 
 * @author bad
 */
package ru.acs.monitoring.namespace;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.ManagedList;
import org.w3c.dom.Element;

import ru.acs.monitoring.settings.LocalServicesSettings;

public class ServicesBeanDefinitionParser extends
		AttributeBaseBeanDefinitionParser {

	private static String ATTRIBUTE_SERVICE_NAME = "serviceName";

	@Override
	protected boolean shouldGenerateId() {
		return true;
	}

	@Override
	@SuppressWarnings(value = "unchecked")
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		ManagedList services = new ManagedList();
		for (Element child : utils.getChildElements(element,
				ATTRIBUTE_SERVICE_NAME))
			services.add(child.getTextContent());

		builder.addPropertyValue("processNames", services);

		super.doParse(element, builder);
	}

	@Override
	protected Class<?> getBeanClass(Element element) {
		return LocalServicesSettings.class;
	}

}
