package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

/**
 * Создание транзитного сообщения при удаленной удаленке в удаленный РТУ
 * TODO: вынести в батч и удалить БП
 */
public class RemoteRemotenessTransitBusinessProcess extends BusinessProcess
{	
	private Map< String, String > _messageTypeSubstituion;
	
	@Required
	public void setMessageTypeSubstituion( Map< String, String > messageTypeSubstituion ) { _messageTypeSubstituion = messageTypeSubstituion; }
	public Map< String, String > getMessageTypeSubstituion( ) { return _messageTypeSubstituion; }
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
			_messageTypeSubstituion, recvEnv, 
			BusinessSystems.EPS, recvEnv.getReceiverCustoms( ) 
		);
		
		if ( null != transit )
			envelopes.add( transit );
	}
}
