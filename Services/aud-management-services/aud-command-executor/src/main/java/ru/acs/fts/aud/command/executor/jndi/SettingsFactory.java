package ru.acs.fts.aud.command.executor.jndi;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.RefAddr;
import javax.naming.Reference;
import javax.naming.spi.ObjectFactory;

import ru.acs.fts.aud.management.utils.shared.GenericUtils;

public class SettingsFactory implements ObjectFactory
{

	@Override
	public Object getObjectInstance( Object obj, Name name, Context nameCtx, Hashtable< ?, ? > environment ) 
		throws Exception
	{
		if ( obj instanceof Reference )
		{
			Reference ref = ( Reference )obj;
			
			if ( ref.getClassName( ).equals( Settings.class.getName( ) ) )
			{
				RefAddr addrWmqRouterUrl = ref.get( Settings.REF_ADDR_WMQ_ROUTER_URL );
				
				boolean areNotNull = GenericUtils.areNotNull( addrWmqRouterUrl );
				
				if ( areNotNull )
				{
					Settings settings = new Settings( );
					
					settings.setWmqRouterUrl( addrWmqRouterUrl.getContent( ).toString( ) );
					
					return settings;
				}
			}
		}
		
		return null;
	}

}
