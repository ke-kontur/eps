package ru.acs.fst.router.camel.component;

import ru.acs.fst.router.RouterException;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 11.06.2010
 * Time: 18:26:08
 * To change this template use File | Settings | File Templates.
 */
public class LocalContext {

    public LocalContext() {
    }

    private static ThreadLocal context = new ThreadLocal() {
            @Override
            protected synchronized Object initialValue() {
                    return new LocalContext();
            }
    };

    private Map<String,Object> attributes = new HashMap<String,Object>();

    /**
     * Возвращает текущий контекст.
     */
    public static LocalContext getContext() {
            return (LocalContext) context.get();
    }


    /**
     * Возвращает занчение атрибута по имени.
     */
    public Object getAttribute(String attributeName) {
            return attributes.get(attributeName);
    }

    /**
     * Устанавливает значение аттрибута с именем.
     */
    public void setAttribute(String attributeName, Object objectName) {
            attributes.put(attributeName, objectName);
    }
    /**
     * Удалить аттрибут.
     */
    public void removeAttribute(String attributeName) {
            attributes.remove(attributeName);
    }


    public Map getAttributes() {
            return attributes;
    }


    /**
     * Возвращает экземпляр класса.
     * Если в данной сессии класс уже использовался, то объект возвращается из кэша
     * В противном случае, создается и кэшируется новый объект.
     * Класс должен иметь открытый конструктор без параметров и не иметь состояния,
     * или сбрасывать это состояние
     * @param clazz
     * @return
     */
    public Object getInstance(Class clazz) {
            final String name = clazz.getName();
            Object result = getAttribute(name);
            if (result == null) {
                    try {
                            result = clazz.newInstance();
                    } catch (Exception e) {
                            throw new RouterException(e);
                    }
                    setAttribute(name, result);
            }
            return result;
    }

}

