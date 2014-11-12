package ru.acs.fts.aud.command.executor.ws;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;

import ru.acs.fts.aud.command.executor.jndi.SettingsWrapper;
import ru.acs.fts.aud.management.utils.httpclient.HttpRequester;
import ru.acs.fts.aud.rest.service.model.exceptions.AudWmqRestWsException;
import ru.acs.fts.aud.rest.service.model.objects.AudCommand;
import ru.acs.fts.aud.rest.service.model.objects.AudMessage;
import ru.acs.fts.aud.rest.service.model.objects.AudRegistryRequest;
import ru.acs.fts.aud.rest.service.model.requests.AudCommandRequest;
import ru.acs.fts.aud.rest.service.model.requests.AudRegistryRequestRequest;
import ru.acs.fts.aud.rest.service.model.responses.AudMessageResponse;
import ru.acs.fts.aud.rest.service.model.responses.ErrorResponse;
import ru.acs.fts.aud.rest.service.model.responses.Response;

public class AudWmqRestWs
{
	private static final Logger log = LoggerFactory.getLogger( AudWmqRestWs.class );
	
	private static final String AUD_COMMANDS_ROUTE_ENDPOINT = "aud/commands/route";
	private static final String AUD_REGISTRY_REQUEST_ENDPOINT = "aud/commands/registry";
	
	private SettingsWrapper _settingsWrapper;
	
	// @formatter:off
	public void setSettingsWrapper( SettingsWrapper settingsWrapper ) { _settingsWrapper = settingsWrapper; }
	public SettingsWrapper getSettingsWrapper( ) { return _settingsWrapper; }
	// @formatter:on
	
	public AudMessage sendCommand( AudCommand cmd ) 
		throws AudWmqRestWsException
	{
		log.info( String.format(
			"Начинаем передавать AudWmqRestWs команду %d", cmd.getRecId( )
		) );
		
		AudCommandRequest request = new AudCommandRequest( );
		request.setAudCommand( cmd );
				
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
				"Не удалось преобразовать в json запрос на отправку команды %d", cmd.getRecId( )
			);
			
			log.error( message, exc );
			throw new AudWmqRestWsException( message, exc );
		}
		
		Map< String, String > headers = new HashMap< String, String >( );
		headers.put( "Content-Type", "application/json; charset=utf-8" );
		
		String requestUrl = String.format( "%s/%s", _settingsWrapper.getSettings( ).getWmqRouterUrl( ), AUD_COMMANDS_ROUTE_ENDPOINT );
		
		String response = null;
		
		try
		{
			response = HttpRequester.POST( requestUrl, data, headers );
		}
		catch ( Exception exc )
		{
			String message = "Не удалось вызвать REST Web-сервис AudWmqRouter";
			
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
		
		return resp.getAudMessage( );		
	}

	public AudMessage sendRegistryRequest( AudRegistryRequest audrr ) 
		throws AudWmqRestWsException
	{
		log.info( String.format(
			"Начинаем передавать AudWmqRestWs запрос реестра, дата запроса %s", 
			audrr.getDocDateTime( ).toString( )
		) );
		
		AudRegistryRequestRequest request = new AudRegistryRequestRequest( );
		request.setAudRegistryRequest( audrr );
				
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
				"Не удалось преобразовать в json запрос реестра, дата запроса %s", 
				audrr.getDocDateTime( ).toString( )
			);
			
			log.error( message, exc );
			throw new AudWmqRestWsException( message, exc );
		}
		
		Map< String, String > headers = new HashMap< String, String >( );
		headers.put( "Content-Type", "application/json; charset=utf-8" );
		
		String requestUrl = String.format( "%s/%s", _settingsWrapper.getSettings( ).getWmqRouterUrl( ), AUD_REGISTRY_REQUEST_ENDPOINT );
		
		String response = null;
		
		try
		{
			response = HttpRequester.POST( requestUrl, data, headers );
		}
		catch ( Exception exc )
		{
			String message = "Не удалось вызвать REST Web-сервис AudWmqRouter";
			
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
		
		return resp.getAudMessage( );		
	}
	
}
