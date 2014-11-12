package ru.acs.fts.aud.management.utils.exceptions;

public class ErrorHelper
{
	public static void throwException( Exception cause ) 
		throws GenericException
	{
		throw new GenericException( cause );
	}
	
	public static byte[ ] getExceptionData( Throwable exc )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( String.format( "toString: %s", exc.toString( ) ) );
		q.append( String.format( "\r\n" ) );
		q.append( String.format( "StackTrace:\r\n" ) );
		for ( StackTraceElement ste : exc.getStackTrace( ) )
		{
			q.append( String.format( "%s:%s at %s:%d", ste.getClassName( ), ste.getMethodName( ), ste.getFileName( ), ste.getLineNumber( ) ) );
		}
		
		try
		{
			return q.toString( ).getBytes( "UTF-8" );
		}
		catch ( Exception e2 )
		{
			return new byte[ ] { 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0E };
		}
	}
	
	public static String getExceptionDataString( Exception exc )
	{
		try
		{
			byte[ ] bytes = getExceptionData( exc );
			return new String( bytes, "UTF-8" );
		}
		catch ( Exception e )
		{
			return exc.getMessage( );
		}
	}
}
