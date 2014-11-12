package ru.acs.fts.custommarshaller.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.SignatureType;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( "classpath:beans-test.xml" )
public class XStringTests
{
	@Autowired
	@Qualifier( value = "jibx" )
	private Unmarshaller _unmarshaller;

	@Autowired
	@Qualifier( value = "jibx" )
	private Marshaller _marshaller;
	
	@Autowired
	@Qualifier( value = "tplBasicSig" )
	private String _tplBasicSig;
	
	@Test
	public void xstrStripSignature( )
		throws Exception
	{
		byte[ ] inputData = _tplBasicSig.getBytes( "UTF-8" );
		
		EnvelopeUnmarshaller unmarsh = new EnvelopeUnmarshaller( );
		EnvelopeType envelope = unmarsh.unmarshall( inputData, _unmarshaller );
		
		Assert.assertNotNull( envelope );
		Assert.assertFalse( unmarsh.getWasCompressed( ) );
		
		EnvelopeMarshaller marsh = new EnvelopeMarshaller( );
		byte[ ] docData = marsh.marshalBaseDocOrSignature( envelope.getBody( ).getAnyList( ).get( 0 ), _marshaller ).getByteArray( );
		
		Assert.assertNotNull( docData );
		
		XStringMarshallableClass xstr = new XStringMarshallableClass( );
		xstr.setByteArray( docData );
		xstr.setEncoding( "UTF-8" );
		
		xstr.stripSignature( );
		
		Object doc = unmarsh.unmarshallBaseDocOrSignature( xstr.getByteArray( ), _unmarshaller );
		Assert.assertFalse( doc instanceof SignatureType );
	}
}
