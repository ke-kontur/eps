package ru.acs.fts.aud.router.processing.marshalling;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

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

import org.jibx.runtime.JiBXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.jibx.JibxUnmarshallingFailureException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ru.acs.fts.aud.router.processing.AudConfigurator;
import ru.acs.fts.aud.router.processing.definitions.DocumentModeIDs;
import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.engine.processing.helpers.MarshallingHelper;
import ru.acs.fts.schemas.aud.aud_putdocumentrequest.AUDPutDocumentRequestType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.SignatureType;

public class ConditionalUnmarshaller
{
	private static final Logger log = LoggerFactory.getLogger( ConditionalUnmarshaller.class );
	
	private Unmarshaller _unmarshaller;
	
	// @formatter:off
	@Required public void setUnmarshaller( Unmarshaller unmarshaller ) { _unmarshaller = unmarshaller; }
	public Unmarshaller getUnmarshaller( ) { return _unmarshaller; }
	// @formatter:on
	
	public EnvelopeType unmarshall( byte[ ] message )
		throws Exception
	{
		try
		{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
			dbf.setNamespaceAware( true );
			
			DocumentBuilder db = dbf.newDocumentBuilder( );
			Document doc = db.parse( new ByteArrayInputStream( message ) );
			
			XPathFactory xpf = XPathFactory.newInstance( );
			XPath xp = xpf.newXPath( );
			XPathExpression xpe = xp.compile( "//*[local-name()='AUD_PutDocumentRequest']" );
			
			Node putDocReq = ( Node )xpe.evaluate( doc, XPathConstants.NODE );
			if ( null == putDocReq )
				return unmarshallGeneric( message );
			
			NamedNodeMap attrs = putDocReq.getAttributes( );
			for ( int i = 0; i < attrs.getLength( ); ++i )
			{
				Node attr = attrs.item( i );
				if ( attr.getLocalName( ).equalsIgnoreCase( "DocumentModeID" ) )
				{
					if ( attr.getNodeValue( ).equalsIgnoreCase( DocumentModeIDs.AUD_PUT_DOCUMENT_REQUEST ) )
					{
						return unmarshallAudPutDocReq( doc, putDocReq, xp );
					}
				}
			}
			
			return unmarshallGeneric( message );
		}
		catch ( Exception exc )
		{
			log.error( "Ошибка", exc );
			throw exc;
		}
	}
	
	private EnvelopeType unmarshallGeneric( byte[ ] message ) 
		throws Exception
	{
		try
		{
			EnvelopeUnmarshaller unmarshaller = new EnvelopeUnmarshaller( );
			return unmarshaller.unmarshall( message, _unmarshaller );
		}
		catch ( JiBXException exc )
		{
			log.debug( "У анмашраллера не получилось :(", exc );
			throw exc;
		}
		catch ( JibxUnmarshallingFailureException exc )
		{
			log.debug( "У анмашраллера не получилось :(", exc );
			throw exc;
		}
		catch ( Exception exc )
		{
			log.debug( "Странная ошибка...", exc );
			throw exc;
		}
	}
	
	private EnvelopeType unmarshallAudPutDocReq( Document doc, Node putDocReq, XPath xp )
		throws Exception
	{
		try
		{
			XPathExpression xpe = xp.compile( "//*[local-name()='AUD_PutDocumentRequest']/*[local-name()='AppliedDocumentWithBody']/*[local-name()='DocumentBody']/*" );
			Node docBody = ( Node )xpe.evaluate( doc, XPathConstants.NODE );
			if ( docBody.getLocalName( ).equalsIgnoreCase( "Signature" ) )
			{
				xpe = xp.compile( "//*[local-name()='AUD_PutDocumentRequest']/*[local-name()='AppliedDocumentWithBody']/*[local-name()='DocumentBody']/*[local-name()='Signature']/*[local-name()='Object']/*" );
				docBody = ( Node )xpe.evaluate( doc, XPathConstants.NODE );
			}
			
			byte[ ] appliedDoc = serialize( docBody );
			XStringMarshallableClass appDoc = new XStringMarshallableClass( );
			appDoc.setByteArray( appliedDoc );
			appDoc.setEncoding( AudConfigurator.WORKING_ENCODING );
									
			Node parent = docBody.getParentNode( );
			parent.removeChild( docBody );
			
			byte[ ] message = serialize( doc );
			
			EnvelopeUnmarshaller envUnmarshaller  = new EnvelopeUnmarshaller( );
			EnvelopeType env = envUnmarshaller.unmarshall( message, _unmarshaller );

			Object audObj = env.getBody( ).getAnyList( ).get( 0 );
			if ( audObj instanceof SignatureType )
			{
				SignatureType sig = ( SignatureType )audObj;
				audObj = sig.getObject( ).getAny( );
			}
			AUDPutDocumentRequestType audPutDocReq = ( AUDPutDocumentRequestType )audObj;
			
			Object any = audPutDocReq.getAppliedDocumentWithBody( ).getDocumentBody( ).getAny( );
			if ( null == any )
				audPutDocReq.getAppliedDocumentWithBody( ).getDocumentBody( ).setAny( appDoc );
			else if ( any instanceof SignatureType )
			{
				SignatureType sig = ( SignatureType )any;								
				sig.getObject( ).setAny( appDoc );
			}
			
			return env;
		}
		catch ( JiBXException exc )
		{
			log.debug( "У анмашраллера не получилось :(", exc );
			throw exc;
		}
		catch ( JibxUnmarshallingFailureException exc )
		{
			log.debug( "У анмашраллера не получилось :(", exc );
			throw exc;
		}
		catch ( Exception exc )
		{
			log.debug( "Странная ошибка...", exc );
			throw exc;
		}
	}
	
	private byte[ ] serialize( Node node ) 
		throws TransformerException
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream( );
		try 
		{
			Transformer t = TransformerFactory.newInstance( ).newTransformer( );
			t.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "yes" );
			t.setOutputProperty( OutputKeys.INDENT, "no" );
			t.transform( new DOMSource( node ), new StreamResult( baos ) );
		} 
		catch ( TransformerException te ) 
		{
			log.error( "Ошибка трансформации", te );
			throw te;
		}
		
		return baos.toByteArray( );
	}		
	
	// Для всех
	
	public String removeObjectFromSignature( String signature ) // NO_UCD (unused code)
		throws Exception
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
		dbf.setNamespaceAware( true );
		
		DocumentBuilder db = dbf.newDocumentBuilder( );
		org.w3c.dom.Document doc = db.parse( new ByteArrayInputStream( signature.getBytes( AudConfigurator.WORKING_ENCODING ) ) );
		
		XPathFactory xpf = XPathFactory.newInstance( );
		XPath xp = xpf.newXPath( );
		XPathExpression xpe = xp.compile( "//*[local-name()='Object']" );
		
		Node objectNode = ( Node )xpe.evaluate( doc, XPathConstants.NODE );
		if ( null == objectNode )
			return signature;
		
		while ( objectNode.hasChildNodes( ) )
			objectNode.removeChild( objectNode.getChildNodes( ).item( 0 ) );
		
		return new String( serialize( doc ), AudConfigurator.WORKING_ENCODING );
	}	
	
	public static class ContainerDocument
	{
		public SignatureType signature;
		public XStringMarshallableClass document;
	}
	
	public List< ContainerDocument > extractDocuments( XStringMarshallableClass container ) 
		throws Exception
	{
		try
		{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
			dbf.setNamespaceAware( true );
			
			DocumentBuilder db = dbf.newDocumentBuilder( );
			Document doc = db.parse( new ByteArrayInputStream( container.getByteArray( ) ) );
			
			XPathFactory xpf = XPathFactory.newInstance( );
			XPath xp = xpf.newXPath( );
			XPathExpression xpe = xp.compile( "//*[local-name()='ContainerDoc']/*[local-name()='DocBody']/*" );
			XPathExpression xpeObj = xp.compile( "//*[local-name( )='Object']/*" );
			
			NodeList containerDocuments = ( NodeList )xpe.evaluate( doc, XPathConstants.NODESET );
			if ( null == containerDocuments )
				return new ArrayList< ContainerDocument >( );
			
			List< ContainerDocument > res = new ArrayList< ContainerDocument >( );
			EnvelopeUnmarshaller envUnmarshaller = new EnvelopeUnmarshaller( );
			Unmarshaller unmarshaller = MarshallingHelper.getSharedUnmarshaller( );
			
			for ( int i = 0; i < containerDocuments.getLength( ); ++i )
			{
				Node containerDoc = containerDocuments.item( i );
				if ( ! ( containerDoc instanceof Element ) )
					continue;
				
				if ( containerDoc.getLocalName( ).equalsIgnoreCase( "Signature" ) )
				{
					Node docBody = ( Node )xpeObj.evaluate( containerDoc, XPathConstants.NODE );
					if ( null == docBody )
						continue;
					
					ContainerDocument cdoc = new ContainerDocument( );
					
					cdoc.document = new XStringMarshallableClass( );
					cdoc.document.setByteArray( serialize( docBody ) );
					cdoc.document.setEncoding( AudConfigurator.WORKING_ENCODING );
					
					docBody.getParentNode( ).removeChild( docBody );
					
					cdoc.signature = ( SignatureType )envUnmarshaller.unmarshallBaseDocOrSignature( serialize( containerDoc ), unmarshaller );					
					cdoc.signature.getObject( ).setAny( cdoc.document );
					
					res.add( cdoc );
				}
				else
				{			
					boolean isFound = false;
					NamedNodeMap attrs = containerDoc.getAttributes( );
					for ( int j = 0; j < attrs.getLength( ); ++j )
					{
						Node attr = attrs.item( i );
						if ( attr.getLocalName( ).equalsIgnoreCase( "DocumentModeID" ) )
						{
							isFound = true;
							break;
						}
					}				
					
					if ( ! isFound )
						continue;
					
					ContainerDocument cdoc = new ContainerDocument( );
					cdoc.document = new XStringMarshallableClass( );
					cdoc.document.setByteArray( serialize( containerDoc ) );
					cdoc.document.setEncoding( AudConfigurator.WORKING_ENCODING );
					cdoc.signature = null;
					
					res.add( cdoc );
				}
			}

			return res;
		}
		catch ( Exception exc )
		{
			log.error( "Ошибка", exc );
			throw exc;
		}		
	}
}
