package ru.acs.fst.router.camel.component;

import javax.jms.ConnectionFactory;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 10.06.2010
 * Time: 19:32:05
 * To change this template use File | Settings | File Templates.
 */
public class MQConfiguration {
    private String hostName;
    private String channel = "SYSTEM.DEF.SVRCONN";
    private int port = 1414;
    private int charSet = 0;
    private String queueManager;
    private String queueName;
    private ConnectionFactory factory;

    public ConnectionFactory getFactory() {
        return factory;
    }

    public void setFactory(ConnectionFactory factory) {
        this.factory = factory;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getQueueManager() {
        return queueManager;
    }

    public void setQueueManager(String queueManager) {
        this.queueManager = queueManager;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public int getCharSet() {
        return charSet;
    }

    public void setCharSet(int charSet) {
        this.charSet = charSet;
    }
}
