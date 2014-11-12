package ru.acs.fts.eps2.util.jndi;

import javax.naming.NamingException;
import javax.naming.Reference;
import javax.naming.Referenceable;
import javax.naming.StringRefAddr;

/**
 * User: KGN
 * Date: 20.06.12
 * Time: 16:37
 */
public class JNDIProperty implements Referenceable { // NO_UCD (use default)
    String value; // NO_UCD (use private)
    
    public JNDIProperty(){
    }
    
    public JNDIProperty(String value){ // NO_UCD (use default)
        this.value = value;
    }

    public static final String ADDR_TYPE = "property"; // NO_UCD (use default)
    @Override
    public Reference getReference() throws NamingException {
        return new Reference(this.getClass().getName(),
                new StringRefAddr(ADDR_TYPE, value),
                JNDIPropertyFactory.class.getName(), null);
    }
    
    public String getValue(){
        return value;
    }
}
