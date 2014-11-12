package ru.acs.fts.aud.model.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.model.entities.Client;
import ru.acs.fts.aud.model.entities.ClientPermission;
import ru.acs.fts.aud.model.entities.DocumentKind;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.eps2.utils.CollectionHelper;

@SuppressWarnings( "deprecation" )
public class ClientService
{
	private BaseStorage< Client > _clientStorage;
	private BaseStorage< ClientPermission > _clientPermissionStorage;
	
	public ClientService( )
	{
		_clientStorage = new BaseStorage< Client >( Client.class );
		_clientPermissionStorage = new BaseStorage< ClientPermission >( ClientPermission.class );
	}
	
	// @formatter:off
	@Required public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_clientStorage.setJpaTemplate( jpaTemplate );
		_clientPermissionStorage.setJpaTemplate( jpaTemplate );
	}
	public JpaTemplate getJpaTemplate( ) { return _clientStorage.getJpaTemplate( ); }
	// @formatter:on
	
	public List< Client > getAllClients( ) 
		throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select c from Client c " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		
		List< Client > clients = _clientStorage.select( q.toString( ), args );
		if ( null == clients )
			return new ArrayList< Client >( );
		
		return clients;
	}
	
	public Client getClient( String id ) 
		throws PersistenceException
	{
		return _clientStorage.get( id );
	}
	
	@Transactional
	public void persistClient( Client client )  // NO_UCD (unused code)
		throws PersistenceException
	{
		_clientStorage.executePersistAndFlush( client );
	}
	
	public List< ClientPermission > getClientPermissions( String cliendId ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select cp from ClientPermission cp" );
		query.append( " where cp.client.id = :clientId" );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "clientId", cliendId );
		
		return _clientPermissionStorage.select( query.toString( ), arguments );
	}
	
	@Transactional
	public void persistClientPermission( ClientPermission clientPersimission )  // NO_UCD (unused code)
		throws PersistenceException
	{
		_clientPermissionStorage.executePersistAndFlush( clientPersimission );
	}
	
	@Transactional
	public void removeClientPermission( ClientPermission clientPermission ) 
		throws PersistenceException
	{
		if ( null != clientPermission )
			removeClientPermission( clientPermission.getId( ) );
	}
	
	@Transactional
	public void removeClientPermission( String clientPermissionId ) 
		throws PersistenceException
	{
		_clientPermissionStorage.removeById( clientPermissionId );
	}
	
	@Transactional
	public void removeClient( String clientId ) 
		throws PersistenceException
	{
		_clientStorage.removeById( clientId );
	}
	
	@Transactional
	public void mergeClient( Client client )  // NO_UCD (unused code)
		throws PersistenceException
	{
		_clientStorage.executeMergeAndFlush( client );
	}
	
	public ClientPermission getClientPermission( String clientPermissionId ) 
		throws PersistenceException
	{
		return _clientPermissionStorage.get( clientPermissionId );
	}
	
	public Client getClientByAppliedId( String appliedId ) 
		throws PersistenceException
	{
		String query = "select c from Client c where c.appliedId = :appliedId";		
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "appliedId", appliedId );
		
		return CollectionHelper.getFirst( _clientStorage.select( query, args ) );
	}

	public ClientPermission getClientPermission( Client client, DocumentKind documentKind, String permissionType ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select cp from ClientPermission cp" );
		query.append( " where cp.client = :client and cp.documentKind = :documentKind" );
		query.append( " and cp.permissionType = :permissionType" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "client", client );
		args.put( "documentKind", documentKind );
		args.put( "permissionType", permissionType );
		
		return CollectionHelper.getFirst( _clientPermissionStorage.select( query.toString( ), args ) );
	}
	
	/** (mrdekk) ok! */
	public ClientPermission getClientPermission( String appliedId, DocumentKind documentKind, String permissionType ) 
		throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select cp from ClientPermission cp " );
		q.append( "where cp.documentKind = :documentKind " );
			q.append( "and cp.permissionType = :permissionType " );
			q.append( "and cp.client.appliedId = :appliedId " );		
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "appliedId", appliedId );
		args.put( "documentKind", documentKind );
		args.put( "permissionType", permissionType );
		
		return CollectionHelper.getFirst( _clientPermissionStorage.select( q.toString( ), args ) );
	}
	
	/** (mrdekk) ok! 
	 * @throws PersistenceException */
	public boolean hasPermission( String appliedId, DocumentKind documentKind, String permissionType ) 
		throws PersistenceException
	{
		return ( null != getClientPermission( appliedId, documentKind, permissionType ) );
	}
	
	public boolean hasPermission( Client client, DocumentKind documentKind, String permissionType ) 
		throws PersistenceException
	{
		return null != getClientPermission( client, documentKind, permissionType );
	}

}
