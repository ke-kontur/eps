package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.ProcParticipantAccess;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class MessageED13005BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
				
		EDEnvelope msg11062 = createMsg11062( recvEnv, jobBatchContext );
		envelopes.add( msg11062 );
		
		revokeAccessToSvhParticipant( recvEnv );
	}

	private EDEnvelope createMsg11062( 
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException
	{
		Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
		messageTypeSubstituion.put( MessageType.ED_13005, MessageType.MSG_11062 );
		
		EDEnvelope msg11062 = EnvelopeCreator.createTranzitMessage( 
			messageTypeSubstituion, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
		);
		
		return msg11062;
	}
	
	private void revokeAccessToSvhParticipant( EDEnvelope recvEnv ) 
		throws DatabaseException
	{
		ProcParticipantAccess ppAccess = _serviceHolder.getProcedureService( ).getParticipantAccess( 
			recvEnv.getProcessID( ), 
			recvEnv.getParticipantID( ), 
			recvEnv.getSoftVersion( ) 
		);
		
		if ( null != ppAccess )
		{
			_serviceHolder.getProcedureService( ).remove( ppAccess );
		}
	}
}
