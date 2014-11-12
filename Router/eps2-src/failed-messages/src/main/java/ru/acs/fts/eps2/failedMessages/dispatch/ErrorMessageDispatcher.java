package ru.acs.fts.eps2.failedMessages.dispatch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.jms.Message;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.util.StopWatch;

import ru.acs.fts.eps2.failedMessages.exceptions.MessageDispatchException;
import ru.acs.fts.eps2.failedMessages.persistence.entities.ErrorMessage;
import ru.acs.fts.eps2.failedMessages.persistence.services.ErrorMessagesService;
import ru.acs.fts.eps2.util.helpers.JmsConverter;
import ru.acs.fts.eps2.util.helpers.StopWatchHelper;
import ru.acs.fts.eps2.util.parser.EnvelopeParser;

public class ErrorMessageDispatcher implements IMessageDispatcher
{
	private static final Logger log = LoggerFactory.getLogger( ErrorMessageDispatcher.class );
	
	private int _queue;
	private ErrorMessagesService _errorMessagesService;
	
	// @formatter:off
	@Required public void setQueue( String queue ) { _queue = Integer.parseInt( queue ); }
	public String getQueue( ) { return Integer.toString( _queue ); }
	
	@Required public void setErrorMessagesService( ErrorMessagesService errorMessagesService ) { _errorMessagesService = errorMessagesService; }
	public ErrorMessagesService getErrorMessagesService( ) { return _errorMessagesService; }
	// @formatter:on
	
	public void dispatch( Message message ) 
		throws MessageDispatchException
	{
		try
		{
			StopWatch sw = new StopWatch( );
			
			sw.start( );
			byte[ ] bytes = JmsConverter.convert( message );
			sw.stop( );
			
			log.info( String.format(
				"Время преобразования MQ в байты: %s", StopWatchHelper.timeToString( sw ) 
			) );
			
			dispatch( bytes );
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
	
	private void dispatch( byte[ ] message )
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
			"EnvelopeID", "InitialEnvelopeID", 
			"SenderInformation", "ReceiverInformation", 
			"SoftKind", "SoftVersion", 
			"MessageKind", "MessageType", 
			"ParticipantID", "ProccessID", "DocumentID", 
			"ReceiverCustoms.CustomsCode", "ReceiverCustoms.ExchType", 
			"SenderCustoms.CustomsCode", "SenderCustoms.ExchType", 
			"PreparationDateTime"				
		} ) );
		
		Map< String, String > fetched = EnvelopeParser.parseErrorMessage( data, toFetch );
		sw.stop( );
		log.info( String.format(
			"Время работы FSM: %s", StopWatchHelper.timeToString( sw ) 
		) );

		sw.start( );
		ErrorMessage msg = new ErrorMessage( );
		msg.setEnvelopeId( getValue( "EnvelopeID", fetched ) );
		msg.setInitialEnvelopeId( getValue( "InitialEnvelopeID", fetched ) );
		msg.setSenderInformation( getValue( "SenderInformation", fetched ) );
		msg.setReceiverInformation( getValue( "ReceiverInformation", fetched ) );
		msg.setSoftKind( getValue( "SoftKind", fetched ) );
		msg.setSoftVersion( getValue( "SoftVersion", fetched ) );
		msg.setMessageKind( getValue( "MessageKind", fetched ) );
		msg.setMessageType( getValue( "MessageType", fetched ) );
		msg.setParticipantId( getValue( "ParticipantID", fetched ) );
		msg.setProcessId( getValue( "ProccessID", fetched ) );
		msg.setDocumentId( getValue( "DocumentID", fetched ) );
		msg.setReceiverCustomsCode( getValue( "ReceiverCustoms.CustomsCode", fetched ) );
		msg.setReceiverExchType( getValue( "ReceiverCustoms.ExchType", fetched ) );
		msg.setSenderCustomsCode( getValue( "SenderCustoms.CustomsCode", fetched ) );
		msg.setSenderExchType( getValue( "SenderCustoms.ExchType", fetched ) );
		
		String preparationDateTimeStr = getValue( "PreparationDateTime", fetched );
		DateTime preparationDateTime = new DateTime( preparationDateTimeStr );
		msg.setPreparationDateTime( preparationDateTime.toGregorianCalendar( ) );

		msg.setReceiveDateTime( new DateTime( ).toGregorianCalendar( ) );
		msg.setBody( message );
		msg.setQueue( _queue );
		
		_errorMessagesService.persistErrorMessage( msg );
		sw.stop( );
		log.info( String.format(
			"Время сохранения в базу данных: %s", StopWatchHelper.timeToString( sw ) 
		) );
	}
	
	public String getValue( String key, Map< String, String > map )
	{
		if ( ! map.containsKey( key ) )
			return null;
		
		String value = map.get( key );
		if ( null == value || value.equals( "" ) )
			return null;
		
		return value;
	}
}
