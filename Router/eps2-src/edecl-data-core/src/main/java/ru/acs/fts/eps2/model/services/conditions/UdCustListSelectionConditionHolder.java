package ru.acs.fts.eps2.model.services.conditions;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.eps2.model.entities.Edecl_Udcustlist;

public class UdCustListSelectionConditionHolder
{
	private UdCustListSelectionConditionHolder( ) { }
	
	public static UdCustListOrSelectionCondition getUdCustListOrSelectorCondition( 
			String intCustCode, String extCustCode )
	{
		return new UdCustListOrSelectionCondition( intCustCode, extCustCode );
	}
	
	public static UdCustListSelectionCondition getUdCustListSelectorCondition( 
			String localCode, String remoteCode )
	{
		return new UdCustListSelectionCondition( localCode, remoteCode );
	}
	
	public static class UdCustListOrSelectionCondition extends // NO_UCD (use private)
		AbstractSelectionCondition< Edecl_Udcustlist >
	{
		private String intCustCode;
		private String extCustCode;
		
		public UdCustListOrSelectionCondition( String intCode, String extCode ) // NO_UCD (use private)
		{
			intCustCode = intCode;
			extCustCode = extCode;
		}
		
		@Override
		public boolean check( Edecl_Udcustlist object )
		{
			boolean result = false;
			if ( null != object )
			{
				String extCode = object.getExtCustCode( );
				String intCode = object.getIntCustCode( );
				
				result = compare( intCode, intCustCode ) || compare( extCode, extCustCode );
				
				if ( result )
				{
					Date endDate = object.getEndDate( );
					if ( null != endDate && endDate.compareTo( new Date( ) ) < 0 )
						result = false;
				}
			}
			
			return result;
		}
		
		@Override
		public String getQueryString( )
		{
			StringBuilder query = new StringBuilder( );
			query.append( "select ud from Edecl_Udcustlist ud " );
			query.append( "where ( ud.extCustCode = :extCustCode" );
			query.append( " or ud.intCustCode = :intCustCode )" );
			query.append( " and ( ud.endDate IS NULL OR ud.endDate >= CURRENT_DATE )" );
			
			return query.toString( );
		}
		
		@Override
		public Map< String, Object > getQueryArgs( )
		{
			Map< String, Object > args = new HashMap< String, Object >( );
			args.put( "extCustCode", extCustCode );
			args.put( "intCustCode", intCustCode );
			
			return args;
		}
	}
	
	public static class UdCustListSelectionCondition extends  // NO_UCD (use private)
		AbstractSelectionCondition< Edecl_Udcustlist > 
	{
		private String remoteCustomsCode;
		private String localCustomsCode;
		
		public UdCustListSelectionCondition( String localCode, String remoteCode) // NO_UCD (use private)
		{
			localCustomsCode = localCode;
			remoteCustomsCode = remoteCode;
		}
		
		@Override
		public boolean check( Edecl_Udcustlist object ) 
		{
			boolean result = false;
			if ( null != object )
			{
				String extCode = object.getExtCustCode( );
				String intCode = object.getIntCustCode( );
				
				result = compare( remoteCustomsCode, extCode );
				if ( result )
					result = compare( localCustomsCode, intCode );
				
				if ( result )
				{
					Date endDate = object.getEndDate( );
					if ( null != endDate && endDate.compareTo( new Date( ) ) < 0 )
						result = false;
				}
			}
			
			return result;
		}

		@Override
		public String getQueryString( ) 
		{
			StringBuilder query = new StringBuilder( );
			query.append( "select ud from Edecl_Udcustlist ud " );
			query.append( "where ud.extCustCode = :extCustCode" );
			query.append( " and ud.intCustCode = :intCustCode" );
			query.append( " and ( ud.endDate IS NULL OR ud.endDate >= CURRENT_DATE )" );
			query.append( " and ( ud.startDate IS NULL OR ud.startDate <= CURRENT_DATE )" );
			
			return query.toString( );
		}

		@Override
		public Map< String, Object > getQueryArgs( ) 
		{
			Map< String, Object > args = new HashMap< String, Object >( );
			args.put( "extCustCode", remoteCustomsCode );
			args.put( "intCustCode", localCustomsCode );
			
			return args;
		}
	}
}
