package ru.acs.fts.aud.model.persistence.cached;

import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.aud.model.entities.ProtocolSource;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.eps2.utils.CollectionHelper;

public class ProtocolSourceService extends AbstractCachedService< ProtocolSource >
{
	public ProtocolSource getByShortDescription( String shortDescription ) 
		throws PersistenceException
	{
		ISelectorCondition< ProtocolSource > condition = 
			new ShortDescriptionCondition( shortDescription );
		
		return CollectionHelper.getFirst( find( condition ) ); 
	}
	
	@Override
	public Class< ProtocolSource > getEntityClass( )
	{
		return ProtocolSource.class;
	}
	
	/*
	 * Selector Conditions
	 */
	public static class ShortDescriptionCondition extends AbstractSelectorCondition< ProtocolSource > // NO_UCD (use private)
	{
		private String _shortDescription;
		public ShortDescriptionCondition( String shortDescription ) // NO_UCD (use private)
		{
			_shortDescription = shortDescription;
		}
		
		@Override public boolean check( ProtocolSource object )
		{
			boolean result = false;
			if ( null != object )
				result = compare( _shortDescription, object.getShortDescription( ) );
				
			return result;
		}
		@Override public String getQueryString( )
		{
			StringBuilder query = new StringBuilder( "select ps from ProtocolSource ps" );
			query.append( " where ps.shortDescription = :shortDesc" );
			
			return query.toString( );
		}

		@Override public Map< String, Object > getQueryArgs( )
		{
			Map< String, Object > args = new HashMap< String, Object >( );
			args.put( "shortDesc", _shortDescription );
			
			return args;
		}
	}
}
