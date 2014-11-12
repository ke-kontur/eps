package ru.acs.fts.aud.model.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.model.entities.DestructionRegister;
import ru.acs.fts.aud.model.entities.DestructionResult;
import ru.acs.fts.aud.model.entities.ServiceDocument;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;

@SuppressWarnings( "deprecation" )
public class DestructionService // NO_UCD (for future use)
{
	private BaseStorage< ServiceDocument > _serviceDocumentsStorage;
	private BaseStorage< DestructionRegister > _destructionRegisterStorage;
	private BaseStorage< DestructionResult > _destructionResultStorage;
	
	public DestructionService( )
	{
		_serviceDocumentsStorage = new BaseStorage< ServiceDocument >( ServiceDocument.class );
		_destructionRegisterStorage = new BaseStorage< DestructionRegister >( DestructionRegister.class );
		_destructionResultStorage = new BaseStorage< DestructionResult >( DestructionResult.class );
	}
	
	// @formatter:off
	@Required public void setJpaTemplate( JpaTemplate jpaTemplate ) 
	{ 
		_serviceDocumentsStorage.setJpaTemplate( jpaTemplate );
		_destructionRegisterStorage.setJpaTemplate( jpaTemplate );
		_destructionResultStorage.setJpaTemplate( jpaTemplate );
	}
	public JpaTemplate getJpaTemplate( ) { return _serviceDocumentsStorage.getJpaTemplate( ); }
	// @formatter:on
	
	public List< DestructionRegister > getAllDestructionRegisters( ) 
		throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		q.append( "select dr from DestructionRegister dr " );
		
		List< DestructionRegister > rcrs = _destructionRegisterStorage.select( q.toString( ), new HashMap< String, Object >( ) );
		if ( null == rcrs )
			return new ArrayList< DestructionRegister >( );
		
		return rcrs;
	}
	
	@Transactional
	public void persistDestructionRegister( DestructionRegister register ) 
		throws PersistenceException
	{
		_destructionRegisterStorage.executePersistAndFlush( register );
	}
	
	@Transactional
	public void persistDestructionResult( DestructionResult result ) 
		throws PersistenceException
	{
		_destructionResultStorage.executePersistAndFlush( result );
	}
	
	@Transactional
	public void mergeDestructionRegister( DestructionRegister register ) 
		throws PersistenceException
	{
		_destructionRegisterStorage.executeMergeAndFlush( register );
	}
	
	@Transactional
	public void removeDestructionRegister( String id ) 
		throws PersistenceException
	{
		_destructionRegisterStorage.removeById( id );
	}
	
	public DestructionRegister getDestructionRegister( String id ) 
		throws PersistenceException
	{
		return _destructionRegisterStorage.get( id );
	}

	public List< DestructionResult > getDestructionResultByRegister( String registerId ) 
		throws PersistenceException
	{
		DestructionRegister register = _destructionRegisterStorage.get( registerId );
		if ( null == register )
			return new ArrayList< DestructionResult >( );
		
		return register.getResults( );
	}
}
