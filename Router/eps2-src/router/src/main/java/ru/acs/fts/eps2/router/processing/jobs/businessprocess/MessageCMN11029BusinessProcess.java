package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

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

public class MessageCMN11029BusinessProcess extends BusinessProcess
{
	private List< String > _notSendMsg11025Statuses;
	
	// @formatter:off
	@Required
	public void setNotSendMsg11025Statuses( List< String > notSendMsg11025Statuses ) { _notSendMsg11025Statuses = notSendMsg11025Statuses; }
	public List< String > getNotSendMsg11025Statuses( ) { return _notSendMsg11025Statuses; }
	// @formatter:on
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );

		Edecl_Proc_Information procInfo = getProcInfo( recvEnv, jobBatchContext );

		if ( ProcedureUdFlags.isLocalRemoteness( procInfo.getUdFlag( ) ) )
		{
			/** Локальная удаленка */
			
			// cmn.11029
			
			EDEnvelope cmn11029 = EnvelopeCreator.createTranzitMessage( 
				null, recvEnv, 
				BusinessSystems.DECLARANT, null
			);
			
			envelopes.add( cmn11029 );

			if ( ! isMsg11025Forbidden( procInfo ) )
			{
				// msg.11025
				
				Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
				messageTypeSubstituion.put( MessageType.CMN_11029, MessageType.MSG_11025 );
				
				CustomsType receiverCustoms = new CustomsType( );
				receiverCustoms.setCustomsCode( procInfo.getBorderCustCode( ) );
				receiverCustoms.setExchType( recvEnv.getSenderCustoms( ).getExchType( ) );
				
				EDEnvelope msg11025 = EnvelopeCreator.createTranzitMessage( 
					messageTypeSubstituion, recvEnv, 
					BusinessSystems.CUSTOMS, receiverCustoms 
				);
				
				envelopes.add( msg11025 );
			}
			
			// cmn.00004
			
			EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
				MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
				BusinessSystems.CUSTOMS, recvEnv.getSenderCustoms( ) 
			);
			
			CryptoHelper.signEnvelope( cmn00004, false );
			
			envelopes.add( cmn00004 );
		}
		else if ( ProcedureUdFlags.isRemoteRemoteness( procInfo.getUdFlag( ) ) && ! isMsg11025Forbidden( procInfo ) )
		{
			/** Удаленная удаленка */

			// msg.11025
			
			Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
			messageTypeSubstituion.put( MessageType.CMN_11029, MessageType.MSG_11025 );
			
			CustomsType receiverCustoms = new CustomsType( );
			receiverCustoms.setCustomsCode( procInfo.getBorderCustCode( ) );
			receiverCustoms.setExchType( recvEnv.getSenderCustoms( ).getExchType( ) );
			
			EDEnvelope msg11025 = EnvelopeCreator.createTranzitMessage( 
				messageTypeSubstituion, recvEnv, 
				BusinessSystems.EPS, receiverCustoms 
			);
			
			envelopes.add( msg11025 );
		}
		else
		{
			/** Нет удаленки */
			
			// cmn.11029
			
			EDEnvelope cmn11029 = EnvelopeCreator.createTranzitMessage( 
				null, recvEnv, 
				BusinessSystems.DECLARANT, null
			);
			
			envelopes.add( cmn11029 );
			
			// cmn.00004
			
			EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
				MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
				BusinessSystems.CUSTOMS, recvEnv.getSenderCustoms( ) 
			);
			
			CryptoHelper.signEnvelope( cmn00004, false );
			
			envelopes.add( cmn00004 );
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

	private boolean isMsg11025Forbidden( Edecl_Proc_Information procInfo )
	{
		if ( _notSendMsg11025Statuses.contains( procInfo.getCurrentState( ) ) )
			return true;
		
		return false;
	}
}
