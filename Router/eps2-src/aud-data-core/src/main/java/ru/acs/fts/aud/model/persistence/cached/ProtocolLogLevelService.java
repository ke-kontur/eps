package ru.acs.fts.aud.model.persistence.cached;

import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.aud.model.entities.ProtocolLogLevel;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.eps2.utils.CollectionHelper;

public class ProtocolLogLevelService extends AbstractCachedService< ProtocolLogLevel >
{
	public ProtocolLogLevel getByShortDescription( String shortDescription ) 
		throws PersistenceException
	{
		ISelectorCondition< ProtocolLogLevel > condition = new ShortCondition( shortDescription );
		
		return CollectionHelper.getFirst( find( condition ) );
	}
	
	@Override
	public Class< ProtocolLogLevel > getEntityClass( )
	{
		return ProtocolLogLevel.class;
	}
	
	/*
	 * Selector Conditions
	 */
	public static class ShortCondition extends AbstractSelectorCondition< ProtocolLogLevel > // NO_UCD (use private)
	{
		private String _short;
		
		public ShortCondition( String shortDesc ) { _short = shortDesc; } // NO_UCD (use private)
		
		@Override
		public boolean check( ProtocolLogLevel object )
		{
			boolean result = false;
			if ( null != object )
				result = compare( _short, object.getShortDescription( ) );
			
			return result;
		}

		@Override
		public String getQueryString( )
		{
			StringBuilder query = new StringBuilder( "select pll from ProtocolLogLevel pll" );
			query.append( " where pll.shortDescription = :shortDesc" );
			
			return query.toString( );
		}

		@Override
		public Map< String, Object > getQueryArgs( )
		{
			Map< String, Object > args = new HashMap< String, Object >( );
			args.put( "shortDesc", _short );
			
			return args;
		}
	}
}
