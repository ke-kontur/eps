package ru.acs.fts.eps2.model.services;

import java.util.List;

import ru.acs.fts.eps2.model.entities.Edecl_Udcustlist;
import ru.acs.fts.eps2.model.services.conditions.ISelectionCondition;
import ru.acs.fts.eps2.model.services.conditions.UdCustListSelectionConditionHolder;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.CollectionHelper;

public class UdCustListService extends AbstractCachedService< Edecl_Udcustlist > 
{
	@Override
	public Class< Edecl_Udcustlist > getEntityClass( )
	{
		return Edecl_Udcustlist.class;
	}
	
	public List< Edecl_Udcustlist > getUdCustLists( String intCustCode, String extCustCode )
		throws DatabaseException
	{
		ISelectionCondition< Edecl_Udcustlist > condition = UdCustListSelectionConditionHolder
			.getUdCustListSelectorCondition( intCustCode, extCustCode );
		
		return find( condition );
	}
	
	public boolean isUdCustListExist( String localCustomsCode, String remoteCustomsCode )
		throws DatabaseException
	{
		return CollectionHelper
			.isNullOrEmpty( getUdCustLists( localCustomsCode, remoteCustomsCode ) );
	}
}
