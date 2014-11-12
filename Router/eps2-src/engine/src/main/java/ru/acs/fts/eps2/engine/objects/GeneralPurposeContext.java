package ru.acs.fts.eps2.engine.objects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneralPurposeContext
{
	protected Map< String, Object > _context = new HashMap< String, Object >( );
	
	public void put( String key, Object value )
	{
		_context.put( key, value );
	}

	public Object get( String key )
	{
		return _context.get( key );
	}

	public Object remove( String key )
	{
		return _context.remove( key );
	}

	public boolean contains( String key )
	{
		return _context.containsKey( key );
	}
	
	public String getString( String key )
	{
		Object obj = get( key );
		if ( null == obj || ! ( obj instanceof String ) )
			return null;
		
		return ( String )obj;
	}
	
	public boolean getBoolean( String key )
	{
		Object obj = get( key );
		if ( null == obj || ! ( obj instanceof String ) )
			return false;
		
		return Boolean.valueOf( ( String )obj );
	}
	
	@SuppressWarnings( "unchecked" )
	public < T > List< T > getList( String key )
	{
		Object obj = get( key );
		if ( null == obj || ! ( obj instanceof List< ? > ) )
			return null;
		
		return ( List< T > ) obj;
	}
	
	public Object getByValueOf( String key ) 
	{
		String keyValue = getString( key );
		if ( null == keyValue )
			return null;
		
		return get( keyValue );
	}
	
}
