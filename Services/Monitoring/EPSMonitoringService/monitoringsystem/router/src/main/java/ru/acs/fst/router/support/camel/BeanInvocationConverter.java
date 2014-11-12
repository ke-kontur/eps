package ru.acs.fst.router.support.camel;

import org.apache.camel.*;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.component.bean.BeanInvocation;

import java.io.UnsupportedEncodingException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 15.05.2010
 * Time: 14:25:38
 * To change this template use File | Settings | File Templates.
 */
@Converter
public class BeanInvocationConverter {

    @Converter
    public static String toString(BeanInvocation inv){
        Object[] args = inv.getArgs();
        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i < args.length; i++) {
            Object o = args[i];
            if (o.getClass().getSimpleName().equals("byte[]")){
                try {
                    sb.append(new String((byte[])o,"UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    sb.append(new String((byte[])o));
                }
            }else{
                sb.append(o);
            }
            sb.append((i == args.length - 1) ? "]" : ", ");
        }
        return sb.toString();
    }
    @Converter
    public static InputStream toInputStream(BeanInvocation inv){
        return new ByteArrayInputStream(toString(inv).getBytes());
    }

    @Converter
    public static InputStream toInputStream(Boolean value){
        return new ByteArrayInputStream(value.toString().getBytes());          
    }
}
