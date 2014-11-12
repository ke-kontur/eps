package ru.acs.fts.custommarshaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.codec.binary.Base64;
import org.springframework.oxm.Unmarshaller;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import ru.acs.fts.schemas.envelope.*;

public class EnvelopeUnmarshaller
{	
	private boolean _wasCompressed = false;
	
	// @formatter:off
	public boolean getWasCompressed( ) { return _wasCompressed; }
	// @formatter:on

	/**
	 * Метод производит десериализацию массива байт в EnvelopeType. вытаскивает
	 * бинарные данные для объекта внутри боди.
	 * 
	 * @param data
	 * @param unmarshallerEnvelope
	 * @return
	 * @throws Exception
	 */
	public EnvelopeType unmarshall( byte[ ] data, Unmarshaller unmarshaller ) 
		throws Exception
	{
		ByteArrayInputStream bais = new ByteArrayInputStream( data );
		StreamSource strS = new StreamSource( bais );
		
		EnvelopeType envelope = ( EnvelopeType )unmarshaller.unmarshal(strS);
		_wasCompressed = false;
		
		List< Object > bodies = envelope.getBody( ).getAnyList( );
		for ( Object body : bodies )
		{
			Object obj = body;
			
			if ( obj instanceof Compressed )
			{
				_wasCompressed = true;
				
				byte[ ] uncompressed = decompress( Base64.decodeBase64( ( ( Compressed )obj ).getCompressed( ) ) );
				try
				{
					Object uncompressedObj = unmarshallBaseDocOrSignature( uncompressed, unmarshaller );						
					if ( null != uncompressedObj )
						bodies.set( bodies.indexOf( body ), uncompressedObj );
				}
				catch ( Exception exc )
				{
					XStringMarshallableClass xstr = new XStringMarshallableClass( );
					xstr.setByteArray( uncompressed );
					xstr.setEncoding( "UTF-8" );
					bodies.set( bodies.indexOf( body ), xstr );
					
					throw exc;
				}
			}
		}
		
		return envelope;
	}
	
	public EnvelopeType unmarshallWithoutBody( byte[ ] data, Unmarshaller unmarshaller ) 
		throws Exception
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
		dbf.setNamespaceAware( true );
		
		DocumentBuilder db = dbf.newDocumentBuilder( );
		Document doc = db.parse( new ByteArrayInputStream( data ) );
		
		XPathFactory xpf = XPathFactory.newInstance( );
		XPath xp = xpf.newXPath( );
		XPathExpression xpe = xp.compile( "//*[local-name()='Body']/*" );
		
		Node bodyNode = ( Node )xpe.evaluate( doc, XPathConstants.NODE );
				
		byte[ ] appliedDoc = serialize( bodyNode );
		XStringMarshallableClass appDoc = new XStringMarshallableClass( );
		appDoc.setByteArray( appliedDoc );
		appDoc.setEncoding( "UTF-8" );

		Node parent = bodyNode.getParentNode( );
		parent.removeChild( bodyNode );
		
		byte[ ] dataWoBody = serialize( doc );
		
		ByteArrayInputStream bais = new ByteArrayInputStream( dataWoBody );
		StreamSource strS = new StreamSource( bais );
		
		EnvelopeType envelope = ( EnvelopeType )unmarshaller.unmarshal( strS );
		_wasCompressed = false;
		
		List< Object > bodyAnys = new ArrayList< Object >( );
		bodyAnys.add( appDoc );
		
		BodyType body = new BodyType( );
		body.setAnyList( bodyAnys );
		
		envelope.setBody( body );
		
		return envelope;
	}	
	
	public Object unmarshallBaseDocOrSignature( byte[ ] data, Unmarshaller unmarshallerEnvelope )
		throws Exception
	{
		ByteArrayInputStream bais = new ByteArrayInputStream( data );
		StreamSource strS = new StreamSource( bais );
		Object obj = unmarshallerEnvelope.unmarshal( strS );
		
		return obj;
	}

	public byte[ ] decompress( byte[ ] data )
		throws IOException
	{
		byte[ ] buffer = new byte[ 2048 ];
		
		InputStream bais = new ByteArrayInputStream( data );
		ZipInputStream zip = new ZipInputStream( bais );
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream( );
		
		if ( zip.getNextEntry( ) != null )
		{
			while ( zip.available( ) > 0 )
			{
				int len = zip.read( buffer, 0, buffer.length );
				if ( len > 0 )
					baos.write( buffer, 0, len );
			}
		}
		
		return baos.toByteArray( );
	}
	
	private byte[ ] serialize( Node node ) 
		throws TransformerException
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream( );

		Transformer t = TransformerFactory.newInstance( ).newTransformer( );
		t.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "yes" );
		t.setOutputProperty( OutputKeys.INDENT, "no" );
		t.transform( new DOMSource( node ), new StreamResult( baos ) );
		
		return baos.toByteArray( );
	}		
	
}
