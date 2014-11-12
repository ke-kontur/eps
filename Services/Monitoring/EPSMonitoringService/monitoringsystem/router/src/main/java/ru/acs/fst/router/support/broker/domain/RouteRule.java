package ru.acs.fst.router.support.broker.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 09.04.2010
 * Time: 15:58:59
 * To change this template use File | Settings | File Templates.
 */
public class RouteRule {
    List<DestinationInfo> destinations = new ArrayList<DestinationInfo>();
    private String sender;
    private String receiver;
    private String description;

    public List<DestinationInfo> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<DestinationInfo> destinations) {
        this.destinations = destinations;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
