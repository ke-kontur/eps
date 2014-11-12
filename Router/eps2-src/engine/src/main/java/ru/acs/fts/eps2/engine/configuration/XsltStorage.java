package ru.acs.fts.eps2.engine.configuration;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author KGN
 */
public class XsltStorage
{
	private Map< String, Map< String, byte[ ] > > storage;

	public XsltStorage(  // NO_UCD (used by spring IoC context)
			Map< String, Map< String, String >> transformationsStorage )
		throws IOException
	{
		storage = new HashMap< String, Map< String, byte[ ] > >( );
		for ( String transformationType : transformationsStorage.keySet( ) )
		{
			HashMap< String, byte[ ] > transformationVersions = new HashMap< String, byte[ ] >( );
			
			Map< String, String > transformationVersionsRaw = 
				transformationsStorage.get( transformationType );
			
			for ( String transformationVersion : transformationVersionsRaw.keySet( ) )
			{
				String file = transformationVersionsRaw.get( transformationVersion );
				InputStream inputStream = XsltStorage.class.getResourceAsStream( file );
				
				if ( inputStream == null )
				{
					throw new IOException( String.format(
						"Не смогли получить XSL-преобразование для типа '%s' версии '%s' из файла '%s'",
						transformationType, transformationVersion, file 
					) );
				}
				transformationVersions.put( transformationVersion, IOUtils.toByteArray( inputStream ) );
			}
			storage.put( transformationType, transformationVersions );
		}
	}

	public byte[ ] getXslt( String type, String version )
	{
		if ( storage.containsKey( type ) )
		{
			Map< String, byte[ ] > transformationVersions = storage.get( type );
			if ( transformationVersions.containsKey( version ) )
			{
				return transformationVersions.get( version );
			}
		}
		return null;
	}
}
