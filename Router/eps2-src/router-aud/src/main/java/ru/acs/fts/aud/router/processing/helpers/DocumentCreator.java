package ru.acs.fts.aud.router.processing.helpers;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.joda.time.DateTime;

import ru.acs.fts.aud.model.entities.Document;
import ru.acs.fts.aud.model.entities.Packet;
import ru.acs.fts.aud.router.processing.definitions.DocumentModeIDs;
import ru.acs.fts.aud.router.processing.definitions.ErrorCodes;
import ru.acs.fts.aud.router.processing.exceptions.ArchiveError;
import ru.acs.fts.aud.router.processing.exceptions.ArchiveException;
import ru.acs.fts.aud.router.utils.StringUtil;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.util.time.TimeUtil;
import ru.acs.fts.schemas.aud.aud_error.AUDErrorType;
import ru.acs.fts.schemas.aud.aud_error.EmbeddedDocumentResultInfoType;
import ru.acs.fts.schemas.aud.aud_putdocumentrequest.AUDPutDocumentRequestType;
import ru.acs.fts.schemas.aud.aud_putdocumentresponse.AUDPutDocumentResponseType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDArchiveDocumentIdWithVersionType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDArchiveDocumentInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDArchivePacketInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDEmbeddedDocumentArchiveInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDResultInfoType;

public class DocumentCreator
{
	private static final String DEFAULT_ERROR_DESCRIPTION = "Внутренняя ошибка сервера.";
	private static final String DEFAULT_ERROR_CODE = ErrorCodes.ERROR_INTERNAL_1001;
	
	// @formatter:off
	private DocumentCreator( ) { }
	// @formatter:on
	
	public static AUDErrorType createAudError( String refDocumentId, Exception exception, 
			boolean isReadableException )
	{
		AUDErrorType audError = new AUDErrorType( );
		audError.setDocumentID( StringUtil.generateUuid( ) );
		audError.setDocumentModeID( DocumentModeIDs.AUD_ERROR );
		audError.setRefDocumentID( refDocumentId );
		audError.setDocumentDateTime( new DateTime( ) );
		audError.setTestDocumentIndicator( false );
		
		fillAudError( audError, exception, isReadableException );
		
		return audError;
	}
	
	public static AUDPutDocumentResponseType createAudPutDocumentResponse( 
			AUDPutDocumentRequestType request, Packet packet,
			List< Document > documents )
	{
		AUDPutDocumentResponseType response = new  AUDPutDocumentResponseType( );
		response.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		response.setDocumentDateTime( new DateTime( ) );
		response.setTestDocumentIndicator( request.isTestDocumentIndicator( ) );
		response.setRefDocumentID( request.getDocumentID( ) );
		response.setDocumentModeID( DocumentModeIDs.AUD_PUT_DOCUMENT_RESPONSE );
		
		AUDArchivePacketInfoType packetInfo = new AUDArchivePacketInfoType( );
		packetInfo.setArchivePacketId( packet.getId( ) );
		packetInfo.setPutDateTime( TimeUtil.convertToDateTime( packet.getCreationDate( ) ) );
		response.setArchivePacketInfo( packetInfo );
		
		AUDArchiveDocumentInfoType documentInfo = new AUDArchiveDocumentInfoType( );
		Document rootDocument =  documents.get( 0 );
		documentInfo.setArchiveDocumentIdWithVersion( createDocumentIdWithVersion( rootDocument ) );
		documentInfo.setPutDateTime( TimeUtil.convertToDateTime( rootDocument.getCreationDate( ) ) );
		response.setArchiveDocumentInfo( documentInfo );
		
		for ( int index = 1; index < documents.size( ); index++ )
		{
			Document document = documents.get( index );
			AUDEmbeddedDocumentArchiveInfoType embeddedDocument = new AUDEmbeddedDocumentArchiveInfoType( );
			embeddedDocument.setArchiveDocumentIdWithVersion( createDocumentIdWithVersion( document ) );
			embeddedDocument.setAppliedDocumentId( document.getAppliedId( ) );
			
			response.getEmbeddedDocumentArchiveInfoList( ).add( embeddedDocument );
		}
		
		return response;
	}
	
	public static void initAudResponse( AUDBaseEnvelopeType request, AUDBaseEnvelopeType response )
	{
		response.setDocumentDateTime( new DateTime( ) );
		response.setDocumentID( StringUtil.generateUuid( ) );
		response.setRefDocumentID( request.getDocumentID( ) );
		response.setTestDocumentIndicator( request.isTestDocumentIndicator( ) );
	}
	
	private static AUDArchiveDocumentIdWithVersionType createDocumentIdWithVersion( Document document )
	{
		AUDArchiveDocumentIdWithVersionType documentIdWithVersion = new AUDArchiveDocumentIdWithVersionType( );
		documentIdWithVersion.setArchiveDocumentId( document.getId( ) );
		documentIdWithVersion.setDocumentVersionNumber( BigInteger.valueOf( document.getVersionNumber( ) ) );
		
		return documentIdWithVersion;
	}
	
	private static void fillAudError( AUDErrorType audError, Exception exception, 
			boolean isReadableException )
	{
		if ( exception instanceof ArchiveException )
		{
			ArchiveException archiveException = ( ArchiveException ) exception;
			if ( archiveException.hasDocumentErrors( ) )
				fillDocumentErrors( audError, archiveException );
			
			if ( archiveException.hasRequestErrors( ) )
				fillRequestErrors( audError, archiveException, isReadableException );
		}
		else
		{
			String errorMessage = "";
			
			if ( null != exception )
			{
				OutputStream outputStream = new ByteArrayOutputStream( );
				PrintWriter stream = new PrintWriter( outputStream );
				exception.printStackTrace( stream );
				stream.flush( );
				errorMessage = outputStream.toString( );
			}
			
			List< String > descriptionList = StringUtil.splitStringToChunks( errorMessage );
			if ( descriptionList.isEmpty( ) )
				descriptionList.add( DEFAULT_ERROR_DESCRIPTION );
		
			for ( String description: descriptionList )
			{
				AUDResultInfoType result = new AUDResultInfoType( );
				audError.getResultInfoList( ).add( result );
				
				result.setResultCode( DEFAULT_ERROR_CODE );
				result.setDescription( description );
			}
		}
	}
	
	private static void fillDocumentErrors( AUDErrorType audError, ArchiveException exc )
	{
		Map< String, List< ArchiveError > > documentErrors = exc.getDocumentErrors( );
		for ( Entry< String, List< ArchiveError > > entry : documentErrors.entrySet( ) )
		{
			String documentId = entry.getKey( );
			for ( ArchiveError error : entry.getValue( ) )
			{
				EmbeddedDocumentResultInfoType docResultInfo = new EmbeddedDocumentResultInfoType( );
				docResultInfo.setAppliedDocumentId( documentId );
				
				AUDResultInfoType resultInfo = new AUDResultInfoType( );
				resultInfo.setResultCode( error.getCode( ) );
//				resultInfo.setDescription( MessageResolver.resolveErrorMessage( error ) );
				resultInfo.setDescription( error.getDescription( ) );
				docResultInfo.getResultInfoList( ).add( resultInfo );
				
				audError.getEmbeddedDocumentResultInfoList( ).add( docResultInfo );
			}
		}
	}

	private static void fillRequestErrors( AUDErrorType audError, ArchiveException exc, boolean isReadableException )
	{
		for ( ArchiveError error : exc.getRequestErrors( ) ) 
		{
			AUDResultInfoType resultInfo = new AUDResultInfoType( );
			if ( isReadableException )
				resultInfo.setResultCode( error.getCode( ) );
			else
				resultInfo.setResultCode( DEFAULT_ERROR_CODE );
			
			resultInfo.setDescription( MessageResolver.resolveErrorMessage( error ) );
			audError.getResultInfoList( ).add( resultInfo );			
		}
	}
}
