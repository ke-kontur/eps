package ru.acs.fts.aud.wmq.router.restWs.resultDispatcher;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;

import ru.acs.fts.aud.management.utils.httpclient.HttpRequester;
import ru.acs.fts.aud.rest.service.model.exceptions.AudWmqRestWsException;
import ru.acs.fts.aud.rest.service.model.objects.AudMessage;
import ru.acs.fts.aud.rest.service.model.objects.AudResponseMetadata;
import ru.acs.fts.aud.rest.service.model.requests.AudMessageRequest;
import ru.acs.fts.aud.rest.service.model.responses.AudMessageResponse;
import ru.acs.fts.aud.rest.service.model.responses.ErrorResponse;
import ru.acs.fts.aud.rest.service.model.responses.Response;
import ru.acs.fts.aud.wmq.router.jndi.SettingsWrapper;

public class AudResultDispatcherRestWs
{
	private static final Logger log = LoggerFactory.getLogger( AudResultDispatcherRestWs.class );
	
	private static final String AUD_RESULT_DISPATCHER_DISPATCH = "aud/results/dispatch";
	
	private SettingsWrapper _settingsWrapper;
	
	// @formatter:off
	public void setSettingsWrapper( SettingsWrapper settingsWrapper ) { _settingsWrapper = settingsWrapper; }
	public SettingsWrapper getSettingsWrapper( ) { return _settingsWrapper; }
	// @formatter:on
	
	public void sendMessage( AudMessage msg, AudResponseMetadata metadata ) 
		throws AudWmqRestWsException
	{
		log.info( String.format(
			"Начинаем передавать AudResultDispatcher'у сообщение %s", msg.getEnvelopeId( )
		) );
		
		AudMessageRequest request = new AudMessageRequest( );
		request.setAudMessage( msg );
		request.setAudResponseMetadata( metadata );
		
		ObjectMapper jsonMapper = new ObjectMapper( );
		jsonMapper.setDateFormat( new com.fasterxml.jackson.databind.util.ISO8601DateFormat( ) );
		String data = null;
		
		jsonMapper.registerModule( new JodaModule( ) );
		// jsonMapper.configure( SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false );
		
		try
		{
			data = jsonMapper.writeValueAsString( request );
		}
		catch ( Exception exc )
		{
			String message = String.format(
				"Не удалось преобразовать в json запрос на отправку сообщения %s", msg.getEnvelopeId( )
			);
			
			log.error( message, exc );
			throw new AudWmqRestWsException( message, exc );
		}
		
		Map< String, String > headers = new HashMap< String, String >( );
		headers.put( "Content-Type", "application/json; charset=utf-8" );
		
		String requestUrl = String.format( "%s/%s", _settingsWrapper.getSettings( ).getResultDispatcherUrl( ), AUD_RESULT_DISPATCHER_DISPATCH );
		
		String response = null;
		
		try
		{
			response = HttpRequester.POST( requestUrl, data, headers );
		}
		catch ( Exception exc )
		{
			String message = "Не удалось вызвать REST Web-сервис AudResultDispatcher";
			
			log.error( message, exc );
			throw new AudWmqRestWsException( message, exc );
		}
		
		Response responseObj = null;
		
		jsonMapper.configure( DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false );
		
		try
		{
			responseObj = jsonMapper.readValue( response, Response.class );
		}
		catch ( Exception exc )
		{
			String message = String.format(
				"Не удалось разобрать вот это: [%s]", response
			);
			
			log.error( message, exc );
			throw new AudWmqRestWsException( message, exc );
		}
		
		if ( ! responseObj.getStatus( ).equalsIgnoreCase( Response.OK_STATUS ) )
		{
			ErrorResponse errorResponse = null;
			
			try
			{
				errorResponse = jsonMapper.readValue( response, ErrorResponse.class );
			}
			catch ( Exception exc )
			{
				String message = String.format(
					"Не удалось разобрать вот это: [%s]", response
				);
					
				log.error( message, exc );
				throw new AudWmqRestWsException( message, exc );
			}
			
			throw new AudWmqRestWsException( errorResponse.getMessage( ) );
		}
		
		AudMessageResponse resp = null;
		
		try
		{
			resp = jsonMapper.readValue( response, AudMessageResponse.class );
		}
		catch ( Exception exc )
		{
			String message = String.format(
				"Не удалось разобрать вот это: [%s]", response
			);
			
			log.error( message, exc );
			throw new AudWmqRestWsException( message, exc );
		}
	}
}
