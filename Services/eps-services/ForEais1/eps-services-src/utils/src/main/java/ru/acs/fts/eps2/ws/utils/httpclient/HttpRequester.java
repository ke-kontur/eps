package ru.acs.fts.eps2.ws.utils.httpclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpRequester
{
	public static String GET( String url, Map< String, String > headers ) 
		throws ClientProtocolException, IOException
	{
		HttpClient client = new DefaultHttpClient( );
		HttpGet get = new HttpGet( url );
		
		if ( null != headers )
		{
			for ( String key : headers.keySet( ) )
			{
				get.addHeader( key, headers.get( key ) );
			}
		}
		
		return readResponse( client.execute( get ) );
	}
	
	public static String POST( String url, String data, Map< String, String > headers ) 
		throws IllegalStateException, ClientProtocolException, IOException
	{
		HttpClient client = new DefaultHttpClient( );
		HttpPost post = new HttpPost( url );
		
		if ( null != headers )
		{
			for ( String key : headers.keySet( ) )
			{
				post.addHeader( key, headers.get( key ) );
			}
		}
		
		StringEntity se = new StringEntity( data, "UTF-8" );
		post.setEntity( se );
		
		return readResponse( client.execute( post ) );
	}
	
	public static String PUT( String url, String data, Map< String, String > headers ) 
		throws IllegalStateException, ClientProtocolException, IOException
	{
		HttpClient client = new DefaultHttpClient( );
		HttpPut put = new HttpPut( url );
		
		if ( null != headers )
		{
			for ( String key : headers.keySet( ) )
			{
				put.addHeader( key, headers.get( key ) );
			}
		}
		
		StringEntity se = new StringEntity( data, "UTF-8" );
		put.setEntity( se );
		
		return readResponse( client.execute( put ) );		
	}
	
	public static String DELETE( String url, Map< String, String > headers ) 
		throws ClientProtocolException, IOException
	{
		HttpClient client = new DefaultHttpClient( );
		HttpDelete delete = new HttpDelete( url );
		
		if ( null != headers )
		{
			for ( String key : headers.keySet( ) )
			{
				delete.addHeader( key, headers.get( key ) );
			}
		}
				
		return readResponse( client.execute( delete ) );
	}	
	
	private static String readResponse( HttpResponse response ) 
		throws IllegalStateException, IOException
	{
		BufferedReader rd = new BufferedReader( new InputStreamReader( response.getEntity( ).getContent( ), "UTF-8" ) );
		
		StringBuffer result = new StringBuffer( );
		String line = "";
		while ( ( line = rd.readLine( ) ) != null )
		{
			result.append( line );
		}
		
		return result.toString( );		
	}
}
