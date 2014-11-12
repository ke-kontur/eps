package ru.acs.fts.aud.rest.service.model.responses;

import ru.acs.fts.aud.rest.service.model.objects.AudMessage;

public class AudMessageResponse extends Response
{
	private AudMessage _audMessage;
	
	// @formatter:off
	public void setAudMessage( AudMessage audMessage ) { _audMessage = audMessage; }
	public AudMessage getAudMessage( ) { return _audMessage; }
	// @formatter:on
}
