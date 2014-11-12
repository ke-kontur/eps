package ru.acs.fts.custommarshaller.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.joda.time.DateTime;
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
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.reqopenproc.ReqOpenProcType;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.BodyType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.HeaderType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( "classpath:beans-test.xml" )
public class MarshallerTests
{
	@Autowired
	@Qualifier( value = "jibx" )
	private Unmarshaller _unmarshaller;

	@Autowired
	@Qualifier( value = "jibx" )
	private Marshaller _marshaller;
	
	@Test
	public void marshallEnvelope( )
		throws Exception
	{
		EnvelopeType src = constructTestEnvelope( );
		
		EnvelopeMarshaller marsh = new EnvelopeMarshaller( );
		byte[ ] data = marsh.marshall( src, _marshaller, false );
		
		Assert.assertNotNull( data );
		
		EnvelopeUnmarshaller unmarsh = new EnvelopeUnmarshaller( );
		EnvelopeType res = unmarsh.unmarshall( data, _unmarshaller );
		
		Assert.assertTrue( compareEnvelopes( src, res ) );
		Assert.assertFalse( unmarsh.getWasCompressed( ) );
	}
	
	@Test
	public void marshallEnvelopeCompressed( )
		throws Exception
	{
		EnvelopeType src = constructTestEnvelope( );
		
		EnvelopeMarshaller marsh = new EnvelopeMarshaller( );
		byte[ ] data = marsh.marshall( src, _marshaller, true );
		
		Assert.assertNotNull( data );
		
		EnvelopeUnmarshaller unmarsh = new EnvelopeUnmarshaller( );
		EnvelopeType res = unmarsh.unmarshall( data, _unmarshaller );
		
		Assert.assertTrue( compareEnvelopes( src, res ) );
		Assert.assertTrue( unmarsh.getWasCompressed( ) );
	}
	
	@Test
	public void marshallDocOrSignature( )
		throws Exception
	{
		EnvelopeType src = constructTestEnvelope( );
		Object srcd = src.getBody( ).getAnyList( ).get( 0 );
		
		EnvelopeMarshaller marsh = new EnvelopeMarshaller( );
		byte[ ] data = marsh.marshalBaseDocOrSignature( srcd, _marshaller ).getByteArray( );
		
		Assert.assertNotNull( data );
		
		EnvelopeUnmarshaller unmarsh = new EnvelopeUnmarshaller( );
		Object resd = unmarsh.unmarshallBaseDocOrSignature( data, _unmarshaller );
		
		Assert.assertTrue( compareDocuments( srcd, resd ) );
		Assert.assertFalse( unmarsh.getWasCompressed( ) );
	}
	
	@Test
	public void marshallXString( )
		throws Exception
	{
		EnvelopeType src = constructTestEnvelope( );
		Object srcd = src.getBody( ).getAnyList( ).get( 0 );
		
		EnvelopeMarshaller marsh = new EnvelopeMarshaller( );
		XStringMarshallableClass xstr = marsh.marshalBaseDocOrSignature( srcd, _marshaller );
		
		Assert.assertNotNull( xstr );
		
		src.getBody( ).getAnyList( ).clear( );
		src.getBody( ).getAnyList( ).add( xstr );
		
		byte[ ] data = marsh.marshall( src, _marshaller, false );
		
		Assert.assertNotNull( data );
		
		EnvelopeUnmarshaller unmarsh = new EnvelopeUnmarshaller( );
		EnvelopeType res = unmarsh.unmarshall( data, _unmarshaller );
		
		src.getBody( ).getAnyList( ).clear( );
		src.getBody( ).getAnyList( ).add( srcd );
		
		Assert.assertTrue( compareEnvelopes( src, res ) );
		Assert.assertFalse( unmarsh.getWasCompressed( ) );
	}
	
	private EnvelopeType constructTestEnvelope( )
	{
		EnvelopeType env = new EnvelopeType( );
		
		HeaderType header = new HeaderType( );
		env.setHeader( header );
		
			List< Object > headerAnies = new ArrayList< Object >( );
			header.setAnyList( headerAnies );
		
			RoutingInfType rInfo = new RoutingInfType( );
			headerAnies.add( rInfo );
			
			rInfo.setEnvelopeID( UUID.randomUUID( ).toString( ) );
			rInfo.setInitialEnvelopeID( UUID.randomUUID( ).toString( ) );
			rInfo.setPreparationDateTime( new DateTime( ) );
			rInfo.setSenderInformation( "wmq://QMGR.SENDER/Q.SEND" );
			
			List< String > recvInfos = new ArrayList< String >( );
			recvInfos.add( "wmq://QMGR.RECEIVER/Q.RECEIVE" );
			rInfo.setReceiverInformationList( recvInfos );
			
			ApplicationInfType appInfo = new ApplicationInfType( );
			headerAnies.add( appInfo );
			
			appInfo.setMessageKind( "MessageKind" );
			appInfo.setSoftKind( "SoftKind" );
			appInfo.setSoftVersion( "0.0.0/0.0.0" );
			
		BodyType body = new BodyType( );
		env.setBody( body );
		
			List< Object > bodyAnies = new ArrayList< Object >( );
			body.setAnyList( bodyAnies );
			
			ReqOpenProcType rop = new ReqOpenProcType( );
			bodyAnies.add( rop );
			
			rop.setDocumentID( UUID.randomUUID( ).toString( ) );
			rop.setRefDocumentID( UUID.randomUUID( ).toString( ) );
			rop.setDocumentModeID( "1004057E" );
			
			OrganizationType decl = new OrganizationType( );
			rop.setDeclarant( decl );
			
			decl.setOrganizationName( "Тестер с русскими буквами" );
		
		return env;
	}
	
	private boolean compareEnvelopes( EnvelopeType e1, EnvelopeType e2 )
	{
		RoutingInfType ri1 = null;
		RoutingInfType ri2 = null;
		ApplicationInfType ai1 = null;
		ApplicationInfType ai2 = null;
		
		for ( Object obj : e1.getHeader( ).getAnyList( ) )
		{
			if ( obj instanceof RoutingInfType )
				ri1 = ( RoutingInfType )obj;
			else if ( obj instanceof ApplicationInfType )
				ai1 = ( ApplicationInfType )obj;
		}
		
		for ( Object obj : e2.getHeader( ).getAnyList( ) )
		{
			if ( obj instanceof RoutingInfType )
				ri2 = ( RoutingInfType )obj;
			else if ( obj instanceof ApplicationInfType )
				ai2 = ( ApplicationInfType )obj;
		}
		
		if ( null == ri1 || null == ri2 || null == ai1 || null == ai2 )
			return false;
		
		
		if ( ! ri1.getEnvelopeID( ).equals( ri2.getEnvelopeID( ) ) )
			return false;
		if ( ! ri1.getInitialEnvelopeID( ).equals( ri2.getInitialEnvelopeID( ) ) )
			return false;
		if ( ri1.getPreparationDateTime( ).getMillis( ) != ri2.getPreparationDateTime( ).getMillis( ) )
			return false;
		if ( ! ri1.getSenderInformation( ).equals( ri2.getSenderInformation( ) ) )
			return false;
		if ( ! ri1.getReceiverInformationList( ).get( 0 ).equals( ri2.getReceiverInformationList( ).get( 0 ) ) )
			return false;
		
		if ( ! ai1.getMessageKind( ).equals( ai2.getMessageKind( ) ) )
			return false;
		if ( ! ai1.getSoftKind( ).equals( ai2.getSoftKind( ) ) )
			return false;
		if ( ! ai1.getSoftVersion( ).equals( ai2.getSoftVersion( ) ) )
			return false;

		Object d1 = e1.getBody( ).getAnyList( ).get( 0 );
		Object d2 = e2.getBody( ).getAnyList( ).get( 0 );
		
		return compareDocuments( d1, d2 );
	}
	
	private boolean compareDocuments( Object d1, Object d2 )
	{
		ReqOpenProcType rop1 = null;
		ReqOpenProcType rop2 = null;
		
		if ( null == d1 || ! ( d1 instanceof ReqOpenProcType ) )
			return false;
		rop1 = ( ReqOpenProcType )d1;
		
		if ( null == d2 || ! ( d2 instanceof ReqOpenProcType ) )
			return false;
		rop2 = ( ReqOpenProcType )d2;
		
		if ( ! rop1.getDocumentID( ).equals( rop2.getDocumentID( ) ) )
			return false;
		if ( ! rop1.getRefDocumentID( ).equals( rop2.getRefDocumentID( ) ) )
			return false;
		if ( ! rop1.getDocumentModeID( ).equals( rop2.getDocumentModeID( ) ) )
			return false;
		if ( ! rop1.getDeclarant( ).getOrganizationName( ).equals( rop2.getDeclarant( ).getOrganizationName( ) ) )
			return false;

		return true;
	}
}
