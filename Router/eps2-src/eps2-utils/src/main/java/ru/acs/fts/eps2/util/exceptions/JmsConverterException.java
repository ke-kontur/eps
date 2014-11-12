package ru.acs.fts.eps2.util.exceptions;

public class JmsConverterException extends Exception
{
	private static final long serialVersionUID = 1L;

	public JmsConverterException( )
	{
		
	}
	
	public JmsConverterException( String message )
	{
		super( message );
	}
	
	public JmsConverterException( Throwable cause ) // NO_UCD (unused code)
	{
		super( cause );
	}
	
	public JmsConverterException( String message, Throwable cause )
	{
		super( message, cause );
	}
}
