package ru.acs.fts.aud.router.processing;

import ru.acs.fts.eps2.engine.configuration.Configurator;

public class AudConfigurator extends Configurator
{
	private String _audServerName;
	private String _transportServerAddress;
	
	// @formatter:off
	public void setAudServerName( String audServerName ) { _audServerName = audServerName; }
	public String getAudServerName( ) { return _audServerName; }
	
	public void setTransportServerAddress( String transportServerAddress ) { _transportServerAddress = transportServerAddress; }
	public String getTransportServerAddress( ) { return _transportServerAddress; }
	// @formatter:on
}
