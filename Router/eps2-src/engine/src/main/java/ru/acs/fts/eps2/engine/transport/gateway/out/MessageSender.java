package ru.acs.fts.eps2.engine.transport.gateway.out;

import javax.jms.Destination;

import org.springframework.jms.core.JmsTemplate;

import ru.acs.fts.eps2.engine.transport.exceptions.TransportException;
import ru.acs.fts.eps2.engine.transport.routingInfo.CoaCodHeaders;

public interface MessageSender
{
	public void send( byte[ ] message, Destination destination, CoaCodHeaders cchd, JmsTemplate connection ) throws TransportException;
}