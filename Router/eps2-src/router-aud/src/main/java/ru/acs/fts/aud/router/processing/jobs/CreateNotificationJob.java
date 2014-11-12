package ru.acs.fts.aud.router.processing.jobs;

import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.AudContextConstants;
import ru.acs.fts.aud.router.processing.definitions.MessageKinds;
import ru.acs.fts.aud.router.processing.helpers.MessageCreator;
import ru.acs.fts.aud.router.processing.helpers.ResponseCreator;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.schemas.aud.aud_deliverynotification.AUDDeliveryNotificationType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/**
 * (mrdekk)
 * Проверено. Недостатки исправлены 
 */
public class CreateNotificationJob extends AudJob
{
	private static final String ACTION = "Создание уведомления";
	
	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		AudEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		AUDBaseEnvelopeType request = recvEnv.getDocument( ).getDocumentAsClass( AUDBaseEnvelopeType.class ); 
		
		AUDDeliveryNotificationType response = ResponseCreator.createNoification( request );
				
		AudEnvelope notifEnvelope = MessageCreator.createNotificationEnvelope( 
			MessageKinds.AUD_DELIVERY_NOTIFICATION, recvEnv, response, 
			jobBatchContext.getConfigurator( ) 
		);

		String envelopeName = jobContext.getString( AudContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, notifEnvelope );
	}

	@Override
	public String getAction( )
	{
		return ACTION;
	}
}
