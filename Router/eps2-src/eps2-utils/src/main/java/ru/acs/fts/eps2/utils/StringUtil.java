package ru.acs.fts.eps2.utils;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.util.UUID;

import ru.acs.fts.eps2.util.helpers.UUIDGen;

public class StringUtil 
{
    public static boolean isNullOrEmpty( String s )
    {
        return ( s == null || s.isEmpty( ) );
    }
    
    public static boolean areEqual( String s1, String s2 )
    {
    	if ( null == s1 || null == s2)
    	{
    		return s1 == s2;
    	}
    	
    	return s1.trim( ).equalsIgnoreCase( s2.trim( ) );
    }
    
    public static String generateUuid( )
	{
    	return UUIDGen.getUUID( ).toString( );
	}
    
    public static byte[ ] toBytes( String string )
    {
    	byte[ ] bytes = null;
    	if ( null != string )
    	{
    		try
			{
				bytes = string.getBytes( "UTF-8" );
			}
			catch ( UnsupportedEncodingException e )
			{
				// EMPTY
			}
    	}
    	
    	return bytes;
    }
    
    public static byte[ ] convertObjectValueToDataValue( String objectValue )
	{
		if ( null == objectValue )
			return null;
		
		UUID uuid = UUID.fromString( objectValue );

		byte[ ] byteArray = new byte[ ( Long.SIZE / Byte.SIZE ) * 2 ];
		ByteBuffer buffer = ByteBuffer.wrap( byteArray );
		LongBuffer longBuffer = buffer.asLongBuffer( );
		longBuffer.put( new long[ ] { uuid.getMostSignificantBits( ), uuid.getLeastSignificantBits( ) } );
		
		return byteArray;
	}
	
	public static String convertDataValueToObjectValue( byte[ ] dataValue )
	{
		if ( null == dataValue )
			return null;
		
		ByteBuffer buffer = ByteBuffer.wrap( dataValue );
		LongBuffer longBuffer = buffer.asLongBuffer( );
		return ( new UUID( longBuffer.get( 0 ), longBuffer.get( 1 ) ) ).toString( );
	}
	
	public static String exceptionToString( Throwable exc )
	{
		OutputStream outputStream = new ByteArrayOutputStream( );
		PrintWriter stream = new PrintWriter( outputStream );
		exc.printStackTrace( stream );
		stream.flush( );
		
		return outputStream.toString( );
	}
}
