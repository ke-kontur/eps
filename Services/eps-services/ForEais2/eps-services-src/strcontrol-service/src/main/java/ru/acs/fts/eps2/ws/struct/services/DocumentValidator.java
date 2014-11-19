package ru.acs.fts.eps2.ws.struct.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import ru.acs.fts.eps2.ws.model.serviceModel.shared.DocumentCheckResult;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.DocumentToCheck;
import ru.acs.fts.eps2.ws.struct.exceptions.ErrorCodeException;
import ru.acs.fts.eps2.ws.struct.exceptions.ValidateException;
import ru.acs.fts.eps2.ws.struct.helpers.MessageLocalizer;
import ru.acs.fts.eps2.ws.struct.helpers.ResultProcessor;
import ru.acs.fts.eps2.ws.struct.schema.SchemaAlbums;
import ru.acs.fts.eps2.ws.utils.helpers.DocumentProcessor;
import ru.acs.fts.eps2.ws.utils.helpers.SignatureProcessor;
import ru.acs.fts.eps2.ws.utils.helpers.StringUtils;

public class DocumentValidator
{
	public List< DocumentCheckResult > validate( String softVersion, DocumentToCheck document ) 
		throws XPathExpressionException, SAXException, IOException, ParserConfigurationException
	{
		if ( document.getIsContainer( ) )
			return validateContainer( softVersion, document );
		else
			return validateDocument( softVersion, document );
	}
	
	private List< DocumentCheckResult > validateContainer( String softVersion, DocumentToCheck document ) 
		throws SAXException, IOException, ParserConfigurationException, XPathExpressionException
	{
		List< DocumentCheckResult > results = new ArrayList< DocumentCheckResult >( );
		
		String xmlDocStr = DocumentProcessor.unpackFromBase64( document.getDocument( ) );
		Document xmlSignDoc = DocumentProcessor.parse( xmlDocStr );
		
		validate( xmlSignDoc.getDocumentElement( ), softVersion, results );
		
		Document container = SignatureProcessor.getDocumentWithoutSignature( 
			xmlSignDoc.getDocumentElement( ), 
			DocumentProcessor.getDocumentBuilder( ).newDocument( ) 
		);
		for ( String xPath : document.getXPath( ) )
		{
			List< Element > innerDocs = DocumentProcessor.getInnerDocuments( container, xPath );
			for ( Element innerDoc : innerDocs )
			{
				validate( innerDoc, softVersion, results );
			}
		}

		return results;
	}
	
	private List< DocumentCheckResult > validateDocument( String softVersion, DocumentToCheck document ) 
		throws SAXException, IOException, ParserConfigurationException, XPathExpressionException
	{
		List< DocumentCheckResult > results = new ArrayList< DocumentCheckResult >( );
		
		String xmlDocStr = DocumentProcessor.unpackFromBase64( document.getDocument( ) );
		Document xmlSignDoc = DocumentProcessor.parse( xmlDocStr );
		
		validate( xmlSignDoc.getDocumentElement( ), softVersion, results );
		
		return results;
	}
	
	private void validate( Element signDoc, String softVersion, List< DocumentCheckResult > results ) 
		throws XPathExpressionException, ParserConfigurationException
	{
		Document doc = SignatureProcessor.getDocumentWithoutSignature( signDoc, DocumentProcessor.getDocumentBuilder( ).newDocument( ) );
		String documentId = DocumentProcessor.getDocumentID( doc );
		
		String xmlns = doc.getDocumentElement( ).getNamespaceURI( );
		if ( StringUtils.isNotNullAndEmpty( xmlns ) )
		{
			try
			{
				String schemaPath = SchemaAlbums.getPathToSchemaFile( xmlns, softVersion );
				validate( doc, schemaPath );
				
				results.add( ResultProcessor.createResult( ResultProcessor.VALID_DOCUMENT, documentId ) );
			}
			catch ( ErrorCodeException ece )
			{
				results.add( ResultProcessor.createResult( ece.getErrorCode( ), documentId ) );
			}
			catch ( ValidateException ve )
			{
				results.add( ResultProcessor.createResult( ve.getErrorCode( ), documentId, ve.getValidateString( ) ) );
			}
		}
		else
		{
			results.add( ResultProcessor.createResult( ResultProcessor.XMLNS_EMPTY, documentId ) );
		}		
	}
	
	private ValidateException _failed;
	private MessageLocalizer _localizer = new MessageLocalizer( );
	
	private void validate( Document doc, String schemaPath )
		throws ValidateException
	{		
		try
		{
			_failed = null;
			
			SchemaFactory sfq = SchemaFactory.newInstance( XMLConstants.W3C_XML_SCHEMA_NS_URI );
			File schemaLocation = new File( schemaPath );
			
			Schema schema = sfq.newSchema( schemaLocation );
			Validator validator = schema.newValidator( );			
			DOMSource src = new DOMSource( doc );

			validator.setErrorHandler( new ErrorHandler( )
			{
				public void warning( SAXParseException exception ) 
					throws SAXException
				{
					/**
					 * Ничего не делаем, так как warning'и здесь нас не интересуют.
					 * Пока по крайней мере ...
					 */
				}

				public void error( SAXParseException exception ) 
					throws SAXException
				{
					if ( null == _failed )
						_failed = new ValidateException( ResultProcessor.NOT_VALID_DOC, _localizer.localize( exception.getLocalizedMessage( ) ), exception );
					
					throw exception;
				}

				public void fatalError( SAXParseException exception ) 
					throws SAXException
				{
					if ( null == _failed )
						_failed = new ValidateException( ResultProcessor.NOT_VALID_DOC, _localizer.localize( exception.getLocalizedMessage( ) ), exception );
					
					throw exception;
				}				
			} );
			
			validator.validate( src );
		}
		catch ( Exception exc )
		{
			if ( null != _failed )
				throw _failed;
			
			throw new ValidateException( ResultProcessor.FATAL, "" );
		}
	}
}
