package ru.acs.monitoring.settings;

import ru.acs.fts.dto.monitoring.Attribute;

/**
 * User: KGN
 * Date: 25.09.12
 * Time: 17:16
 */
public class POP3MonitoringSettings extends Attribute {
    public final static String PROPERTY_MAILBOX_NAME = "mailboxName";
    public final static String PROPERTY_PATH_TO_MAILBOX = "pathToMailbox";
    public final static String PROPERTY_MAX_MESSAGES_COUNT_IN_MAILBOX = "maxMessagesCountInMailbox";
    public final static String PROPERTY_DELAY = "delay";

    private String mailboxName;
    private String pathToMailbox;
    private int maxMessagesCountInMailbox;
    private int delay;
    
    public String getMailboxName() {
        return mailboxName;
    }
    public void setMailboxName(String mailboxName) {
        this.mailboxName = mailboxName;
    }
    
    public String getPathToMailbox() {
        return pathToMailbox;
    }
    public void setPathToMailbox(String pathToMailbox) {
        this.pathToMailbox = pathToMailbox;
    }
    
    public int getMaxMessagesCountInMailbox() {
        return maxMessagesCountInMailbox;
    }
    public void setMaxMessagesCountInMailbox(int maxMessagesCountInMailbox) {
        this.maxMessagesCountInMailbox = maxMessagesCountInMailbox;
    }

    public int getDelay() {
        return delay;
    }
    public void setDelay(int delay) {
        this.delay = delay;
    }
}
