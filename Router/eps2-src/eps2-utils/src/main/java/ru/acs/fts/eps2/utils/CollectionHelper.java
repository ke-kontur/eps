package ru.acs.fts.eps2.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionHelper
{
	private CollectionHelper( ) { }
	
	public static < T > boolean isNullOrEmpty( Collection< T > collection )
	{
		return null == collection || collection.isEmpty( );
	}
	
	public static < T > T getFirst( List< T > list )
	{
		return isNullOrEmpty( list ) ? null : list.get( 0 );
	}
	
	public static < T > T getLast( List< T > list ) // NO_UCD (unused code)
	{
		return isNullOrEmpty( list ) ? null : list.get( list.size( ) - 1 );
	}
	
	public static < T > List< T > getReversed( List< T > list )
	{
		List< T > reversedList = null;
		if ( null != list )
		{
			reversedList = new ArrayList< T >( );
			synchronized ( list )
			{
				for ( int i = list.size( ) - 1; i >= 0; i-- )
					reversedList.add( list.get( i ) );
			}
		}
		
		return reversedList;
	}
	
	public static < T > void removeLast( List< T > list )
	{
		if ( ! isNullOrEmpty( list ) )
			list.remove( list.size( ) - 1);
	}
}
