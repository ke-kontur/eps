package ru.acs.fts.eps2.model.services.conditions;

import java.util.Map;

public interface ISelectionCondition< T > 
{
	public boolean check( T object );
	
	public String getQueryString( );
	
	public Map< String, Object > getQueryArgs( ); 
}
