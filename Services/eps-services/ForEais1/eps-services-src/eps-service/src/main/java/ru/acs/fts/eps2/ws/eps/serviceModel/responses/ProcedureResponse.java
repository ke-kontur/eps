package ru.acs.fts.eps2.ws.eps.serviceModel.responses;

import ru.acs.fts.eps2.ws.eps.serviceModel.objects.Procedure;

public class ProcedureResponse extends Response
{
	private Procedure _procedure;
	
	// @formatter:off
	public void setProcedure( Procedure procedure ) { _procedure = procedure; }
	public Procedure getProcedure( ) { return _procedure; }
	// @formatter:on
}
