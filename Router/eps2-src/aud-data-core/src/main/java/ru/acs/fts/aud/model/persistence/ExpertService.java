package ru.acs.fts.aud.model.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.model.entities.ExpertRegister;
import ru.acs.fts.aud.model.entities.ExpertResult;
import ru.acs.fts.aud.model.entities.ServiceDocument;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;

@SuppressWarnings( "deprecation" )
public class ExpertService // NO_UCD (for future use)
{
	private BaseStorage< ServiceDocument > _serviceDocumentsStorage;
	private BaseStorage< ExpertRegister > _expertRegisterStorage;
	private BaseStorage< ExpertResult > _expertResultStorage;
	
	public ExpertService( )
	{
		_serviceDocumentsStorage = new BaseStorage< ServiceDocument >( ServiceDocument.class );
		_expertRegisterStorage = new BaseStorage< ExpertRegister >( ExpertRegister.class );
		_expertResultStorage = new BaseStorage< ExpertResult >( ExpertResult.class );
	}
	
	// @formatter:off
	@Required public void setJpaTemplate( JpaTemplate jpaTemplate ) 
	{ 
		_serviceDocumentsStorage.setJpaTemplate( jpaTemplate );
		_expertRegisterStorage.setJpaTemplate( jpaTemplate );
		_expertResultStorage.setJpaTemplate( jpaTemplate );
	}
	public JpaTemplate getJpaTemplate( ) { return _serviceDocumentsStorage.getJpaTemplate( ); }
	// @formatter:on
	
	public List< ExpertRegister > getAllExpertRegisters( ) throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		q.append( "select er from ExpertRegister er " );
		
		List< ExpertRegister > ers = _expertRegisterStorage.select( q.toString( ), new HashMap< String, Object >( ) );
		if ( null == ers )
			return new ArrayList< ExpertRegister >( );
		
		return ers;
	}
	
	@Transactional
	public void persistExpertRegister( ExpertRegister register ) 
		throws PersistenceException
	{
		_expertRegisterStorage.executePersistAndFlush( register );
	}
	
	@Transactional
	public void persistExpertResult( ExpertResult result ) 
		throws PersistenceException
	{
		_expertResultStorage.executePersistAndFlush( result );
	}
	
	@Transactional
	public void mergeExpertRegister( ExpertRegister register ) 
		throws PersistenceException
	{
		_expertRegisterStorage.executeMergeAndFlush( register );
	}
	
	@Transactional
	public void mergeExpertResult( ExpertResult result ) 
		throws PersistenceException
	{
		_expertResultStorage.executeMergeAndFlush( result );
	}
	
	@Transactional
	public void removeExpertRegister( String id ) throws PersistenceException
	{
		_expertRegisterStorage.removeById( id );
	}
	
	public ExpertRegister getExpertRegister( String id ) throws PersistenceException
	{
		return _expertRegisterStorage.get( id );
	}

	public List< ExpertResult > getExpertResultByRegister( String registerId ) throws PersistenceException
	{
		ExpertRegister register = _expertRegisterStorage.get( registerId );
		if ( null == register )
			return new ArrayList< ExpertResult >( );
		
		return register.getResults( );
	}
}
