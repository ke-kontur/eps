package ru.acs.fts.aud.router.processing.definitions;

import ru.acs.fts.eps2.utils.StringUtil;

public class BusinessSystems
{
	public static final String WMQ_ROUTER = "WMQ_ROUTER";
	
	public static final String SERVER = "SERVER";
	
	public static final String CLIENT = "CLIENT"; // NO_UCD (unused code)
	
	
	public static final String UNKNOWN = "UNKNOWN"; // NO_UCD (unused code)
	
	public static boolean isSuchSystem( String object, String testSystem ) // NO_UCD (unused code)
	{
		if ( StringUtil.isNullOrEmpty( object ) || StringUtil.isNullOrEmpty( testSystem ) )
			return false;
		
		return object.equalsIgnoreCase( testSystem );
	}
}
