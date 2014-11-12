/**
 * Парсер описания проверки обработки сообщения
 * 
 * @author bad
 */
package ru.acs.monitoring.namespace;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

import ru.acs.monitoring.settings.MessageProcessingSettings;

public class MessageProcessingBeanDefinitionParser extends DBBeanDefinitionParser {

	private BeanDefinitionCreatingUtils utils = new BeanDefinitionCreatingUtils();

	private static String ELEMENT_DATASOURCE = "dataSource";	

	private static String ATTRIBUTE_SQL = "sql";
	
	@Override
	protected boolean shouldGenerateId() {
		return true;
	}

	@Override
	protected void doParse(Element element, ParserContext parserContext,
			BeanDefinitionBuilder builder) {
		Element dataSourceElement = utils.getChildElements(element,
				ELEMENT_DATASOURCE).get(0);
		BeanDefinition dataSource = parseDataSource(dataSourceElement);
		builder.addPropertyValue("dataSource", dataSource);

		utils.addStringProperty(element, ATTRIBUTE_SQL, builder, "sql");

		super.doParse(element, builder);
	}

	

	@Override
	protected Class<?> getBeanClass(Element element) {
		return MessageProcessingSettings.class;
	}

}
