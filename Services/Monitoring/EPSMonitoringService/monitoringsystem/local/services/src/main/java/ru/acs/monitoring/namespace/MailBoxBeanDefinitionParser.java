package ru.acs.monitoring.namespace;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.w3c.dom.Element;
import ru.acs.monitoring.settings.POP3MonitoringSettings;

/**
 * User: KGN
 * Date: 25.09.12
 * Time: 17:09
 */
public class MailBoxBeanDefinitionParser extends
        AttributeBaseBeanDefinitionParser {
    
    private static String ATTRIBUTE_MAILBOX_NAME = "mailboxName";
    private static String ATTRIBUTE_PATH = "path";
    private static String ATTRIBUTE_MAX_MESSAGES_COUNT = "maxMessagesCount";
    private static String ATTRIBUTE_DELAY = "delay";

    @Override
    protected boolean shouldGenerateId() {
        return true;
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        utils.addStringProperty(element, ATTRIBUTE_MAILBOX_NAME, builder,
                POP3MonitoringSettings.PROPERTY_MAILBOX_NAME);
        utils.addStringProperty(element, ATTRIBUTE_PATH, builder,
                POP3MonitoringSettings.PROPERTY_PATH_TO_MAILBOX);
        utils.addIntegerProperty(element, ATTRIBUTE_MAX_MESSAGES_COUNT, builder,
                POP3MonitoringSettings.PROPERTY_MAX_MESSAGES_COUNT_IN_MAILBOX);
        utils.addIntegerProperty(element, ATTRIBUTE_DELAY, builder,
                POP3MonitoringSettings.PROPERTY_DELAY);

        //super.doParse(element, builder);
    }

    @Override
    protected Class<?> getBeanClass(Element element) {
        return POP3MonitoringSettings.class;
    }


}
