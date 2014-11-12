package ru.acs.fts.aud.router.processing.jobs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.aud.model.entities.Attribute;
import ru.acs.fts.aud.model.entities.AttributeVersion;
import ru.acs.fts.aud.model.entities.Document;
import ru.acs.fts.aud.model.entities.DocumentKind;
import ru.acs.fts.aud.model.entities.DocumentKindVersion;
import ru.acs.fts.aud.model.persistence.ArchiveService;
import ru.acs.fts.aud.model.persistence.ClientService;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.AudContextConstants;
import ru.acs.fts.aud.router.processing.definitions.ClientPermissionTypes;
import ru.acs.fts.aud.router.processing.definitions.ErrorMessageSourceKeys;
import ru.acs.fts.aud.router.processing.definitions.EventTypes;
import ru.acs.fts.aud.router.processing.definitions.LogMessageSourceKeys;
import ru.acs.fts.aud.router.processing.exceptions.ArchiveError;
import ru.acs.fts.aud.router.processing.exceptions.ArchiveException;
import ru.acs.fts.aud.router.processing.helpers.DocExtractor;
import ru.acs.fts.aud.router.processing.helpers.ExceptionHelper;
import ru.acs.fts.aud.router.processing.helpers.ProtocolCreator;
import ru.acs.fts.aud.router.processing.helpers.XPathChecker;
import ru.acs.fts.aud.router.processing.spec.ArchiveDocumentInfo;
import ru.acs.fts.aud.router.utils.StringUtil;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.aud.aud_putdocumentrequest.AUDPutDocumentRequestType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentInfoWithVersionRefType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedPacketInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentKindVersionIdInfoOptType;

/**
 * <h2><strong>JobContext:</strong></h2>
 * <ul>
 * <li><b>extractedDocumentsCollectionName</b> - имя коллекции документов для сохранения</li>
 * <li><b>valueCollectionName</b> - имя коллекции (мап) значений элементов документов</li>
 * <li><b>documentKindVersionCacheName</b> - имя коллекции (мап) версий типов документов</li>
 * </ul>
 */
public class VerifyDocumentsJob extends AudJob
{
	private static final Logger log = LoggerFactory.getLogger( VerifyDocumentsJob.class );
	private static final String ACTION = "Верификация документов, отправленных в АЮД на сохранение.";
	
	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		AudEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		AUDPutDocumentRequestType request = 
			recvEnv.getDocument( ).getDocumentAsClass( AUDPutDocumentRequestType.class );
		
		verifyPacket( jobBatchContext, request, jobBatchContext.getServiceHolder( ).getArchiveService( ) );
		
		List< ArchiveDocumentInfo > extractedDocs = DocExtractor.extractDocuments( request );
		
		log.info( "[Verify - {}] : Extracted Documents:", request.getDocumentID( ) );
		for ( ArchiveDocumentInfo doc : extractedDocs )
		{
			log.info( 
				"[Verify - {}] : DocumentId = {}, AppliedDocumentId = {}]", 
				new Object[ ]{ request.getDocumentID( ), 
				doc.getDocumentId( ), doc.getEmbeddedDocument( ).getAppliedDocumentId( ) } 
			);
		}
		
		String extractedDocsCollectionName = jobContext.getString( AudContextConstants.EXTRACTED_DOCUMENTS_COLLECTION_NAME );
		jobBatchContext.put( extractedDocsCollectionName, extractedDocs );
		
		String valueCollectionName = jobContext.getString( AudContextConstants.VALUE_COLLECTION_NAME );
		Map< AUDDocumentKindVersionIdInfoOptType, DocumentKindVersion > cache = 
			new HashMap< AUDDocumentKindVersionIdInfoOptType, DocumentKindVersion >( );
		processDocInfo( extractedDocs, jobBatchContext, request, valueCollectionName, cache );
		
		String cacheName = jobContext.getString( AudContextConstants.DOCUMENT_KIND_VERSION_CACHE_NAME );
		jobBatchContext.put( cacheName, cache );
		
		log.info( "Верификация докуметов успешно завершена." );
	}

	@Override
	public String getAction( )
	{
		return ACTION;
	}
	
	private void verifyPacket( AudJobBatchContext jobBatchContext, AUDPutDocumentRequestType audPutDocReq, ArchiveService archiveService ) 
		throws ArchiveException, PersistenceException
	{
		AUDAppliedPacketInfoType audAppliedPacketInfo = audPutDocReq.getAppliedPacketInfo( );
		String refArchivePacketId = audPutDocReq.getRefArchivePacketId( );
		
		if ( ! StringUtil.isNullOrEmpty( refArchivePacketId ) )
		{
			/**
			 * Ссылочный идентификатор пакета присутствует, т.е. этот документ уже был когда-то 
			 * размещен в другом пакете (например, документ из ЭАДа).
			 */
			
			if ( ! archiveService.isPacketExist( refArchivePacketId ) )
			{
				/**
				 * Но указанного пакета не существует, странно ...
				 */
				
				ExceptionHelper.createDataException( ErrorMessageSourceKeys.ERROR_ARCHIVE_1101 );
			}
		}
		else
		{
			/**
			 * Письмо Пульши от 2010-02-04: по согласованию с заказчиком
			 * (Суслина, тел. разговор 03.03.2010) принято решение снять
			 * проверку на формат прикладного идентификатора пакета для пакетов
			 * с кодом 99.
			 */
			
			/**
			 * Анализ на 01 мы тоже не проводим по причине отсутствия каких-либо
			 * проверок 
			 */
		}
		
		/**
		 * Раньше мы тут делали проверку GTDID на наличие такого пакета. Однако сейчас
		 * GTDID может не быть, оно может придти попозже и т.д.
		 * Поэтому проверку на наличие пакета с таким GTDID мы не делаем, мы просто создадим
		 * его при сохранении если будет надобность.
		 */
		
		ProtocolCreator.stashProtocol( 
			jobBatchContext, 
			LogMessageSourceKeys.LOG_PUT_DOC_1000, 
			EventTypes.PUT_DOCUMENT, 
			new Object[ ] { 
				audAppliedPacketInfo.getAppliedPacketId( ), 
				audAppliedPacketInfo.getDescription( ) 
			}, 
			null 
		);
	}
	
	private void processDocInfo( 
			List< ArchiveDocumentInfo > docs, AudJobBatchContext jobBatchContext, AUDPutDocumentRequestType request, 
			String valueCollectionName, Map< AUDDocumentKindVersionIdInfoOptType, DocumentKindVersion > cache ) 
		throws ArchiveException, BaseProcessingException, DatabaseException, PersistenceException
	{
		boolean isArchDocIdEmpty = StringUtil.isNullOrEmpty( request.getRefExtArchiveDocumentId( ) );
		boolean isArchPackIdEmpty = StringUtil.isNullOrEmpty( request.getRefExtArchivePacketId( ) );
		boolean shouldCheckRegistration = isArchDocIdEmpty || isArchPackIdEmpty;
		
		ArchiveException archiveException = ExceptionHelper.createDataException( ErrorMessageSourceKeys.ERROR_ARCHIVE_1001 );
		
		ArchiveService archiveService = _serviceHolder.getArchiveService( );
		ClientService clientService = _serviceHolder.getClientService( );
		
		/**
		 * Проверяем валидность ссылок
		 */
		if ( ! isArchDocIdEmpty )
		{
			String refDocumentId = request.getRefExtArchiveDocumentId( );
			if ( ! archiveService.isDocumentExist( refDocumentId ) )
				ExceptionHelper.throwDataException( ErrorMessageSourceKeys.ERROR_ARCHIVE_1103, new Object[ ] { refDocumentId } );
			
			String refPacketId = request.getRefExtArchivePacketId( );
			if ( ! archiveService.isPacketExist( refPacketId ) )
				ExceptionHelper.throwDataException( ErrorMessageSourceKeys.ERROR_ARCHIVE_1101, new Object[ ] { refPacketId } );
		}
		
		String archiveClientId = jobBatchContext.getReceivedEnvelope( ).getAudInfo( ).getArchiveClientId( );
		
		Map< String, List< Object > > attributeContentValues = new HashMap< String, List< Object > >( );
		
		for ( int i = 0; i < docs.size( ); i++ )
		{
			ArchiveDocumentInfo doc = docs.get( i );
			protocol( doc, jobBatchContext, i );
			
			DocumentKindVersion documentKindVersion = getDocumentKindVersion( doc, archiveService, cache );
			
			if ( shouldCheckRegistration )
			{
				verifyRegistration( 
					doc, documentKindVersion, request, 
					archiveService, clientService, 
					archiveException, archiveClientId 
				);
			}

			if ( ! archiveException.hasDocumentErrors( ) && isArchDocIdEmpty )
			{
				verifyProperties( request, doc, documentKindVersion, archiveException, attributeContentValues );
			}
		}
		
		if ( archiveException.hasDocumentErrors( ) )
		{
			StringBuilder message = new StringBuilder( archiveException.getMessage( ) );
			for ( Entry< String, List< ArchiveError > > entry : archiveException.getDocumentErrors( ).entrySet( ) )
			{
				String documentId = entry.getKey( );
				for ( ArchiveError error : entry.getValue( ) )
				{
					message.append( "\n" );
					message.append( error.getCode( ) );
					message.append( "(" );
					message.append( documentId );
					message.append( ") : " );
					message.append( error.getDescription( ) );
				}
			}
			archiveException.setMessage( message.toString( ) );
			
			throw archiveException;
		}
		else
		{
			jobBatchContext.put( valueCollectionName, attributeContentValues );
		}
	}
	
	private void verifyProperties( 
			AUDPutDocumentRequestType request, ArchiveDocumentInfo doc, 
			DocumentKindVersion documentKindVersion, ArchiveException exc, 
			Map< String, List< Object > > attributeContentValues ) 
		throws BaseProcessingException, DatabaseException
	{
		AUDAppliedDocumentInfoWithVersionRefType appliedDocumentInfo = ( AUDAppliedDocumentInfoWithVersionRefType )doc.getEmbeddedDocument( );
		String appliedDocumentId = appliedDocumentInfo.getAppliedDocumentId( );
		
		for ( AttributeVersion attributeVersion : documentKindVersion.getAttributeVersions( ) )
		{
			Attribute attribute = attributeVersion.getAttribute( );
			Object[ ] attributeParams = new Object[ ] 
			{ 
				attribute.getName( ), 
				attribute.getType( ), 
				attribute.getDescription( ) 
			};
			
			List< Object > xPathValues = new ArrayList< Object >( );
			attributeContentValues.put( attributeVersion.getId( ), xPathValues );
			
			/**
			 * ВАЖНО! Валидация значений атрибутов НЕ ПРОИЗВОДИТСЯ. Совершаться она будет при создании и заполнении документа перед сохранением
			 * его в базу данных. Тогде же возможно и упадем по неправильным значениям.
			 */
			XPathChecker.xPathCheck( 
				doc.getSignature( ), attributeVersion.getXPath( ), 
				exc, appliedDocumentId, attributeParams, xPathValues 
			);
		}
	}
	
	private DocumentKindVersion getDocumentKindVersion( 
			ArchiveDocumentInfo doc, ArchiveService archiveService, Map< AUDDocumentKindVersionIdInfoOptType, 
			DocumentKindVersion > cache ) throws PersistenceException
	{
		AUDAppliedDocumentInfoWithVersionRefType embeddedDocument = ( AUDAppliedDocumentInfoWithVersionRefType )doc.getEmbeddedDocument( );
		AUDDocumentKindVersionIdInfoOptType documentKindVersionInfo = embeddedDocument.getDocumentKindVersionIdInfoOpt( );

		DocumentKindVersion documentKindVersion = _archiveManager.getDocumentKindVersion( doc, documentKindVersionInfo );
		
		if ( null != documentKindVersion )
			cache.put( documentKindVersionInfo, documentKindVersion );
		
		return documentKindVersion;
	}
	
	/** (mrdekk) ok! 
	 * @throws PersistenceException */
	private void verifyRegistration( 
			ArchiveDocumentInfo doc, DocumentKindVersion documentKindVersion, 
			AUDPutDocumentRequestType request, ArchiveService archiveService, 
			ClientService clientService, ArchiveException exc, String archiveClientId )
		throws ArchiveException, PersistenceException
	{
		AUDAppliedDocumentInfoWithVersionRefType embeddedDocument = ( AUDAppliedDocumentInfoWithVersionRefType )doc.getEmbeddedDocument( );
		AUDDocumentKindVersionIdInfoOptType documentKindVersionInfo = embeddedDocument.getDocumentKindVersionIdInfoOpt( ); 
		
		String appliedDocumentId = embeddedDocument.getAppliedDocumentId( );
		
		if ( null == documentKindVersion )
		{
			exc.addDocumentError( 
				appliedDocumentId, ErrorMessageSourceKeys.ERROR_ARCHIVE_1107, 
				new Object[ ] { documentKindVersionInfo.getAppliedDocumentKindVersionId( ) } 
			);
			
		}
		else
		{
			DocumentKind documentKind = documentKindVersion.getDocumentKind( );
			
			if ( ! clientService.hasPermission( archiveClientId, documentKind, ClientPermissionTypes.WRITE ) )
			{
				exc.addDocumentError( 
					appliedDocumentId, ErrorMessageSourceKeys.ERROR_ACCESS_1004, 
					new Object[ ] { documentKind.getDocumentModeId( ) } 
				);
			}
			
			String prevArchiveDocId = embeddedDocument.getPrevVersionArchiveDocumentId( );
			if ( ! StringUtil.isNullOrEmpty( prevArchiveDocId ) )
			{
				Document document = archiveService.getDocument( prevArchiveDocId );
				if ( null == document )
				{
					exc.addDocumentError( 
						appliedDocumentId, ErrorMessageSourceKeys.ERROR_ARCHIVE_1103, 
						new Object[ ] { prevArchiveDocId } 
					);
				}
			}
		}
	}
		
	/** (mrdekk) ok! 
	 * @throws PersistenceException */
	private void protocol( ArchiveDocumentInfo doc, AudJobBatchContext jobBatchContext, int index ) throws PersistenceException
	{
		AUDAppliedDocumentInfoWithVersionRefType embedded = ( AUDAppliedDocumentInfoWithVersionRefType )doc.getEmbeddedDocument( );
		AUDDocumentKindVersionIdInfoOptType documentKindVersionInfo = embedded.getDocumentKindVersionIdInfoOpt( );
		
		String appliedDocumentId = embedded.getAppliedDocumentId( );
		String prevVersionArchiveDocumentId = embedded.getPrevVersionArchiveDocumentId( );
		String description = embedded.getDescription( );
		
		String appliedDocumentKindId = documentKindVersionInfo.getAppliedDocumentKindId( );
		String appliedDocumentKindVersionId = documentKindVersionInfo.getAppliedDocumentKindVersionId( );
		
		if ( null == prevVersionArchiveDocumentId )
		{
			ProtocolCreator.stashProtocol( 
				jobBatchContext, LogMessageSourceKeys.LOG_PUT_DOC_1001, EventTypes.OTHER, 
				new Object[ ] { 
					appliedDocumentId, description, appliedDocumentKindId, appliedDocumentKindVersionId 
				}, 
				null 
			);
			
			if ( index != 0 )
			{
				ProtocolCreator.stashProtocol( 
					jobBatchContext, LogMessageSourceKeys.LOG_PUT_DOC_1003, EventTypes.OTHER, 
					new Object[ ] { 
						index, appliedDocumentId, description 
					} , 
					null 
				);
			}
		}
		else
		{
			ProtocolCreator.stashProtocol( 
				jobBatchContext, LogMessageSourceKeys.LOG_PUT_DOC_1002, EventTypes.OTHER, 
				new Object[ ] { 
					appliedDocumentId, description, appliedDocumentKindId, appliedDocumentKindVersionId, prevVersionArchiveDocumentId
				}, 
				null 
			);
			
			if ( index != 0 )
			{
				ProtocolCreator.stashProtocol( 
					jobBatchContext, LogMessageSourceKeys.LOG_PUT_DOC_1004, EventTypes.OTHER, 
					new Object[ ] { 
						index, appliedDocumentId, description, prevVersionArchiveDocumentId 
					} , 
					null 
				);
			}
		}
	}
}
