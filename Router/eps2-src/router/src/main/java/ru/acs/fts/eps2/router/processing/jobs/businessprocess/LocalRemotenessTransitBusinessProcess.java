package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

/**
 * Создание транзитного сообщения при локальной удаленке в удаленный ТО
 * 
 * <h1>JobContext:</h1>
 * <ul>
 * <li><strong>receivingSystem</strong> - система получатель, если хочется заменить ту, которая будет стандартно</li>
 * </ul> 
 */
public class LocalRemotenessTransitBusinessProcess extends BusinessProcess
{	
	private Map< String, String > _messageTypeSubstituion;
	
	@Required
	public void setMessageTypeSubstituion( Map< String, String > messageTypeSubstituion ) { _messageTypeSubstituion = messageTypeSubstituion; }
	public Map< String, String > getMessageTypeSubstituion( ) { return _messageTypeSubstituion; }
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		String recipientSystem = jobContext.getString( ContextConstants.RECEIVING_SYSTEM );

		EDEnvelope transitEnvelope = EnvelopeCreator.createTranzitMessage( 
			_messageTypeSubstituion, 
			jobBatchContext.getReceivedEnvelope( ), 
			recipientSystem, recvEnv.getReceiverCustoms( ) 
		);
		
		if ( null != transitEnvelope )
			envelopes.add( transitEnvelope );
	}
}
