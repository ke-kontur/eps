/**
 * Парсер описания мониторига жесткого диска
 * 
 * @author bad
 */
package ru.acs.monitoring.namespace;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.w3c.dom.Element;

import ru.acs.monitoring.settings.DiskSettings;

public class DiskBeanDefinitionParser extends AttributeBaseBeanDefinitionParser {

	private static String ATTRIBUTE_NAME = "driveName";
	private static String ATTRIBUTE_ERROR_LEVEL = "errorLevelMB";
	private static String ATTRIBUTE_WARNING_LEVEL = "warningLevelMB";

	@Override
	protected boolean shouldGenerateId() {
		return true;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		utils.addStringProperty(element, ATTRIBUTE_NAME, builder, "diskName");
		utils.addIntegerProperty(element, ATTRIBUTE_ERROR_LEVEL, builder,
				"errorLevelMB");
		utils.addIntegerProperty(element, ATTRIBUTE_WARNING_LEVEL, builder,
				"warningLevelMB");
		super.doParse(element, builder);
	}

	@Override
	protected Class<?> getBeanClass(Element element) {
		return DiskSettings.class;
	}

}
