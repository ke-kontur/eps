package ru.acs.fts.eps2.engine.restWs.event.requests;

import ru.acs.fts.eps2.engine.restWs.event.serviceModel.Event;

public class EventRequest // NO_UCD (for future use)
{
	private Event _event;
	
	// @formatter:off
	public void setEvent( Event event ) { _event = event; }
	public Event getEvent( ) { return _event; }
	// @formatter:on
}
