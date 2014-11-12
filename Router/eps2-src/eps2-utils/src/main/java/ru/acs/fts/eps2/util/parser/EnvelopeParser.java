package ru.acs.fts.eps2.util.parser;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.util.exceptions.XmlParserException;

public class EnvelopeParser implements IHandler
{
	private static final Logger log = LoggerFactory.getLogger( EnvelopeParser.class );
	
	private Map< String, String > _fetched = new HashMap< String, String >( );
	private Stack< String > _tags = new Stack< String >( );
	
	public EnvelopeParser( Set< String > toFetch ) // NO_UCD (use private)
	{
		_fetched.clear( );
		for ( String key : toFetch )
		{
			_fetched.put( key, "" );
		}
	}
		
	public static Map< String, String > parseErrorMessage( String data, Set< String > toFetch )
		throws XmlParserException
	{
		try
		{
			EnvelopeParser parser = new EnvelopeParser( toFetch );
			MalformedXmlParser worker = new MalformedXmlParser( );
			worker.parse( data, parser );
			
			return parser._fetched;
		}
		catch ( Exception exc )
		{
			String errorMsg = String.format(
				"Не удалось распарсить сообщение, ошибка: %s",
				exc.getMessage( )
			);
			
			log.error( errorMsg, exc );
			throw new XmlParserException( errorMsg, exc );
		}
	}
		
	// IHandler

	public void startTag( String namespace, String name )
	{
		/*
		log.info( String.format(
			"start tag: %s:%s\n", 
			( null != namespace ) ? namespace : "(null)",
			( null != name ) ? name : "(null)"
		) );
		*/
		_tags.push( name );
		
	}

	public void endTag( String namespace, String name )
	{
		/*
		log.info( String.format(
			"end tag: %s:%s\n",
			( null != namespace ) ? namespace : "(null)",
			( null != name ) ? name : "(null)"
		) );
		*/
		while ( _tags.size( ) > 0 && ( ! _tags.peek( ).equalsIgnoreCase( name ) ) )
			_tags.pop( );
		
		if ( _tags.size( ) > 0 )
			_tags.pop( );
	}

	public void characters( String chars )
	{
		/*
		log.info( String.format(
			"characters: %s",
			chars
		) );
		*/
		if ( _tags.size( ) > 0 && _fetched.containsKey( _tags.peek( ) ) )
		{
			if ( _fetched.get( _tags.peek( ) ).equalsIgnoreCase( "" ) )
				_fetched.put( _tags.peek( ), chars );
		}

		if ( _tags.size( ) > 1 )
		{	
			String top = _tags.pop( );
			String key = String.format( "%s.%s", _tags.peek( ), top );
			_tags.push( top );
			
			if ( _fetched.containsKey( key ) && _fetched.get( key ).equalsIgnoreCase( "" ) )
			{
				_fetched.put( key, chars );
			}
		}
	}
}
