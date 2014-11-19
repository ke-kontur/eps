package ru.acs.fts.eps2.ws.utils.helpers;

import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class DocumentProcessor
{		
	public static String getDocumentID( Document doc ) 
		throws XPathExpressionException
	{
		XPathFactory xfq = XPathFactory.newInstance( );
		XPath xpath = xfq.newXPath( );
		XPathExpression expr = xpath.compile( "//*[local-name()='DocumentID']" );
		
		Node res = ( Node )expr.evaluate( doc.getDocumentElement( ), XPathConstants.NODE );
		if ( null == res )
			return "<unknown>";
		
		return res.getTextContent( );
	}
	
	public static List< Element > getInnerDocuments( Document doc, String xPath ) 
		throws XPathExpressionException
	{
		XPathFactory xfq = XPathFactory.newInstance( );
		XPath xpath = xfq.newXPath( );
		XPathExpression expr = xpath.compile( xPath );
		
		NodeList inners = ( NodeList )expr.evaluate( doc.getDocumentElement( ), XPathConstants.NODESET );
		List< Element > res = new ArrayList< Element >( );
		for ( int i = 0; i < inners.getLength( ); ++i )
		{
			Node inner = inners.item( i );
			if ( ! ( inner instanceof Element ) )
				continue;
			
			Element el = ( Element )inner;
			
			NodeList possibleDocs = el.getChildNodes( );
			for ( int j = 0; j < possibleDocs.getLength( ); ++j )
			{
				Node possibleDoc = possibleDocs.item( j );
				if ( ! ( possibleDoc instanceof Element ) )
					continue;
				
				res.add( ( Element )possibleDoc );
				break;
			}
		}
		
		return res;
	}
	
	// utility
	
	private static DocumentBuilderFactory _domFactory = null;
	
	public static String unpackFromBase64( String base64 ) 
		throws UnsupportedEncodingException
	{
		return Base64Coder.decode( base64, "UTF-8" );
	}
	
	public static String packToBase64( String doc ) 
		throws UnsupportedEncodingException
	{
		return Base64Coder.encodeAsString( doc, "UTF-8" );
	}
	
	public static DocumentBuilder getDocumentBuilder( ) 
		throws ParserConfigurationException
	{
		if ( null == _domFactory )
		{
			_domFactory = DocumentBuilderFactory.newInstance( );
			_domFactory.setNamespaceAware( true );
		}
		
		return _domFactory.newDocumentBuilder( );
	}
	
	public static Document parse( String xml ) 
		throws SAXException, IOException, ParserConfigurationException
	{
		DocumentBuilder bld = getDocumentBuilder( );		
		return bld.parse( new InputSource( new StringReader( xml ) ) );
	}	
}
