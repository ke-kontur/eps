package ru.acs.fts.aud.command.dispatcher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.command.dispatcher.interfaces.ICommandProcessor;
import ru.acs.fts.aud.management.model.entities.EdeclAudIntCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudMsgType;
import ru.acs.fts.aud.management.model.services.AudService;
import ru.acs.fts.aud.service.model.defines.AudCommandStates;

public class CommandDispatcher
{
	private static final Logger log = LoggerFactory.getLogger( CommandDispatcher.class );
	
	private Map< String, ICommandProcessor > _commandProcessors;	
	private AudService _audService;
	private CommandExecutor _commandExecutor;
	
	// @formatter:off
	@Required public void setCommandProcessors( Map< String, ICommandProcessor > commandProcessors ) { _commandProcessors = commandProcessors; }
	public Map< String, ICommandProcessor > getCommandProcessors( ) { return _commandProcessors; }
	
	@Required public void setAudService( AudService audService ) { _audService = audService; }
	public AudService getAudService( ) { return _audService; }
	
	@Required public void setCommandExecutor( CommandExecutor commandExecutor ) { _commandExecutor = commandExecutor; }
	public CommandExecutor getCommandExecutor( ) { return _commandExecutor; }
	// @formatter:on
	
	@Transactional
	public void init( )
	{	
		log.info( "Инициализируем CommandDispatcher" );
		
		List< EdeclAudMsgType > audMsgTypes = _audService.getAllAudMsgTypes( );
		
		Map< String, ICommandProcessor > messageProcessors = new HashMap< String, ICommandProcessor >( );
		
		messageProcessors.clear( );
		for ( EdeclAudMsgType audMsgType : audMsgTypes )
		{
			ICommandProcessor cmdProc = _commandProcessors.get( audMsgType.getProcessType( ) );
			if ( null != cmdProc )
				messageProcessors.put( audMsgType.getMsgType( ), cmdProc );
		}
		
		_commandExecutor.setMessageProcessors( messageProcessors );
		
		log.info( "CommandDispatcher успешно инициализирован" );
	}
	
	public void dispatch( )
	{
		try
		{
			log.info( "Начинаем обработку внутренних команд от электрички" );
			
			List< Integer > intCommandsIds = _audService.getUnprocessedIntCommandIds( );
			for ( Integer id : intCommandsIds )
			{
				if ( null == id )
					continue;
				
				EdeclAudIntCommand intCommand = _audService.getAudIntCommand( id );
				if ( null == intCommand )
				{
					log.info( String.format( "Не удалось извлечь из базы int-команду с идентификатором: %d", id ) );
					continue;
				}
				
				if ( ! intCommand.getState( ).equalsIgnoreCase( AudCommandStates.WAITABLE ) )
					continue;
				
				_commandExecutor.setProcessingState( intCommand );
				_commandExecutor.processCommand( intCommand );
			}
			
			log.info( "Закончили обработку внутренних команд от электрички" );
		}
		catch ( Throwable exc )
		{
			log.info( "Ошибка при обработке команд", exc );
		}
	}
}
