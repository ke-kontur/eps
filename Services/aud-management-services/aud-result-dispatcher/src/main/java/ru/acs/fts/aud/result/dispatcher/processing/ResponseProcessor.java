package ru.acs.fts.aud.result.dispatcher.processing;

import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudDocInfo;
import ru.acs.fts.aud.management.model.entities.EdeclAudIntCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudMessage;
import ru.acs.fts.aud.management.model.entities.EdeclAudProcInfo;
import ru.acs.fts.aud.management.model.entities.EdeclAudRegistry;
import ru.acs.fts.aud.management.model.entities.EdeclAudRegistryDoc;
import ru.acs.fts.aud.management.model.entities.EdeclAudRegistryResult;
import ru.acs.fts.aud.management.model.services.AudService;
import ru.acs.fts.aud.management.utils.exceptions.ErrorHelper;
import ru.acs.fts.aud.management.utils.shared.GenericUtils;
import ru.acs.fts.aud.management.utils.shared.StringUtils;
import ru.acs.fts.aud.rest.service.model.objects.AudMessage;
import ru.acs.fts.aud.rest.service.model.objects.AudRegistry;
import ru.acs.fts.aud.rest.service.model.objects.AudRegistryDoc;
import ru.acs.fts.aud.rest.service.model.objects.AudRegistryResult;
import ru.acs.fts.aud.rest.service.model.objects.AudResponseMetadata;
import ru.acs.fts.aud.result.dispatcher.mappers.AudMessageMapper;
import ru.acs.fts.aud.result.dispatcher.savers.IResponseSaver;
import ru.acs.fts.aud.result.dispatcher.savers.RegistrySaver;
import ru.acs.fts.aud.service.model.defines.AudCommandStates;
import ru.acs.fts.aud.service.model.defines.MessageKinds;

public class ResponseProcessor
{
	private static final Logger log = LoggerFactory.getLogger( ResponseProcessor.class );
	
	private AudService _audService;
	
	private Map< String, String > _states;
	private Map< String, IResponseSaver > _savers;
	
	private RegistrySaver _registrySaver;
	
	// @formatter:off
	@Required public void setAudService( AudService audService ) { _audService = audService; }
	public AudService getAudService( ) { return _audService; }
	
	@Required public void setStates( Map< String, String > states ) { _states = states; }
	public Map< String, String > getStates( ) { return _states; }
	
	@Required public void setSavers( Map< String, IResponseSaver > savers ) { _savers = savers; }
	public Map< String, IResponseSaver > getSavers( ) { return _savers; }
	
	@Required public void setRegistrySaver( RegistrySaver registrySaver ) { _registrySaver = registrySaver; }
	public RegistrySaver getRegistrySaver( ) { return _registrySaver; }
	// @formatter:on

	@Transactional( propagation = Propagation.REQUIRED, timeout = 30000 )
	public void saveResponse( AudMessage msg, AudResponseMetadata metadata )
		throws Exception
	{
		log.info( String.format(
			"Начинаем сохранять ответ от АЮДа, сообщение %s",
			msg.getEnvelopeId( )
		) );
		
		// ? cmdId = null
		// ? exception = ""
		
		EdeclAudCommand currentCommand = null;
		try
		{
			/** Сохранять уведомление о доставке в команду не надо, для этого есть "AUD.PUT_DOC.RES" */
			if ( msg.getMessageKind( ).equals( MessageKinds.AUD_DELIVERY_NOTIFICATION ) )
			{
				EdeclAudMessage edeclMsg = AudMessageMapper.mapAudMessage( msg );
				_audService.persist( edeclMsg );
				
				log.info( String.format(
					"Сохраняем сообщение-уведомление о доставке документа в АЮД, сообщение %s",
					msg.getEnvelopeId( )
				) );
				return ;
			}
			else if ( msg.getMessageKind( ).equalsIgnoreCase( MessageKinds.AUD_REGISTRY_RES ) )
			{
				log.info( String.format(
					"Получили ответ на запрос реестра %s", msg.getEnvelopeId( )
				) );
				
				_registrySaver.processRegistry( msg, metadata );
				return ;
			}
						
			log.info( String.format(
				"Пришел ответ на сообщение с идентификатором %s", msg.getInitialEnvelopeId( )
			) );
			
			currentCommand = _audService.getAudCommandByOutEnvelopeId( msg.getInitialEnvelopeId( ) );
			
			if ( null == currentCommand )
			{
				log.info( String.format(
					"Не удалось найти команду по конверту %s",
					msg.getInitialEnvelopeId( )
				) );
				
				EdeclAudMessage imsg = _audService.getAudMessage( msg.getInitialEnvelopeId( ) );
				if ( null == imsg || null == imsg.getAudOutCommands( ) || 0 == imsg.getAudOutCommands( ).size( ) )
				{
					log.info( String.format(
						"Также не удалось найти команду через сообщение %s",
						msg.getInitialEnvelopeId( )
					) );
					return ;
				}
				
				currentCommand = imsg.getAudOutCommands( ).get( 0 );
			}
			
			log.info( String.format(
				"Пришел ответ на команду с идентификатором %d %s",
				currentCommand.getRecId( ), currentCommand.getGuid( )
			) );
			
			EdeclAudMessage edeclMsg = AudMessageMapper.mapAudMessage( msg );			
			
			currentCommand.setInEnvelope( edeclMsg );
			currentCommand.setDateTime( new GregorianCalendar( ) );
			currentCommand.setIntError( null );
			currentCommand.setErrDescription( null );
			currentCommand.setErrCode( null );
			
			String messageBodyObjectType = metadata.getDocumentType( );
			if ( ! StringUtils.isNullOrEmpty( messageBodyObjectType ) )
			{
				if ( _states.containsKey( messageBodyObjectType ) )
				{
					currentCommand.setState( _states.get( messageBodyObjectType ) );
					
					log.info( String.format(
						"Переводим команду с идентификатором %d в состояние %s",
						currentCommand.getRecId( ), currentCommand.getState( )
					) );
				}
				
				if ( _savers.containsKey( messageBodyObjectType ) )
				{
					_savers.get( messageBodyObjectType ).saveResponse( msg, metadata, currentCommand );
				}
			}
			
			_audService.merge( currentCommand );

			if ( ! msg.getMessageKind( ).equalsIgnoreCase( MessageKinds.AUD_ERROR ) )
			{
				byte[ ] nullxBytes = "nullx".getBytes( Charset.forName( "UTF-8" ) );
				EdeclAudMessage message = currentCommand.getOutEnvelope( );
				if ( null != message )
				{
					message.setBody( nullxBytes );
					_audService.merge( message );
				}	
				
				message = currentCommand.getInEnveope( );
				if ( null != message )
				{
					message.setBody( nullxBytes );
					_audService.merge( message );
				}
			}
			
			log.info( String.format(
				"Успешно обработали результат, сообщение %s", msg.getEnvelopeId( )
			) );
		}
		catch ( Exception exc )
		{
			log.error( "Не удалось сохранить результат", exc );
			
			if ( msg.getMessageKind( ).equalsIgnoreCase( MessageKinds.AUD_DELIVERY_NOTIFICATION ) )
			{
				log.info( String.format(
					"Не удалось сохранить уведомление о доставке, сообщение %s. Обидно, печально, но ладно - не критично.",
					msg.getEnvelopeId( )
				) );
				
				return ;
			}

			try
			{
				if ( null == currentCommand )
					currentCommand = _audService.getAudCommandByOutEnvelopeId( msg.getInitialEnvelopeId( ) ); 
				
				if ( null == currentCommand )
					throw new Exception( "Не удалось получить команду", exc );

				currentCommand.setIntError( ErrorHelper.getExceptionData( exc ) );
				currentCommand.setState( AudCommandStates.ERROR_RESPONSE );
				
				_audService.merge( currentCommand );
			}
			catch ( Exception exc2 )
			{
				log.error( "В процессе обработки ошибки произошла ошибка. Печально. Откатываем транзакцию", exc2 );
				throw exc2;
			}
		}
	}
	
	/*
	private void saveToAjdTables( AudMessage msg, AudResponseMetadata metadata, EdeclAudCommand currentCommand )
		throws Exception
	{
		EdeclAudIntCommand intCommand = currentCommand.getIntCmd( );
		currentCommand.setState( AudCommandStates.PROCESSED );
		
		EdeclAudRegistry audRegistry = null;
		try
		{
			log.info( String.format(
				"Проведем выборку записей реестра, внутренняя команда существует %s",
				( null == intCommand ) ? "нет" : "да"
			) );
						
			audRegistry = _audService.getAudRegistry( intCommand.getRegId( ) );
			if ( null == audRegistry )
			{
				throw new Exception( String.format(
					"Отсутствует объект реестра для внутренней команды %d, для ответного сообщения на сообщение %s",
					intCommand.getRecId( ), msg.getInitialEnvelopeId( )
				) );
			}
			
			// AUDRegistryResponseType document
			
			audRegistry.setCurrStatus( AudCommandStates.PROCESSED );
			audRegistry.setSetStatusDate( new GregorianCalendar( ) );
			
			AudRegistry reg = metadata.getAudRegistry( );
			audRegistry.setNullFlag( reg.getNullFlag( ) );
	
			for ( AudRegistryResult arr : reg.getResults( ) )
			{
				EdeclAudRegistryResult earr = new EdeclAudRegistryResult( );
				
				earr.setArchPacketId( arr.getArchPacketId( ) );
				earr.setAudRegistry( audRegistry );
				earr.setPacketPutDateTime( ( null != arr.getPacketPutDateTime( ) ) ? arr.getPacketPutDateTime( ).toGregorianCalendar( ) : null );
				earr.setPacketType( arr.getPacketType( ) );
				earr.setAppPacketId( arr.getAppPacketId( ) );
				earr.setAppPacketDescription( arr.getAppPacketDescription( ) );
				
				_audService.persist( earr );
				
				for ( AudRegistryDoc doc : arr.getDocs( ) )
				{
					EdeclAudRegistryDoc edoc = new EdeclAudRegistryDoc( );
					
					edoc.setActualFlag( doc.getActualFlag( ) );
					edoc.setAppDocDescr( doc.getAppDocDescr( ) );
					edoc.setAppDocumentId( doc.getAppDocumentId( ) );
					edoc.setAppDocumentModeId( doc.getAppDocumentModeId( ) );
					edoc.setArchPacketId( doc.getArchPacketId( ) );
					edoc.setArchRefMainDoc( doc.getArchRefMainDoc( ) );
					edoc.setArchDocumentId( doc.getArchDocumentId( ) );
					edoc.setArchVersion( doc.getArchVersion( ) );
					
					_audService.persist( edoc );					
				}
			}
			
			_audService.merge( audRegistry );
		}
		catch ( Exception exc )
		{
			log.error( String.format(
				"Не удалось сохранить информацию в реестр для команды %d", 
				currentCommand.getRecId( ) ), exc
			);
			
			try
			{
				audRegistry.setCurrStatus( AudCommandStates.ERROR );
				audRegistry.setSetStatusDate( new GregorianCalendar( ) );
				_audService.merge( audRegistry );
				
				currentCommand.setState( AudCommandStates.ERROR_RESPONSE );
				currentCommand.setIntError( ErrorHelper.getExceptionData( exc ) );
				_audService.merge( currentCommand );
			}
			catch ( Exception exc2 )
			{
				log.error( String.format(
					"Не удалось сохранить информацию об ошибке в команду %d. Откатываем транзакцию", 
					currentCommand.getRecId( ) ), exc2 
				);
				
				throw exc2;
			}
		}
	}
	*/
	
	private byte[ ] getBytes( String string )
	{
		return null == string ? null : string.getBytes( Charset.forName( "UTF-8" ) );
	}

	public static Calendar mapJodaDateTime( DateTime dt )
	{
		if ( null == dt )
			return null;
		
		return GenericUtils.ensureTimeZone( dt ).toGregorianCalendar( );
	}
}
