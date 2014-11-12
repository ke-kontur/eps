package ru.acs.fts.aud.router.supplementary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import ru.acs.fts.aud.router.model.managers.ServerSettingManager;
import ru.acs.fts.aud.router.model.managers.ServerStatisticManager;

public class AudApplicationListener implements ApplicationListener< ApplicationEvent >
{
	private static final Logger log = LoggerFactory.getLogger( AudApplicationListener.class );
	
	private ServerStatisticManager _serverStatisticManager;
	private ServerSettingManager _serverSettingManager;
	
	// @formatter:off
	@Required public void setServerStatisticManager( ServerStatisticManager manager ) { _serverStatisticManager = manager; }
	public ServerStatisticManager getServerStatisticManager( ) { return _serverStatisticManager; }
	
	@Required public void setServerSettingManager( ServerSettingManager manager ) { _serverSettingManager = manager; } 
	public ServerSettingManager getServerSettingManager( ) { return _serverSettingManager; }
	// @formatter:on
	
	@Override
	public void onApplicationEvent( ApplicationEvent event )
	{
		log.info( "Произошло событие (ApplicationListener): {}", event.getClass( ) );
		if ( event instanceof ContextRefreshedEvent )
		{
			try
			{
				_serverStatisticManager.init( );
				_serverSettingManager.init( );
			}
			catch ( Exception e )
			{
				log.info( "При инициализации менеджера статистики сервера произошла ошибка: {}", e.getMessage( ) );
			}
			
			log.info( "Контекст приложения обновлен." );
		}
	}
}
