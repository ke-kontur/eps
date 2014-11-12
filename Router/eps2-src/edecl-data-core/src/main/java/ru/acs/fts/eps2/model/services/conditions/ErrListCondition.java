package ru.acs.fts.eps2.model.services.conditions;

import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.eps2.model.entities.Edecl_Errlist;

public class ErrListCondition extends AbstractSelectionCondition< Edecl_Errlist > 
{
	private String errorCode;
	
	public ErrListCondition( String errorCode )
	{
		this.errorCode = errorCode;
	}
	
	@Override
	public boolean check( Edecl_Errlist object )
	{
		boolean result = false;
		if ( null != object )
		{
			String objErrorCode = object.getErrCode( );
			result = compare( objErrorCode, errorCode );
		}
				
		return result;
	}

	@Override
	public String getQueryString( ) 
	{
		StringBuilder queryBuilder = new StringBuilder( );
		queryBuilder.append( "select err from Edecl_Errlist err " );
		queryBuilder.append( "where err.errCode = :errCode" );
		
		return queryBuilder.toString( );
	}

	@Override
	public Map< String, Object > getQueryArgs( )
	{
		Map< String,Object > args = new HashMap< String, Object >( );
		args.put( "errCode", errorCode );
		
		return args;
	}

}
