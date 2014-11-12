package ru.acs.fts.eps2.engine.configuration;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RtuCodePatternsHolder 
{
	private static final Logger _logger = LoggerFactory
			.getLogger( RtuCodePatternsHolder.class );
	
	private List< String > _patterns;
	
	public RtuCodePatternsHolder( String codeString ) // NO_UCD (use by spring IoC context)
	{
		_patterns = Arrays.asList( 
				codeString.replace( "?", "\\d" )
				.replace( "*", "\\d*" )
				.split( "," ) );

		_logger.info( "Patterns :" );
		for ( String str : _patterns )
			_logger.info( "Pattern = {};", str );
	}
	
	public List< String > getPatterns( )
	{
		return _patterns;
	}
	
	public void setPatterns( List< String > patterns )
	{
		_patterns = patterns;
	}
	
	public boolean match( String string )
	{
		if ( null != string )
		{
			Pattern pattern;
			for ( String ptrn : _patterns )
			{
				pattern = Pattern.compile( ptrn );
				if ( pattern.matcher( string ).matches( ) )
					return true;
			}
		}
		
		return false;
	}
}
