package ru.acs.fts.eps2.router.tasks;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.model.entities.RzdSendCommands;
import ru.acs.fts.eps2.model.services.RzdService;
import ru.acs.fts.eps2.router.persistence.EDServiceHolder;

public class RzdPollingTask
{
	private static final Logger log = LoggerFactory.getLogger( RzdPollingTask.class );
	
	private EDServiceHolder _serviceHolder;
	private RzdSendCommandProcessor _processor;
	
	// @formatter:off
	@Required
	public void setServiceHolder( EDServiceHolder serviceHolder ) { _serviceHolder = serviceHolder; }
	public EDServiceHolder getServiceHolder( ) { return _serviceHolder; }
	
	@Required
	public void setProcessor( RzdSendCommandProcessor processor ) { _processor = processor; }
	public RzdSendCommandProcessor getProcessor( ) { return _processor; }
	// @formatter:on
	
	public void execute( ) 
		throws Exception
	{
		log.info( "Начата задача поиска и выполнения команд." );
		RzdService rzdService = _serviceHolder.getRzdService( );
		List< RzdSendCommands > sendCommands = rzdService.getWaitableRzdSendCommands( _processor.getConfigurator( ).getSoftVersion( ) );
		
		if ( null != sendCommands && ! sendCommands.isEmpty( ) )
		{
			while ( ! sendCommands.isEmpty( ) )
			{
				RzdSendCommands command = sendCommands.remove( 0 );
				_processor.tryToProcess( command );
			}
		}
		else
			log.info( "Команды для обработки не найдены." );
		
		log.info( "Задача обработки команд выполнена." );
	}
}
