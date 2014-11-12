package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageCMN11134BusinessProcess extends BusinessProcess
{
	@Override
	@SuppressWarnings( "unchecked" )
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
		String transitName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( transitName, envelopes );

        Map< String, String > messageTypeSubstituion = ( Map< String, String > )jobContext.get( ContextConstants.MESSAGE_TYPES );

        EDEnvelope transit = EnvelopeCreator.createTranzitMessage(
            messageTypeSubstituion, recvEnv,
            BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( )
        );

        envelopes.add( transit );
	}
}
