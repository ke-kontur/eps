package ru.acs.fts.eps2.util.jndi;

/**
 * User: KGN
 * Date: 08.11.12
 * Time: 11:13
 */
public class JNDIPropertyExtractor {
    public String getStringPropertyValue(JNDIProperty property) {
        return property.getValue();
    }

    public Boolean getBooleanPropertyValue(JNDIProperty property) {
        return Boolean.parseBoolean(property.getValue());
    }
}
