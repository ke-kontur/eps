package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.MessageLineage;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.schemas.envelope.CustomsType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author fess
 * <p>
 * <b>envelopeName</b> - имя конверта MSG.12016 в контексте сценария
 */
public class MessageADM12016BusinessProcess extends BusinessProcess
{
	private final static String defaultState = "Decl_ProcNotOpen";

    private static final String fromRtuCode="10099030";
    private static final String fromRtuExchType="92420";


    @Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

        List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
        String transitName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
        jobBatchContext.put( transitName, envelopes );

        Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
        messageTypeSubstituion.put( MessageType.ADM_12016, MessageType.MSG_12016 );

        EDEnvelope transit = EnvelopeCreator.createTranzitMessage(
                messageTypeSubstituion, recvEnv,
                BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( )
        );
        transit.getSenderCustoms().setCustomsCode(fromRtuCode);
        transit.getSenderCustoms().setExchType(fromRtuExchType);
        envelopes.add( transit );
				
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
