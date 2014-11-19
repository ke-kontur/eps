package ru.acs.fts.eps2.ws.utils.helpers;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

public class Base64Coder
{
	public static byte[ ] encode( String str, String encoding ) 
		throws UnsupportedEncodingException
	{
		return Base64.encodeBase64( str.getBytes( encoding ) );
	}
	
	public static String encodeAsString( String str, String encoding ) 
		throws UnsupportedEncodingException
	{
		return Base64.encodeBase64String( str.getBytes( encoding ) );
	}
	
	public static String encodeAsString( byte[ ] bytes, String encoding ) 
		throws UnsupportedEncodingException
	{
		return encodeAsString( new String( bytes, encoding ), encoding );
	}
	
	public static String decode( byte[ ] bytes, String encoding ) 
		throws UnsupportedEncodingException
	{
		return new String( Base64.decodeBase64( bytes ), encoding );
	}
	
	public static String decode( String bytes, String encoding ) 
		throws UnsupportedEncodingException
	{
		return new String( Base64.decodeBase64( bytes ), encoding );
	}
	
	public static byte[ ] decodeAsBytes( String bytes, String encoding ) 
		throws UnsupportedEncodingException
	{
		return decode( bytes, encoding ).getBytes( encoding );
	}
}
