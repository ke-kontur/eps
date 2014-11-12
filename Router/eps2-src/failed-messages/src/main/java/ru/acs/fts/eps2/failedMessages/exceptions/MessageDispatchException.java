package ru.acs.fts.eps2.failedMessages.exceptions;

public class MessageDispatchException extends Exception
{
	private static final long serialVersionUID = 1L;

	public MessageDispatchException( )
	{
		
	}
	
	public MessageDispatchException( String message ) // NO_UCD (unused code)
	{
		super( message );
	}
	
	public MessageDispatchException( Throwable cause ) // NO_UCD (unused code)
	{
		super( cause );
	}
	
	public MessageDispatchException( String message, Throwable cause )
	{
		super( message, cause );
	}
}
