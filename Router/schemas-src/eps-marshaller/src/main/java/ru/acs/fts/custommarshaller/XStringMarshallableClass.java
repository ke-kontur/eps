package ru.acs.fts.custommarshaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.jibx.extras.DomElementMapper;
import org.jibx.runtime.IMarshallable;
import org.jibx.runtime.IMarshallingContext;
import org.jibx.runtime.JiBXException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XStringMarshallableClass implements IMarshallable
{
    private String _documentId;
    private String _refDocumentId;
    private String _documentModeId;
	
	private byte[ ] byteArray;
	private String encoding;
	
	public void setByteArray( byte[ ] byteArray ) { this.byteArray = byteArray; cleanPretend( ); }
	public byte[ ] getByteArray( ) { return byteArray; }
	
	public void setEncoding( String encoding ) { this.encoding = encoding; }
	public String getEncoding( ) { return encoding; }
	
	@Override
	public String JiBX_getName( )
	{
		return XStringMarshallableClass.class.getSimpleName( );
	}

	@Override
	public void marshal( IMarshallingContext ctx ) throws JiBXException
	{
		try
		{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
			DocumentBuilder db = dbf.newDocumentBuilder( );
			Document doc = db.parse( new ByteArrayInputStream( byteArray ) );
			
			DomElementMapper dem = new DomElementMapper( );
			dem.marshal( doc.getDocumentElement( ), ctx );
		}
		catch ( Exception e )
		{
			System.out.println( e );
			
			throw new JiBXException( "XStringMarshallableClass error", e );
		}
	}
	
	/**
	 * Вспомогательные функции чтобы этот класс мог прикидываться документом
	 */
	
	private DocumentBuilderFactory _dbf;
	private XPathFactory _xpf;
	
	private void cleanPretend( )
	{
		_documentId = null;
		_refDocumentId = null;
		_documentModeId = null;
	}
	
	private String fetchValueByXPath( String xPathStr ) 
		throws Exception
	{
		if ( null == _dbf )
		{
			_dbf = DocumentBuilderFactory.newInstance( );
			_dbf.setNamespaceAware( true );
		}
		
		DocumentBuilder bld = _dbf.newDocumentBuilder( );
		Document doc = bld.parse( new ByteArrayInputStream( byteArray ) );
		
		if ( null == _xpf )
		{
			_xpf = XPathFactory.newInstance( );
		}
		
		XPath xPath = _xpf.newXPath( );
		XPathExpression xPathExpr = xPath.compile( xPathStr );
		
		String res = ( String )xPathExpr.evaluate( doc, XPathConstants.STRING );
		return res;
	}
	
	public String getDocumentID( ) 
		throws Exception
	{
		if ( null != _documentId )
			return _documentId;
		
		_documentId = fetchValueByXPath( "//*[local-name()='DocumentID']/text()" );
		return _documentId;
	}
	
	public String getRefDocumentID( )
		throws Exception
	{
		if ( null != _refDocumentId )
			return _refDocumentId;
		
		_refDocumentId = fetchValueByXPath( "//*[local-name()='RefDocumentID']/text()" );
		return _refDocumentId;
	}
	
	public String getDocumentModeID( )
		throws Exception
	{
		if ( null != _documentModeId )
			return _documentModeId;
		
		_documentModeId = fetchValueByXPath( "//*/@DocumentModeID" );
		return _documentModeId;
	}
	
	public String getXmlNamespace( ) 
		throws Exception
	{
		if ( null == _dbf )
		{
			_dbf = DocumentBuilderFactory.newInstance( );
			_dbf.setNamespaceAware( true );
		}
		
		DocumentBuilder bld = _dbf.newDocumentBuilder( );
		Document doc = bld.parse( new ByteArrayInputStream( byteArray ) );

		return doc.getDocumentElement( ).getNamespaceURI( );
	}
	
	public void stripSignature( ) 
		throws ParserConfigurationException, SAXException, IOException, XPathExpressionException, TransformerException
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
		dbf.setNamespaceAware( true );
		
		DocumentBuilder db = dbf.newDocumentBuilder( );
		Document doc = db.parse( new ByteArrayInputStream( byteArray ) );
		
		XPathFactory xpf = XPathFactory.newInstance( );
		XPath xp = xpf.newXPath( );
		XPathExpression xpe = xp.compile( "//*[local-name()='Signature']/*[local-name()='Object']/*" );
		
		Node objectValue = ( Node )xpe.evaluate( doc, XPathConstants.NODE );
		if ( null != objectValue )
		{
			byteArray = serialize( objectValue, true );
		}
	}
	
	private byte[ ] serialize( Node node, boolean omitXmlDecl ) 
		throws TransformerException
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream( );

		Transformer t = TransformerFactory.newInstance( ).newTransformer( );
		t.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, omitXmlDecl ? "yes" : "no" );
		t.setOutputProperty( OutputKeys.INDENT, "no" );
		t.transform( new DOMSource( node ), new StreamResult( baos ) );
		
		return baos.toByteArray( );
	}			
}
