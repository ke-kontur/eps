package ru.acs.fts.eps2.ws.eps.serviceModel.responses;

import ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudCommand;

public class AudCommandResponse extends Response
{
	private AudCommand _command;
	
	// @formatter:off
	public void setCommand( AudCommand command ) { _command = command; }
	public AudCommand getCommand( ) { return _command; }
	// @formatter:on
}
