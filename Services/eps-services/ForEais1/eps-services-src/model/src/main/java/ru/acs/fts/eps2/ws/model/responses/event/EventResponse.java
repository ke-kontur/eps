package ru.acs.fts.eps2.ws.model.responses.event;

import ru.acs.fts.eps2.ws.model.responses.Response;
import ru.acs.fts.eps2.ws.model.serviceModel.event.Event;

public class EventResponse extends Response
{
	private Event _event;
	
	// @formatter:off
	public void setEvent( Event event ) { _event = event; }
	public Event getEvent( ) { return _event; }
	// @formatter:on
}
