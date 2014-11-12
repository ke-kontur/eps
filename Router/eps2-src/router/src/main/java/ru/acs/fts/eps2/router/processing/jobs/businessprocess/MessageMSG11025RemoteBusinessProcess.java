package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

public class MessageMSG11025RemoteBusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );

		Edecl_Proc_Information procInfo = getProcInfo( recvEnv, jobBatchContext );
		
		String custCode = procInfo.getCustCode( );		
		String senderCustomsCode = recvEnv.getSenderCustoms( ).getCustomsCode( );

		if ( custCode.equalsIgnoreCase( senderCustomsCode ) )
		{
			/**
			 * Сообщение пришло от внутреннего ТО, как транзит на CMN.11029
			 * Поэтому транзитим его во внешний ТО (наш) и отсылаем обратно
			 * ADM.00006
			 */
			
			EDEnvelope msg11025 = EnvelopeCreator.createTranzitMessage( 
				null, recvEnv, 
				BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
			);
			
			envelopes.add( msg11025 );
			
			EDEnvelope adm00006 = EnvelopeCreator.createNotificationMessage( 
				MessageType.ADM_00006, recvEnv, ResultCodes._00_00000_00,
				BusinessSystems.EPS, recvEnv.getSenderCustoms( ) 
			);
			
			CryptoHelper.signEnvelope( adm00006, false );
			
			envelopes.add( adm00006 );
		}
		else
		{
			/**
			 * Сообщение пришло от внешнего ТО, как транзит на MSG.11025
			 * Поэтому нам надо переправить MSG.11025 во внутрений ТО,
			 * CMN.11029 отправить декларанту и ответить обратно ADM.00006
			 */
			
			// msg.11025
			
			EDEnvelope msg11025 = EnvelopeCreator.createTranzitMessage( 
				null, recvEnv, 
				BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
			);
			
			envelopes.add( msg11025 );
			
			// cmn.11029
			
			Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
			messageTypeSubstituion.put( MessageType.MSG_11025, MessageType.CMN_11029 );
			
			EDEnvelope cmn11029 = EnvelopeCreator.createTranzitMessage( 
				messageTypeSubstituion, recvEnv, 
				BusinessSystems.DECLARANT, null 
			);
			
			cmn11029.getEDHeader( ).setSenderCustoms( recvEnv.getReceiverCustoms( ) );
			
			envelopes.add( cmn11029 );
			
			// adm.00006
			
			EDEnvelope adm00006 = EnvelopeCreator.createNotificationMessage( 
				MessageType.ADM_00006, recvEnv, ResultCodes._00_00000_00,
				BusinessSystems.EPS, recvEnv.getSenderCustoms( ) 
			);
				
			CryptoHelper.signEnvelope( adm00006, false );
				
			envelopes.add( adm00006 );			
		}
	}

	private Edecl_Proc_Information getProcInfo( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		String processId = recvEnv.getProcessID( );
		if ( StringUtil.isNullOrEmpty( processId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._01_00041_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);			
		}
		
		ProcedureService procServ = _serviceHolder.getProcedureService( );
		Edecl_Proc_Information procInfo = procServ.getProcedureInformation( processId );

		if ( null == procInfo )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._01_00041_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}		
		
		return procInfo;
	}
}
