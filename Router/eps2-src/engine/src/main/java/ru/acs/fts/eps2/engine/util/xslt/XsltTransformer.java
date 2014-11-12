package ru.acs.fts.eps2.engine.util.xslt;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.configuration.XsltStorage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class XsltTransformer
{	
	private static final Logger log = LoggerFactory.getLogger( XsltTransformer.class );
	
	private XsltStorage _storage;
	
	// @formatter:off
	@Required
	public void setStorage( XsltStorage storage ) { _storage = storage; }
	public XsltStorage getStorage( ) { return _storage; }
	// @formatter:on
	
	public static byte[ ] transform( byte[ ] xml, byte[ ] xslt ) 
		throws XsltTransformationException
	{
		return transform( new ByteArrayInputStream( xml ), new ByteArrayInputStream( xslt ) );
	}

	public static byte[ ] transform( InputStream xml, InputStream xslt )  // NO_UCD (use private)
		throws XsltTransformationException
	{
		try
		{
			Source xmlSource = new StreamSource( xml );
			Source xsltSource = new StreamSource( xslt );
			ByteArrayOutputStream out = new ByteArrayOutputStream( );
			Result result = new StreamResult( out );

			// create an instance of TransformerFactory
			TransformerFactory transFact = TransformerFactory.newInstance( );

			Transformer trans = transFact.newTransformer( xsltSource );
			trans.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "yes" );
			trans.transform( xmlSource, result );

			return out.toByteArray( );
		}
		catch ( TransformerException e )
		{
			throw new XsltTransformationException( e );
		}
	}
	
	public byte[ ] transform( InputStream dataForTransformation, String transformationType, String softVersion ) 
		throws Exception
	{
		byte[ ] xslt = _storage.getXslt( transformationType, softVersion );
		byte[ ] data = null;
		if ( null == xslt )
		{
			String message = String.format( 
					"Преобразование данных не было произведено: отсутствует xslt типа '%s' для версии '%s'", 
					transformationType, softVersion );
			
			log.info( message );
			throw new Exception( message );
		}
		
		try
		{
//			data = transform( dataForTransformation, xslt );
			data = transform( dataForTransformation, new ByteArrayInputStream( xslt ) );
		}
		catch ( XsltTransformationException ex )
		{
			String message = String.format( 
					"Данные не были преобразованны: ошибка преобразования типа '%s' для версии '%s'.", 
					transformationType, softVersion );
			
			log.info( message );
			throw new Exception( message );
		}
		
		return data;
	}
}
