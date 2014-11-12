package ru.acs.fts.eps2.model.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.eps2.model.services.conditions.ISelectionCondition;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.time.TimeUtil;

@SuppressWarnings( "deprecation" )
public abstract class AbstractCachedService< T > implements IGenericCachedService  // NO_UCD (use default)
{
	/**
	 * Задается в днях, хранится в миллисекундах
	 */
	protected long _updateTimeout;
	
	protected BaseStorage< T > _baseStorage;
	
	protected Cache _cache = new Cache( );
	
	@Override
	public void setJpaTemplate( JpaTemplate jpaTemplate ) 
	{ 
		_baseStorage = new BaseStorage< T >( getEntityClass( ) );
		_baseStorage.setJpaTemplate( jpaTemplate );
	}
	
	@Override
	public void setUpdateTimeout( int updateTimeoutDays ) 
	{ 
		_updateTimeout = updateTimeoutDays * TimeUtil.getMillisInOneDay( ); 
	}
	
	public List< T > find( ISelectionCondition< T > condition )
		throws DatabaseException
	{
		List< T > results = new ArrayList< T >( );
		boolean isNeedToUpdate = false;
		
		/** 
		 * synchronized был добавлен по требованию JavaDoc Collections.synchronizedList
		 */
		List< CacheItem< T > > cached = _cache.getCached( );
		synchronized ( cached )
		{
			for ( CacheItem< T > item : cached )
			{
				T object = item.getObject( );
				if ( condition.check( object ) )
				{
					/** 
					 * здесь лучше выйти из цикла. Все равно потом происходит удаление всех
					 * кэшированных объектов, т.к. данные устарели (они считаются устаревшими, если найден
					 * хоть один объект, не обновлявшийся дольше указанного промежутка времени)
					 */
					if ( isExceedTimeout( item ) )
						isNeedToUpdate = true;
					
					results.add( object );
				}
			}
		}
		
		if ( results.isEmpty( ) )
		{
			results = selectByCondition( condition );
			_cache.merge( results );
		}
		
		if ( isNeedToUpdate )
		{
//			cache.removeItems( results );
			results.removeAll( results );
			results = selectByCondition( condition );
			_cache.merge( results );
		}	
		
		return results;
	}
	
	public boolean exists( ISelectionCondition< T > condition )
		throws DatabaseException
	{
		return ! find( condition ).isEmpty( );
	}
	
	public void merge( T object ) 
		throws DatabaseException
	{
		_baseStorage.mergeAndFlush( object );
	}
	
	public <K> T get( K id ) 
		throws DatabaseException
	{
		return _baseStorage.get( id );
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
		
		return now.getTime( ) - cachedItem.getUpdateDate( ).getTime( ) >= _updateTimeout;
	}
	
	private List< T > selectByCondition( ISelectionCondition< T > condition ) 
		throws DatabaseException
	{
		return _baseStorage.select( condition.getQueryString( ), condition.getQueryArgs( ) );
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
