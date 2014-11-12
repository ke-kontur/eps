package ru.acs.fts.eps2.engine.restWs.struct.responses;

import java.util.List;

public class StructErrorResponse extends Response
{
	private String _message;
	private String _exception;
	private List< String > _stack;
	
	// @formatter:off
	public String getMessage( ) { return _message; }
	public void setMessage( String message ) { _message = message; }
	
	public String getException( ) { return _exception; }
	public void setException( String exception ) { _exception = exception; }
	
	public List< String > getStack( ) { return _stack; }
	public void setStack( List< String > stack ) { _stack = stack; }
	// @formatter:on
}
