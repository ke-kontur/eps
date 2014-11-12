/**
 * Парсер описания БД
 * 
 * @author bad
 */
package ru.acs.monitoring.namespace;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

import ru.acs.monitoring.services.DBSettings;
import ru.acs.monitoring.services.DBSettings.TableSpaceSettings;

public class DBBeanDefinitionParser extends AttributeBaseBeanDefinitionParser {

	private static Map<String, String> jdbcURLPrefixes;
	private static Map<String, String> jdbcDriverClasses;
	
	static {
		jdbcURLPrefixes = new HashMap<String, String>();
		jdbcURLPrefixes.put("oracle", "jdbc:oracle:thin:@");
		jdbcDriverClasses = new HashMap<String, String>();
		jdbcDriverClasses.put("oracle", "oracle.jdbc.OracleDriver");
	}
	
	private BeanDefinitionCreatingUtils utils = new BeanDefinitionCreatingUtils();

	private static String ELEMENT_DATASOURCE = "dataSource";
	private static String ELEMENT_TABLESPACE = "tableSpace";
	private static String ELEMENT_CONTENT_CHECK = "contentCheck";

	private static String ATTRIBUTE_DATASOURCE_TYPE = "type";
	private static String ATTRIBUTE_DATASOURCE_ADDRESS = "address";
	private static String ATTRIBUTE_DATASOURCE_PORT = "port";
	private static String ATTRIBUTE_DATASOURCE_DBNAME = "dbname";
	private static String ATTRIBUTE_DATASOURCE_USERNAME = "username";
	private static String ATTRIBUTE_DATASOURCE_PASSWORD = "password";
	
	private static String ATTRIBUTE_TABLESPACE_NAME = "name";
	private static String ATTRIBUTE_TABLESPACE_WARNING = "warningLevel";
	private static String ATTRIBUTE_TABLESPACE_ERROR = "errorLevel";

	@Override
	protected boolean shouldGenerateId() {
		return true;
	}

	@Override
	@SuppressWarnings(value = "unchecked")
	protected void doParse(Element element, ParserContext parserContext,
			BeanDefinitionBuilder builder) {
		Element dataSourceElement = utils.getChildElements(element,
				ELEMENT_DATASOURCE).get(0);
		BeanDefinition dataSource = parseDataSource(dataSourceElement);
		builder.addPropertyValue("dataSource", dataSource);

		ManagedList tableSpaces = new ManagedList();		
		for (Element child : utils
				.getChildElements(element, ELEMENT_TABLESPACE)) {
			tableSpaces.add(parseTableSpace(child));
		}			
		if (tableSpaces.size() > 0)
			builder.addPropertyValue("monitoredTableSpaces", tableSpaces);

		ManagedList contentChecks = new ManagedList();
		for (Element child : utils.getChildElements(element,
				ELEMENT_CONTENT_CHECK)) {
			BeanDefinition beanDefinition = new DBContentCheckBeanDefinitionParser()
					.parse(child, parserContext);
			contentChecks.add(beanDefinition);
		}
		builder.addPropertyValue("dbContentChecks", contentChecks);

		super.doParse(element, builder);
	}

	protected BeanDefinition parseDataSource(Element element) {
		BeanDefinitionBuilder builder = BeanDefinitionBuilder
				.rootBeanDefinition(BasicDataSource.class);
		String type = element.getAttribute(ATTRIBUTE_DATASOURCE_TYPE);
		builder.addPropertyValue("driverClassName", jdbcDriverClasses.get(type));
		
		//Формируем JDBC URL
		String address = element.getAttribute(ATTRIBUTE_DATASOURCE_ADDRESS);
		String port = element.getAttribute(ATTRIBUTE_DATASOURCE_PORT);
		String dbname = element.getAttribute(ATTRIBUTE_DATASOURCE_DBNAME);		
		String jdbcPrefix = jdbcURLPrefixes.get(type);				
		builder.addPropertyValue("url", String.format("%s//%s:%s/%s", jdbcPrefix, address, port, dbname));
		
		utils.addStringProperty(element, ATTRIBUTE_DATASOURCE_USERNAME,
				builder, "username");
		utils.addStringProperty(element, ATTRIBUTE_DATASOURCE_PASSWORD,
				builder, "password");
		builder.setDestroyMethodName("close");
		return builder.getBeanDefinition();
	}
	
	protected BeanDefinition parseTableSpace(Element element) {
		BeanDefinitionBuilder builder = BeanDefinitionBuilder
				.rootBeanDefinition(TableSpaceSettings.class);		
		utils.addStringProperty(element, ATTRIBUTE_TABLESPACE_NAME,
				builder, "name");
		utils.addIntegerProperty(element, ATTRIBUTE_TABLESPACE_WARNING,
				builder, "warningLevel");
		utils.addIntegerProperty(element, ATTRIBUTE_TABLESPACE_ERROR,
				builder, "errorLevel");		
		return builder.getBeanDefinition();
	}

	@Override
	protected Class<?> getBeanClass(Element element) {
		return DBSettings.class;
	}

}
