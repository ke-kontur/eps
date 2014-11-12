package ru.acs.fts.eps2.failedMessages.persistence.services;

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

import ru.acs.fts.eps2.failedMessages.exceptions.StorageException;

@SuppressWarnings( "deprecation" )
public class BaseStorage< T > // NO_UCD (use default)
{
	private static final Logger log = LoggerFactory.getLogger( BaseStorage.class );
	
	private JpaTemplate jpaTemplate;
	private Class<T> clz;
	
	@Required
	public void setJpaTemplate( JpaTemplate jpaTemplate ) { this.jpaTemplate = jpaTemplate; }
	public JpaTemplate getJpaTemplate( ) { return jpaTemplate; }

	public Class<? extends T> getEntityClass( ) { return clz; }
	
	public BaseStorage( Class<T> clz ) // NO_UCD (use default)
	{
		this.clz = clz;
	}
		
    public <K> boolean exists( final K key ) // NO_UCD (unused code)
    {
    	if ( null == key )
    		return false;

    	T foundObject = jpaTemplate.find( getEntityClass( ), key );
        return ( null != foundObject );
    }	
    
    public <K> T get( final K key ) // NO_UCD (use private)
    {
    	if ( null == key )
    		return null;
    	
    	T foundObject = jpaTemplate.find( getEntityClass( ), key );
    	return foundObject;
    }
	
	public void executePersist( T objectToPersist )  // NO_UCD (unused code)
		throws StorageException
	{
		try
		{
			jpaTemplate.persist( objectToPersist );
		}
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка persist в БД: %s", exception.getMessage( ) );
			
			log.error( errorMsg );
			throw new StorageException( errorMsg, exception );
		}
	}

	public void executePersistAndFlush( T objectToPersist )  // NO_UCD (use default)
		throws StorageException
	{
		try
		{
			jpaTemplate.persist( objectToPersist );
			jpaTemplate.flush( );
		}
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка persist в БД: %s", exception.getMessage( ) );
			
			log.error( errorMsg );
			throw new StorageException( errorMsg, exception );
		}
	}

	public void executeMerge( T objectToPersist )  // NO_UCD (unused code)
		throws StorageException
	{
		try
		{
			jpaTemplate.merge( objectToPersist );
		}
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка merge в БД: %s", exception.getMessage( ) );
			
			log.error( errorMsg );
			throw new StorageException( errorMsg, exception );
		}
	}

	public void executeMergeAndFlush( T objectToPersist )  // NO_UCD (unused code)
		throws StorageException
	{
		try
		{
			jpaTemplate.merge( objectToPersist );
			jpaTemplate.flush( );
		}
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка merge в БД: %s", exception.getMessage( ) );
			
			log.error( errorMsg );
			throw new StorageException( errorMsg, exception );
		}
	}

	public void executeFlush( )  // NO_UCD (unused code)
		throws StorageException
	{
		try
		{
			jpaTemplate.flush( );
		}
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка flush в БД: %s", exception.getMessage( ) );
			
			log.error( errorMsg );
			throw new StorageException( errorMsg, exception );
		}
	}

	@Transactional( propagation = Propagation.REQUIRES_NEW, timeout = 300 )
	public void persistObjectInNewTransaction( T objectToPersist ) // NO_UCD (unused code)
	{
		try
		{
			jpaTemplate.persist( objectToPersist );
			jpaTemplate.flush( );
		}
		catch ( Exception e )
		{
			/*
			String errorMsg = String.format( 
				"Ошибка persist в БД в независимой транзакции: %s",
				e.getMessage( ) 
			);
			
			log.error( errorMsg, e );
			*/
		}
	}

	@Transactional( propagation = Propagation.REQUIRES_NEW, timeout = 300 )
	public void mergeObjectInNewTransaction( T objectToPersist ) // NO_UCD (unused code)
	{
		try
		{
			jpaTemplate.merge( objectToPersist );
			jpaTemplate.flush( );
		}
		catch ( Exception e )
		{
			String errorMsg = String.format(
				"Ошибка merge в БД в независимой транзакции: %s",
				e.getMessage( )
			);
			
			log.error( errorMsg, e );
		}
	}

	public Integer executeUpdateRequestWithCount(  // NO_UCD (unused code)
			final String updateQuery, 
			final Map< String, Object > arguments ) 
		throws StorageException
	{
		try
		{
			return jpaTemplate.execute( new JpaCallback< Integer >( )
			{
				public Integer doInJpa( EntityManager em ) 
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
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка UPDATE в БД: %s", exception.getMessage( ));
			
			log.error( errorMsg );
			throw new StorageException( errorMsg, exception );
		}
	}
	
	public void executeUpdateRequest(  // NO_UCD (unused code)
			final String updateQuery, 
			final Map< String, Object > arguments ) 
		throws StorageException
	{
		try
		{
			jpaTemplate.execute( new JpaCallback< Object >( )
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
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка UPDATE в БД: %s", exception.getMessage( ) );
			
			log.error( errorMsg );
			throw new StorageException( errorMsg, exception );
		}
	}
	
	@SuppressWarnings( "unchecked" )
	public List< T > select(  // NO_UCD (unused code)
			final String query,
			final Map< String, Object > arguments )
	{
		// List< T > res = ( List< T > )jpaTemplate.find( query, arguments );
		List< T > res = ( List< T > )jpaTemplate.findByNamedParams( query, arguments );
		return res;
	}
	
	public void remove( final T objectToRemove ) // NO_UCD (use private)
	{
		jpaTemplate.merge( objectToRemove );
		jpaTemplate.remove( objectToRemove );
		jpaTemplate.flush( );
	}
	
	
	@Transactional( propagation = Propagation.REQUIRES_NEW )
	public void removeInNewTransaction( final T objectToRemove ) // NO_UCD (unused code)
	{
		
		try
		{
			jpaTemplate.remove( objectToRemove );
		}
		catch ( Exception e )
		{
			String errorMsg = String.format(
				"Ошибка remove в БД в независимой транзакции: %s",
				e.getMessage( )
			);
			
			log.error( errorMsg, e );
		}
	}
	
	public <K> void removeById( K id ) // NO_UCD (unused code)
	{
		remove( get( id ) );
	}
	
}
