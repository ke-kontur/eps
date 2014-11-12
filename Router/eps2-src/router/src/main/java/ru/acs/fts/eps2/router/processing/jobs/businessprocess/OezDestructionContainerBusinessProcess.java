package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
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
import ru.acs.fts.eps2.router.processing.ead.processing.OezDestructionContainerManifestCompletedProcessor;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.schemas.album.inventory.InventDocumentType;
import ru.acs.fts.schemas.album.inventory.InventoryType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Бизнес процесс обработки сообщений CMN.10070, CMN.10071, CMN.10075, CMN.10076
 */
public class OezDestructionContainerBusinessProcess extends BusinessProcess
{
	private static final String CMN_00004_NAME = "cmn00004";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		InventoryType inventory = recvEnv.getDocument( )
			.getDocumentInContainer( InventoryType.class )
			.getDocumentAsClass( InventoryType.class );
				
		processEadRequests( inventory, jobBatchContext, jobContext );		
	}
	
	private void processEadRequests( 
			InventoryType document, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDConfigurator configurator = jobBatchContext.getConfigurator( );
		String softVersion = configurator.getSoftVersion( );
		
		List< InventDocumentType > requestedLocal = new ArrayList< InventDocumentType >( );
		List< InventDocumentType > requestedForeign = new ArrayList< InventDocumentType >( );
		
		for ( InventDocumentType inventDoc : document.getInventoryInstance( ).getInventDocumentList( ) )
		{
			if ( isLocalEAD( inventDoc, configurator ) )
				requestedLocal.add( inventDoc );
			else
				requestedForeign.add( inventDoc );
		}
		
		List< EadRequest > localRequests = convert( requestedLocal, softVersion ); 
		if ( requestedForeign.size( ) == 0 )
			localEadRequest( localRequests, jobBatchContext, jobContext );
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
			EadRequest req = new EadRequest( );
			req.setArchId( reqDoc.getArchID( ) );
			req.setArchDocId( reqDoc.getArchDocID( ) );
			req.setLineId( reqDoc.getInventLineID( ) );
			req.setDocCode( reqDoc.getInvDocCode( ) );
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
		/** 
		 * Ложим пустой список запросов к внешнему ЭАДу т.к. у нас таких запросов нет
		 * а батч требует
		 */
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		List< EDEnvelope > envelopesUnsigned = createAndPutEnvelopesUnsigned( jobBatchContext, jobContext );
		
		/**
		 * Работаем
		 */
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EadRequest2Results results = new EadRequest2Results( );
		EadRequester.checkAndFetchEadDocuments( 
			localRequest, results, 
			false, _serviceHolder 
		);
				
		if ( ! isAllDocumentsFound( localRequest, results ) )
		{
			EDDocument resDocument = EadToTransportMapper.createErrorDocument( results, recvEnv, _serviceHolder );
 
			EDEnvelope respEnvelope = EadToTransportMapper.makeEnvelope( 
				MessageType.CMN_00001, resDocument, 
				BusinessSystems.DECLARANT, jobBatchContext 
			);
			
			envelopesUnsigned.add( respEnvelope );
			
			return ;
		}

		EDEnvelope tranzit = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
		);
		
		envelopes.add( tranzit );
		
		String cmn00004Name = jobContext.getString( CMN_00004_NAME );
		EDEnvelope cmn00004 = ( EDEnvelope )jobBatchContext.get( cmn00004Name );
		envelopes.add( cmn00004 );
				
		cmn00004.setRecipientSystem( BusinessSystems.DECLARANT );
		
		try
		{
			OezDestructionContainerManifestCompletedProcessor.changeProcessState( recvEnv.getMessageType( ), jobBatchContext, jobContext );
			OezDestructionContainerManifestCompletedProcessor.updateProcessState( jobBatchContext, jobContext );
		}
		catch ( Exception exc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._02_00000_01, 
				ProcessingConstants.ERROR_TYPE_DATA 
			);
		}			
	}	
	
	private void foreignEadRequest( 			
			List< EadRequest > localRequests,
			List< EadRequest > foreignRequests,
			EDJobBatchContext jobBatchContext, JobContext jobContext )
		throws Exception
	{
		/* List< EnvelopeType > envelopes = */ createAndPutEnvelopes( jobBatchContext, jobContext );
		List< EDEnvelope > envelopesUnsigned = createAndPutEnvelopesUnsigned( jobBatchContext, jobContext );
		
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
						
		for ( EadRequest request : foreignRequests )
		{
			/**
			 * Сохраним в манифест запрос, ответа пока нет
			 */
			ExtEadManifest manifest = EadToManifestMapper.map2Manifest( recvEnv.getEnvelopeID( ), recvEnv.getDocument( ).getDocumentID( ), request );			
			_serviceHolder.getEdarchService( ).persist( manifest );

			EDEnvelope msg2Eps = EadToTransportMapper.makeAdm00011Envelope( request, jobBatchContext );
			if ( null != msg2Eps )
				envelopesUnsigned.add( msg2Eps );
		}
	}			
	
	private boolean isAllDocumentsFound( List< EadRequest > localRequest, EadRequest2Results results )
	{
		Map< EadRequest, EadResponse > mappings = results.getMappings( );
		
		int requestCount = localRequest.size( );
		int foundCount = 0;
		
		for ( EadRequest request : mappings.keySet( ) )
		{
			EadResponse response = mappings.get( request );
			if ( ResultCodes.isOk( response.getResultCode( ) ) )
				foundCount++;
		}
		
		return foundCount == requestCount;
	}		
}
