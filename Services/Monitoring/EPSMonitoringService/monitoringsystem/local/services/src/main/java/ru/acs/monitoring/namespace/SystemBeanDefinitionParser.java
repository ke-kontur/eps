/**
 * Парсер описания мониторинга системных ресурсов
 * 
 * @author bad
 */
package ru.acs.monitoring.namespace;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.w3c.dom.Element;

import ru.acs.monitoring.services.SystemSettings;

public class SystemBeanDefinitionParser extends
		AttributeBaseBeanDefinitionParser {

	private static String ATTRIBUTE_DISABLED = "disabled";
	private static String ATTRIBUTE_DISK_DISABLED = "hardDrivesMonitoringDisabled";
	private static String ATTRIBUTE_MEMORY_DISABLED = "memoryMonitoringDisabled";

	@Override
	protected boolean shouldGenerateId() {
		return true;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		utils.addBooleanProperty(element, ATTRIBUTE_DISABLED, builder,
				"disabled");
		utils.addBooleanProperty(element, ATTRIBUTE_DISK_DISABLED, builder,
				"diskMonitoringDisabled");
		utils.addBooleanProperty(element, ATTRIBUTE_MEMORY_DISABLED, builder,
				"memoryMonitoringDisabled");

		super.doParse(element, builder);
	}

	@Override
	protected Class<?> getBeanClass(Element element) {
		return SystemSettings.class;
	}

}
