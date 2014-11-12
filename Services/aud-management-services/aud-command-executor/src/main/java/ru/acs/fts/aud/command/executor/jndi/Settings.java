package ru.acs.fts.aud.command.executor.jndi;

import javax.naming.NamingException;
import javax.naming.RefAddr;
import javax.naming.Reference;
import javax.naming.Referenceable;
import javax.naming.StringRefAddr;

import ru.acs.fts.aud.management.utils.shared.GenericUtils;

public class Settings implements Referenceable
{
	public static final String REF_ADDR_WMQ_ROUTER_URL = "wmqRouterUrl";
	
	private String _wmqRouterUrl;
	
	// @formatter:off
	public void setWmqRouterUrl( String wmqRouterUrl ) { _wmqRouterUrl = wmqRouterUrl; }
	public String getWmqRouterUrl( ) { return _wmqRouterUrl; }
	// @formatter:on

	@Override
	public Reference getReference( ) 
		throws NamingException
	{
		Reference ref = new Reference(
			Settings.class.getName( ),
			new StringRefAddr( REF_ADDR_WMQ_ROUTER_URL, _wmqRouterUrl ),
			SettingsFactory.class.getName( ),
			null
		);
		
		// ref.add( new StringRefAddr( REF_ADDR_RECEIVER_INFORMATION, _receiverInformation ) );
		
		return ref;
	}
	
	public static Settings fromReference( Reference ref )
	{
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

		return null;
	}
	
	public static Settings fromReference( Settings settings )
	{
		return settings;
	}

}
