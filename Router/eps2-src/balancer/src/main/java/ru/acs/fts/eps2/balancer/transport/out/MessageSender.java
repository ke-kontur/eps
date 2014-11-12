package ru.acs.fts.eps2.balancer.transport.out;

import javax.jms.BytesMessage;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;

import com.ibm.mq.jms.MQQueue;

import ru.acs.fts.eps2.balancer.exceptions.MessageSenderException;
import ru.acs.fts.eps2.balancer.processing.EpsDestination;

public class MessageSender implements IMessageSender
{
	private static final Logger log = LoggerFactory.getLogger( MessageSender.class );

	public void send( byte[ ] message, EpsDestination destination ) 
		throws MessageSenderException
	{
		try
		{
			MQQueue qq = ( MQQueue )destination.getDestination( );
			
			log.info( String.format( 
				"Отправляем сообщение в базовый менеджер: %s базовую очередь: %s в очередь: %s",
				qq.getBaseQueueManagerName( ), qq.getBaseQueueName( ), qq.getQueueName( ) 
			) );
				
			destination.getJmsTemplate( )
				.send( destination.getDestination( ), getMessageCreator( message ) );
		}
		catch ( Exception exc )
		{
			String errorMsg = "Не удалось отправить сообщение в точку получения";
			
			log.error( errorMsg, exc );
			throw new MessageSenderException( errorMsg, exc );
		}
	}
	
	public void send( final Message message, Destination destination, JmsTemplate jmsTemplate ) 
		throws MessageSenderException
	{
		try
		{
			jmsTemplate.send( destination, new org.springframework.jms.core.MessageCreator( )
			{
				public Message createMessage( Session arg0 ) throws JMSException
				{
					return message;
				}				
			} );		
		}
		catch ( Exception exc )
		{
			String errorMsg = "Не удалось отправить сообщение в указанную точку получения";
			
			log.error( errorMsg, exc );
			throw new MessageSenderException( errorMsg, exc );
		}
	}
	
	private org.springframework.jms.core.MessageCreator getMessageCreator( final byte[ ] message )
	{
		return new org.springframework.jms.core.MessageCreator( )
		{
			public Message createMessage( Session session ) throws JMSException
			{
				final BytesMessage outputMessage = session.createBytesMessage( );
				outputMessage.writeBytes( message );

				fillJMSHeaders( outputMessage );
				
				return outputMessage;
			}
		};
	}
	
	private void fillJMSHeaders( final BytesMessage outputMessage ) 
		throws JMSException
	{
		// outputMessage.setStringProperty("JMS_IBM_Format", "EDS");

		outputMessage.setIntProperty( "JMS_IBM_Encoding", 546 );
		outputMessage.setIntProperty( "JMS_IBM_Character_Set", 1208 );
	}
}
