package ru.acs.fts.eps2.balancer.dispatch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.jms.Message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.util.StopWatch;

import ru.acs.fts.eps2.balancer.exceptions.BalancerException;
import ru.acs.fts.eps2.balancer.exceptions.MessageDispatchException;
import ru.acs.fts.eps2.balancer.exceptions.MessageSenderException;
import ru.acs.fts.eps2.balancer.processing.Balancer;
import ru.acs.fts.eps2.balancer.processing.EpsDestination;
import ru.acs.fts.eps2.util.helpers.JmsConverter;
import ru.acs.fts.eps2.util.helpers.StopWatchHelper;
import ru.acs.fts.eps2.util.parser.EnvelopeParser;

public class BalancableDispatcher implements IMessageDispatcher
{
	private static final Logger log = LoggerFactory.getLogger( BalancableDispatcher.class );

	private Balancer _balancer;
	private EpsDestination _errorQueue;
	private EpsDestination _defaultEpsDestination;
	
	// @formatter:off
	@Required public void setBalancer( Balancer balancer ) { _balancer = balancer; }
	public Balancer getBalancer( ) { return _balancer; }
	
	@Required public void setErrorQueue( EpsDestination errorQueue ) { _errorQueue = errorQueue; }
	public EpsDestination getErrorQueue( ) { return _errorQueue; }
	
	@Required
	public void setDefaultEpsDestination( EpsDestination defaultEpsDestination ) { this._defaultEpsDestination = defaultEpsDestination; }
	public EpsDestination getDefaultEpsDestination( ) { return _defaultEpsDestination; }
	// @formatter:on
	
	public void dispatch( Message message ) 
		throws MessageDispatchException
	{
		byte[ ] bytes = null;
		try
		{
			StopWatch sw = new StopWatch( );
			
			sw.start( );
				bytes = JmsConverter.convert( message );
			sw.stop( );
			
			log.info( String.format(
				"Время преобразования MQ в байты: %s", StopWatchHelper.timeToString( sw ) 
			) );
			
			dispatch( bytes, message.getJMSMessageID( ) );
		}
		catch ( BalancerException be )
		{
			if ( be.getRollback( ) )
				throw new MessageDispatchException( ":(", be );
			
			log.info( "Зафиксировано BalancerException: {}. Отправляю сообщение в точку назначения по умолчанию.", be.getMessage( ) );
			try
			{
				if ( null == bytes )
				{
					String errorMsg = String.format( "Необходимо было отправить сообщение в точку по умолчанию, но байтовый массив еще не был получен: %s.", be.getMessage( ) );
					
					log.error( errorMsg, be );
					throw new MessageDispatchException( errorMsg, be );
				}
				
				_balancer.getMessageSender( ).send( bytes, _defaultEpsDestination );
			}
			catch ( MessageSenderException exc )
			{
				String errorMsg = String.format( "Не удалось отправить сообщение в точку назначания по умолчанию: %s.", exc.getMessage( ) );
				
				log.error( errorMsg, exc );
				throw new MessageDispatchException( errorMsg, exc );
			}
		}
		catch ( Exception exc )
		{
			String errorMsg = String.format(
				"Не удалось обработать сообщение: %s\nСообщение вызвавщее проблему: %s",
				exc.getMessage( ), message.toString( )
			);
				
			log.error( errorMsg, exc );
			throw new MessageDispatchException( errorMsg, exc );			
		}
	}

	public void discard( Message message ) throws MessageDispatchException
	{
		try
		{
			_balancer.getMessageSender( ).send( message, _errorQueue.getDestination( ), _errorQueue.getJmsTemplate( ) );
		}
		catch ( Exception exc )
		{
			String errorMsg = String.format(
				"Не удалось отбросить сообщение в очередь ошибочных: %s\nСообщение вызвавшее проблему: %s",
				exc.getMessage( ), message.toString( )
			);
			
			log.error( errorMsg, exc );
			throw new MessageDispatchException( errorMsg, exc );
		}
	}

	private void dispatch( byte[ ] message, String messageId )
		throws Exception
	{
		StopWatch sw = new StopWatch( );
		
		sw.start( );
		String data = new String( message, "UTF-8" );
		sw.stop( );
		log.info( String.format( 
			"Время получения строки: %s", StopWatchHelper.timeToString( sw ) 
		) );
		
		sw.start( );
		Set< String > toFetch = new HashSet< String >( );
		toFetch.addAll( Arrays.asList( new String[ ] {
			"EnvelopeID",
			"SoftVersion", "MessageType",
			"ReceiverCustoms.CustomsCode", "SenderCustoms.CustomsCode",
			"Heartbeat.Description"
		} ) );
		
		Map< String, String > fetched = EnvelopeParser.parseErrorMessage( data, toFetch );
		sw.stop( );
		log.info( String.format(
			"Время работы FSM: %s", StopWatchHelper.timeToString( sw ) 
		) );

		sw.start( );
		
		String softVersion = getValue( "SoftVersion", fetched );
		String receiverCustomsCode = getValue( "ReceiverCustoms.CustomsCode", fetched );
		String senderCustomsCode = getValue( "SenderCustoms.CustomsCode", fetched );
		String messageType = getValue( "MessageType", fetched );
		String envelopeId = getValue( "EnvelopeID", fetched );
		String heartbeatDescription = getValue( "Heartbeat.Description", fetched );
		
		String customsCode = receiverCustomsCode;
		if ( null == customsCode )
			customsCode = senderCustomsCode;
		
		if ( isNullOrEmpty( softVersion ) )
			throw new BalancerException( "Не задан SoftVersion в сообщении" );
		
		if ( isNullOrEmpty( customsCode ) )
			throw new BalancerException( "Не удалось найти хотя бы один код таможни (отправителя или получателя)" );

		_balancer.route( envelopeId, softVersion, messageType, customsCode, message, heartbeatDescription, messageId );
		
		sw.stop( );
		log.info( String.format(
			"Время балансировки и отправки куда надо: %s", StopWatchHelper.timeToString( sw ) 
		) );
		
	}
	
	private boolean isNullOrEmpty( String str )
	{
		return ( null == str || "".equals( str ) );
	}
	
	private String getValue( String key, Map< String, String > map )
	{
		if ( ! map.containsKey( key ) )
			return null;
		
		String value = map.get( key );
		if ( null == value || value.equals( "" ) )
			return null;
		
		return value;
	}
}
