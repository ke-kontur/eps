package ru.acs.fts.eps2.model.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.eps2.model.entities.RzdSendCommands;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

@SuppressWarnings( "deprecation" )
public class RzdService
{
	private BaseStorage< RzdSendCommands > _rzdSendCommands;
	
	public RzdService( )
	{
		_rzdSendCommands = new BaseStorage< RzdSendCommands >( RzdSendCommands.class );
	}

	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_rzdSendCommands.setJpaTemplate( jpaTemplate );
	}

	public JpaTemplate getJpaTemplate( )
	{
		return _rzdSendCommands.getJpaTemplate( );
	}

	public void persist( RzdSendCommands cmd ) 
		throws DatabaseException
	{
		_rzdSendCommands.persistAndFlush( cmd );
	}
	
	public void merge( RzdSendCommands cmd )
		throws DatabaseException
	{
		_rzdSendCommands.mergeAndFlush( cmd );
	}
	
	@Transactional
	public List< RzdSendCommands > getWaitableRzdSendCommands( String softVersion )
		throws DatabaseException
	{
		String query = "select rsc from RzdSendCommands rsc where rsc.status = 'Waitable' and rsc.softVersion = :softVersion";
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "softVersion", softVersion );
		
		return _rzdSendCommands.select( query, args );
	}
}
