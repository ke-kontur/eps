package ru.acs.fts.eps2.model.services;

import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.eps2.model.entities.AudInternalCommand;
import ru.acs.fts.eps2.model.entities.AudMessageType;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

@SuppressWarnings( "deprecation" )
public class AudService implements IGenericService
{
	private BaseStorage< AudInternalCommand > _audInternalCommands;
	private BaseStorage< AudMessageType > _audMessageTypes;
	
	public AudService( )
	{
		_audInternalCommands = new BaseStorage< AudInternalCommand >( AudInternalCommand.class );
		_audMessageTypes = new BaseStorage< AudMessageType >( AudMessageType.class );
	}

	@Override
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_audInternalCommands.setJpaTemplate( jpaTemplate );
		_audMessageTypes.setJpaTemplate( jpaTemplate );
	}

	@Override
	public JpaTemplate getJpaTemplate( )
	{
		return _audInternalCommands.getJpaTemplate( );
	}

	public void persistInternalCommand( AudInternalCommand cmd ) 
		throws DatabaseException
	{
		_audInternalCommands.persistAndFlush( cmd );
	}
	
	public AudMessageType getMessageType( String messageType )
		throws DatabaseException
	{
		return _audMessageTypes.get( messageType );
	}
}
