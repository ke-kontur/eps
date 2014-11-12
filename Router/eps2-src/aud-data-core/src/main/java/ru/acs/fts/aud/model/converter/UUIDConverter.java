package ru.acs.fts.aud.model.converter;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.util.UUID;

import org.eclipse.persistence.internal.helper.DatabaseField;
import org.eclipse.persistence.mappings.DatabaseMapping;
import org.eclipse.persistence.mappings.DirectCollectionMapping;
import org.eclipse.persistence.mappings.converters.Converter;
import org.eclipse.persistence.sessions.Session;

public class UUIDConverter implements Converter
{
	private static final long serialVersionUID = 1L;

	@Override
	public Object convertObjectValueToDataValue( Object objectValue, Session session )
	{
		if ( null == objectValue )
			return null;
		
		UUID uuid = UUID.fromString( objectValue.toString( ) );

		byte[ ] byteArray = new byte[ ( Long.SIZE / Byte.SIZE ) * 2 ];
		ByteBuffer buffer = ByteBuffer.wrap( byteArray );
		LongBuffer longBuffer = buffer.asLongBuffer( );
		longBuffer.put( new long[ ] { uuid.getMostSignificantBits( ), uuid.getLeastSignificantBits( ) } );
		
		return byteArray;
	}

	@Override
	public String convertDataValueToObjectValue( Object dataValue, Session session )
	{
		if ( null == dataValue )
			return null;
		
		ByteBuffer buffer = ByteBuffer.wrap( ( byte[] )dataValue );
		LongBuffer longBuffer = buffer.asLongBuffer( );
		return ( new UUID( longBuffer.get( 0 ), longBuffer.get( 1 ) ) ).toString( );
	}

	@Override
	public boolean isMutable( )
	{
		return true;
	}

	@Override
	public void initialize( DatabaseMapping mapping, Session session )
	{
		final DatabaseField field;
		if ( mapping instanceof DirectCollectionMapping )
		{
			// handle @ElementCollection...
			field = ( ( DirectCollectionMapping )mapping ).getDirectField( );
		}
		else
		{
			field = mapping.getField( );
		}

//		field.setSqlType( java.sql.Types.OTHER );
		field.setSqlType( java.sql.Types.BINARY );
		field.setTypeName( "raw" );
		field.setColumnDefinition( "RAW(16)" );
	}
}