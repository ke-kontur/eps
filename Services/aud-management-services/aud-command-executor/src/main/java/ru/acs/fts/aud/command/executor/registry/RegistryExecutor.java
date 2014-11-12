package ru.acs.fts.aud.command.executor.registry;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.command.executor.mappers.AudMessageMapper;
import ru.acs.fts.aud.command.executor.ws.AudWmqRestWs;
import ru.acs.fts.aud.management.model.entities.EdeclAudMessage;
import ru.acs.fts.aud.management.model.entities.EdeclAudSettings;
import ru.acs.fts.aud.management.model.services.AudService;
import ru.acs.fts.aud.rest.service.model.objects.AudMessage;
import ru.acs.fts.aud.rest.service.model.objects.AudRegistryRequest;

public class RegistryExecutor
{
	private static final Logger log = LoggerFactory.getLogger( RegistryExecutor.class );

	private static final String REGISTRY_UNLOCKED = "registry.unlocked";
	private static final String REGISTRY_END_DATE = "registry.end.date";
	private static final String REGISTRY_LOCK_DATE = "registry.lock.date";
	
	private AudService _audService;
	private AudWmqRestWs _audWmqRestWsClient;
	
	// @formatter:off
	@Required public void setAudService( AudService audService ) { _audService = audService; }
	public AudService getAudService( ) { return _audService; }
	
	@Required public void setAudWmqRestWsClient( AudWmqRestWs audWmqRestWsClient ) { _audWmqRestWsClient = audWmqRestWsClient; }
	public AudWmqRestWs getAudWmqRestWsClient( ) { return _audWmqRestWsClient; }
	// @formatter:on
	
	@Transactional
	public void execute( ) 
		throws Exception
	{
		// Шаг 1: Проверяем не заблокирован ли запрос реестра
		EdeclAudSettings set = _audService.getAudSettings( REGISTRY_UNLOCKED );
		if ( null != set && null != set.getValue( ) && ! Boolean.valueOf( set.getValue( ) ) )
		{
			log.info( "Запро реестра заблокирован. Ждем окончания блокировки" );
			
			set = _audService.getAudSettings( REGISTRY_LOCK_DATE );
			if ( null == set.getValue( ) || "".equals( set.getValue( ) ) )
			{
				set.setValue( new DateTime( ).toString( ) );
				_audService.merge( set );
				return ;
			}
			else
			{
				DateTime now = new DateTime( );
				DateTime lock = new DateTime( set.getValue( ) );
				if ( lock.isAfter( now ) )
				{
					set.setValue( now.toString( ) );
					_audService.merge( set );
					return ;
				}
				
				Interval interv = new Interval( lock, now );
				if ( interv.toDurationMillis( ) > 2 * 60 * 60 * 1000 )
				{
					set = _audService.getAudSettings( REGISTRY_UNLOCKED );
					set.setValue( Boolean.toString( true ) );
					_audService.merge( set );
					return ; 
				}
			}
			
			return ;
		}
		
		// Шаг 2: Извлекаем дату из настроек - это конечная дата
		set = _audService.getAudSettings( REGISTRY_END_DATE );
		DateTime endDate = new DateTime( );
		if ( null != set.getValue( ) && ! "".equals( set.getValue( ) ) )
			endDate = new DateTime( set.getValue( ) );
			
		// Шаг 3: Формируем начальную дату
		DateTime startDate = endDate.minusDays( 1 );
		
		// Шаг 4: Формируем запрос реестра
		AudRegistryRequest audrr = new AudRegistryRequest( );
		audrr.setDocDateTime( new DateTime( ) );
		audrr.setTestIndicator( false );
		audrr.setDateBegin( startDate );
		audrr.setDateStop( endDate );
		audrr.setDateIndicator( 0 );
		
		AudMessage msg = _audWmqRestWsClient.sendRegistryRequest( audrr );
		
		log.info( String.format(
			"Успешно передали запрос реестра WmqAudRouter'у, дата запроса %s", 
			audrr.getDocDateTime( ).toString( )
		) );
		
		AudMessageMapper.mapAudMessage( msg );
		
		log.info( String.format(
			"Успешно преобразовали ответ WmqAudRouter'а на запрос реестра, дата запроса %s", 
			audrr.getDocDateTime( ).toString( )
		) );
		
		// Шаг 5: Блокируем запрос реестра
		set = _audService.getAudSettings( REGISTRY_UNLOCKED );
		set.setValue( Boolean.toString( false ) );
		_audService.merge( set );
		
		set = _audService.getAudSettings( REGISTRY_LOCK_DATE );
		set.setValue( new DateTime( ).toString( ) );
		_audService.merge( set );
	}	
}
