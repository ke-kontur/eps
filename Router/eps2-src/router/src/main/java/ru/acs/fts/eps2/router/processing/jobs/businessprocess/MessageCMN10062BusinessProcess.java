package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDDocument;
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
import ru.acs.fts.schemas.album.oez_inventory.InventDocumentType;
import ru.acs.fts.schemas.album.oez_inventory.OEZInventoryType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Бизнес процесс обработки сообщения CMN.10062
 * Опись документов, предоставляемых для вывоза товаров с территории ОЭЗ
 */
public class MessageCMN10062BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		OEZInventoryType doc = recvEnv.getDocument( ).getDocumentAsClass( OEZInventoryType.class ); 
		
		processEadRequests( doc, jobBatchContext, jobContext );
	}
	
	private void processEadRequests( 
			OEZInventoryType document,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDConfigurator configurator = jobBatchContext.getConfigurator( );
		String softVersion = configurator.getSoftVersion( );
		
		List< InventDocumentType > requestedLocal = new ArrayList< InventDocumentType >( );
		List< InventDocumentType > requestedForeign = new ArrayList< InventDocumentType >( );

		for ( InventDocumentType inventDoc : document.getInventDocumentList( ) )
		{
			if ( isLocalEAD( inventDoc, configurator ) )
				requestedLocal.add( inventDoc );
			else
				requestedForeign.add( inventDoc );
		}
		
		List< EadRequest > localRequests = convert( requestedLocal, softVersion );
		
		if ( requestedForeign.size( ) == 0 )
			localEadRequest( localRequests, document, jobBatchContext, jobContext );
		else
			foreignEadRequest( localRequests, convert( requestedForeign, softVersion ), jobBatchContext, jobContext );		
	}
	
	private boolean isLocalEAD( InventDocumentType doc, EDConfigurator configurator )
	{
		return EadRequester.isLocalEAD( doc.getArchID( ), doc.getArchDocID( ), configurator );
	}
	
	private List< EadRequest > convert( List< InventDocumentType > reqs, String softVersion )
	{
		List< EadRequest > requests = new ArrayList< EadRequest >( );
		
		for ( InventDocumentType reqDoc : reqs )
		{
			EadRequest request = new EadRequest( );
			request.setArchId( reqDoc.getArchID( ) );
			request.setArchDocId( reqDoc.getArchDocID( ) );
			request.setLineId( reqDoc.getInventLineID( ) );
			request.setDocCode( reqDoc.getInvDocCode( ) );
			request.setSoftVersion( softVersion );
			
			requests.add( request );
		}		
		
		return requests;
	}
	
	private void localEadRequest( 
			List< EadRequest > localRequest, OEZInventoryType reqInventoryDoc,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EadRequest2Results results = new EadRequest2Results( );
		EadRequester.checkAndFetchEadDocuments( 
			localRequest, results, 
			false, _serviceHolder 
		);

		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		Map< EadRequest, EadResponse > mappings = results.getMappings( );

		int totalRequests = mappings.keySet( ).size( );
		int successfulRequests = 0;
		for ( EadRequest request : mappings.keySet( ) )
		{
			EadResponse response = mappings.get( request );
			
			if ( ResultCodes.isOk( response.getResultCode( ) ) )
			{
				successfulRequests++;
			}
		}
		
		if ( totalRequests == successfulRequests )
		{
			EDEnvelope cmn10062 = EnvelopeCreator.createTranzitMessage( 
				null, recvEnv, 
				BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
			);
			
			envelopes.add( cmn10062 );
			
			EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
				MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
				BusinessSystems.DECLARANT, null 
			);
			
			CryptoHelper.signEnvelope( cmn00004, false );
			
			envelopes.add( cmn00004 );
		}
		else
		{
			EDDocument resDocument = EadToTransportMapper.createErrorDocument( results, recvEnv, _serviceHolder );
			
			EDEnvelope respEnvelope = EadToTransportMapper.makeEnvelope( 
				MessageType.CMN_00001, resDocument, 
				BusinessSystems.DECLARANT, jobBatchContext 
			);
			
			CryptoHelper.signEnvelope( respEnvelope, false );
			
			envelopes.add( respEnvelope );
			
			jobBatchContext.getProcedureChangeInformation( ).setNewProcedureState( null );
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

		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		for ( EadRequest request : foreignRequests )
		{
			/**
			 * Сохраним в манифест запрос, ответа пока нет
			 */
			ExtEadManifest manifest = EadToManifestMapper.map2Manifest( recvEnv.getEnvelopeID( ), recvEnv.getDocument( ).getDocumentID( ), request );			
			_serviceHolder.getEdarchService( ).persist( manifest );

			EDEnvelope msg2Eps = EadToTransportMapper.makeAdm00009Envelope( request, jobBatchContext );
			
			CryptoHelper.signEnvelope( msg2Eps, false );
			
			if ( null != msg2Eps )
				envelopes.add( msg2Eps );
		}
	}		
}
