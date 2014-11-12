package ru.acs.fts.eps2.ws.eps.serviceModel.responses;

public class EnvelopeResponse extends Response
{
	private String _envelope; // base64
	
	// @formatter:off
	public void setEnvelope( String envelope ) { _envelope = envelope; }
	public String getEnvelope( ) { return _envelope; }
	// @formatter:on
}
