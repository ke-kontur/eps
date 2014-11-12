package ru.acs.fts.aly.model.supplementary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.aly.model.entities.AlyXmlData;

public class XmlTree
{
	private AlyXmlData _current;
	
	private XmlTree _parent;
	private List< XmlTree > _children;
	
	// @formatter:off
	public void setCurrent( AlyXmlData current ) { _current = current; }
	public AlyXmlData getCurrent( ) { return _current; }
	
	public void setParent( XmlTree parent ) { _parent = parent; }
	public XmlTree getParent( ) { return _parent; }
	
	public void setChildren( List< XmlTree > children ) { _children = children; }
	public List< XmlTree > getChildren( ) { return _children; }
	// @formatter:on
	
	public static AlyXmlData getRoot( List< AlyXmlData > old )
	{
		for ( AlyXmlData v : old )
		{
			if ( null == v.getTagParent( ) )
				return v;
		}
		
		return null;
	}
	
	public XmlTree traverseTo( String tagName )
	{
		if ( _current.getTagName( ).equals( tagName ) )
			return this;
		
		for ( XmlTree child : _children )
		{
			XmlTree v = child.traverseTo( tagName );
			if ( null != v )
				return v;
		}
		
		return null;
	}
	
	public void set( AlyXmlData cur, List< AlyXmlData > old )
	{
		_current = cur;
		_children = new ArrayList< XmlTree >( );
		
		List< AlyXmlData > rem = new ArrayList< AlyXmlData >( );
		Map< XmlTree, AlyXmlData > ch = new HashMap< XmlTree, AlyXmlData >( );
		for ( AlyXmlData v : old )
		{
			if ( v.getTagParent( ) == null )
				continue;
			
			if ( v.getTagParent( ).intValue( ) == cur.getId( ).intValue( ) )
			{
				XmlTree xmlt = new XmlTree( );
				xmlt.setParent( this );
				_children.add( xmlt );
				
				ch.put( xmlt, v );
				rem.add( v );
			}
		}
		
		for ( AlyXmlData r : rem )
		{
			old.remove( r );
		}
		
		for ( XmlTree xmlt : ch.keySet( ) )
		{
			AlyXmlData v = ch.get( xmlt );
			xmlt.set( v, old );
		}
	}
}
