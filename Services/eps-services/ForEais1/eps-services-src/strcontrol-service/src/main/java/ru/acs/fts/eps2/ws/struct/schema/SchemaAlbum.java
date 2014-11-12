package ru.acs.fts.eps2.ws.struct.schema;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

import ru.acs.fts.eps2.ws.struct.exceptions.ErrorCodeException;
import ru.acs.fts.eps2.ws.struct.helpers.ResultProcessor;

public class SchemaAlbum
{
	private String _albumVersion;
	private Map< String, String > _xsd;
	
	// @formatter:off
	public String getAlbumVersion( ) { return _albumVersion; }
	
	public String getSchemaPath( String xmlns ) { return _xsd.get( xmlns ); }
	// @formatter:on
	
	public void buildAlbum( File path ) 
		throws ErrorCodeException 
	{
		_albumVersion = path.getName( );
		
		File[ ] schemas = path.listFiles( new FilenameFilter( )
		{
			public boolean accept( File dir, String name )
			{
				return name.endsWith( ".xsd" );
			}
		} );
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
		DocumentBuilder db = null;
		
		try
		{
			db = dbf.newDocumentBuilder( );
		}
		catch ( ParserConfigurationException exc )
		{
			throw new ErrorCodeException( ResultProcessor.SCHEMA_FILE_NOT_FOUND, exc );
		}

		_xsd = new HashMap< String, String >( );
		
		for ( File schema : schemas )
		{
			try
			{
				Document xsd = db.parse( schema );
				String xmlns = xsd.getDocumentElement( ).getAttribute( "targetNamespace" );
				_xsd.put( xmlns, schema.getAbsolutePath( ) );
			}
			catch ( Exception exc )
			{
				// eat the exception ...
			}
		}
	}
}
