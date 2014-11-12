package ru.acs.fts.aud.model.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.model.entities.RetentionControlRegister;
import ru.acs.fts.aud.model.entities.RetentionControlResult;
import ru.acs.fts.aud.model.entities.ServiceDocument;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;

@SuppressWarnings( "deprecation" )
public class RetentionControlService // NO_UCD (for future use)
{
	private BaseStorage< ServiceDocument > _serviceDocumentsStorage;
	private BaseStorage< RetentionControlRegister > _retentionControlRegisterStorage;
	private BaseStorage< RetentionControlResult > _retentionControlResultStorage;
	
	public RetentionControlService( )
	{
		_serviceDocumentsStorage = new BaseStorage< ServiceDocument >( ServiceDocument.class );
		_retentionControlRegisterStorage = new BaseStorage< RetentionControlRegister >( RetentionControlRegister.class );
		_retentionControlResultStorage = new BaseStorage< RetentionControlResult >( RetentionControlResult.class );
	}
	
	// @formatter:off
	@Required public void setJpaTemplate( JpaTemplate jpaTemplate ) 
	{ 
		_serviceDocumentsStorage.setJpaTemplate( jpaTemplate );
		_retentionControlRegisterStorage.setJpaTemplate( jpaTemplate );
		_retentionControlResultStorage.setJpaTemplate( jpaTemplate );
	}
	public JpaTemplate getJpaTemplate( ) { return _serviceDocumentsStorage.getJpaTemplate( ); }
	// @formatter:on
	
	public List< RetentionControlRegister > getAllRetentionControlRegisters( ) throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		q.append( "select rcr from RetentionControlRegister rcr " );
		
		List< RetentionControlRegister > rcrs = _retentionControlRegisterStorage.select( q.toString( ), new HashMap< String, Object >( ) );
		if ( null == rcrs )
			return new ArrayList< RetentionControlRegister >( );
		
		return rcrs;
	}
	
	@Transactional
	public void persistRetentionControlRegister( RetentionControlRegister register ) 
		throws PersistenceException
	{
		_retentionControlRegisterStorage.executePersistAndFlush( register );
	}
	
	@Transactional
	public void mergeRetentionControlRegister( RetentionControlRegister register ) 
		throws PersistenceException
	{
		_retentionControlRegisterStorage.executeMergeAndFlush( register );
	}
	
	@Transactional
	public void removeRetentionControlRegister( String id ) throws PersistenceException
	{
		_retentionControlRegisterStorage.removeById( id );
	}
	
	public RetentionControlRegister getRetentionControlRegister( String id ) throws PersistenceException
	{
		return _retentionControlRegisterStorage.get( id );
	}

	public List< RetentionControlResult > getRetentionControlResultByRegister( String registerId ) throws PersistenceException
	{
		RetentionControlRegister register = _retentionControlRegisterStorage.get( registerId );
		if ( null == register )
			return new ArrayList< RetentionControlResult >( );
		
		return register.getResults( );
	}
}
