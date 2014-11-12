package ru.acs.fst.router.support.broker.domain;

import com.thoughtworks.xstream.XStream;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 09.04.2010
 * Time: 16:30:53
 * To change this template use File | Settings | File Templates.
 */
public class XStreamUtil {
    static XStream xstream = null;   
    public static XStream getXstream() {
        if (xstream == null) {
            xstream = createXstream();
        }
        return xstream;
    }


    private static XStream createXstream() {
        XStream xstream = new XStream();
        xstream.alias("Data", Data.class);
        xstream.alias("Router", Router.class);
        xstream.alias("Table", Table.class);
        xstream.alias("DestinationInfo", DestinationInfo.class);
        xstream.aliasField("RouteRule", Data.class, "routeRule");
        xstream.aliasField("Table", Data.class, "table");
        xstream.aliasField("Queue", Router.class, "queue");
        xstream.aliasField("QueueManager", Router.class, "queueManager");
        xstream.aliasField("Sender", RouteRule.class, "sender");
        xstream.aliasField("Description", RouteRule.class, "description");
        xstream.aliasField("Receiver", RouteRule.class, "receiver");
        xstream.aliasField("Queue", DestinationInfo.class, "queue");
        xstream.aliasField("QueueManager", DestinationInfo.class, "queueManager");

        xstream.addImplicitCollection(Table.class, "routers");
        xstream.addImplicitCollection(RouteRule.class, "destinations");
        xstream.registerConverter(new RouteRuleConverter());
        return xstream;
    }

}
