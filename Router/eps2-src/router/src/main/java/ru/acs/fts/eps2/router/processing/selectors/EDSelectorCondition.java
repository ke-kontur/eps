package ru.acs.fts.eps2.router.processing.selectors;

import java.util.List;

import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.selectors.BaseSelectorCondition;
import ru.acs.fts.eps2.engine.processing.selectors.RemotenessTypes;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ServiceHolder;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDConfigurator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.envelope.CustomsType;

public class EDSelectorCondition extends BaseSelectorCondition< EDJobBatchContext >
{
	private static final String REMOTE_MSGKIND_PREFIX = "UD:";
	
	private String messageType = null;
	private List< String > messageTypes = null;
	
	private String exchType = null;
	private List< String > exchTypes = null;
	
	private String initialMessageType = null;
	private List< String > initialMessageTypes = null;
	
	private Boolean isLocalCustoms = null;
	
	private String failScenario = null;
	
	private String remotenessType = null;
	
	private List< String > procInStates = null;
	
	private Boolean procInStatesNegate = false;
	
	private Integer procUdFlag = null;
	
	private List< Integer > procUdFlags = null;
	
	private Boolean procUdFlagNegate = false;
	
	/**
	 * Тип проверки на удаленку
	 */
	private String remotenessCheckType = null;
	
	private String senderCustomsType = null;
	
	private Boolean hasInitialEnvelopeId = null;
	
	private String sendingSystem;
	private Boolean sendingSystemNegate;
	
	/*
	 * Имена типов проверки на удаленку
	 */
	
	/**
	 * Проверка по коду ТО, указанному в элементе MessageKind с префиксом "UD:"
	 */
	private static String MSGKIND_REMOTENESS_CHECK = "MSGKIND";
	
	/**
	 * Проверка по коду ТО, указанному в элементе ReceiverCutoms
	 */
	private static String RCVR_CUSTOMS_REMOTNESS_CHECK = "RCVR_CUSTOMS";
	
	/**
	 * Проверка по коду ТО, указанному в элементе SenderCustoms
	 */
	private static String SENDER_CUSTOMS_REMOTNESS_CHECK = "SENDER_CUSTOMS";
	
	// @formatter:off
	public void setMessageType( String messageType ) { this.messageType = messageType; }
	public String getMessageType( ) { return messageType; }
	
	public void setMessageTypes( List< String > messageTypes ) { this.messageTypes = messageTypes; }
	public List< String > getMessageTypes( ) { return messageTypes; }
	
	public void setExchType( String exchType ) { this.exchType = exchType; }
	public String getExchType( ) { return exchType; }
	
	public void setExchTypes( List< String > exchTypes ) { this.exchTypes = exchTypes; }
	public List< String > getExchTypes( ) { return exchTypes; }
	
	public void setInitialMessageType( String initialMessageType ) { this.initialMessageType = initialMessageType; }
	public String getInitialMessageType( ) { return initialMessageType; }
	
	public void setInitialMessageTypes( List< String > initialMessageTypes ) { this.initialMessageTypes = initialMessageTypes; }
	public List< String > getInitialMessageTypes( ) { return initialMessageTypes; }
	
	public void setIsLocalCustoms( Boolean isLocalCustoms ) { this.isLocalCustoms = isLocalCustoms; }
	public Boolean getIsLocalCustoms( ) { return isLocalCustoms; }
	
	public void setFailScenario( String failScenario ) { this.failScenario = failScenario; }
	public String getFailScenario( ) { return failScenario; }
	
	public void setRemotenessType( String remotenessType ) { this.remotenessType = remotenessType; }
	public String getRemotenessType( ) { return remotenessType; }
	
	public void setRemotenessCheckType( String remotenessCheckType ) { this.remotenessCheckType = remotenessCheckType; }
	public String getRemotenessCheckType( ) { return remotenessCheckType; }
	
	public void setProcInStates( List< String > procInStates ) { this.procInStates = procInStates; }
	public List< String > getProcInStates( ) { return procInStates; }
	
	public void setProcInStatesNegate( Boolean procInStatesNegate ) { this.procInStatesNegate = procInStatesNegate; };
	public Boolean getProcInStatesNegate( ) { return procInStatesNegate; }
	
	public void setProcUdFlag( Integer procUdFlag ) { this.procUdFlag = procUdFlag; }
	public Integer getProcUdFlag( ) { return procUdFlag; }
	
	public void setProcUdFlagNegate( Boolean negate ) { procUdFlagNegate = negate; }
	public Boolean getProcUdFlagNegate( ) { return procUdFlagNegate; }
	
	public void setProcUdFlags( List< Integer > procUdFalgs ) { this.procUdFlags = procUdFalgs; }
	public List< Integer > getProcUdFlags( ) { return procUdFlags; }
	
	public void setReceivingCustomsType( String receivingCustomsType ) { this.senderCustomsType = receivingCustomsType; }
	public String getReceivingCustomsType( ) { return senderCustomsType; }
	
	public void setHasInitialEnvelopeId( Boolean hasInitialEnvelopeId ) { this.hasInitialEnvelopeId = hasInitialEnvelopeId; }
	public Boolean getHasInitialEnvelopeId( ) { return hasInitialEnvelopeId; }
	
	public void setSendingSystem( String sendingSystem ) { this.sendingSystem = sendingSystem; }
	public String getSendingSystem( ) { return sendingSystem; }
	
	public void setSendingSystemNegate( Boolean sendingSystemNegate ) { this.sendingSystemNegate = sendingSystemNegate; }
	public Boolean getSendingSystemNegate( ) { return sendingSystemNegate; }
	// @formatter:on
	
	@Override
	public boolean check( EDJobBatchContext jobBatchContext ) throws DatabaseException
	{
		boolean satisfied = true;
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		if ( ! checkOnSpecificStringValues( messageTypes, messageType, recvEnv.getMessageType( ) ) )
			satisfied = false;
		
		CustomsType receiverCustoms = recvEnv.getReceiverCustoms( );
		if ( satisfied && null != receiverCustoms )
		{
			if ( ! checkOnSpecificStringValues( exchTypes, exchType, receiverCustoms.getExchType( ) ) )
				satisfied = false;
		}
		
		if ( ! checkFailedScenario( jobBatchContext, failScenario ) )
			satisfied = false;

		if ( satisfied && null != remotenessType )
		{
			if ( ! checkRemoteness( jobBatchContext ) )
				satisfied = false;
		}
		
		if ( satisfied )
		{
			Edecl_Messages incomeMessage  = jobBatchContext.getIncomeMessage( );
			if ( null != incomeMessage && ! checkOnSpecificStringValues( initialMessageTypes, initialMessageType, incomeMessage.getMessageType( ) ) )
				satisfied = false;
			if ( null == incomeMessage && ( null != initialMessageTypes || null != initialMessageType ) )
				satisfied = false;
		}
		
		ServiceHolder serviceHolder = jobBatchContext.getServiceHolder( );
		
		if ( null != serviceHolder )
		{
			Edecl_Proc_Information process = jobBatchContext.getProcInfo( ); 
			
			if ( satisfied && null != procInStates )
			{
				if ( null == process || ! checkProcInStates( process ))
					satisfied = false;
			}
			
			if ( satisfied && null != procUdFlag )
			{
				if ( null == process || ! checkProcUdFlag( process ) )
					satisfied = false;
			}
			
			if ( satisfied && null != procUdFlags )
			{
				if ( null != process || ! checkProcUdFlags( process ) )
					satisfied = false;
			}
		}
		
		if ( satisfied && null != senderCustomsType )
		{
			CustomsType customs = recvEnv.getSenderCustoms( );
			
			// TODO: senderCustomsType -> senderSystem
			if ( ! checkCustomsType( customs, senderCustomsType, jobBatchContext.getConfigurator( ) ) )
				satisfied = false;
		}
		
		if ( satisfied && null != hasInitialEnvelopeId )
		{
			boolean empty = StringUtil.isNullOrEmpty( recvEnv.getInitialEnvelopeID( ) );
			if ( ( ! empty && ! hasInitialEnvelopeId ) || ( empty && hasInitialEnvelopeId ) )
				satisfied = false;
		}
		
		if ( satisfied && null != sendingSystem )
		{
			boolean clause = sendingSystem.equalsIgnoreCase( recvEnv.getSenderSystem( ) );
			
			if ( null != sendingSystemNegate && sendingSystemNegate.booleanValue( ) )
				clause = ! clause;
			
			if ( ! clause )
				satisfied = false;
		}
		
		return satisfied;
	}

	private boolean isLocalEps( )
	{
		return RemotenessTypes.LOCAL_EPS.equalsIgnoreCase( remotenessType );
	}
	
	private boolean isRemoteEps( )
	{
		return RemotenessTypes.REMOTE_EPS.equalsIgnoreCase( remotenessType );
	}
	
	private String getCustomsCodeToCheck( EDEnvelope context )
	{
		String code = null;
		if ( isMsgKindCheck( ) )
		{
			String msgKind = context.getApplicationInfo( ).getMessageKind( );
			if ( null != msgKind && 
					msgKind.toUpperCase( ).startsWith( REMOTE_MSGKIND_PREFIX ) )
				code = msgKind.substring( REMOTE_MSGKIND_PREFIX.length( ) );
		}
		else
		{
			if ( isRecvCustomsCheck( ) )
			{
				CustomsType receiverCustoms = context.getReceiverCustoms( );
				if ( null == receiverCustoms )
					return null;
				
				code = receiverCustoms.getCustomsCode( );
			}
			else if ( isSenderCustomsCheck( ) )
			{
				CustomsType senderCustoms = context.getSenderCustoms( );
				if ( null == senderCustoms )
					return null;
				
				code = senderCustoms.getCustomsCode( );
			}
		}
		
		return code;
	}
	
	private boolean isMsgKindCheck( )
	{
		return MSGKIND_REMOTENESS_CHECK.equalsIgnoreCase( remotenessCheckType );
	}
	
	private boolean isRecvCustomsCheck( )
	{
		return RCVR_CUSTOMS_REMOTNESS_CHECK.equalsIgnoreCase( remotenessCheckType );
	}
	
	private boolean isSenderCustomsCheck( )
	{
		return SENDER_CUSTOMS_REMOTNESS_CHECK.equalsIgnoreCase( remotenessCheckType );
	}
	
	private boolean isCustomsBelongsToLocalEps( String customsCode, EDJobBatchContext jobBatchContext )
	{
		// XXX Есть же RemotenessHelper!
		return jobBatchContext.getConfigurator( ).getRtuPatternsHolder( ).match( customsCode );
	}
	
	private boolean checkRemoteness( EDJobBatchContext jobBatchContext )
	{
		boolean result = true;
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		String remoteCustCode = getCustomsCodeToCheck( recvEnv );
		
		if ( null != remoteCustCode ) 
		{
			boolean matchesCodePattern = 
				isCustomsBelongsToLocalEps( remoteCustCode, jobBatchContext );
			
			if ( ! ( ( matchesCodePattern && isLocalEps( ) ) 
					|| ( ! matchesCodePattern && isRemoteEps( ) ) ) )
				result = false;
				
			
			// Наверно, не стоит делать так. Однако к данному моменту мы уже определились 
			// будем использовать данный JobBatch или нет.
			// Если сценарий "наш", то в контекст сценария можно сохранить тип удаленки, так как
			// в последствии он нам может понадобится, а производить одну и ту же проверку дважды 
			// не хотелось бы.
			
			if ( result )
			{
				String remotenessType = matchesCodePattern ? RemotenessTypes.LOCAL_EPS : RemotenessTypes.REMOTE_EPS;
				jobBatchContext.put( ContextConstants.REMOTENESS_TYPE, remotenessType );
			}
		}
		else
			result = false;
		
		return result;
	}
		
	private boolean checkProcInStates( Edecl_Proc_Information process )
	{
		boolean isStateInList = true;
		String state = process.getCurrentState( );
		if ( ! procInStates.contains( state ) )
			isStateInList = false;
		
		return applyNegation( isStateInList, procInStatesNegate );
	}
	
	private boolean checkProcUdFlag( Edecl_Proc_Information process )
	{
		boolean isUdFlagOk = true;
		
		int udFlag = process.getUdFlag( );
		if ( procUdFlag != udFlag )
			isUdFlagOk = false;
		
		return applyNegation( isUdFlagOk, procUdFlagNegate );
	}
	
	private boolean checkProcUdFlags( Edecl_Proc_Information process )
	{
		boolean isUdFlagOk = true;
		
		int udFlag = process.getUdFlag( );
		if ( ! procUdFlags.contains( udFlag ) )
			isUdFlagOk = false;
		
		return applyNegation( isUdFlagOk, procUdFlagNegate );
	}
	
	private boolean applyNegation( boolean check, boolean negate )
	{
		return check ^ negate;
	}
	
	private boolean checkCustomsType( CustomsType customs, String businessSystem, EDConfigurator configurator )
	{
		String code = customs.getCustomsCode( );
		String exchType = customs.getExchType( );
		boolean result = false;
		
		if ( BusinessSystems.isSuchSystem( businessSystem, "ASKTT2" ) )
		{
			if ( isAskttType( code, exchType, configurator ) )
				result = true;
		}
		else if ( BusinessSystems.isSuchSystem( businessSystem, "MALAKHIT" ) )
		{
			if ( isMalakhit( code, exchType, configurator ) )
				result = true;
		}
        else if ( BusinessSystems.isSuchSystem( businessSystem, "ORDER" ) )
        {
            if ( isOrder( code, exchType, configurator ) )
                result = true;
        }
        else if ( BusinessSystems.isSuchSystem( businessSystem, "PAYMENT1" ) )
        {
            if ( isPayment1( code, exchType, configurator ) )
                result = true;
        }
        else if ( BusinessSystems.isSuchSystem( businessSystem, "PAYMENT2" ) )
        {
            if ( isPayment2( code, exchType, configurator ) )
                result = true;
        }
		else if ( BusinessSystems.isSuchSystem( businessSystem, "CUSTOMS" ) )
		{
			if ( isCommonCustoms( code, exchType, configurator ) )
				result = true;
		}
		
		return result;
	}
	
	private boolean isAskttType( String code, String exchType, EDConfigurator configurator )
	{
		return StringUtil.areEqual( code, configurator.getAsktt2CustomsCode( ) ) 
					&& StringUtil.areEqual( exchType, configurator.getAsktt2ExchType( ) );
	}
	
	private boolean isMalakhit( String code, String exchType, EDConfigurator configurator )
	{
		return StringUtil.areEqual( code, configurator.getMalakhitCustomsCode( ) )
					&& StringUtil.areEqual( exchType, configurator.getMalakhitExchType( ) );
	}

    private boolean isOrder( String code, String exchType, EDConfigurator configurator )
    {
        return StringUtil.areEqual( code, configurator.getOrderCustomsCode( ) )
                && StringUtil.areEqual( exchType, configurator.getOrderExchType( ) );
    }

    private boolean isPayment1( String code, String exchType, EDConfigurator configurator )
    {
        return StringUtil.areEqual( code, configurator.getPayment1CustomsCode( ) )
                && StringUtil.areEqual( exchType, configurator.getPayment1ExchType( ) );
    }

    private boolean isPayment2( String code, String exchType, EDConfigurator configurator )
    {
        return StringUtil.areEqual( code, configurator.getPayment2CustomsCode( ) )
                && StringUtil.areEqual( exchType, configurator.getPayment2ExchType( ) );
    }
	
	private boolean isCommonCustoms( String code, String exchType, EDConfigurator configurator )
	{
		return ! isAskttType( code, exchType, configurator ) && ! isMalakhit( code, exchType, configurator );
	}
}
