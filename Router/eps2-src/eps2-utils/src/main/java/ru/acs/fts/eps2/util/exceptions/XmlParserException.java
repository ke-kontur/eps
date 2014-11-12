package ru.acs.fts.eps2.util.exceptions;

public class XmlParserException extends Exception
{
	private static final long serialVersionUID = 1L;

	public XmlParserException( )
	{
		
	}
	
	public XmlParserException( String message ) // NO_UCD (unused code)
	{
		super( message );
	}
	
	public XmlParserException( Throwable cause ) // NO_UCD (unused code)
	{
		super( cause );
	}
	
	public XmlParserException( String message, Throwable cause )
	{
		super( message, cause );
	}
}
