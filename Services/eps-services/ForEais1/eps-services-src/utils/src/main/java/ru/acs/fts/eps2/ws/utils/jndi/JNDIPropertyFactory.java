package ru.acs.fts.eps2.ws.utils.jndi;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.RefAddr;
import javax.naming.Reference;
import javax.naming.spi.ObjectFactory;
import java.util.Hashtable;

/**
 * User: KGN
 * Date: 20.06.12
 * Time: 16:45
 */
public class JNDIPropertyFactory implements ObjectFactory {
    @Override
    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?, ?> environment) throws Exception {
        if (obj instanceof Reference) {
            Reference ref = (Reference) obj;
            return new JNDIProperty(getStringAddress(ref, JNDIProperty.ADDR_TYPE));
        }
        return obj;
    }

    private String getStringAddress(Reference ref, String addrType){
        String value = null;
        RefAddr ra = ref.get(addrType);
        if (ra != null){
            value = ra.getContent().toString();
        }
        return value;
    }
}
