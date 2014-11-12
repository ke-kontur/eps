package ru.acs.fts.eps2.model.services;

import java.util.List;

import ru.acs.fts.eps2.model.entities.Edecl_Customs;
import ru.acs.fts.eps2.model.services.conditions.CustomsSelectionConditionHolder;
import ru.acs.fts.eps2.model.services.conditions.ISelectionCondition;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.CollectionHelper;

public class CustomsService extends AbstractCachedService< Edecl_Customs >
{
	public Edecl_Customs getCustoms( String customCode, String exchType )
		throws DatabaseException
	{
		ISelectionCondition< Edecl_Customs > condition = 
			CustomsSelectionConditionHolder.getExchTypeSelectorCodeSelectorCondition( 
				customCode, exchType 
			);
		
		List< Edecl_Customs > customs = find( condition );
		
		return CollectionHelper.getFirst( customs );
	}
	
	public boolean isCustomsExist( String customCode, String exchType )
		throws DatabaseException
	{
		return null != getCustoms( customCode, exchType );
	}
	
	@Override
	public Class< Edecl_Customs > getEntityClass( )
	{
		return Edecl_Customs.class;
	}
}
