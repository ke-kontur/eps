package ru.acs.fts.aud.management.model.exceptions;

public class PersistenceException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public PersistenceException( )
	{
		super( );
	}
	
	public PersistenceException( String message )
	{
		super( message );
	}
	
	public PersistenceException( Throwable t )
	{
		super ( t );
	}
	
	public PersistenceException( String message, Throwable t )
	{
		super( message, t );
	}
}
