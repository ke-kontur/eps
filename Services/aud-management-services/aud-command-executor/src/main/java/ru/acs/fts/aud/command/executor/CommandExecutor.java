package ru.acs.fts.aud.command.executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.command.executor.processors.BaseProcessor;
import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;
import ru.acs.fts.aud.management.model.services.AudService;
import ru.acs.fts.aud.management.utils.exceptions.ErrorHelper;
import ru.acs.fts.aud.service.model.defines.AudCommandStates;

public class CommandExecutor
{
	private static final Logger log = LoggerFactory.getLogger( CommandExecutor.class );
	
	private AudService _audService;
	
	private BaseProcessor _genericProcessor;
	
	// @formatter:off
	@Required public void setAudService( AudService audService ) { _audService = audService; }
	public AudService getAudService( ) { return _audService; }
	
	@Required public void setGenericProcessor( BaseProcessor genericProcessor ) { _genericProcessor = genericProcessor; }
	public BaseProcessor getGenericProcessor( ) { return _genericProcessor; }
	// @formatter:on
	
	
	@Transactional
	public void setProcessingState( EdeclAudCommand command )
	{
		command.setState( AudCommandStates.PROCESSING );
		_audService.merge( command );		
	}
	
	@Transactional
	public void processCommand( EdeclAudCommand command, int counter ) 
		throws Throwable
	{
		log.info( String.format(
			"%d: Приняли команду с идентификатором %d", 
			counter, command.getRecId( )
		) );
		
		try
		{
			boolean processedOk = _genericProcessor.processCommand( command );
			
			log.info( String.format( 
				"Обработали команду (%d), сохраняем изменения в БД, Результат: %s", 
				command.getRecId( ), processedOk ? "Успех" : "Трагедия"
			) );

			if ( processedOk )
			{
				// command.setState( AudCommandStates.PROCESSED );
				// _audService.merge( command );
				
				log.info( String.format( "Команду (%d) успешно сохранили", command.getRecId( ) ) );
			}			
		}
		catch ( Throwable exc )
		{
			log.info( String.format( "Ошибка обработки команды АЮД (%d)", command.getRecId( ) ), exc );
			
			try
			{
				log.info( String.format(
					"Устанавливаем статус обработки команды (%d) как ошибочный и сохраняем в БД",
					command.getRecId( )
				) );

				command.setState( AudCommandStates.ERROR );
				command.setIntError( ErrorHelper.getExceptionData( exc ) );
				_audService.merge( command );
				
				log.info( String.format( "Успешно сохранили команду (%d)", command.getRecId( ) ) );				
			}
			catch ( Throwable exc2 )
			{
				log.info( String.format(
					"Ошибка отката изменений команды (%d) и сохранения информации об ошибке. Упс... ALARM!!!",
					command.getRecId( )
				), exc2 );
				
				// откатываем нафиг транзакцию 
				throw exc2;
			}
		}
	}

}
