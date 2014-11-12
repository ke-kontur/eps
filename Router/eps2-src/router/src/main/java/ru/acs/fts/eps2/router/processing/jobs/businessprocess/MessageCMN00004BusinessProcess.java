package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

public class MessageCMN00004BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );

		processForAdm00008IfNeeded( recvEnv, envelopes, jobBatchContext, jobContext );
	}
	
	private void processForAdm00008IfNeeded(
			EDEnvelope recvEnv,
			List< EDEnvelope > envelopes,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException
	{
		String initialEnvelopeId = recvEnv.getInitialEnvelopeID( );
		if ( StringUtil.isNullOrEmpty( initialEnvelopeId ) )
			return ;
				
		Edecl_Messages msg11026 =
			_serviceHolder.getEnvelopeService( ).getEnvelope( initialEnvelopeId );
		
		if ( null == msg11026 || 
			 ! msg11026.getMessageType( ).equals( MessageType.MSG_11026 ) )
			return ;
		
		EDEnvelope cmn00004 = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
		);
		
		cmn00004.setInitialEnvelopeID( msg11026.getIncomeEnvelopeId( ) );
		
		envelopes.add( cmn00004 );
	}
}
