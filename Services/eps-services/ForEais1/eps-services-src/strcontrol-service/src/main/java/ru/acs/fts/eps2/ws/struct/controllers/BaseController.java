package ru.acs.fts.eps2.ws.struct.controllers;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

public class BaseController
{
	private static final Logger log = LoggerFactory.getLogger( BaseController.class );
	
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
		
		log.info( String.format(
			"Трагедия. REST Web-сервис структурного контроля умер :(. Умер потому что: %s, искл. ситуация: %s",
			ex.getMessage( ), ex.getClass( ).getName( )
		) );
		log.error( "", ex  );
		
		return new ModelAndView( jsonView, res );
	}

}
