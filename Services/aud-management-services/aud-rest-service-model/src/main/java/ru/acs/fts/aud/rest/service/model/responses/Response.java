package ru.acs.fts.aud.rest.service.model.responses;

public class Response
{
	public final static String FAIL_STATUS = "fail";
	public final static String OK_STATUS = "ok";
	
	private String _status = OK_STATUS;
	
	// @formatter:off
	public void setStatus( String status ) { _status = status; }
	public String getStatus( ) { return _status; }
	// @formatter:on
}
