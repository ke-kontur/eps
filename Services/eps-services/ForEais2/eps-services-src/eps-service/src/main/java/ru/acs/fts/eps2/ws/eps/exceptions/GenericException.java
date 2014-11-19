package ru.acs.fts.eps2.ws.eps.exceptions;

public class GenericException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	private String code = ErrorCodes.ERROR_UNKNOWN;
	
	public GenericException( String code, String message )
	{
		super( message );
		this.code = code;
	}
	
	public GenericException( String message )
	{
		super( message );
	}
	
	public String getCode( )
	{
		return code;
	}
}
