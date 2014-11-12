package ru.acs.fts.eps2.engine.restWs.event;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import ru.acs.fts.eps2.engine.restWs.event.requests.EventRequest;
import ru.acs.fts.eps2.engine.restWs.event.requests.EventsRequest;
import ru.acs.fts.eps2.engine.restWs.event.requests.MessageExceptionRequest;
import ru.acs.fts.eps2.engine.restWs.event.serviceModel.Event;
import ru.acs.fts.eps2.engine.restWs.event.serviceModel.MessageExceptionRecord;
import ru.acs.fts.eps2.utils.Base64Coder;

public class EventRestWs
{
	public static final String EVENT_ENDPOINT = "event";
	public static final String EVENTS_ENDPOINT = "events";
	public static final String EXCEPTION_ENDPOINT = "exception";
	
	private List< String > _restEventSrvUrls;
	private RestTemplate _restTemplate;
	
	// @formatter:off
	// @formatter:on

	@Required 
	public void setRestEventSrvUrl( String restEventSrvUrl ) 
	{ 
		String[ ] parts = restEventSrvUrl.split( "," );
		
		_restEventSrvUrls = new ArrayList< String >( );
		for ( int i = 0; i < parts.length; ++i )
			_restEventSrvUrls.add( parts[ i ] );
	}
	
	public String getRestEventSrvUrl( ) 
	{ 
		StringBuilder b = new StringBuilder( );
		
		for ( int i = 0; i < _restEventSrvUrls.size( ); ++i )
		{
			if ( 0 != i )
				b.append( "," );
			b.append( _restEventSrvUrls.get( i ) );
		}
		
		return b.toString( );
	}
	
	public EventRestWs( )
	{
		HttpComponentsClientHttpRequestFactory f = new HttpComponentsClientHttpRequestFactory( );
		f.setReadTimeout( 150000 );
		
		_restTemplate = new RestTemplate( f );
		
		List< HttpMessageConverter< ? > > messageConvertes = new ArrayList< HttpMessageConverter< ? > >( );
		messageConvertes.add( new StringHttpMessageConverter( ) );
		messageConvertes.add( new MappingJacksonHttpMessageConverter( ) );
		
		_restTemplate.setMessageConverters( messageConvertes );
	}
	
	public void postNewEvent( Event event )  // NO_UCD (for future use)
		throws Exception
	{
		EventRequest request = new EventRequest( );
		request.setEvent( event );
		
		int tries = 3;
		
		Random rnd = new Random( );
		int url = rnd.nextInt( _restEventSrvUrls.size( ) );

		while ( true )
		{
			try
			{
				String urls = String.format( "%s%s", _restEventSrvUrls.get( url ), EVENT_ENDPOINT );
				url = ( url + 1 ) % _restEventSrvUrls.size( );
	
				_restTemplate.postForObject( new URI( urls ), request, String.class );
			}
			catch ( Exception exc )
			{
				tries--;
				if ( tries <= 0 )
				{
					throw new Exception( "Не удалось вызвать REST Web-сервис событий." );
				}
				else
					continue;
			}
			
			break;
		}
	}
	
	public void postNewEvents( List< Event > events ) 
		throws Exception
	{
		EventsRequest request = new EventsRequest( );
		request.setEvents( events );
		
		int tries = 3;
		
		Random rnd = new Random( );
		int url = rnd.nextInt( _restEventSrvUrls.size( ) );

		while ( true )
		{
			try
			{
				String urls = String.format( "%s%s", _restEventSrvUrls.get( url ), EVENTS_ENDPOINT );
				url = ( url + 1 ) % _restEventSrvUrls.size( );
		
				_restTemplate.postForObject( new URI( urls ), request, String.class );
			}
			catch ( Exception exc )
			{
				tries--;
				if ( tries <= 0 )
				{
					throw new Exception( "Не удалось вызвать REST Web-сервис событий." );
				}
				else
					continue;
			}
			
			break;
		}
	}
	
	public void postException( Exception exception, String envelopeId ) 
		throws Exception
	{
		OutputStream outputStream = new ByteArrayOutputStream( );
		PrintWriter stream = new PrintWriter( outputStream );
		exception.printStackTrace( stream );
		stream.flush( );
		String stacktrace = outputStream.toString( );
		
		MessageExceptionRecord record = new MessageExceptionRecord( );
		record.setEnvelopeId( envelopeId );
		record.setStacktrace( Base64Coder.encodeAsString( stacktrace, "UTF-8" ) );
		
		MessageExceptionRequest request = new MessageExceptionRequest( );
		request.setMessageExceptionRecord( record );
		
		int tries = 3;
		
		Random rnd = new Random( );
		int url = rnd.nextInt( _restEventSrvUrls.size( ) );

		while ( true )
		{
			try
			{		
				String urls = String.format( "%s%s", _restEventSrvUrls.get( url ), EXCEPTION_ENDPOINT );
				url = ( url + 1 ) % _restEventSrvUrls.size( );
		
				_restTemplate.postForObject( new URI( urls ), request, String.class );
			}
			catch ( Exception exc )
			{
				tries--;
				if ( tries <= 0 )
				{
					throw new Exception( "Не удалось вызвать REST Web-сервис событий." );
				}
				else
					continue;
			}
			
			break;
		}
	}
}
