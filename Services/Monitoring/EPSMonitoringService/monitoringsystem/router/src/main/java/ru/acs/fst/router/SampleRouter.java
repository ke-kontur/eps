package ru.acs.fst.router;

import org.apache.camel.Body;
import org.apache.camel.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 13.11.2009
 * Time: 20:19:33
 * To change this template use File | Settings | File Templates.
 */
public class SampleRouter {
    private final String rouPath = "/soap:Envelope/soap:Header/rou:RoutingInf";
    private final String appPath = "/soap:Envelope/soap:Header/app:ApplicationInf";
    final static Logger log = LoggerFactory.getLogger(SampleRouter.class);
    private Sender sender;

    @Transactional(propagation = Propagation.REQUIRED)
    public void route(@CustomsXPath(rouPath + "/rou:ReceiverInformation") String receiver, @CustomsXPath(appPath + "/app:MessageKind") String messageKind, @CustomsXPath(rouPath + "/rou:SenderInformation") String senderInf, @Body byte[] body) {
        System.out.println("route message");
        System.out.println("receiver=" + receiver);
        System.out.println("messageKind=" + messageKind);
        System.out.println("sender=" + senderInf);
        sender.send(body);
        if (messageKind.equals("ERROR.MESSAGE")) {
            throw new RuntimeException("This a error message! )))");
        }

    }

    public void archive(@Body byte[] body) {
        System.out.println("archive message");
        sender.sendToQueue("ARCHIVE.LOG", "QMGR2", body);
    }
    public void routeExt(@Property("Queue") String queue,@Property("QueueManager") String queueManager, @Body byte[] body) {
        sender.sendToQueue(queue, queueManager, body);
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }
}
