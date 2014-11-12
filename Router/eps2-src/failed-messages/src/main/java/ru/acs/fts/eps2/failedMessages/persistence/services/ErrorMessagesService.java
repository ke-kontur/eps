package ru.acs.fts.eps2.failedMessages.persistence.services;

import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.eps2.failedMessages.exceptions.StorageException;
import ru.acs.fts.eps2.failedMessages.persistence.entities.ErrorMessage;

@SuppressWarnings( "deprecation" )
public class ErrorMessagesService implements IPersistenceService
{
	private BaseStorage< ErrorMessage > _errorMessagesStorage;
	
	public ErrorMessagesService( )
	{
		_errorMessagesStorage = new BaseStorage< ErrorMessage >( ErrorMessage.class );
	}
	
	// @formatter:off
	public void setJpaTemplate( JpaTemplate jpaTemplate ) { _errorMessagesStorage.setJpaTemplate( jpaTemplate ); }
	public JpaTemplate getJpaTemplate( ) { return _errorMessagesStorage.getJpaTemplate( ); }
	// @formatter:on
	
	public void persistErrorMessage( ErrorMessage msg ) 
		throws StorageException
	{
		_errorMessagesStorage.executePersistAndFlush( msg );
	}
}
