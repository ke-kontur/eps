package ru.acs.fts.aud.router.processing.helpers;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.aud.model.entities.AttributeVersion;
import ru.acs.fts.aud.model.entities.Client;
import ru.acs.fts.aud.model.entities.Document;
import ru.acs.fts.aud.model.entities.DocumentKindVersion;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.aud.router.model.managers.ArchiveManager;
import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.AudContextConstants;
import ru.acs.fts.aud.router.processing.spec.ArchiveDocumentInfo;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentKindVersionIdInfoOptType;

/**
 * (mrdekk) ok!
 */
public class MessageProcessingHelper
{
	private static final Logger log = LoggerFactory.getLogger( MessageProcessingHelper.class );
	
	/** (mrdekk) ok! */
	public static void saveProperties(  // NO_UCD (use private)
			ArchiveManager archiveManager, 
			List< ArchiveDocumentInfo > docInfos, List< Document > documents,
			Map< String, List< Object > > attributeContentValues,
			Map< AUDDocumentKindVersionIdInfoOptType, DocumentKindVersion > documentKindVersionCache ) 
		throws PersistenceException
	{
		int docAmounts = docInfos.size( );
		for ( int index = 0; index < docAmounts; ++index )
		{
			ArchiveDocumentInfo docInfo = docInfos.get( index );
			AUDDocumentKindVersionIdInfoOptType documentKindVersionIdInfo = docInfo.getEmbeddedDocument( ).getDocumentKindVersionIdInfoOpt( );
			DocumentKindVersion documentKindVersion = documentKindVersionCache.get( documentKindVersionIdInfo );
			
			if ( null == documentKindVersion )
			{
				log.info( 
					"Не найдена версия типа документа в контексте обработчика сообщения! '{}', '{}'", 
					documentKindVersionIdInfo.getAppliedDocumentKindId( ), 
					documentKindVersionIdInfo.getAppliedDocumentKindVersionId( ) 
				);
			}
			else
			{
				for ( AttributeVersion attributeVersion : documentKindVersion.getAttributeVersions( ) )
				{
					List< Object > extractedValues = attributeContentValues.get( attributeVersion.getId( ) );
					if ( null != extractedValues )
					{
						for ( Object value : extractedValues )
						{
							archiveManager.createAndSaveAttributeContent( attributeVersion, documents.get( index ), value );
						}
					}
					else
					{
						log.info( 
							"Для версии атрибута не обнаружены закэшированные xPath значения: id = '{}'", 
							attributeVersion.getId( ) 
						);
					}
				}
			}
		}
	}
	
	public static void saveProperties( ArchiveManager archiveManager, List< ArchiveDocumentInfo > extractedDocuments,
			List< Document > documents, AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws PersistenceException
	{
		saveProperties( archiveManager, extractedDocuments, documents, 
				MessageProcessingHelper.getExtractedValues( jobBatchContext, jobContext ), 
				MessageProcessingHelper.getDocumentKindVersionCache( jobBatchContext, jobContext ) );
	}
	
	@SuppressWarnings( "unchecked" )
	public static Map< AUDDocumentKindVersionIdInfoOptType, DocumentKindVersion > getDocumentKindVersionCache(  // NO_UCD (use private)
			AudJobBatchContext jobBatchContext, JobContext jobContext )
	{
		String documentKindVersionCacheName = jobContext.getString( AudContextConstants.DOCUMENT_KIND_VERSION_CACHE_NAME );
		Map< AUDDocumentKindVersionIdInfoOptType, DocumentKindVersion > cache = 
			( Map< AUDDocumentKindVersionIdInfoOptType, DocumentKindVersion >  ) jobBatchContext.get( documentKindVersionCacheName );
		
		if ( null == cache )
			log.info( "По ключу '{}' не найден кэш версий типов документов!", documentKindVersionCacheName );
		
		return cache;
	}
	
	@SuppressWarnings( "unchecked" )
	public static Map< String, List< Object > > getExtractedValues( AudJobBatchContext jobBatchContext, JobContext jobContext ) // NO_UCD (use private)
	{
		String collectionName = jobContext.getString( AudContextConstants.VALUE_COLLECTION_NAME );
		Map< String, List< Object > > values = ( Map< String, List<Object> > ) jobBatchContext.get( collectionName );
		
		if ( null == values )
			log.info( "По ключу '{}' не найдена коллекция значений xPath!", collectionName );
		
		return values;
	}
	
	public static Client getClient( AudJobBatchContext jobBatchContext ) 
		throws PersistenceException
	{
		AudEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		Client client = ( Client ) jobBatchContext.get( AudContextConstants.ARCHIVE_CLIENT );
		if ( null == client )
		{
			client = jobBatchContext.getServiceHolder( ).getClientService( ).getClientByAppliedId( recvEnv.getAudInfo( ).getArchiveClientId( ) );
			jobBatchContext.put( AudContextConstants.ARCHIVE_CLIENT, client );
		}
		
		return client;
	}
}
