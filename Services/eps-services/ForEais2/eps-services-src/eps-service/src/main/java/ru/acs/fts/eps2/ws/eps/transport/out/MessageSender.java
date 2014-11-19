package ru.acs.fts.eps2.ws.eps.transport.out;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

public class MessageSender
{
	private static final Logger log = LoggerFactory.getLogger( MessageSender.class );
		
	private JmsTemplate _jmsTemplate;

	private Marshaller _marshaller;
	
	private String _extGateQueueManager;
	private String _extGateQueue;
		
	// @formatter:off
	@Required public void setJmsTemplate( JmsTemplate jmsTemplate ) { _jmsTemplate = jmsTemplate; }
	public JmsTemplate getJmsTemplate( ) { return _jmsTemplate; }
		
	@Required public void setMarshaller( Marshaller marshaller ) { _marshaller = marshaller; }
	public Marshaller getMarshaller( ) { return _marshaller; }
	
	@Required public void setExtGateQueueManager( String extGateQueueManager ) { _extGateQueueManager = extGateQueueManager; }
	public String getExtGateQueueManager( ) { return _extGateQueueManager; }
	
	@Required public void setExtGateQueue( String extGateQueue ) { _extGateQueue = extGateQueue; }
	public String getExtGateQueue( ) { return _extGateQueue; }
	// @formatter:on
		
	public void send( final EnvelopeType envelope ) 
		throws IOException, JmsException, JMSException
	{
		log.debug( "Отправляем конверт" );
			
		EnvelopeMarshaller marshaller = new EnvelopeMarshaller( );
		final byte[ ] bytes = marshaller.marshall( envelope, _marshaller, false );
			
		_jmsTemplate.send( getDestination( envelope ), new MessageCreator( )
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
		
	private Destination getDestination( final EnvelopeType envelope )
		throws JMSException
	{
		RoutingInfType rInfo = null;
		for ( Object obj : envelope.getHeader( ).getAnyList( ) )
		{
			if ( obj instanceof RoutingInfType )
			{
				rInfo = ( RoutingInfType )obj;
				break;
			}
		}
		
		if ( null == rInfo )
			return null;
		
		String receiverInfo = rInfo.getReceiverInformationList( ).get( 0 );

		MQQueue q = null;
		
		if ( receiverInfo.matches( "[wW][mM][qQ].*" ) )
		{
			Pattern p = Pattern.compile( "[wW][mM][qQ]:\\/\\/(.*)\\/(.*)" );
			Matcher m = p.matcher( receiverInfo );
			if ( ! m.find( ) )
				return null;
			
			q = new MQQueue( );
			
			q.setBaseQueueManagerName( m.group( 1 ) );
			q.setBaseQueueName( m.group( 2 ) );
		}
		else if ( receiverInfo.matches( "[sS][mM][tT][pP].*" ) )
		{
			q = new MQQueue( );
			
			q.setBaseQueueManagerName( _extGateQueueManager );
			q.setBaseQueueName( _extGateQueue );
		}
		else
			return null;
				
		q.setPersistence( 1 );
		q.setTargetClient( JMSC.MQJMS_CLIENT_NONJMS_MQ );
		
		log.info( String.format( 
			"Отправляем сообщение в базовый менеджер: %s базовую очередь: %s в очередь: %s",
			q.getBaseQueueManagerName( ), q.getBaseQueueName( ), q.getQueueName( ) 
		) );			
		
		return q;
	}
		
	private void fillJMSHeaders( final BytesMessage outputMessage ) 
		throws JMSException
	{
		outputMessage.setIntProperty( "JMS_IBM_Encoding", 546 );
		outputMessage.setIntProperty( "JMS_IBM_Character_Set", 1208 );
	}	
}
