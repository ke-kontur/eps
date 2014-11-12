package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.ProcedureOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.schemas.envelope.EnvelopeType;

public class MessageMSG15002RemoteEpsBusinessProcess extends BusinessProcess
{
	private final static String flagName = "udFlagNotOK";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		ProcedureOperator procedureOperator = _serviceHolder.getProcedureOperator( );
		Edecl_Proc_Information procInf = procedureOperator.getProcedureInformation( recvEnv );
		
		String senderCode = recvEnv.getSenderCustoms( ).getCustomsCode( );
		String recvCode = recvEnv.getReceiverCustoms( ).getCustomsCode( );
		
		if ( RemotenessHelper.areCustomsOnDifferentEps( senderCode, recvCode ) )
		{
			boolean flag = ! ProcedureUdFlags.isRrwTransit( procInf.getUdFlag( ) );
			jobBatchContext.put( flagName, flag );
			
			if ( flag )
			{
				List< EnvelopeType > envelopes = new ArrayList< EnvelopeType >( );
				jobBatchContext.put( jobContext.getString( ContextConstants.ENVELOPE_NAME ), envelopes );
			}
		}
		else
		{
			/**
			 * MSG.15002 участвует в обмене между АИСТ-М и РЖД, поэтому такого
			 * понятия как "локальная удаленка" для него не существует
			 */
		}
	}
}
