package ru.acs.fts.eps2.model.services;

import java.util.List;

import ru.acs.fts.eps2.model.entities.Edecl_G44_Docmodid;
import ru.acs.fts.eps2.model.services.conditions.G44Condition;
import ru.acs.fts.eps2.model.services.conditions.ISelectionCondition;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class G44Service extends AbstractCachedService< Edecl_G44_Docmodid >
{
	@Override
	public Class< Edecl_G44_Docmodid > getEntityClass( )
	{
		return Edecl_G44_Docmodid.class;
	}
	
	public Edecl_G44_Docmodid getG44Relation( String docCode, String documentModeId )
		throws DatabaseException
	{
		ISelectionCondition< Edecl_G44_Docmodid > condition = new G44Condition( docCode, documentModeId );
		Edecl_G44_Docmodid res = null;
		List< Edecl_G44_Docmodid > results = super.find( condition );
		if ( null != results && ! results.isEmpty( ) )
			res = results.get( 0 );
		
		return res;		
	}

}
