package ru.acs.fts.eps2.ws.model.responses;

public class Response
{
	private String _status = "ok";
	
	// @formatter:off
	public void setStatus( String status ) { _status = status; }
	public String getStatus( ) { return _status; }
	// @formatter:on
}
