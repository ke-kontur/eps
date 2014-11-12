package ru.acs.fts.eps2.engine.restWs.event.serviceModel;

public class MessageExceptionRecord
{
	private String envelopeId;
	private String stacktrace;
	
	// @formatter:off
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }
	
	public void setStacktrace( String stacktrace ) { this.stacktrace = stacktrace; }
	public String getStacktrace( ) { return stacktrace; }
	// @formatter:on
}
