package ru.acs.fts.eps2.ws.model.requests.event;

import ru.acs.fts.eps2.ws.model.requests.Request;
import ru.acs.fts.eps2.ws.model.serviceModel.event.Event;

public class EventRequest extends Request
{
	private Event _event;
	
	// @formatter:off
	public void setEvent( Event event ) { _event = event; }
	public Event getEvent( ) { return _event; }
	// @formatter:on
}
