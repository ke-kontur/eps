package ru.acs.fts.aud.wmq.router.restWs.struct.responses;

public class Response
{
	private String _status = "ok";
	
	// @formatter:off
	public void setStatus( String status ) { _status = status; }
	public String getStatus( ) { return _status; }
	// @formatter:on
}
