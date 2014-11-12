/**
 * Парсер корневого элемента
 * 
 * @author bad
 */
package ru.acs.monitoring.namespace;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class MonitoringBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
	
	@Override
	protected boolean shouldGenerateId() {
		return true;
	}

	@Override
	protected void doParse(Element element, ParserContext parserContext,
			BeanDefinitionBuilder builder) {
		
		NodeList nodeList = element.getChildNodes();
		for (int i = 0; i < nodeList.getLength(); i++) {
			if (!(nodeList.item(i) instanceof Element))
				continue;
			Element child = (Element) nodeList.item(i);
			parserContext.getDelegate().parseCustomElement(child);
		}
		
	}

	@Override
	protected Class<?> getBeanClass(Element element) {
		return String.class;
	}

}
