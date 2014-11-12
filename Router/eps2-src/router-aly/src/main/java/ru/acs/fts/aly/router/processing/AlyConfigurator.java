package ru.acs.fts.aly.router.processing;

import ru.acs.fts.eps2.engine.configuration.Configurator;

public class AlyConfigurator extends Configurator
{
	private String _alyServerName;
	private String _transportServerAddress;

	// @formatter:off
	public void setAlyServerName( String alyServerName ) { _alyServerName = alyServerName; }
	public String getAlyServerName( ) { return _alyServerName; }
	
	public void setTransportServerAddress( String transportServerAddress ) { _transportServerAddress = transportServerAddress; }
	public String getTransportServerAddress( ) { return _transportServerAddress; }
	// @formatter:on
}
