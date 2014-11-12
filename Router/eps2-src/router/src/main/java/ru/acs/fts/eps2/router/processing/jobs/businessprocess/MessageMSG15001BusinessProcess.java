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
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.schemas.album.instrinspection.InstrInspectionType;

public class MessageMSG15001BusinessProcess extends BusinessProcess
{
	private static final String ignoreSwitchStateFlagName = "notDiffRtu";
	
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
			messageTypeSubstituion.put( MessageType.MSG_15001, MessageType.ADM_15001 );
			
			EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
				messageTypeSubstituion, recvEnv, 
				BusinessSystems.EPS, recvEnv.getReceiverCustoms( )
			);

			envelopes.add( transit );
			
			ProcedureService procedureService = _serviceHolder.getProcedureService( );
			Edecl_Proc_Information procInfo = procedureService.getProcedureInfo( 
				recvEnv.getProcessID( ), recvEnv.getParticipantID( ), recvEnv.getSoftVersion( ) 
			);
			
			String code = getAskttCode( recvEnv );
			procInfo.setAskttRecvCust( Long.valueOf( code ) );
			
			procedureService.persist( procInfo );
		}
		else
		{
			EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
				null, recvEnv, 
				BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
			);
						
			envelopes.add( transit );
			
			jobBatchContext.put( ignoreSwitchStateFlagName, true );
			
			EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
				MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
				BusinessSystems.ASKTT2, recvEnv.getSenderCustoms( ) 
			);
			
			CryptoHelper.signEnvelope( cmn00004, false );
			
			envelopes.add( cmn00004 );
		}		
	}
	
	private String getAskttCode( EDEnvelope recvEnv ) 
		throws Exception
	{
		InstrInspectionType doc = recvEnv.getDocument( ).getDocumentAsClass( InstrInspectionType.class );
		return doc.getInstrInfo( ).getCustoms( ).getCode( );
	}
	
}
