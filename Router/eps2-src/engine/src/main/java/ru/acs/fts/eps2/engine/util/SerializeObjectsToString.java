package ru.acs.fts.eps2.engine.util;

import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;

public class SerializeObjectsToString
{
	public static String serializeObjectToString( Object object )
	{
		try
		{
			ByteArrayOutputStream baos = new ByteArrayOutputStream( );
			XMLEncoder encoder = new XMLEncoder( baos );
			encoder.writeObject( object );
			encoder.close( );
			return baos.toString( );
		}
		catch ( Exception e )
		{
			return String.format(
				"Не удалось сериализовать %s в строку", object.getClass( )
			);
		}
	}
}
