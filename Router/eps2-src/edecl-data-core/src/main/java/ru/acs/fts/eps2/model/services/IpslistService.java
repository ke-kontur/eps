package ru.acs.fts.eps2.model.services;

import ru.acs.fts.eps2.model.entities.Edecl_Ipslist;

public class IpslistService extends AbstractCachedService< Edecl_Ipslist >
{
	@Override
	public Class< Edecl_Ipslist > getEntityClass( )
	{
		return Edecl_Ipslist.class;
	}
}
