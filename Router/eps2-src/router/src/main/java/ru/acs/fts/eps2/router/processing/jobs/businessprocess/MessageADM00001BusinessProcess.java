package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.EadRemoting;
import ru.acs.fts.eps2.router.processing.ead.processing.ManifestCompletedProcessor;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.result.ResponseType;
import ru.acs.fts.schemas.album.result.ResultInformationType;
import ru.acs.fts.schemas.album.result.ResultType;
import ru.acs.fts.schemas.envelope.CustomsType;
import ru.acs.fts.schemas.envelope.EnvelopeType;

public class MessageADM00001BusinessProcess extends BusinessProcess
{
	private List< String > _remoteEadMessageTypes;
	private Map< String, ManifestCompletedProcessor > _manifestProcessors;
	
	@Required
	public void setRemoteEadMessageTypes( List< String > remoteEadMessageTypes ) { _remoteEadMessageTypes = remoteEadMessageTypes; }
	public List< String > getRemoteEadMessageTypes( ) { return _remoteEadMessageTypes; }
	
	@Required
	public void setManifestProcessors( Map< String, ManifestCompletedProcessor > manifestProcessors ) { _manifestProcessors = manifestProcessors; }
	public Map< String, ManifestCompletedProcessor > getManifestProcessors( ) { return _manifestProcessors; }
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		eadProcessing( jobBatchContext, jobContext );
		
		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		if ( ! StringUtil.isNullOrEmpty( envelopeName ) )
		{
			Object obj = jobBatchContext.get( envelopeName );
			if ( null == obj )
			{
				List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
				jobBatchContext.put( envelopeName, envelopes );
				
				Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
				messageTypeSubstituion.put( MessageType.ADM_00001, MessageType.CMN_00001 );
				
				EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
				Edecl_Messages incomeMsg = jobBatchContext.getIncomeMessage( );
				
				if ( null != incomeMsg )
				{
					EDEnvelope cmn00001 = EnvelopeCreator.createTranzitMessage( 
						messageTypeSubstituion, recvEnv, 
						BusinessSystems.EPS, recvEnv.getReceiverCustoms( ) 
					);
					
					cmn00001.setDocument( CryptoHelper.removeSignature( cmn00001 ) );
					envelopes.add( cmn00001 );
					
					if ( null != incomeMsg.getSenderCustomCode( ) )
					{
						// отправляем в ТО
						CustomsType receiverCustoms = new CustomsType( );
						receiverCustoms.setCustomsCode( incomeMsg.getSenderCustomCode( ).toString( ) );
						receiverCustoms.setExchType( incomeMsg.getSenderExchangeType( ).toString( ) );
	
						EnvelopeCreator.reRouteMessage( 
							cmn00001, cmn00001.getSenderCustoms( ), 
							BusinessSystems.CUSTOMS, receiverCustoms, 
							cmn00001.getInitialEnvelopeID( ), 
							cmn00001.getIncomeEnvelopeID( )
						);			
					}
					else
					{
						// отправляем декларанту			
						EnvelopeCreator.reRouteMessage( 
							cmn00001, cmn00001.getSenderCustoms( ), 
							BusinessSystems.DECLARANT, null, 
							cmn00001.getInitialEnvelopeID( ), 
							cmn00001.getIncomeEnvelopeID( )
						);
					}			
				}
			}
		}
	}
	
	private void eadProcessing( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String initialEnvelopeId = recvEnv.getInitialEnvelopeID( );
		if ( StringUtil.isNullOrEmpty( initialEnvelopeId ) )
			return ;
		
		String incomeEnvelopeId = _serviceHolder.getEnvelopeService( ).getIncomeEnvelopeIdByInitialEnvelopeId( initialEnvelopeId );
		if ( StringUtil.isNullOrEmpty( incomeEnvelopeId ) )
			return ;
		
		Edecl_Messages reqEnv = _serviceHolder.getEnvelopeService( ).getEnvelope( incomeEnvelopeId );
		if ( null == reqEnv )
			return ;
		
		/**
		 * Проверяем, не ответ ли это на запрос по удаленному ЭАДу
		 */
		for ( String msgType : _remoteEadMessageTypes )
		{
			if ( msgType.equalsIgnoreCase( reqEnv.getMessageType( ) ) )
			{
				processEadResponse( jobBatchContext, jobContext );
				break;
			}
		}		
	}
	
	private void processEadResponse( EDJobBatchContext jobBatchContext, JobContext jobContext )
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		ResultType doc = recvEnv.getDocument( ).getDocumentAsClass( ResultType.class );
		ResponseType resp = doc.getResponseList( ).get( 0 );
		ResultInformationType respInfo = resp.getResultInformationList( ).get( 0 );
		
		String reqEnvelopeId = _serviceHolder.getEnvelopeService( )
			.getIncomeEnvelopeIdByInitialEnvelopeId( recvEnv.getInitialEnvelopeID( ) );
		
		List< ExtEadManifest > manifests = _serviceHolder.getEdarchService( )
			.getExternalEadManifests( reqEnvelopeId );
		
		String reqPosition = respInfo.getRefLineID( ); 
		
		for ( ExtEadManifest mf : manifests )
		{
			if ( mf.getRequestLineId( ).equalsIgnoreCase( reqPosition ) )
			{				
				mf.setStatus( ExtEadManifest.STATUS_FAILED );
				mf.setResultCode( respInfo.getResultCode( ) );
				
				_serviceHolder.getEdarchService( ).merge( mf );
			}
		}
		
		EadRemoting.processManifests( manifests, _manifestProcessors, jobBatchContext, jobContext );
	}
}
