package ru.acs.fst.router;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.camel.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.acs.commons.xslt.XsltProcessor;
import ru.acs.fst.router.support.broker.domain.*;
import ru.acs.fts.dto.OXMConverter;
import ru.acs.fts.dto.soap.ApplicationInf;
import ru.acs.fts.dto.soap.Envelope;
import ru.acs.fts.dto.soap.RoutingInf;

import javax.xml.transform.TransformerException;
import java.io.*;
import java.text.MessageFormat;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 08.04.2010
 * Time: 13:02:27
 * To change this template use File | Settings | File Templates.
 */
public class XmlRulesRouter {
    private final String rouPath = "/soap:Envelope/soap:Header/rou:RoutingInf";
    private final String appPath = "/soap:Envelope/soap:Header/app:ApplicationInf";
    final static Logger log = LoggerFactory.getLogger(SampleRouter.class);
    private String checkRulesXslt = null;
    private Sender sender;

    @Transactional(propagation = Propagation.REQUIRED)
    public void route(@Property("InputQueue") String inputQueue, @Body byte[] body, Exchange exchange) {
        OXMConverter om = new OXMConverter();
        Object obj = om.unmarshall(body);
        if (!(obj instanceof Envelope)) {
            throw new RuntimeException("Неверный тип сообщения. Ожидается 'Envelope', получен '"
                    + obj.getClass().getName() + "'");
        }
        Envelope envelope = (Envelope) obj;
        RoutingInf rou = getRoutingInf(envelope);
        if (rou == null) {
            throw new RuntimeException("Неверный формат сообщения. Отсутствует заголовок RoutingInf.");
        }

        ApplicationInf appInf = getAppInf(envelope);
        if (appInf == null) {
            throw new RuntimeException("Неверный формат сообщения. Отсутствует заголовок ApplicationInf.");
        }
        ByteArrayOutputStream bos = getRouteRulesStream(rou, appInf, inputQueue);
        // RouteInfo routeInfo = serializeToRoute(bos);
        Data routeRuleData = parseRouteRules(bos.toByteArray());
        RouteRule routeRule = routeRuleData.getRouteRule();
       // log.debug("Rule:" + bos.toString());
        log.info(MessageFormat.format("Обрабатывается сообщение: EnvelopeID={0}, Sender={1}, MessageKind={2},Receiver={4}. Правило маршрутизации: {3}", rou.getEnvelopeID(), rou.getSenderInformation(), appInf.getMessageKind(), routeRule.getDescription(),rou.getReceiverInformations().get(0)));
        String receiverQueue = null;
        String receiverManager = null;
        String receiver = null;
        if (rou.getReceiverInformations() != null) {
            receiver = rou.getReceiverInformations().get(0);
            if (receiver.toUpperCase().startsWith("WMQ://")) {
                receiverManager = receiver.substring(6);
                receiverManager = receiverManager.substring(0, receiverManager.indexOf("/"));
                receiverQueue = receiver.substring(receiver.indexOf("/", 7) + 1);
            } else {
                //  throw new RuntimeException("Not supported protocol");
            }

        }

        if (routeRule.getSender() != null) {
            rou.setSenderInformation(routeRule.getSender());
        }
        if (routeRule.getReceiver() != null) {
            rou.getReceiverInformations().clear();
            rou.getReceiverInformations().add(routeRule.getReceiver());
        }
        bos = new ByteArrayOutputStream();
        om.marshall(envelope, bos);
        log.info(MessageFormat.format("Для EnvelopeID={0} установлены Sender={1}, Receiver={2}", rou.getEnvelopeID(), rou.getSenderInformation(), rou.getReceiverInformations().get(0)));

        for (DestinationInfo destinationInfo : routeRule.getDestinations()) {
            String sendQ = destinationInfo.getQueue();
            String sendQM = destinationInfo.getQueueManager();
            if (sendQ.toUpperCase().equals("RECEIVER")) {
                sendQ = receiverQueue;
            }
            if (sendQM.toUpperCase().equals("RECEIVER")) {
                sendQM = receiverManager;
            }
            Router route = findRoute(routeRuleData.getTable().getRouters(),sendQM);
            if (route!=null && route.getQueue()!=null){
                sendQ=route.getQueue();
            }
            log.info(MessageFormat.format("Отправляется сообщение: EnvelopeID={0} в WMQ://{1}/{2}", rou.getEnvelopeID(), sendQM, sendQ));
            sender.sendToQueue(sendQ, sendQM, destinationInfo.getPriority(), bos.toByteArray());
        }


    }

    private Router findRoute(List<Router> routers, String sendQM) {
        for (Router router : routers) {
            if (router.getQueueManager().equals(sendQM)){
                return router;
            }
        }
        return null;
    }


    private ApplicationInf getAppInf(Envelope envelope) {
        for (Object header : envelope.getHeader().getAnies()) {
            if (header instanceof ApplicationInf) {
                return (ApplicationInf) header;
            }

        }
        log.warn("Не найден заголовок ApplicationInf");
        return null;

    }

    private RoutingInf getRoutingInf(Envelope envelope) {
        for (Object header : envelope.getHeader().getAnies()) {
            if (header instanceof RoutingInf) {
                return (RoutingInf) header;
            }
        }
        log.warn("Не найден заголовок RoutingInf");
        return null;
    }


    private ByteArrayOutputStream getRouteRulesStream(RoutingInf routingInf, ApplicationInf appInf, String inputQueue) {
        ByteArrayInputStream bis = getRouterParams(routingInf, appInf, inputQueue);
        InputStream xslt;
        if (checkRulesXslt != null) {
            try {
                xslt = new FileInputStream(new File(checkRulesXslt));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException("Файл checkRulesXslt не  найден: " + e.getMessage(), e);
            }
        } else {
            xslt = getClass().getResourceAsStream("/xslt/CheckRules.xslt");
        }
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XsltProcessor xsltProcessor = XsltProcessor.getInstance();
        try {
            xsltProcessor.convert(bis, xslt, bos);
        } catch (TransformerException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return bos;
    }

    private ByteArrayInputStream getRouterParams(RoutingInf routingInf, ApplicationInf appInf, String inputQueue) {
        StringBuilder input = new StringBuilder("<Data>");
        input.append("<Queue>" + inputQueue + "</Queue>");
        input.append("<Sender>" + routingInf.getSenderInformation() + "</Sender>");
        if (routingInf.getReceiverInformations() != null) {
            input.append("<Receiver>" + routingInf.getReceiverInformations().get(0) + "</Receiver>");
        }
        input.append("<MessageKind>" + appInf.getMessageKind() + "</MessageKind>");
        input.append("</Data>");
        log.debug("Route params:" +input.toString());
        ByteArrayInputStream bis = new ByteArrayInputStream(input.toString().getBytes());
        return bis;
    }

    private Data parseRouteRules(byte[] xmlRule) {
        try {
            return (Data) XStreamUtil.getXstream().fromXML(new ByteArrayInputStream(xmlRule));
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        }

    }

    private String getValue(String line) {
        return line.substring(line.indexOf(">") + 1, line.indexOf("</"));
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public String getCheckRulesXslt() {
        return checkRulesXslt;
    }

    public void setCheckRulesXslt(String checkRulesXslt) {
        this.checkRulesXslt = checkRulesXslt;
    }
}


   /*
    private RouteInfo serializeToRoute(ByteArrayOutputStream bos) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bos.toByteArray())));
        RouteInfo route = new RouteInfo();
        try {
            String line = reader.readLine();
            String[] lines = line.split("><");
            DestinationInfo destInfo = new DestinationInfo();
            for (int i = 0; i < lines.length; i++) {
                line = lines[i];
                if (line.trim().startsWith("Queue>")) {
                    if (destInfo.getQueue() != null) {
                        route.getDestinations().add(destInfo);
                        destInfo = new DestinationInfo();
                    }
                    destInfo.setQueue(getValue(line));
                }
                if (line.trim().startsWith("QueueManager>")) {
                    destInfo.setQueueManager(getValue(line));
                }
                if (line.trim().startsWith("Sender>")) {
                    route.setSender(getValue(line));
                }
                if (line.trim().startsWith("Receiver>")) {
                    route.setReceiver(getValue(line));
                }
                if (line.trim().startsWith("Description>")) {
                    route.setDescription(getValue(line));
                }
            }

            if (destInfo.getQueue() != null) {
                route.getDestinations().add(destInfo);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return route;
    }
        */