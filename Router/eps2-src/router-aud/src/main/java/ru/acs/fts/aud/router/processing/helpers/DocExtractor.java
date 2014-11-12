package ru.acs.fts.aud.router.processing.helpers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.router.objects.AudDocument;
import ru.acs.fts.aud.router.processing.definitions.DocumentModeIDs;
import ru.acs.fts.aud.router.processing.definitions.ErrorMessageSourceKeys;
import ru.acs.fts.aud.router.processing.exceptions.ArchiveException;
import ru.acs.fts.aud.router.processing.marshalling.ConditionalUnmarshaller;
import ru.acs.fts.aud.router.processing.spec.ArchiveDocumentInfo;
import ru.acs.fts.aud.router.utils.StringUtil;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.schemas.album.ed_container.ContainerDocType;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.aud.aud_putdocumentrequest.AUDPutDocumentRequestType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentInfoWithVersionRefType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentWithBodyType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentBodyType;
import ru.acs.fts.schemas.envelope.SignatureType;

public class DocExtractor
{
	private static final Logger log = LoggerFactory.getLogger( DocExtractor.class );

	private static ConditionalUnmarshaller _conditionalUnmarshaller;
	
	// @formatter:off
	@Required public void setConditionalUnmarshaller( ConditionalUnmarshaller conditionalUnmarshaller ) { _conditionalUnmarshaller = conditionalUnmarshaller; }
	public ConditionalUnmarshaller getConditionalUnmarshaller( ) { return _conditionalUnmarshaller; }
	// @formatter:on
	
	/** (mrdekk) Проанализировано. Необходимые доработки указаны 
	 * @throws Exception 
	 */
	public static List< ArchiveDocumentInfo > extractDocuments( AUDPutDocumentRequestType request ) 
		throws Exception
	{
		List< ArchiveDocumentInfo > documents = new ArrayList< ArchiveDocumentInfo >( );
		AUDAppliedDocumentWithBodyType appliedDocumentWithBody = request.getAppliedDocumentWithBody( );
		AUDDocumentBodyType documentBody = appliedDocumentWithBody.getDocumentBody( );
	
		/**
		 * Следует иметь ввиду, что в случае Conditional Unmarshalling 
		 * вложенный документ может быть XStringMarshallableClass
		 */
		SignatureType signature = null;
		if ( null != documentBody )
		{
			try
			{
				signature = ( SignatureType ) documentBody.getAny( );
			}
			catch ( Exception ex )
			{
				log.error( "Не удалось получить подпись из элемента AUDAppliedDocumentWithBody из запроса на хранение документа", ex );				
				ExceptionHelper.throwWrongDsigException( ErrorMessageSourceKeys.ERROR_WDSIG_1005 );
			}
		}
		else
		{
			if ( StringUtil.isNullOrEmpty( request.getRefArchivePacketId( ) ) )
				ExceptionHelper.throwValidationException( ErrorMessageSourceKeys.ERROR_FORMAT_1001 );
		}
		
		AUDAppliedDocumentInfoWithVersionRefType appliedDocumentInfoWithVersionRef = new AUDAppliedDocumentInfoWithVersionRefType( );
		appliedDocumentInfoWithVersionRef.setAppliedDocumentId( appliedDocumentWithBody.getAppliedDocumentId( ) );
		appliedDocumentInfoWithVersionRef.setDocumentKindVersionIdInfoOpt( appliedDocumentWithBody.getDocumentKindVersionIdInfoOpt( ) );
		appliedDocumentInfoWithVersionRef.setDescription( appliedDocumentWithBody.getDescription( ) );
		
		/**
		 * В случае Conditional Unmarshalling
		 * typeof( obj ) => XStringMarshallableClass
		 */
		Object obj = signature.getObject( ).getAny( );
		
		if ( null != signature && 
			 StringUtil.isNullOrEmpty( appliedDocumentInfoWithVersionRef.getDocumentKindVersionIdInfoOpt( ).getAppliedDocumentKindVersionId( ) ) )
		{
			AudDocument tmp = new AudDocument( obj );
			
			String documentModeId = tmp.getDocumentModeID( );			
			String namespace = tmp.getXmlNamespace( );
			
			appliedDocumentInfoWithVersionRef.getDocumentKindVersionIdInfoOpt( ).setAppliedDocumentKindId( documentModeId );
			appliedDocumentInfoWithVersionRef.getDocumentKindVersionIdInfoOpt( ).setAppliedDocumentKindVersionId( namespace );
			appliedDocumentInfoWithVersionRef.setPrevVersionArchiveDocumentId( request.getPrevVersionArchiveDocumentId( ) );
			
			documents.add( new ArchiveDocumentInfo( tmp.getDocumentID( ), namespace, signature, appliedDocumentInfoWithVersionRef ) );
		}
		else
		{
			appliedDocumentInfoWithVersionRef.setPrevVersionArchiveDocumentId( request.getPrevVersionArchiveDocumentId( ) );
			String documentId = null;
			String namespace = null;
			if ( null != obj )
			{
				AudDocument tmp = new AudDocument( obj );
				
				documentId = tmp.getDocumentID( );
				namespace = tmp.getXmlNamespace( );
			}
			documents.add( new ArchiveDocumentInfo( documentId, namespace, signature, appliedDocumentInfoWithVersionRef ) );
		}
		
		if ( null != documentBody && isContainer( obj )  )
		{
			fillArchiveDocumentInfos( documents, request.getEmbeddedDocumentAppliedInfoList( ), signature );
		}
		
		return documents;
	}
	
	/**
	 * В случае Conditional Unmarshalling у нас нет прикладных документов электрички, поэтому
	 * нет и EDContainerType. Поэтому придется работать с xml как xml. 
	 */
	private static < T extends AUDAppliedDocumentInfoType > void fillArchiveDocumentInfos( 
			List< ArchiveDocumentInfo > documentInfos, 
			List< T > embeddedDocuments, SignatureType signature ) 
		throws ArchiveException
	{
		try
		{
			Object obj = signature.getObject( ).getAny( );
			
			if ( obj instanceof XStringMarshallableClass )
			{
				XStringMarshallableClass xstr = ( XStringMarshallableClass )obj;
				List< ConditionalUnmarshaller.ContainerDocument > cdocs = _conditionalUnmarshaller.extractDocuments( xstr );
				for ( ConditionalUnmarshaller.ContainerDocument cdoc : cdocs )
				{
					AudDocument tmp = new AudDocument( cdoc.document );
					
					String documentId = tmp.getDocumentID( );
					boolean found = false;
					
					for ( AUDAppliedDocumentInfoType embeddedDoc : embeddedDocuments )
					{
						if ( documentId.equals( embeddedDoc.getAppliedDocumentId( ) ) )
						{
							String namespace = tmp.getXmlNamespace( );
							if ( StringUtil.isNullOrEmpty( embeddedDoc.getDocumentKindVersionIdInfoOpt( ).getAppliedDocumentKindVersionId( ) ) )
							{
								embeddedDoc.getDocumentKindVersionIdInfoOpt( ).setAppliedDocumentKindVersionId( namespace );
							}
							
							documentInfos.add( new ArchiveDocumentInfo( documentId, namespace, cdoc.signature, embeddedDoc ) );
							found = true;
							break;
						}
					}
					
					if ( ! found )
						throw new Exception( "Не найден соответсвующий AUDAppliedDocumentInfoWithVersionRefType" );					
				}
			}
			else
			{
				EDContainerType container = ( EDContainerType ) signature.getObject( ).getAny( );
				for ( ContainerDocType containerDoc : container.getContainerDocList( ) )
				{
					SignatureType containerDocSignature = ( SignatureType ) containerDoc.getDocBody( ).getAny( );
					
					AudDocument tmp = new AudDocument( containerDocSignature );
					
					String documentId = tmp.getDocumentID( );
					
					boolean found = false;
					
					for ( AUDAppliedDocumentInfoType embeddedDoc : embeddedDocuments )
					{
						if ( documentId.equals( embeddedDoc.getAppliedDocumentId( ) ) )
						{
							String namespace = tmp.getXmlNamespace( );
							if ( StringUtil.isNullOrEmpty( embeddedDoc.getDocumentKindVersionIdInfoOpt( ).getAppliedDocumentKindVersionId( ) ) )
							{
								embeddedDoc.getDocumentKindVersionIdInfoOpt( ).setAppliedDocumentKindVersionId( namespace );
							}
							
							documentInfos.add( new ArchiveDocumentInfo( documentId, namespace, containerDocSignature, embeddedDoc ) );
							found = true;
							break;
						}
					}
					
					if ( ! found )
						throw new Exception( "Не найден соответсвующий AUDAppliedDocumentInfoWithVersionRefType" );
				}
			}
		}
		catch ( Exception ex )
		{
			log.info( "", ex );
			ExceptionHelper.throwXmlException( ErrorMessageSourceKeys.ERROR_XML_1008, ex.getMessage( ) );
		}
	}
	
	private static boolean isContainer( Object obj )
	{
		if ( obj instanceof XStringMarshallableClass )
		{
			XStringMarshallableClass xstr = ( XStringMarshallableClass )obj;
			try
			{
				if ( xstr.getDocumentModeID( ).equalsIgnoreCase( DocumentModeIDs.ED_CONTAINER ) )
					return true;
				
				return false;
			}
			catch ( Exception exc )
			{
				log.error( "", exc );
			}
		}
		
		return ( obj instanceof EDContainerType );
	}
	
}
