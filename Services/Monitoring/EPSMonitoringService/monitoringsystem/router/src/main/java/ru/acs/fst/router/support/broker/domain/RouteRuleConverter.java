package ru.acs.fst.router.support.broker.domain;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 09.04.2010
 * Time: 17:08:34
 * To change this template use File | Settings | File Templates.
 */
public class RouteRuleConverter implements Converter {
    final static Logger log = LoggerFactory.getLogger(RouteRuleConverter.class);

    public void marshal(Object o, HierarchicalStreamWriter writer, MarshallingContext marshallingContext) {
        RouteRule rule = (RouteRule) o;
        List<DestinationInfo> destinations = rule.getDestinations();
        for (DestinationInfo destination : destinations) {
            if (destination.getQueue() != null) {
                writer.startNode("Queue");
                writer.setValue(destination.getQueue());
                writer.endNode();
            }
            if (destination.getPriority() != -1) {
                writer.startNode("Priority");
                writer.setValue("" + destination.getPriority());
                writer.endNode();
            }

            if (destination.getQueueManager() != null) {
                writer.startNode("QueueManager");
                writer.setValue(destination.getQueueManager());
                writer.endNode();
            }
        }
        if (rule.getSender() != null) {
            writer.startNode("Sender");
            writer.setValue(rule.getSender());
            writer.endNode();
        }

        if (rule.getReceiver() != null) {
            writer.startNode("Receiver");
            writer.setValue(rule.getReceiver());
            writer.endNode();
        }
        if (rule.getDescription() != null) {
            writer.startNode("Description");
            writer.setValue(rule.getDescription());
            writer.endNode();
        }

    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext unmarshallingContext) {
        RouteRule rule = new RouteRule();
        DestinationInfo dest = new DestinationInfo();
        while (reader.hasMoreChildren()) {
            reader.moveDown();
            if (reader.getNodeName().equals("Queue")) {
                if (dest.getQueue() != null) {
                    rule.getDestinations().add(dest);
                    dest = new DestinationInfo();
                }
                dest.setQueue(reader.getValue());
            }
            if (reader.getNodeName().equals("Priority")) {
                String value = reader.getValue();
                if (value != null) {
                    try {
                        int priority = Integer.parseInt(value);
                        if (priority>9)
                            priority=9;
                        if (priority<0)
                            priority=0;
                        dest.setPriority(priority);
                    } catch (NumberFormatException e) {
                        log.warn("Priority = "+value+" םו ÿגכÿועסÿ צûפנמי");
                    }
                }
            }
            if (reader.getNodeName().equals("QueueManager")) {
                dest.setQueueManager(reader.getValue());
            }
            if (reader.getNodeName().equals("Sender")) {
                rule.setSender(reader.getValue());
            }
            if (reader.getNodeName().equals("Receiver")) {
                rule.setReceiver(reader.getValue());
            }
            if (reader.getNodeName().equals("Description")) {
                rule.setDescription(reader.getValue());
            }
            reader.moveUp();

        }
        if (dest.getQueue() != null) {
            rule.getDestinations().add(dest);
        }

        return rule;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean canConvert(Class aClass) {
        return aClass.equals(RouteRule.class);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
