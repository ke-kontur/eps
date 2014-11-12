package ru.acs.fts.aud.router.processing.helpers;

import java.io.ByteArrayInputStream;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ru.acs.fts.aud.router.objects.AudDocument;
import ru.acs.fts.aud.router.processing.definitions.ErrorMessageSourceKeys;
import ru.acs.fts.aud.router.processing.exceptions.ArchiveException;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class XPathChecker
{
	private static final Logger log = LoggerFactory.getLogger( XPathChecker.class );
	
	// @formatter:off
	private XPathChecker( ) { }
	// @formatter:on
	
	public static void xPathCheck(
			Object document, String xPath, ArchiveException exc, String documentId,
			Object[ ] attributeParams, List< Object > xPathValues )
		throws BaseProcessingException, DatabaseException
	{
		if ( null == document )
			return ;
		
		if ( xPath.startsWith( "/*[" ) )
			xPath = "/" + xPath;
		
		log.info( String.format(
			"DocumentID: %s, Проверяем xPath выражение '%s' на документе типа '%s'.",
			documentId, xPath, document.getClass( ).getName( )
		) );
		
		AudDocument tmp = new AudDocument( document );
		Object nakedObj = tmp.getNakedDocument( );
		
		if ( ! ( nakedObj instanceof XStringMarshallableClass ) )
		{
			log.info( String.format(
				"DocumentID: %s, Документ не является XStringMarshallableClass, поэтому проверить его по xPath'ам мы не можем.",
				documentId
			) );
			return ;
		}
		
		XStringMarshallableClass xstr = ( XStringMarshallableClass )nakedObj;

		try
		{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
			DocumentBuilder db = dbf.newDocumentBuilder( );
			Document doc = db.parse( new ByteArrayInputStream( xstr.getByteArray( ) ) );
			
			XPathFactory xpf = XPathFactory.newInstance( );
			XPath xp = xpf.newXPath( );
			XPathExpression xpe = xp.compile( xPath );
			
			NodeList ns = ( NodeList )xpe.evaluate( doc, XPathConstants.NODESET );
			
			for ( int i = 0; i < ns.getLength( ); ++i )
			{
				Node n = ns.item( i );
				if ( null == n )
					continue;
				
				String value = n.getNodeValue( );
				String value2 = n.getTextContent( );
				if ( null == value && null == value2 )
					continue;
				
				if ( null != value )
					xPathValues.add( value );
				else if ( null != value2 )
					xPathValues.add( value2 );
			}
		}
		catch ( Throwable t )
		{
			exc.addDocumentError( documentId, ErrorMessageSourceKeys.ERROR_ARCHIVE_1007, attributeParams );
		}
	}
}
