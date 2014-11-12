package ru.acs.fts.aud.management.utils.httpclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;

public class HttpRequester
{
	private static PoolingClientConnectionManager _manager;
	private static HttpClient _client;
	private static Map< Object, HttpContext > _contexts;
	
	static
	{
		_contexts = new ConcurrentHashMap< Object, HttpContext >( );

		SchemeRegistry schemeRegistry = new SchemeRegistry( );
		schemeRegistry.register( new Scheme( "http", 80, PlainSocketFactory.getSocketFactory( ) ) );
		
		_manager = new PoolingClientConnectionManager( schemeRegistry );
		_manager.setMaxTotal( 100 );
		
		final HttpParams httpClientParams = new BasicHttpParams( );
		httpClientParams.setParameter( "http.protocol.version", HttpVersion.HTTP_1_1 );
		HttpConnectionParams.setConnectionTimeout( httpClientParams, 150000 );
		HttpConnectionParams.setSoTimeout( httpClientParams, 150000 );
		
		_client = new DefaultHttpClient( _manager, httpClientParams );
		
		( ( DefaultHttpClient )_client ).setKeepAliveStrategy( new ConnectionKeepAliveStrategy( )
		{
			@Override
			public long getKeepAliveDuration( HttpResponse response, HttpContext context )
			{
				// Honor keep-alive header
				HeaderElementIterator it = new BasicHeaderElementIterator( response.headerIterator( HTTP.CONN_KEEP_ALIVE ) );
				while ( it.hasNext( ) )
				{
					HeaderElement he = it.nextElement( );
					String param = he.getName( );
					String value = he.getValue( );
					if ( null != value && param.equalsIgnoreCase( "timeout" ) )
					{
						try
						{
							return Long.parseLong( value ) * 1000;
						}
						catch ( NumberFormatException exc ) { }
					}
				}
				
				// let it be 30 seconds
				return 30 * 1000;
			}
		} );
	}
	
	private static HttpClient getClient( )
	{
		return _client;
	}
	
	private static HttpContext getContext( )
	{
		HttpContext ctx = _contexts.get( Thread.currentThread( ) );
		if ( null == ctx )
		{
			ctx = new BasicHttpContext( );
			_contexts.put( Thread.currentThread( ), ctx );
		}
		
		return ctx;
	}
	
	public static String GET( String url, Map< String, String > headers ) 
		throws Exception
	{
		HttpGet get = null;
		try
		{
			// HttpClient client = new DefaultHttpClient( );
			get = new HttpGet( url );
			
			if ( null != headers )
			{
				for ( String key : headers.keySet( ) )
				{
					get.addHeader( key, headers.get( key ) );
				}
			}
			
			return readResponse( getClient( ).execute( get, getContext( ) ) );
		}
		catch ( Exception exc )
		{
			throw exc;
		}
		finally
		{
			if ( null != get )
				get.releaseConnection( );
		}
	}
	
	public static String POST( String url, String data, Map< String, String > headers ) 
		throws Exception
	{
		HttpPost post = null;
		
		try
		{
			// HttpClient client = new DefaultHttpClient( );
			post = new HttpPost( url );
			
			if ( null != headers )
			{
				for ( String key : headers.keySet( ) )
				{
					post.addHeader( key, headers.get( key ) );
				}
			}
			
			StringEntity se = new StringEntity( data, "UTF-8" );
			post.setEntity( se );
			
			return readResponse( getClient( ).execute( post, getContext( ) ) );
		}
		catch ( Exception exc )
		{
			throw exc;
		}
		finally
		{
			if ( null != post )
				post.releaseConnection( );
		}
	}
	
	public static String PUT( String url, String data, Map< String, String > headers ) 
		throws Exception
	{
		HttpPut put = null;
		
		try
		{
			// HttpClient client = new DefaultHttpClient( );
			put = new HttpPut( url );
			
			if ( null != headers )
			{
				for ( String key : headers.keySet( ) )
				{
					put.addHeader( key, headers.get( key ) );
				}
			}
			
			StringEntity se = new StringEntity( data, "UTF-8" );
			put.setEntity( se );
			
			return readResponse( getClient( ).execute( put, getContext( ) ) );		
		}
		catch ( Exception exc )
		{
			throw exc;
		}
		finally
		{
			if ( null != put )
				put.releaseConnection( );
		}
	}
	
	public static String DELETE( String url, Map< String, String > headers ) 
		throws Exception
	{
		HttpDelete delete = null;
		
		try
		{
			// HttpClient client = new DefaultHttpClient( );
			delete = new HttpDelete( url );
			
			if ( null != headers )
			{
				for ( String key : headers.keySet( ) )
				{
					delete.addHeader( key, headers.get( key ) );
				}
			}
					
			return readResponse( getClient( ).execute( delete, getContext( ) ) );
		}
		catch ( Exception exc )
		{
			throw exc;
		}
		finally
		{
			if ( null != delete )
				delete.releaseConnection( );
		}
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
