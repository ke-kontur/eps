package ru.acs.fts.eps2.engine.restWs.crypto;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.ObjectMapper;
import org.jibx.runtime.JiBXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.jibx.JibxUnmarshallingFailureException;
import org.springframework.web.client.RestTemplate;

import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.error.Errors;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.restWs.crypto.requests.CheckSignRequest;
import ru.acs.fts.eps2.engine.restWs.crypto.requests.SignRequest;
import ru.acs.fts.eps2.engine.restWs.crypto.responses.CheckSignResponse;
import ru.acs.fts.eps2.engine.restWs.crypto.responses.CryptoErrorResponse;
import ru.acs.fts.eps2.engine.restWs.crypto.responses.SignResponse;
import ru.acs.fts.eps2.engine.restWs.crypto.serviceModel.DoSign;
import ru.acs.fts.eps2.engine.restWs.shared.serviceModel.DocumentCheckResult;
import ru.acs.fts.eps2.engine.restWs.shared.serviceModel.DocumentToCheck;
import ru.acs.fts.eps2.engine.restWs.shared.serviceModel.ResultInformation;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.Base64Coder;

public class CryptoRestWs
{
	private static final Logger log = LoggerFactory.getLogger( CryptoRestWs.class );
	
	private static final String CHECK_SIGNATURE_ENDPOINT = "check-signature";
	private static final String SIGN_ENDPOINT = "sign";
	
	private List< String > _restCryptoSrvUrls; 
	private Marshaller _marshaller;
	private Unmarshaller _unmarshaller;
	private Errors _errors;
	
	private RestTemplate _restTemplate;
	
	// @formatter:off	
	@Required public void setMarshaller( Marshaller marshaller ) { _marshaller = marshaller; }
	public Marshaller getMarshaller( ) { return _marshaller; }
	
	@Required public void setUnmarshaller( Unmarshaller unmarshaller ) { _unmarshaller = unmarshaller; }
	public Unmarshaller getUnmarshaller( ) { return _unmarshaller; }
	
	@Required public void setErrors( Errors errors ) { _errors = errors; }
	public Errors getErrors( ) { return _errors; }
	// @formatter:on
	
	public CryptoRestWs( )
	{
		HttpComponentsClientHttpRequestFactory f = new HttpComponentsClientHttpRequestFactory( );
		f.setReadTimeout( 150000 );
		
		_restTemplate = new RestTemplate( f );
		
		List< HttpMessageConverter< ? > > messageConvertes = new ArrayList< HttpMessageConverter< ? > >( );
		messageConvertes.add( new StringHttpMessageConverter( ) );
		messageConvertes.add( new MappingJacksonHttpMessageConverter( ) );
		
		_restTemplate.setMessageConverters( messageConvertes );
	}	
	
	@Required 
	public void setRestCryptoSrvUrl( String restCryptoSrvUrl ) 
	{
		String[ ] parts = restCryptoSrvUrl.split( "," );
		
		_restCryptoSrvUrls = new ArrayList< String >( );
		for ( int i = 0; i < parts.length; ++i )
			_restCryptoSrvUrls.add( parts[ i ] );
	}
	
	public String getRestCryptoSrvUrl( ) 
	{
		StringBuilder b = new StringBuilder( );
		
		for ( int i = 0; i < _restCryptoSrvUrls.size( ); ++i )
		{
			if ( 0 != i )
				b.append( "," );
			b.append( _restCryptoSrvUrls.get( i ) );
		}
		
		return b.toString( );
	}	
	
	public void checkSignature( Object document, Envelope envelope ) 
		throws BaseProcessingException, DatabaseException
	{
		DocumentToCheck doc2check;

		if ( null != envelope )
		{
			doc2check = envelope.getDocumentToCheck( );
		}
		else
		{
			doc2check = new DocumentToCheck( );
			doc2check.setEnvelopeId( "<unknown>" );
			doc2check.setDocumentId( "<unknown>" );
			doc2check.setProcessId( "<unknown>" );
			doc2check.setIsContainer( false );
			doc2check.setXPath( new ArrayList< String >( ) );
		}
		
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
				log.info( "Ошибка анмаршаллинга: Class='{}', Message='{}'", exc.getClass( ), exc.getMessage( ) );
				log.error( "", exc );
				
				_errors.throwCheckSignException( 
						envelope.getDocument( ), 
						"Не удалось провести маршаллинг документа при вызове REST Web-сервиса ЭЦП.", 
						ResultCodes._01_00050_01 );
			}
		}

		try
		{
			String base64 = Base64Coder.encodeAsString( bytes, Configurator.WORKING_ENCODING );
			doc2check.setDocument( base64 );
		}
		catch ( Exception exc )
		{
			_errors.throwCheckSignException( 
					envelope.getDocument( ), 
					"Не удалось провести Base64 кодирование документа при вызове REST Web-сервиса ЭЦП.", 
					ResultCodes._01_00050_01 );
		}
		
		CheckSignRequest request = new CheckSignRequest( );
		request.setDocument( doc2check );
				
		String response = null;

		int tries = 3;
		
		Random rnd = new Random( );
		int url = rnd.nextInt( _restCryptoSrvUrls.size( ) );
		
		while ( true )
		{
			try
			{
				String requestUrl = String.format( "%s%s", _restCryptoSrvUrls.get( url ), CHECK_SIGNATURE_ENDPOINT );
				url = ( url + 1 ) % _restCryptoSrvUrls.size( );
				
				response = _restTemplate.postForObject( new URI( requestUrl ), request, String.class );
			}
			catch ( Exception exc )
			{
				tries--;
				if ( tries <= 0 )
				{
					_errors.throwCheckSignException( 
							envelope.getDocument( ), 
							"Не удалось вызвать REST Web-сервис ЭЦП.", 
							ResultCodes._01_00050_01 );
				}
				else
					continue;
			}
			
			ObjectMapper mapper = new ObjectMapper( );
			
			CheckSignResponse resp = null;
			
			try
			{
				resp = mapper.readValue( response, CheckSignResponse.class );
			}
			catch ( Exception exc )
			{
				String errorMessage = "Не удалось разобрать ответ от REST Web-сервиса ЭЦП.";
				try
				{
					CryptoErrorResponse errorResp = mapper.readValue( response, CryptoErrorResponse.class );
					errorMessage = String.format( "Ошибка вызова REST Web-сервиса ЭЦП : %s", errorResp.getMessage( ) );
				}
				catch ( Exception ex )
				{
					log.info( "При маппинге ошибочного ответа от REST Web-сервиса ЭЦП произошла ошибка: {}({})", ex.getMessage( ), ex.getClass( ) );
				}
				
				tries--;
				if ( tries <= 0 )
				{
					_errors.throwCheckSignException( 
							envelope.getDocument( ), 
							errorMessage, 
							ResultCodes._01_00050_01 );
				}
				else
					continue;
			}	
			
			/*
			 * Проверка на status респонса не производится, так как это делается выше при маппинге ответа в CheckSignResponse
			*/
			
			try
			{
				for ( DocumentCheckResult res : resp.getResults( ) )
				{
					for ( ResultInformation info : res.getInformation( ) )
					{
						if ( ! info.getCode( ).equalsIgnoreCase( ResultCodes._00_00000_00 ) )
						{
							_errors.throwCheckSignException( resp, envelope );
						}
					}
				}
			}
			catch ( Exception exc )
			{
				if ( exc instanceof BaseProcessingException )
					throw ( BaseProcessingException )exc;
				
				log.error( ":'(", exc );
				tries--;
				if ( tries <= 0 )
				{
					_errors.throwGenericRestException( 
						exc, envelope,
						"Некорректная ЭЦП.", 
						ResultCodes._01_00051_01
					);
				}
				else
					continue;
			}
			break;			
		}
	}

	public void checkSignature( String documentContent, Envelope envelope )
		throws BaseProcessingException, DatabaseException
	{
		DocumentToCheck doc2check;
		
		String documentId = "<unknown>";
		
		if ( null != envelope )
			doc2check = envelope.getDocumentToCheck( );
		else
			doc2check = new DocumentToCheck( );
		
		doc2check.setIsContainer( false );
		doc2check.setDocumentId( documentId );
		doc2check.setXPath( new ArrayList< String >( ) );
		
		try
		{
			String base64 = Base64Coder.encodeAsString( documentContent, Configurator.WORKING_ENCODING );
			doc2check.setDocument( base64 );
		}
		catch ( Exception exc )
		{
			_errors.throwCheckSignException( 
					envelope.getDocument( ), 
					"Не удалось провести Base64 кодирование документа при вызове REST Web-сервиса ЭЦП.", 
					ResultCodes._01_00050_01 );
		}
		
		CheckSignRequest request = new CheckSignRequest( );
		request.setDocument( doc2check );
				
		String response = null;

		int tries = 3;
		
		Random rnd = new Random( );
		int url = rnd.nextInt( _restCryptoSrvUrls.size( ) );
		
		while ( true )
		{
			try
			{
				String requestUrl = String.format( "%s%s", _restCryptoSrvUrls.get( url ), CHECK_SIGNATURE_ENDPOINT );
				url = ( url + 1 ) % _restCryptoSrvUrls.size( );
				
				response = _restTemplate.postForObject( new URI( requestUrl ), request, String.class );
			}
			catch ( Exception exc )
			{
				tries--;
				if ( tries <= 0 )
				{
					_errors.throwCheckSignException( 
							envelope.getDocument( ), 
							"Не удалось вызвать REST Web-сервис ЭЦП.", 
							ResultCodes._01_00050_01 );
				}
				else
					continue;
			}
			
			ObjectMapper mapper = new ObjectMapper( );
			
			CheckSignResponse resp = null;
			
			try
			{
				resp = mapper.readValue( response, CheckSignResponse.class );
			}
			catch ( Exception exc )
			{
				String errorMessage = "Не удалось разобрать ответ от REST Web-сервиса ЭЦП.";
				try
				{
					CryptoErrorResponse errorResp = mapper.readValue( response, CryptoErrorResponse.class );
					errorMessage = String.format( "Ошибка вызова REST Web-сервиса ЭЦП : %s", errorResp.getMessage( ) );
				}
				catch ( Exception ex )
				{
					log.info( "При маппинге ошибочного ответа от REST Web-сервиса ЭЦП произошла ошибка: {}({})", ex.getMessage( ), ex.getClass( ) );
				}
				
				tries--;
				if ( tries <= 0 )
				{
					_errors.throwCheckSignException( 
							envelope.getDocument( ), 
							errorMessage, 
							ResultCodes._01_00050_01 );
				}
				else
					continue;
			}
			
			/*
			 * Проверка на status респонса не производится, так как это делается выше при маппинге ответа в CheckSignResponse
			*/
			
			try
			{
				for ( DocumentCheckResult res : resp.getResults( ) )
				{
					for ( ResultInformation info : res.getInformation( ) )
					{
						if ( ! info.getCode( ).equalsIgnoreCase( ResultCodes._00_00000_00 ) )
						{
							_errors.throwCheckSignException( resp, envelope );
						}
					}
				}
			}
			catch ( Exception exc )
			{
				tries--;
				if ( tries <= 0 )
				{
					_errors.throwGenericRestException( 
						exc, envelope,
						"Некорректная ЭЦП.", 
						ResultCodes._01_00051_01
					);
				}
				else
					continue;				
			}
			
			break;
		}		
	}
	
	public Object sign( Object document, Envelope envelope )
		throws BaseProcessingException, DatabaseException
	{
		DoSign doSign = new DoSign( );
		
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
				log.info( "Ошибка маршаллинга при подписи: Class='{}', Message='{}'", exc.getClass( ), exc.getMessage( ) );
				log.error( "", exc );
				
				_errors.throwCheckSignException( 
						envelope.getDocument( ), 
						"Не удалось провести маршаллинг документа при вызове REST Web-сервиса ЭЦП.", 
						ResultCodes._01_00050_01 );
			}
		}

		try
		{
			String base64 = Base64Coder.encodeAsString( bytes, Configurator.WORKING_ENCODING );
			doSign.setBytes( base64 );
		}
		catch ( Exception exc )
		{
			_errors.throwCheckSignException( 
					envelope.getDocument( ), 
					"Не удалось провести Base64 кодирование документа при вызове REST Web-сервиса ЭЦП.", 
					ResultCodes._01_00050_01 );
		}
		
		SignRequest request = new SignRequest( );
		request.setDoSign( doSign );
			
		String response = null;

		int tries = 3;
		
		Random rnd = new Random( );
		int url = rnd.nextInt( _restCryptoSrvUrls.size( ) );
		SignResponse signResponse = null;
		
		while ( true )
		{		
			try
			{
				String requestUrl = String.format( "%s%s", _restCryptoSrvUrls.get( url ), SIGN_ENDPOINT );
				url = ( url + 1 ) % _restCryptoSrvUrls.size( );
				
				response = _restTemplate.postForObject( new URI( requestUrl ), request, String.class );
			}
			catch ( Exception exc )
			{
				tries--;
				if ( tries <= 0 )
				{
					_errors.throwCheckSignException( 
							envelope.getDocument( ), 
							"Не удалось вызвать REST Web-сервис ЭЦП.", 
							ResultCodes._01_00050_01 );
				}
				
				continue;
			}
			
			ObjectMapper mapper = new ObjectMapper( );
			mapper.configure( Feature.FAIL_ON_UNKNOWN_PROPERTIES, false );
			
			try
			{
				signResponse = mapper.readValue( response, SignResponse.class );
			}
			catch ( Exception exc )
			{
				
				String errorMessage = "Не удалось разобрать ответ от REST Web-сервиса ЭЦП.";
				try
				{
					CryptoErrorResponse errorResp = mapper.readValue( response, CryptoErrorResponse.class );
					errorMessage = String.format( "Ошибка вызова REST Web-сервиса ЭЦП : %s", errorResp.getMessage( ) );
				}
				catch ( Exception ex )
				{
					log.info( "При маппинге ошибочного ответа от REST Web-сервиса ЭЦП произошла ошибка: {}({})", ex.getMessage( ), ex.getClass( ) );
				}
				
				tries--;
				if ( tries <= 0 )
				{
					log.info( "Ошибка при подписи конверта(ответ от сервиса): Class='{}', Message='{}'", exc.getClass( ), exc.getMessage( ) );
					log.info( "Response='{}'", response );
					_errors.throwCheckSignException( 
							envelope.getDocument( ), 
							errorMessage, 
							ResultCodes._01_00050_01 );
				}
				else
					continue;
			}
			
			/*
			 * Проверка на status респонса не производится, так как это делается выше при маппинге ответа в SignResponse
			*/
			
			break;
		}
		
		try
		{
			bytes = Base64Coder.decodeAsBytes( signResponse.getDidSign( ).getBytes( ), Configurator.WORKING_ENCODING );
		}
		catch ( Exception exc )
		{
			log.info( "Ошибка при подписи конверта(ответ от сервиса): Class='{}', Message='{}'", exc.getClass( ), exc.getMessage( ) );
			log.info( "Response='{}'", response );
			_errors.throwCheckSignException( 
					envelope.getDocument( ), 
					"Ошибка вызова REST Web-сервиса ЭЦП", 
					ResultCodes._01_00050_01 );
		}
		
		boolean unmarshallFailed = false;
		EnvelopeUnmarshaller envUnmarshaller = new EnvelopeUnmarshaller( );
		Object res = null;
		
		try
		{
			res = envUnmarshaller.unmarshallBaseDocOrSignature( bytes, _unmarshaller );
		}
		catch ( JiBXException e )
		{
			unmarshallFailed = true;
		}
		catch ( JibxUnmarshallingFailureException e )
		{
			unmarshallFailed = true;
		}
		catch ( Exception exc )
		{
			log.info( "Ошибка при подписи конверта(ответ от сервиса): Class='{}', Message='{}'", exc.getClass( ), exc.getMessage( ) );
			log.info( "Response='{}'", response );
			_errors.throwCheckSignException( 
					envelope.getDocument( ), 
					"Ошибка вызова REST Web-сервиса ЭЦП", 
					ResultCodes._01_00050_01 );
		}

		if ( unmarshallFailed )
		{
			XStringMarshallableClass xstr = new XStringMarshallableClass( );
			xstr.setByteArray( bytes );
			xstr.setEncoding( Configurator.WORKING_ENCODING );
			res = xstr;
		}
				
		return res;
	}
	
}
