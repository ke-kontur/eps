package ru.acs.fts.aud.rest.service.model.responses;

public class ErrorResponse extends Response
{	
	public final static int ERROR_CODE_GENERIC = 1;
	
	private String _message;
	private int _errorCode = 0;
	
	// @formatter:off
	public void setMessage( String message ) { _message = message; }
	public String getMessage( ) { return _message; }
	
	public void setErrorCode( int errorCode ) { _errorCode = errorCode; }
	public int getErrorCode( ) { return _errorCode; }
	// @formatter:on
}
