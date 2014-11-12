package ru.acs.fts.aly.model.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.aly.model.entities.AlyRole;
import ru.acs.fts.aly.model.entities.AlyUser;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

@SuppressWarnings( "deprecation" )
public class SecurityService implements IGenericService
{
	private BaseStorage< AlyUser > _usersStorage;
	private BaseStorage< AlyRole > _rolesStorage;
	
	public SecurityService( )
	{
		_usersStorage = new BaseStorage< AlyUser >( AlyUser.class );
		_rolesStorage = new BaseStorage< AlyRole >( AlyRole.class );
	}

	@Override
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_usersStorage.setJpaTemplate( jpaTemplate );
		_rolesStorage.setJpaTemplate( jpaTemplate );
	}

	@Override
	public JpaTemplate getJpaTemplate( )
	{
		return _usersStorage.getJpaTemplate( );
	}
	
	// persist
	
	public void persist( AlyUser user ) 
		throws DatabaseException
	{
		_usersStorage.persistAndFlush( user );
	}
	
	public void persist( AlyRole role )
		throws DatabaseException
	{
		_rolesStorage.persistAndFlush( role );
	}
	
	// merge
	
	public void merge( AlyUser user ) 
		throws DatabaseException
	{
		_usersStorage.mergeAndFlush( user );
	}
	
	// query
	
	public AlyUser getUser( String id )
		throws DatabaseException
	{
		return _usersStorage.get( id );
	}
	
	public List< AlyUser > getUsers( )
		throws DatabaseException
	{
		List< AlyUser > res = _usersStorage.select( "select au from AlyUser au", new HashMap< String, Object >( ) );
		if ( null == res )
			return new ArrayList< AlyUser >( );
		
		return res;
	}
	
	public List< AlyRole > getRoles( )
		throws DatabaseException
	{
		List< AlyRole > res = _rolesStorage.select( "select ar from AlyRole ar ", new HashMap< String, Object >( ) );
		if ( null == res )
			return new ArrayList< AlyRole >( );
		
		return res;
	}
	
	public List< AlyUser > getUsersByEmail( String email )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select au from AlyUser au " );
		q.append( "where au.email = :email " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "email", email );
		
		List< AlyUser > res = _usersStorage.select( q.toString( ), args );
		if ( null == res )
			return new ArrayList< AlyUser >( );
		
		return res;
	}
	
	public AlyRole getRoleByName( String name )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select ar from AlyRole ar " );
		q.append( "where ar.name = :name " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "name", name );
		
		List< AlyRole > res = _rolesStorage.select( q.toString( ), args );
		if ( null == res || res.isEmpty( ) )
			return null;
		
		return res.get( 0 );
	}

	public Long getUsersCount( )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select count(au) from AlyUser au " );
		
		List< Object > res = _usersStorage.selectObjects( q.toString( ), new HashMap< String, Object >( ) );
		if ( null == res || res.isEmpty( ) )
			return 0l;
		
		Object f = res.get( 0 );
		if ( null == f )
			return 0l;
		
		return Long.parseLong( f.toString( ) );
	}
	
}
