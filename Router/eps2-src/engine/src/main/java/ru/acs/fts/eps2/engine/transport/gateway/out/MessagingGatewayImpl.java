package ru.acs.fts.eps2.engine.transport.gateway.out;

import java.util.Map;

import javax.jms.Destination;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.jms.core.JmsTemplate;

import com.ibm.mq.jms.MQQueue;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.transport.exceptions.TransportException;

public class MessagingGatewayImpl implements MessagingGateway
{
	private final Logger log = LoggerFactory.getLogger( MessagingGatewayImpl.class );

	private JmsTemplate _outgoingConnection;
	private Map< String, Destination > _predefinedQueues;
	
	private MessageSender _sender = new JMSMessageSender( );
			
	// @formatter:off
	@Required public void setOutgoingConnection( JmsTemplate outgoingConnection ) { _outgoingConnection = outgoingConnection; }
	public JmsTemplate getOutgoingConnection( ) { return _outgoingConnection; }
	
	@Required public void setPredefinedQueues( Map< String, Destination > predefinedQueues ) { _predefinedQueues = predefinedQueues; }
	public Map< String, Destination > getPredefinedQueues( ) { return _predefinedQueues; }
	// @formatter:on

	public void sendMessage( Envelope envelope ) 
		throws TransportException
	{
		try
		{
			MQQueue qq = ( MQQueue )envelope.getMqRoutingInfo( ).getDestination( );
			
			log.info( String.format( 
				"Отправляем сообщение %s в базовый менеджер: %s базовую очередь: %s в очередь: %s",
				envelope.getEnvelopeID( ),
				qq.getBaseQueueManagerName( ), qq.getBaseQueueName( ), qq.getQueueName( ) 
			) );

			_sender.send( 
				envelope.getData( ), 
				envelope.getMqRoutingInfo( ).getDestination( ), 
				envelope.getCoaCodHeaders( ), 
				_outgoingConnection 
			);
		}
		catch ( Exception exc )
		{
			TransportException te = new TransportException( "Маршаллинг сообщения не удался", exc );
			te.setResultCode( ResultCodes._09_00005_05 );
			throw te;			
		}
	}
	
	public void sendMessage( byte[ ] message, String errorQueue ) 
		throws TransportException
	{
		try
		{
			Destination dest = _predefinedQueues.get( errorQueue );
			if ( null == dest )
				throw new Exception( String.format( "Нет такой ошибочной очереди: %s", errorQueue ) );
			
			MQQueue qq = ( MQQueue )dest;
			
			log.info( String.format( 
				"Отправляем сообщение в базовый менеджер: %s базовую очередь: %s в очередь: %s",
				qq.getBaseQueueManagerName( ), qq.getBaseQueueName( ), qq.getQueueName( ) 
			) );

			_sender.send( message, dest, null, _outgoingConnection );
		}
		catch ( Exception exc )
		{
			TransportException te = new TransportException( "Маршаллинг сообщения не удался", exc );
			te.setResultCode( ResultCodes._09_00005_05 );
			throw te;						
		}
	}
}
