package ru.acs.fts.router;

import com.thoughtworks.xstream.XStream;
import org.junit.Test;
import ru.acs.fst.router.support.broker.domain.*;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 09.04.2010
 * Time: 16:10:11
 * To change this template use File | Settings | File Templates.
 */
public class ParseRuleTest {

    @Test
    public void testSerialize() {
        Data data = createData();
        XStream xstream = (new XStreamUtil()).getXstream();
        System.out.println(xstream.toXML(data));
    }

    @Test
    public void testDeSerialize() {
        XStream xstream = (new XStreamUtil()).getXstream();
        Data data = (Data) xstream.fromXML("<?xml version=\"1.0\" encoding=\"UTF-8\"?><Data><RouteRule><Queue>AS.ASKTT</Queue><Priority>7</Priority><QueueManager>RU.FTS.GNIVC.RNTS.APP</QueueManager><Queue>ARCHIVE.LOG</Queue><QueueManager>RU.FTS.GNIVC.RNTS.DPC</QueueManager><Description>Сообщение от АСКТТ для сервера приложений</Description></RouteRule><Table><Router><Queue>RNTS.INCOME</Queue><QueueManager>RU.FTS.CTU</QueueManager></Router><Router><Queue>RNTS.INCOME</Queue><QueueManager>RU.FTS.YUTU.RNTS.DPC</QueueManager></Router><Router><Queue>RNTS.INCOME</Queue><QueueManager>RU.FTS.UZTU</QueueManager></Router><Router><Queue>RNTS.INCOME</Queue><QueueManager>RU.FTS.PTU</QueueManager></Router><Router><Queue>RNTS.INCOME</Queue><QueueManager>RU.FTS.UTU</QueueManager></Router><Router><Queue>RNTS.INCOME</Queue><QueueManager>RU.FTS.STU</QueueManager></Router><Router><Queue>RNTS.INCOME</Queue><QueueManager>RU.FTS.DVTU</QueueManager></Router><Router><Queue>RNTS.INCOME</Queue><QueueManager>RU.FTS.RTU1</QueueManager></Router><Router><Queue>RNTS.INCOME</Queue><QueueManager>RU.FTS.AUD</QueueManager></Router><Router><Queue>RNTS.INCOME</Queue><QueueManager>RU.FTS.INT.DPC</QueueManager></Router></Table></Data>");
        System.out.println(xstream.toXML(data));
    }

    private Data createData() {
        Data data = new Data();
        RouteRule routeRule = new RouteRule();
        routeRule.setDescription("descr1");
        routeRule.setSender("sender1");
        routeRule.setReceiver("rec1");

        DestinationInfo dest = new DestinationInfo();
        dest.setQueue("toQ1");
        dest.setPriority(8);
        dest.setQueueManager("toQM1");
        routeRule.getDestinations().add(dest);
        dest = new DestinationInfo();
        dest.setQueue("toQ2");
        dest.setQueueManager("toQM2");
        routeRule.getDestinations().add(dest);

        data.setRouteRule(routeRule);
        Table table = new Table();
        Router router = new Router();
        router.setQueue("q1");
        router.setQueueManager("qm1");
        table.add(router);
        router = new Router();
        router.setQueue("q2");
        router.setQueueManager("qm2");
        table.add(router);
        data.setTable(table);
        return data;
    }
}
