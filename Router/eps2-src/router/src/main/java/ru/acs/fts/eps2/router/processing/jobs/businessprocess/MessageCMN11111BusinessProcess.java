package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.schemas.envelope.CustomsType;

public class MessageCMN11111BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		// CMN.11111 Transit
		
		EDEnvelope cmn11111 = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.DECLARANT, null 
		);
		
		envelopes.add( cmn11111 );
				
		Edecl_Proc_Information procInfo = _serviceHolder.getProcedureService( ).getProcInformation( recvEnv.getProcessID( ) );
		
		Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
		messageTypeSubstituion.put( MessageType.CMN_11111, MessageType.MSG_11057 );
		
		CustomsType receiverCustoms = new CustomsType( );
		receiverCustoms.setCustomsCode( procInfo.getBorderCustCode( ) );
		receiverCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );
		
		String recipient = null;
		
		if ( ProcedureUdFlags.isLocalRemoteness( procInfo.getUdFlag( ) ) )
		{			
			recipient = BusinessSystems.CUSTOMS;
		}
		else if ( ProcedureUdFlags.isRemoteRemoteness( procInfo.getUdFlag( ) ) )
		{
			recipient = BusinessSystems.EPS;
		}
		
		if ( null != recipient )
		{
			EDEnvelope msg11057 = EnvelopeCreator.createTranzitMessage( 
				messageTypeSubstituion, recvEnv, 
				recipient, receiverCustoms 
			);
			
			envelopes.add( msg11057 );
		}
	}
}
