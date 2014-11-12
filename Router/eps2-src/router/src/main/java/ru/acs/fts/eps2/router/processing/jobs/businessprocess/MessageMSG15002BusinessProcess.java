package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;

public class MessageMSG15002BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String receiverCustomsCode = recvEnv.getReceiverCustoms( ).getCustomsCode( );
		
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
		String transitName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( transitName, envelopes );
		
		if ( RemotenessHelper.isCustomsRemote( receiverCustomsCode ) )
		{
			Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
			messageTypeSubstituion.put( MessageType.MSG_15002, MessageType.ADM_15002 );
			
			EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
				messageTypeSubstituion, recvEnv, 
				BusinessSystems.EPS, recvEnv.getReceiverCustoms( )
			);

			envelopes.add( transit );
		}
		else
		{
			EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
				null, recvEnv, 
				BusinessSystems.ASKTT2, recvEnv.getReceiverCustoms( ) 
			);
						
			envelopes.add( transit );
			
			EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
				MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
				BusinessSystems.CUSTOMS, recvEnv.getSenderCustoms( ) 
			);
			
			CryptoHelper.signEnvelope( cmn00004, false );
			
			envelopes.add( cmn00004 );
		}		
	}
}
