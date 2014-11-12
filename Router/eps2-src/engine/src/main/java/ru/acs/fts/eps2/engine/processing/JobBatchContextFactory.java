package ru.acs.fts.eps2.engine.processing;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.model.services.ServiceHolder;

public abstract class JobBatchContextFactory
{
	private Configurator _configurator;
	private ServiceHolder _serviceHolder;
	
	// @formatter:off
	@Required public void setConfigurator( Configurator configurator ) { _configurator = configurator; }
	public Configurator getConfigurator( ) { return _configurator; }
	
	@Required public void setServiceHolder( ServiceHolder serviceHolder ) { _serviceHolder = serviceHolder; }
	public ServiceHolder getServiceHolder( ) { return _serviceHolder; }
	// @formatter:on

	public abstract JobBatchContext create( byte[ ] message ) throws BaseProcessingException;
}
