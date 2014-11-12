package ru.acs.fts.eps2.ws.eps.serviceModel.objects;

public class SendedEnvelope
{
	private String _envelopeId;
	private String _mqQueueManager;
	private String _mqQueue;
	
	// @formatter:off
	public void setEnvelopeId( String envelopeId ) { _envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return _envelopeId; }
	
	public void setMqQueueManager( String mqQueueManager ) { _mqQueueManager = mqQueueManager; }
	public String getMqQueueManager( ) { return _mqQueueManager; }
	
	public void setMqQueue( String mqQueue ) { _mqQueue = mqQueue; }
	public String getMqQueue( ) { return _mqQueue; }
	// @formatter:on
}
