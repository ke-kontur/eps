package ru.acs.fts.eps2.engine.transport.gateway.out;

import com.ibm.mq.constants.CMQC;
import com.ibm.mq.jms.MQQueue;
import com.ibm.msg.client.jms.JmsConstants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.transport.exceptions.TransportException;
import ru.acs.fts.eps2.engine.transport.routingInfo.CoaCodHeaders;
import ru.acs.fts.eps2.utils.StringUtil;

import javax.jms.*;

public class JMSMessageSender implements MessageSender
{
	private final Logger log = LoggerFactory.getLogger( JMSMessageSender.class );
	
	public void send( final byte[ ] message, Destination destination, final CoaCodHeaders cchd, JmsTemplate connection ) 
		throws TransportException
	{
		try
		{
			connection.send( destination, new MessageCreator( )
			{
				public Message createMessage( Session session ) 
					throws JMSException
				{
					final BytesMessage outputMessage = session.createBytesMessage( );
					outputMessage.writeBytes( message );
	
					if ( cchd != null )
						fillCoaCodHeaders( cchd, outputMessage );
	
					fillJMSHeaders( outputMessage );
					
					return outputMessage;
				}
			} );
		}
		catch ( Exception exc )
		{
			TransportException te = new TransportException( "Не удалось произвести отправку с помощью JMS", exc );
			te.setResultCode( ResultCodes._09_00007_01 );
			throw te;
		}
	}

	private void fillCoaCodHeaders( 
			final CoaCodHeaders coaCodheaders, final BytesMessage outputMessage ) 
		throws JMSException
	{
		StringBuilder ldb = new StringBuilder( );
		
		ldb.append( "coaCodheaders != null CorrelId=" );
		ldb.append( coaCodheaders.getCorrelId( ) );
		ldb.append( "; MsgId=" );
		ldb.append( coaCodheaders.getMsgId( ) );
		ldb.append( "; ReplyToQMgr" );
		ldb.append( coaCodheaders.getReplyToQueueManager( ) );
		ldb.append( "; ReplyToQ" );
		ldb.append( coaCodheaders.getReplyToQueue( ) );
		
		log.debug( ldb.toString( ) );
		
		/*
		outputMessage.setJMSCorrelationIDAsBytes( coaCodheaders.getCorrelId( ).getBytes( "UTF-8" ) );
		outputMessage.setJMSMessageID( coaCodheaders.getMsgId( ) );
		*/
		outputMessage.setJMSMessageID( coaCodheaders.getMsgId( ) );
		byte[ ] encodedEnvelopeId = StringUtil.convertObjectValueToDataValue( coaCodheaders.getCorrelId( ) );
		byte[ ] encodedCorrId = new byte[ encodedEnvelopeId.length + 1 ];
		System.arraycopy( encodedEnvelopeId, 0, encodedCorrId, 0, encodedEnvelopeId.length );
		outputMessage.setJMSCorrelationIDAsBytes( encodedCorrId );
		outputMessage.setIntProperty( JmsConstants.JMS_IBM_REPORT_PASS_CORREL_ID, CMQC.MQRO_PASS_CORREL_ID );
		
		MQQueue dest = new MQQueue( );
		dest.setBaseQueueManagerName( coaCodheaders.getReplyToQueueManager( ) );
		dest.setBaseQueueName( coaCodheaders.getReplyToQueue( ) );
		
		outputMessage.setJMSReplyTo( dest );
		
		byte fullDataFlag = 0;
		if ( coaCodheaders.getCoaNeed( ) )
		{
			if ( coaCodheaders.getCoaCodFullData( ) )
			{
				outputMessage.setIntProperty( "JMS_IBM_Report_COA", CMQC.MQRO_COA_WITH_FULL_DATA );
				fullDataFlag = 1;
			}
			else
				outputMessage.setIntProperty( "JMS_IBM_Report_COA", CMQC.MQRO_COA );
		}
		if ( coaCodheaders.getCodNeed( ) )
		{
			if ( coaCodheaders.getCoaCodFullData( ) )
			{
				outputMessage.setIntProperty( "JMS_IBM_Report_COD", CMQC.MQRO_COD_WITH_FULL_DATA );
				fullDataFlag = 1;
			}
			else
				outputMessage.setIntProperty( "JMS_IBM_Report_COD", CMQC.MQRO_COD );
		}
		outputMessage.getJMSCorrelationIDAsBytes( )[ encodedCorrId.length - 1 ] = fullDataFlag;
	}

	private void fillJMSHeaders( final BytesMessage outputMessage ) 
		throws JMSException
	{
		// outputMessage.setStringProperty("JMS_IBM_Format", "EDS");

		outputMessage.setIntProperty( "JMS_IBM_Encoding", 546 );
		outputMessage.setIntProperty( "JMS_IBM_Character_Set", 1208 );
		outputMessage.setJMSDeliveryMode( 1 );
	}

}
