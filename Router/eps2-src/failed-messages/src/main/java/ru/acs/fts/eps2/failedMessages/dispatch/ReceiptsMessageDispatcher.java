package ru.acs.fts.eps2.failedMessages.dispatch;

import java.util.Calendar;

import javax.jms.JMSException;
import javax.jms.Message;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import com.ibm.msg.client.jms.JmsConstants;
import com.ibm.msg.client.wmq.v6.base.internal.MQC;

import ru.acs.fts.eps2.failedMessages.exceptions.MessageDispatchException;
import ru.acs.fts.eps2.failedMessages.persistence.entities.Envelope;
import ru.acs.fts.eps2.failedMessages.persistence.services.MessageService;
import ru.acs.fts.eps2.failedMessages.supplementary.Configurator;
import ru.acs.fts.eps2.failedMessages.supplementary.MessageSender;

public class ReceiptsMessageDispatcher implements IMessageDispatcher
{
	private static final Logger log = LoggerFactory.getLogger( ReceiptsMessageDispatcher.class );
	
	private MessageService _messageService;
	private MessageSender _messageSender;
	private Configurator _configurator;
	
	// @formatter:off
	@Required
	public void setMessageService( MessageService messageService ) { _messageService = messageService; }
	public MessageService getMessageService( ) { return _messageService; }
	
	@Required
	public void setMessageSender( MessageSender messageSender ) { _messageSender = messageSender; }
	public MessageSender getMessageSender( ) { return _messageSender; }
	
	@Required
	public void setConfigurator( Configurator configurator ) { _configurator = configurator; }
	public Configurator getConfigurator( ) { return _configurator; }
	// @formatter:on
	
	@Override
	public void dispatch( Message message ) 
		throws MessageDispatchException
	{
		try
		{
			String corrId = message.getJMSCorrelationID( );
			if ( null == corrId )
				throw new NullPointerException( "CorrelationID входящего сообщения - null!" );
			
			String envlelopeId = getEnvelopeId( corrId );
			log.info( "Полученный CorrelationID = {}; EnvelopeID = {}", corrId, envlelopeId );
			log.info( "Feedback = {}", message.getObjectProperty( JmsConstants.JMS_IBM_FEEDBACK ) );
			Envelope envelope = _messageService.getMessage( envlelopeId );
			
			if ( null != envelope )
			{
				Calendar msgDate = getMessageDateTime( message );
				
				/*
				if ( isCoa( message ) )
				{
					envelope.setCoaDatetime( msgDate );
					envelope.setCoaSaveDatetime( now );
					log.info( "Обнаружен заголовок JMS_IBM_REPORT_COA." );
				}
				
				if ( isCod( message ) )
				{
					envelope.setCodDatetime( msgDate );
					envelope.setCodSaveDatetime( now );
					log.info( "Обнаружен заголовок JMS_IBM_REPORT_COD." );
				}
				
				_messageService.mergeMessage( envelope );
				*/
				
				_messageService.updateMessage( envlelopeId, msgDate, isCoa( message ), isCod( message ) );
				log.info( "Конверт сохранен." );
			}
			
			if ( isFullData( corrId ) )
			{
				_messageSender.sendMessage( message, _configurator.getFullDataReportsQueue( ), _configurator.getFullDataReportsQueueManager( ) );
				log.info( "Сообщение перенаправлено." );
			}
			else
				log.info( "Сообщение не перенаправлено." );
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
	
	private Calendar getMessageDateTime( Message message ) 
		throws JMSException
	{
		StringBuilder sbDateTime = new StringBuilder( message.getStringProperty( JmsConstants.JMS_IBM_PUTDATE ) );
		sbDateTime.append( message.getStringProperty( JmsConstants.JMS_IBM_PUTTIME ) );
		
		int millis = Integer.valueOf( sbDateTime.substring( 14, 16 ) ) * 10;
		String dateTimeString = sbDateTime.substring( 0, 14 );
		
		DateTimeFormatter formatter = DateTimeFormat.forPattern( "yyyyMMddHHmmss" );
		DateTime dateTime = formatter.parseDateTime( dateTimeString ).plusMillis( millis );
		
		return dateTime.toGregorianCalendar( );
	}
	
	private String getEnvelopeId( String corrId )
	{
		return new StringBuilder( corrId.substring( 3, 35 ) ).insert( 8, "-" ).insert( 13, "-" ).insert( 18, "-" ).insert( 23, "-" ).toString( );
	}
	
	@SuppressWarnings( "unused" )
	private boolean checkProperty( Message message, String propertyName )
	{
		boolean result;
		try
		{
			result = null != message.getObjectProperty( propertyName );
		}
		catch ( JMSException ex )
		{
			result = false;
		}
		
		return result;
	}
	
	private boolean isFullData( String corrId )
	{
		/*
		boolean result;
		
		try
		{
			Integer coa = message.getIntProperty( JmsConstants.JMS_IBM_REPORT_COA );
			result = null != coa ? coa == MQC.MQRO_COA_WITH_FULL_DATA : false;
		}
		catch ( Exception ex )
		{
			result = false;
		}
		
		if ( ! result )
		{
			try
			{
				Integer cod = message.getIntProperty( JmsConstants.JMS_IBM_REPORT_COD );
				result = null != cod ? cod == MQC.MQRO_COD_WITH_FULL_DATA : false;
			}
			catch ( Exception ex )
			{
				result = false;
			}
		}
		
		
		return result;
		*/
		
		return corrId.charAt( 36 ) == '1';
	}
	
	private boolean isCoa( Message message )
	{
		boolean result;
		try
		{
			Integer feedback = message.getIntProperty( JmsConstants.JMS_IBM_FEEDBACK );
			result = MQC.MQFB_COA == feedback;
		}
		catch ( Throwable ex )
		{
			result = false;
		}
		
		return result;
	}
	
	private boolean isCod( Message message )
	{
		boolean result;
		try
		{
			Integer feedback = message.getIntProperty( JmsConstants.JMS_IBM_FEEDBACK );
			result = MQC.MQFB_COD == feedback;
		}
		catch ( Throwable ex )
		{
			result = false;
		}
		
		return result;
	}
}
