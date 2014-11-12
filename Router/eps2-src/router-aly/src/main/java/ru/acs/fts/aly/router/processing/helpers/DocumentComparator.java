package ru.acs.fts.aly.router.processing.helpers;

import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

import ru.acs.fts.aly.router.processing.supplementary.esad.comparison.DocComparisonItem;

public class DocumentComparator
{
	/*
	public static void compare( Element cur, XmlTree old, List< DocComparisonItem > result )
	{
		boolean hasChild = false;
		
		if ( cur.hasChildNodes( ) )
		{
			int i = 0;
			for ( Node n = cur.getFirstChild( ); n != null; n = n.getNextSibling( ) )
			{
				if ( ! ( n instanceof Element ) ) 
					continue;
				
				hasChild = true;

				Element el = ( Element )n;
				int found = -1;
				
				for ( int j = i; j < old.getChildren( ).size( ); ++j )
				{
					if ( el.getLocalName( ).equals( old.getChildren( ).get( j ).getCurrent( ).getTagName( ) ) )
					{
						found = j;
						break;
					}
				}
				
				if ( -1 == found )
				{
					/ * *
					 * Не нашли - этот элемент был добавлен
					 * /
					recurseAdded( el, result );
					continue;
				}
				
				for ( int j = i; j < old.getChildren( ).size( ); ++j )
				{
					if ( el.getLocalName( ).equals( old.getChildren( ).get( j ).getCurrent( ).getTagName( ) ) )
					{
						break;
					}
					else
					{
						/ * * 
						 * Не нашли - этот элемент был удален
						 * /
						recurseDeleted( old.getChildren( ).get( j ), result );
					}
				}
				
				if ( -1 != found && found < old.getChildren( ).size( ) )
				{
					i = found + 1;
					compare( ( Element )n, old.getChildren( ).get( found ), result );
				}
			}
		}
		
		if ( ! hasChild )
		{
			if ( ! isEquals( cur.getTextContent( ), old.getCurrent( ).getTagValue( ) ) )
			{
				DocComparisonItem item = new DocComparisonItem( );
				item.setPath( getPath( cur ) );
				item.setOldValue( old.getCurrent( ).getTagValue( ) );
				item.setNewValue( cur.getTextContent( ) );
				item.setOp( DocComparisonItem.Ops.CH );
				
				item.setCur( cur );
				item.setOld( old );
				
				result.add( item );
			}
		}
	}
	*/
	
	public static void compare( Element cur, Element old, List< DocComparisonItem > result )
	{
		boolean hasChild = false;
		
		if ( cur.hasChildNodes( ) )
		{
			int oldSize = 0;
			for ( Node n = old.getFirstChild( ); n != null; n = n.getNextSibling( ) )
			{
				if ( ! ( n instanceof Element ) )
					continue;
				
				oldSize++;
			}
			
			int i = 0;
			for ( Node n = cur.getFirstChild( ); n != null; n = n.getNextSibling( ) )
			{
				if ( ! ( n instanceof Element ) ) 
					continue;
				
				hasChild = true;

				Element el = ( Element )n;
				
				int found = -1;
				Element foundel = null;
				
				int j = 0;
				for ( Node nj = old.getFirstChild( ); nj != null; nj = nj.getNextSibling( ) )
				{
					if ( ! ( nj instanceof Element ) )
						continue;
					
					if ( j < i )
					{
						j++;
						continue;
					}
					
					if ( el.getLocalName( ).equals( ( ( Element )nj ).getLocalName( ) ) )
					{
						found = j;
						foundel = ( Element )nj;
						break;
					}
					
					j++;
				}
				
				if ( -1 == found )
				{
					/**
					 * Не нашли - этот элемент был добавлен
					 */
					recurseAdded( el, result );
					continue;
				}
				
				j = 0;
				for ( Node nj = old.getFirstChild( ); nj != null; nj = nj.getNextSibling( ) )
				{
					if ( ! ( nj instanceof Element ) )
						continue;
					
					if ( j < i )
					{
						j++;
						continue;
					}
					
					if ( el.getLocalName( ).equals( ( ( Element )nj ).getLocalName( ) ) )
						break;
					else
					{
						/** 
						 * Не нашли - этот элемент был удален
						 */
						recurseDeleted( ( Element )nj, result );
					}
					
					j++;
				}
				
				if ( -1 != found && found < oldSize )
				{
					i = found + 1;
					compare( ( Element )n, foundel, result );
				}
			}
		}
		
		if ( ! hasChild )
		{
			if ( ! isEquals( cur.getTextContent( ), old.getTextContent( ) ) )
			{
				DocComparisonItem item = new DocComparisonItem( );
				item.setPath( getPath( cur ) );
				item.setOldValue( old.getTextContent( ) );
				item.setNewValue( cur.getTextContent( ) );
				item.setOp( DocComparisonItem.Ops.CH );
				
				item.setCur( cur );
				item.setOld( old );
				
				result.add( item );
			}
		}
	}
	
	private static boolean isEquals( String v1, String v2 )
	{
		if ( isNoE( v1 ) && isNoE( v2 ) )
			return true;
		
		if ( isNoE( v1 ) && ! isNoE( v2 ) )
			return false;
		if ( ! isNoE( v1 ) && isNoE( v2 ) )
			return false;
		
		return v1.equals( v2 );
	}
	
	private static boolean isNoE( String v )
	{
		return ( null == v || v.isEmpty( ) );
	}
	
	private static String getPath( Node el )
	{
		StringBuilder path = new StringBuilder( );
		
		do
		{
			path.insert( 0, String.format( "*[local-name()='%s']", el.getLocalName( ) ) );
			path.insert( 0, "/" );
			el = el.getParentNode( );
		} while ( null != el && null != el.getParentNode( ) );
		
		path.insert( 0, "/" );
		
		return path.toString( );
	}

	/*
	private static String getPath( XmlTree xmlt )
	{
		StringBuilder path = new StringBuilder( );
		
		do
		{
			path.insert( 0, String.format( "*[local-name()='%s']", xmlt.getCurrent( ).getTagName( ) ) );
			path.insert( 0, "/" );
		} while ( ( xmlt = xmlt.getParent( ) ) != null );
		
		path.insert( 0, "/" );
		
		return path.toString( );
	}
	*/
	
	private static boolean hasChildren( Element el )
	{
		for ( Node n = el.getFirstChild( ); n != null; n = n.getNextSibling( ) )
		{
			if ( n instanceof Element )
				return true;
		}
		
		return false;
	}
	
	private static void recurseAdded( Element el, List< DocComparisonItem > result )
	{
		if ( ! hasChildren( el ) )
		{
			DocComparisonItem item = new DocComparisonItem( );
			item.setPath( getPath( el ) );
			item.setOldValue( null );
			item.setNewValue( el.getTextContent( ) );
			item.setOp( DocComparisonItem.Ops.ADD );
			
			item.setCur( el );
			item.setOld( null );
			
			result.add( item );
			return ;
		}
		
		for ( Node n = el.getFirstChild( ); n != null; n = n.getNextSibling( ) )
		{
			if ( ! ( n instanceof Element ) )
				continue;
			
			recurseAdded( ( Element )n, result );
		}
	}

	private static void recurseDeleted( Element el, List< DocComparisonItem > result )
	{
		if ( ! hasChildren( el ) )
		{
			DocComparisonItem item = new DocComparisonItem( );
			item.setPath( getPath( el ) );
			item.setOldValue( el.getTextContent( ) );
			item.setNewValue( null );
			item.setOp( DocComparisonItem.Ops.DEL );
			
			item.setCur( null );
			item.setOld( el );
			
			result.add( item );
			return ;
		}
		
		for ( Node n = el.getFirstChild( ); n != null; n = n.getNextSibling( ) )
		{
			if ( ! ( n instanceof Element ) )
				continue;
			
			recurseDeleted( ( Element )n, result );
		}
	}
	
	/*
	private static void recurseDeleted( XmlTree xmlt, List< DocComparisonItem > result )
	{
		if ( xmlt.getChildren( ).isEmpty( ) )
		{
			DocComparisonItem item = new DocComparisonItem( );
			item.setPath( getPath( xmlt ) );
			item.setOldValue( xmlt.getCurrent( ).getTagValue( ) );
			item.setNewValue( null );
			item.setOp( DocComparisonItem.Ops.DEL );
			
			item.setCur( null );
			item.setOld( xmlt );
			
			result.add( item );
			return ;
		}
		
		for ( XmlTree n : xmlt.getChildren( ) )
		{
			recurseDeleted( n, result );
		}
	}
	*/
}
