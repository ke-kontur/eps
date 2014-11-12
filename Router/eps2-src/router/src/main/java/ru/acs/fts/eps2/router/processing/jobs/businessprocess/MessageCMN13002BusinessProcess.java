package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edarch_Reqinfo;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Participant;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDConfigurator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.EadRequest;
import ru.acs.fts.eps2.router.processing.ead.EadRequest2Reqinfo;
import ru.acs.fts.eps2.router.processing.ead.EadRequester;
import ru.acs.fts.eps2.router.processing.ead.mappers.EadToManifestMapper;
import ru.acs.fts.eps2.router.processing.ead.mappers.EadToTransportMapper;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.confirmwhdocreg.ConfirmWHDocRegType;
import ru.acs.fts.schemas.album.whdocinventory.InventDocumentType;
import ru.acs.fts.schemas.album.whdocinventory.WHDocInventoryType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Бизнес процесс для обработки сообщений CMN.13002
 */
public class MessageCMN13002BusinessProcess extends BusinessProcess
{
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		ConfirmWHDocRegType document = recvEnv.getDocument( ).getDocumentAsClass( ConfirmWHDocRegType.class );
		String refDocumentId = document.getRefDocumentID( );
		
		Edecl_Msg_Doc whDocInventoryDb = _serviceHolder.getEnvelopeService( ).getDocument( refDocumentId );
		if ( null == whDocInventoryDb )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00027_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		EnvelopeUnmarshaller unm = new EnvelopeUnmarshaller( );
		Object doc = unm.unmarshallBaseDocOrSignature( whDocInventoryDb.getBody( ), _serviceHolder.getUnmarshaller( ) );
		EDDocument xdoc = new EDDocument( doc );
		WHDocInventoryType whDocInventory = xdoc.getDocumentAsClass( WHDocInventoryType.class );
		
		if ( StringUtil.isNullOrEmpty( recvEnv.getInitialEnvelopeID( ) ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);			
		}
		
		String incomeEnvelopeId = _serviceHolder.getEnvelopeService( )
			.getIncomeEnvelopeIdByInitialEnvelopeId( recvEnv.getInitialEnvelopeID( ) );
		if ( StringUtil.isNullOrEmpty( incomeEnvelopeId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);			
		}
		
		
		processEadRequests( incomeEnvelopeId, whDocInventory, jobBatchContext, jobContext );
		
		/*
		List< EDEnvelope > transitEnvelopes = createAndPutEnvelopesUnsigned( jobBatchContext, jobContext );

		EDEnvelope transit = ( EDEnvelope )jobBatchContext.get( CMN13002_TRANSIT );
		transitEnvelopes.add( transit );
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		ConfirmWHDocRegType document = recvEnv.getDocument( ).getDocumentAsClass( ConfirmWHDocRegType.class );
		
		GTDIDType gtd = document.getRegNumberDoc( ); 
		String refDocumentId = document.getRefDocumentID( );
		
		List< Edarch_Reqinfo > requestInfos = _serviceHolder.getEdarchService( ).getReqInfosByDocumentId( refDocumentId );
		if ( requestInfos == null || requestInfos.size( ) == 0 )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00107_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		for ( Edarch_Reqinfo requestInfo : requestInfos )
		{
			requestInfo.setSvhRegNumberCustCode( gtd.getCustomsCode( ) );
			if ( gtd.getRegistrationDate( ) != null )
			{
				requestInfo.setSvhRegNumberDate( gtd.getRegistrationDate( ).toDate( ) );
			}
			requestInfo.setSvhRegNumberNumber( gtd.getGTDNumber( ) );
			
			_serviceHolder.getEdarchService( ).merge( requestInfo );
		}
		
		if ( document.getWarehouseLicense( ) != null
				&& document.getWarehouseLicense( ).getCertificateNumber( ) != null )
		{
			String certNumber = document.getWarehouseLicense( ).getCertificateNumber( );
			
			Edecl_Participant svhParticipant = _serviceHolder.getParticipantService( )
				.getParticipantBySvhLicNum( certNumber );

			if ( null != svhParticipant )
			{
				// формируем сообщение в СВХ
				EDEnvelope transit13002ToSvh = EnvelopeCreator.createTranzitMessage( 
					null, recvEnv,
					BusinessSystems.DECLARANT, null
				);
				
				EnvelopeCreator.changeParticipant( transit13002ToSvh, svhParticipant.getParticipantId( ) );
				
				transitEnvelopes.add( transit13002ToSvh );
			}
		}
		*/
	}
	
	private void processEadRequests( 
			String envelopeId, WHDocInventoryType document, 
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
		
		List< EadRequest > localRequests = convert( envelopeId, requestedLocal, softVersion ); 
		if ( requestedForeign.size( ) == 0 )
			localEadRequest( localRequests, jobBatchContext, jobContext );
		else
			foreignEadRequest( envelopeId, localRequests, convert( envelopeId, requestedForeign, softVersion ), jobBatchContext, jobContext );
	}	
	
	private boolean isLocalEAD( InventDocumentType doc, EDConfigurator configurator )
	{
		return EadRequester.isLocalEAD( doc.getArchID( ), doc.getArchDocID( ), configurator );
	}

	private List< EadRequest > convert( String envelopeId, List< InventDocumentType > reqs, String softVersion )
	{
		List< EadRequest > requests = new ArrayList< EadRequest >( );
		
		for ( InventDocumentType reqDoc : reqs )
		{
			EadRequest req = new EadRequest( );
			req.setArchId( reqDoc.getArchID( ) );
			req.setArchDocId( reqDoc.getArchDocID( ) );
			req.setLineId( reqDoc.getInventLineID( ) );
			req.setDocCode( reqDoc.getInvDocCode( ) );
			req.setReqEnvId( envelopeId );
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
		
		EadRequest2Reqinfo results = new EadRequest2Reqinfo( );
		EadRequester.checkReqInfo( 
			localRequest, results, _serviceHolder 
		);
				
		if ( ! isAllReqInfosFound( localRequest, results ) )
		{
			EDDocument resDocument = EadToTransportMapper.createErrorDocument( results, _serviceHolder );
 
			EDEnvelope respEnvelope = EadToTransportMapper.makeEnvelope( 
				MessageType.CMN_00001, resDocument, 
				BusinessSystems.DECLARANT, jobBatchContext 
			);
			
			envelopesUnsigned.add( respEnvelope );
			
			return ;
		}

		setRequiredStatuses( results, recvEnv );
		
		EDEnvelope cmn13002 = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.DECLARANT, null 
		);
		
		envelopes.add( cmn13002 );
		
		EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
			MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
			BusinessSystems.CUSTOMS, recvEnv.getSenderCustoms( ) 
		);
		
		CryptoHelper.signEnvelope( cmn00004, false );
		
		envelopes.add( cmn00004 );		
		
		ConfirmWHDocRegType document = recvEnv.getDocument( ).getDocumentAsClass( ConfirmWHDocRegType.class );
		
		if ( document.getWarehouseLicense( ) != null && 
			 document.getWarehouseLicense( ).getCertificateNumber( ) != null )
		{
			String certNumber = document.getWarehouseLicense( ).getCertificateNumber( );
			
			Edecl_Participant svhParticipant = _serviceHolder.getParticipantService( )
				.getParticipantBySvhLicNum( certNumber );

			if ( null != svhParticipant )
			{
				// формируем сообщение в СВХ
				EDEnvelope transit13002ToSvh = EnvelopeCreator.createTranzitMessage( 
					null, recvEnv,
					BusinessSystems.DECLARANT, null
				);
				
				EnvelopeCreator.changeParticipant( transit13002ToSvh, svhParticipant.getParticipantId( ) );
				
				envelopes.add( transit13002ToSvh );
			}
		}				
	}	
	
	private void foreignEadRequest( 	
			String cmn13001InitialEnvelopeId,
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
		EadRequest2Reqinfo results = new EadRequest2Reqinfo( );
		EadRequester.checkReqInfo( localRequests, results, _serviceHolder );
		
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
			ExtEadManifest manifest = EadToManifestMapper.map2Manifest_Reqinfo( recvEnv.getEnvelopeID( ), recvEnv.getDocument( ).getDocumentID( ), request );			
			_serviceHolder.getEdarchService( ).persist( manifest );

			EDEnvelope msg2Eps = EadToTransportMapper.makeAdm00014Envelope( cmn13001InitialEnvelopeId, request, jobBatchContext );
			if ( null != msg2Eps )
				envelopesUnsigned.add( msg2Eps );
		}
	}				
	
	private boolean isAllReqInfosFound( List< EadRequest > localRequest, EadRequest2Reqinfo results )
	{
		Map< EadRequest, Edarch_Reqinfo > mappings = results.getMappings( );
		
		int requestCount = localRequest.size( );
		int foundCount = 0;
		
		for ( EadRequest request : mappings.keySet( ) )
		{
			Edarch_Reqinfo response = mappings.get( request );
			if ( null != response )
				foundCount++;
		}
		
		return foundCount == requestCount;
	}
	
	private void setRequiredStatuses( EadRequest2Reqinfo results, EDEnvelope recvEnv ) 
		throws Exception
	{
		Map< EadRequest, Edarch_Reqinfo > mappings = results.getMappings( );		

		ConfirmWHDocRegType document = recvEnv.getDocument( ).getDocumentAsClass( ConfirmWHDocRegType.class );		
		GTDIDType gtd = document.getRegNumberDoc( ); 
		
		for ( EadRequest request : mappings.keySet( ) )
		{
			Edarch_Reqinfo reqInfo = mappings.get( request );
			
			reqInfo.setSvhRegNumberCustCode( gtd.getCustomsCode( ) );
			reqInfo.setSvhRegNumberNumber( gtd.getGTDNumber( ) );
			if ( null != gtd.getRegistrationDate( ) )
				reqInfo.setSvhRegNumberDate( gtd.getRegistrationDate( ).toDate( ) );
			
			_serviceHolder.getEdarchService( ).merge( reqInfo );
		}
	}
}
