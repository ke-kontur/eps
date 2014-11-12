package ru.acs.fts.eps2.router.processing.ead.mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.joda.time.LocalDate;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.core.processing.WarningLevels;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.ResultDescriptionInfo;
import ru.acs.fts.eps2.model.entities.Edarch_Reqinfo;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentSaveTypes;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.persistence.EDServiceHolder;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.EadRequest;
import ru.acs.fts.eps2.router.processing.ead.EadRequest2Reqinfo;
import ru.acs.fts.eps2.router.processing.ead.EadRequest2Results;
import ru.acs.fts.eps2.router.processing.ead.EadResponse;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.router.processing.helpers.ResultEnvelopeHelper;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.admin.confirmwhdocregremote.ConfirmWHDocRegRemoteType;
import ru.acs.fts.schemas.admin.ead_docrequest.EADDocRequestType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.confirmwhdocreg.ConfirmWHDocRegType;
import ru.acs.fts.schemas.album.eps_docresponse.ArchiveInformationType;
import ru.acs.fts.schemas.album.eps_docresponse.DocResponseBodyType;
import ru.acs.fts.schemas.album.eps_docresponse.DocResponseType;
import ru.acs.fts.schemas.album.eps_docresponse.EPSDocResponseType;
import ru.acs.fts.schemas.album.result.EADInfoType;
import ru.acs.fts.schemas.album.result.ResponseType;
import ru.acs.fts.schemas.album.result.ResultInformationType;
import ru.acs.fts.schemas.album.result.ResultType;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.CustomsType;

public class EadToTransportMapper
{
	public static EDEnvelope makeEnvelope(
			String messageType, EDDocument resDocument,
			String recipientSystem,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException 
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		ApplicationInfType appInfo = recvEnv.getApplicationInfo( );
		
		EDEnvelope respEnvelope = EnvelopeCreator.createFluentMessage( 
			messageType, recvEnv.getProcessID( ), recvEnv.getParticipantID( ), 
			appInfo.getMessageKind( ), appInfo.getSoftKind( ), appInfo.getSoftVersion( ), 
			recvEnv.getSenderSystem( ), recvEnv.getReceiverCustoms( ), 
			recipientSystem, recvEnv.getSenderCustoms( ), 
			resDocument.getRawDocument( ) 
		);

		respEnvelope.setIncomeEnvelopeID( recvEnv.getEnvelopeID( ) );
		respEnvelope.setInitialEnvelopeID( recvEnv.getEnvelopeID( ) );
		respEnvelope.setDocument( resDocument );
								
		return respEnvelope;		
	}
	
	public static EDEnvelope makeEnvelope( 
			EadRequest request, EadResponse response,
			String okMessageType, String failMessageType,
			String refDocumentId,
			String recipientSystem,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException 
	{
		String messageType = null;
		EDDocument resDocument = null;
		
		if ( response.isSucceeded( ) )
		{
			messageType = okMessageType;
			resDocument = createDocument( refDocumentId, request, response );			
		}
		else
		{
			messageType = failMessageType;
			resDocument = createErrorDocument( refDocumentId, request, response, jobBatchContext.getServiceHolder( ) );
		}
		
		return makeEnvelope( messageType, resDocument, recipientSystem, jobBatchContext );
	}	

	/**
	 * Несмотря на то, что эта функция похожа на предыдущую, она вместо отправки неспосредственно
	 * полученного из ЭАДа документа отправляет успех или неудачу его получения 
	 * @throws DatabaseException 
	 * @throws IllegalStateException 
	 * @throws ResultTypeException 
	 */
	public static EDEnvelope makeResultsEnvelope( 
			EadRequest request, EadResponse response,
			String okMessageType, String failMessageType,
			String refDocumentId,
			String recipientSystem,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException 
	{
		String messageType = null;
		
		if ( response.isSucceeded( ) )
			messageType = okMessageType;
		else
			messageType = failMessageType;

		EDDocument resDocument = createErrorDocument( refDocumentId, request, response, jobBatchContext.getServiceHolder( ) );
		
		return makeEnvelope( messageType, resDocument, recipientSystem, jobBatchContext );
	}	

	public static EDEnvelope makeResultsEnvelope( 
			EadRequest request, Edarch_Reqinfo response,
			String okMessageType, String failMessageType,
			String refDocumentId,
			String recipientSystem,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException 
	{
		String messageType = null;
		
		if ( null != response )
			messageType = okMessageType;
		else
			messageType = failMessageType;

		EDDocument resDocument = createErrorDocument( refDocumentId, request, response, jobBatchContext.getServiceHolder( ) );
		
		return makeEnvelope( messageType, resDocument, recipientSystem, jobBatchContext );
	}	
	
	private static EDEnvelope makeAdm000xxEnvelope(
			String archDocId, EDDocument document,
			String messageType,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		CustomsType senderCustoms = null;
		if ( recvEnv.getMessageType( ).startsWith( "ADM." ) )
		{
			senderCustoms = recvEnv.getReceiverCustoms( );
		}
		else 
		{
			if ( null != recvEnv.getSenderCustoms( ) )
				senderCustoms = recvEnv.getSenderCustoms( );
			else if ( null != recvEnv.getReceiverCustoms( ) )
				senderCustoms = recvEnv.getReceiverCustoms( );
		}
		
		CustomsType receiverCustoms = new CustomsType( );
		receiverCustoms.setCustomsCode( archDocId.split( "-" )[ 0 ] );
		receiverCustoms.setExchType( senderCustoms.getExchType( ) );
		
		EDEnvelope adm00009 = EnvelopeCreator.createFluentMessage( 
			messageType, recvEnv.getProcessID( ), recvEnv.getParticipantID( ), 
			null, 
			recvEnv.getApplicationInfo( ).getSoftKind( ), 
			recvEnv.getApplicationInfo( ).getSoftVersion( ), 
			recvEnv.getSenderSystem( ), senderCustoms, 
			BusinessSystems.EPS, receiverCustoms, 
			document.getRawDocument( )
		);
		
		adm00009.setIncomeEnvelopeID( recvEnv.getEnvelopeID( ) );
		adm00009.getEDHeader( ).setSenderCustoms( senderCustoms );
		adm00009.setDocument( document );
		
		return adm00009;
	}
	
	public static EDEnvelope makeAdm00009Envelope( 
			EadRequest request,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EDDocument document = createEadRequestDocument( 
			recvEnv.getDocument( ).getDocumentID( ), 
			recvEnv.getParticipantID( ), 
			request 
		);		
		
		EDEnvelope adm00009 = makeAdm000xxEnvelope( 
			request.getArchDocId( ), document, 
			MessageType.ADM_00009, jobBatchContext 
		);
				
		return adm00009;
	}
	
	public static EDEnvelope makeAdm00011Envelope( 
			EadRequest request, 
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EDDocument document = createEadRequestDocument( 
			recvEnv.getDocument( ).getDocumentID( ), 
			recvEnv.getParticipantID( ), 
			request 
		);
		
		EDEnvelope adm00011 = makeAdm000xxEnvelope(
			request.getArchDocId( ), document, 
			MessageType.ADM_00011, jobBatchContext
		);
		
		return adm00011;
	}	
	
	public static EDEnvelope makeAdm00012Envelope( 
			ExtEadManifest mf,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EDDocument document = createEadRequestDocument( 
			recvEnv.getDocument( ).getDocumentID( ), 
			recvEnv.getParticipantID( ), 
			mf 
		);
		
		EDEnvelope adm00012 = makeAdm000xxEnvelope(
			mf.getRequestArchDocId( ), document, 
			MessageType.ADM_00012, jobBatchContext
		);
		
		return adm00012;
	}	

	public static EDEnvelope makeAdm00013Envelope( 
			ExtEadManifest mf,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EDDocument document = createEadRequestDocument( 
			recvEnv.getDocument( ).getDocumentID( ), 
			recvEnv.getParticipantID( ), 
			mf 
		);
		
		EDEnvelope adm00013 = makeAdm000xxEnvelope(
			mf.getRequestArchDocId( ), document,
			MessageType.ADM_00013, jobBatchContext
		);
				
		return adm00013;
	}	

	public static EDEnvelope makeAdm00014Envelope( 
			String cmn13001EnvelopeId, EadRequest request,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EDDocument document = createEadRequestDocument( 
			recvEnv.getDocument( ).getDocumentID( ), 
			recvEnv.getParticipantID( ), 
			request 
		);
		
		EDEnvelope adm00014 = makeAdm000xxEnvelope(
			request.getArchDocId( ), document,
			MessageType.ADM_00014, jobBatchContext
		);
		
		adm00014.setInitialEnvelopeID( cmn13001EnvelopeId );
				
		return adm00014;
	}	

	public static EDEnvelope makeAdm00015Envelope( 
			ConfirmWHDocRegType cmn13002doc, 
			ExtEadManifest mf,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		ConfirmWHDocRegRemoteType cwhd = new ConfirmWHDocRegRemoteType( );
		cwhd.setDocumentModeID( DocumentModeIDs.CONFIRM_WH_DOC_REG_REMOTE );
		cwhd.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		
		ru.acs.fts.schemas.admin.confirmwhdocregremote.EADInfoType eadInfo =
			new ru.acs.fts.schemas.admin.confirmwhdocregremote.EADInfoType( );
		eadInfo.setArchDeclID( recvEnv.getParticipantID( ) );
		eadInfo.setArchDocID( mf.getRequestArchDocId( ) );
		eadInfo.setArchDocStatus( null );
		eadInfo.setArchID( mf.getRequestArchId( ) );
		
		List< ru.acs.fts.schemas.admin.confirmwhdocregremote.EADInfoType > eadInfos =
			new ArrayList< ru.acs.fts.schemas.admin.confirmwhdocregremote.EADInfoType >( );
		eadInfos.add( eadInfo );
		cwhd.setEADInfoList( eadInfos );
		
		GTDIDType gtd = cmn13002doc.getRegNumberDoc( );
		
		ru.acs.fts.schemas.admin.confirmwhdocregremote.GTDIDType rgtd = 
			new ru.acs.fts.schemas.admin.confirmwhdocregremote.GTDIDType( );
		rgtd.setCustomsCode( gtd.getCustomsCode( ) );
		rgtd.setRegistrationDate( gtd.getRegistrationDate( ) );
		rgtd.setGTDNumber( gtd.getGTDNumber( ) );
		cwhd.setGTDID( rgtd );
		
		EDDocument doc = new EDDocument( cwhd );
		doc.setSaveBody( true );
		doc.setSaveType( DocumentSaveTypes.INSERT );
		doc.setUniqueness( DocumentUniquenesses.UNIQ );
		
		EDEnvelope adm00015 = makeAdm000xxEnvelope(
			mf.getRequestArchDocId( ), doc,
			MessageType.ADM_00015, jobBatchContext
		);
		
		adm00015.setInitialEnvelopeID( mf.getRequestEnvelopeId( ) );
				
		return adm00015;
	}	
	
	public static EDDocument createDocument( // NO_UCD (use private)
			String refDocumentId,
			EadRequest request, EadResponse response ) 
		throws BaseProcessingException, DatabaseException
	{
		return createDocument(
			refDocumentId, request.getLineId( ),
			response.getDocData( ), response.getAlbumVersion( ), response.getDocDate( )
		);
	}
	
	public static EDDocument createDocument( ExtEadManifest mf ) 
		throws BaseProcessingException, DatabaseException
	{
		return createDocument(
			mf.getRequestDocumentId( ), mf.getRequestLineId( ),
			mf.getData( ), mf.getAlbumVersion( ), 
			new LocalDate( mf.getCreateDate( ) )
		);
	}

	private static EDDocument createDocument(
			String refDocumentId, String lineId,
			byte[ ] docData, String albumVersion, LocalDate docDate ) 
		throws BaseProcessingException, DatabaseException
	{
		EPSDocResponseType rdoc = new EPSDocResponseType( );
		rdoc.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		rdoc.setRefDocumentID( refDocumentId );		
		rdoc.setDocumentModeID( DocumentModeIDs.EPS_DOC_RESPONSE );
		
		DocResponseType docResponse = new DocResponseType( );
		docResponse.setRequestPositionID( lineId ); 
		rdoc.setDocResponse( docResponse );
		
		DocResponseBodyType docResponseBody = new DocResponseBodyType( );
		docResponse.setDocResponseBody( docResponseBody );

		XStringMarshallableClass xstr = new XStringMarshallableClass( );
		xstr.setEncoding( Configurator.WORKING_ENCODING );
		xstr.setByteArray( docData );
		
		docResponseBody.setAny( xstr );
		
		ArchiveInformationType archInfo = new ArchiveInformationType( );
		archInfo.setArchDocAlbum( albumVersion );
		archInfo.setArchDocDate( docDate );
		rdoc.setArchiveInformation( archInfo );
		
		EDDocument doc = new EDDocument( rdoc );
		doc.setSaveBody( true );
		doc.setSaveType( DocumentSaveTypes.INSERT );
		doc.setUniqueness( DocumentUniquenesses.UNIQ );
		
		for ( String cDocId : doc.getContainerDocuments( ).keySet( ) )
		{
			EDDocument subdoc = doc.getDocumentInContainer( cDocId );
			subdoc.setSaveBody( true );
			subdoc.setSaveType( DocumentSaveTypes.INSERT );
			subdoc.setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		}

		return doc;
	}		
	
	public static EDDocument createErrorDocument(  // NO_UCD (use private)
			String refDocumentId,
			EadRequest request, EadResponse response,
			EDServiceHolder serviceHolder ) 
		throws BaseProcessingException, DatabaseException 
	{
    	ResultType type = new ResultType( );
    	type.setDocumentID( UUIDGen.getUUID( ).toString( ) );
    	type.setRefDocumentID( refDocumentId );    	
    	type.setDocumentModeID( DocumentModeIDs.RESULT );
    	
		EadRequest2Results results = new EadRequest2Results( );
		results.getMappings( ).put( request, response );

    	ResponseType resp = new ResponseType( );
    	resp.setRefDocumentID( refDocumentId );
		resp.setResultInformationList( getErrorDescription( results, serviceHolder ) );
		
    	List< ResponseType > responseList = new ArrayList< ResponseType >( );
    	responseList.add( resp );
    	type.setResponseList( responseList );
    	
    	EDDocument doc = new EDDocument( type );
    	doc.setSaveBody( true );
    	doc.setSaveType( DocumentSaveTypes.INSERT );
    	doc.setUniqueness( DocumentUniquenesses.UNIQ );
    	    	
    	return doc;		
	}		

	public static EDDocument createErrorDocument(  // NO_UCD (use private)
			String refDocumentId,
			EadRequest request, Edarch_Reqinfo response,
			EDServiceHolder serviceHolder ) 
		throws BaseProcessingException, DatabaseException 
	{
    	ResultType type = new ResultType( );
    	type.setDocumentID( UUIDGen.getUUID( ).toString( ) );
    	type.setRefDocumentID( refDocumentId );    	
    	type.setDocumentModeID( DocumentModeIDs.RESULT );
    	
		EadRequest2Reqinfo results = new EadRequest2Reqinfo( );
		results.getMappings( ).put( request, response );

    	ResponseType resp = new ResponseType( );
    	resp.setRefDocumentID( refDocumentId );
		resp.setResultInformationList( getErrorDescription( results, serviceHolder ) );
		
    	List< ResponseType > responseList = new ArrayList< ResponseType >( );
    	responseList.add( resp );
    	type.setResponseList( responseList );
    	
    	EDDocument doc = new EDDocument( type );
    	doc.setSaveBody( true );
    	doc.setSaveType( DocumentSaveTypes.INSERT );
    	doc.setUniqueness( DocumentUniquenesses.UNIQ );
    	    	
    	return doc;		
	}		

	public static EDDocument createErrorDocument_NoRef(
			EadRequest2Results results,
			EDServiceHolder serviceHolder ) 
		throws BaseProcessingException, DatabaseException
	{		
		ResultType res = new ResultType( );
		res.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		res.setDocumentModeID( DocumentModeIDs.RESULT );

		ResponseType response = new ResponseType( );
		response.setResultInformationList( EadToTransportMapper.getErrorDescription( results, serviceHolder ) );
		
		List< ResponseType > responseList = new ArrayList< ResponseType >( );
		responseList.add( response );
		
		res.setResponseList( responseList );
		
		EDDocument doc = new EDDocument( res );
		doc.setSaveBody( true );
		doc.setSaveType( DocumentSaveTypes.INSERT );
		doc.setUniqueness( DocumentUniquenesses.UNIQ );
		
		return doc;
	}
	
	public static EDDocument createErrorDocument(
			EadRequest2Results results, EDEnvelope recvEnv,
			EDServiceHolder serviceHolder ) 
		throws BaseProcessingException, DatabaseException
	{		
		ResultType res = new ResultType( );
		res.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		res.setRefDocumentID( recvEnv.getDocument( ).getDocumentID( ) );
		res.setDocumentModeID( DocumentModeIDs.RESULT );

		ResponseType response = new ResponseType( );
		response.setRefDocumentID( recvEnv.getDocument( ).getDocumentID( ) );
		response.setResultInformationList( EadToTransportMapper.getErrorDescription( results, serviceHolder ) );
		
		List< ResponseType > responseList = new ArrayList< ResponseType >( );
		responseList.add( response );
		
		res.setResponseList( responseList );
		
		EDDocument doc = new EDDocument( res );
		doc.setSaveBody( true );
		doc.setSaveType( DocumentSaveTypes.INSERT );
		doc.setUniqueness( DocumentUniquenesses.UNIQ );
		
		return doc;
	}

	public static EDDocument createErrorDocument(
			EadRequest2Reqinfo results, 
			EDServiceHolder serviceHolder ) 
		throws BaseProcessingException, DatabaseException
	{
		ResultType res = new ResultType( );
		res.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		res.setDocumentModeID( DocumentModeIDs.RESULT );

		ResponseType response = new ResponseType( );
		response.setResultInformationList( EadToTransportMapper.getErrorDescription( results, serviceHolder ) );
		
		List< ResponseType > responseList = new ArrayList< ResponseType >( );
		responseList.add( response );
		
		res.setResponseList( responseList );
		
		EDDocument doc = new EDDocument( res );
		doc.setSaveBody( true );
		doc.setSaveType( DocumentSaveTypes.INSERT );
		doc.setUniqueness( DocumentUniquenesses.UNIQ );
		
		return doc;
	}

	public static EDDocument createErrorDocument(
			ExtEadManifest mf, EDServiceHolder serviceHolder ) 
		throws BaseProcessingException, DatabaseException
	{
		ResultType res = new ResultType( );
		res.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		res.setRefDocumentID( mf.getRequestDocumentId( ) );
		res.setDocumentModeID( DocumentModeIDs.RESULT );
		
		ResponseType response = new ResponseType( );
		response.setResultInformationList( EadToTransportMapper.getErrorDescription( mf, serviceHolder ) );
		
		List< ResponseType > responseList = new ArrayList< ResponseType >( );
		responseList.add( response );
		
		res.setResponseList( responseList );
		
		EDDocument doc = new EDDocument( res );
		doc.setSaveBody( true );
		doc.setSaveType( DocumentSaveTypes.INSERT );
		doc.setUniqueness( DocumentUniquenesses.UNIQ );
		
		return doc;
	}
	
	public static EDDocument createErrorDocument(
			List< ExtEadManifest > manifests, EDServiceHolder serviceHolder )
		throws BaseProcessingException, DatabaseException
	{
		ResultType res = new ResultType( );
		res.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		res.setRefDocumentID( manifests.get( 0 ).getRequestDocumentId( ) );
		res.setDocumentModeID( DocumentModeIDs.RESULT );
		
		ResponseType response = new ResponseType( );
		response.setRefDocumentID( manifests.get( 0 ).getRequestDocumentId( ) );
		
		List< ResultInformationType > resInfoList = new ArrayList< ResultInformationType >( );
		response.setResultInformationList( resInfoList );
		
		for ( ExtEadManifest mf : manifests )
		{
			resInfoList.addAll( EadToTransportMapper.getErrorDescription( mf, serviceHolder ) );
		}
		
		List< ResponseType > responseList = new ArrayList< ResponseType >( );
		responseList.add( response );
		
		res.setResponseList( responseList );
		
		EDDocument doc = new EDDocument( res );
		doc.setSaveBody( true );
		doc.setSaveType( DocumentSaveTypes.INSERT );
		doc.setUniqueness( DocumentUniquenesses.UNIQ );
		
		return doc;
	}

	public static EDDocument createEadRequestDocument(  // NO_UCD (use private)
			String refDocumentId, String participantId, 
			EadRequest request ) 
		throws BaseProcessingException, DatabaseException
	{
		EADDocRequestType document = new EADDocRequestType( );
		document.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		document.setRefDocumentID( refDocumentId );
		document.setDocumentModeID( DocumentModeIDs.EAD_DOC_REQUEST );
		
		List< ru.acs.fts.schemas.admin.ead_docrequest.RequestedDocType > requestedDocs =
			new ArrayList< ru.acs.fts.schemas.admin.ead_docrequest.RequestedDocType >( );
		document.setRequestedDocList( requestedDocs );			
		
		ru.acs.fts.schemas.admin.ead_docrequest.RequestedDocType rdoc =
			new ru.acs.fts.schemas.admin.ead_docrequest.RequestedDocType( );
		
		rdoc.setArchDeclID( participantId );
		rdoc.setArchID( request.getArchId( ) );
		rdoc.setArchDocID( request.getArchDocId( ) );
		rdoc.setRequestPositionID( request.getLineId( ) );
		requestedDocs.add( rdoc );
		
		EDDocument doc = new EDDocument( document );
		doc.setSaveBody( true );
		doc.setSaveType( DocumentSaveTypes.INSERT );
		doc.setUniqueness( DocumentUniquenesses.UNIQ );
		
		return doc;
	}
	
	public static EDDocument createEadRequestDocument( // NO_UCD (use private)
			String refDocumentId, String participantId,
			ExtEadManifest mf ) 
		throws BaseProcessingException, DatabaseException
	{
		EADDocRequestType document = new EADDocRequestType( );
		document.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		document.setRefDocumentID( refDocumentId );
		document.setDocumentModeID( DocumentModeIDs.EAD_DOC_REQUEST );
		
		List< ru.acs.fts.schemas.admin.ead_docrequest.RequestedDocType > requestedDocs =
			new ArrayList< ru.acs.fts.schemas.admin.ead_docrequest.RequestedDocType >( );
		document.setRequestedDocList( requestedDocs );
		
		ru.acs.fts.schemas.admin.ead_docrequest.RequestedDocType rdoc =
			new ru.acs.fts.schemas.admin.ead_docrequest.RequestedDocType( );
		
		rdoc.setArchDeclID( participantId );
		rdoc.setArchID( mf.getRequestArchId( ) );
		rdoc.setArchDocID( mf.getRequestArchDocId( ) );
		rdoc.setRequestPositionID( mf.getRequestLineId( ) );
		requestedDocs.add( rdoc );
		
		EDDocument doc = new EDDocument( document );
		doc.setSaveBody( true );
		doc.setSaveType( DocumentSaveTypes.INSERT );
		doc.setUniqueness( DocumentUniquenesses.UNIQ );
		
		return doc;
	}
	
	/**
	 * Получить список с результатами поиска документов в ЭАД.
	 * @throws DatabaseException 
	 */
	public static List< ResultInformationType > getErrorDescription(  // NO_UCD (use private)
			EadRequest2Results results, EDServiceHolder serviceHolder ) 
		throws DatabaseException
	{
		List< ResultInformationType > resultList = new ArrayList< ResultInformationType >( );
		
		Map< EadRequest, EadResponse > ress = results.getMappings( );
		for ( EadRequest request : ress.keySet( ) )
		{
			EadResponse response = ress.get( request );

			ResultInformationType resInfo = new ResultInformationType( );
			String resCode = response.getResultCode( );
			
			if ( !ResultCodes.isOk( resCode ) )
			{
				ResultDescriptionInfo rinfo = ResultEnvelopeHelper.getErrorInformation( 
					serviceHolder.getErrListService( ), 
					resCode 
				);
				
				// документ в ЭАД мы не нашли по какой-то причине
				resInfo.setResultCode( resCode );
				resInfo.setResultCategory( rinfo.category );
				resInfo.setResultDescriptionList( rinfo.description );
			}
			else
			{
				resInfo.setResultCode( ResultCodes._00_00000_00 );
				resInfo.setResultCategory( Integer.toString( WarningLevels.INFO ) );
				
				List< String > resultDescription = new ArrayList< String >( );
				resultDescription.add( "Документ найден в Электронном архиве декларанта" );
				resInfo.setResultDescriptionList( resultDescription );
			}

			resInfo.setRefLineID( request.getLineId( ) );
			
			EADInfoType eadInfo = new EADInfoType( );
			eadInfo.setArchID( request.getArchId( ) ); 
			eadInfo.setArchDocID( request.getArchDocId( ) );
			
			List< EADInfoType > eadInfos = new ArrayList< EADInfoType >( );
			eadInfos.add( eadInfo );
			resInfo.setEADInfoList( eadInfos );

			resultList.add( resInfo );
		}
		
		return resultList;
	}	

	public static List< ResultInformationType > getErrorDescription(  // NO_UCD (use private)
			EadRequest2Reqinfo results, EDServiceHolder serviceHolder ) 
		throws DatabaseException
	{
		List< ResultInformationType > resultList = new ArrayList< ResultInformationType >( );
		
		Map< EadRequest, Edarch_Reqinfo > ress = results.getMappings( );
		for ( EadRequest request : ress.keySet( ) )
		{
			Edarch_Reqinfo response = ress.get( request );

			ResultInformationType resInfo = new ResultInformationType( );
			String resCode = ( null != response ) ? ResultCodes._00_00000_00 : ResultCodes._03_00107_01;
			
			if ( ! ResultCodes.isOk( resCode ) )
			{
				ResultDescriptionInfo rinfo = ResultEnvelopeHelper.getErrorInformation( 
					serviceHolder.getErrListService( ), 
					resCode 
				);
				
				// документ в ЭАД мы не нашли по какой-то причине
				resInfo.setResultCode( resCode );
				resInfo.setResultCategory( rinfo.category );
				resInfo.setResultDescriptionList( rinfo.description );
			}
			else
			{
				resInfo.setResultCode( ResultCodes._00_00000_00 );
				resInfo.setResultCategory( Integer.toString( WarningLevels.INFO ) );
				
				List< String > resultDescription = new ArrayList< String >( );
				resultDescription.add( "Документ найден в Электронном архиве декларанта" );
				resInfo.setResultDescriptionList( resultDescription );
			}

			resInfo.setRefLineID( request.getLineId( ) );
			
			EADInfoType eadInfo = new EADInfoType( );
			eadInfo.setArchID( request.getArchId( ) ); 
			eadInfo.setArchDocID( request.getArchDocId( ) );
			
			List< EADInfoType > eadInfos = new ArrayList< EADInfoType >( );
			eadInfos.add( eadInfo );
			resInfo.setEADInfoList( eadInfos );

			resultList.add( resInfo );
		}
		
		return resultList;
	}	
	
	/**
	 * Получить список с результатами поиска документов в ЭАД.
	 * @throws DatabaseException 
	 */
	public static List< ResultInformationType > getErrorDescription(  // NO_UCD (use private)
			ExtEadManifest mf, EDServiceHolder serviceHolder ) 
		throws DatabaseException
	{
		List< ResultInformationType > resultList = new ArrayList< ResultInformationType >( );
		
		ResultInformationType resInfo = new ResultInformationType( );
		String resCode = mf.getResultCode( ); 
			
		if ( !ResultCodes.isOk( resCode ) )
		{
			ResultDescriptionInfo rinfo = ResultEnvelopeHelper.getErrorInformation( 
				serviceHolder.getErrListService( ), 
				resCode 
			);
				
			// документ в ЭАД мы не нашли по какой-то причине
			resInfo.setResultCode( resCode );
			resInfo.setResultCategory( rinfo.category );
			resInfo.setResultDescriptionList( rinfo.description );
		}
		else
		{
			resInfo.setResultCode( ResultCodes._00_00000_00 );
			resInfo.setResultCategory( Integer.toString( WarningLevels.INFO ) );
				
			List< String > resultDescription = new ArrayList< String >( );
			resultDescription.add( "Документ найден в Электронном архиве декларанта" );
			resInfo.setResultDescriptionList( resultDescription );
		}

		resInfo.setRefLineID( mf.getRequestLineId( ) ); 
			
		EADInfoType eadInfo = new EADInfoType( );
		eadInfo.setArchID( mf.getRequestArchId( ) );
		eadInfo.setArchDocID( mf.getRequestArchDocId( ) ); 
			
		List< EADInfoType > eadInfos = new ArrayList< EADInfoType >( );
		eadInfos.add( eadInfo );
		resInfo.setEADInfoList( eadInfos );

		resultList.add( resInfo );
		
		return resultList;
	}		
}
