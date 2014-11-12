package ru.acs.fts.eps2.engine.data.kind;

import java.util.ArrayList;

public enum CompressType
{
	NotCompressed( "NotCompressed" ), 
	ZIP( "ZIP" ), 
	NotProcedure( "NotProcedure" ), 
	NotFromDecl( "NotFromDecl" ), 
	XML( "XML" );

	private static ArrayList< CompressType > activeTypes = new ArrayList< CompressType >( )
	{
		private static final long serialVersionUID = 8325133346312286727L;

		@Override
		public boolean contains( Object o )
		{
			if ( size( ) == 0 )
			{
				add( NotCompressed );
				add( ZIP );
			}
			return indexOf( o ) >= 0;
		}
	};

	public static CompressType parse( Object compress )
	{
		if ( !compress.getClass( ).equals( String.class ) )
		{
			return NotProcedure;
		}
		String valueToParse = ( String )compress;
		try
		{
			CompressType parsedValue = CompressType.valueOf( valueToParse );
			if ( !activeTypes.contains( parsedValue ) )
			{
				parsedValue = CompressType.NotProcedure;
			}
			return parsedValue;
		}
		catch ( Exception e )
		{
			return NotProcedure;
		}
	}

	private String compressTypeText;

	public String getCompressTypeText( )
	{
		return compressTypeText;
	}

	CompressType( String compressTypeText )
	{
		this.compressTypeText = compressTypeText;
	}
}
