package ru.acs.fts.eps2.balancer.exceptions;

public class MessageSenderException extends Exception
{
	private static final long serialVersionUID = 1L;

	public MessageSenderException( )
	{
		
	}
	
	public MessageSenderException( String message ) // NO_UCD (unused code)
	{
		super( message );
	}
	
	public MessageSenderException( Throwable cause ) // NO_UCD (unused code)
	{
		super( cause );
	}
	
	public MessageSenderException( String message, Throwable cause )
	{
		super( message, cause );
	}
}
