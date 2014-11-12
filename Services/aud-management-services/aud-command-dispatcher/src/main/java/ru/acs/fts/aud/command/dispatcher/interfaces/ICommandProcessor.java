package ru.acs.fts.aud.command.dispatcher.interfaces;

import ru.acs.fts.aud.management.model.entities.EdeclAudIntCommand;

public interface ICommandProcessor
{
	public static final String REGISTRY_REQUEST = "REGISTRY_REQUEST";
	
	public boolean processCommand( EdeclAudIntCommand intCommand ) throws Exception;
}
