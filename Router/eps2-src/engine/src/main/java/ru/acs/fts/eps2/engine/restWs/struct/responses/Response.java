package ru.acs.fts.eps2.engine.restWs.struct.responses;

public class Response // NO_UCD (use default)
{
	private String _status = "ok";
	
	// @formatter:off
	public void setStatus( String status ) { _status = status; }
	public String getStatus( ) { return _status; }
	// @formatter:on
}
