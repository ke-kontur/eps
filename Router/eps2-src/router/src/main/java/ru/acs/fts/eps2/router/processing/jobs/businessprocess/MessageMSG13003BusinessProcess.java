package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDConfigurator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.EadRequest;
import ru.acs.fts.eps2.router.processing.ead.EadRequest2Results;
import ru.acs.fts.eps2.router.processing.ead.EadRequester;
import ru.acs.fts.eps2.router.processing.ead.EadResponse;
import ru.acs.fts.eps2.router.processing.ead.mappers.EadToManifestMapper;
import ru.acs.fts.eps2.router.processing.ead.mappers.EadToTransportMapper;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.schemas.album.reqinventorydoc.ReqInventoryDocType;
import ru.acs.fts.schemas.album.reqinventorydoc.RequestedDocType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

/**
 * Бизнес процесс обработки сообщения MSG.13003
 */
public class MessageMSG13003BusinessProcess extends BusinessProcess
{
	private Map< String, String > _messageTypeMappings;
	
	@Required
	public void setMessageTypeMappings( Map< String, String > messageTypeMappings ) { _messageTypeMappings = messageTypeMappings; }
	public Map< String, String > getMessageTypeMappings( ) { return _messageTypeMappings; }
			
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		ReqInventoryDocType document = recvEnv.getDocument( ).getDocumentAsClass( ReqInventoryDocType.class );
		
		processEadRequests( document, jobBatchContext, jobContext );
	}
	
	private void processEadRequests( 
			ReqInventoryDocType document, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDConfigurator configurator = jobBatchContext.getConfigurator( );
		String softVersion = configurator.getSoftVersion( );
		
		List< RequestedDocType > requestedLocal = new ArrayList< RequestedDocType >( );
		List< RequestedDocType > requestedForeign = new ArrayList< RequestedDocType >( );
		
		for ( RequestedDocType requestedDoc : document.getRequestedDocList( ) )
		{
			if ( isLocalEAD( requestedDoc, configurator ) )
				requestedLocal.add( requestedDoc );
			else
				requestedForeign.add( requestedDoc );
		}
		
		List< EadRequest > localRequests = convert( requestedLocal, softVersion ); 
		if ( requestedForeign.size( ) == 0 )
			localEadRequest( localRequests, jobBatchContext, jobContext );
		else
			foreignEadRequest( localRequests, convert( requestedForeign, softVersion ), jobBatchContext, jobContext );
	}

	private boolean isLocalEAD( RequestedDocType doc, EDConfigurator configurator )
	{
		return EadRequester.isLocalEAD( doc.getAarchID( ), doc.getArchDocID( ), configurator );
	}

	private List< EadRequest > convert( List< RequestedDocType > reqs, String softVersion )
	{
		List< EadRequest > requests = new ArrayList< EadRequest >( );
		
		for ( RequestedDocType reqDoc : reqs )
		{
			EadRequest req = new EadRequest( );
			req.setArchId( reqDoc.getAarchID( ) );
			req.setArchDocId( reqDoc.getArchDocID( ) );
			req.setLineId( reqDoc.getRequestPositionID( ) );
			req.setDocCode( reqDoc.getDocCode( ) );
			req.setSoftVersion( softVersion );
			
			requests.add( req );
		}		
		
		return requests;
	}
	
	private void localEadRequest( 
			List< EadRequest > localRequest, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EadRequest2Results results = new EadRequest2Results( );
		EadRequester.checkAndFetchEadDocuments( 
			localRequest, results, 
			false, _serviceHolder 
		);
		
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, envelopes );
		
		Map< EadRequest, EadResponse > mappings = results.getMappings( );
		
		String okMessageType = _messageTypeMappings.get( recvEnv.getMessageType( ) );
		
		for ( EadRequest request : mappings.keySet( ) )
		{
			EadResponse response = mappings.get( request );
			
			EDEnvelope respEnvelope = EadToTransportMapper.makeEnvelope( 
				request, response, 
				okMessageType, MessageType.CMN_00001, 
				recvEnv.getDocument( ).getDocumentID( ), 
				BusinessSystems.CUSTOMS, jobBatchContext 
			);
			
			if ( respEnvelope.getMessageType( ).equals( MessageType.MSG_15034 ) )
			{
				EnvelopeCreator.reRouteMessage( 
					respEnvelope, respEnvelope.getSenderCustoms( ), 
					BusinessSystems.ASKTT2, respEnvelope.getReceiverCustoms( ), 
					respEnvelope.getInitialEnvelopeID( ), 
					respEnvelope.getIncomeEnvelopeID( )
				);
			}
			
			envelopes.add( respEnvelope );
		}
	}
		
	private void foreignEadRequest( 			
			List< EadRequest > localRequests,
			List< EadRequest > foreignRequests,
			EDJobBatchContext jobBatchContext, JobContext jobContext )
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		/**
		 * Запрашиваем те документы, которые лежат в локальном архиве
		 */
		EadRequest2Results results = new EadRequest2Results( );
		EadRequester.checkAndFetchEadDocuments( localRequests, results, false, _serviceHolder );
		
		/**
		 * И сохраняем их в манифест, чтоб потом обработать
		 */
		results.persist( recvEnv.getEnvelopeID( ), recvEnv.getDocument( ).getDocumentID( ), _serviceHolder );
		
		/**
		 * Те документы, которые есть у нас в локальном ЭАДе мы сохранили в манифест
		 * и они там полежат пока мы не получим все остальные
		 * А теперь сформируем запрос к удаленному архиву
		 */
				
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, envelopes );				
		
		for ( EadRequest request : foreignRequests )
		{
			/**
			 * Сохраним в манифест запрос, ответа пока нет
			 */
			ExtEadManifest manifest = EadToManifestMapper.map2Manifest( recvEnv.getEnvelopeID( ), recvEnv.getDocument( ).getDocumentID( ), request );			
			_serviceHolder.getEdarchService( ).persist( manifest );

			EDEnvelope msg2Eps = EadToTransportMapper.makeAdm00009Envelope( request, jobBatchContext );
			if ( null != msg2Eps )
				envelopes.add( msg2Eps );
		}
	}		
	
}
