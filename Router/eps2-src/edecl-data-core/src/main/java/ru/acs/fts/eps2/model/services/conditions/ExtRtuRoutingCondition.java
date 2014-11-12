package ru.acs.fts.eps2.model.services.conditions;

import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.eps2.model.entities.ExtRtuRouting;

// TODO: понять необходимость этого класса или удалить его если таковой не найдется
public class ExtRtuRoutingCondition extends AbstractSelectionCondition< ExtRtuRouting >  // NO_UCD (todo added)
{
	private String customsCode;
	private int exchType;
	
	public ExtRtuRoutingCondition( String customsCode, int exchType )
	{
		this.customsCode = customsCode;
		this.exchType = exchType;
	}
	
	@Override
	public boolean check( ExtRtuRouting object )
	{
		boolean result = false;
		if ( null != object )
		{
			result = ( customsCode.matches( object.getCustomCode( ).replaceAll( "%", ".*" ) ) ) &&
					 ( exchType == object.getExchType( ) );
		}
				
		return result;
	}

	@Override
	public String getQueryString( ) 
	{
		StringBuilder queryBuilder = new StringBuilder( );
		queryBuilder.append( "select err from ExtRtuRouting err " );
		queryBuilder.append( "where :customsCode LIKE err.customCode " );
		queryBuilder.append( "and err.exchType = :exchType " );
		
		return queryBuilder.toString( );
	}

	@Override
	public Map< String, Object > getQueryArgs( )
	{
		Map< String,Object > args = new HashMap< String, Object >( );
		args.put( "customsCode", customsCode );
		args.put( "exchType", exchType );
		
		return args;
	}

}
