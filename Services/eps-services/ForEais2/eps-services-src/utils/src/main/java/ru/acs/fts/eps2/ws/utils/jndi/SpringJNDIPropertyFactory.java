package ru.acs.fts.eps2.ws.utils.jndi;

import javax.naming.RefAddr;
import javax.naming.Reference;

/**
 * User: KGN
 * Date: 21.06.12
 * Time: 18:25
 */
public class SpringJNDIPropertyFactory {
    private String getStringAddress(Reference ref, String addrType){
        String value = null;
        RefAddr ra = ref.get(addrType);
        if (ra != null){
            value = ra.getContent().toString();
        }
        return value;
    }

    public String getStringPropertyValue(Reference ref){
        return getStringAddress(ref, JNDIProperty.ADDR_TYPE);
    }
    
    private Boolean getBooleanAddress(Reference ref, String addrType){
        Boolean value = null;
        RefAddr ra = ref.get(addrType);
        if(ra != null){
            value = Boolean.getBoolean(ra.getContent().toString());
        }
        return value;
    }

    public Boolean getBooleanPropertyValue(Reference ref){
        return getBooleanAddress(ref, JNDIProperty.ADDR_TYPE);
    }
}
