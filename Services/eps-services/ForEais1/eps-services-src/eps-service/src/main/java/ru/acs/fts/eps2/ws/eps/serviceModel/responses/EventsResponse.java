package ru.acs.fts.eps2.ws.eps.serviceModel.responses;

import java.util.List;

import ru.acs.fts.eps2.ws.eps.serviceModel.objects.Event;

public class EventsResponse extends Response
{
	private List< Event > _events;
	
	// @formatter:off
	public void setEvents( List< Event > events ) { _events = events; }
	public List< Event > getEvents( ) { return _events; }
	// @formatter:on
}
