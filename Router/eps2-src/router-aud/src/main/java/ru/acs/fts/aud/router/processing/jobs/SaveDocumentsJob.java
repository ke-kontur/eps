package ru.acs.fts.aud.router.processing.jobs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.model.entities.Client;
import ru.acs.fts.aud.model.entities.Document;
import ru.acs.fts.aud.model.entities.Packet;
import ru.acs.fts.aud.model.entities.PacketGTD;
import ru.acs.fts.aud.model.entities.ProtocolItem;
import ru.acs.fts.aud.model.persistence.ArchiveService;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.aud.router.model.managers.ServerStatisticManager;
import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.AudContextConstants;
import ru.acs.fts.aud.router.processing.definitions.EventTypes;
import ru.acs.fts.aud.router.processing.definitions.LogMessageSourceKeys;
import ru.acs.fts.aud.router.processing.definitions.ProtocolLogLevels;
import ru.acs.fts.aud.router.processing.definitions.ProtocolSources;
import ru.acs.fts.aud.router.processing.exceptions.ArchiveException;
import ru.acs.fts.aud.router.processing.helpers.MessageProcessingHelper;
import ru.acs.fts.aud.router.processing.helpers.ProtocolCreator;
import ru.acs.fts.aud.router.processing.spec.ArchiveDocumentInfo;
import ru.acs.fts.aud.router.utils.StringUtil;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.util.time.TimeUtil;
import ru.acs.fts.eps2.utils.CollectionHelper;
import ru.acs.fts.schemas.aud.aud_putdocumentrequest.AUDPutDocumentRequestType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentInfoWithVersionRefType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedPacketInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDGTDIDType;

/**
 * (mrdekk)
 * Проверено. Недостатки исправлены.
 */
/**
 * JobContext:<br/>
 * <b>extractedDocumentsCollectionName</b> - имя коллекции документов для сохранения<br/>
 * <b>valueCollectionName</b> - имя коллекции (мап) значений элементов документов
 * <p>
 * JobBatchContext:<br/>
 * <b>archiveClient</b> - клиент архива. Если нет - смотрится в AUDInf входящего конверта
 */
public class SaveDocumentsJob extends AudJob
{
	private static final Logger log = LoggerFactory.getLogger( SaveDocumentsJob.class );	
	private static final String ACTION = "Сохранение документов";
	
	private ServerStatisticManager _serverStatisticManager;
	
	// @formatter:off
	@Required
	public void setServerStatisticManager( ServerStatisticManager manager ) { _serverStatisticManager = manager; }
	public ServerStatisticManager getServerStatisticManager( ) { return _serverStatisticManager; }
	// @formatter:on
	
	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{		
		AudEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		AUDPutDocumentRequestType request = 
			recvEnv.getDocument( ).getDocumentAsClass( AUDPutDocumentRequestType.class );
		
		ArchiveService archiveService = _serviceHolder.getArchiveService( );
		
		Packet packet = createAndSavePacket( request, jobBatchContext );
		saveGtdIds( request, packet, archiveService );
		
		List< ArchiveDocumentInfo > extractedDocs = getArchiveDocumentInfos( jobBatchContext, jobContext );
		
		log.info( "[SaveDocuments - {}] : Extracted Documents:", request.getDocumentID( ) );
		for ( ArchiveDocumentInfo doc : extractedDocs )
		{
			log.info( 
				"[SaveDocuments - {}] : DocumentId = {}, AppliedDocumentId = {}]", 
				new Object[ ]{ request.getDocumentID( ), 
				doc.getDocumentId( ), doc.getEmbeddedDocument( ).getAppliedDocumentId( ) } 
			);
		}
		
		List< Document > documents = saveDocuments( extractedDocs, packet, request, recvEnv, jobBatchContext );
		
		log.info( "[SaveDocuments - {}] : Saved Documents:", request.getDocumentID( ) );
		for ( Document doc : documents )
		{
			log.info( 
				"[SaveDocuments - {}] : DocumentId = {}, AppliedDocumentId = {}]", 
				new Object[ ]{ request.getDocumentID( ), 
				doc.getId( ), doc.getAppliedId( ) } 
			);
		}
		
		if ( StringUtil.isNullOrEmpty( request.getRefExtArchiveDocumentId( ) ) )
		{
			MessageProcessingHelper.saveProperties( _archiveManager, extractedDocs, documents, jobBatchContext, jobContext );
		}
		
		jobBatchContext.put( AudContextConstants.SAVED_DOCUMENTS, documents );
		jobBatchContext.put( AudContextConstants.SAVED_PACKET, packet );
	}

	@Override
	public String getAction( )
	{
		return ACTION;
	}
	
	private Packet createAndSavePacket( AUDPutDocumentRequestType request, AudJobBatchContext jobBatchContext ) 
		throws PersistenceException
	{
		AUDAppliedPacketInfoType appliedPacketInfo = request.getAppliedPacketInfo( );
		String refAchivePacketId = request.getRefArchivePacketId( );		
		
		Packet packet = null;
		if ( ! StringUtil.isNullOrEmpty( refAchivePacketId ) )
		{
			packet = _serviceHolder.getArchiveService( ).getPacket( refAchivePacketId );
			
			boolean changed = false;
			
			if ( StringUtil.isNullOrEmpty( packet.getAppliedId( ) ) || ! packet.getAppliedId( ).equals( appliedPacketInfo.getAppliedPacketId( ) ) )
			{
				packet.setAppliedId( appliedPacketInfo.getAppliedPacketId( ) );
				changed = true;
			}
			
			if ( StringUtil.isNullOrEmpty( packet.getPacketType( ) ) || ! packet.getPacketType( ).equals( appliedPacketInfo.getAppliedPacketType( ) ) )
			{
				packet.setPacketType( appliedPacketInfo.getAppliedPacketType( ) );
				changed = true;
			}
			
			if ( changed )
				jobBatchContext.getServiceHolder( ).getArchiveService( ).merge( packet );
		}
		else
		{			
			Client client = MessageProcessingHelper.getClient( jobBatchContext );
			packet = _archiveManager.createAndSavePacket( appliedPacketInfo, client );
		}
		
		return packet;
	}
	
	private void saveGtdIds( AUDPutDocumentRequestType request, Packet packet, ArchiveService archiveService ) 
		throws PersistenceException
	{
		List< AUDGTDIDType > gtdIds = request.getAppliedPacketInfo( ).getAUDGTDIDList( );
		if ( null == gtdIds || gtdIds.isEmpty( ) )
			return ;
		
		for ( AUDGTDIDType gtdId : gtdIds )
		{
			PacketGTD gtdPacket = archiveService.getPacketGTD( 
				gtdId.getCustomsCode( ), gtdId.getGTDNumber( ), 
				TimeUtil.convertToSqlDate( gtdId.getRegistrationDate( ).toDate( ) ) 
			);
			
			if ( null == gtdPacket )
			{
				_archiveManager.createAndSavePacketGTD( gtdId, packet );
			}
		}
	}
	
	@SuppressWarnings( "unchecked" )
	private List< ArchiveDocumentInfo > getArchiveDocumentInfos( AudJobBatchContext jobBatchContext, JobContext jobContext )
	{
		String extractedDocumentsCollectionName = jobContext.getString( AudContextConstants.EXTRACTED_DOCUMENTS_COLLECTION_NAME );		
		return ( List< ArchiveDocumentInfo > ) jobBatchContext.get( extractedDocumentsCollectionName );
	}
	
	private List< Document > saveDocuments( List< ArchiveDocumentInfo > docInfos, Packet packet, AUDPutDocumentRequestType request,
			AudEnvelope recvEnv, AudJobBatchContext jobBatchContext ) 
		throws ArchiveException, PersistenceException
	{
		List< Document > documents = new ArrayList< Document >( );
		Document documentContainer = null;
		int docAmount = docInfos.size( );
		
		for ( int index = 0; index < docAmount; ++index )
		{
			ArchiveDocumentInfo docInfo = docInfos.get( index );
			
			Document document = _archiveManager.saveDocumentInAUD( 
				docInfo, request, documentContainer, new Date( ), packet,
				recvEnv.getAudInfo( ).getCustomsCode( ) 
			);
			
			protocol( 
				document, jobBatchContext, index, 
				( ( AUDAppliedDocumentInfoWithVersionRefType )docInfo.getEmbeddedDocument( ) ).getPrevVersionArchiveDocumentId( ) 
			);
			
			if ( null == documentContainer )
				documentContainer = document;
			
			documents.add( document );
		}
		
		jobBatchContext.getServerStatistics( ).addStoredDocumentsCount( docAmount );
		
		return documents;
	}
	
	private void protocol( Document document, AudJobBatchContext jobBatchContext, int index, String prevVerArchDocId )
	{
		String message = "Размещен на хранение.";
		String documentId = document.getId( );
		String appliedId = document.getAppliedId( );
		int version = document.getVersionNumber( );
		
		ProtocolItem protocolItem = new ProtocolItem( );
		protocolItem.setId( UUIDGen.getUUID( ).toString( ) );
		protocolItem.setEventDate( document.getCreationDate( ) );
		protocolItem.setEventType( EventTypes.PUT_DOCUMENT );
		protocolItem.setAppliedDocument( document );
		
		String logLevel = ProtocolLogLevels.DEBUG;
		String logSource = ProtocolSources.DOC;
		
		if ( 0 == index )
		{
			if ( null == prevVerArchDocId )
				ProtocolCreator.stashProtocol( protocolItem, jobBatchContext, LogMessageSourceKeys.LOG_PUT_DOC_1005, 
						new Object[ ] { appliedId, message, logLevel, logSource, documentId } );
			else
				ProtocolCreator.stashProtocol( protocolItem, jobBatchContext, LogMessageSourceKeys.LOG_PUT_DOC_1006, 
						new Object[ ] { appliedId, message, logLevel, logSource, documentId, version } );
		}
		else
		{
			if ( null == prevVerArchDocId )
				ProtocolCreator.stashProtocol( protocolItem, jobBatchContext, LogMessageSourceKeys.LOG_PUT_DOC_1007, 
						new Object[ ] { index, appliedId, message, logLevel, logSource, documentId } );
			else
				ProtocolCreator.stashProtocol( protocolItem, jobBatchContext, LogMessageSourceKeys.LOG_PUT_DOC_1008, 
						new Object[ ] { index, appliedId, message, logLevel, logSource, documentId, version } );
		}
	}
	
}
