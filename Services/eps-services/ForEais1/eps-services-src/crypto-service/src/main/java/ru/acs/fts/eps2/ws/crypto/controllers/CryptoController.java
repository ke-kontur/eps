package ru.acs.fts.eps2.ws.crypto.controllers;

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

import ru.acs.fts.eps2.ws.crypto.services.CryptoService;
import ru.acs.fts.eps2.ws.model.requests.crypto.CheckSignRequest;
import ru.acs.fts.eps2.ws.model.requests.crypto.SignRequest;
import ru.acs.fts.eps2.ws.model.responses.crypto.CheckSignResponse;
import ru.acs.fts.eps2.ws.model.responses.crypto.SignResponse;
import ru.acs.fts.eps2.ws.model.serviceModel.crypto.DoSign;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.DocumentCheckResult;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.DocumentToCheck;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.ResultInformation;
import ru.acs.fts.eps2.ws.model.services.EventRestWs;

@Controller
@RequestMapping( "/" )
public class CryptoController extends BaseController
{
	private static final Logger log = LoggerFactory.getLogger( CryptoController.class );
	
	@Autowired
	@Qualifier( value = "cryptoService" )
	private CryptoService _cryptoService;
	
	@Autowired
	@Qualifier( value = "eventRestWs" )
	private EventRestWs _eventRestWs;	
	
	@RequestMapping( value = "/check-signature", method = RequestMethod.POST )
	public @ResponseBody CheckSignResponse checkSignature( @RequestBody CheckSignRequest request )
		throws Exception
	{
		logReceivedDocument( 1, request.getDocument( ) );
		
		List< DocumentCheckResult > results = 
			_cryptoService.checkSignature( request.getDocument( ) );
		
		logCheckFinished( 2, results, request.getDocument( ) );
		
		CheckSignResponse response = new CheckSignResponse( );
		response.setResults( results );
		
		logFinished( 3, request.getDocument( ) );
		
		return response;
	}
	
	@RequestMapping( value = "/sign", method = RequestMethod.POST )
	public @ResponseBody SignResponse sign( @RequestBody SignRequest request )
		throws Exception
	{
		logReceivedSignRequest( 1 );
		
		DoSign signed = _cryptoService.sign( request.getDoSign( ) );
		
		SignResponse response = new SignResponse( );
		response.setDidSign( signed );
		
		logDocumentSigned( 2 );
		
		return response;
	}
	
	private void logReceivedDocument( int eventCode, DocumentToCheck document )
	{
		if ( document.getIsContainer( ) )
		{
			log( 
				eventCode, 
				"Принят новый конверт, содержащий документ типа контейнер, для проверки ЭЦП.",
				4, document 
			);
		}
		else
		{
			log(
				eventCode,
				"Принят новый конверт, содержащий простой документ, для проверки ЭЦП.",
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
				"Проверка ЭЦП документа завершена. Наложенная ЭЦП корректна.",
				4, document
			);
		}
		else
		{
			log(
				eventCode,
				"Проверка ЭЦП документа завершена. Некорректная ЭЦП.",
				2, document
			);
		}
	}
	
	private void logReceivedSignRequest( int eventCode )
	{
		log( eventCode, "Сервис ЭЦП получил документ для наложения ЭЦП.", 4 );
	}
	
	private void logDocumentSigned( int eventCode )
	{
		log( eventCode, "Сервис ЭЦП успешно завершил наложение ЭЦП на документ", 4 );
	}
	
	private void logFinished( int eventCode, DocumentToCheck document )
	{
		log( 
			eventCode,
			"Сервис ЭЦП завершил обработку запроса. Результат возвращен вызывающей системе.",
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
		event.setInvokingSystemName( "REST Crypto Service" );
		event.setSourceId( 13 );
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
	
	private void log( int eventCode, String eventInfo, int categoryId )
	{
		log.info( String.format(
			"<evc:%d; cat:%d> %s",
			eventCode, categoryId, eventInfo
		) );
		/*
		Event event = new Event( );
		event.setEventCode( eventCode );
		event.setDateTime( new DateTime( ) );
		event.setEventInfo( eventInfo );
		event.setInvokingSystemName( "REST Crypto Service" );
		event.setSourceId( 13 );
		event.setCategoryId( categoryId );
		event.setEnvelopeId( "<неизвестно>" );
		event.setDocumentId( "<неизвестно>" );
		event.setProcessId( "<неизвестно>" );
		event.setMessageId( null );
		event.setVersion( "1.0-rest" );
		
		try
		{
			_eventRestWs.postNewEvent( event );
		}
		catch ( Exception exc )
		{
			// do nothing
		}
		*/
	}
}
