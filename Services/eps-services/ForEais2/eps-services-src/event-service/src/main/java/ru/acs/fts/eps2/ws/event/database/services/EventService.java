package ru.acs.fts.eps2.ws.event.database.services;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.eps2.ws.event.database.model.Event;

@SuppressWarnings( "deprecation" )
public class EventService
{
	private BaseStorage< Event > _eventStorage;
	
	// @formatter:off
	@Required
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_eventStorage.setJpaTemplate( jpaTemplate );
	}
	public JpaTemplate getJpaTemplate( ) { return _eventStorage.getJpaTemplate( ); }
	// @formatter:on
	
	public EventService( )
	{
		_eventStorage = new BaseStorage< Event >( Event.class );		
	}
	
	@Transactional
	public void persist( Event event ) 
		throws Exception
	{
		_eventStorage.executePersistAndFlush( event );
	}
}
