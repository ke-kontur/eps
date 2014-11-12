package ru.acs.fts.aud.result.dispatcher.controllers;

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
import ru.acs.fts.aud.rest.service.model.requests.AudMessageRequest;
import ru.acs.fts.aud.rest.service.model.responses.ErrorResponse;
import ru.acs.fts.aud.rest.service.model.responses.Response;
import ru.acs.fts.aud.result.dispatcher.processing.ResponseProcessor;

@Controller
@RequestMapping( "/aud/results" )
public class ResultsController
{
	private static final Logger log = LoggerFactory.getLogger( ResultsController.class );
		
	@Autowired
	@Qualifier( "responseProcessor" )
	private ResponseProcessor _responseProcessor;
	
	@RequestMapping( value = "/dispatch", method = RequestMethod.POST )
	public @ResponseBody Response dispatchResult( @RequestBody AudMessageRequest request )
	{
		try
		{
			log.info( String.format( 
				"Получили результат обработки команды с сервера, сообщение с id: %s", 
				request.getAudMessage( ).getEnvelopeId( ) 
			) );
			
			_responseProcessor.saveResponse( request.getAudMessage( ), request.getAudResponseMetadata( ) );
			
			return new Response( );
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
	
}
