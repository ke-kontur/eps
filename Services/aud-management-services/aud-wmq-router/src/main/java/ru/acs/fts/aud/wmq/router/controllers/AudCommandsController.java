package ru.acs.fts.aud.wmq.router.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ru.acs.fts.aud.management.utils.exceptions.ErrorHelper;
import ru.acs.fts.aud.management.utils.shared.GenericUtils;
import ru.acs.fts.aud.rest.service.model.objects.AudCommand;
import ru.acs.fts.aud.rest.service.model.objects.AudMessage;
import ru.acs.fts.aud.rest.service.model.objects.AudRegistryRequest;
import ru.acs.fts.aud.rest.service.model.requests.AudCommandRequest;
import ru.acs.fts.aud.rest.service.model.requests.AudRegistryRequestRequest;
import ru.acs.fts.aud.rest.service.model.responses.AudMessageResponse;
import ru.acs.fts.aud.rest.service.model.responses.ErrorResponse;
import ru.acs.fts.aud.rest.service.model.responses.Response;
import ru.acs.fts.aud.wmq.router.constructors.MessageConstructor;
import ru.acs.fts.aud.wmq.router.mappers.AudMessageMapper;
import ru.acs.fts.aud.wmq.router.restWs.crypto.CryptoRestWs;
import ru.acs.fts.aud.wmq.router.transport.out.AudMessageSender;
import ru.acs.fts.schemas.aud.aud_putdocumentrequest.AUDPutDocumentRequestType;
import ru.acs.fts.schemas.aud.aud_registryrequest.AUDRegistryRequestType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

@Controller
@RequestMapping( "/aud/commands" )
public class AudCommandsController
{
	private static final Logger log = LoggerFactory.getLogger( AudCommandsController.class );
	
	@Autowired
	@Qualifier( "messageConstructor" )
	private MessageConstructor _messageConstructor;
	
	@Autowired
	@Qualifier( "audMessageSender" )
	private AudMessageSender _audMessageSender;
	
	@Autowired
	@Qualifier( "cryptoRestWs" )
	private CryptoRestWs _cryptoRestWs;
	
	@RequestMapping( value = "/route", method = RequestMethod.POST )
	public @ResponseBody Response routeAudCommand( @RequestBody AudCommandRequest request )
	{
		try
		{
			AudCommand cmd = request.getAudCommand( );
			
			cmd.getProcInfo( ).setGtdRegistrationDate( GenericUtils.ensureTimeZone( cmd.getProcInfo( ).getGtdRegistrationDate( ) ) );
			
			log.info( String.format(
				"Получили запрос на отправку в АЮД команды %d", cmd.getRecId( )
			) );
			
			AUDPutDocumentRequestType document = _messageConstructor.constructRequestDocument( cmd );
			
			log.info( String.format(
				"Преобразовали запрос в документ АЮД для команды %d", cmd.getRecId( )
			) );
			
			List< byte[ ] > bytes = new ArrayList< byte[ ] >( );
			Object signedDocument = _cryptoRestWs.sign( document, bytes );
			
			log.info( String.format(
				"Подписали документ для АЮД для команды %d", cmd.getRecId( )	
			) );
			
			EnvelopeType envelope = _messageConstructor.constructEnvelope( signedDocument, cmd );
			
			log.info( String.format(
				"Успешно создали конверт %s для отправки команды %d", getEnvelopeId( envelope ), cmd.getRecId( )
			) );
			
			AudMessage msg = AudMessageMapper.mapSentAudMessage( document, bytes.get( 0 ), envelope );
			
			log.info( String.format(
				"Создали ответное сообщение вызывающей стороне для команды %d", cmd.getRecId( )
			) );
			
			_audMessageSender.sendToAud( envelope );
			
			AudMessageResponse response = new AudMessageResponse( );
			response.setAudMessage( msg );
			
			return response;
		}
		catch ( Exception exc )
		{
			ErrorResponse response = new ErrorResponse( );
			response.setStatus( ErrorResponse.FAIL_STATUS );
			response.setMessage( ErrorHelper.getExceptionDataString( exc ) );
			response.setErrorCode( ErrorResponse.ERROR_CODE_GENERIC );
			
			return response;
		}
	}
	
	@RequestMapping( value = "/registry", method = RequestMethod.POST )
	public @ResponseBody Response registryRequest( @RequestBody AudRegistryRequestRequest request )
	{
		try
		{
			AudRegistryRequest audrr = request.getAudRegistryRequest( );
						
			log.info( String.format(
				"Получили запрос на отправку в АЮД команды запрос реестра, дата запроса %s", 
				audrr.getDocDateTime( ).toString( )
			) );
			
			AUDRegistryRequestType document = _messageConstructor.constructRegistryRequest( audrr );
			
			log.info( String.format(
				"Преобразовали запрос в документ АЮД для команды запроса реестра, дата запроса %s", 
				audrr.getDocDateTime( ).toString( )
			) );
			
			List< byte[ ] > bytes = new ArrayList< byte[ ] >( );
			Object signedDocument = _cryptoRestWs.sign( document, bytes );
			
			log.info( String.format(
				"Подписали документ для АЮД для запроса реестра, дата запроса %s", 
				audrr.getDocDateTime( ).toString( )	
			) );
			
			EnvelopeType envelope = _messageConstructor.constructEnvelope( signedDocument );
			
			log.info( String.format(
				"Успешно создали конверт %s для отправки запроса реестра, дата запроса %s", 
				getEnvelopeId( envelope ), 
				audrr.getDocDateTime( ).toString( )
			) );
			
			AudMessage msg = AudMessageMapper.mapSentAudMessage( document, bytes.get( 0 ), envelope );
			
			log.info( String.format(
				"Создали ответное сообщение вызывающей стороне для запроса реестра, дата запроса %s", 
				audrr.getDocDateTime( ).toString( )
			) );
			
			_audMessageSender.sendToAud( envelope );
			
			AudMessageResponse response = new AudMessageResponse( );
			response.setAudMessage( msg );
			
			return response;			
		}
		catch ( Exception exc )
		{
			ErrorResponse response = new ErrorResponse( );
			response.setStatus( ErrorResponse.FAIL_STATUS );
			response.setMessage( ErrorHelper.getExceptionDataString( exc ) );
			response.setErrorCode( ErrorResponse.ERROR_CODE_GENERIC );
			
			return response;
		}
	}
	
	private String getEnvelopeId( EnvelopeType envelope )
	{
		for ( Object obj : envelope.getHeader( ).getAnyList( ) )
		{
			if ( ! ( obj instanceof RoutingInfType ) )
				continue;
			
			return ( ( RoutingInfType )obj ).getEnvelopeID( );
		}
		
		return "(null)";
	}
}
