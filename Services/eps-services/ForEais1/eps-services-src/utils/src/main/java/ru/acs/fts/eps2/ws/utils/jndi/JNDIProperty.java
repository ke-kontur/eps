package ru.acs.fts.eps2.ws.utils.jndi;

import javax.naming.NamingException;
import javax.naming.RefAddr;
import javax.naming.Reference;
import javax.naming.Referenceable;
import javax.naming.StringRefAddr;

/**
 * User: KGN
 * Date: 20.06.12
 * Time: 16:37
 */
public class JNDIProperty implements Referenceable {
    String value;
    
    public JNDIProperty(){
    }
    
    public JNDIProperty(Reference ref )
    {
        RefAddr ra = ref.get(ADDR_TYPE);
        if (ra != null){
            value = ra.getContent().toString();
        }
    }
    
    public JNDIProperty(String value){
        this.value = value;
    }

    public static final String ADDR_TYPE = "property";
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
