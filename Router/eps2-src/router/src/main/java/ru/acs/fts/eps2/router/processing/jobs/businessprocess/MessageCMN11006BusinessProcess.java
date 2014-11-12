package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
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

public class MessageCMN11006BusinessProcess extends BusinessProcess 
{	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception 
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		Edecl_Proc_Information procInfo = getProcInfo( recvEnv, jobBatchContext );
		CustomsType recvCustoms = recvEnv.getReceiverCustoms( );
		
		if ( ProcedureUdFlags.isRrwTransit( procInfo.getUdFlag( ) ) )
		{
			String recvCode = recvCustoms.getCustomsCode( );
			
			if ( RemotenessHelper.isCustomsRemote( recvCode ) )
			{
				CustomsType senderCustoms = new CustomsType( );
				senderCustoms.setCustomsCode( procInfo.getCustCode( ) );
				senderCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );
				
				Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
				messageTypeSubstituion.put( MessageType.CMN_11006, MessageType.ADM_15006 );
				
				EDEnvelope adm15006 = EnvelopeCreator.createTranzitMessage( 
					messageTypeSubstituion, recvEnv, 
					BusinessSystems.EPS, recvCustoms 
				);
				
				adm15006.getEDHeader( ).setSenderCustoms( senderCustoms );
								
				envelopes.add( adm15006 );
			}
			else
			{
				envelopes.add( cmn00004( recvEnv ) );
				envelopes.add( cmn11006_2kasto( recvEnv, recvCustoms ) );
			}
		}
		else if ( ProcedureUdFlags.isNoRemoteness( procInfo.getUdFlag( ) ) )
		{
			// Никакой удаленки нет, работает по обычному плану обработки CMN.11006
			
			envelopes.add( cmn11006_2kasto( recvEnv, recvCustoms ) );
			envelopes.add( cmn00004( recvEnv ) );
		}
		else
		{
			CustomsType localCustoms = new CustomsType( );
			localCustoms.setCustomsCode( procInfo.getCustCode( ) );
			localCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );
			
			CustomsType remoteCustoms = new CustomsType( );
			remoteCustoms.setCustomsCode( procInfo.getBorderCustCode( ) );
			remoteCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );
						
			if ( ProcedureUdFlags.isLocalRemoteness( procInfo.getUdFlag( ) ) )
			{
				// ТО-получатель и ТО-отправитель располагаются на одном РТУ
				
				EDEnvelope cmn11006local = cmn11006_2kasto( recvEnv, localCustoms );
				cmn11006local.setInitialEnvelopeID( null );
				
				envelopes.add( cmn11006local );
				envelopes.add( cmn11006_2kasto( recvEnv, remoteCustoms ) );
				envelopes.add( cmn00004( recvEnv ) );
			}
			else if ( ProcedureUdFlags.isRemoteRemoteness( procInfo.getUdFlag( ) ) ) 
			{
				// ТО-получатель и ТО-отправитель располагаются на разных РТУ
				
				EDEnvelope cmn11006 = EnvelopeCreator.createTranzitMessage( 
					null, recvEnv, 
					BusinessSystems.EPS, remoteCustoms 
				);
				
				cmn11006.getEDHeader( ).setSenderCustoms( localCustoms );

				envelopes.add( cmn11006 );				
			}
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
	
	private EDEnvelope cmn00004( EDEnvelope recvEnv ) 
		throws BaseProcessingException, DatabaseException
	{
		EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
			MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
			BusinessSystems.DECLARANT, null 
		);
				
		CryptoHelper.signEnvelope( cmn00004, false );
		
		return cmn00004;
	}
	
	private EDEnvelope cmn11006_2kasto( EDEnvelope recvEnv, CustomsType recvCustoms ) 
		throws BaseProcessingException, DatabaseException
	{
		EDEnvelope cmn11006 = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvCustoms 
		);
		
		return cmn11006;
	}
}
