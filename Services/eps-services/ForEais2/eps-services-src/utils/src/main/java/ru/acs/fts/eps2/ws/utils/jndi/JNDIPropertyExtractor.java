package ru.acs.fts.eps2.ws.utils.jndi;

import javax.naming.Reference;

/**
 * User: KGN
 * Date: 08.11.12
 * Time: 11:13
 */
public class JNDIPropertyExtractor {
    public String getStringPropertyValue(JNDIProperty property) {
        return property.getValue();
    }
    
    public String getStringPropertyValue(Reference ref)
    {
    	return ( new JNDIProperty( ref ) ).getValue( );
    }

    public Boolean getBooleanPropertyValue(JNDIProperty property) {
        return Boolean.parseBoolean(property.getValue());
    }
}
