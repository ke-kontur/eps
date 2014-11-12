/**
 * Класс со вспомогательными функциями
 */
package ru.acs.monitoring.namespace;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class BeanDefinitionCreatingUtils {

	public void addStringProperty(Element element, String attributeName, BeanDefinitionBuilder builder, String propertyName) {
		String value = element.getAttribute(attributeName);		
		if (!StringUtils.isEmpty(value))
			builder.addPropertyValue(propertyName, value);		
	}
	
	public void addIntegerProperty(Element element, String attributeName, BeanDefinitionBuilder builder, String propertyName) {
		String value = element.getAttribute(attributeName);		
		if (!StringUtils.isEmpty(value))
			builder.addPropertyValue(propertyName, Integer.valueOf(value));		
	}
	
	public void addBooleanProperty(Element element, String attributeName, BeanDefinitionBuilder builder, String propertyName) {
		String value = element.getAttribute(attributeName);		
		if (!StringUtils.isEmpty(value))
			builder.addPropertyValue(propertyName, Boolean.valueOf(value));		
	}
	
	public void addStringProperty(Element element, String attributeName, BeanDefinitionBuilder builder) {
		String value = element.getAttribute(attributeName);		
		if (!StringUtils.isEmpty(value))
			builder.addPropertyValue(attributeName, value);		
	}
	
	public void addIntegerProperty(Element element, String attributeName, BeanDefinitionBuilder builder) {
		String value = element.getAttribute(attributeName);		
		if (!StringUtils.isEmpty(value))
			builder.addPropertyValue(attributeName, Integer.valueOf(value));		
	}
	
	public void addBooleanProperty(Element element, String attributeName, BeanDefinitionBuilder builder) {
		String value = element.getAttribute(attributeName);		
		if (!StringUtils.isEmpty(value))
			builder.addPropertyValue(attributeName, Boolean.valueOf(value));		
	}
	
	public List<Element> getChildElements(Element element, String tagName) {
		List<Element> result = new LinkedList<Element>();
		
		NodeList nodeList = element.getChildNodes();
		for (int i = 0; i < nodeList.getLength(); i++) {
			if (!(nodeList.item(i) instanceof Element))
				continue;
			Element child = (Element) nodeList.item(i);
			if (!child.getLocalName().equals(tagName))
				continue;
			result.add(child);
		}
		return result;
	}
}
