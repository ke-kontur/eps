package ru.acs.fts.eps2.ws.crypto.controllers;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

public class BaseController
{
	private MappingJacksonJsonView jsonView = new MappingJacksonJsonView( );
	
	@ExceptionHandler( value = { Exception.class, RuntimeException.class } )
	public ModelAndView handleException( Throwable ex, HttpServletRequest req )
	{
		Hashtable< String, Object > res = new Hashtable< String, Object >( );
		res.put( "status", "fail" );
		res.put( "message", ex.getMessage( ) );
		res.put( "exception", ex.getClass( ).getName( ) );
		
		List< String > stackTrace = new ArrayList< String >( );
		
		for ( StackTraceElement el : ex.getStackTrace( ) )
		{
			String line = String.format( 
				"%s:%d class=%s method=%s", 
				el.getFileName( ), el.getLineNumber( ), 
				el.getClassName( ), el.getMethodName( ) 
			);
			
			stackTrace.add( line );
		}
		
		res.put( "stack", stackTrace );
		
		return new ModelAndView( jsonView, res );
	}

}
