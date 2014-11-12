package ru.acs.fts.eps2.failedMessages.exceptions;

public class StorageException extends Exception
{
	private static final long serialVersionUID = 1L;

	public StorageException( )
	{
		
	}
	
	public StorageException( String message ) // NO_UCD (unused code)
	{
		super( message );
	}
	
	public StorageException( Throwable cause ) // NO_UCD (unused code)
	{
		super( cause );
	}
	
	public StorageException( String message, Throwable cause )
	{
		super( message, cause );
	}
}
