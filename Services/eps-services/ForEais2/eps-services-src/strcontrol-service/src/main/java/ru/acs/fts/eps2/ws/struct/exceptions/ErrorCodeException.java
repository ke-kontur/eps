package ru.acs.fts.eps2.ws.struct.exceptions;

public class ErrorCodeException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	private final String _errorCode;
	
	public ErrorCodeException( )
	{
		_errorCode = "09.96669.99";
	}
	
	public ErrorCodeException( String errorCode )
	{
		_errorCode = errorCode;
	}
	
	public ErrorCodeException( Throwable exc )
	{
		super( exc );
		
		_errorCode = "09.96669.99";
	}
	
	public ErrorCodeException( String errorCode, Throwable exc )
	{
		super( exc );
		
		_errorCode = errorCode;
	}
	
	public String getErrorCode( ) { return _errorCode; }
}
