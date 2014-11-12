package ru.acs.fts.aud.management.utils.exceptions;

public class GenericException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public GenericException( )
	{
		super( );
	}
	
	public GenericException( String message )
	{
		super( message );
	}
	
	public GenericException( Throwable t )
	{
		super( t );
	}
	
	public GenericException( String message, Throwable t )
	{
		super( message, t );
	}
}
