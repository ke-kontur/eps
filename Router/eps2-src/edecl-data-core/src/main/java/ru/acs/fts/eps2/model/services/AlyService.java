package ru.acs.fts.eps2.model.services;

import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.eps2.model.entities.AlyInternalCommand;
import ru.acs.fts.eps2.model.entities.AlyMessageType;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

@SuppressWarnings( "deprecation" )
public class AlyService implements IGenericService
{
	private BaseStorage< AlyInternalCommand > _alyInternalCommands;
	private BaseStorage< AlyMessageType > _alyMessageTypes;

	public AlyService( )
	{
		_alyInternalCommands = new BaseStorage< AlyInternalCommand >( AlyInternalCommand.class );
		_alyMessageTypes = new BaseStorage< AlyMessageType >( AlyMessageType.class );
	}

	@Override
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_alyInternalCommands.setJpaTemplate( jpaTemplate );
		_alyMessageTypes.setJpaTemplate( jpaTemplate );
	}

	@Override
	public JpaTemplate getJpaTemplate( )
	{
		return _alyInternalCommands.getJpaTemplate( );
	}

	public void persistInternalCommand( AlyInternalCommand cmd ) throws DatabaseException
	{
		_alyInternalCommands.persistAndFlush( cmd );
	}

	public AlyMessageType getMessageType( String messageType ) throws DatabaseException
	{
		return _alyMessageTypes.get( messageType );
	}
}
