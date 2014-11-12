package ru.acs.fts.eps2.balancer.transport.out;

import javax.jms.Destination;
import javax.jms.Message;

import org.springframework.jms.core.JmsTemplate;

import ru.acs.fts.eps2.balancer.exceptions.MessageSenderException;
import ru.acs.fts.eps2.balancer.processing.EpsDestination;

public interface IMessageSender
{
	public void send( byte[ ] message, EpsDestination destination ) throws MessageSenderException;
	public void send( final Message message, Destination destination, JmsTemplate jmsTemplate ) throws MessageSenderException;
}
