package ru.acs.fts.aud.management.model.services;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaCallback;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings( "deprecation" )
public class BaseStorage< T >
{
	private static final Logger log = LoggerFactory.getLogger( BaseStorage.class );
	
	private JpaTemplate jpaTemplate;
	private Class<T> clz;
	
	// @formatter:off
	@Required public void setJpaTemplate( JpaTemplate jpaTemplate ) { this.jpaTemplate = jpaTemplate; }
	public JpaTemplate getJpaTemplate( ) { return jpaTemplate; }

	public Class<? extends T> getEntityClass( ) { return clz; }
	// @formatter:on
	
	public BaseStorage( Class<T> clz )
	{
		this.clz = clz;
	}
		
    public <K> boolean exists( final K key )
    	throws PersistenceException
    {
    	try
    	{
	    	if ( null == key )
	    		return false;
	
	    	T foundObject = jpaTemplate.find( getEntityClass( ), key );
	        return ( null != foundObject );
    	}
    	catch ( Exception exc )
    	{
    		log.error( String.format( "BaseStorage.exists failed for %s", key.toString( ) ), exc );    		
    		throw new PersistenceException( exc );
    	}
    }	
    
    public <K> T get( final K key )
    	throws PersistenceException
    {
    	try
    	{
	    	if ( null == key )
	    		return null;
	    	
	    	T foundObject = jpaTemplate.find( getEntityClass( ), key );
	    	return foundObject;
    	}
    	catch ( Exception exc )
    	{
    		log.error( String.format( "BaseStorage.get failed for %s", key.toString( ) ), exc );
    		throw new PersistenceException( exc );
    	}
    }
	
	public void executePersist( T objectToPersist ) 
		throws PersistenceException 
	{
		try
		{
			jpaTemplate.persist( objectToPersist );
		}
		catch ( Exception exc )
		{
			log.error( String.format( "BaseStorage.executePersist failed for %s", objectToPersist.toString( ) ), exc );
			throw new PersistenceException( exc );
		}
	}

	public void executePersistAndFlush( T objectToPersist ) 
		throws PersistenceException
	{
		try
		{
			jpaTemplate.persist( objectToPersist );
			jpaTemplate.flush( );
		}
		catch ( Exception exc )
		{
			log.error( String.format( "BaseStorage.executePersistAndFlush failed for %s", objectToPersist.toString( ) ), exc );
			throw new PersistenceException( exc );
		}
	}

	public void executeMerge( T objectToPersist ) 
		throws PersistenceException
	{
		try
		{
			jpaTemplate.merge( objectToPersist );
		}
		catch ( Exception exc )
		{
			log.error( String.format( "BaseStorage.executeMerge failed for %s", objectToPersist.toString( ) ), exc );
			throw new PersistenceException( exc );
		}
	}

	public void executeMergeAndFlush( T objectToPersist ) 
		throws PersistenceException
	{
		try
		{
			jpaTemplate.merge( objectToPersist );
			jpaTemplate.flush( );
		}
		catch ( Exception exc )
		{
			log.error( String.format( "BaseStorage.executeMergeAndFlush failed for %s", objectToPersist.toString( ) ), exc );
			throw new PersistenceException( exc );
		}
	}

	public void executeFlush( ) 
		throws PersistenceException
	{
		try
		{
			jpaTemplate.flush( );
		}
		catch ( Exception exc )
		{
			log.error( "BaseStorage.executeFlush failed", exc );
			throw new PersistenceException( exc );
		}
	}

	@Transactional( propagation = Propagation.REQUIRES_NEW, timeout = 300 )
	public void persistObjectInNewTransaction( T objectToPersist )
		throws PersistenceException
	{
		try
		{
			jpaTemplate.persist( objectToPersist );
			jpaTemplate.flush( );
		}
		catch ( Exception exc )
		{
			log.error( String.format( "BaseStorage.persistObjectInNewTransaction failed for %s", objectToPersist.toString( ) ), exc );
			throw new PersistenceException( exc );
		}
	}

	@Transactional( propagation = Propagation.REQUIRES_NEW, timeout = 300 )
	public void mergeObjectInNewTransaction( T objectToPersist )
		throws PersistenceException
	{
		try
		{
			jpaTemplate.merge( objectToPersist );
			jpaTemplate.flush( );
		}
		catch ( Exception exc )
		{
			log.error( String.format( "BaseStorage.mergeObjectInNewTransaction failed for %s", objectToPersist.toString( ) ), exc );
			throw new PersistenceException( exc );
		}
	}

	@SuppressWarnings( { "unchecked", "rawtypes" } )
	public Integer executeUpdateRequestWithCount( 
			final String updateQuery, 
			final Map< String, Object > arguments ) 
		throws PersistenceException
	{
		try
		{
			return ( Integer )jpaTemplate.execute( new JpaCallback( )
			{
				public Object doInJpa( EntityManager em ) 
					throws PersistenceException
				{
					Query query = em.createQuery( updateQuery );
					for ( Map.Entry< String, Object > argument : arguments.entrySet( ) )
					{
						query.setParameter( argument.getKey( ), argument.getValue( ) );
					}
					
					return query.executeUpdate( );
				}
			} );
		}
		catch ( Exception exc )
		{
			log.error( String.format( "BaseStorage.executeUpdateRequestWithCount failed for %s %s", updateQuery, arguments ), exc );
			throw new PersistenceException( exc );
		}
	}
	
	@SuppressWarnings( { "unchecked", "rawtypes" } )
	public void executeUpdateRequest( 
			final String updateQuery, 
			final Map< String, Object > arguments ) 
		throws PersistenceException
	{
		try
		{
			jpaTemplate.execute( new JpaCallback( )
			{
				public Object doInJpa( EntityManager em ) throws PersistenceException
				{
					Query query = em.createQuery( updateQuery );
					for ( Map.Entry< String, Object > argument : arguments.entrySet( ) )
					{
						query.setParameter( argument.getKey( ),
								argument.getValue( ) );
					}
					return query.executeUpdate( );
				}
			} );
		}
		catch ( Exception exc )
		{
			log.error( String.format( "BaseStorage.executeUpdateRequest failed for %s %s", updateQuery, arguments ), exc );
			throw new PersistenceException( exc );
		}
	}
	
	@SuppressWarnings( "unchecked" )
	public List< T > select( 
			final String query,
			final Map< String, Object > arguments )
		throws PersistenceException
	{
		try
		{
			List< T > res = ( List< T > )jpaTemplate.findByNamedParams( query, arguments );
			return res;
		}
		catch ( Exception exc )
		{
			log.error( String.format( "BaseStorage.select failed for %s %s", query, arguments ), exc );
			throw new PersistenceException( exc );
		}
	}

	public List<?> selectSpecial( 
			final String query,
			final Map< String, Object > arguments )
		throws PersistenceException
	{
		try
		{
			List<?> res = jpaTemplate.findByNamedParams( query, arguments );
			return res;
		}
		catch ( Exception exc )
		{
			log.error( String.format( "BaseStorage.select failed for %s %s", query, arguments ), exc );
			throw new PersistenceException( exc );
		}
	}

	public void remove( final T objectToRemove )
		throws PersistenceException
	{
		try
		{
			jpaTemplate.merge( objectToRemove );
			jpaTemplate.remove( objectToRemove );
			jpaTemplate.flush( );
		}
		catch ( Exception exc )
		{
			log.error( String.format( "BaseStorage.remove failed for %s", objectToRemove ), exc );
			throw new PersistenceException( exc );
		}
	}
	
	
	@Transactional( propagation = Propagation.REQUIRES_NEW )
	public void removeInNewTransaction( final T objectToRemove )
		throws PersistenceException
	{
		
		try
		{
			jpaTemplate.remove( objectToRemove );
		}
		catch ( Exception exc )
		{
			log.error( String.format( "BaseStorage.remove failed for %s", objectToRemove ), exc );
			throw new PersistenceException( exc );
		}
	}
	
	public <K> void removeById( K id )
		throws PersistenceException
	{
		try
		{
			remove( get( id ) );
		}
		catch ( Exception exc )
		{
			log.error( String.format( "BaseStorage.removeById failed for %s", id.toString( ) ), exc );
			throw new PersistenceException( exc );			
		}
	}
	
}
