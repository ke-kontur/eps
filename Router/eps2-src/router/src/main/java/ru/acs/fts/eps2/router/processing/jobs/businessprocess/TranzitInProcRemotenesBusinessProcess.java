package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.schemas.envelope.CustomsType;

/**
 * Простой транзит в рамках процедуры с учетом удаленки
 * 
 * <h1>Параметры JobContext:</h1>
 * <ul>
 * <li><strong>SendInner</strong>: Отправлять ли транзитное сообщение на внутренний ТО</li>
 * <li><strong>SendOuter</strong>: Отправлять ли транзитное сообщение на внешний ТО</li>
 * <li><strong>InnerMapping</strong>: Преобразование MessageType для сообщения на внутренний ТО</li>
 * <li><strong>OuterMapping</strong>: Преобразование MessageType для сообщения на внешний ТО</li>
 * </ul>
 */
public class TranzitInProcRemotenesBusinessProcess extends BusinessProcess
{
	private static final String SEND_INNER = "sendInner";
	private static final String SEND_OUTER = "sendOuter";
	private static final String INNER_MAPPING = "innerMapping";
	private static final String OUTER_MAPPING = "outerMapping";
	
	@Override
	@SuppressWarnings( "unchecked" )
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) throws Exception
	{
		Map< String, Boolean > sendInner = ( Map< String, Boolean > )jobContext.get( SEND_INNER );
		Map< String, Boolean > sendOuter = ( Map< String, Boolean > )jobContext.get( SEND_OUTER );
		Map< String, String > innerMapping = ( Map< String, String > )jobContext.get( INNER_MAPPING );
		Map< String, String > outerMapping = ( Map< String, String > )jobContext.get( OUTER_MAPPING );
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		String messageType = recvEnv.getMessageType( );
		
		Edecl_Proc_Information procInfo = _serviceHolder.getProcedureService( )
			.getProcInformation( recvEnv.getProcessID( ) );
		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		if ( null != sendInner && sendInner.containsKey( messageType ) && sendInner.get( messageType ) )
		{
			String recipientSystem = inferRecipient( recvEnv );
			CustomsType receiverCustoms = inferRecipientCustoms( recvEnv );
			
			EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
				innerMapping, recvEnv, 
				recipientSystem, receiverCustoms 
			);
			
			envelopes.add( transit );
		}
		
		boolean sendCmn00004 = true;
		
		if ( null != sendOuter && sendOuter.containsKey( messageType ) && sendOuter.get( messageType ) && ProcedureUdFlags.isTrivialRemoteness(procInfo.getUdFlag()))
		{
			String recipientSystem = inferRemoteRecipient( recvEnv, procInfo );
			CustomsType receiverCustoms = inferRemoteRecipientCustoms( recvEnv, procInfo );
			
			EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
				outerMapping, recvEnv, 
				recipientSystem, receiverCustoms 
			);
			
			if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.EPS ) )
			{
				transit.getEDHeader( ).setSenderCustoms( inferRemoteSenderCustoms( recvEnv, procInfo ) );
			}
			
			envelopes.add( transit );
			
			if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.EPS ) )
				sendCmn00004 = false;
		}
		
		if ( sendCmn00004 )
		{
			EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
				MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
				recvEnv.getSenderSystem( ), recvEnv.getSenderCustoms( ) 
			);
			
			CryptoHelper.signEnvelope( cmn00004, false );
			
			envelopes.add( cmn00004 );
		}
	}
	
	private String inferRecipient( EDEnvelope recvEnv )
	{
		if ( BusinessSystems.isSuchSystem( recvEnv.getSenderSystem( ), BusinessSystems.DECLARANT ) ||
			 BusinessSystems.isSuchSystem( recvEnv.getSenderSystem( ), BusinessSystems.RZD ) )
			return BusinessSystems.CUSTOMS;
		
		return BusinessSystems.DECLARANT;
	}
	
	private String inferRemoteRecipient( EDEnvelope recvEnv, Edecl_Proc_Information procInfo )
	{
		if ( ProcedureUdFlags.isRemoteRemoteness( procInfo.getUdFlag( ) ) )
			return BusinessSystems.EPS;
		
		return BusinessSystems.CUSTOMS;
	}
	
	private CustomsType inferRecipientCustoms( EDEnvelope recvEnv )
	{
		if ( BusinessSystems.isSuchSystem( recvEnv.getSenderSystem( ), BusinessSystems.DECLARANT ) ||
			 BusinessSystems.isSuchSystem( recvEnv.getSenderSystem( ), BusinessSystems.RZD ) )
			return recvEnv.getReceiverCustoms( );
			
		return null;		
	}
	
	private CustomsType inferRemoteRecipientCustoms( EDEnvelope recvEnv, Edecl_Proc_Information procInfo )
	{
		CustomsType customs = new CustomsType( );
		customs.setCustomsCode( procInfo.getBorderCustCode( ) );
		
		if ( BusinessSystems.isSuchSystem( recvEnv.getSenderSystem( ), BusinessSystems.DECLARANT ) ||
			 BusinessSystems.isSuchSystem( recvEnv.getSenderSystem( ), BusinessSystems.RZD ) )
		{
			customs.setExchType( recvEnv.getReceiverCustoms( ).getExchType( ) );
		}
		else
		{
			customs.setExchType( recvEnv.getSenderCustoms( ).getExchType( ) );
		}
				
		return customs;		
	}
	
	private CustomsType inferRemoteSenderCustoms( EDEnvelope recvEnv, Edecl_Proc_Information procInfo )
	{
		if ( BusinessSystems.isSuchSystem( recvEnv.getSenderSystem( ), BusinessSystems.DECLARANT ) ||
			 BusinessSystems.isSuchSystem( recvEnv.getSenderSystem( ), BusinessSystems.RZD ) )
			return recvEnv.getReceiverCustoms( );
				
		return recvEnv.getSenderCustoms( );				
	}
}
