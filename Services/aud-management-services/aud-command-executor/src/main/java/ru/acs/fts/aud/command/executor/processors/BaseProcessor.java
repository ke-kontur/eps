package ru.acs.fts.aud.command.executor.processors;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.command.executor.interfaces.ICommandProcessor;
import ru.acs.fts.aud.management.model.operators.AudOperator;
import ru.acs.fts.aud.management.model.services.AudService;
import ru.acs.fts.aud.management.model.services.EdeclService;

public abstract class BaseProcessor implements ICommandProcessor
{
	protected AudService _audService;
	protected EdeclService _edeclService;
	
	protected AudOperator _audOperator;
	
	// @formatter:off
	@Required public void setAudService( AudService audService ) { _audService = audService; }
	public AudService getAudService( ) { return _audService; }
	
	@Required public void setEdeclService( EdeclService edeclService ) { _edeclService = edeclService; }
	public EdeclService getEdeclService( ) { return _edeclService; }
	
	@Required public void setAudOperator( AudOperator audOperator ) { _audOperator = audOperator; }
	public AudOperator getAudOperator( ) { return _audOperator; }
	// @formatter:on
}
