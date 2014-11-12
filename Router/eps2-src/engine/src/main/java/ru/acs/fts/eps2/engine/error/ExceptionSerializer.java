package ru.acs.fts.eps2.engine.error;

public class ExceptionSerializer
{
	public static String serialize( Exception exc )
	{
		StringBuilder bld = new StringBuilder( );
		
		serialize( bld, exc );
		
		return bld.toString( );
	}
	
	private static void serialize( StringBuilder bld, Throwable exc )
	{
		bld.append( String.format( "Type: %s\n", exc.getClass( ).getName( ) ) );
		bld.append( String.format( "Message: %s\n", exc.getMessage( ) ) );		
		bld.append( String.format( "Stack Trace:\n" ) );
		
		for ( StackTraceElement sti : exc.getStackTrace( ) )
		{
			bld.append( String.format( 
				"\t%s.%s (%s:%d)\n", 
				sti.getClassName( ), sti.getMethodName( ), 
				sti.getFileName( ), sti.getLineNumber( ) 
			) );
		}
		
		bld.append( "\n" );
		
		if ( exc.getCause( ) != null && exc.getCause( ) != exc )
			serialize( bld, exc.getCause( ) );
	}
}
