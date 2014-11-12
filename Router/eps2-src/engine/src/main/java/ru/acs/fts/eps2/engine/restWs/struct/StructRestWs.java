package ru.acs.fts.eps2.engine.restWs.struct;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.oxm.Marshaller;
import org.springframework.web.client.RestTemplate;

import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.error.Errors;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.restWs.shared.serviceModel.DocumentCheckResult;
import ru.acs.fts.eps2.engine.restWs.shared.serviceModel.DocumentToCheck;
import ru.acs.fts.eps2.engine.restWs.shared.serviceModel.ResultInformation;
import ru.acs.fts.eps2.engine.restWs.struct.requests.DocumentValidationRequest;
import ru.acs.fts.eps2.engine.restWs.struct.responses.DocumentValidationResponse;
import ru.acs.fts.eps2.engine.restWs.struct.responses.StructErrorResponse;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.Base64Coder;

public class StructRestWs
{
	private static final Logger log = LoggerFactory.getLogger( StructRestWs.class );
	
	private static final String DOCUMENT_VALIDATE_ENDPOINT = "document/%s/validate";
	
	private List< String > _restStructSrvUrls;
	private Marshaller _marshaller;
	private Errors _errors;
	
	private RestTemplate _restTemplate;
	
	// @formatter:off
	@Required public void setMarshaller( Marshaller marshaller ) { _marshaller = marshaller; }
	public Marshaller getMarshaller( ) { return _marshaller; }
	
	@Required public void setErrors( Errors errors ) { _errors = errors; }
	public Errors getErrors( ) { return _errors; }
	// @formatter:on
	
	public StructRestWs( )
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
	public void setRestStructSrvUrl( String restStructSrvUrl ) 
	{ 
		String[ ] parts = restStructSrvUrl.split( "," );
		
		_restStructSrvUrls = new ArrayList< String >( );
		for ( int i = 0; i < parts.length; ++i )
			_restStructSrvUrls.add( parts[ i ] );
	}
	
	public String getRestStructSrvUrl( ) 
	{ 
		StringBuilder b = new StringBuilder( );
		
		for ( int i = 0; i < _restStructSrvUrls.size( ); ++i )
		{
			if ( 0 != i )
				b.append( "," );
			b.append( _restStructSrvUrls.get( i ) );
		}
		
		return b.toString( );
	}
	
	public void validate( Object document, Envelope env )
		throws BaseProcessingException, DatabaseException
	{
		DocumentToCheck doc2check = env.getDocumentToCheck( );
		
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
				_errors.throwStructControlException( 
						env.getDocument( ), 
						"Не удалось провести маршаллинг документа при вызове REST Web-сервиса структурного контроля.", 
						ResultCodes._01_00070_01 );
			}
		}

		try
		{
			String base64 = Base64Coder.encodeAsString( bytes, Configurator.WORKING_ENCODING );
			doc2check.setDocument( base64 );
		}
		catch ( Exception exc )
		{
			_errors.throwStructControlException( 
					env.getDocument( ), 
					"Не удалось провести Base64 кодирование документа при вызове REST Web-сервиса структурного контроля.", 
					ResultCodes._01_00070_01 );
		}
		
		
		DocumentValidationRequest request = new DocumentValidationRequest( );
		request.setDocumentToCheck( doc2check );
				
		String response = null;

		int tries = 3;
		
		Random rnd = new Random( );
		int url = rnd.nextInt( _restStructSrvUrls.size( ) );
		
		while ( true )
		{		
			try
			{
				String urlMask = String.format( "%s%s", _restStructSrvUrls.get( url ), DOCUMENT_VALIDATE_ENDPOINT );
				String requestUrl = String.format( urlMask, env.getSoftVersion( ).split( "/" )[ 0 ] );
				url = ( url + 1 ) % _restStructSrvUrls.size( );
				
				response = _restTemplate.postForObject( new URI( requestUrl ), request, String.class );
			}
			catch ( Exception exc )
			{
				tries--;
				if ( tries <= 0 )
				{
					_errors.throwStructControlException( 
							env.getDocument( ), 
							"Не удалось вызвать REST Web-сервис структурного контроля.", 
							ResultCodes._01_00070_01 );
				}
			}

			DocumentValidationResponse resp = null;
			
			ObjectMapper mapper = new ObjectMapper( );
			
			try
			{
				resp = mapper.readValue( response, DocumentValidationResponse.class );
			}
			catch ( Exception exc )
			{
				String errorMessage = "Не удалось разобрать ответ от REST Web-сервиса структурного контроля.";
				try
				{
					StructErrorResponse errorResp = mapper.readValue( response, StructErrorResponse.class );
					errorMessage = String.format( "Ошибка вызова REST Web-сервиса структурного контроля : %s", errorResp.getMessage( ) );
				}
				catch ( Exception ex )
				{
					log.info( "При маппинге ошибочного ответа от REST Web-сервиса структурного контроля произошла ошибка: {}({})", ex.getMessage( ), ex.getClass( ) );
				}
				
				tries--;
				if ( tries <= 0 )
				{
					log.info( String.format(
						"Не удалось разобрать вот это: [%s]",
						response
					) );
	
					try
					{
						log.trace( String.format(
							"Посылали на структурный контроль вот это: [%s]",
							new String( bytes, Configurator.WORKING_ENCODING )
						) );
					}
					catch ( Exception excexc )
					{
						log.error( "", excexc );
					}
					
					_errors.throwStructControlException( 
							env.getDocument( ), 
							errorMessage, 
							ResultCodes._01_00070_01 );
				}
				else
					continue;
			}
			
			/*
			 * Проверка на status респонса не производится, так как это делается выше при маппинге ответа в DocumentValidationResponse
			*/

			try
			{
				for ( DocumentCheckResult res : resp.getResults( ) )
				{
					for ( ResultInformation info : res.getInformation( ) )
					{
						if ( ! info.getCode( ).equalsIgnoreCase( ResultCodes._00_00000_00 ) )
						{
							_errors.throwStructControlException( resp, env );
						}
					}
				}
			}
			catch ( Exception exc )
			{
				if ( exc instanceof BaseProcessingException )
					throw ( BaseProcessingException )exc;
				
				tries--;
				if ( tries <= 0 )
				{
					_errors.throwGenericRestException( 
						exc, env, 
						"Документ не соответствует схеме", 
						ResultCodes._01_00071_01 
					);
				}
				else
					continue;				
			}
			
			break;
		}
	}	
}
