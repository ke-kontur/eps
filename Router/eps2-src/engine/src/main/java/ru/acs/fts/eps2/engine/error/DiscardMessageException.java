package ru.acs.fts.eps2.engine.error;

public class DiscardMessageException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	private final byte[ ] _receivedMessage;
	private final String _queueToDiscard;
	
	// @formatter:off
	public byte[ ] getReceivedMessage( ) { return _receivedMessage; }
	
	public String getQueueToDiscard( ) { return _queueToDiscard; }
	// @formatter:on
	
	public DiscardMessageException( byte[ ] receivedMessage, String queueToDiscard )
	{
		_receivedMessage = receivedMessage;
		_queueToDiscard = queueToDiscard;
	}
}
