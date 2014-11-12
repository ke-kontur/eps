package ru.acs.fts.eps2.core.processing;

public class WarningLevels
{
	public static final int INFO = 4;
	
	public static final int WARNING = 3;
	
	public static final int ERROR = 2;
	
	public static final int FATALERROR = 1; // NO_UCD (use private)

	public static boolean isSameLevel( int level1, int level2 ) // NO_UCD (unused code)
	{
		return ( level1 == level2 );
	}
	
	public static boolean isSameLevel( Integer level1, Integer level2 ) // NO_UCD (unused code)
	{
		if ( null == level1 || null == level2 )
			return false;
		
		return ( level1.intValue( ) == level2.intValue( ) );
	}
	
	public static String getString( int level ) // NO_UCD (unused code)
	{
		switch ( level )
		{
			case FATALERROR: return "fatal error";
			case ERROR: return "error";
			case WARNING: return "warning";
			case INFO: return "info";
		}
		
		return "unknown";
	}
}
