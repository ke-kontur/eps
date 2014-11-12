package ru.acs.fts.aud.result.dispatcher.savers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudDocInfo;
import ru.acs.fts.aud.management.model.services.AudService;
import ru.acs.fts.aud.management.utils.shared.StringUtils;
import ru.acs.fts.aud.rest.service.model.objects.AudEmbeddedDocumentResultInfo;
import ru.acs.fts.aud.rest.service.model.objects.AudError;
import ru.acs.fts.aud.rest.service.model.objects.AudMessage;
import ru.acs.fts.aud.rest.service.model.objects.AudResponseMetadata;
import ru.acs.fts.aud.service.model.defines.AudCommandStates;

public class ErrorDocumentSaver implements IResponseSaver
{
	private static final Logger log = LoggerFactory.getLogger( ErrorDocumentSaver.class );
	
	private AudService _audService;
	
	// @formatter:off
	@Required public void setAudService( AudService audService ) { _audService = audService; }
	public AudService getAudService( ) { return _audService; }
	// @formatter:on

	public void saveResponse( AudMessage msg, AudResponseMetadata metadata, EdeclAudCommand currentCommand ) 
		throws Exception
	{
		AudError response = metadata.getAudError( );
		if ( null == response )
		{
			String message = String.format(
				"Метаданные не содержат объект AudError! Сохранение невозможно. Сообщение %s",
				msg.getEnvelopeId( )
			);
			
			log.info( message );
			throw new Exception( message );
		}
		
		List< EdeclAudDocInfo > docInfos = _audService.getDocInfosByAudCommand( currentCommand.getGuid( ) );
		
		EdeclAudDocInfo mainDoc = processMainDocument( response, currentCommand, docInfos );
		processInnerDocuments( response, currentCommand, docInfos, mainDoc );

		_audService.merge( currentCommand.getProcInfo( ) );
	}

	private EdeclAudDocInfo processMainDocument( AudError response, EdeclAudCommand currentCommand, List< EdeclAudDocInfo > docInfos )
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
			AudError response, EdeclAudCommand currentCommand, 
			List< EdeclAudDocInfo > docInfos, EdeclAudDocInfo mainDoc )
		throws Exception
	{
		Set< String > innerDocIds = new HashSet< String >( );
		innerDocIds.add( mainDoc.getDocumentId( ) );
		
		if ( null != response.getEmbeddedDocsResultInfos( ) && 0 != response.getEmbeddedDocsResultInfos( ).size( ) )
		{
			for ( AudEmbeddedDocumentResultInfo edri : response.getEmbeddedDocsResultInfos( ) )
			{
				if ( StringUtils.isNullOrEmpty( edri.getAppliedDocumentId( ) ) )
					continue;
				
				EdeclAudDocInfo currentDocument = null;
				for ( EdeclAudDocInfo di : docInfos )
				{
					if ( di.getDocumentId( ).equalsIgnoreCase( edri.getAppliedDocumentId( ) ) )
					{
						currentDocument = di;
						break;
					}
				}
				
				if ( null == currentDocument )
				{
					throw new Exception( String.format(
						"В базе данных в таблице EDECL_AUD_DOC_INFO не обнаружен документ с идентификатором %s",
						edri.getAppliedDocumentId( )
					) );
				}
				
				copyInformation( response, edri, currentDocument );
				innerDocIds.add( edri.getAppliedDocumentId( ) );
			}
		}
		
		for ( EdeclAudDocInfo di : docInfos )
		{
			if ( innerDocIds.contains( di.getDocumentId( ) ) )
				continue ;
			
			di.setState( AudCommandStates.ERROR );
			di.setErrorCode( "09.96669.99" );
			di.setErrorDescription( "Неопознанная ошибка. АЮД об этом документе ничего не сообщил." );
			_audService.merge( di );
		}
	}
		
	
	private void copyInformation( AudError response, EdeclAudDocInfo doc )
	{
		String errorCode = "09.96669.99";
		String description = "Неопознанная ошибка";
		
		if ( null != response.getResultInfos( ) && 0 != response.getResultInfos( ).size( ) )
		{
			errorCode = response.getResultInfos( ).get( 0 ).getResultCode( );
			description = response.getResultInfos( ).get( 0 ).getDescription( );
		}
		
		setInformation(
			doc,
			AudCommandStates.ERROR_RESPONSE, errorCode, description 
		);
	}
	
	private void copyInformation( AudError response, AudEmbeddedDocumentResultInfo info, EdeclAudDocInfo doc )
	{
		String errorCode = "09.96669.99";
		String description = "Неопознанная ошибка";
		
		if ( null != info.getResultInfos( ) && 0 != info.getResultInfos( ).size( ) )
		{
			errorCode = info.getResultInfos( ).get( 0 ).getResultCode( );
			description = info.getResultInfos( ).get( 0 ).getDescription( );
		}
		
		setInformation(
			doc,
			AudCommandStates.ERROR_RESPONSE, errorCode, description 
		);
	}
	
	private void setInformation(
			EdeclAudDocInfo doc,
			String state, String errorCode, String errorDescription )
	{
		doc.setState( state );
		doc.setErrorCode( errorCode );
		doc.setErrorDescription( errorDescription );
		
		_audService.merge( doc );
	}
	
}
