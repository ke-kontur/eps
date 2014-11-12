package ru.acs.fts.aud.command.executor;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;
import ru.acs.fts.aud.management.model.services.AudService;
import ru.acs.fts.aud.service.model.defines.AudCommandStates;

public class CommandDispatcher
{
	private static final Logger log = LoggerFactory.getLogger( CommandDispatcher.class );
	
	private AudService _audService;
	
	private CommandExecutor _commandExecutor;
	
	private int _batchSize;
	
	// @formatter:off
	@Required public void setAudService( AudService audService ) { _audService = audService; }
	public AudService getAudService( ) { return _audService; }
	
	@Required public void setCommandExecutor( CommandExecutor commandExecutor ) { _commandExecutor = commandExecutor; }
	public CommandExecutor getCommandExecutor( ) { return _commandExecutor; }
	
	@Required public void setBatchSize( int batchSize ) { _batchSize = batchSize; }
	public int getBatchSize( ) { return _batchSize; }
	// @formatter:on
	
	@Transactional
	public void init( )
	{	
		log.info( "Инициализируем CommandDispatcher" );
		
		// do nothing yet ...
		
		log.info( "CommandDispatcher успешно инициализирован" );
	}
	
	public void dispatch( )
	{
		try
		{
			log.info( "Начинаем обработку внутренних команд от электрички" );
			
			int counter = 0;
			List< Integer > intCommandsIds = _audService.getUnprocessedCommandIds( );
			for ( Integer id : intCommandsIds )
			{
				if ( null == id )
					continue;
				if ( counter > _batchSize )
					break;
				
				EdeclAudCommand command = _audService.getAudCommand( id );
				if ( null == command )
				{
					log.info( String.format( "Не удалось извлечь из базы команду с идентификатором: %d", id ) );
					continue;
				}
				
				if ( ! command.getState( ).equalsIgnoreCase( AudCommandStates.WAITABLE ) )
					continue;
				
				_commandExecutor.setProcessingState( command );
				_commandExecutor.processCommand( command, counter );
				
				counter++;
			}
			
			log.info( "Закончили обработку внутренних команд от электрички" );
		}
		catch ( Throwable exc )
		{
			log.info( "Ошибка при обработке команд", exc );
		}
	}
}
