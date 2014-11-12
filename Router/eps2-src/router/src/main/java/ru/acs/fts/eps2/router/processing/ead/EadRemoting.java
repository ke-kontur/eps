package ru.acs.fts.eps2.router.processing.ead;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.model.services.EdarchService;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.processing.ManifestCompletedProcessor;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.EnvelopeType;

public class EadRemoting
{
	private static final Logger log = LoggerFactory.getLogger( EadRemoting.class );

	public static void processManifests(
			List< ExtEadManifest > manifests_,
			Map< String, ManifestCompletedProcessor > processors,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws DatabaseException, BaseProcessingException
	{
		if ( null == manifests_ || 0 == manifests_.size( ) )
			return ;
		
		String envelopeId = manifests_.get( 0 ).getRequestEnvelopeId( );
		
		EdarchService edarchService = jobBatchContext.getServiceHolder( ).getEdarchService( );
		
		// List< ExtEadManifest > manifests = edarchService.getExternalEadManifestsSynchronized( envelopeId );
		List< ExtEadManifest > manifests = manifests_;
		
		int manifestsCount = manifests.size( );
		int manifestsCompleted = 0;
		int manifestsFailed = 0;
		
		StringBuilder bld = new StringBuilder( );
		bld.append( "envId: " ); bld.append( envelopeId ); bld.append( " " );
		
		for ( ExtEadManifest mf : manifests )
		{
			Integer st = mf.getStatus( );
			if ( null != st )
			{
				int status = st.intValue( );
				switch ( status )
				{
					case ExtEadManifest.STATUS_RECEIVED: manifestsCompleted++; break;
					case ExtEadManifest.STATUS_FAILED: manifestsFailed++; break;
				}
			}
			
			bld.append( "st: " ); bld.append( ( null != st ) ? st.intValue( ) : "(null)" );
		}
		
		log.info( bld.toString( ) );
		
		if ( ( manifestsCompleted + manifestsFailed == manifestsCount ) )
		{
			EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
			Edecl_Messages incomeEnvelope = jobBatchContext.getIncomeMessage( );
			if ( null == incomeEnvelope )
				return ;
			
			ManifestCompletedProcessor processor = processors.get( incomeEnvelope.getMessageType( ) );
			if ( null != processor )
				processor.process( manifests, jobBatchContext, jobContext );
			
			for ( ExtEadManifest mf : manifests )
			{
				log.info( String.format(
					"%s: Удаляем манифест EnvelopeID: %s, RequestLine: %s", 
					recvEnv.getMessageType( ), mf.getRequestEnvelopeId( ), mf.getRequestLineId( )
				) );
				
				edarchService.remove( mf );
			}
		}	
		else
		{
			List< EnvelopeType > envelopes = new ArrayList< EnvelopeType >( );
			if ( jobContext.contains( ContextConstants.ENVELOPE_NAME ) )
				jobBatchContext.put( jobContext.getString( ContextConstants.ENVELOPE_NAME ), envelopes );
			if ( jobContext.contains( ContextConstants.ENVELOPES ) )
				jobBatchContext.put( jobContext.getString( ContextConstants.ENVELOPES ), envelopes );
			if ( jobContext.contains( ContextConstants.ENVELOPES_UNSIGNED ) )
				jobBatchContext.put( jobContext.getString( ContextConstants.ENVELOPES_UNSIGNED ), envelopes );
		}
	}	
}
