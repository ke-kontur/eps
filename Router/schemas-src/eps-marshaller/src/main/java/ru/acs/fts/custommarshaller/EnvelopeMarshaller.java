package ru.acs.fts.custommarshaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.codec.binary.Base64;
import org.jibx.runtime.JiBXException;
import org.springframework.oxm.Marshaller;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ru.acs.fts.schemas.envelope.*;

public class EnvelopeMarshaller
{
	private String encoding = "UTF-8";
	
	public void setEncoding( String encoding ) { this.encoding = encoding; }
	public String getEncoding( ) { return encoding; }
	
	private XStringMarshallableClass marshallDoc( Object obj, Marshaller marshaller )
		throws IOException,JiBXException
	{
		XStringMarshallableClass sms = new XStringMarshallableClass( );
		sms.setByteArray( omitXmlDeclaration( marshallObj( obj, marshaller ) ) );
		sms.setEncoding( encoding );
		return sms;
	}

	private byte[ ] marshallObj( Object obj, Marshaller marshaller )
		throws IOException, JiBXException
	{
		ByteArrayOutputStream bas2 = new ByteArrayOutputStream( );
		StreamResult sr2 = new StreamResult( bas2 );
		marshaller.marshal( obj, sr2 );
		bas2.flush( );
		
		// return fixSignatureBase64( bas2.toByteArray( ) );
		return bas2.toByteArray( );
	}

	public byte[ ] marshall( EnvelopeType envType, Marshaller marshaller, Boolean compressed ) 
		throws IOException
	{
        try {
            /** Если не надо сжимать, то просто маршаллим */
            if (!compressed)
                return marshallObj(envType, marshaller);

            Object doc = envType.getBody().getAnyList().get(0);

            /** Если документ уже сжать, то тоже просто маршаллим */
            if (doc instanceof Compressed)
                return marshallObj(envType, marshaller);

            XStringMarshallableClass marsh = marshalBaseDocOrSignature(doc, marshaller);

            Compressed compr = new Compressed();
            compr.setCompressed(Base64.encodeBase64String(compress(marsh.getByteArray())));
            envType.getBody().getAnyList().set(0, compr);

            byte[] res = marshallObj(envType, marshaller);

            envType.getBody().getAnyList().set(0, doc);

            return res;
        }
        catch (JiBXException exception){
            throw new RuntimeException(exception);
        }
	}

	public XStringMarshallableClass marshalBaseDocOrSignature( Object data, Marshaller marshaller ) 
		throws IOException,JiBXException
	{
		if ( data instanceof XStringMarshallableClass )
			return ( XStringMarshallableClass )data;
				
		return marshallDoc( data, marshaller );
	}

	public static byte[ ] compress( byte[ ] data ) throws IOException
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream( );
		ZipOutputStream zip = new ZipOutputStream( baos );
		
		zip.putNextEntry( new ZipEntry( "1" ) );
		zip.write( data );
		zip.closeEntry( );
		zip.close( );
		
		return baos.toByteArray( );
	}

	private byte[ ] fixSignatureBase64( byte[ ] data )
	{
		try
		{
			String test = new String( data, "UTF-8" );
			if ( ! test.contains( "Signature" ) )
				return data;
		}
		catch ( Exception exc )
		{
			// do nothing
		}

		try
		{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
			dbf.setNamespaceAware( true );
			
			DocumentBuilder db = dbf.newDocumentBuilder( );
			Document doc = db.parse( new ByteArrayInputStream( data ) );
			
			XPathFactory xpf = XPathFactory.newInstance( );
			XPath xp = xpf.newXPath( );
			XPathExpression xpe = xp.compile( "//*[local-name()='SignatureValue']" );
			
			NodeList nodes = ( NodeList )xpe.evaluate( doc, XPathConstants.NODESET );
			for ( int i = 0; i < nodes.getLength( ); ++i )
			{
				Node node = nodes.item( i );
				String base64 = node.getTextContent( );
				base64 = base64.replace( "\r", "" );
				base64 = base64.replace( "\n", "" );
				node.setTextContent( base64 );
			}
			
			xpe = xp.compile( "//*[local-name( )='X509Certificate']" );
			
			nodes = ( NodeList )xpe.evaluate( doc, XPathConstants.NODESET );
			for ( int i = 0; i < nodes.getLength( ); ++i )
			{
				Node node = nodes.item( i );
				String base64 = node.getTextContent( );
				base64 = base64.replace( "\r", "" );
				base64 = base64.replace( "\n", "" );
				node.setTextContent( base64 );
			}
			
			return serialize( doc, false );
		}
		catch ( Exception exc )
		{
			// do nothing
		}
		
		return data;
	}

	private byte[ ] omitXmlDeclaration( byte[ ] data )
	{
		try
		{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
			dbf.setNamespaceAware( true );
			
			DocumentBuilder db = dbf.newDocumentBuilder( );
			Document doc = db.parse( new ByteArrayInputStream( data ) );
			
			return serialize( doc, true );
		}
		catch ( Exception exc )
		{
			// do nothing
		}
		
		return data;
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
