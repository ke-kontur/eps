/**
 * Парсер описания удаленнных сервисов
 * 
 * @author bad
 */
package ru.acs.monitoring.namespace;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.w3c.dom.Element;

import ru.acs.monitoring.settings.LocalServicesSettings;
import ru.acs.monitoring.settings.RemoteServicesSettings;

public class RemoteServicesBeanDefinitionParser extends
		ServicesBeanDefinitionParser {

	private static String ATTRIBUTE_HOST = "host";
	private static String ATTRIBUTE_USER = "userName";
	private static String ATTRIBUTE_PASSWORD = "password";

	@Override
	protected boolean shouldGenerateId() {
		return true;
	}

	@Override
	@SuppressWarnings(value = "unchecked")
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		utils.addStringProperty(element, ATTRIBUTE_HOST, builder);
		utils.addStringProperty(element, ATTRIBUTE_USER, builder);
		utils.addStringProperty(element, ATTRIBUTE_PASSWORD, builder);

		super.doParse(element, builder);
	}

	@Override
	protected Class<?> getBeanClass(Element element) {
		return RemoteServicesSettings.class;
	}

}
