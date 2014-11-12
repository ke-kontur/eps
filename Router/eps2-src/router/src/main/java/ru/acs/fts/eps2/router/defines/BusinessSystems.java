package ru.acs.fts.eps2.router.defines;

import ru.acs.fts.eps2.utils.StringUtil;

public class BusinessSystems
{
	public static final String DECLARANT = "DECLARANT";
	
	public static final String CUSTOMS = "CUSTOMS";
	
	public static final String EPS = "EPS";
	
	public static final String ADMIN = "ADMIN";
	
	public static final String ASKTT2 = "ASKTT2";
	
	public static final String MALAKHIT = "MALAKHIT";
	
	public static final String RZD = "RZD";
	
	public static final String BALANCER = "BALANCER";
	
	
	public static final String UNKNOWN = "UNKNOWN";
	
	public static boolean isSuchSystem( String object, String testSystem )
	{
		if ( StringUtil.isNullOrEmpty( object ) || StringUtil.isNullOrEmpty( testSystem ) )
			return false;
		
		return object.equalsIgnoreCase( testSystem );
	}
}
