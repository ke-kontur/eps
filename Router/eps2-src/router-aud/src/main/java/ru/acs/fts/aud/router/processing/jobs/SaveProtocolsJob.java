package ru.acs.fts.aud.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.router.model.managers.ProtocolManager;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.helpers.ProtocolInfo;
import ru.acs.fts.eps2.engine.processing.JobContext;

/**
 * (mrdekk)
 * Проверено. Замечаний нет 
 */
public class SaveProtocolsJob extends AudJob
{
	private static final Logger log = LoggerFactory.getLogger( SaveProtocolsJob.class );
	
	private ProtocolManager _protocolManager;
	
	// @formatter:off
	@Required
	public void setProtocolManager( ProtocolManager protocolManager ) { _protocolManager = protocolManager; }
	public ProtocolManager getProtocolManager( ) { return _protocolManager; }
	// @formatter:on
	
	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		for ( ProtocolInfo protocol : jobBatchContext.getStashedProtocols( ) )
		{
			_protocolManager.saveProtocol( protocol.getProtocolItem( ), protocol.getProtocolCode( ), protocol.getParams( ) );
		}
		
		jobBatchContext.clearStashedProtocols( );
		
		log.info( "Протоколы сохранены в БД." );
	}

	@Override
	public String getAction( )
	{
		return "Сохраняю протоколы в БД.";
	}
}
