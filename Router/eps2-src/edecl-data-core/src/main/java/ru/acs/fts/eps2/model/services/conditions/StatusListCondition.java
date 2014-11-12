/**
 * 
 */
package ru.acs.fts.eps2.model.services.conditions;

import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.eps2.model.entities.Edecl_Statuslist;

/**
 * @author admin
 *
 */
public class StatusListCondition extends AbstractSelectionCondition< Edecl_Statuslist >
{
	private String _code;
	
	public StatusListCondition( String code )
	{
		_code = code;
	}
	
	@Override
	public boolean check( Edecl_Statuslist object )
	{
		boolean result = false;
		if ( null != object )
		{
			String code = object.getCode( );
			result = compare( code, _code );
		}
		
		return result;
	}

	@Override
	public String getQueryString( )
	{
		StringBuilder query = new StringBuilder( "select sl from Edecl_Statuslist sl" );
		query.append( " where sl.code = :code" );
		
		return query.toString( );
	}

	@Override
	public Map< String, Object > getQueryArgs( )
	{
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "code", _code );
		
		return args;
	}

}
