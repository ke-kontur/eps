package ru.acs.fts.eps2.util.wmq.interfaces;

public interface IWmqConnection
{
	public boolean initiate( );
	public boolean shutdown( );
	
	public IWmqQueueConnection openQueue2Get( String queueName );
	public IWmqQueueConnection openQueue2Put( String queueName ); // NO_UCD (unused code)
}
