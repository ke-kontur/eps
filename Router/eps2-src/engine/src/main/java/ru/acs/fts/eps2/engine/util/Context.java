package ru.acs.fts.eps2.engine.util;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * User: KGN
 * Date: 13.10.11
 * Time: 16:32
 */
public abstract class Context
{
	protected Map< String, Object > context = new Hashtable< String, Object >( );

	public void addContextProperty( String key, Object value )
	{
		context.put( key, value );
	}

	public Object getContextProperty( String key )
	{
		return context.get( key );
	}

	public Object removeContextProperty( String key )
	{
		return context.remove( key );
	}

	public boolean containsContextProperty( String key )
	{
		return context.containsKey( key );
	}
	
	/**
	 * Сокращение для addContextProperty
	 */
	public void put( String key, Object value )
	{
		addContextProperty( key, value );
	}
	
	/**
	 * Сокращение для getContextProperty, а то операции выглядят ужасно
	 * jobBatchContext.getContextProperty( ... jobContext.getContextProperty( ...
	 */
	public Object get( String key )
	{
		return getContextProperty( key );
	}
	
	/**
	 * Сокращение для проверки наличия, причины - см. выше
	 */
	public boolean contains( String key )
	{
		return containsContextProperty( key );
	}
	
	/**
	 * Еще одно полезное сокращение
	 * 
	 * @param key
	 * @return
	 */
	public String getString( String key )
	{
		Object obj = getContextProperty( key );
		if ( null == obj || ! ( obj instanceof String ) )
			return null;
		
		return ( String )obj;
	}
	
	public boolean getBoolean( String key )
	{
		Object obj = getContextProperty( key );
		if ( null == obj || ! ( obj instanceof String ) )
			return false;
		
		return Boolean.valueOf( ( String )obj );
	}
	
	/**
	 * Сокращение для списка
	 * @param <T> маска типа элемента списка
	 * @param key ключ
	 * @return список, если есть. Если нет, то придется довольствоваться null'ом
	 */
	@SuppressWarnings( "unchecked" )
	public < T > List< T > getList( String key )
	{
		Object obj = get( key );
		if ( null == obj || ! ( obj instanceof List< ? > ) )
			return null;
		
		return ( List< T > ) obj;
	}
	
	public Object getByValueOf( String key ) // NO_UCD (unused code)
	{
		String keyValue = getString( key );
		if ( null == keyValue )
			return null;
		
		return get( keyValue );
	}
}
