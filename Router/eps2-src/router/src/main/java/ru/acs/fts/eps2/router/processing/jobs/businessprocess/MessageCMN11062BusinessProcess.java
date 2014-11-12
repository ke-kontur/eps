package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.defines.SpecialProcedureStates;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.envelope.CustomsType;

/**
 * 
 * @author SAA
 * <p>
 * JobContext:<p>
 * <b>envelopes</b> - имя списка конвертов из контекста сценария для отправки
 */
public class MessageCMN11062BusinessProcess extends BusinessProcess
{
	private static final String transitToDecl = "transitToDecl";
	
	private static final String transitToExtCustoms = "transitToExtCustoms";
	
	private static final String transitToEps = "transitToEps";
	
	private static final String transitToAsktt2 = "transitToAsktt2";
	
	private static final String adm00006Notif = "adm00006Notif";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String participantId = recvEnv.getParticipantID( );
		String processId = recvEnv.getProcessID( );
		String envelopeId = recvEnv.getEnvelopeID( );
		
		Edecl_Proc_Information process = _serviceHolder.getProcedureService( )
			.getProcInformation( processId );
		
		if ( ! isSenderCustomsRemote( recvEnv.getSenderCustoms( ) ) )
		{
			if ( MessageType.CMN_11062.equalsIgnoreCase( recvEnv.getMessageType( ) ) )
			{
				if ( ProcedureUdFlags.isLocalRemoteness( process.getUdFlag( ) ) )
				{
					if ( isStateUdTrArriveChFinish( process ) )
					{
						prepareTransitoDecl( jobBatchContext, participantId, envelopeId );
						prepareTransitToExtCustoms( jobBatchContext, process, envelopeId );
					}
					else
					{
						prepareTransitoDecl( jobBatchContext, participantId, envelopeId );
					}
				}
				else if ( ProcedureUdFlags.isRemoteRemoteness( process.getUdFlag( ) ) )
				{
					if ( isStateUdTrArriveChFinish( process ) )
					{
						prepareTransitToEps( jobBatchContext, process, envelopeId );
					}
					else
					{
						prepareTransitoDecl( jobBatchContext, participantId, envelopeId );
					}
				}
				else if ( ProcedureUdFlags.isEconomicOperator( process.getUdFlag( ) ) )
				{
					prepareTransitoDecl( jobBatchContext, participantId, envelopeId );
					prepareTransitToAsktt2( jobBatchContext, process, envelopeId, MessageType.MSG_11037 );
				}
				else
				{
					prepareTransitoDecl( jobBatchContext, participantId, envelopeId );
				}
			}
			else
			{
				if ( isStateUdTrArriveChFinish( process ) )
				{
					if ( isOneEps( process ) ) // UD_FLAG == 2
					{
						prepareTransitoDecl( jobBatchContext, participantId, envelopeId );
						prepareTransitToExtCustoms( jobBatchContext, process, envelopeId );
					}
					else
					{
						prepareTransitToEps( jobBatchContext, process, envelopeId );
					}
				}
				else
				{
					if ( isAskttExchange( process ) )
					{
						prepareTransitoDecl( jobBatchContext, participantId, envelopeId );
						prepareTransitToAsktt2( jobBatchContext, process, envelopeId, null );
					}
					else
					{
						prepareTransitoDecl( jobBatchContext, participantId, envelopeId );	
					}
				}
			}
		}
		else
		{
			prepareAdm00006Notification( jobBatchContext, envelopeId );
		}
	}
	
	/*
	 * Бизнес-обработки для разных случаев
	 */
	
	/*
	 * Одно РТУ, ТО -> Декларант
	 */
	
	/*
	 * Методы для "подготовки" конвертов
	 */
	private EDEnvelope prepareTransitoDecl( EDJobBatchContext jobBatchContext, String participantId, String incomeEnvelopeId ) 
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope transit = ( EDEnvelope ) jobBatchContext.get( transitToDecl );
		
		EnvelopeCreator.reRouteMessage( 
			transit, transit.getSenderCustoms( ), 
			BusinessSystems.DECLARANT, null, 
			null /* InitialEnvelopeID */, 
			incomeEnvelopeId 
		);
		
		return transit;
	}
	
	private EDEnvelope prepareTransitToExtCustoms( EDJobBatchContext jobBatchContext, Edecl_Proc_Information process, String incomeEnvelopeId ) 
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope transit = ( EDEnvelope )jobBatchContext.get( transitToExtCustoms );
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		CustomsType receiverCustoms = new CustomsType( );
		receiverCustoms.setCustomsCode( process.getBorderCustCode( ) );
		receiverCustoms.setExchType( String.valueOf( process.getExchType( ) ) );
		
		EnvelopeCreator.reRouteMessage( 
			transit, 
			recvEnv.getSenderCustoms( ), 
			BusinessSystems.CUSTOMS, receiverCustoms, 
			null /* InitialEnvelopeID */, 
			incomeEnvelopeId 
		);
				
		return transit;
	}
	
	private EDEnvelope prepareTransitToEps( EDJobBatchContext jobBatchContext, Edecl_Proc_Information process, String incomeEnvelopeId ) 
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope transit = ( EDEnvelope )jobBatchContext.get( transitToEps );
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		CustomsType receiverCustoms = new CustomsType( );
		receiverCustoms.setCustomsCode( process.getBorderCustCode( ) );
		receiverCustoms.setExchType( String.valueOf( process.getExchType( ) ) );
		
		EnvelopeCreator.reRouteMessage( 
			transit, recvEnv.getSenderCustoms( ), 
			BusinessSystems.EPS, receiverCustoms, 
			null /* InitialEnvelopeID */, 
			incomeEnvelopeId 
		);
		
		return transit;
	}
	
	private EDEnvelope prepareTransitToAsktt2( EDJobBatchContext jobBatchContext, Edecl_Proc_Information process, String incomeEnvelopeId, String messageType ) 
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		EDEnvelope transit = ( EDEnvelope )jobBatchContext.get( transitToAsktt2 );
		
		CustomsType receiverCustoms = new CustomsType( );
		receiverCustoms.setCustomsCode( jobBatchContext.getConfigurator( ).getAsktt2CustomsCode( ) );
		receiverCustoms.setExchType( recvEnv.getSenderCustoms( ).getExchType( ) );
		
		EnvelopeCreator.reRouteMessage( 
			transit, 
			getCustomsType( process.getCustCode( ), String.valueOf( ( process.getExchType( ) ) ) ), /* SenderCustoms */ 
			BusinessSystems.ASKTT2, receiverCustoms, 
			null /* InitialEnvelopeID */, 
			incomeEnvelopeId 
		);
				
		if ( ! StringUtil.isNullOrEmpty( messageType ) )
			transit.getEDHeader( ).setMessageType( messageType );
		
		return transit;
	}
	
	private void prepareAdm00006Notification( EDJobBatchContext jobBatchContext, String incomeEnvelopeId ) 
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope response = ( EDEnvelope ) jobBatchContext.get( adm00006Notif );
		
		EnvelopeCreator.reRouteMessage( 
			response, response.getSenderCustoms( ), 
			BusinessSystems.EPS, response.getReceiverCustoms( ), 
			response.getInitialEnvelopeID( ), incomeEnvelopeId 
		);
	}
	
	private CustomsType getCustomsType( String code, String exchType )
	{
		CustomsType customs = new CustomsType( );
		customs.setCustomsCode( code );
		customs.setExchType( exchType );
		
		return customs;
	}
		
	private boolean isStateUdTrArriveChFinish( Edecl_Proc_Information process )
	{
		return SpecialProcedureStates.isSuchState( 
			process.getCurrentState( ), 
			SpecialProcedureStates.UD_TR_ARRIVE_CH_FINISH 
		);
	}
	
	private boolean isOneEps( Edecl_Proc_Information process )
	{
		return ! ProcedureUdFlags.isRemoteRemoteness(  process.getUdFlag( ) );
	}
	
	private boolean isAskttExchange( Edecl_Proc_Information process )
	{
		return ProcedureUdFlags.isEconomicOperator( process.getUdFlag( ) );
	}
	
	private boolean isSenderCustomsRemote( CustomsType senderCustoms )
	{
		if ( null == senderCustoms )
			return false;
		
		return RemotenessHelper.isCustomsRemote( senderCustoms.getCustomsCode( ) );
	}
}
