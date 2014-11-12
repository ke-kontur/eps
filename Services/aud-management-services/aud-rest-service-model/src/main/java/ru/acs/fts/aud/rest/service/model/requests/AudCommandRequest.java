package ru.acs.fts.aud.rest.service.model.requests;

import ru.acs.fts.aud.rest.service.model.objects.AudCommand;

public class AudCommandRequest extends Request
{
	private AudCommand _audCommand;
	
	// @formatter:off
	public void setAudCommand( AudCommand audCommand ) { _audCommand = audCommand; }
	public AudCommand getAudCommand( ) { return _audCommand; }
	// @formatter:on
}
