package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.envelope.CustomsType;

public class MessageMSG11007BusinessProcess extends BusinessProcess 
{	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception 
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		Edecl_Proc_Information procInfo = getProcInfo( recvEnv, jobBatchContext );
		
		CustomsType localCustoms = recvEnv.getSenderCustoms( ); 		
		CustomsType remoteCustoms = recvEnv.getReceiverCustoms( );
						
		if ( ProcedureUdFlags.isLocalRemoteness( procInfo.getUdFlag( ) ) )
		{
			// ТО-получатель и ТО-отправитель располагаются на одном РТУ
			
			EDEnvelope msg11007 = EnvelopeCreator.createTranzitMessage( 
				null, recvEnv, 
				BusinessSystems.CUSTOMS, remoteCustoms 
			);
			
			msg11007.getEDHeader( ).setSenderCustoms( localCustoms );
				
			envelopes.add( msg11007 );
			
			EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
				MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
				BusinessSystems.CUSTOMS, localCustoms 
			);
						
			CryptoHelper.signEnvelope( cmn00004, false );

			envelopes.add( cmn00004 );
		}
		else if ( ProcedureUdFlags.isRemoteRemoteness( procInfo.getUdFlag( ) ) ) 
		{
			// ТО-получатель и ТО-отправитель располагаются на разных РТУ
				
			EDEnvelope msg11007 = EnvelopeCreator.createTranzitMessage( 
				null, recvEnv, 
				BusinessSystems.EPS, remoteCustoms 
			);
				
			msg11007.getEDHeader( ).setSenderCustoms( localCustoms );

			envelopes.add( msg11007 );				
		}
	}

	private Edecl_Proc_Information getProcInfo( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		String processId = recvEnv.getProcessID( );
		if ( StringUtil.isNullOrEmpty( processId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00049_03, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		ProcedureService procServ = jobBatchContext.getServiceHolder( ).getProcedureService( );
		Edecl_Proc_Information procInfo = procServ.getProcInformation( processId );
		if ( null == procInfo )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00049_03, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);			
		}
		
		return procInfo;
	}	
}
