package ru.acs.fts.aud.router.processing;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.aud.router.errors.AudErrors;
import ru.acs.fts.aud.router.model.AudServiceHolder;
import ru.acs.fts.aud.router.model.ServerStatisticsBundle;
import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.exceptions.BaseAudException;
import ru.acs.fts.aud.router.processing.helpers.ProtocolInfo;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.model.services.ServiceHolder;

public class AudJobBatchContext extends JobBatchContext
{
	private List< ProtocolInfo > _protocolsToSave = new ArrayList< ProtocolInfo >( );

	private ServerStatisticsBundle _serverStatistics = new ServerStatisticsBundle( );
	
	public AudJobBatchContext( Configurator configurator, ServiceHolder serviceHolder ) // NO_UCD (use default)
	{
		super( configurator, serviceHolder, new AudErrors( ) );
	}
	
	@Override
	public AudConfigurator getConfigurator( )
	{
		return ( AudConfigurator ) super.getConfigurator( );
	}
	
	@Override
	public AudServiceHolder getServiceHolder( )
	{
		return ( AudServiceHolder )super.getServiceHolder( );
	}
	
	@Override
	public AudEnvelope getReceivedEnvelope( ) 
	{ 
		return ( AudEnvelope )super.getReceivedEnvelope( ); 
	}
	
	@Override 
	public BaseAudException getContextException( ) 
	{
		return ( BaseAudException ) super.getContextException( );
	}
	
	public void stashProtocol( ProtocolInfo protocolInfo ) { 
		if ( null != protocolInfo )
			_protocolsToSave.add( protocolInfo );
	}
	
	public List< ProtocolInfo > getStashedProtocols( )
	{
		return _protocolsToSave;
	}	
	
	public void clearStashedProtocols( )
	{
		if ( null != _protocolsToSave ) 
			_protocolsToSave.clear( );
	}
	
	public ServerStatisticsBundle getServerStatistics( )
	{
		return _serverStatistics;
	}

	@Override
	public Object getSpecialField( String fieldName )
	{
		return null;
	}
}
