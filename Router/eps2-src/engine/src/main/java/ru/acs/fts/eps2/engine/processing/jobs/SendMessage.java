package ru.acs.fts.eps2.engine.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Marshaller;

import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.Job;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.SendMessageHelper;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.engine.transport.AddressFactory;
import ru.acs.fts.eps2.engine.transport.gateway.out.MessagingGateway;

import java.util.List;

/**
 * Класс посылки сообщений на основе jibx сериализации
 */
public class SendMessage extends Job
{
	protected static final Logger log = LoggerFactory.getLogger( SendMessage.class );
	protected static final String action = "Отправка сообщения";
	protected static final String errorQueueToSend = ErrorQueueTypes.ERROR_FATAL;

	private AddressFactory addressFactory;
	private MessagingGateway messagingGateway;
	private Marshaller envelopeMarshaller;

	@Required
	public void setAddressFactory( AddressFactory addressFactory ) { this.addressFactory = addressFactory; }
	public AddressFactory getAddressFactory( ) { return addressFactory; }
	
	@Required
	public void setMessagingGateway( MessagingGateway messagingGateway ) { this.messagingGateway = messagingGateway; }
	public MessagingGateway getMessagingGateway( ) { return messagingGateway; }
	
	@Required
	public void setEnvelopeMarshaller( Marshaller envelopeMarshaller ) { this.envelopeMarshaller = envelopeMarshaller; }
	public Marshaller getEnvelopeMarshaller( ) { return envelopeMarshaller; }

	@Override
	public void execute( JobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		Object object = jobBatchContext.get( jobContext.getString( ContextConstants.ENVELOPE_NAME ) );

		if ( object instanceof List )
		{
			@SuppressWarnings( "unchecked" )
			List< Object > objects = ( List< Object > )object;

            for ( Object obj : objects )
			{
				SendMessageHelper.sendEnvelope( jobBatchContext, jobContext, obj );
			}
		}
		else
		{
			SendMessageHelper.sendEnvelope( jobBatchContext, jobContext, object );
		}
		
		jobBatchContext.getProcessingResult( ).addOKProcessingInfo( action );
	}


	@Override
	public String getAction( )
	{
		return action;
	}
}
