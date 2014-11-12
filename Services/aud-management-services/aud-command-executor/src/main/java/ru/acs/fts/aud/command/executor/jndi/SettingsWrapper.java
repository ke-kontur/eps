package ru.acs.fts.aud.command.executor.jndi;

public class SettingsWrapper
{
	private Settings _settings;
	
	// @formatter:off
	public void setSettings( Settings settings ) { _settings = settings; }
	public Settings getSettings( ) { return _settings; }
	// @formatter:on
}
