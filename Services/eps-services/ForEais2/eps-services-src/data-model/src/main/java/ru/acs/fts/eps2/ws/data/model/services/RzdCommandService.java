package ru.acs.fts.eps2.ws.data.model.services;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.eps2.ws.data.model.entities.RzdCommand;

@SuppressWarnings( "deprecation" )
public class RzdCommandService
{
	private BaseStorage< RzdCommand > _rzdCommandsStorage;
	
	// @formatter:off
	@Required
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_rzdCommandsStorage.setJpaTemplate( jpaTemplate );
	}
	public JpaTemplate getJpaTemplate( ) { return _rzdCommandsStorage.getJpaTemplate( ); }
	// @formatter:on
	
	public RzdCommandService( )
	{
		_rzdCommandsStorage = new BaseStorage< RzdCommand >( RzdCommand.class );
	}
	
	@Transactional
	public void persistRzdCommand( RzdCommand command ) 
		throws Exception
	{
		_rzdCommandsStorage.executePersistAndFlush( command );
	}
}
