package ru.acs.fts.aly.model.supplementary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.springframework.beans.factory.annotation.Required;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import ru.acs.fts.aly.model.entities.AlyXmlData;
import ru.acs.fts.aly.model.services.MessageService;
import ru.acs.fts.eps2.utils.StringUtil;

public class XmlRestore
{
	private MessageService _messageService;
	
	// @formatter:off
	@Required public void setMessageService( MessageService messageService ) { _messageService = messageService; }
	public MessageService getMessageService( ) { return _messageService; }
	// @formatter:on
	
	public XmlTree restoreImpl( List< AlyXmlData > data )
	{
		Map< Integer, XmlTree > plain = new HashMap< Integer, XmlTree >( );
		for ( AlyXmlData d : data )
		{
			XmlTree xmlt = new XmlTree( );
			xmlt.setCurrent( d );
			xmlt.setChildren( new ArrayList< XmlTree >( ) );
			xmlt.setParent( null );
			
			plain.put( d.getId( ), xmlt );
		}
		
		XmlTree root = null;
		
		List< Integer > keys = new ArrayList< Integer >( plain.keySet( ) );
		Collections.sort( keys, new Comparator< Integer >( )
		{
			@Override
			public int compare( Integer o1, Integer o2 )
			{
				return o1.compareTo( o2 );
			}	
		} );
		
		// for ( XmlTree xmlt : plain.values( ) )
		for ( Integer key : keys )
		{
			XmlTree xmlt = plain.get( key );
			
			if ( null == xmlt.getCurrent( ).getTagParent( ) )
			{
				if ( null == root )
					root = xmlt;
				continue;
			}
			
			int id = xmlt.getCurrent( ).getTagParent( ).intValue( );
			XmlTree parent = plain.get( id );
			if ( null == parent )
				continue;
			
			parent.getChildren( ).add( xmlt );
			xmlt.setParent( parent );
		}
		
		return root;
	}
	
	public Document restore( List< AlyXmlData > data ) 
		throws Exception
	{
		XmlTree xmlt = restoreImpl( data );

		return restore( xmlt );
	}
	
	public Document restore( List< AlyXmlData > data, String docName )
		throws Exception
	{
		XmlTree xmlt = restoreImpl( data ); 
		xmlt = xmlt.traverseTo( docName );
		
		return restore( xmlt );
	}
	
	private Document restore( XmlTree xmlt )
		throws Exception
	{
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
		dbf.setNamespaceAware( true );
		
		DocumentBuilder db = dbf.newDocumentBuilder( );
		Document doc = db.newDocument( );
		
		doc.appendChild( restore( xmlt, doc ) );
		
		return doc;
	}
	
	private Element restore( XmlTree cur, Document doc )
	{
		Element cure = doc.createElementNS( cur.getCurrent( ).getTagNamespace( ), cur.getCurrent( ).getTagName( ) );

		// TODO: Хак! заменить справочником DocumentModeID'ов
		if ( cur.getCurrent( ).getTagName( ).equals( "ESADout_CU" ) )
			cure.setAttribute( "DocumentModeID", "1006107E" );
		
		if ( null == cur.getChildren( ) || cur.getChildren( ).isEmpty( ) )
		{
			if ( ! StringUtil.isNullOrEmpty( cur.getCurrent( ).getTagValue( ) ) )
				cure.setTextContent( cur.getCurrent( ).getTagValue( ) );
		}
		else
		{
			for ( XmlTree child : cur.getChildren( ) )
			{
				Element el = restore( child, doc );
				if ( null != el )
					cure.appendChild( el );
			}
		}
		
		return cure;
	}
	
	public Document traverseTo( Document doc, String tagName )
		throws Exception
	{
		XPathFactory xpf = XPathFactory.newInstance( );
		XPath xp = xpf.newXPath( );
		XPathExpression xpe = xp.compile( String.format( "//*[local-name()='%s']", tagName ) );
		
		Node n = ( Node )xpe.evaluate( doc, XPathConstants.NODE );
		if ( null == n || ! ( n instanceof Element ) )
			return null;
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
		DocumentBuilder db = dbf.newDocumentBuilder( );
		Document ndoc = db.newDocument( );
		
		ndoc.appendChild( ndoc.importNode( n, true ) );
		
		return ndoc;
	}
}
