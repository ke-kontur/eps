/**
 * Базовый парсер, обрабатывающий атрибуты имени и описания
 * 
 * @author bad
 */
package ru.acs.monitoring.namespace;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

public class AttributeBaseBeanDefinitionParser extends
		AbstractSingleBeanDefinitionParser {
	
	protected BeanDefinitionCreatingUtils utils = new BeanDefinitionCreatingUtils();

	private static String ATTRIBUTE_NAME = "name";
	private static String ATTRIBUTE_DESCRIPTION = "description";	

	@Override
	protected boolean shouldGenerateId() {
		return true;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {		
		utils.addStringProperty(element, ATTRIBUTE_NAME, builder, "name");
		utils.addStringProperty(element, ATTRIBUTE_DESCRIPTION, builder, "description");		
	}
	

}
