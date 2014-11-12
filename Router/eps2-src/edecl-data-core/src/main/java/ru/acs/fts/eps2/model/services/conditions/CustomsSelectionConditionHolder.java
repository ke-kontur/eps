package ru.acs.fts.eps2.model.services.conditions;

import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.eps2.model.entities.Edecl_Customs;

public class CustomsSelectionConditionHolder
{
	private CustomsSelectionConditionHolder( ) { }
	
	public static ExchTypeAndCodeSelectionCondition getExchTypeSelectorCodeSelectorCondition(
			String customsCode, String exchType )
	{
		return new ExchTypeAndCodeSelectionCondition( exchType, customsCode );
	}
	
	public static class ExchTypeAndCodeSelectionCondition  // NO_UCD (use private)
		extends AbstractSelectionCondition< Edecl_Customs >
	{
		private String _exchType;
		private String _customsCode;
		
		public ExchTypeAndCodeSelectionCondition( String exchType, String customsCode ) // NO_UCD (use private)
		{
			_exchType = exchType;
			_customsCode = customsCode;
		}
		
		@Override
		public boolean check( Edecl_Customs object )
		{
			boolean result = false;
			if ( null != object )
			{
				result = compare( object.getCustomCode( ), _customsCode )
						&& compare( object.getCustomExchange( ), _exchType );
			}
			
			return result;
		}

		@Override
		public String getQueryString( )
		{
			StringBuilder query = new StringBuilder( "select c from Edecl_Customs c" );
			query.append( " where c.customCode = :custCode" );
			query.append( " and c.customExchange = :custExchType" );
			
			return query.toString( );
		}

		@Override
		public Map< String, Object > getQueryArgs( )
		{
			Map< String, Object > args = new HashMap< String, Object >( );
			args.put( "custCode", _customsCode );
			args.put( "custExchType", _exchType);
			
			return args;
		}
	}
}
