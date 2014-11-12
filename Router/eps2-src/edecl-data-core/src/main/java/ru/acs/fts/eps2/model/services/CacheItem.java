package ru.acs.fts.eps2.model.services;

import java.util.Date;

class CacheItem< T >
{
	private T _object;	
	private Date _updateDate;
	
	public CacheItem( T object, Date updatedate ) // NO_UCD (use default)
	{
		_object = object;
		_updateDate = updatedate;
	}
	
	public CacheItem( ) { }
	
	// @formatter:off
	public void setObject( T object ) { _object = object; }
	public T getObject( ) { return _object; }
	
	public void setUpdateDate( Date updateDate ) { _updateDate = updateDate; }
	public Date getUpdateDate( ) { return _updateDate; }
	// @formatter:on
	
	@Override
	public boolean equals( Object obj )
	{
		if ( null == obj )
			return false;
		else
			if ( null != _object && obj.getClass( ).equals( _object.getClass( ) ) )
				return obj.equals( _object );
			else
				return super.equals( obj );
	}
	
	@Override
	public int hashCode( )
	{
		if ( null != _object )
			return _object.hashCode( );
		else
			return super.hashCode( );
	}
}
