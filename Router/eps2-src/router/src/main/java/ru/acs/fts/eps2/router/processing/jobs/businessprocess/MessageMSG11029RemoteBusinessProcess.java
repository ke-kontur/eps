package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.engine.data.kind.CompressType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.defines.SpecialProcedureStates;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.MessageLineage;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;

public class MessageMSG11029RemoteBusinessProcess extends BusinessProcess
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

	}
}
