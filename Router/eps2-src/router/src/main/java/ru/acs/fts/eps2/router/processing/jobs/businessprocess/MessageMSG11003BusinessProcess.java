package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.Edecl_Reqdoc_Info;
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
import ru.acs.fts.eps2.router.processing.helpers.Msg11003Helper;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.album.reqinventorydoc.ReqInventoryDocType;
import ru.acs.fts.schemas.album.reqinventorydoc.RequestedDocType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Бизнес процесс обработки сообщения MSG.11003
 * Требование на представление электронных документов, указанных в Описи
 */
public class MessageMSG11003BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		ReqInventoryDocType document = recvEnv.getDocument( ).getDocumentAsClass( ReqInventoryDocType.class );
		
		persistReqDocInfos( document, jobBatchContext, jobContext );
		processEadRequests( document, jobBatchContext, jobContext );
	}
	
	private void persistReqDocInfos( 
			ReqInventoryDocType document, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String envelopeId = recvEnv.getEnvelopeID( );
		String processId = recvEnv.getProcessID( );
		
		int flags = 0;
		
		Edecl_Proc_Information procInfo = jobBatchContext
			.getServiceHolder( ).getProcedureService( ).getProcInformation( processId );
		if ( null != procInfo && 
			 ( procInfo.getFlags( ) & Edecl_Proc_Information.FLAG_PROC_ISSUED ) == Edecl_Proc_Information.FLAG_PROC_ISSUED )
		{
			flags |= Edecl_Reqdoc_Info.FLAG_ALLOWED_AFTER_ISSUE;
		}
		
		for ( RequestedDocType rdoc : document.getRequestedDocList( ) )
		{
			Edecl_Reqdoc_Info rdocInfo = new Edecl_Reqdoc_Info( );
			rdocInfo.setEnvelopeId( envelopeId );
			rdocInfo.setReqDocId( document.getDocumentID( ) );
			rdocInfo.setPositionId( rdoc.getRequestPositionID( ) );
			rdocInfo.setDocCode( rdoc.getDocCode( ) );
			rdocInfo.setDocName( rdoc.getPrDocumentName( ) );
			rdocInfo.setFlags( flags );
			
			_serviceHolder.getEnvelopeService( ).persist( rdocInfo );
		}
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
			localEadRequest( localRequests, document, jobBatchContext, jobContext );
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
			EadRequest request = new EadRequest( );
			request.setArchId( reqDoc.getAarchID( ) );
			request.setArchDocId( reqDoc.getArchDocID( ) );
			request.setLineId( reqDoc.getRequestPositionID( ) );
			request.setDocCode( reqDoc.getDocCode( ) );
			request.setSoftVersion( softVersion );
			
			requests.add( request );
		}		
		
		return requests;
	}
	
	private void localEadRequest( 
			List< EadRequest > localRequest, ReqInventoryDocType reqInventoryDoc,
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
		
		List< String > failedLineIds = new ArrayList< String >( );
		Map< EadRequest, EadResponse > mappings = results.getMappings( );
		
		for ( EadRequest request : mappings.keySet( ) )
		{
			EadResponse response = mappings.get( request );
			
			if ( ResultCodes.isOk( response.getResultCode( ) ) &&
				 Msg11003Helper.g44Check( request.getDocCode( ), response.getDocumentModeId( ), jobBatchContext ) )
			{
				EDEnvelope respEnvelope = EadToTransportMapper.makeEnvelope( 
					request, response, 
					MessageType.MSG_11004, MessageType.CMN_00001, 
					reqInventoryDoc.getDocumentID( ), 
					BusinessSystems.CUSTOMS, jobBatchContext 
				);
				
				/**
				 * Сбрасываем Income, т.к. не должно его быть - мы документ нашли в ЭАДе 
				 * и декларанта не спрашивали
				 */
				respEnvelope.setIncomeEnvelopeID( null );
				
				envelopes.add( respEnvelope );
			}
			else
			{
				failedLineIds.add( request.getLineId( ) );
			}
		}
		
		if ( failedLineIds.size( ) > 0 )
		{
			EDEnvelope msg2Decl = Msg11003Helper.makeEd11003( reqInventoryDoc, failedLineIds, jobBatchContext );
			if ( null != msg2Decl )
				envelopes.add( msg2Decl );
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
