package ru.acs.fts.eps2.router.processing.ead;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.configuration.RtuCodePatternsHolder;
import ru.acs.fts.eps2.engine.data.kind.ArchiveDocumentStatuses;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs_WithContent;
import ru.acs.fts.eps2.model.entities.Edarch_Reqinfo;
import ru.acs.fts.eps2.model.entities.Edarch_Reqinfo_Ids;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.persistence.EDServiceHolder;
import ru.acs.fts.eps2.router.processing.EDConfigurator;
import ru.acs.fts.eps2.router.processing.ead.exceptions.EadException;
import ru.acs.fts.eps2.router.processing.ead.mappers.EadToTransportMapper;
import ru.acs.fts.eps2.router.processing.ead.mappers.FromEadMapper;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.ed_container.ContainerDocType;
import ru.acs.fts.schemas.album.ed_container.DocBodyType;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.album.result.ResultType;

public class EadRequester
{
	private static final Logger log = LoggerFactory.getLogger( EadRequester.class );
	
	public static boolean isLocalEAD( 
			String archId, String archDocId, 
			EDConfigurator configurator )
	{
		if ( null == archId || null == archDocId )
			return true;
		
		String[ ] parts = archDocId.split( "-" );
		if ( parts.length < 2 )
			return true; // тут мы возвращаем true, т.к. это старый ID, и поэтому ЭАД локальный
		
		RtuCodePatternsHolder rtuCodes = configurator.getRtuPatternsHolder( );
		if ( rtuCodes.match( parts[ 0 ] ) )
			return true;
		
		return false;
	}	
	
	public static EadResponse checkDocument( // NO_UCD (unused code)
			EadRequest request,
			EDServiceHolder serviceHolder ) 
		throws DatabaseException
	{
		Edarch_Archive_Docs documentRecord = serviceHolder.getEdarchService( )
			.getDocument( request.getArchId( ), request.getArchDocId( ) );
	
		EadResponse response = null;
		if ( null == documentRecord )
			response = FromEadMapper.mapFailedEadResponse( ResultCodes._03_00106_03 );
		else
			response = FromEadMapper.mapEadResponse( documentRecord );

		return response;
	}
	
	public static EadResponse fetchDocument( // NO_UCD (use private)
			EadRequest request,
			EDServiceHolder serviceHolder ) 
		throws DatabaseException, ResultTypeException
	{
		Edarch_Archive_Docs initDoc = serviceHolder.getEdarchService( )
			.getDocument( request.getArchId( ), request.getArchDocId( ) );
		
		Edarch_Archive_Docs documentRecord = serviceHolder.getEdarchOperator( )
			.getActualDocumentByPrevious( initDoc, new HashMap< String, Object >( ) );
		
		if ( null == documentRecord )
			return FromEadMapper.mapFailedEadResponse( ResultCodes._03_00106_03 );
		
		EadResponse resp = ensureAlbumVersion( documentRecord, serviceHolder );
		if ( null != resp )
			return resp;
		
		Edarch_Archive_Docs_WithContent documentData = serviceHolder.getEdarchService( )
			.getDocumentWithContent( documentRecord.getArdocArchIdinternal( ), documentRecord.getArdocIdinternal( ) );

		if ( null == documentData )
			return FromEadMapper.mapFailedEadResponse( ResultCodes._03_00106_03 );
		
		if ( null != documentRecord.getArdocStageStatus( ) )
		{
			if ( documentRecord.getArdocStageStatus( ).equals( ArchiveDocumentStatuses.DOC_NEW_ACTUAL ) )
				documentRecord.setArdocStageStatus( ArchiveDocumentStatuses.DOC_ACTIVE_ACTUAL );
			else if ( documentRecord.getArdocStageStatus( ).equals( ArchiveDocumentStatuses.DOC_NEW_EXPIRE ) )
				documentRecord.setArdocStageStatus( ArchiveDocumentStatuses.DOC_ACTIVE_EXPIRE );
		}
		else
		{
			documentRecord.setArdocStageStatus( ArchiveDocumentStatuses.DOC_ACTIVE_ACTUAL );
		}
		
		return FromEadMapper.mapEadResponse( documentRecord, documentData );
	}		

	public static Edarch_Reqinfo fetchReqInfo( // NO_UCD (use private)
			EadRequest request,
			EDServiceHolder serviceHolder ) 
		throws DatabaseException
	{
		Edarch_Reqinfo_Ids ids = new Edarch_Reqinfo_Ids( );
		ids.setReqEnvId( request.getReqEnvId( ) );
		ids.setIdInternal( request.getArchId( ) );
		ids.setArdocIdInternal( request.getArchDocId( ) );
		
		Edarch_Reqinfo reqInfo = serviceHolder.getEdarchService( ).getReqInfo( ids );
		
		if ( null == reqInfo )
			return null;
		
		return reqInfo;
	}		

	public static void checkAndFetchEadDocuments(
			List< EadRequest > requests,
			EadRequest2Results results,
			boolean throwExceptionOnFail,
			EDServiceHolder serviceHolder ) 
		throws Exception
	{
		int successDocuments = 0;
				
		for ( EadRequest request : requests )
		{
			if ( ! request.checkArchId( ) )
			{
				EadResponse response = FromEadMapper.mapFailedEadResponse( ResultCodes._03_00106_02 );
				results.getMappings( ).put( request, response );
				continue;
			}
			
			if ( ! request.checkArchDocId( ) )
			{
				EadResponse response = FromEadMapper.mapFailedEadResponse( ResultCodes._03_00106_02 );
				results.getMappings( ).put( request, response );
				continue;
			}

			EadResponse response = fetchDocument( request, serviceHolder );
			results.getMappings( ).put( request, response );
			
			successDocuments++;
		}
		
		if ( successDocuments != requests.size( ) && throwExceptionOnFail )
		{
			throw new EadException(
				"Имеются документы описи, которых не обнаружено в Электронном Архиве Декларанта",
				EadToTransportMapper.createErrorDocument_NoRef( results, serviceHolder ).getDocumentAsClass( ResultType.class )
			);
		}
	}

	public static void checkReqInfo(
			List< EadRequest > requests,
			EadRequest2Reqinfo results,
			EDServiceHolder serviceHolder ) 
		throws Exception
	{
		for ( EadRequest request : requests )
		{
			if ( ! request.checkArchId( ) )
			{
				results.getMappings( ).put( request, null );
				continue;
			}
			
			if ( ! request.checkArchDocId( ) )
			{
				results.getMappings( ).put( request, null );
				continue;
			}

			Edarch_Reqinfo reqInfo = fetchReqInfo( request, serviceHolder );
			results.getMappings( ).put( request, reqInfo );
		}
	}

	public static EDContainerType createContainer(
			String refDocumentId, List< Object > additionalDocuments,
			EadRequest2Results results ) 
	{
		EDContainerType newContainer = new EDContainerType( );    		
		newContainer.setDocumentModeID( DocumentModeIDs.ED_CONTAINER );
		newContainer.setFullSetIndicator( null );
		newContainer.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		newContainer.setRefDocumentID( refDocumentId );

		List< ContainerDocType > containerDocs = new ArrayList< ContainerDocType >( );
		// int order = 1;
		
		ContainerDocType containerDoc = null;
		DocBodyType docBody = null;

		for ( Object adoc : additionalDocuments )
		{
			containerDoc = new ContainerDocType( );
			// containerDoc.setOrder( BigInteger.valueOf( order++ ) );
			
			docBody = new DocBodyType( );
			docBody.setAny( adoc );
			
			containerDoc.setDocBody( docBody );
			containerDocs.add( containerDoc );
		}
		
		Map< EadRequest, EadResponse > mappings = results.getMappings( );
		for ( EadRequest request : mappings.keySet( ) )
		{
			EadResponse response = mappings.get( request );
			
			containerDoc = new ContainerDocType( );
			// containerDoc.setOrder( BigInteger.valueOf( order++ ) );
			
			docBody = new DocBodyType( );
			
			byte[] data = response.getDocData( );
			
			XStringMarshallableClass xstr = new XStringMarshallableClass( );
			xstr.setEncoding( Configurator.WORKING_ENCODING );
			xstr.setByteArray( data );
			
			try
			{
				xstr.stripSignature( );
			}
			catch ( Exception exc )
			{
				log.info( "Не удалось снять подпись с документа из ЭАДа", exc );
			}
						
			docBody.setAny( xstr );
			
			containerDoc.setDocBody( docBody );
			containerDocs.add( containerDoc );
		}
		
		newContainer.setContainerDocList( containerDocs );
		
		return newContainer;
	}
	
	private static EadResponse ensureAlbumVersion( Edarch_Archive_Docs documentRecord, EDServiceHolder serviceHolder ) 
		throws DatabaseException
	{
		if ( ! StringUtil.isNullOrEmpty( documentRecord.getArdocAlbumVersion( ) ) )
			return null;
		
		EnvelopeService eserv = serviceHolder.getEnvelopeService( );
		
		Edecl_Msg_Doc doc = eserv.getDocument( documentRecord.getArdocDocumentid( ) );
		
		if ( null == doc )
			return FromEadMapper.mapFailedEadResponse( ResultCodes._03_00106_10 );
		
		if ( ! StringUtil.isNullOrEmpty( doc.getRefMainDoc( ) ) )
			doc = eserv.getDocument( doc.getRefMainDoc( ) );
		
		if ( null == doc )
			return FromEadMapper.mapFailedEadResponse( ResultCodes._03_00106_10 );
		
		Edecl_Messages msg = eserv.getEnvelopeByDocumentId( doc.getDocumentID( ) );
		
		if ( null == msg || StringUtil.isNullOrEmpty( msg.getSoftVersion( ) ) )
			return FromEadMapper.mapFailedEadResponse( ResultCodes._03_00106_10 );
		
		String[ ] parts = msg.getSoftVersion( ).split( "/" );
		if ( null == parts || 0 == parts.length )
			return FromEadMapper.mapFailedEadResponse( ResultCodes._03_00106_10 );
		
		documentRecord.setArdocAlbumVersion( parts[ 0 ] );
		return null;
	}
}
