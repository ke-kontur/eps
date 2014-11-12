package ru.acs.fts.aud.model.persistence.cached;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.aud.model.persistence.BaseStorage;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.eps2.util.time.TimeUtil;

/**
 * Код бережно позаимствован из EPS2JAVA
 */
@SuppressWarnings( "deprecation" )
public abstract class AbstractCachedService< T > implements ICachedService // NO_UCD (use default)
{
	/**
	 * Задается в днях, хранится в миллисекундах
	 */
	protected long updateTimeout; // NO_UCD (use private)
	
	protected BaseStorage< T > baseStorage; // NO_UCD (use private)
	
	protected Cache cache = new Cache( ); // NO_UCD (use private)
	
	@Override
	public void setJpaTemplate( JpaTemplate jpaTemplate ) 
	{ 
		baseStorage = new BaseStorage< T >( getEntityClass( ) );
		baseStorage.setJpaTemplate( jpaTemplate );
	}
	
	@Override
	public void setUpdateTimeout( int updateTimeoutDays ) 
	{ 
		this.updateTimeout = updateTimeoutDays * TimeUtil.getMillisInOneDay( ); 
	}
	
	public List< T > find( ISelectorCondition< T > condition ) 
		throws PersistenceException
	{
		List< T > results = new ArrayList< T >( );
		boolean isNeedToUpdate = false;
		
		// synchronized был добавлен по требованию JavaDoc Collections.synchronizedList
		List< CacheItem< T > > cached = cache.getCached( );
		synchronized ( cached )
		{
			for ( CacheItem< T > item : cached )
			{
				T object = item.getObject( );
				if ( condition.check( object ) )
				{
					// здесь лучше выйти из цикла. Все равно потом происходит удаление всех 
					// кэшированных объектов, т.к. данные устарели (они считаются устаревшими, если найден
					// хоть один объект, не обновлявшийся дольше указанного промежутка времени)
					if ( isExceedTimeout( item ) )
						isNeedToUpdate = true;
					
					results.add( object );
				}
			}
		}
		
		if ( results.isEmpty( ) )
		{
			results = selectByCondition( condition );
			cache.merge( results );
		}
		
		if ( isNeedToUpdate )
		{
//			cache.removeItems( results );
			results.removeAll( results );
			results = selectByCondition( condition );
			cache.merge( results );
		}	
		
		return results;
	}
	
	public boolean exists( ISelectorCondition< T > condition ) 
		throws PersistenceException
	{
		return ! find( condition ).isEmpty( );
	}
	
	public void merge( T object )  // NO_UCD (unused code)
		throws PersistenceException
	{
		baseStorage.executeMergeAndFlush( object );
	}
	
	public <K> T get( K id ) 
		throws PersistenceException
	{
		return baseStorage.get( id );
	}
	
	public List< T > getAll( ) 
		throws Exception
	{
		return find( getTrivialSelectorCondition( ) );
	}
	
	protected TrivialSelectorCondition< T > getTrivialSelectorCondition( )  // NO_UCD (use private)
		throws Exception
	{
		return new TrivialSelectorCondition< T >( getEntityClass( ) );
	}
	
	/**
	 * Превышен ли таймаут обновления у проверяемого объекта
	 * 
	 * @param cachedItem проверяемый объект
	 * 
	 * @return да/нет
	 */
	private boolean isExceedTimeout( CacheItem< T > cachedItem )
	{
		Date now = new Date( );
		
		return now.getTime( ) - cachedItem.getUpdateDate( ).getTime( ) >= updateTimeout;
	}
	
	private List< T > selectByCondition( ISelectorCondition< T > condition ) 
		throws PersistenceException
	{
		return baseStorage.select( condition.getQueryString( ), condition.getQueryArgs( ) );
	}
	
	abstract public Class< T > getEntityClass( );
	
	private class Cache
	{
		private List< CacheItem< T > > cached;
		
		public Cache( )
		{
			cached = Collections.synchronizedList( new ArrayList< CacheItem< T > >( ) );
		}
		
		public List< CacheItem< T > > getCached( )
		{
			return cached;
		}
		
		public void addCacheItem( T object )
		{
			CacheItem< T > item = new CacheItem< T >( object, new Date( ) );
			cached.add( item );
		}
		
		/**
		 * MrDekk: 
		 * 	закомментил, т.к. пока не используется, удалять не стоит, а так - чтоб
		 *  не кушал память и т.д. 
		 */
		/*
		public void removeItems( List< T > items )
		{
			cached.removeAll( items );
		}
		*/
		
		public void merge( List< T > items )
		{
			for ( T item : items )
				addCacheItem( item );
		}
	}
}
