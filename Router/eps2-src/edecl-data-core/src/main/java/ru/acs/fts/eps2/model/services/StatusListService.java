package ru.acs.fts.eps2.model.services;

import java.util.List;

import ru.acs.fts.eps2.model.entities.Edecl_Statuslist;
import ru.acs.fts.eps2.model.services.conditions.ISelectionCondition;
import ru.acs.fts.eps2.model.services.conditions.StatusListCondition;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class StatusListService extends AbstractCachedService< Edecl_Statuslist >
{
	@Override
	public Class< Edecl_Statuslist > getEntityClass( )
	{
		return Edecl_Statuslist.class;
	}
	
	public Edecl_Statuslist getStatusList( String code )
		throws DatabaseException
	{
		ISelectionCondition< Edecl_Statuslist > condition = new StatusListCondition( code );
		List< Edecl_Statuslist > results = find( condition );
		Edecl_Statuslist result = null;
		if ( null != results && ! results.isEmpty( ) )
			result = results.get( 0 );
		
		return result;
	}
}
