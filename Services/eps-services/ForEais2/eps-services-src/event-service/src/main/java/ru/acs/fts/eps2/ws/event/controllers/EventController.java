package ru.acs.fts.eps2.ws.event.controllers;

import java.util.UUID;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ru.acs.fts.eps2.ws.event.services.EventService;
import ru.acs.fts.eps2.ws.model.requests.event.EventRequest;
import ru.acs.fts.eps2.ws.model.requests.event.EventsRequest;
import ru.acs.fts.eps2.ws.model.responses.Response;
import ru.acs.fts.eps2.ws.model.responses.event.EventResponse;
import ru.acs.fts.eps2.ws.model.serviceModel.event.Event;

@Controller
@RequestMapping( "/" )
public class EventController
{	
	@Autowired
	@Qualifier( "eventService" )
	private EventService _eventService;
	
	@RequestMapping( value = "events", method = RequestMethod.GET )
	public @ResponseBody EventResponse getTestEvent( ) 
	{
		Event event = new Event( );
		event.setEventCode( 1 );
		event.setDateTime( new DateTime( ) );
		event.setEventInfo( "test event" );
		event.setInvokingSystemName( "REST caller" );
		event.setSourceId( 1 );
		event.setCategoryId( 1 );
		event.setEnvelopeId( UUID.randomUUID( ).toString( ) );
		event.setDocumentId( UUID.randomUUID( ).toString( ) );
		event.setProcessId( UUID.randomUUID( ).toString( ) );
		event.setMessageId( UUID.randomUUID( ).toString( ) );
		event.setVersion( "0.0.0/0.0.0" );

		EventResponse response = new EventResponse( );
		response.setEvent( event );
				
		return response;
	}
	
	@RequestMapping( value = "event", method = RequestMethod.POST )
	public @ResponseBody Response postNewEvent( @RequestBody EventRequest request )
		throws Exception
	{
		Event event = request.getEvent( );
		
		_eventService.putToWindowsEventLog( event );
		_eventService.putToDatabase( event );
				
		return new Response( );
	}
	
	@RequestMapping( value = "events", method = RequestMethod.POST )
	public @ResponseBody Response postNewEvents( @RequestBody EventsRequest request )
		throws Exception
	{
		for ( Event event : request.getEvents( ) )
		{
			_eventService.putToWindowsEventLog( event );
			_eventService.putToDatabase( event );
		}
		
		return new Response( );
	}
}
