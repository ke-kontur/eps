package ru.acs.fst.router.support.broker.domain;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 08.04.2010
 * Time: 16:54:04
 * To change this template use File | Settings | File Templates.
 */
public class DestinationInfo {
    private String queue;

    private String queueManager;

    private int priority = 4;

    public String getQueueManager() {
        return queueManager;
    }

    public void setQueueManager(String queueManager) {
        this.queueManager = queueManager;
    }


    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
