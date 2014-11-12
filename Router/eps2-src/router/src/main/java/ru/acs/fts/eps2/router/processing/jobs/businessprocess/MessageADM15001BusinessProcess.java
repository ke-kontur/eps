package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.MessageLineage;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.schemas.envelope.CustomsType;

/**
 * 
 * @author SAA
 * <p>
 * <b>envelopeName</b> - имя конверта MSG.15001 в контексте сценария
 */
public class MessageADM15001BusinessProcess extends BusinessProcess
{
	private final static String defaultState = "Decl_ProcNotOpen";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
				
		String processId = recvEnv.getProcessID( );
		CustomsType senderCustoms = recvEnv.getSenderCustoms( );
		CustomsType receiverCustoms = recvEnv.getReceiverCustoms( );
		
		ProcedureService procedureService = _serviceHolder.getProcedureService( );
		Edecl_Proc_Information procInfo = procedureService.getProcInformation( processId );
		String receiverCustomsCode =  receiverCustoms.getCustomsCode( );
		
		if ( null == procInfo )
		{
			procInfo = new Edecl_Proc_Information( );
			procInfo.setCustCode( senderCustoms.getCustomsCode( ) );
			procInfo.setBorderCustCode( receiverCustomsCode );
			procInfo.setUdFlag( ProcedureUdFlags.RRW_TRANSIT );
			procInfo.setCurrentState( defaultState );
			procInfo.setProcessId( processId );
			procInfo.setParticipantId( recvEnv.getParticipantID( ) );
			procInfo.setSoftVersion( recvEnv.getSoftVersion( ) );
			
			procedureService.persist( procInfo );
						
			MessageLineage ml = new MessageLineage( );
			ml.setEnvelopeId( procInfo.getProcessId( ) );
			ml.setLineageId( recvEnv.getLineageId( ) );
			jobBatchContext.getServiceHolder( ).getEnvelopeService( ).persist( ml );			
		}
	}
}
