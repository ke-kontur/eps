/**
 * Парсер описания сервера ЭЦП
 * 
 * @author bad
 */
package ru.acs.monitoring.namespace;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.ManagedList;
import org.w3c.dom.Element;

import ru.acs.monitoring.services.SignatureSettings;

public class SignatureBeanDefinitionParser extends
		AttributeBaseBeanDefinitionParser {

	private static String ATTRIBUTE_SERVER_NAME = "serverName";
	private static String ATTRIBUTE_PORT = "port";
	private static String ATTRIBUTE_SERVICE_NAME = "serviceName";
	private static String ATTRIBUTE_CERT_NAME = "certificateName";

	@Override
	protected boolean shouldGenerateId() {
		return true;
	}

	@Override
	@SuppressWarnings(value="unchecked")
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		ManagedList certificates = new ManagedList();
		
		for (Element child : utils.getChildElements(element,
				ATTRIBUTE_CERT_NAME)) 			
			certificates.add(child.getTextContent());		
		builder.addPropertyValue("certificates", certificates);
		
		utils.addStringProperty(element, ATTRIBUTE_SERVER_NAME, builder, "serverName");		
		utils.addStringProperty(element, ATTRIBUTE_SERVICE_NAME, builder, "serviceName");
		utils.addIntegerProperty(element, ATTRIBUTE_PORT, builder, "port");
		
		super.doParse(element, builder);
	}

	@Override
	protected Class<?> getBeanClass(Element element) {
		return SignatureSettings.class;
	}

}
