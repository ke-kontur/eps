package ru.acs.fts.aly.router.processing;

import ru.acs.fts.aly.router.errors.AlyErrors;
import ru.acs.fts.aly.router.model.AlyServiceHolder;
import ru.acs.fts.aly.router.objects.AlyEnvelope;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.model.services.ServiceHolder;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class AlyJobBatchContext extends JobBatchContext
{
	public AlyJobBatchContext( Configurator configurator, ServiceHolder serviceHolder ) // NO_UCD (use default)
	{
		super( configurator, serviceHolder, new AlyErrors( ) );
	}

	@Override
	public Object getSpecialField( String fieldName ) 
		throws DatabaseException
	{
		return null;
	}
	
	// @formatter:off
	@Override public AlyConfigurator getConfigurator( ) { return ( AlyConfigurator ) super.getConfigurator( ); }
	@Override public AlyServiceHolder getServiceHolder( ) { return ( AlyServiceHolder )super.getServiceHolder( ); }
	@Override public AlyEnvelope getReceivedEnvelope( ) { return ( AlyEnvelope )super.getReceivedEnvelope( ); }
	// @formatter:on
	
}
