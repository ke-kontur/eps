package ru.acs.fts.eps2.model.services;

import ru.acs.fts.eps2.model.entities.Edecl_Ips_Tech;

public class IpstechService extends AbstractCachedService< Edecl_Ips_Tech >
{
	@Override
	public Class< Edecl_Ips_Tech > getEntityClass( )
	{
		return Edecl_Ips_Tech.class;
	}
}
