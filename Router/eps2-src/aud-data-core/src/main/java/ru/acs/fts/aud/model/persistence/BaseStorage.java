package ru.acs.fts.aud.model.persistence;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaCallback;
import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.aud.model.filtering.Page;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.eps2.utils.CollectionHelper;

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
    		throw new PersistenceException( exc );
    	}
    }
	
	public void executePersist( T objectToPersist )  // NO_UCD (unused code)
		throws PersistenceException
	{
		try
		{
			jpaTemplate.persist( objectToPersist );
		}
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка persist в БД: %s", exception.getMessage( ) );
			
			log.error( errorMsg );
			throw new PersistenceException( errorMsg, exception );
		}
	}

	public void executePersistAndFlush( T objectToPersist )  // NO_UCD (use default)
		throws PersistenceException
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
			throw new PersistenceException( errorMsg, exception );
		}
	}

	public void executeMerge( T objectToPersist )  // NO_UCD (unused code)
		throws PersistenceException
	{
		try
		{
			jpaTemplate.merge( objectToPersist );
		}
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка merge в БД: %s", exception.getMessage( ) );
			
			log.error( errorMsg );
			throw new PersistenceException( errorMsg, exception );
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
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка merge в БД: %s", exception.getMessage( ) );
			
			log.error( errorMsg );
			throw new PersistenceException( errorMsg, exception );
		}
	}

	public void executeFlush( )  // NO_UCD (unused code)
		throws PersistenceException
	{
		try
		{
			jpaTemplate.flush( );
		}
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка flush в БД: %s", exception.getMessage( ) );
			
			log.error( errorMsg );
			throw new PersistenceException( errorMsg, exception );
		}
	}

	public Integer updateWithCount(  // NO_UCD (use default)
			final String updateQuery, 
			final Map< String, Object > arguments ) 
		throws PersistenceException
	{
		try
		{
			return jpaTemplate.execute( new JpaCallback< Integer >( )
			{
				public Integer doInJpa( EntityManager em )
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
			throw new PersistenceException( errorMsg, exception );
		}
	}
	
	public void update(
			final String updateQuery, 
			final Map< String, Object > arguments ) 
		throws PersistenceException
	{
		try
		{
			jpaTemplate.execute( new JpaCallback< Object >( )
			{
				public Object doInJpa( EntityManager em )
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
			throw new PersistenceException( errorMsg, exception );
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
			throw new PersistenceException( exc );
		}
	}
	
	public T selectUnique( // NO_UCD (use default)
			String query,
			Map< String, Object > arguments )
		throws PersistenceException
	{
		return CollectionHelper.getFirst( select( query, arguments ) );
	}
	
	@SuppressWarnings( "unchecked" )
	public List< Long > selectCount( // NO_UCD (use default)
			final String query,
			final Map< String, Object > arguments )
		throws PersistenceException
	{
		try
		{
			List< Long > res = ( List< Long > )jpaTemplate.findByNamedParams( query, arguments );
			return res;
		}
		catch ( Exception exc )
		{
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
			throw new PersistenceException( exc );
		}
	}
	
	public void executeNativeUpdateRequest(  // NO_UCD (unused code)
			final String updateQuery, 
			final Map< String, Object > arguments ) 
		throws PersistenceException
	{
		try
		{
			jpaTemplate.execute( new JpaCallback< Object >( )
			{
				public Object doInJpa( EntityManager em )
				{
					Query query = em.createNativeQuery( updateQuery );
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
			String errorMsg = String.format( "Ошибка native UPDATE в БД: %s", exception.getMessage( ) );
			
			log.error( errorMsg );
			throw new PersistenceException( errorMsg, exception );
		}
	}
	
	@SuppressWarnings( "unchecked" )
	public List< T > selectSlice(  // NO_UCD (use private)
			final String queryString, 
			final Map< String, Object > args,
			final int first, final int limit ) 
		throws PersistenceException
	{
		try
		{
			return jpaTemplate.execute( new JpaCallback< List< T > >( )
			{
				public List< T > doInJpa( EntityManager em )
				{
					Query query = em.createQuery( queryString ).setFirstResult( first )
						.setMaxResults( limit );
					for ( Map.Entry< String, Object > argument : args.entrySet( ) )
					{
						query.setParameter( argument.getKey( ),
								argument.getValue( ) );
					}
					return query.getResultList( );
				}
			} );
		}
		catch ( Exception exception )
		{
			String errorMsg = String.format( "Ошибка SELECT в БД: %s", exception.getMessage( ) );
			
			log.error( errorMsg );
			throw new PersistenceException( errorMsg, exception );
		}
	}
	
	public Page< T > selectPage(  // NO_UCD (use default)
			final String alias,
			final String whereClauseString,
			final Map< String, Object > args, 
			final int first, final int limit ) 
		throws PersistenceException
	{
		String fromClause = String.format( 
				"from %s %s %s", clz.getSimpleName( ), alias, whereClauseString );
		
		final String countString = String.format( "select count(%s) %s", alias, fromClause );
		Long amount = CollectionHelper.getFirst( selectCount( countString, args ) );
		amount = ( null == amount ) ? 0 : amount;
		
		int max = Math.max( 1, limit );
		int firstPosition = ( int )
			( ( first == -1 ) ? Math.max( amount / max - max, 0 ) : first ); 
		final String queryString = String.format( "select %s %s", alias, fromClause );
		List< T > results = selectSlice( queryString, args, firstPosition, max );
		
		return new Page< T >( results, amount );
	}
	
	public Page< T > selectPage(  // NO_UCD (use default)
			final String alias,
			final String whereClauseString,
			final Map< String, Object > args, 
			final int first, final int limit,
			final List< String > sortFields, boolean ascending ) 
		throws PersistenceException 
	{
		StringBuilder whereString = new StringBuilder( whereClauseString );
		if ( ! CollectionHelper.isNullOrEmpty( sortFields ) )
		{
//			whereString.append( " order by " );
//			whereString.append( sortFields.get( 0 ) );
			
			whereString.append( String.format( " order by %s.%s", alias, sortFields.get( 0 ) ) );
			
			for ( int i = 1; i < sortFields.size( ); i++ )
			{
//				whereString.append( ", " );
//				whereString.append( sortFields.get( i ) );
				whereString.append( String.format( ", %s.%s", alias, sortFields.get( i ) ) );
			}
			whereString.append( ascending ? " asc" : " desc"  );
		}
		
		return selectPage( alias, whereString.toString( ), args, first, limit );
	}
	
	public Object selectMaxFieldValue( final String fieldName )  // NO_UCD (use default)
		throws PersistenceException
	{
		String alias = "o";
		final String queryString = 
			String.format( "select MAX( %s.%s ) from %s %s", alias, fieldName, 
					clz.getSimpleName( ), alias );
		try
		{
			return jpaTemplate.execute( new JpaCallback< Object >( )
			{
				public Object doInJpa( EntityManager em )
				{
					Query query = em.createQuery( queryString );
					
					return query.getSingleResult( );
				}
			} );
		}
		catch ( Exception exc )
		{
			String errorMsg = String.format( "Ошибка SELECT MAX в БД: %s", exc.getMessage( ) );
			
			log.error( errorMsg );
			throw new PersistenceException( errorMsg, exc );
		}
	}
	
	public Object selectSingleResult( 
			final String queryString,
			final Map< String, Object > arguments )
		throws PersistenceException
	{
		try
		{
			return jpaTemplate.execute( new JpaCallback< Object >( )
				{
					public Object doInJpa( EntityManager em )
					{
						Query query = em.createQuery( queryString );
						for ( Map.Entry< String, Object > argument : arguments.entrySet( ) )
						{
							query.setParameter( argument.getKey( ),
									argument.getValue( ) );
						}
						return query.getSingleResult( );
					}
				} );
		}
		catch ( Exception exc )
		{
			throw new PersistenceException( exc );
		}
	}
	
	@SuppressWarnings( "unchecked" )
	public < FT > List< FT > selectFields( String fieldName, String alias, String conditionString, Map< String, Object > args, boolean distinct )  // NO_UCD (use default)
		throws PersistenceException
	{
		String query = String.format( "select %s %s.%s from %s %s", distinct ? "distinct" : "", alias, fieldName, clz.getSimpleName( ), alias );
		
		if ( null != conditionString && ! conditionString.isEmpty( ) )
			query = String.format( "%s where %s", query, conditionString );
		
		try
		{
			return jpaTemplate.findByNamedParams( query, args );
		}
		catch ( Exception ex )
		{
			String errorMsg = String.format( "Ошибка SELECT списка значений поля %s: %s", fieldName, ex.getMessage( ) );
			
			log.error( errorMsg );
			throw new PersistenceException( errorMsg, ex );
		}
	}
	
	/*
	@SuppressWarnings( { "unchecked", "rawtypes" } )
	public Page< T > selectPage( 
			final String alias,
			final String whereClauseString,
			final Map< String, Object > args, 
			final int first, final int limit ) 
		throws PersistenceException
	{
		final String queryString = 
			String.format( "select %s, count(%s) from %s %s %s", 
					alias, alias, clz.getSimpleName( ), alias, whereClauseString );
		try
		{
			List< Object[ ] > results = ( List< Object[ ] > ) jpaTemplate.execute( new JpaCallback( )
			{
				public Object doInJpa( EntityManager em )
				{
					Query query = em.createQuery( queryString ).setFirstResult( first )
						.setMaxResults( limit );
					for ( Map.Entry< String, Object > argument : args.entrySet( ) )
					{
						query.setParameter( argument.getKey( ),
								argument.getValue( ) );
					}
					return query.getResultList( );
				}
			} );
			
			List< T > entities = new ArrayList< T >( );
			Page< T > page = null;
			if ( CollectionUtil.isNullOrEmpty( results ) )
			{
				page = new Page< T >( entities, 0 );
			}
			else
			{
				for ( Object[ ] result : results )
					entities.add( ( T ) result[ 0 ] );
				page = new Page< T >( entities, ( Long ) results.get( 0 )[ 1 ] );
			}
			
			return page;
		}
		catch ( Exception ex )
		{
			String errorMsg = String.format( "Ошибка SELECT в БД: %s", ex.getMessage( ) );
			
			log.error( errorMsg );
			throw new PersistenceException( errorMsg, ex );
		}
	}
	*/
}
