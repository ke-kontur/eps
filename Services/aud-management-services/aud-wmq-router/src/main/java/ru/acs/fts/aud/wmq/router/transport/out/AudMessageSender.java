package ru.acs.fts.aud.wmq.router.transport.out;

import java.io.IOException;

import javax.jms.BytesMessage;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.oxm.Marshaller;

import com.ibm.mq.jms.MQQueue;
import com.ibm.msg.client.wmq.v6.jms.internal.JMSC;

import ru.acs.fts.aud.wmq.router.jndi.SettingsWrapper;
import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.schemas.envelope.EnvelopeType;

public class AudMessageSender
{
	private static final Logger log = LoggerFactory.getLogger( AudMessageSender.class );
	
	private JmsTemplate _jmsTemplate;

	private SettingsWrapper _settingsWrapper;
	
	private Marshaller _marshaller;
	
	// @formatter:off
	@Required public void setJmsTemplate( JmsTemplate jmsTemplate ) { _jmsTemplate = jmsTemplate; }
	public JmsTemplate getJmsTemplate( ) { return _jmsTemplate; }
	
	@Required public void setSettingsWrapper( SettingsWrapper settingsWrapper ) { _settingsWrapper = settingsWrapper; }
	public SettingsWrapper getSettingsWrapper( ) { return _settingsWrapper; }
	
	@Required public void setMarshaller( Marshaller marshaller ) { _marshaller = marshaller; }
	public Marshaller getMarshaller( ) { return _marshaller; }
	// @formatter:on
	
	public void sendToAud( EnvelopeType envelope ) 
		throws IOException, JmsException, JMSException
	{
		log.debug( "Отправляем конверт" );
		
		EnvelopeMarshaller marshaller = new EnvelopeMarshaller( );
		final byte[ ] bytes = marshaller.marshall( envelope, _marshaller, false );
		
		_jmsTemplate.send( getDestination( ), new MessageCreator( )
		{
			public Message createMessage( Session session ) 
				throws JMSException
			{
				final BytesMessage outputMessage = session.createBytesMessage( );
				outputMessage.writeBytes( bytes );

				fillJMSHeaders( outputMessage );
				
				log.debug( "Сформировали сообщение на отправку" );
				
				return outputMessage;
			}
		} );
	}
	
	public void setToError( final Message message ) 
		throws JmsException, JMSException
	{
		log.debug( "Отправляем сообщение в очередь ошибочных" );
		
		_jmsTemplate.send( getErrorDestination( ), new MessageCreator( )
		{
			public Message createMessage( Session session )
			{
				return message;
			}
		} );
	}
	
	private Destination getDestination( )
		throws JMSException
	{
		MQQueue q = new MQQueue( );
		
		q.setBaseQueueManagerName( _settingsWrapper.getSettings( ).getQueueManagerToSend( ) );
		q.setBaseQueueName( _settingsWrapper.getSettings( ).getQueueToSend( ) );
		q.setPersistence( 1 );
		q.setTargetClient( JMSC.MQJMS_CLIENT_NONJMS_MQ );
				
		return q;
	}
	
	private Destination getErrorDestination( ) 
		throws JMSException
	{
		MQQueue q = new MQQueue( );
		
		q.setBaseQueueManagerName( _settingsWrapper.getSettings( ).getQueueManagerError( ) );
		q.setBaseQueueName( _settingsWrapper.getSettings( ).getQueueError( ) );
		q.setPersistence( 1 );
		q.setTargetClient( JMSC.MQJMS_CLIENT_NONJMS_MQ );
		
		return q;
	}
	
	private void fillJMSHeaders( final BytesMessage outputMessage ) 
		throws JMSException
	{
		outputMessage.setIntProperty( "JMS_IBM_Encoding", 546 );
		outputMessage.setIntProperty( "JMS_IBM_Character_Set", 1208 );
	}	
}
