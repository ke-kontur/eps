/**
 * 
 */
package ru.acs.fts.eps2.engine.configuration;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * 
 * @author mns
 */
public class ProcessNotFullContainerListHolder // NO_UCD (use default)
{

	private static final Logger _logger = LoggerFactory
			.getLogger( RtuCodePatternsHolder.class );

	private List< String > messages;

	public ProcessNotFullContainerListHolder( String codeString ) // NO_UCD (used by spring IoC context)
	{
		messages = Arrays.asList( codeString.split( "," ) );

		for ( String str : messages )
			_logger.info( "messages = {};", str );
	}

	public List< String > getMessages( )
	{
		return messages;
	}

	public void setMessages( List< String > _messages )
	{
		messages = _messages;
	}

	public boolean match( String string )
	{
		if ( null != string )
		{
			for ( String message : messages )
			{

				if ( message.equalsIgnoreCase( string ) )
					return true;
			}
		}

		return false;
	}

}
