package ru.acs.fts.aud.model.persistence.cached;

import java.util.HashMap;
import java.util.Map;

public class TrivialSelectorCondition< T > implements ISelectorCondition< T > // NO_UCD (use default)
{
	private String className;
	
	public TrivialSelectorCondition( Class< ? extends T > cls ) throws Exception // NO_UCD (use default)
	{
		if ( null == cls )
			throw new Exception( 
					"Не удается создать тривиальное условие - параметр конструктора null." );
		
		className = cls.getSimpleName( );
	}
	
	public TrivialSelectorCondition( String className ) // NO_UCD (unused code)
	{
		this.className = className;
	}
	
	@Override
	public boolean check( T object )
	{
		return true;
	}

	@Override
	public String getQueryString( )
	{
		return String.format( "select o from %s o", className );
	}

	@Override
	public Map< String, Object > getQueryArgs( )
	{
		return new HashMap< String, Object >( );
	}
}
