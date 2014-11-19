package ru.acs.fts.eps2.ws.data.model.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.eps2.ws.data.model.entities.Event;

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
	public List< Event > getEventsByEnvelope( String envelopeId )
	{
		String query = "select e from Event e where e.envelopeId = :envelopeId";
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "envelopeId", envelopeId );
		
		return _eventStorage.select( query, args );
	}
}
