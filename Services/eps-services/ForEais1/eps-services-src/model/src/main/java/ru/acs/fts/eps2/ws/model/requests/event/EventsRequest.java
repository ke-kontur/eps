package ru.acs.fts.eps2.ws.model.requests.event;

import java.util.List;

import ru.acs.fts.eps2.ws.model.requests.Request;
import ru.acs.fts.eps2.ws.model.serviceModel.event.Event;

public class EventsRequest extends Request
{
	private List< Event > events;

	// @formatter:off
	public List< Event > getEvents( ) { return events; }
	public void setEvents( List< Event > events ) { this.events = events; }
	// @formatter:on
}
