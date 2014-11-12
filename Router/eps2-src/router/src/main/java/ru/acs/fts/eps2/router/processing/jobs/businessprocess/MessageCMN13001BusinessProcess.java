package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.ArchiveDocumentStatuses;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs;
import ru.acs.fts.eps2.model.entities.Edarch_Reqinfo;
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
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.album.whdocinventory.InventDocumentType;
import ru.acs.fts.schemas.album.whdocinventory.WHDocInventoryType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Бизнес процесс обработки сообщения CMN.13001
 */
public class MessageCMN13001BusinessProcess extends BusinessProcess
{

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		WHDocInventoryType whDocInventory = recvEnv.getDocument( ).getDocumentAsClass( WHDocInventoryType.class );
		
		processEadRequests( whDocInventory, jobBatchContext, jobContext );		
	}
	
	private void processEadRequests( 
			WHDocInventoryType document, 
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

		setRequiredStatuses( results, recvEnv );
		
		EDEnvelope cmn13001 = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
		);
		
		envelopes.add( cmn13001 );
		
		EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
			MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
			BusinessSystems.DECLARANT, null 
		);
		
		CryptoHelper.signEnvelope( cmn00004, false );
		
		envelopes.add( cmn00004 );		
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
	
	private void setRequiredStatuses( EadRequest2Results results, EDEnvelope recvEnv ) 
		throws DatabaseException
	{
		Map< EadRequest, EadResponse > mappings = results.getMappings( );		
		
		for ( EadRequest request : mappings.keySet( ) )
		{
			Edarch_Archive_Docs docInformation = _serviceHolder.getEdarchService( )
				.getDocument( request.getArchId( ), request.getArchDocId( ) );

			docInformation.setArdocStageStatus( ArchiveDocumentStatuses.DOC_NEW_ACTUAL );
			_serviceHolder.getEdarchService( ).merge( docInformation );

			Edarch_Reqinfo reqinfo = new Edarch_Reqinfo( );
			reqinfo.setReqEnvId( recvEnv.getEnvelopeID( ) );
			reqinfo.setReqDocId( recvEnv.getDocument( ).getDocumentID( ) );
			reqinfo.setIdInternal( docInformation.getArdocArchIdinternal( ) );
			reqinfo.setArdocIdInternal( docInformation.getArdocIdinternal( ) );
			_serviceHolder.getEdarchService( ).merge( reqinfo );
		}		
	}
		
}
