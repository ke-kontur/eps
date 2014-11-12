package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.CustomsType;

/**
 * <p>
 * JobContext:<p>
 * <b>envelopes</b> - имя списка конвертов
 */
public class TransitKastoToKastoBusinessProcess extends BusinessProcess
{
	private static final Logger log = LoggerFactory.getLogger( TransitKastoToKastoBusinessProcess.class );
	
	private static final String NOTIF_NAME = "response";
	
	private static final String NOTIF_ADM_NAME = "responseAdm";

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
		
		boolean isSenderLocal = isCustomsLocal( recvEnv.getSenderCustoms( ) );
		boolean isReceiverLocal = isCustomsLocal( recvEnv.getReceiverCustoms( ) );
		
		if ( isLocal( isSenderLocal, isReceiverLocal ) )
		{
			envelopes.add( prepareTransitToLocal( jobBatchContext, recvEnv ) );
			envelopes.add( prepareNotification( jobBatchContext, recvEnv ) );
		}
		else if ( isToRemote( isSenderLocal, isReceiverLocal ) )
		{
			envelopes.add( prepareTransitToRemote( jobBatchContext, recvEnv ) );
		}
		else if ( isFromRemote( isSenderLocal, isReceiverLocal ) )
		{
			envelopes.add( prepareTransitToLocal( jobBatchContext, recvEnv ) );
			envelopes.add( prepareNotificationAdm( jobBatchContext ) );
		}
		else
		{
			log.error( "ТО, участвующие в обмене, не являются локальными для данной инсталляции ЭПС: {} и {}.", 
				recvEnv.getSenderCustoms( ), recvEnv.getReceiverCustoms( ) 
			);
		}
		
		String envelopesName = jobContext.getString( ContextConstants.ENVELOPES );
		jobBatchContext.put( envelopesName, envelopes );
	}
	
	private EDEnvelope prepareTransitToLocal( EDJobBatchContext jobBatchContext, EDEnvelope recvEnv ) 
		throws BaseProcessingException, DatabaseException
	{
		EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( )
		);
		
		return transit;
	}
	
	private EDEnvelope prepareTransitToRemote( EDJobBatchContext jobBatchContext, EDEnvelope recvEnv ) 
		throws BaseProcessingException, DatabaseException
	{
		EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.EPS, recvEnv.getReceiverCustoms( )
		);
		
		return transit;
	}
	
	private EDEnvelope prepareNotification( EDJobBatchContext jobBatchContext, EDEnvelope recvEnv ) 
		throws ResultTypeException
	{
		EDEnvelope notif = ( EDEnvelope )jobBatchContext.get( NOTIF_NAME );		
		return notif;
	}
	
	private EDEnvelope prepareNotificationAdm( EDJobBatchContext jobBatchContext )
	{
		EDEnvelope adm = ( EDEnvelope )jobBatchContext.get( NOTIF_ADM_NAME );

		adm.setRecipientSystem( BusinessSystems.EPS );
		
		return adm;
	}
	
	private boolean isLocal( boolean isSenderLocal, boolean isReceiverLocal )
	{
		return isSenderLocal && isReceiverLocal;
	}
	
	private boolean isToRemote( boolean isSenderLocal, boolean isReceiverLocal )
	{
		return isSenderLocal && ! isReceiverLocal;
	}
	
	private boolean isFromRemote( boolean isSenderLocal, boolean isReceiverLocal )
	{
		return ! isSenderLocal && isReceiverLocal;
	}
	
	private boolean isCustomsLocal( CustomsType customs )
	{
		return RemotenessHelper.isCustomsLocal( customs.getCustomsCode( ) );
	}
}
