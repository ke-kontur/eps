package ru.acs.fts.eps2.engine.restWs.crypto.responses;

import java.util.List;

public class CryptoErrorResponse extends Response
{
	private String message;
	private String exception;
	private List< String > stack;
	private String code;
	
	// @formatter:off
	public String getMessage( ) { return message; }
	public void setMessage( String message ) { this.message = message; }
	
	public String getException( ) { return exception;}
	public void setException( String exception ) { this.exception = exception; }
	
	public List< String > getStack( ) { return stack; }
	public void setStack( List< String > stack ) { this.stack = stack; }
	
	public String getCode( ) { return code; }
	public void setCode( String code ) { this.code = code; }
	// @formatter:on
}
