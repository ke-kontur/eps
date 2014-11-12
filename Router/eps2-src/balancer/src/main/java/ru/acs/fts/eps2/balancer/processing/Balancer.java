package ru.acs.fts.eps2.balancer.processing;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

import ru.acs.fts.eps2.balancer.exceptions.BalancerException;
import ru.acs.fts.eps2.balancer.exceptions.MessageSenderException;
import ru.acs.fts.eps2.balancer.transport.out.IMessageSender;

public class Balancer
{
	private static final Logger log = LoggerFactory.getLogger( Balancer.class );
	
	private static final int MAX_LOAD = Integer.MAX_VALUE - 1000;
	private static final String HEARTBEAT_MESSAGE_TYPE = "PVR.00003";
	
	private String _description;
	private Map< String, List< EpsDestination > > _routes;
	private IMessageSender _messageSender;
	private boolean _useHeartbeat;
	private HeartbeatNotifier _heartbeatNotifier;
	private DefaultMessageListenerContainer _listenerContainer = null;
	
	// @formatter:off
	@Required public void setDescription( String description ) { _description = description; }
	public String getDescription( ) { return _description; }
	
	@Required public void setRoutes( Map< String, List< EpsDestination > > routes ) { _routes = routes; }
	public Map< String, List< EpsDestination > > getRoutes( ) { return _routes; }
	
	@Required public void setMessageSender( IMessageSender messageSender ) { _messageSender = messageSender; }
	public IMessageSender getMessageSender( ) { return _messageSender; }
	
	@Required public void setUseHeartbeat( boolean useHeartbeat ) { _useHeartbeat = useHeartbeat; }
	public boolean getUseHeartbeat( ) { return _useHeartbeat; }
	
	@Required public void setHeartbeatNotifier( HeartbeatNotifier heartbeatNotifier ) { _heartbeatNotifier = heartbeatNotifier; }
	public HeartbeatNotifier getHeartbeatNotifier( ) { return _heartbeatNotifier; }
	
	public void setListenerContainer( DefaultMessageListenerContainer listenerContainer ) { _listenerContainer = listenerContainer; }
	public DefaultMessageListenerContainer getListenerContainer( ) { return _listenerContainer; }
	// @formatter:on
	
	public void route( String envelopeId, String softVersion, String messageType, String customsCode, byte[ ] message, String heartbeatDescription, String messageId )
		throws BalancerException
	{
		if ( messageType.equalsIgnoreCase( HEARTBEAT_MESSAGE_TYPE ) )
		{
			if ( _useHeartbeat && null != heartbeatDescription && 0 != heartbeatDescription.length( ) )
				_heartbeatNotifier.processHeartbeat( softVersion, heartbeatDescription );
			
			return ;
		}
		
		List< EpsDestination > destinations = _routes.get( softVersion );
		if ( null == destinations || 0 == destinations.size( ) )
		{
			String errorMsg = String.format(
				"[EnvelopeID: %s] Для версии %s не определены направления, куда можно передать сообщение.",
				envelopeId, softVersion
			);
			
			log.error( errorMsg );
			throw new BalancerException( errorMsg );
		}
		
		if ( _useHeartbeat )
			checkAllDestinations( destinations );
		
		for ( EpsDestination destination : destinations )
		{
			if ( _useHeartbeat && ! destination.isEnabled( ) )
				continue;
			
			if ( destination.getLoad( ) >= MAX_LOAD )
			{
				resetLoads( destinations );
				break;
			}
		}
		
		long minimalLoad = Long.MAX_VALUE;
		EpsDestination minimalLoadDestination = null;
		long averageLoadNumerator = 0;
		long averageLoadDenominator = 0;
		
		for ( EpsDestination dest : destinations )
		{			
			if ( _useHeartbeat && ! dest.isEnabled( ) )
				continue;
			
			if ( dest.getLoad( ) < minimalLoad )
			{
				minimalLoad = dest.getLoad( );
				minimalLoadDestination = dest;
			}
			
			averageLoadNumerator += dest.getLoad( );
			averageLoadDenominator++;
		}
		
		long averageLoad = ( 0 != averageLoadDenominator ) ? averageLoadNumerator / averageLoadDenominator : 0;
		
		EpsDestination destination = null;
		for ( EpsDestination dest : destinations )
		{
			if ( _useHeartbeat && ! dest.isEnabled( ) )
				continue;
			
			if ( dest.getCustomsCodes( ).contains( customsCode ) )
			{
				destination = dest;
				break;
			}
		}
		
		/** Перебалансируем если надо */
		if ( null != destination && destinations.size( ) > 1 )
		{
			if ( destination.getLoad( ) > ( 3 * averageLoad / 2 ) )
			{
				destination.getCustomsCodes( ).remove( customsCode );
				destination = null;
			}
		}
		
		if ( _useHeartbeat && null == destination && null == minimalLoadDestination )
		{
			String msg = String.format( "[Envelope: %s] Нет доступных целей, откатываем транзакцию", envelopeId ); 
			log.info( msg );
			
			if ( null != _listenerContainer )
				_listenerContainer.stop( );
			
			BalancerException exc = new BalancerException( msg );
			exc.setRollback( true );
			throw exc;
		}
		
		if ( null == destination )
		{
			destination = minimalLoadDestination;
			destination.getCustomsCodes( ).add( customsCode );
		}
		
		destination.addLoad( 1 );

		log.info( String.format(
			"Сообщение %s[Envelope: %s; JMSMessageID = %s] версии %s для (от) ТО %s было отправлено в точку <%s>",
			messageType, envelopeId, messageId, softVersion, customsCode, destination.getDescription( )
		) );
		
		try
		{
			_messageSender.send( message, destination );
		}
		catch ( MessageSenderException exc )
		{
			destination.disable( );
			
			BalancerException bexc = new BalancerException( exc );
			bexc.setRollback( true );
			throw bexc;
		}
	}
	
	private void resetLoads( List< EpsDestination > destinations )
	{
		for ( EpsDestination destination : destinations )
			destination.setLoad( 0 );
	}
	
	public void processHeartbeat( String softVersion, String heartbeatDescription ) // NO_UCD (use default)
	{
		if ( ! _useHeartbeat )
			return ;
		if ( null != _listenerContainer )
			_listenerContainer.start( );
		
		log.info( String.format(
			"Обрабатываем сообщение сердцебиения, softVersion: %s, heartbeatDescription: %s",
			softVersion, heartbeatDescription 
		) );
		
		List< EpsDestination > routes = _routes.get( softVersion );
		if ( null == routes || 0 == routes.size( ) )
		{
			log.info( String.format( "Целей для такой версии %s нет, поэтому обработку заканчиваем...", softVersion ) );
			return ;
		}
		
		boolean shouldResetLoads = false;
		
		for ( EpsDestination destination : routes )
		{
			if ( destination.getDescription( ).startsWith( heartbeatDescription ) )
			{
				boolean old = destination.isEnabled( );
				destination.heartbeat( );
				
				if ( ! old && destination.isEnabled( ) )
					shouldResetLoads = true;
			}
		}
		
		if ( shouldResetLoads )
			resetLoads( routes );
	}
	
	private void checkAllDestinations( List< EpsDestination > destinations )
	{
		for ( EpsDestination destination : destinations )
		{
			destination.check( );
		}
	}
	
	public void dump( ) // NO_UCD (use default)
	{
		StringBuilder bld = new StringBuilder( );
		
		bld.append( "\n" );
		bld.append( String.format( "Карта маршрутизации, балансер: %s, использует сердцебиение: %s\n", _description, _useHeartbeat ? "да" : "нет" ) );
		
		for ( String softVersion : _routes.keySet( ) )
		{
			bld.append( String.format( "\tВерсия %s\n", softVersion ) );
			List< EpsDestination > destinations = _routes.get( softVersion );
			for ( EpsDestination dest : destinations )
			{
				bld.append( String.format( "\t\tЦель %s, загрузка: %d, включен: %s, коды ТО: ", dest.getDescription( ), dest.getLoad( ), dest.isEnabled( ) ? "да" : "нет" ) );
				for ( String customsCode : dest.getCustomsCodes( ) )
				{
					bld.append( String.format( "%s, ", customsCode ) );
				}
				bld.append( "\n" );
			}
		}
		
		bld.append( "\n" );
		
		log.info( bld.toString( ) );
	}
}
