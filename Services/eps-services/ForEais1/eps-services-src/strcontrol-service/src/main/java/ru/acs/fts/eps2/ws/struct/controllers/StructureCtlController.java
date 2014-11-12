package ru.acs.fts.eps2.ws.struct.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ru.acs.fts.eps2.ws.model.requests.struct.DocumentValidationRequest;
import ru.acs.fts.eps2.ws.model.responses.struct.DocumentValidationResponse;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.DocumentCheckResult;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.DocumentToCheck;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.ResultInformation;
import ru.acs.fts.eps2.ws.model.services.EventRestWs;
import ru.acs.fts.eps2.ws.struct.services.DocumentValidator;

@Controller
@RequestMapping( "/" )
public class StructureCtlController extends BaseController
{	
	private static final Logger log = LoggerFactory.getLogger( StructureCtlController.class );
	
	@Autowired
	@Qualifier( value = "eventRestWs" )
	private EventRestWs _eventRestWs;
	
	@RequestMapping( value = "/document/{softVersion}/validate", method = RequestMethod.POST )
	public @ResponseBody DocumentValidationResponse validateDocument(
			@PathVariable String softVersion,
			@RequestBody DocumentValidationRequest request )
		throws Exception
	{
		logReceivedDocument( 1, request.getDocumentToCheck( ) );
		
		DocumentValidator docValidator = new DocumentValidator( );
		
		List< DocumentCheckResult > results = docValidator.validate( 
			softVersion, request.getDocumentToCheck( ) 
		);
		
		logCheckFinished( 2, results, request.getDocumentToCheck( ) );
		
		DocumentValidationResponse response = new DocumentValidationResponse( );
		response.setResults( results );
		
		logFinished( 3, request.getDocumentToCheck( ) );
		
		return response;
	}
	
	private void logReceivedDocument( int eventCode, DocumentToCheck document )
	{
		if ( document.getIsContainer( ) )
		{
			log( 
				eventCode, 
				"Принят новый конверт, содержащий документ типа контейнер, для проверки документа по схеме.",
				4, document 
			);
		}
		else
		{
			log(
				eventCode,
				"Принят новый конверт, содержащий простой документ, для проверки документа по схеме.",
				4, document
			);
		}
	}
	
	private void logCheckFinished( int eventCode, List< DocumentCheckResult > results, DocumentToCheck document )
	{
		boolean isOk = true;
		
		for ( DocumentCheckResult r : results )
		{
			for ( ResultInformation i : r.getInformation( ) )
			{
				if ( ! i.getCode( ).equalsIgnoreCase( "00.00000.00" ) )
				{
					isOk = false;
					break;
				}
			}
		}
		
		if ( isOk )
		{
			log(
				eventCode,
				"Структурный контроль документа на соответствие схеме завершен. Документ соответствует схеме.",
				4, document
			);
		}
		else
		{
			log(
				eventCode,
				"Структурный контроль документа на соответствие схеме завершен. Найдены несоответствия документа схеме.",
				2, document
			);
		}
	}
	
	private void logFinished( int eventCode, DocumentToCheck document )
	{
		log( 
			eventCode,
			"Сервис структурного контроля завершил обработку документа. Результат возвращен вызывающей системе.",
			4, document
		);
	}
	
	private void log( 
			int eventCode, String eventInfo, int categoryId,
			DocumentToCheck document )
	{
		log.info( String.format(
			"<env:%s; doc:%s; proc:%s; evc:%d; cat:%d> %s",
			document.getEnvelopeId( ), document.getDocumentId( ), document.getProcessId( ),
			eventCode, categoryId, eventInfo
		) );
		/*
		Event event = new Event( );
		event.setEventCode( eventCode );
		event.setDateTime( new DateTime( ) );
		event.setEventInfo( eventInfo );
		event.setInvokingSystemName( "REST Struct Control" );
		event.setSourceId( 11 );
		event.setCategoryId( categoryId );
		event.setEnvelopeId( document.getEnvelopeId( ) );
		event.setDocumentId( document.getDocumentId( ) );
		event.setProcessId( document.getProcessId( ) );
		event.setMessageId( null );
		event.setVersion( "1.0-rest" );

		try
		{
			_eventRestWs.postNewEvent( event );
		}
		catch ( Exception exc )
		{
			log.error( "event fail", exc );
		}
		*/ 
	}
}
