package ru.acs.fts.aud.router.utils;

public class XShort
{
	public static final short FALSE = 0;
	public static final short TRUE = 1;
	
	public static short parse( Boolean val ) // NO_UCD (unused code)
	{
		return ( ( null != val && val ) ? TRUE : FALSE ); 
	}
	
	public static boolean boolValue( Short val ) // NO_UCD (unused code)
	{
		return ( ( null != val && TRUE == val ) ? true : false ); 
	}
	
	public static boolean isTrue( Short val ) // NO_UCD (unused code)
	{
		return ( null != val && TRUE == val );
	}
	
	public static boolean isFalse( Short val )
	{
		return ( null == val || FALSE == val );
	}
}
