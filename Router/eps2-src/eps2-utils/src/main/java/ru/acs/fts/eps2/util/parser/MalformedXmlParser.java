package ru.acs.fts.eps2.util.parser;

import java.util.Stack;

public class MalformedXmlParser // NO_UCD (use default)
{
	public static final int MODE_UNKNOWN = 0; // NO_UCD (use private)
	public static final int MODE_PN_START = 1; // NO_UCD (use private)
	public static final int MODE_PN_NS_START = 2; // NO_UCD (use private)
	public static final int MODE_PN_NS_FINISH = 3; // NO_UCD (use private)
	public static final int MODE_PN_TAG_START = 4; // NO_UCD (use private)
	public static final int MODE_PN_TAG_CONTENT = 5; // NO_UCD (use private)
	
	private static class TagData
	{
		public String xmlns;
		public String name;
	}
	
	public void parse( String data, IHandler handler ) // NO_UCD (use default)
	{
		int mode = MODE_UNKNOWN;
		Stack< TagData > tags = new Stack< TagData >( );
		int charsS = 0, charsE = 0;
		boolean isClosedTag = false;
		TagData currentTagData = null;
		
		for ( int i = 0; i < data.length( ); ++i )
		{
			char ch = data.charAt( i );
			switch ( mode )
			{
				case MODE_UNKNOWN:
					if ( ch == '<' )
					{
						String chars = data.substring( charsS, charsE + 1 );
						handler.characters( chars );
						
						isClosedTag = ( i + 1 < data.length( ) && data.charAt( i + 1 ) == '/' );
						mode = MODE_PN_START;
					}
					else
						charsE = i;
					break;
					
				case MODE_PN_START:
					if ( Character.isLetterOrDigit( ch ) )
					{
						mode = MODE_PN_NS_START;
						charsS = charsE = i;
						currentTagData = new TagData( );
					}						
					break;
					
				case MODE_PN_NS_START:
					if ( Character.isLetterOrDigit( ch ) )
					{
						if ( currentTagData.xmlns == null )
							charsE = i;
					}
					else if ( ch == ':' )
					{
						if ( currentTagData.xmlns == null )
							currentTagData.xmlns = data.substring( charsS, charsE + 1 );
						
						mode = MODE_PN_NS_FINISH;
					}
					else if ( ch == ' ' )
					{
						currentTagData.xmlns = null;
						if ( currentTagData.name == null )
							currentTagData.name = data.substring( charsS, charsE + 1 );
						
						mode = MODE_PN_TAG_CONTENT;
					}
					else if ( ch == '/' || ch == '>' )
					{
						currentTagData.xmlns = null;
						if ( currentTagData.name == null )
							currentTagData.name = data.substring( charsS, charsE + 1 );
						
						if ( ch == '/' && ( i + 1 < data.length( ) ) && data.charAt( i + 1 ) == '>' && ! isClosedTag )
						{
							handler.startTag( currentTagData.xmlns, currentTagData.name );
							handler.endTag( currentTagData.xmlns, currentTagData.name );

							i++;
						}
						else if ( ch == '>' )
						{
							if ( isClosedTag )
							{
								handler.endTag( currentTagData.xmlns, currentTagData.name );
								if ( tags.size( ) > 0 )
									tags.pop( );
							}
							else
							{
								handler.startTag( currentTagData.xmlns, currentTagData.name );
								tags.push( currentTagData );
							}
						}
						
						mode = MODE_UNKNOWN;
						charsS = charsE = i + 1;						
					}
					
					break;					
					
				case MODE_PN_NS_FINISH:
					if ( Character.isLetterOrDigit( ch ) )
					{
						charsS = charsE = i;
						mode = MODE_PN_TAG_START;
					}
					break;
					
				case MODE_PN_TAG_START:
					if ( ch == ' ' || ch == '/' || ch == '>' )
					{
						if ( currentTagData.name == null )
							currentTagData.name = data.substring( charsS, charsE + 1 );
						
						if ( ch == '/' && ( i + 1 < data.length( ) ) && data.charAt( i + 1 ) == '>' && ! isClosedTag )
						{
							handler.startTag( currentTagData.xmlns, currentTagData.name );
							handler.endTag( currentTagData.xmlns, currentTagData.name );

							i++;
						}
						else if ( ch == '>' )
						{
							if ( isClosedTag )
							{
								handler.endTag( currentTagData.xmlns, currentTagData.name );
								if ( tags.size( ) > 0 )
									tags.pop( );
							}
							else
							{
								handler.startTag( currentTagData.xmlns, currentTagData.name );
								tags.push( currentTagData );
							}
						}
						
						if ( ch != ' ' )
						{
							mode = MODE_UNKNOWN;
							charsS = charsE = i + 1;
						}
						else
						{
							mode = MODE_PN_TAG_CONTENT;
						}
					}
					else if ( Character.isLetterOrDigit( ch ) )
					{
						charsE = i;
					}
					break;
					
				case MODE_PN_TAG_CONTENT:
					if ( ch == '/' || ch == '>' )
					{						
						if ( ch == '/' && ( i + 1 < data.length( ) ) && data.charAt( i + 1 ) == '>' && ! isClosedTag )
						{
							handler.startTag( currentTagData.xmlns, currentTagData.name );
							handler.endTag( currentTagData.xmlns, currentTagData.name );

							i++;
						}
						else if ( ch == '>' )
						{
							if ( isClosedTag )
							{
								handler.endTag( currentTagData.xmlns, currentTagData.name );
								if ( tags.size( ) > 0 )
									tags.pop( );
							}
							else
							{
								handler.startTag( currentTagData.xmlns, currentTagData.name );
								tags.push( currentTagData );
							}
						}
						
						mode = MODE_UNKNOWN;
						charsS = charsE = i + 1;
					}					
					break;
			}
		}
	}
}
