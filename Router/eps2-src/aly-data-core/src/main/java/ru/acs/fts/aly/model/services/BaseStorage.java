package ru.acs.fts.aly.model.services;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaCallback;
import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.eps2.util.exceptions.DatabaseException;

@SuppressWarnings( "deprecation" )
class BaseStorage< T >
{
	private JpaTemplate _jpaTemplate;
	private Class< T > _clz;
	
	@Required
	public void setJpaTemplate( JpaTemplate jpaTemplate ) { _jpaTemplate = jpaTemplate; }
	public JpaTemplate getJpaTemplate( ) { return _jpaTemplate; }

	public Class< ? extends T > getEntityClass( ) { return _clz; }
	
	BaseStorage( Class<T> clz )
	{
		_clz = clz;
	}
		
    public < K > boolean exists( final K key )
    	throws DatabaseException
    {
    	try
    	{
	    	if ( null == key )
	    		return false;
	
	    	T foundObject = _jpaTemplate.find( getEntityClass( ), key );
	        return ( null != foundObject );
    	}
    	catch ( Exception exc )
    	{
    		throw new DatabaseException( "BaseStorage.exists failed", exc );
    	}
    }	
    
    public < K > T get( final K key )
    	throws DatabaseException
    {
    	try
    	{
	    	if ( null == key )
	    		return null;
	    	
	    	T foundObject = _jpaTemplate.find( getEntityClass( ), key );
	    	return foundObject;
    	}
    	catch ( Exception exc )
    	{
    		throw new DatabaseException( "BaseStorage.get failed", exc );
    	}
    }
	
	public void persist( T objectToPersist )
		throws DatabaseException
	{
		try
		{
			_jpaTemplate.persist( objectToPersist );
		}
		catch ( Exception exc )
		{
			throw new DatabaseException( "BaseStorage.persist failed", exc );
		}
	}

	public void persistAndFlush( T objectToPersist )
		throws DatabaseException
	{
		try
		{
			_jpaTemplate.persist( objectToPersist );
			_jpaTemplate.flush( );
		}
		catch ( Exception exc )
		{
			throw new DatabaseException( "BaseStorage.persistAndFlush failed", exc );
		}
	}

	public void merge( T objectToPersist )
		throws DatabaseException
	{
		try
		{
			_jpaTemplate.merge( objectToPersist );
		}
		catch ( Exception exc )
		{
			throw new DatabaseException( "BaseStorage.merge failed", exc );
		}
	}

	public void mergeAndFlush( T objectToPersist )
		throws DatabaseException
	{
		try
		{
			_jpaTemplate.merge( objectToPersist );
			_jpaTemplate.flush( );
		}
		catch ( Exception exc )
		{
			throw new DatabaseException( "BaseStorage.mergeAndFlush failed", exc );
		}
	}

	public void flush( )
		throws DatabaseException
	{
		try
		{
			_jpaTemplate.flush( );
		}
		catch ( Exception exc )
		{
			throw new DatabaseException( "BaseStorage.flush failed", exc );
		}
	}

	@SuppressWarnings( { "unchecked", "rawtypes" } )
	public Integer updateWithCount(
			final String updateQuery, 
			final Map< String, Object > arguments ) 
		throws DatabaseException
	{
		try
		{
			return ( Integer )_jpaTemplate.execute( new JpaCallback( )
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
			throw new DatabaseException( "BaseStorage.updateWithCount failed", exc );
		}
	}
	
	@SuppressWarnings( { "unchecked", "rawtypes" } )
	public void update(
			final String updateQuery, 
			final Map< String, Object > arguments ) 
		throws DatabaseException
	{
		try
		{
			_jpaTemplate.execute( new JpaCallback( )
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
			throw new DatabaseException( "BaseStorage.update failed", exc );
		}
	}
	
	@SuppressWarnings( "unchecked" )
	public List< T > select(
			final String query,
			final Map< String, Object > arguments )
		throws DatabaseException
	{
		try
		{
			List< T > res = ( List< T > )_jpaTemplate.findByNamedParams( query, arguments );
			return res;
		}
		catch ( Exception exc )
		{
			throw new DatabaseException( "BaseStorage.select failed", exc );
		}
	}
	
	@SuppressWarnings( { "unchecked", "rawtypes" } )
	public List< T > selectSlice(
			final String queryString,
			final Map< String, Object > args,
			final int offset, final int limit )
		throws DatabaseException
	{
		try
		{
			return ( List< T > )_jpaTemplate.execute( new JpaCallback( )
			{
				public Object doInJpa( EntityManager em )
				{
					Query query = em
						.createQuery( queryString )
						.setFirstResult( offset )
						.setMaxResults( limit );
					
					for ( Map.Entry< String, Object > arg : args.entrySet( ) )
					{
						query.setParameter( arg.getKey( ), arg.getValue( ) );
					}
					
					return query.getResultList( );
				}
			} );
		}
		catch ( Exception exc )
		{
			throw new DatabaseException( "BaseStorage.selectSlice failed", exc );
		}
	}	
	
	@SuppressWarnings( "unchecked" )
	public List< Object > selectObjects( final String query, final Map< String, Object > argument )
		throws DatabaseException
	{
		try
		{
			List< Object > res = ( List< Object > )_jpaTemplate.findByNamedParams( query, argument );		
			return res;
		}
		catch ( Exception exc )
		{
			throw new DatabaseException( "BaseStorage.selectObjects failed", exc );
		}
	}
	
	public void remove( final T objectToRemove )
		throws DatabaseException
	{
		try
		{
			_jpaTemplate.merge( objectToRemove );
			_jpaTemplate.remove( objectToRemove );
			_jpaTemplate.flush( );
		}
		catch ( Exception exc )
		{
			throw new DatabaseException( "BaseStorage.remove failed", exc );
		}
	}
	
	@SuppressWarnings( { "unchecked", "rawtypes" } )
	public void removeq(
			final String queryString,
			final Map< String, Object > args )
		throws DatabaseException
	{
		try
		{
			_jpaTemplate.execute( new JpaCallback( )
			{
				public Object doInJpa( EntityManager em )
				{
					Query query = em.createQuery( queryString );
					
					for ( Map.Entry< String, Object > arg : args.entrySet( ) )
					{
						query.setParameter( arg.getKey( ), arg.getValue( ) );
					}
					
					return query.executeUpdate( );
				}
			} );
		}
		catch ( Exception exc )
		{
			throw new DatabaseException( "BaseStorage.selectSlice failed", exc );
		}
	}	
	
		
	public < K > void removeById( K id )
		throws DatabaseException
	{
		remove( get( id ) );
	}
	
}
