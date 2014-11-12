package ru.acs.fts.aud.router.model.managers;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.model.entities.ArchiveResponse;
import ru.acs.fts.aud.model.entities.AttributeContent;
import ru.acs.fts.aud.model.entities.AttributeVersion;
import ru.acs.fts.aud.model.entities.Client;
import ru.acs.fts.aud.model.entities.Document;
import ru.acs.fts.aud.model.entities.DocumentKind;
import ru.acs.fts.aud.model.entities.DocumentKindVersion;
import ru.acs.fts.aud.model.entities.Packet;
import ru.acs.fts.aud.model.entities.PacketGTD;
import ru.acs.fts.aud.model.persistence.ArchiveService;
import ru.acs.fts.aud.model.persistence.ClientService;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.aud.router.model.AttributeContentEvaluator;
import ru.acs.fts.aud.router.processing.definitions.ErrorMessageSourceKeys;
import ru.acs.fts.aud.router.processing.exceptions.ArchiveException;
import ru.acs.fts.aud.router.processing.helpers.ExceptionHelper;
import ru.acs.fts.aud.router.processing.marshalling.ConditionalUnmarshaller;
import ru.acs.fts.aud.router.processing.spec.ArchiveDocumentInfo;
import ru.acs.fts.aud.router.utils.StringUtil;
import ru.acs.fts.aud.router.utils.XShort;
import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.eps2.engine.processing.helpers.MarshallingHelper;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.util.time.TimeUtil;
import ru.acs.fts.schemas.aud.aud_putdocumentrequest.AUDPutDocumentRequestType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentInfoWithVersionRefType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedPacketInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentKindVersionIdInfoOptType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDGTDIDType;
import ru.acs.fts.schemas.aud.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.envelope.SignatureType;

public class ArchiveManager extends BaseManager
{
	private static final Logger log = LoggerFactory.getLogger( ArchiveManager.class );
		
	private ServerSettingManager _serverSettingManager;
	private static ConditionalUnmarshaller _conditionalUnmarshaller;
	
	// @formatter:off
	@Required
	public void setServerSettingManager( ServerSettingManager manager ) { _serverSettingManager = manager; }
	public ServerSettingManager getServerSettingManager( ) { return _serverSettingManager; }
	
	@Required
	public void setConditionalUnmarshaller( ConditionalUnmarshaller conditionalUnmarshaller ) { _conditionalUnmarshaller = conditionalUnmarshaller; }
	public ConditionalUnmarshaller getConditionalUnmarshaller( ) { return _conditionalUnmarshaller; }
	// @formatter:on
	
	private static class SyncDocumentStates
	{
		public static final String NON_SYNCHRONIZED = "NON_SYNCHRONIZED"; // NO_UCD (use private)
		// public static final String SEND_TO_GNIVC = "SEND_TO_GNIVC";
		@SuppressWarnings( "unused" )
		public static final String SYNCHRONIZED = "SYNCHRONIZED"; // NO_UCD
		// public static final String FAILED = "FAILED";
	}
	
	public static boolean isGtd( Packet packet )
	{
		return null != packet && Packet.PACKET_TYPE_GTD.equals( packet.getPacketType( ) ); 
	}
	
	/** (mrdekk) ok! */
	private Packet createAndSavePacket( String processId, String appliedId, String description, String appliedPacketInfoType, Client client )
		throws PersistenceException
	{
		if ( _serviceHolder.getArchiveService( ).isPacketExist( processId ) )
			return _serviceHolder.getArchiveService( ).getPacket( processId );
		
		Packet packet = new Packet( );
		packet.setId( processId );
		packet.setAppliedId( appliedId );
		packet.setDescription( description );
		packet.setClient( client );
		packet.setCreationDate( TimeUtil.newTimestamp( ) );
		packet.setPacketType( appliedPacketInfoType );
		
		_serviceHolder.getArchiveService( ).persistPacket( packet );
		
		return packet;
	}
	
	/** (mrdekk) ok! */
	public Packet createAndSavePacket( AUDAppliedPacketInfoType appliedPacketInfo, Client client ) 
		throws PersistenceException
	{
		return createAndSavePacket( 
			appliedPacketInfo.getAppliedProcessId( ),
			appliedPacketInfo.getAppliedPacketId( ), 
			appliedPacketInfo.getDescription( ), 
			appliedPacketInfo.getAppliedPacketType( ), 
			client 
		);
	}
	
	/** (mrdekk) ok! */
	private PacketGTD createAndSavePacketGTD( String customCode, Date date, String regNum, String liveType, Packet packet )
		throws PersistenceException
	{
		PacketGTD packetGtd = new PacketGTD( );
		packetGtd.setCustCode( customCode );
		packetGtd.setDate( date );
		packetGtd.setRegnum( regNum );
		packetGtd.setLiveType( liveType );
		packetGtd.setArchPacket( packet );
		
		_serviceHolder.getArchiveService( ).persistPacketGTD( packetGtd );
		
		return packetGtd;
	}
	
	/** (mrdekk) ok! */
	public PacketGTD createAndSavePacketGTD( AUDGTDIDType gtdId, Packet packet ) 
		throws PersistenceException
	{
		return createAndSavePacketGTD( 
			gtdId.getCustomsCode( ), 
			TimeUtil.convertToSqlDate( gtdId.getRegistrationDate( ) ), 
			gtdId.getGTDNumber( ), 
			gtdId.getGTDIDState( ), 
			packet 
		);
	}
	
	public Document saveDocumentInAUD( 
			ArchiveDocumentInfo archiveDocumentInfo, AUDPutDocumentRequestType request,
			Document documentContainer, java.util.Date creationDate, Packet packet, String customsCode ) 
		throws ArchiveException, PersistenceException
	{
		ArchiveService archiveService = _serviceHolder.getArchiveService( );
		
		AUDAppliedDocumentInfoWithVersionRefType documentInfo = ( AUDAppliedDocumentInfoWithVersionRefType ) archiveDocumentInfo.getEmbeddedDocument( );
		
		Document prevDocument = archiveService.getDocument( documentInfo.getPrevVersionArchiveDocumentId( ) );		
		Document document = createDocument( documentInfo, prevDocument );
		
		DocumentKindVersion documentKindVersion = getDocumentKindVersion( archiveDocumentInfo, documentInfo.getDocumentKindVersionIdInfoOpt( ) ); 
		document.setDocumentKindVersion( documentKindVersion );
		
		String refExtArchiveDocumentId = request.getRefExtArchiveDocumentId( );
		boolean isSpecialMode = ( ! StringUtil.isNullOrEmpty( refExtArchiveDocumentId ) );
		
		if ( ! isSpecialMode )
		{
			setDocumentContents( document, archiveDocumentInfo.getSignature( ) );
		}
		else if ( null == documentContainer )
		{
			// Если имеем дело с документом верхнего уровня
			
			document.setRefExtArchDocId( refExtArchiveDocumentId );
			document.setRefExtArchPackId( request.getRefArchivePacketId( ) );
			document.setNeedReindex( Document.SHOULD_NEVER_REINDEX );
			
			if ( null == document.getDocumentKindVersion( ) )
			{
				Document extDocument = archiveService.getDocument( refExtArchiveDocumentId );
				document.setDocumentKindVersion( extDocument.getDocumentKindVersion( ) );
			}
		}
		
		Timestamp creationTime = TimeUtil.convertToTimestamp( creationDate );
		
		document.setAppliedId( documentInfo.getAppliedDocumentId( ) );
		document.setApproveExpireDate( creationTime );
		document.setDescription( documentInfo.getDescription( ) );
		document.setLastSignatureVerifyDate( creationTime );
		document.setLastSignatureVerifyResult( XShort.TRUE );
		document.setPacket( packet );
		document.setCustomsCode( customsCode );
		document.setCreationDate( creationTime );
		document.setSignatureExpireDate( creationTime );
		document.setClient( packet.getClient( ) );
		document.setDocumentContainer( documentContainer );
		document.setSynchronizationState( SyncDocumentStates.NON_SYNCHRONIZED );
		
		updateActualFlag( document, prevDocument );
		
		archiveService.persistDocument( document );
		
		return document;
	}

	/** (mrdekk) ok! 
	 * @throws PersistenceException */
	public Document createDocument( AUDAppliedDocumentInfoWithVersionRefType documentInfo, Document prevDocument )  // NO_UCD (use private)
		throws ArchiveException, PersistenceException
	{
		String prevVersionDocumentId = documentInfo.getPrevVersionArchiveDocumentId( );
		Document document = new Document( );
		document.setId( UUIDGen.getUUID( ).toString( ) );
		
		if ( StringUtil.isNullOrEmpty( prevVersionDocumentId ) )
		{
			document.setVersionChain( UUIDGen.getUUID( ).toString( ) );
			document.setVersionNumber( 1 );
		}
		else
		{
			if ( null == prevDocument )
				ExceptionHelper.throwDataException( ErrorMessageSourceKeys.ERROR_ARCHIVE_1103, new Object[ ] { prevVersionDocumentId } );
			
			int versionNumber = prevDocument.getVersionNumber( ) + 1;
			if ( null != getDocument( prevDocument ) )
				versionNumber = _serviceHolder.getArchiveService( ).getNextVersionNumber( prevDocument.getVersionChain( ), false );
				
			if ( -1 == versionNumber )
				ExceptionHelper.throwDataException( ErrorMessageSourceKeys.ERROR_ARCHIVE_1004 );				
			
			document.setVersionChain( prevDocument.getVersionChain( ) );
			
			// document.setVersionNumber( prevDocument.getVersionNumber( ) + 1 );
			document.setVersionNumber( versionNumber );
		}
		
		return document;
	}
	
	/** (mrdekk) ok! 
	 * @throws PersistenceException */
	public Document getDocument( Document prevDocument ) throws PersistenceException // NO_UCD (use private)
	{
		return _serviceHolder.getArchiveService( ).getDocument( 
			prevDocument.getVersionChain( ), 
			prevDocument.getVersionNumber( ) + 1, 
			false 
		);
	}

	/**
	 * mrdekk: Иногда этот метод нужен (т.е. без ArchiveDocumentInfo), но пользоваться им стоит с
	 * осторожностью, ибо не всегда в documentKindVersionIdInfo есть namespace, что приводит к
	 * тому, что результат будет null
	 * 
	 * См. getDocumentKindVersion( documentKindVersionIdInfo, ArchiveDocumentInfo )
	 * @throws PersistenceException 
	 */
	public DocumentKindVersion getDocumentKindVersion( AUDDocumentKindVersionIdInfoOptType documentKindVersionIdInfo ) throws PersistenceException // NO_UCD (use private)
	{
		return _serviceHolder.getArchiveService( ).getDocumentKindVersion( 
			documentKindVersionIdInfo.getAppliedDocumentKindId( ), 
			documentKindVersionIdInfo.getAppliedDocumentKindVersionId( ) 
		);
	}
	
	public DocumentKindVersion getDocumentKindVersion( 
			ArchiveDocumentInfo archiveDocumentInfo,
			AUDDocumentKindVersionIdInfoOptType documentKindVersionIdInfo ) throws PersistenceException
	{
		/**
		 * mrdekk:
		 * Не всегда во входящему документе заполняется поле AppliedDocumentKindVersionId
		 * поэтому надо извлечь этот неймспейс из прикладного документа
		 */
		String appliedDocumentKindVersionId = documentKindVersionIdInfo.getAppliedDocumentKindVersionId( );
		if ( StringUtil.isNullOrEmpty( appliedDocumentKindVersionId ) )
		{
			appliedDocumentKindVersionId = archiveDocumentInfo.getNamespaceUri( );
		}
		
		DocumentKindVersion documentKindVersion = _serviceHolder.getArchiveService( ).getDocumentKindVersion( 
			documentKindVersionIdInfo.getAppliedDocumentKindId( ), 
			appliedDocumentKindVersionId
		);	
		
		return documentKindVersion;
	}
	
	/** (mrdekk) ok! */
	public void setDocumentContents( Document document, SignatureType signature ) // NO_UCD (use private)
		throws PersistenceException
	{
		Object xdoc = signature.getObject( ).getAny( );
		
		byte[ ] contentb = null;
		byte[ ] signatureb = null;
		
		try
		{
			EnvelopeMarshaller marsh = new EnvelopeMarshaller( );
			
			contentb = marsh.marshalBaseDocOrSignature( xdoc, MarshallingHelper.getSharedMarshaller( ) ).getByteArray( );
			
			signature.getObject( ).setAny( null );
			signatureb = marsh.marshalBaseDocOrSignature( signature, MarshallingHelper.getSharedMarshaller( ) ).getByteArray( );
			signature.getObject( ).setAny( xdoc );
		}
		catch ( Exception exc )
		{
			log.error( "Oops", exc );
		}
		
		document.setContent( contentb );
		document.setSignature( signatureb );
	}
	
	/** (mrdekk) ok! */
	public AttributeContent createAttributeContent( AttributeVersion attributeVersion, Document document, Object value ) // NO_UCD (use private)
	{
		AttributeContent attributeContent = new AttributeContent( );
		attributeContent.setId( UUIDGen.getUUID( ).toString( ) );
		attributeContent.setAttributeVersion( attributeVersion );
		attributeContent.setDocument( document );
		AttributeContentEvaluator.evaluate( attributeContent, value );
		
		return attributeContent;
	}
	
	/** (mrdekk) ok! */
	public void createAndSaveAttributeContent( AttributeVersion attributeVersion, Document document, Object value ) 
		throws PersistenceException
	{
		_serviceHolder.getArchiveService( ).persistAttributeContent( createAttributeContent( attributeVersion, document, value ) );
	}
	
	public List< Packet > getPacketsByGtdId( GTDIDType gtdId )  // NO_UCD (use private)
		throws PersistenceException
	{
		return _serviceHolder.getArchiveService( ).getPackets( 
				gtdId.getCustomsCode( ), 
				TimeUtil.convertToSqlDate( gtdId.getRegistrationDate( ) ), 
				gtdId.getGTDNumber( ) );
	}
	
	private void updateActualFlag( Document document, Document prevDocument ) 
		throws PersistenceException
	{
		/*
		if ( null != prevDocument )
		{
			prevDocument.setActual( ( short ) 0 ); // FALSE
			
			if ( null != prevDocument.getDocumentContainer( ) )
			{
				for ( Document subDocument : prevDocument.getDocumentsInside( ) )
					if ( subDocument.getDeleted( ) == 0 )
						subDocument.setActual( ( short ) 0 ); // FALSE
			}
			
			archiveService.mergeDocument( prevDocument );
		}
		else
		{
			document.setActual( ( short ) 1 ); // TRUE
		}
		*/
			
		document.setActual( XShort.TRUE );
		if ( null != prevDocument )
		{
			prevDocument.setActual( XShort.FALSE );
			setUpActualFlagForSubs( prevDocument );
			_serviceHolder.getArchiveService( ).mergeDocument( prevDocument );
		}
	}

	/** (mrdekk) ok! */
	private void setUpActualFlagForSubs( Document document )
	{
		if ( null != document && null != document.getDocumentContainer( ) )
		{
			for ( Document subDocument : document.getDocumentsInside( ) )
				if ( XShort.isFalse( subDocument.getDeleted( ) ) )
					subDocument.setActual( XShort.FALSE );
		}
	}	
	
	public void verifyClientPermission( Client client, Document document, String clientPermissionType )  // NO_UCD (use private)
		throws ArchiveException, PersistenceException
	{
		ClientService clientService = _serviceHolder.getClientService( );
		DocumentKind documentKind = document.getDocumentKindVersion( ).getDocumentKind( );
		if ( null == clientService.getClientPermission( client, documentKind, clientPermissionType ) )
			ExceptionHelper.throwAccessException( ErrorMessageSourceKeys.ERROR_ACCESS_1003, new Object[ ] { documentKind.getDocumentModeId( ) } );
	}
	
	public void saveArchiveResponse( String refDocumentId, String messageKind, Object response ) 
		throws PersistenceException, ArchiveException
	{
		log.debug( "Сохраняю ответ от архива [RedDocumentID = {}; MessageKind={}]", refDocumentId, messageKind );
		
		ArchiveResponse archiveResponse = new ArchiveResponse( );
		archiveResponse.setId( UUIDGen.getUUID( ).toString( ) );
		archiveResponse.setMessageKind( messageKind );
		archiveResponse.setRefDocumentId( refDocumentId );
		archiveResponse.setSendingDate( TimeUtil.newTimestamp( ) );
		
		archiveResponse.setContent( marshall( response, MarshallingHelper.getSharedMarshaller( ), null ) );
		
		_serviceHolder.getArchiveService( ).persistArchiveResponse( archiveResponse );
	}	
}
