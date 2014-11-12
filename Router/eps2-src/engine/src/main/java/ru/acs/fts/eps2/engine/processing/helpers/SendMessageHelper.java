package ru.acs.fts.eps2.engine.processing.helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Marshaller;

import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.transport.AddressFactory;
import ru.acs.fts.eps2.engine.transport.exceptions.TransportException;
import ru.acs.fts.eps2.engine.transport.gateway.out.MessagingGateway;
import ru.acs.fts.eps2.engine.transport.routingInfo.CoaCodHeaders;
import ru.acs.fts.eps2.engine.transport.routingInfo.ExternalRoutingInfo;

public class SendMessageHelper
{
	private static final Logger log = LoggerFactory.getLogger( SendMessageHelper.class );

	private static Marshaller _marshaller;
	private static AddressFactory _addressFactory;
	private static MessagingGateway _messagingGateway;
	private static String _ensureDestinations;

	// @formatter:off
	@Required public void setMarshaller( Marshaller marshaller ) { _marshaller = marshaller; }
	public Marshaller getMarshaller( ) { return _marshaller; }
	
	@Required public void setAddressFactory( AddressFactory addressFactory ) { _addressFactory = addressFactory; }
	public AddressFactory getAddressFactory( ) { return _addressFactory; }
	
	@Required public void setMessagingGateway( MessagingGateway messagingGateway ) { _messagingGateway = messagingGateway; }
	public MessagingGateway getMessagingGateway( ) { return _messagingGateway; }
	
	@Required public void setEnsureDestinations( String ensureDestinations ) { _ensureDestinations = ensureDestinations; }
	public String getEnsureDestinations ( ) { return _ensureDestinations; }
	// @formatter:on

	public static void sendEnvelope( JobBatchContext jobBatchContext, JobContext jobContext, Object object )
		throws Exception
	{
		if ( !( object instanceof Envelope ) )
		{
			String errorMsg = String.format(
				"В списке объектов на подпись попался объект с неправильным типом %s",
				object.getClass( ).toString( )
			);

			log.info( errorMsg );
			throw new Exception( errorMsg );
		}

		Envelope envelope = ( Envelope )object;

		makeMqRoutingInfo( jobBatchContext.getReceivedEnvelope( ), envelope, jobContext );

		_messagingGateway.sendMessage( envelope );

		ExternalRoutingInfo initialRoutingInfo = envelope.getMqRoutingInfo( );
		
		CoaCodHeaders cacdHeaders = envelope.getCoaCodHeaders( );
		envelope.setCoaCodHeaders( null );

		if ( null != _ensureDestinations && !_ensureDestinations.isEmpty( ) )
		{
			String[ ] destinations = _ensureDestinations.split( "," );
			for ( String destination : destinations )
			{
				if ( destination.matches( "[wW][mM][qQ].*" ) )
				{
					Pattern p = Pattern.compile( "[wW][mM][qQ]:\\/\\/(.*)\\/(.*)" );
					Matcher m = p.matcher( destination );
					if ( !m.find( ) )
						throw new Exception(String.format(
							"Не удалось получить транспортную информацию MQ из %s",	destination ) );
					makeEnsureRoutingInfo( envelope, m.group( 1 ), m.group( 2 ) );
					_messagingGateway.sendMessage( envelope );
				}
			}
		}
		
		envelope.setMqRoutingInfo( initialRoutingInfo );
		envelope.setCoaCodHeaders( cacdHeaders );
	}

	private static void makeMqRoutingInfo( Envelope receivedEnvelope, Envelope envelope, JobContext jobContext )
		throws TransportException
	{
		try
		{
			EnvelopeMarshaller envMarshaller = new EnvelopeMarshaller( );

			byte[ ] data = envMarshaller.marshall( envelope.getEnvelope( ), _marshaller, envelope.getWasCompressed( ) );
			envelope.setData( data );

			CoaCodHeaders cchd = _addressFactory.getCoaCodHeaders( );
			if ( envelope.isNeedReciept( ) && ( cchd.getCoaNeed( ) || cchd.getCodNeed( ) ) )
			{
				CoaCodHeaders ccHeadersClone = cchd.clone( );
				String envelopeId = envelope.getEnvelopeID( );
				ccHeadersClone.setMsgId( envelopeId );
				ccHeadersClone.setCorrelId( envelopeId );

				envelope.setCoaCodHeaders( ccHeadersClone );
			}

			String recipientSystem = envelope.getRecipientSystem( );
			if ( jobContext.contains( ContextConstants.RECV_SYSTEM ) )
			{
				recipientSystem = jobContext.getString( ContextConstants.RECV_SYSTEM );
			}

			ExternalRoutingInfo mqRoutingInfo = _addressFactory.getRoutingAddress(
				/* receivedEnvelope */receivedEnvelope,
				/* envelopeToSend */envelope,
				/* sender */envelope.getSenderSystem( ),
				/* receiver */recipientSystem
			);
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

	private static void makeEnsureRoutingInfo( Envelope envelope, String MQManager, String MQQueue )
	{
		ExternalRoutingInfo mqRoutingInfo = new ExternalRoutingInfo( );
		mqRoutingInfo.setDestinationQueueManager( MQManager );
		mqRoutingInfo.setDestinationQueue( MQQueue );
		envelope.setMqRoutingInfo( mqRoutingInfo );
	}

}
