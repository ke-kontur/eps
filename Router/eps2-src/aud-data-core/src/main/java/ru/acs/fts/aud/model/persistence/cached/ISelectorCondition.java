package ru.acs.fts.aud.model.persistence.cached;

import java.util.Map;

/**
 * Код бережно позаимствован из EPS2JAVA
 */
public interface ISelectorCondition< T > // NO_UCD (use default)
{
	public boolean check( T object );
	
	public String getQueryString( );
	
	public Map< String, Object > getQueryArgs( ); 
}
