package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edarch_Read_Access;
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
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.whdocinventory.InventDocumentType;
import ru.acs.fts.schemas.album.whdocinventory.WHDocInventoryType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Бизнес процесс для обработки сообщений CMN.13005
 * ( Перечень электронных документов )
 */
public class MessageCMN13005BusinessProcess extends BusinessProcess
{
	protected final Logger log = LoggerFactory.getLogger( MessageCMN13005BusinessProcess.class );

	private static final String CMN_00004_NAME = "cmn00004";

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
			localEadRequest( localRequests, document, jobBatchContext, jobContext );
		else
			foreignEadRequest( localRequests, convert( requestedForeign, softVersion ), document, jobBatchContext, jobContext );
	}		
	
	private boolean isLocalEAD( InventDocumentType doc, EDConfigurator configurator )
	{
		return EadRequester.isLocalEAD( doc.getArchID( ), doc.getArchDocID( ), configurator );
	}
	
	private boolean isLocalEAD( EadRequest req, EDConfigurator configurator )
	{
		return EadRequester.isLocalEAD( req.getArchId( ), req.getArchDocId( ), configurator );
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
			List< EadRequest > localRequest, WHDocInventoryType document, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		/** 
		 * Ложим пустой список запросов к внешнему ЭАДу т.к. у нас таких запросов нет
		 * а батч требует
		 */
		List< EDEnvelope > envelopesUnsigned = createAndPutEnvelopesUnsigned( jobBatchContext, jobContext ); 
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		/**
		 * Работаем
		 */

		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EadRequest2Results results = new EadRequest2Results( );
		EadRequester.checkAndFetchEadDocuments( 
			localRequest, results, 
			false, _serviceHolder 
		);
		
		checkRequestInformation( results, document, jobBatchContext, jobContext );
				
		if ( ! isAllDocumentsOk( localRequest, results ) )
		{
			EDDocument resDocument = EadToTransportMapper.createErrorDocument( results, recvEnv, _serviceHolder );
 
			EDEnvelope respEnvelope = EadToTransportMapper.makeEnvelope( 
				MessageType.CMN_00001, resDocument, 
				BusinessSystems.CUSTOMS, jobBatchContext 
			);
			
			envelopesUnsigned.add( respEnvelope );
			
			return ;
		}

		setRequiredStatuses( results, recvEnv );
		
		EDEnvelope cmn13005 = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.DECLARANT, null 
		);
		
		envelopes.add( cmn13005 );
		
		String cmn00004Name = jobContext.getString( CMN_00004_NAME );
		EDEnvelope cmn00004 = ( EDEnvelope )jobBatchContext.get( cmn00004Name );
		envelopes.add( cmn00004 );
		
		cmn00004.setRecipientSystem( BusinessSystems.CUSTOMS );
	}		
	
	private void foreignEadRequest( 			
			List< EadRequest > localRequests, List< EadRequest > foreignRequests,
			WHDocInventoryType document,
			EDJobBatchContext jobBatchContext, JobContext jobContext )
		throws Exception
	{
		List< EDEnvelope > envelopesUnsigned = createAndPutEnvelopesUnsigned( jobBatchContext, jobContext );
		/* List< EnvelopeType > envelopes = */ createAndPutEnvelopes( jobBatchContext, jobContext );
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		/**
		 * Запрашиваем те документы, которые лежат в локальном архиве
		 */
		EadRequest2Results results = new EadRequest2Results( );
		EadRequester.checkAndFetchEadDocuments( localRequests, results, false, _serviceHolder );
		
		checkRequestInformation( results, document, jobBatchContext, jobContext );
		
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
	
	private void checkRequestInformation(
			EadRequest2Results results, WHDocInventoryType document, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws DatabaseException
	{
		Map< EadRequest, EadResponse > mappings = results.getMappings( );
		
		GTDIDType gtd = document.getRegNumberDoc( );
		String gtdNumber = gtd.getGTDNumber( );
		String customCode = gtd.getCustomsCode( );
		Date regDate = ( gtd.getRegistrationDate( ) == null ) ? null : gtd.getRegistrationDate( ).toDate( );
		
		for ( EadRequest request : mappings.keySet( ) )
		{
			EadResponse response = mappings.get( request );
			if ( ! ResultCodes.isOk( response.getResultCode( ) ) )
				continue;
			if ( ! isLocalEAD( request, jobBatchContext.getConfigurator( ) ) )
				continue;
			
			List< Edarch_Reqinfo > requestInfos = _serviceHolder.getEdarchService( )
				.getReqInfosByArchIdAndDocId( request.getArchId( ), request.getArchDocId( ) );
			
			if ( null == requestInfos || 0 == requestInfos.size( ) )
			{
				response.setResultCode( ResultCodes._03_00106_03 );
				break;
			}
			
			boolean propertRequestFound = false;
			
			for ( Edarch_Reqinfo reqInfo : requestInfos )
			{
				if ( null == reqInfo.getSvhRegNumberCustCode( ) && null != customCode )
				{
					log.debug( "reqInfo.getSvhRegNumberCustCode == null && gtd.getCustomsCode != null" );
					continue;
				}
				else if ( ! reqInfo.getSvhRegNumberCustCode( ).equalsIgnoreCase( customCode ) )
				{
					log.debug( "reqInfo.getSvhRegNumberCustCode != gtd.getCustomsCode" );
					continue;
				}
				
				if ( null == reqInfo.getSvhRegNumberDate( ) && null != regDate )
				{
					log.debug( "reqInfo.getSvhRegNumberDate == null && gtd.getRegistrationDate != null" );
					continue;
				}
				else if ( ! reqInfo.getSvhRegNumberDate( ).equals( regDate ) )
				{
					log.debug( "reqInfo.getSvhRegNumberDate != gtd.getRegistrationDate" );
					continue;
				}
				
				if ( null == reqInfo.getSvhRegNumberNumber( ) && null != gtdNumber )
				{
					log.debug( "reqInfo.getSvhRegNumberNumber == null && gtd.gtdGTDNumber != null" );
					continue;
				}
				else if ( ! reqInfo.getSvhRegNumberNumber( ).equals( gtdNumber ) )
				{
					log.debug( "reqInfo.getSvhRegNumberNumber != gtd.getGTDNumber" );
					continue;
				}

				propertRequestFound = true;
				break;
			}
			
			if ( ! propertRequestFound )
			{
				response.setResultCode( ResultCodes._03_00106_03 );
			}
		}				 
	}
	
	private boolean isAllDocumentsOk( List< EadRequest > localRequest, EadRequest2Results results )
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
		String participantId = recvEnv.getParticipantID( );
		
		for ( EadRequest request : mappings.keySet( ) )
		{
			Edarch_Read_Access readAccess = _serviceHolder.getEdarchService( ).getReadAccess( 
				request.getArchId( ), 
				request.getArchDocId( ), 
				participantId 
			);
			
			if ( null == readAccess )
			{
				readAccess = new Edarch_Read_Access( );
				readAccess.setParticipantId( participantId );
				readAccess.setIdInternal( request.getArchDocId( ) );
				readAccess.setArchIdInternal( request.getArchId( ) );
				
				_serviceHolder.getEdarchService( ).persist( readAccess );
			}
		}
	}	
	
}
