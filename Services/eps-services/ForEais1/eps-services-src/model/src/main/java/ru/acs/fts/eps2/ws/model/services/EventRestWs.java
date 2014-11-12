package ru.acs.fts.eps2.ws.model.services;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.ws.model.requests.event.EventRequest;
import ru.acs.fts.eps2.ws.model.requests.event.EventsRequest;
import ru.acs.fts.eps2.ws.model.serviceModel.event.Event;
import ru.acs.fts.eps2.ws.utils.httpclient.HttpRequester;

public class EventRestWs
{
	public static final String EVENT_ENDPOINT = "event";
	public static final String EVENTS_ENDPOINT = "events";
	
	private String _restEventSrvUrl;
	
	// @formatter:off
	@Required public void setRestEventSrvUrl( String restEventSrvUrl ) { _restEventSrvUrl = restEventSrvUrl; }
	public String getRestEventSrvUrl( ) { return _restEventSrvUrl; }
	// @formatter:on
	
	public void postNewEvent( Event event ) 
		throws IllegalStateException, ClientProtocolException, IOException
	{
		EventRequest request = new EventRequest( );
		request.setEvent( event );
		
		ObjectMapper mapper = new ObjectMapper( );
		String data = mapper.writeValueAsString( request );
		
		Map< String, String > headers = new HashMap< String, String >( );
		headers.put( "Content-Type", "application/json" );
		
		String url = String.format( "%s%s", _restEventSrvUrl, EVENT_ENDPOINT );
		
		HttpRequester.POST( url, data, headers );
	}
	
	public void postNewEvents( List< Event > events ) 
		throws JsonGenerationException, JsonMappingException, IOException
	{
		EventsRequest request = new EventsRequest( );
		request.setEvents( events );
		
		ObjectMapper mapper = new ObjectMapper( );
		String data = mapper.writeValueAsString( request );
		
		Map< String, String > headers = new HashMap< String, String >( );
		headers.put( "Content-Type", "application/json" );
		
		String url = String.format( "%s%s", _restEventSrvUrl, EVENTS_ENDPOINT );
		
		HttpRequester.POST( url, data, headers );
	}
}
