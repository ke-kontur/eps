package ru.acs.fts.eps2.ws.event.database.services;

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
	
	@Required
	public void setJpaTemplate( JpaTemplate jpaTemplate ) { this.jpaTemplate = jpaTemplate; }
	public JpaTemplate getJpaTemplate( ) { return jpaTemplate; }

	public Class<? extends T> getEntityClass( ) { return clz; }
	
	public BaseStorage( Class<T> clz )
	{
		this.clz = clz;
	}
		
    public <K> boolean exists( final K key )
    {
    	if ( null == key )
    		return false;

    	T foundObject = jpaTemplate.find( getEntityClass( ), key );
        return ( null != foundObject );
    }	
    
    public <K> T get( final K key )
    {
    	if ( null == key )
    		return null;
    	
    	T foundObject = jpaTemplate.find( getEntityClass( ), key );
    	return foundObject;
    }
	
	public void executePersist( T objectToPersist ) 
		throws Exception 
	{
		try
		{
			jpaTemplate.persist( objectToPersist );
		}
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка persist в БД: %s", exception.getMessage( ) );
			
			log.error( errorMsg );
			throw exception;
		}
	}

	public void executePersistAndFlush( T objectToPersist ) 
		throws Exception
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
			throw exception;
		}
	}

	public void executeMerge( T objectToPersist ) 
		throws Exception
	{
		try
		{
			jpaTemplate.merge( objectToPersist );
		}
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка merge в БД: %s", exception.getMessage( ) );
			
			log.error( errorMsg );
			throw exception;
		}
	}

	public void executeMergeAndFlush( T objectToPersist ) 
		throws Exception
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
			throw exception;
		}
	}

	public void executeFlush( ) 
		throws Exception
	{
		try
		{
			jpaTemplate.flush( );
		}
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка flush в БД: %s", exception.getMessage( ) );
			
			log.error( errorMsg );
			throw exception;
		}
	}

	@Transactional( propagation = Propagation.REQUIRES_NEW, timeout = 300 )
	public void persistObjectInNewTransaction( T objectToPersist )
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
	public void mergeObjectInNewTransaction( T objectToPersist )
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

	@SuppressWarnings( { "unchecked", "rawtypes" } )
	public Integer executeUpdateRequestWithCount( 
			final String updateQuery, 
			final Map< String, Object > arguments ) 
		throws Exception
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
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка UPDATE в БД: %s", exception.getMessage( ));
			
			log.error( errorMsg );
			throw exception;
		}
	}
	
	@SuppressWarnings( { "unchecked", "rawtypes" } )
	public void executeUpdateRequest( 
			final String updateQuery, 
			final Map< String, Object > arguments ) 
		throws Exception
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
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка UPDATE в БД: %s", exception.getMessage( ) );
			
			log.error( errorMsg );
			throw exception;
		}
	}
	
	@SuppressWarnings( "unchecked" )
	public List< T > select( 
			final String query,
			final Map< String, Object > arguments )
	{
		// List< T > res = ( List< T > )jpaTemplate.find( query, arguments );
		List< T > res = ( List< T > )jpaTemplate.findByNamedParams( query, arguments );
		return res;
	}
	
	public void remove( final T objectToRemove )
	{
		jpaTemplate.merge( objectToRemove );
		jpaTemplate.remove( objectToRemove );
		jpaTemplate.flush( );
	}
	
	
	@Transactional( propagation = Propagation.REQUIRES_NEW )
	public void removeInNewTransaction( final T objectToRemove )
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
	
	public <K> void removeById( K id )
	{
		remove( get( id ) );
	}
	
}
