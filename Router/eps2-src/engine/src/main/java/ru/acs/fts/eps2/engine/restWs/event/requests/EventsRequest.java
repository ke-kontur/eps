package ru.acs.fts.eps2.engine.restWs.event.requests;

import java.util.List;

import ru.acs.fts.eps2.engine.restWs.event.serviceModel.Event;

public class EventsRequest
{
	private List< Event > events;

	// @formatter:off
	public List< Event > getEvents( ) { return events; }
	public void setEvents( List< Event > events ) { this.events = events; }
	// @formatter:on
}
