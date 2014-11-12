package ru.acs.fts.aud.router.utils;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.eps2.util.helpers.UUIDGen;

public class StringUtil
{
	public static final int DEFAULT_CHUNK_SIZE = ( 1 << 19 ); // NO_UCD (use private)
	
	// @formatter:off
	public StringUtil( ) { }
	// @formatter:on
	
	public static String generateUuid( )
	{
		return UUIDGen.getUUID( ).toString( );
	}
	
	public static boolean isNullOrEmpty( String string )
	{
		return ( null == string || string.isEmpty( ) );
	}
	
	public static List< String > splitStringToChunks( String string, int chunkSize ) // NO_UCD (use private)
	{
		if ( null == string )
			string = "";
		List< String > chunks = new ArrayList< String >( );
		
		while ( string.length( ) > chunkSize )
		{
			chunks.add( string.substring( 0, chunkSize ) );
			string = string.substring( chunkSize );
		}
		if ( ! string.isEmpty( ) )
			chunks.add( string );
		
		return chunks;
	}
	
	public static List< String > splitStringToChunks( String string )
	{
		return splitStringToChunks( string, DEFAULT_CHUNK_SIZE );
	}	
	
	public static String convertToString( byte[ ] data )
	{
		String string = null;
		if ( null != data )
		{
			try
			{
				string = new String( data, "UTF-8" );
			}
			catch ( UnsupportedEncodingException e )
			{
				// Empty
			}
		}
		
		return string;
	}
}
