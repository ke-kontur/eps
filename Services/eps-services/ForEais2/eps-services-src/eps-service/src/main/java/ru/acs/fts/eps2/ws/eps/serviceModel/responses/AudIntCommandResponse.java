package ru.acs.fts.eps2.ws.eps.serviceModel.responses;

import ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudIntCommand;

public class AudIntCommandResponse extends Response
{
	private AudIntCommand _intCommand;
	
	// @formatter:off
	public void setIntCommand( AudIntCommand intCommand ) { _intCommand = intCommand; }
	public AudIntCommand getIntCommand( ) { return _intCommand; }
	// @formatter:on
}
