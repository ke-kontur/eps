package ru.acs.fts.eps2.engine.transport.gateway.out;

import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.transport.exceptions.TransportException;

public interface MessagingGateway
{
	public void sendMessage( Envelope envelope ) throws TransportException;
	public void sendMessage( byte[ ] message, String predefinedQueue ) throws TransportException;
}
