package ru.acs.fts.eps2.failedMessages.supplementary;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.ibm.mq.jms.JMSC;
import com.ibm.mq.jms.MQQueue;

public class MessageSender
{
	private JmsTemplate _jmsTemplate;
	
	// @formatter:off
	@Required
	public void setJmsTemplate( JmsTemplate template ) { _jmsTemplate = template; }
	public JmsTemplate getJmsTemplate( ) { return _jmsTemplate; }
	// @formatter:on
	
	public static Destination getDestination( String queueName, String queueManagerName ) 
		throws JMSException
	{
		MQQueue mq = new MQQueue( );
		
		mq.setBaseQueueName( queueName );
		mq.setPersistence( 1 );
		mq.setBaseQueueManagerName( queueManagerName );
		mq.setTargetClient( JMSC.MQJMS_CLIENT_NONJMS_MQ );
		
		return mq;
	}
	
	public void sendMessage( final Message message, String queueName, String queueManagerName ) 
		throws JmsException, JMSException
	{
		_jmsTemplate.send( getDestination( queueName, queueManagerName ), new MessageCreator( )
		{
			@Override
			public Message createMessage( Session session ) throws JMSException
			{
				return message;
			}
		});
	}
}
