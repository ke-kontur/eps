package ru.acs.fts.eps2.ws.eps.serviceModel.responses;

public class ErrorResponse extends Response
{
	private String _message;
	
	// @formatter:off
	public void setMessage( String message ) { _message = message; }
	public String getMessage( ) { return _message; }
	// @formatter:on
}
