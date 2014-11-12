package ru.acs.fts.aud.model.persistence.cached;

import java.util.Date;

/**
 * Код бережно позаимствован из EPS2JAVA
 */
public class CacheItem< T > // NO_UCD (use default)
{
	private T object;
	
	private Date updateDate;
	
	public CacheItem( T object, Date updatedate ) // NO_UCD (use default)
	{
		this.object = object;
		this.updateDate = updatedate;
	}
	
	public CacheItem( ) { }
	
	public void setObject( T object ) { this.object = object; }
	public T getObject( ) { return object; }
	
	public void setUpdateDate( Date updateDate ) { this.updateDate = updateDate; }
	public Date getUpdateDate( ) { return updateDate; }
	
	@Override
	public boolean equals( Object obj )
	{
		if ( null == obj )
			return false;
		else
			if ( null != object && obj.getClass( ).equals( object.getClass( ) ) )
				return obj.equals( object );
			else
				return super.equals( obj );
	}
	
	@Override
	public int hashCode( )
	{
		if ( null != object )
			return object.hashCode( );
		else
			return super.hashCode( );
	}
}
