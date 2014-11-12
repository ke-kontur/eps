package ru.acs.fts.eps2.model.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.model.entities.Edecl_Softversion;
import ru.acs.fts.eps2.model.services.conditions.AbstractSelectionCondition;
import ru.acs.fts.eps2.model.services.conditions.ISelectionCondition;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.CollectionHelper;

public class SoftVersionService extends AbstractCachedService< Edecl_Softversion >
{
	private String _currentSoftVersion;
	
	@Required
	public void setCurrentSoftVersion( String version ) { _currentSoftVersion = version; }
	public String getCurrentSoftVersion( ) { return _currentSoftVersion; }
	
	@Override
	public Class< Edecl_Softversion > getEntityClass( )
	{
		return Edecl_Softversion.class;
	}
	
	public Edecl_Softversion getSoftVersion( String softVersionId )
		throws DatabaseException
	{
		ISelectionCondition< Edecl_Softversion > condition = 
			new SoftVersionSelectionCondition( softVersionId );
		List< Edecl_Softversion > results = find( condition );
		
		return CollectionHelper.getFirst( results );
	}
	
	public Edecl_Softversion getCurrentSoftversion( )
		throws DatabaseException
	{
		return getSoftVersion( _currentSoftVersion );
	}
	
	private static class SoftVersionSelectionCondition 
		extends AbstractSelectionCondition< Edecl_Softversion >
	{
		private String _softVersion;
		
		public SoftVersionSelectionCondition( String softVersion )
		{
			_softVersion = softVersion;
		}

		@Override
		public boolean check( Edecl_Softversion object )
		{
			boolean result = false;
			if ( null != object )
				result = compare( object.getSoftVersionId( ), _softVersion );
			
			return result;
		}

		@Override
		public String getQueryString( )
		{
			StringBuilder query = new StringBuilder( "select sf from Edecl_Softversion sf" );
			query.append( " where sf.softVersionId = :softVersion" );
			
			return query.toString( );
		}

		@Override
		public Map< String, Object > getQueryArgs( )
		{
			Map< String, Object > args = new HashMap< String, Object >( );
			args.put( "softVersion", _softVersion );
			
			return args;
		}
	}
}
