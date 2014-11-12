package ru.acs.fst.router.support.broker.domain;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 09.04.2010
 * Time: 15:59:39
 * To change this template use File | Settings | File Templates.
 */
public class Router {
    String queue;
    String queueManager;

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getQueueManager() {
        return queueManager;
    }

    public void setQueueManager(String queueManager) {
        this.queueManager = queueManager;
    }
}
