package ru.acs.fts.eps2.engine.util.xslt;

public class XsltTransformationException extends Exception
{
	private static final long serialVersionUID = 1L;

	public XsltTransformationException( )
	{
		super( "Ошибка XSL-преобразования" );
	}

	public XsltTransformationException( String message ) // NO_UCD (unused code)
	{
		super( String.format( "Ошибка XSL-преобразования: %s", message ) );
	}

	public XsltTransformationException( Throwable throwable ) // NO_UCD (use default)
	{
		super( "Ошибка XSL-преобразования", throwable );
	}

	public XsltTransformationException( String message, Throwable throwable ) // NO_UCD (unused code)
	{
		super( String.format( "Ошибка XSL-преобразования: %s", message ), throwable );
	}
}
