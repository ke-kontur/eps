package ru.acs.fts.aud.rest.service.model.exceptions;

public class AudWmqRestWsException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public AudWmqRestWsException( )
	{
		super( );
	}
	
	public AudWmqRestWsException( String message )
	{
		super( message );
	}
	
	public AudWmqRestWsException( Throwable t )
	{
		super( t );
	}
	
	public AudWmqRestWsException( String message, Throwable t )
	{
		super( message, t );
	}
}
