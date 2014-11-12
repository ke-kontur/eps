package ru.acs.fts.aud.command.dispatcher;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.command.dispatcher.interfaces.ICommandProcessor;
import ru.acs.fts.aud.management.model.entities.EdeclAudIntCommand;
import ru.acs.fts.aud.management.model.services.AudService;
import ru.acs.fts.aud.management.utils.shared.StringUtils;
import ru.acs.fts.aud.service.model.defines.AudCommandStates;

public class CommandExecutor
{
	private static final Logger log = LoggerFactory.getLogger( CommandExecutor.class );
	
	private Map< String, ICommandProcessor > _messageProcessors = new HashMap< String, ICommandProcessor >( );	
	
	private AudService _audService;
	
	// @formatter:off
	public void setMessageProcessors( Map< String, ICommandProcessor > messageProcessors ) { _messageProcessors = messageProcessors; }
	public Map< String, ICommandProcessor > getMessageProcessors( ) { return _messageProcessors; }
	
	@Required public void setAudService( AudService audService ) { _audService = audService; }
	public AudService getAudService( ) { return _audService; }
	// @formatter:on
	
	
	@Transactional
	public void setProcessingState( EdeclAudIntCommand intCommand )
	{
		intCommand.setState( AudCommandStates.PROCESSING );
		_audService.merge( intCommand );		
	}
	
	@Transactional
	public void processCommand( EdeclAudIntCommand intCommand ) 
		throws Exception
	{
		log.info( String.format(
			"Приняли команду с идентификатором %d, типом сообщения %s, идентификатором документа %s",
			intCommand.getRecId( ), intCommand.getMsgCode( ), intCommand.getDocumentId( )
		) );
		
		try
		{
			boolean processedOk = false;
			
			if ( ! StringUtils.isNullOrEmpty( intCommand.getRegId( ) ) )
			{
				processedOk = _messageProcessors.get( ICommandProcessor.REGISTRY_REQUEST )
					.processCommand( intCommand );
			}
			else
			{
				processedOk = _messageProcessors.get( intCommand.getMsgCode( ) )
					.processCommand( intCommand );
			}
			
			log.info( String.format( 
				"Обработали команду (%d), сохраняем изменения в БД, Результат: %s", 
				intCommand.getRecId( ), processedOk ? "Успех" : "Трагедия"
			) );

			if ( processedOk )
			{
				intCommand.setState( AudCommandStates.PROCESSED );
				_audService.merge( intCommand );
				
				log.info( String.format( "Команду (%d) успешно сохранили", intCommand.getRecId( ) ) );
			}			
		}
		catch ( Exception exc )
		{
			log.error( String.format( "Ошибка обработки внутренней команды от электрички (%d)", intCommand.getRecId( ) ), exc );
			
			try
			{
				log.info( String.format(
					"Устанавливаем статус обработки команды (%d) как ошибочный и сохраняем в БД",
					intCommand.getRecId( )
				) );

				intCommand.setState( AudCommandStates.ERROR );
				intCommand.setIntError( exc.toString( ).getBytes( "UTF-8" ) );
				_audService.merge( intCommand );
				
				log.info( String.format( "Успешно сохранили команду (%d)", intCommand.getRecId( ) ) );				
			}
			catch ( Exception exc2 )
			{
				log.error( String.format(
					"Ошибка отката изменений команды (%d) и сохранения информации об ошибке. Упс... ALARM!!!",
					intCommand.getRecId( )
				), exc2 );
				
				// откатываем нафиг транзакцию 
				throw exc2;
			}
		}
	}

}
