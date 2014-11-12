package ru.acs.fts.aud.command.executor.interfaces;

import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;

public interface ICommandProcessor
{
	public boolean processCommand( EdeclAudCommand command ) throws Exception;
}
