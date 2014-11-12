/**
 * Парсер описания проверки содержимого БД
 * 
 * @author bad
 */
package ru.acs.monitoring.namespace;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

import ru.acs.monitoring.services.DBContentCheckSettings;

public class DBContentCheckBeanDefinitionParser extends AttributeBaseBeanDefinitionParser {

	private static String ATTRIBUTE_SQL = "sql";

	@Override
	protected boolean shouldGenerateId() {
		return true;
	}

	@Override	
	protected void doParse(Element element, ParserContext parserContext,
			BeanDefinitionBuilder builder) {		
		utils.addStringProperty(element, ATTRIBUTE_SQL, builder, "checkingSql");		
		super.doParse(element, builder);
	}

	@Override
	protected Class<?> getBeanClass(Element element) {
		return DBContentCheckSettings.class;
	}

}
