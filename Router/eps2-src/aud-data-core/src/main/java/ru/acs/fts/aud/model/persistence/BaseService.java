package ru.acs.fts.aud.model.persistence;

import java.util.List;
import java.util.Map;

import ru.acs.fts.aud.model.filtering.SimpleCondition;
import ru.acs.fts.eps2.utils.CollectionHelper;

public class BaseService // NO_UCD (use default)
{
	protected String createWhereClause( List< SimpleCondition > conditions,
			Map< String, Object > args )
	{
		StringBuilder query = new StringBuilder( );
		
		if ( ! CollectionHelper.isNullOrEmpty( conditions ) )
			for ( int i = 0; i < conditions.size( ); i++ )
			{
				SimpleCondition condition = conditions.get( i );
				String s = i > 0 ? " and " : "where ";
				query.append( s ).append( condition.getCondition( ) );
				args.put( condition.getParamName( ), condition.getParamValue( ) );
			}
		
		return query.toString( );
	}
}
