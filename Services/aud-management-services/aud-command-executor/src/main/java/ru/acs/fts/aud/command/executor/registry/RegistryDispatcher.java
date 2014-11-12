package ru.acs.fts.aud.command.executor.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

public class RegistryDispatcher
{
	private static final Logger log = LoggerFactory.getLogger( RegistryDispatcher.class );
	
	private RegistryExecutor _registryExecutor;
	
	// @formatter:off
	@Required public void setRegistryExecutor( RegistryExecutor registryExecutor ) { _registryExecutor = registryExecutor; }
	public RegistryExecutor getRegistryExecutor( ) { return _registryExecutor; }
	// @formatter:on
	
	public void dispatch( )
	{
		try
		{
			log.info( "Начинаем формирование запроса реестра из АЮД" );
			
			_registryExecutor.execute( );
			
			log.info( "Закончили формирование запроса реестра из АЮД" );
		}
		catch ( Exception exc )
		{
			log.info( "Ошибка при формировании запроса реестра из АЮД", exc );
		}
	}
}
