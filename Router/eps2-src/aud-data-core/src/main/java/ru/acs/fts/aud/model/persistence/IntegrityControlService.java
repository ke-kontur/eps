package ru.acs.fts.aud.model.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.model.entities.SignatureControlRegister;
import ru.acs.fts.aud.model.entities.SignatureControlResult;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;

@SuppressWarnings( "deprecation" )
public class IntegrityControlService // NO_UCD (for future use)
{
	private BaseStorage< SignatureControlRegister > _signatureControlRegisterStorage;
	private BaseStorage< SignatureControlResult > _signatureControlResultStorage;
	
	public IntegrityControlService( )
	{
		_signatureControlRegisterStorage = new BaseStorage< SignatureControlRegister >( SignatureControlRegister.class );
		_signatureControlResultStorage = new BaseStorage< SignatureControlResult >( SignatureControlResult.class );
	}
	
	// @formatter:off
	@Required public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_signatureControlRegisterStorage.setJpaTemplate( jpaTemplate );
		_signatureControlResultStorage.setJpaTemplate( jpaTemplate );
	}
	public JpaTemplate getJpaTemplate( ) { return _signatureControlRegisterStorage.getJpaTemplate( ); }
	// @formatter:on
	
	public List< SignatureControlRegister > getAllSignatureControlRegisters( ) throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		q.append( "select scr from SignatureControlRegister scr " );
		
		List< SignatureControlRegister > scrs = _signatureControlRegisterStorage.select( q.toString( ), new HashMap< String, Object >( ) );
		if ( null == scrs )
			return new ArrayList< SignatureControlRegister >( );
		
		return scrs;
	}

	@Transactional
	public void persistSignatureControlRegister( SignatureControlRegister register ) 
		throws PersistenceException
	{
		_signatureControlRegisterStorage.executePersistAndFlush( register );
	}
	
	@Transactional
	public void persistSignatureControlResult( SignatureControlResult result ) 
		throws PersistenceException
	{
		_signatureControlResultStorage.executePersistAndFlush( result );
	}
	
	@Transactional
	public void mergeSignatureControlRegister( SignatureControlRegister register ) 
		throws PersistenceException
	{
		_signatureControlRegisterStorage.executeMergeAndFlush( register );
	}	
	
	@Transactional
	public void removeSignatureControlRegister( String id ) throws PersistenceException
	{
		_signatureControlRegisterStorage.removeById( id );
	}	
	
	public SignatureControlRegister getSignatureControlRegister( String id ) throws PersistenceException
	{
		return _signatureControlRegisterStorage.get( id );
	}	

	public List< SignatureControlResult > getSignatureControlResultByRegister( String registerId ) throws PersistenceException
	{
		SignatureControlRegister register = _signatureControlRegisterStorage.get( registerId );
		if ( null == register )
			return new ArrayList< SignatureControlResult >( );
		
		return register.getResults( );
	}

}
