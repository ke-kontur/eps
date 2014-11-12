package ru.acs.fst.router.camel.component.mq.jms;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.jms.ConnectionFactory;
import javax.jms.Connection;
import javax.jms.JMSException;

import ru.acs.fst.router.camel.component.mq.jms.MQConnection;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 12.08.2010
 * Time: 20:22:29
 * To change this template use File | Settings | File Templates.
 */
public class MQConnectionFactory implements ConnectionFactory{    

    public Connection createConnection() throws JMSException {
        return new MQConnection();  //To change body of implemented methods use File | Settings | File Templates.
    }
    
    public Connection createConnection(String userName, String password) throws JMSException {
        throw new NotImplementedException();
        //return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
