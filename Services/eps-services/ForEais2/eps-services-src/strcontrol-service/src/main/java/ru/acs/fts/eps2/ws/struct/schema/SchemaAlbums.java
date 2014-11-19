package ru.acs.fts.eps2.ws.struct.schema;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.ws.struct.exceptions.ErrorCodeException;
import ru.acs.fts.eps2.ws.struct.helpers.ResultProcessor;
import ru.acs.fts.eps2.ws.utils.helpers.StringUtils;

public class SchemaAlbums
{
	private static String _baseSchemaPath;
	private static Map< String, SchemaAlbum > _albums = null;
	
	// @formatter:off
	@Required public void setBaseSchemaPath( String baseSchemaPath ) { _baseSchemaPath = baseSchemaPath; _albums = null; }
	public String getBaseSchemaPath( ) { return _baseSchemaPath; }
	// @formatter:on
	
	public static String getPathToSchemaFile( String ns, String softVersion )
		throws ErrorCodeException
	{
		if ( null == _albums )
			buildSchemaTable( );
		
		if ( StringUtils.isNullOrEmpty( softVersion ) )
			throw new ErrorCodeException( ResultProcessor.NOT_VALID_ALBUM_VERSION );
		
		String albumVersion = softVersion.split( "/" )[ 0 ];
		
		if ( ! _albums.containsKey( albumVersion ) )
			throw new ErrorCodeException( ResultProcessor.NOT_VALID_ALBUM_VERSION );
		
		SchemaAlbum album = _albums.get( albumVersion );
		if ( null == album )
			throw new ErrorCodeException( ResultProcessor.NOT_VALID_ALBUM_VERSION );
		
		String schemaPath = album.getSchemaPath( ns );
		if ( null == schemaPath )
			throw new ErrorCodeException( ResultProcessor.SCHEMA_FILE_NOT_FOUND );
		
		return schemaPath;
	}
	
	private static void buildSchemaTable( ) 
		throws ErrorCodeException
	{
		_albums = new HashMap< String, SchemaAlbum >( );
		
		File albumsLocation = new File( _baseSchemaPath );
		File[ ] albums = albumsLocation.listFiles( new FilenameFilter( )
		{
			@Override
			public boolean accept( File dir, String name )
			{
				if ( name.equalsIgnoreCase( "." ) ||
					 name.equalsIgnoreCase( ".." ) )
					return false;
				
				return true;
			}			
		} );
		
		for ( File album : albums )
		{
			SchemaAlbum alb = new SchemaAlbum( );
			alb.buildAlbum( album );
			
			_albums.put( alb.getAlbumVersion( ), alb );
		}
	}
}
