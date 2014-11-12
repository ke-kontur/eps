package ru.acs.fts.eps2.model.services;

import ru.acs.fts.eps2.model.entities.Edecl_Wmqaddress;

public class WmqAddressService extends AbstractCachedService< Edecl_Wmqaddress >
{
	@Override
	public Class< Edecl_Wmqaddress > getEntityClass( )
	{
		return Edecl_Wmqaddress.class;
	}
}
