package ru.acs.fts.aud.wmq.router.restWs.struct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Marshaller;

import com.fasterxml.jackson.databind.ObjectMapper;

import ru.acs.fts.aud.management.utils.httpclient.HttpRequester;
import ru.acs.fts.aud.management.utils.shared.Base64Coder;
import ru.acs.fts.aud.wmq.router.restWs.shared.serviceModel.DocumentCheckResult;
import ru.acs.fts.aud.wmq.router.restWs.shared.serviceModel.DocumentToCheck;
import ru.acs.fts.aud.wmq.router.restWs.shared.serviceModel.ResultInformation;
import ru.acs.fts.aud.wmq.router.restWs.struct.requests.DocumentValidationRequest;
import ru.acs.fts.aud.wmq.router.restWs.struct.responses.DocumentValidationResponse;
import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.schemas.album.archadddocrequest.ArchAddDocRequestType;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;

public class StructRestWs
{
	private static final Logger log = LoggerFactory.getLogger( StructRestWs.class );
	
	private static final String DOCUMENT_VALIDATE_ENDPOINT = "document/%s/validate";
	
	private String _restStructSrvUrl;
	private Marshaller _marshaller;
	
	// @formatter:off
	@Required public void setRestStructSrvUrl( String restStructSrvUrl ) { _restStructSrvUrl = restStructSrvUrl; }
	public String getRestStructSrvUrl( ) { return _restStructSrvUrl; }
	
	@Required public void setMarshaller( Marshaller marshaller ) { _marshaller = marshaller; }
	public Marshaller getMarshaller( ) { return _marshaller; }
	// @formatter:on
	
	public void validate( Object document, String softVersion )
		throws Exception
	{
		DocumentToCheck doc2check = new DocumentToCheck( );
		
		doc2check.setEnvelopeId( "<EnvelopeID>:NO" );
		doc2check.setDocumentId( "<DocumentID>:NO" );
		doc2check.setProcessId( "<ProcessID>:NO" );
		
		List< String > xPath = new ArrayList< String >( );
		
		if ( document instanceof EDContainerType )
		{
			doc2check.setIsContainer( true );
			xPath.add( "//*[local-name()='ED_Container']/*[local-name()='ContainerDoc']/*[local-name()='DocBody']" );
		}
		else if ( document instanceof ArchAddDocRequestType )
		{
			doc2check.setIsContainer( true );
			xPath.add( "//*[local-name()='ArchAddDocRequest']/*[local-name()='ArchDoc']" );
		}
		else if ( document instanceof XStringMarshallableClass )
		{
			/**
			 * Мы точно не знаем что внутри, поэтому безопаснее всего проверять как контейнер
			 * по всем возможным ( известным нам ) xPath'ам
			 */
			doc2check.setIsContainer( true );
			xPath.add( "//*[local-name()='ED_Container']/*[local-name()='ContainerDoc']/*[local-name()='DocBody']" );			
			xPath.add( "//*[local-name()='ArchAddDocRequest']/*[local-name()='ArchDoc']" );
		}
		else
		{
			doc2check.setIsContainer( false );
		}
		
		doc2check.setXPath( xPath );
		
		byte[ ] bytes = null;
		
		if ( document instanceof XStringMarshallableClass )
		{
			XStringMarshallableClass xstr = ( XStringMarshallableClass )document;
			bytes = xstr.getByteArray( );
		}
		else
		{
			EnvelopeMarshaller envMarshaller = new EnvelopeMarshaller( );
			
			try
			{
				bytes = envMarshaller.marshalBaseDocOrSignature( document, _marshaller ).getByteArray( );
			}
			catch ( Exception exc )
			{
				log.error( "Не удалось провести маршаллинг документа при вызове REST Web-сервиса структурного контроля.", exc );
				throw exc;
			}
		}

		try
		{
			String base64 = Base64Coder.encodeAsString( bytes, "UTF-8" );
			doc2check.setDocument( base64 );
		}
		catch ( Exception exc )
		{
			log.error( "Не удалось провести Base64 кодирование документа при вызове REST Web-сервиса структурного контроля.", exc );
			throw exc;
		}
		
		
		DocumentValidationRequest request = new DocumentValidationRequest( );
		request.setDocumentToCheck( doc2check );
				
		ObjectMapper mapper = new ObjectMapper( );
		String data = null;
		
		try
		{
			data = mapper.writeValueAsString( request );
		}
		catch ( Exception exc )
		{
			log.error( "Не удалось преобразовать запрос в json при вызове REST Web-сервиса структурного контроля.", exc );
			throw exc;
		}
		
		Map< String, String > headers = new HashMap< String, String >( );
		headers.put( "Content-Type", "application/json; charset=utf-8" );
		
		String urlMask = String.format( "%s%s", _restStructSrvUrl, DOCUMENT_VALIDATE_ENDPOINT );
		String requestUrl = String.format( urlMask, softVersion );
		
		String response = null;
		
		try
		{
			response = HttpRequester.POST( requestUrl, data, headers );
		}
		catch ( Exception exc )
		{
			log.error( "Не удалось вызвать REST Web-сервис структурного контроля.", exc );
			throw exc;
		}
		
		DocumentValidationResponse resp = null;
		
		try
		{
			resp = mapper.readValue( response, DocumentValidationResponse.class );
		}
		catch ( Exception exc )
		{
			log.info( String.format(
				"Не удалось разобрать вот это: [%s]",
				response
			) );

			try
			{
				log.trace( String.format(
					"Посылали на структурный контроль вот это: [%s]",
					new String( bytes, "UTF-8" )
				) );
			}
			catch ( Exception excexc )
			{
				log.error( "", excexc );
			}
			
			log.error( "Не удалось разобрать ответ от REST Web-сервиса структурного контроля.", exc );
			throw exc;
		}
		
		if ( ! resp.getStatus( ).equalsIgnoreCase( "ok" ) )
		{
			log.error( "Ошибка вызова REST Web-сервиса структурного контроля. status != 'ok'" );
			throw new Exception( "Ошибка вызова REST Web-сервиса структурного контроля. status != 'ok'" );
		}
		
		for ( DocumentCheckResult res : resp.getResults( ) )
		{
			for ( ResultInformation info : res.getInformation( ) )
			{
				if ( ! info.getCode( ).equalsIgnoreCase( "00.00000.00" ) )
					throw new Exception( info.getCode( ) );
			}
		}
	}
}
