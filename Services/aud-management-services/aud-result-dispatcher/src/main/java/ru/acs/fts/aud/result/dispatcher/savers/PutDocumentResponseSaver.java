package ru.acs.fts.aud.result.dispatcher.savers;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudDocInfo;
import ru.acs.fts.aud.management.model.services.AudService;
import ru.acs.fts.aud.management.utils.shared.GenericUtils;
import ru.acs.fts.aud.management.utils.shared.StringUtils;
import ru.acs.fts.aud.rest.service.model.objects.AudEmbeddedDocumentArchiveInfo;
import ru.acs.fts.aud.rest.service.model.objects.AudMessage;
import ru.acs.fts.aud.rest.service.model.objects.AudPutDocumentResponse;
import ru.acs.fts.aud.rest.service.model.objects.AudResponseMetadata;
import ru.acs.fts.aud.service.model.defines.AudCommandStates;

public class PutDocumentResponseSaver implements IResponseSaver
{
	private static final Logger log = LoggerFactory.getLogger( PutDocumentResponseSaver.class );
	
	private AudService _audService;
	
	// @formatter:off
	@Required public void setAudService( AudService audService ) { _audService = audService; }
	public AudService getAudService( ) { return _audService; }
	// @formatter:on

	public void saveResponse( AudMessage msg, AudResponseMetadata metadata, EdeclAudCommand currentCommand ) 
		throws Exception
	{
		AudPutDocumentResponse response = metadata.getAudPutDocumentResponse( );
		if ( null == response )
		{
			String message = String.format(
				"Метаданные не содержат объект AudPutDocumentResponse! Сохранение невозможно. Сообщение %s",
				msg.getEnvelopeId( )
			);
			
			log.info( message );
			throw new Exception( message );
		}
		
		log.info( String.format(
			"Обработка PutDocumentResponse. Архивный идентификатор пакета %s", 
			response.getArchivePacketId( )
		) );
		
		currentCommand.getProcInfo( ).setPacketId( response.getArchivePacketId( ) );
		currentCommand.getProcInfo( ).setPkChangeDateTime( new GregorianCalendar( ) );

		if ( null == currentCommand.getProcInfo( ).getPkCreateDateTime( ) )
		{
			if ( null != response.getArchivePacketPutDateTime( ) )
				currentCommand.getProcInfo( ).setPkCreateDateTime( mapJodaDateTime( response.getArchivePacketPutDateTime( ) ) );
			else
				currentCommand.getProcInfo( ).setPkCreateDateTime( new GregorianCalendar( ) );
		}
		
		List< EdeclAudDocInfo > docInfos = _audService.getDocInfosByAudCommand( currentCommand.getGuid( ) );
		
		for( EdeclAudDocInfo di : docInfos )
		{
			log.info( String.format(
				"cmd: %s doc: %s",
				currentCommand.getGuid( ), di.getDocumentId( )
			) );
		}
		
		EdeclAudDocInfo mainDoc = processMainDocument( response, currentCommand, docInfos );
		processInnerDocuments( response, currentCommand, docInfos, mainDoc );

		_audService.merge( currentCommand.getProcInfo( ) );
	}

	private EdeclAudDocInfo processMainDocument( AudPutDocumentResponse response, EdeclAudCommand currentCommand, List< EdeclAudDocInfo > docInfos )
		throws Exception
	{
		EdeclAudDocInfo mainDoc = null;
		for ( EdeclAudDocInfo docInfo : docInfos )
		{
			if ( docInfo.getRefMainDoc( ).equalsIgnoreCase( docInfo.getDocumentId( ) ) )
			{
				mainDoc = docInfo;
				break;
			}
		}
		
		if ( null == mainDoc )
		{
			if ( 1 == docInfos.size( ) )
			{
				mainDoc = docInfos.get( 0 );
			}
			else
			{
				throw new Exception( String.format(
					"В базе данных в таблице EDECL_AUD_DOC_INFO не обнаружен корневой документ для команды %s",
					currentCommand.getGuid( )
				) );
			}
		}
		
		copyInformation( response, mainDoc );		
		
		return mainDoc;
	}
	
	private void processInnerDocuments( 
			AudPutDocumentResponse response, EdeclAudCommand currentCommand, 
			List< EdeclAudDocInfo > docInfos, EdeclAudDocInfo mainDoc )
		throws Exception
	{
		Set< String > innerDocIds = new HashSet< String >( );
		innerDocIds.add( mainDoc.getDocumentId( ) );
		
		if ( null != response.getEmbeddedDocumentInfos( ) && 0 != response.getEmbeddedDocumentInfos( ).size( ) )
		{
			for ( AudEmbeddedDocumentArchiveInfo edai : response.getEmbeddedDocumentInfos( ) )
			{
				if ( StringUtils.isNullOrEmpty( edai.getAppliedDocumentId( ) ) )
					continue ;
				
				EdeclAudDocInfo currentDocument = null;
				for ( EdeclAudDocInfo di : docInfos )
				{
					if ( di.getDocumentId( ).equalsIgnoreCase( edai.getAppliedDocumentId( ) ) )
					{
						currentDocument = di;
						break;
					}
				}
				
				if ( null == currentDocument )
				{
					throw new Exception( String.format(
						"В базе данных в таблице EDECL_AUD_DOC_INFO не обнаружен документ с идентификатором %s",
						edai.getAppliedDocumentId( )
					) );
				}
				
				copyInformation( response, edai, currentDocument );		
				innerDocIds.add( edai.getAppliedDocumentId( ) );
			}
		}
		
		for ( EdeclAudDocInfo di : docInfos )
		{
			if ( innerDocIds.contains( di.getDocumentId( ) ) )
				continue ;
			
			di.setState( AudCommandStates.PROCESSED );
			_audService.merge( di );
		}
	}
	
	private void copyInformation( AudPutDocumentResponse response, EdeclAudDocInfo doc )
	{
		setInformation(
			doc, response.getArchiveDocumentId( ),
			AudCommandStates.PROCESSED, response.getDocumentVersion( ),
			null, null, 
			response.getArchiveDocumentPutDateTime( )
		);
	}
	
	private void copyInformation( AudPutDocumentResponse response, AudEmbeddedDocumentArchiveInfo info, EdeclAudDocInfo doc )
	{
		setInformation(
			doc, info.getArchiveDocumentId( ),
			AudCommandStates.PROCESSED, info.getDocumentVersion( ),
			null, null,
			response.getArchiveDocumentPutDateTime( )
		);
	}
	
	private void setInformation( 
			EdeclAudDocInfo doc, String archiveDocumentId,
			String state, int version,
			String errorCode, String errorDescription,
			DateTime putDateTime )
	{
		log.info( String.format(
			"Обработка PutDocumentResponse: архивный идентификатор корневого документа %s",
			archiveDocumentId
		) );		

		doc.setState( state );
		doc.setArchDocId( archiveDocumentId );
		doc.setVersion( Integer.toString( version ) );
		doc.setErrorCode( errorCode );
		doc.setErrorDescription( errorDescription );
		
		if ( null != putDateTime )
			doc.setPutDateTime( mapJodaDateTime( putDateTime ) );
		else
			doc.setPutDateTime( new GregorianCalendar( ) );		
		
		_audService.merge( doc );
	}
	
	public static Calendar mapJodaDateTime( DateTime dt )
	{
		if ( null == dt )
			return null;
		
		return GenericUtils.ensureTimeZone( dt ).toGregorianCalendar( );
	}
}
