package ru.acs.fts.eps2.engine.transport;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.transport.routingInfo.CoaCodHeaders;
import ru.acs.fts.eps2.engine.transport.routingInfo.ExternalRoutingInfo;

public abstract class AddressFactory
{
	private Configurator _configurator;
	private CoaCodHeaders _coaCodHeaders;
	
	// @formatter:off
	@Required
	public void setConfigurator( Configurator configurator ) { _configurator = configurator; }
	public Configurator getConfigurator( ) { return _configurator; }
	
	@Required
	public void setCoaCodHeaders( CoaCodHeaders coaCodHeaders ) { _coaCodHeaders = coaCodHeaders; }
	public CoaCodHeaders getCoaCodHeaders( ) { return _coaCodHeaders; }
	// @formatter:off
	
	public abstract ExternalRoutingInfo getRoutingAddress(
			Envelope receivedEnvelope, Envelope envelopeToSend,
			String senderSystem, String recipientSystem )
		throws Exception;
}
