package ru.acs.fts.aud.rest.service.model.objects;

public class AudResultInfo
{
	private String _resultCode;
	private String _description;
	
	// @formatter:off
	public void setResultCode( String resultCode ) { _resultCode = resultCode; }
	public String getResultCode( ) { return _resultCode; }
	
	public void setDescription( String description ) { _description = description; }
	public String getDescription( ) { return _description; }
	// @formatter:on
}
