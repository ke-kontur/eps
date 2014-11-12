package ru.acs.fts.eps2.ws.struct.exceptions;

public class ValidateException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	private final String _errorCode;
	private final String _validateString;
	
	public ValidateException( )
	{
		_errorCode = "09.96669.99";
		_validateString = "";
	}
	
	public ValidateException( String errorCode, String validateString )
	{
		_errorCode = errorCode;
		_validateString = validateString;
	}
	
	public ValidateException( Throwable exc )
	{
		super( exc );
		
		_errorCode = "09.96669.99";
		_validateString = "";
	}
	
	public ValidateException( String errorCode, String validateString, Throwable exc )
	{
		super( exc );
		
		_errorCode = errorCode;
		_validateString = validateString;
	}
	
	public String getErrorCode( ) { return _errorCode; }
	public String getValidateString( ) { return _validateString; }
}
