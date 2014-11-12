package ru.acs.fts.aud.router.processing.helpers;

import org.joda.time.DateTime;

import ru.acs.fts.aud.router.processing.definitions.DocumentModeIDs;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.aud.aud_deliverynotification.AUDDeliveryNotificationType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/**
 * (mrdekk)
 * Проверно. Нареканий нет. 
 */
public class ResponseCreator
{
	private static final AUDDeliveryNotificationProducer audDeliveryNotificationProducer = new AUDDeliveryNotificationProducer( );
	
	// @formatter:off
	private ResponseCreator( ) { } 
	// @formatter:on
	
	public static AUDDeliveryNotificationType createNoification( AUDBaseEnvelopeType request )
	{
		return createResponse( audDeliveryNotificationProducer, request );
	}
	
	public static < T extends AUDBaseEnvelopeType > T createResponse( IProducer< T > producer, AUDBaseEnvelopeType request ) // NO_UCD (use private)
	{
		T response = producer.createInstance( );
		response.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		response.setDocumentDateTime( new DateTime( ) );
		response.setRefDocumentID( request.getDocumentID( ) );
		response.setTestDocumentIndicator( request.isTestDocumentIndicator( ) );
		producer.fillContent( response );
		
		return response;
	}
	
	private static interface IProducer< T extends AUDBaseEnvelopeType >
	{
		T createInstance( );
		void fillContent( T response );
	}
	
	private static class AUDDeliveryNotificationProducer implements IProducer< AUDDeliveryNotificationType >
	{
		@Override
		public AUDDeliveryNotificationType createInstance( )
		{
			return new AUDDeliveryNotificationType( );
		}

		@Override
		public void fillContent( AUDDeliveryNotificationType response )
		{
			response.setDocumentModeID( DocumentModeIDs.AUD_DELIVERY_NOTIFICATION );
		}
	}
}
