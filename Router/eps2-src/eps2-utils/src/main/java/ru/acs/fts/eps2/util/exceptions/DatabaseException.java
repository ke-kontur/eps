package ru.acs.fts.eps2.util.exceptions;

public class DatabaseException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public DatabaseException( )
	{
		super( );
	}
	
	public DatabaseException( String message )
	{
		super( message );
	}
	
	public DatabaseException( Throwable t )
	{
		super( t );
	}
	
	public DatabaseException( String message, Throwable t )
	{
		super( t );
	}
}
