package ru.acs.fts.eps2.ws.eps.controllers;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.util.time.TimeUtil;
import ru.acs.fts.eps2.ws.data.model.entities.Document;
import ru.acs.fts.eps2.ws.data.model.entities.Envelope;
import ru.acs.fts.eps2.ws.data.model.entities.Event;
import ru.acs.fts.eps2.ws.data.model.services.DocumentService;
import ru.acs.fts.eps2.ws.data.model.services.EnvelopeService;
import ru.acs.fts.eps2.ws.data.model.services.EventService;
import ru.acs.fts.eps2.ws.eps.exceptions.ErrorCodes;
import ru.acs.fts.eps2.ws.eps.exceptions.GenericException;
import ru.acs.fts.eps2.ws.eps.serviceModel.objects.SendedEnvelope;
import ru.acs.fts.eps2.ws.eps.serviceModel.responses.EnvelopeResponse;
import ru.acs.fts.eps2.ws.eps.serviceModel.responses.ErrorResponse;
import ru.acs.fts.eps2.ws.eps.serviceModel.responses.EventsResponse;
import ru.acs.fts.eps2.ws.eps.serviceModel.responses.Response;
import ru.acs.fts.eps2.ws.eps.serviceModel.responses.SendedEnvelopeResponse;
import ru.acs.fts.eps2.ws.eps.transport.out.MessageSender;
import ru.acs.fts.eps2.ws.utils.helpers.DocumentProcessor;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.BodyType;
import ru.acs.fts.schemas.envelope.CustomsType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.HeaderType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

@Controller
@RequestMapping( "/envelopes" )
public class EnvelopeController
{
	@Autowired
	@Qualifier( "envelopeService" )
	private EnvelopeService _envelopeService;
	
	@Autowired
	@Qualifier( "documentService" )
	private DocumentService _documentService;
	
	@Autowired
	@Qualifier( "eventService" )
	private EventService _eventService;
	
	@Autowired
	@Qualifier( "jibx" )
	private Marshaller _marshaller;
	
	@Autowired
	@Qualifier( "jibx" )
	private Unmarshaller _unmarshaller;
	
	@Autowired
	@Qualifier( "messageSender" )
	private MessageSender _messageSender;
	
	@Autowired
	@Qualifier( "extGateQueueManager" )
	private String _extGateQueueManager;
	
	@Autowired
	@Qualifier( "extGateQueue" )
	private String _extGateQueue;
	
	@RequestMapping( value = "/{id}", method = RequestMethod.GET )
	public @ResponseBody Response getEnvelope( @PathVariable( "id" ) String id )
	{
		try
		{
			List< Envelope > envelopes = _envelopeService.findMatchById( id );
			if ( null == envelopes )
				throw new GenericException( ErrorCodes.ERROR_NOT_EXISTS, String.format( "Конверт с id: %s не найден!", id ) );
			else if ( envelopes.size( ) > 1 )
				throw new GenericException( ErrorCodes.ERROR_MULTIPLE_RESULTS, String.format( "Найдено более одного конверта по указанному шаблону '%s'", id ) );
			
			Envelope envelope = envelopes.get( 0 );
			
			Document document = _documentService.findById( envelope.getDocumentId( ) );
			if ( null == document )
				throw new GenericException( ErrorCodes.ERROR_NOT_EXISTS, String.format( "Документ (%s) для конверта с id: %s не найден!", envelope.getDocumentId( ), id ) );
			
			EnvelopeType resEnv = getEnvelope( envelope, document );
			String resStr = getBase64( resEnv );
			
			EnvelopeResponse response = new EnvelopeResponse( );
			response.setEnvelope( resStr );
			
			return response;
		}
		catch ( GenericException exc )
		{
			ErrorResponse response = new ErrorResponse( );
			response.setStatus(exc.getCode( ) );
			response.setMessage( exc.getMessage( ) );
			
			return response;
		}
		catch ( Exception exc )
		{
			ErrorResponse response = new ErrorResponse( );
			response.setStatus( "fail" );
			response.setMessage( exc.getMessage( ) );
			
			return response;
		}
	}
	
	@RequestMapping( value = "/{id}/events", method = RequestMethod.GET )
	public @ResponseBody Response getEnvelopeEvents( @PathVariable( "id" ) String id )
	{
		try
		{
			List< Event > events = _eventService.getEventsByEnvelope( id );
			
			EventsResponse response = new EventsResponse( );
			List< ru.acs.fts.eps2.ws.eps.serviceModel.objects.Event > eventList = new ArrayList< ru.acs.fts.eps2.ws.eps.serviceModel.objects.Event >( );
			if ( null != events )
			{
				for ( Event event : events )
				{
					ru.acs.fts.eps2.ws.eps.serviceModel.objects.Event eventModel = new ru.acs.fts.eps2.ws.eps.serviceModel.objects.Event( );
					eventList.add( eventModel );
					
					if ( null != event.getCategoryId( ) )
						eventModel.setCategoryId( event.getCategoryId( ).intValue( ) );
					eventModel.setDateTime( TimeUtil.convertToDateTime( event.getEventDateTime( ) ) );
					eventModel.setDocumentId( event.getDocumentId( ) );
					eventModel.setEnvelopeId( event.getEnvelopeId( ) );
					if ( null != event.getEventCode( ) )
						eventModel.setEventCode( event.getEventCode( ).intValue( ) );
					eventModel.setDescription( event.getDescription( ) );
					eventModel.setProcessId( event.getProcessId( ) );
					if ( null != event.getSourceId( ) )
						eventModel.setSourceId( event.getSourceId( ).intValue( ) );
					eventModel.setLogDateTime( TimeUtil.convertToDateTime( event.getLogDateTime( ) ) );
				}
			}
			
			response.setEvents( eventList );
			
			return response;
		}
		catch ( Exception exc )
		{
			ErrorResponse response = new ErrorResponse( );
			response.setStatus( "fail" );
			response.setMessage( exc.getMessage( ) );
			
			return response;
		}
	}
	
	@RequestMapping( value = "/{id}/resend", method = RequestMethod.GET )
	public @ResponseBody Response resendEnvelope( @PathVariable( "id" ) String id )
	{
		try
		{
			List< Envelope > envelopes = _envelopeService.findMatchById( id );
			if ( null == envelopes )
				throw new GenericException( ErrorCodes.ERROR_NOT_EXISTS, String.format( "Конверт с id: %s не найден!", id ) );
			else if ( envelopes.size( ) > 1 )
				throw new GenericException( ErrorCodes.ERROR_MULTIPLE_RESULTS, String.format( "Найдено более одного конверта по указанному шаблону '%s'", id ) );
			
			Envelope envelope = envelopes.get( 0 );
			
			Document document = _documentService.findById( envelope.getDocumentId( ) );
			if ( null == document )
				throw new GenericException( ErrorCodes.ERROR_NOT_EXISTS, String.format( "Документ (%s) для конверта с id: %s не найден!", envelope.getDocumentId( ), id ) );
			
			EnvelopeType resEnv = getEnvelope( envelope, document );
			
			RoutingInfType rInfo = null;
			for ( Object obj : resEnv.getHeader( ).getAnyList( ) )
			{
				if ( obj instanceof RoutingInfType )
				{
					rInfo = ( RoutingInfType )obj;
					break;
				}
			}
			
			if ( null == rInfo || null == rInfo.getReceiverInformationList( ) || 0 == rInfo.getReceiverInformationList( ).size( ) )
				throw new Exception( String.format( "Конверт %s не содержит транспортной информации получателя!", id ) );
			
			String receiverInfo = rInfo.getReceiverInformationList( ).get( 0 );

			SendedEnvelope senv = new SendedEnvelope( );
			senv.setEnvelopeId( rInfo.getEnvelopeID( ) );
			
			if ( receiverInfo.matches( "[wW][mM][qQ].*" ) )
			{
				Pattern p = Pattern.compile( "[wW][mM][qQ]:\\/\\/(.*)\\/(.*)" );
				Matcher m = p.matcher( receiverInfo );
				if ( ! m.find( ) )
					throw new Exception( String.format( "Не удалось получить транспортную информацию MQ из транспортной информации получателя конверта %s", id ) );

				senv.setMqQueueManager( m.group( 1 ) );
				senv.setMqQueue( m.group( 2 ) );
			}
			else if ( receiverInfo.matches( "[sS][mM][tT][pP].*" ) )
			{
				senv.setMqQueueManager( _extGateQueueManager );
				senv.setMqQueue( _extGateQueue );
			}
			else
				throw new Exception( String.format( "Непонятно, куда необходимо отправить конверт %s", id ) );
			
			_messageSender.send( resEnv );			
			
			SendedEnvelopeResponse resp = new SendedEnvelopeResponse( );
			resp.setSendedEnvelope( senv );
			
			return resp;
		}
		catch ( GenericException exc )
		{
			ErrorResponse response = new ErrorResponse( );
			response.setStatus(exc.getCode( ) );
			response.setMessage( exc.getMessage( ) );
			
			return response;
		}
		catch ( Exception exc )
		{
			ErrorResponse response = new ErrorResponse( );
			response.setStatus( "fail" );
			response.setMessage( exc.getMessage( ) );
			
			return response;
		}
	}
	
	private EnvelopeType getEnvelope( Envelope envelope, Document document ) 
	{
		EnvelopeType env = new EnvelopeType( );
		
		HeaderType header = new HeaderType( );
		env.setHeader( header );
		
		List< Object > headerAnies = new ArrayList< Object >( );
		header.setAnyList( headerAnies );
		
		ApplicationInfType appInfo = new ApplicationInfType( );
		headerAnies.add( appInfo );
		
		appInfo.setMessageKind( envelope.getMessageKind( ) );
		appInfo.setSoftKind( envelope.getSoftKind( ) );
		appInfo.setSoftVersion( envelope.getSoftVersion( ) );
		
		RoutingInfType rInfo = new RoutingInfType( );
		headerAnies.add( rInfo );
		
		rInfo.setConfirmationRequest( null );
		rInfo.setEnvelopeID( envelope.getEnvelopeId( ) );
		rInfo.setExpiration( envelope.getExpiration( ) );
		rInfo.setInitialEnvelopeID( envelope.getInitialEnvelopeId( ) );
		rInfo.setPreparationDateTime( new DateTime( envelope.getPreparationDateTime( ) ) );
		rInfo.setPriority( null != envelope.getPriority( ) ? BigInteger.valueOf( envelope.getPriority( ) ) : null );

		List< String > receiverInformationList = new ArrayList< String >( );
		receiverInformationList.add( envelope.getReceiverInformation( ) );
		rInfo.setReceiverInformationList( receiverInformationList );
		
		rInfo.setSenderInformation( envelope.getSenderInformation( ) );
		
		EDHeaderType edHeader = new EDHeaderType( );
		headerAnies.add( edHeader );
		
		edHeader.setMessageType( envelope.getMessageType( ) );
		edHeader.setParticipantID( envelope.getParticipantId( ) );
		edHeader.setProccessID( envelope.getProcessId( ) );

		if ( null != envelope.getReceiverCustomsCode( ) && null != envelope.getReceiverExchType( ) )
		{
			CustomsType receiverCustoms = new CustomsType( );
			receiverCustoms.setCustomsCode( envelope.getReceiverCustomsCode( ).toString( ) );
			receiverCustoms.setExchType( envelope.getReceiverExchType( ).toString( ) );
			
			edHeader.setReceiverCustoms( receiverCustoms );
		}
		else
		{
			edHeader.setReceiverCustoms( null );
		}
		
		if ( null != envelope.getSenderCustomsCode( ) && null != envelope.getSenderExchType( ) )
		{
			CustomsType senderCustoms = new CustomsType( );
			senderCustoms.setCustomsCode( envelope.getSenderCustomsCode( ).toString( ) );
			senderCustoms.setExchType( envelope.getSenderExchType( ).toString( ) );
			
			edHeader.setSenderCustoms( senderCustoms );
		}
		else
		{
			edHeader.setSenderCustoms( null );
		}
		
		BodyType body = new BodyType( );
		env.setBody( body );
		
		List< Object > bodyAnies = new ArrayList< Object >( );
		body.setAnyList( bodyAnies );
		
		XStringMarshallableClass doc = new XStringMarshallableClass( );
		doc.setByteArray( document.getBody( ) );
		doc.setEncoding( "UTF-8" );
		
		bodyAnies.add( doc );
		
		return env;
	}
	
	private String getBase64( EnvelopeType envelope ) 
		throws IOException, Exception
	{		
		EnvelopeMarshaller envMarshaller = new EnvelopeMarshaller( );
		byte[ ] res = envMarshaller.marshall( envelope, _marshaller, false );
		
		String resStr = new String( res, "UTF-8" );
		return DocumentProcessor.packToBase64( resStr );
	}
}
