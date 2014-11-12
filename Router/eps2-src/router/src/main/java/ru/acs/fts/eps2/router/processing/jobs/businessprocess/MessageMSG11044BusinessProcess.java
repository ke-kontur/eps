package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
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
import ru.acs.fts.eps2.router.processing.helpers.Msg11044Helper;
import ru.acs.fts.schemas.album.checkinventory.CheckInventoryType;
import ru.acs.fts.schemas.album.checkinventory.InventDocumentType;
import ru.acs.fts.schemas.album.checkinventory.InventoryInstanceType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Бизнес процесс обработки сообщения MSG.11044
 * Запрос на сверку описи в ЭАД
 */
public class MessageMSG11044BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		CheckInventoryType document = recvEnv.getDocument( ).getDocumentAsClass( CheckInventoryType.class );
		
		processEadRequests( document, jobBatchContext, jobContext );
	}
	
	private void processEadRequests( 
			CheckInventoryType document,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDConfigurator configurator = jobBatchContext.getConfigurator( );
		String softVersion = configurator.getSoftVersion( );
		
		List< InventDocumentType > requestedLocal = new ArrayList< InventDocumentType >( );
		List< InventDocumentType > requestedForeign = new ArrayList< InventDocumentType >( );

		InventoryInstanceType invInstance = document.getInventoryInstance( );
		for ( InventDocumentType idoc : invInstance.getInventDocumentList( ) )
		{
			if ( isLocalEAD( idoc, configurator ) )
				requestedLocal.add( idoc );
			else
				requestedForeign.add( idoc );
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
			List< EadRequest > localRequest, CheckInventoryType checkInventory,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EadRequest2Results results = new EadRequest2Results( );
		EadRequester.checkAndFetchEadDocuments( 
			localRequest, results, 
			false, _serviceHolder 
		);
		
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, envelopes );
		
		Map< EadRequest, EadResponse > mappings = results.getMappings( );
		
		boolean isAllFailed = true;
		
		for ( EadRequest request : mappings.keySet( ) )
		{
			EadResponse response = mappings.get( request );
			
			if ( ResultCodes.isOk( response.getResultCode( ) ) )
				isAllFailed = false;
		}

		if ( isAllFailed )
		{
			EDDocument res = EadToTransportMapper.createErrorDocument( results, jobBatchContext.getReceivedEnvelope( ), _serviceHolder );
				
			EDEnvelope respEnvelope = EadToTransportMapper.makeEnvelope( 
				MessageType.CMN_00001, res, 
				BusinessSystems.CUSTOMS, jobBatchContext 
			);
										
			envelopes.add( respEnvelope );
					
			return ;			
		}
		
		EDEnvelope respEnvelope = Msg11044Helper.makeMsg11045( checkInventory, results, jobBatchContext );
		
		envelopes.add( respEnvelope );
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
