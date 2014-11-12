package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.CompressType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.defines.SpecialProcedureStates;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.MessageLineage;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;

public class MessageADM11020BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String processId = recvEnv.getProcessID( );
		
		ProcedureService procedureService = _serviceHolder.getProcedureService( );
		Edecl_Proc_Information procInfo = procedureService.getProcInformation( processId );

		if ( null == procInfo )
		{
			procInfo = new Edecl_Proc_Information( );

			procInfo.setProcessId( processId );
			procInfo.setSoftVersion( recvEnv.getSoftVersion( ) );
			procInfo.setCurrentState( SpecialProcedureStates.getDefaultState( ) );
			procInfo.setExchType( Integer.valueOf( recvEnv.getSenderCustoms( ).getExchType( ) ) );
			procInfo.setParticipantId( recvEnv.getParticipantID( ) );
			procInfo.setCustCode( recvEnv.getSenderCustoms( ).getCustomsCode( ) );

			procInfo.setBorderCustCode( recvEnv.getReceiverCustoms( ).getCustomsCode( ) );
			procInfo.setUdFlag( ProcedureUdFlags.REMOTE_REMOTENESS );
			procInfo.setCompressType( CompressType.XML.toString( ) );

			procedureService.persist( procInfo );
						
			MessageLineage ml = new MessageLineage( );
			ml.setEnvelopeId( procInfo.getProcessId( ) );
			ml.setLineageId( recvEnv.getLineageId( ) );
			jobBatchContext.getServiceHolder( ).getEnvelopeService( ).persist( ml );			
		}		
		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
		messageTypeSubstituion.put( MessageType.ADM_11020, MessageType.MSG_11020 );
		messageTypeSubstituion.put( MessageType.ADM_11059, MessageType.MSG_11059 );
		
		EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
			messageTypeSubstituion, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
		);
		
		// transit.setInitialEnvelopeID( null );
		
		envelopes.add( transit );
		
		EDEnvelope adm00008 = EnvelopeCreator.createNotificationMessage( 
			MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
			BusinessSystems.EPS, recvEnv.getSenderCustoms( ) 
		);
		
		adm00008.getEDHeader( ).setMessageType( MessageType.ADM_00008 );
		
		CryptoHelper.signEnvelope( adm00008, false );
		
		envelopes.add( adm00008 );
	}
	
}
