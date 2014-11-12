package ru.acs.fts.aud.model.persistence.exception;

import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class PersistenceException extends DatabaseException
{
	private static final long serialVersionUID = 1L;
	
	public PersistenceException( )
	{
		
	}
	
	public PersistenceException( String message ) // NO_UCD (unused code)
	{
		super( message );
	}
	
	public PersistenceException( Throwable throwable ) // NO_UCD (unused code)
	{
		super( throwable );
	}
	
	public PersistenceException( String message, Throwable throwable )
	{
		super( message, throwable );
	}
}
