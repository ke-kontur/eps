package ru.acs.fts.eps2.ws.eps.serviceModel.responses;

import ru.acs.fts.eps2.ws.eps.serviceModel.objects.SendedEnvelope;

public class SendedEnvelopeResponse extends Response
{
	private SendedEnvelope _sendedEnvelope;
	
	// @formatter:off
	public void setSendedEnvelope( SendedEnvelope sendedEnvelope ) { _sendedEnvelope = sendedEnvelope; }
	public SendedEnvelope getSendedEnvelope( ) { return _sendedEnvelope; }
	// @formatter:on
}
