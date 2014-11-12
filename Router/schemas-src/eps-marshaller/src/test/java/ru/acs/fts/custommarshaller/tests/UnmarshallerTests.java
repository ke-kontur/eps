package ru.acs.fts.custommarshaller.tests;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import junit.framework.Assert;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.schemas.album.reqopenproc.ReqOpenProcType;
import ru.acs.fts.schemas.envelope.EnvelopeType;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( "classpath:beans-test.xml" )
public class UnmarshallerTests
{
	@Autowired
	@Qualifier( value = "jibx" )
	private Unmarshaller _unmarshaller;
	
	@Autowired
	@Qualifier( value = "jibx" )
	private Marshaller _marshaller;
	
	@Autowired
	@Qualifier( value = "tplBasic" )
	private String _tplBasic;
	
	@Autowired
	@Qualifier( value = "tplBasicDoc" )
	private String _tplBasicDoc;

	@Autowired
	@Qualifier( value = "tplBasicSig" )
	private String _tplBasicSig;
	
	@Autowired
	@Qualifier( value = "tplBasicCompressed" )
	private String _tplBasicCompressed;
	
	@Test
	public void unmarshallBasic( )
		throws Exception
	{
		byte[ ] inputData = _tplBasic.getBytes( "UTF-8" );
		
		EnvelopeUnmarshaller envUnm = new EnvelopeUnmarshaller( );
		EnvelopeType envelope = envUnm.unmarshall( inputData, _unmarshaller );
		
		Assert.assertNotNull( envelope );
		Assert.assertFalse( envUnm.getWasCompressed( ) );
	}

	/** 
	 * unmarshallCompressed фактически проверяется в MarshallerTests
	 */
	
	@Test
	public void unmarshallWithoutBody( )
		throws Exception
	{
		byte[ ] inputData = _tplBasic.getBytes( "UTF-8" );
		
		EnvelopeUnmarshaller envUnm = new EnvelopeUnmarshaller( );
		EnvelopeType envelope = envUnm.unmarshallWithoutBody( inputData, _unmarshaller );
		
		Assert.assertNotNull( envelope );
		Assert.assertTrue( envelope.getBody( ).getAnyList( ).get( 0 ) instanceof XStringMarshallableClass );
		Assert.assertFalse( envUnm.getWasCompressed( ) );
	}
	
	@Test
	public void unmarshallDocOrSignature( )
		throws Exception
	{
		byte[ ] inputData = _tplBasicDoc.getBytes( "UTF-8" );
		
		EnvelopeUnmarshaller envUnm = new EnvelopeUnmarshaller( );
		Object obj = envUnm.unmarshallBaseDocOrSignature( inputData, _unmarshaller );
		
		Assert.assertNotNull( obj );
		Assert.assertTrue( obj instanceof ReqOpenProcType );
	}
	
	@Test
	public void remarshallSignature( )
		throws Exception
	{
		byte[ ] inputData = _tplBasicSig.getBytes( "UTF-8" );
		
		EnvelopeUnmarshaller unmarsh = new EnvelopeUnmarshaller( );
		EnvelopeType envelope = unmarsh.unmarshall( inputData, _unmarshaller );
		
		Assert.assertNotNull( envelope );
		Assert.assertFalse( unmarsh.getWasCompressed( ) );
		
		EnvelopeMarshaller marsh = new EnvelopeMarshaller( );
		byte[ ] outData = marsh.marshall( envelope, _marshaller, false );
		
		String outString = new String( outData, "UTF-8" );
		
		Assert.assertTrue( compareXmls( _tplBasicSig, outString ) );
	}
	
	@Test
	public void remarshallCompressed( )
		throws Exception
	{
		byte[ ] inputData = _tplBasicCompressed.getBytes( "UTF-8" );
		
		EnvelopeUnmarshaller unmarsh = new EnvelopeUnmarshaller( );
		EnvelopeType envelope = unmarsh.unmarshall( inputData, _unmarshaller );
		
		Assert.assertNotNull( envelope );
		Assert.assertTrue( unmarsh.getWasCompressed( ) );
		
		EnvelopeMarshaller marsh = new EnvelopeMarshaller( );
		byte[ ] outData = marsh.marshall( envelope, _marshaller, true );
		
		String outString = new String( outData, "UTF-8" );
		
		Assert.assertTrue( compareCompressed( _tplBasicCompressed, outString ) );
	}
	
	private boolean compareXmls( String first, String second )
		throws Exception
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
		dbf.setNamespaceAware( true );
		dbf.setCoalescing( true );
		dbf.setIgnoringElementContentWhitespace( true );
		dbf.setIgnoringComments( true );
		
		DocumentBuilder db = dbf.newDocumentBuilder( );

		ByteArrayInputStream bais1 = new ByteArrayInputStream( first.getBytes( "UTF-8" ) );
		ByteArrayInputStream bais2 = new ByteArrayInputStream( second.getBytes( "UTF-8" ) );
		
		Document doc1 = db.parse( bais1 );
		doc1.normalizeDocument( );

		Document doc2 = db.parse( bais2 );
		doc2.normalizeDocument( );

		return doc1.isEqualNode( doc2 );
	}
	
	private boolean compareCompressed( String first, String second )
		throws Exception
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
		dbf.setNamespaceAware( true );
		dbf.setCoalescing( true );
		dbf.setIgnoringElementContentWhitespace( true );
		dbf.setIgnoringComments( true );
		
		DocumentBuilder db = dbf.newDocumentBuilder( );

		ByteArrayInputStream bais1 = new ByteArrayInputStream( first.getBytes( "UTF-8" ) );
		ByteArrayInputStream bais2 = new ByteArrayInputStream( second.getBytes( "UTF-8" ) );
		
		Document doc1 = db.parse( bais1 );
		doc1.normalizeDocument( );

		Document doc2 = db.parse( bais2 );
		doc2.normalizeDocument( );
		
		XPathFactory xpf = XPathFactory.newInstance( );
		XPath xp = xpf.newXPath( );
		XPathExpression xpe = xp.compile( "//*[local-name()='Compressed']/text()" );
		
		Node nd1 = ( Node )xpe.evaluate( doc1, XPathConstants.NODE );
		if ( null == nd1 )
			return false;
		
		Node nd2 = ( Node )xpe.evaluate( doc2, XPathConstants.NODE );
		if ( null == nd2 )
			return false;
		
		String base64_1 = nd1.getTextContent( );
		String base64_2 = nd2.getTextContent( );
		
		EnvelopeUnmarshaller unmarsh = new EnvelopeUnmarshaller( );
		
		String xml1 = new String( unmarsh.decompress( Base64.decodeBase64( base64_1 ) ), "UTF-8" );
		String xml2 = new String( unmarsh.decompress( Base64.decodeBase64( base64_2 ) ), "UTF-8" );

		return compareXmls( xml1, xml2 );
	}
	
}
