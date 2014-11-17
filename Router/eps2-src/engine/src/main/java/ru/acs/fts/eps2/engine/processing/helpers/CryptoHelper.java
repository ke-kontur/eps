package ru.acs.fts.eps2.engine.processing.helpers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

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

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.objects.Document;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.restWs.crypto.CryptoRestWs;
import ru.acs.fts.eps2.model.services.ErrListService;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.album.archadddocrequest.ArchAddDocRequestType;
import ru.acs.fts.schemas.album.archdocupdate.ArchDocUpdateType;
import ru.acs.fts.schemas.album.ed_container.ContainerDocType;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.album.eps_docresponse.EPSDocResponseType;
import ru.acs.fts.schemas.envelope.SignatureType;

public class CryptoHelper
{
	// new crypto service
	private static CryptoRestWs _cryptoRestWs;
	
	// shared
	private static Marshaller _marshaller;
	private static Unmarshaller _unmarshaller;
	private static ErrListService _errListService;
	
	// @formatter:off
	public void setCryptoRestWs( CryptoRestWs cryptoRestWs ) { _cryptoRestWs = cryptoRestWs; }
	public CryptoRestWs getCryptoRestWs( ) { return _cryptoRestWs; }
	
	public void setMarshaller( Marshaller marshaller ) { _marshaller = marshaller; }
	public Marshaller getMarshaller( ) { return _marshaller; }
	
	public void setUnmarshaller( Unmarshaller unmarshaller ) { _unmarshaller = unmarshaller; }
	public Unmarshaller getUnmarshaller( ) { return _unmarshaller; }
	
	public void setErrListService( ErrListService errListService ) { _errListService = errListService; }
	public ErrListService getErrListService( ) { return _errListService; }
	// @formatter:on

	/**
	 * Открытие методы
	 * @throws ResultTypeException 
	 * @throws IOException 
	 * @throws DatabaseException 
	 */
	
	public static boolean checkSignEnvelope( Envelope envelope ) 
		throws BaseProcessingException, IOException, DatabaseException 
	{
		Object document = envelope.getDocument( ).getRawDocument( );
		if ( ! ( document instanceof SignatureType ) &&
			 ! ( document instanceof XStringMarshallableClass ) )
		{
			_cryptoRestWs.getErrors( ).throwCheckSignException( 
				envelope.getDocument( ), 
				"Подписи в конверте нет совсем!", 
				ResultCodes._01_00051_01 
			);
		}

		_cryptoRestWs.checkSignature( document, envelope );
		
		return true;
	}
	
	public static boolean checkSignDocument( SignatureType signature ) 
		throws BaseProcessingException, DatabaseException 
	{
		_cryptoRestWs.checkSignature( signature, null );
		
		return true;
	}

	public static boolean checkSignDocument( String documentContent ) 
		throws BaseProcessingException, DatabaseException
	{
		_cryptoRestWs.checkSignature( documentContent, null );
		
		return true;
	}
	
	public static Object signDocument( Object document, Envelope envelope ) 
		throws BaseProcessingException, DatabaseException
	{
		return _cryptoRestWs.sign( document, envelope );
	}
	
	public static void signEnvelope( Envelope envelope, boolean signSubDocuments ) 
		throws BaseProcessingException, DatabaseException
	{
		Object document = envelope.getDocument( ).getNakedDocument( );
		
		/**
		 * Нужно для тестирования, в будущем можем захотеть 
		 * подписывать документы внутри других документов
		 */
		if ( signSubDocuments )
			signSubDocuments( document, envelope );
		
		Object signed = signDocument( document, envelope ); 
			
		envelope.doNotUseThis_setInnerDocument_Raw( signed );
		envelope.getDocument( ).setSigned( signed );
	}

	public static void signEnvelopeInnerDocumentsExceptOuter( Envelope envelope)
			throws BaseProcessingException, DatabaseException
	{
		Object document = envelope.getDocument( ).getNakedDocument( );

		/**
		 * Нужно для тестирования, в будущем можем захотеть
		 * подписывать документы внутри других документов
		 */
		signSubDocuments( document, envelope );

		//Object signed = signDocument( document, envelope );

		//envelope.doNotUseThis_setInnerDocument_Raw( signed );
		//envelope.getDocument( ).setSigned( signed );
	}
	
	public static Document removeSignature( Envelope envelope ) 
		throws BaseProcessingException, DatabaseException
	{
		return envelope.getDocument( ).cloneWithoutSignature( );
	}
	
	public static byte[ ] stripSignature( byte[ ] doc, String encoding )
	{
		try
		{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
			dbf.setNamespaceAware( true );
			
			DocumentBuilder db = dbf.newDocumentBuilder( );
			org.w3c.dom.Document xdoc = db.parse( new ByteArrayInputStream( doc ) );
			
			XPathFactory xpf = XPathFactory.newInstance( );
			XPath xp = xpf.newXPath( );
			XPathExpression xpe = xp.compile( "//*[local-name()='Signature']/*[local-name()='Object']/*" );
			
			Node n = ( Node )xpe.evaluate( xdoc, XPathConstants.NODE );
			if ( null == n || ! ( n instanceof Element ) )
				throw new Exception( "Не найден вложенный документ" );
			
			return serialize( n );
		}
		catch ( Exception e )
		{
		}
		
		return doc;
	}	
					
	// TODO: этой функции в engine'е быть не должно, engine не в курсе про прикладные типы электрички
	private static void signSubDocuments( Object document, Envelope envelope ) 
		throws BaseProcessingException, DatabaseException
	{
		if ( document instanceof ArchAddDocRequestType )
		{
			ArchAddDocRequestType doc = ( ArchAddDocRequestType )document;
			
			Object any = doc.getArchDoc( ).getAny( );
			Object sig = signDocument( any, envelope );
			
			doc.getArchDoc( ).setAny( sig );
		}		
		else if ( document instanceof ArchDocUpdateType )
		{
			ArchDocUpdateType doc = ( ArchDocUpdateType )document;
			
			Object any = doc.getArchDoc( ).getAny( );
			Object sig = signDocument( any, envelope );
			
			doc.getArchDoc( ).setAny( sig );
		}
		else if ( document instanceof EDContainerType )
		{
			EDContainerType doc = ( EDContainerType )document;
			
			if ( null != doc.getContainerDocList( ) && doc.getContainerDocList( ).size( ) > 0 )
			{
				for ( ContainerDocType docType : doc.getContainerDocList( ) )
				{
					Object any = docType.getDocBody( ).getAny( );
					Object sig = signDocument( any, envelope );					
					docType.getDocBody( ).setAny( sig );
				}
			}
		}
		else if ( document instanceof EPSDocResponseType )
		{
			EPSDocResponseType doc = ( EPSDocResponseType )document;
			
			Object any = doc.getDocResponse( ).getDocResponseBody( ).getAny( );
			Object sig = signDocument( any, envelope );
			
			doc.getDocResponse( ).getDocResponseBody( ).setAny( sig );
		}
	}		

	private static byte[ ] serialize( Node node ) 
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
			throw te;
		}
		
		return baos.toByteArray( );
	}		
	
}
