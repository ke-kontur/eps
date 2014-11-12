package ru.acs.fts.aly.router.processing.helpers;

import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.jms.Destination;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Marshaller;

import ru.acs.fts.aly.router.objects.AlyEnvelope;
import ru.acs.fts.aly.router.processing.AlyJobBatchContext;
import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.transport.exceptions.TransportException;
import ru.acs.fts.eps2.engine.transport.gateway.out.MessagingGateway;
import ru.acs.fts.eps2.engine.transport.routingInfo.ExternalRoutingInfo;
import ru.acs.fts.schemas.envelope.RoutingInfType;

public class MessageSender
{
	private static final Logger log = LoggerFactory.getLogger( MessageSender.class );
	
	private static Hashtable< String, Destination > _queues;
	private static Marshaller _marshaller;
	private static MessagingGateway _messagingGateway;
	
	// @formatter:off
	@Required
	public void setQueues( Hashtable< String, Destination > queues ) { _queues = queues; }
	public Hashtable< String, Destination > getQueues( ) { return _queues; }
	
	@Required
	public void setMarshaller( Marshaller marshaller ) { _marshaller = marshaller; }
	public Marshaller getMarshaller( ) { return _marshaller; }
	
	@Required
	public void setMessagingGateway( MessagingGateway messagingGateway ) { _messagingGateway = messagingGateway; }
	public MessagingGateway getMessagingGateway( ) { return _messagingGateway; }
	// @formatter:on
	
	public static void send( AlyJobBatchContext jobBatchContext, JobContext jobContext, AlyEnvelope envelope ) 
		throws Exception
	{
		if ( null == envelope )
			ErrorHelper.throwBasicException( "Не указан конверт для отправки." );
		
		makeMqRoutingInfo( jobBatchContext.getReceivedEnvelope( ), envelope, jobContext );
				
		_messagingGateway.sendMessage( envelope );
	}
	
	private static void makeMqRoutingInfo( AlyEnvelope receivedEnvelope, AlyEnvelope envelope, JobContext jobContext ) 
		throws TransportException
	{		
		try
		{
			EnvelopeMarshaller envMarshaller = new EnvelopeMarshaller( );

			byte[ ] data = envMarshaller.marshall( envelope.getEnvelope( ), _marshaller, envelope.getWasCompressed( ) );
			envelope.setData( data );
			
			ExternalRoutingInfo mqRoutingInfo = getRoutingAddress( envelope );
			envelope.setMqRoutingInfo( mqRoutingInfo );
		}
		catch ( Exception exc )
		{
			log.error( "Маршаллинг сообщения не удался", exc );
			
			TransportException te = new TransportException( "Маршаллинг сообщения не удался", exc );
			te.setResultCode( ResultCodes._09_00005_05 );
			throw te;
		}
	}	
	
	private static ExternalRoutingInfo getRoutingAddress( AlyEnvelope envelopeToSend )
	{
		ExternalRoutingInfo eri = new ExternalRoutingInfo( );
		
		RoutingInfType rInfo = envelopeToSend.getRoutingInfo( );
		if ( null == rInfo )
			return null;
		
		String receiverInfo = rInfo.getReceiverInformationList( ).get( 0 );

		if ( receiverInfo.matches( "[wW][mM][qQ].*" ) )
		{
			Pattern p = Pattern.compile( "[wW][mM][qQ]:\\/\\/(.*)\\/(.*)" );
			Matcher m = p.matcher( receiverInfo );
			if ( ! m.find( ) )
				return null;
			
			eri.setDestinationQueueManager( m.group( 1 ) );
			eri.setDestinationQueue( m.group( 2 ) );
		}
		else
			return null;
				
		return eri;
	}
	
}
