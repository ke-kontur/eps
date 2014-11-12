package ru.acs.fts.aud.model.persistence;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.model.entities.Permission;
import ru.acs.fts.aud.model.entities.Role;
import ru.acs.fts.aud.model.entities.User;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;

@SuppressWarnings( "deprecation" )
public class SecurityService // NO_UCD (for future use)
{
	private BaseStorage< User > _userStorage;
	
	private BaseStorage< Role > _roleStorage;
	
	private BaseStorage< Permission > _permissionStorage;
	
	public SecurityService( )
	{
		_userStorage = new BaseStorage< User >( User.class );
		_roleStorage = new BaseStorage< Role >( Role.class );
		_permissionStorage = new BaseStorage< Permission >( Permission.class );
	}
	
	// @formatter:off
	@Required
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_userStorage.setJpaTemplate( jpaTemplate );
		_roleStorage.setJpaTemplate( jpaTemplate );
		_permissionStorage.setJpaTemplate( jpaTemplate );
	}
	
	public JpaTemplate getJpaTemplate( ) { return _userStorage.getJpaTemplate( ); }
	// @formatter:on
	
	@Transactional
	public void persistUser( User user ) 
		throws PersistenceException
	{
		_userStorage.executePersistAndFlush( user );
	}
	
	@Transactional
	public void persistRole( Role role )
		throws PersistenceException
	{
		_roleStorage.executePersistAndFlush( role );
	}
	
	@Transactional
	public void persistPermission( Permission permission ) 
		throws PersistenceException
	{
		_permissionStorage.executePersistAndFlush( permission );
	}
	
	public User getUser( String login ) throws PersistenceException
	{
		return _userStorage.get( login );
	}
	
	public Role getRole( String code ) throws PersistenceException
	{
		return _roleStorage.get( code );
	}
	
	public Permission getPermission( String code ) throws PersistenceException
	{
		return _permissionStorage.get( code );
	}
	
	@Transactional
	public void mergeUser( User user ) 
		throws PersistenceException
	{
		_userStorage.executeMergeAndFlush( user );
	}
	
	@Transactional
	public void mergeRole( Role role )
		throws PersistenceException
	{
		_roleStorage.executeMergeAndFlush( role );
	}
	
	@Transactional
	public void mergePermission( Permission permission ) 
		throws PersistenceException
	{
		_permissionStorage.executeMergeAndFlush( permission );
	}
	
	@Transactional
	public void removeUser( String login ) throws PersistenceException
	{
		_userStorage.removeById( login );
	}
	
	@Transactional
	public void removeRole( String code ) throws PersistenceException
	{
		_roleStorage.removeById( code );
	}
	
	@Transactional
	public void removePermission( String code ) throws PersistenceException
	{
		_permissionStorage.removeById( code );
	}
	
	public List< User > getAllUsers( ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select u from User u" );
		
		return _userStorage.select( query.toString( ), new HashMap< String, Object >( ) );
	}
	
	public List< Role > getAllRoles( ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select r from Role r" );
		
		return _roleStorage.select( query.toString( ), new HashMap< String, Object >( ) );
	}
	
	public List< Permission > getAllPermissions( ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select p from Permission p" );
		
		return _permissionStorage.select( query.toString( ), new HashMap< String, Object >( ) );
	}
}
