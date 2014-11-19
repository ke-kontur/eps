package ru.acs.fts.eps2.ws.utils.helpers;

public class StringUtils
{
	public static boolean isNullOrEmpty( String v )
	{
		return ( null == v || v.equalsIgnoreCase( "" ) );
	}
	
	public static boolean isNotNullAndEmpty( String v )
	{
		return ( null != v && ! v.equalsIgnoreCase( "" ) );
	}
}
