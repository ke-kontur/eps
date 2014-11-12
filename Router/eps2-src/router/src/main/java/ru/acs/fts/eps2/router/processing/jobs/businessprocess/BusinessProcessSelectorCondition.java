package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.CollectionHelper;

/**
 * Условие для выбора бизнес процессов
 * 
 * На данный момент поддерживаются следующие условия
 * messageType или messageTypes: тип или типы сообщения для которых применим бизнес процесс,
 * а также remotenessType: тип удаленки
 */
@Deprecated
public class BusinessProcessSelectorCondition // NO_UCD (use default)
{
	private String messageType;
	private List< String > messageTypes;
	
	private String remotenessType;
	
	private String initialMessageType;
	private List< String > initialMessageTypes;
	
	private String sendingSystem;
	private Boolean sendingSystemNegate;
	
	public void setMessageType( String messageType ) { this.messageType = messageType; }
	public String getMessageType( ) { return messageType; }
	
	public void setMessageTypes( List< String > messageTypes ) { this.messageTypes = messageTypes; }
	public List< String > getMessageTypes( ) { return messageTypes; }
	
	public void setRemotenessType( String remotenessType ) { this.remotenessType = remotenessType; }
	public String getRemotenessType( ) { return remotenessType; }
	
	public void setInitialMessageType( String initialMessageType ) { this.initialMessageType = initialMessageType; }
	public String getInitialMessageType( ) { return initialMessageType; }
	
	public void setInitialMessageTypes( List< String > initialMessageTypes ) { this.initialMessageTypes = initialMessageTypes; }
	public List< String > getInitialMessageTypes( ) { return initialMessageTypes; }
	
	public void setSendingSystem( String sendingSystem ) { this.sendingSystem = sendingSystem; }
	public String getSendingSystem( ) { return sendingSystem; }
	
	public void setSendingSystemNegate( Boolean sendingSystemNegate ) { this.sendingSystemNegate = sendingSystemNegate; }
	public Boolean getSendingSystemNegate( ) { return sendingSystemNegate; }
	
	/**
	 * Проверяет соответствие условия JobBatchContext'у
	 * 
	 * @param jobBatchContext контекст на соответствие которому проверяется
	 * @return true если контекст удовлетворяет условию
	 * @throws DatabaseException 
	 */
	public boolean check( EDJobBatchContext jobBatchContext ) // NO_UCD (use
	// default)
	throws BaseProcessingException, DatabaseException
	{
		EDEnvelope env = jobBatchContext.getReceivedEnvelope( );
		String incomeMessageType = env.getMessageType( );
		boolean satisfied = true;
		
		if ( null != messageType )
		{
			if ( !messageType.equalsIgnoreCase( incomeMessageType ) )
				satisfied = false;
		}
		else if ( !CollectionHelper.isNullOrEmpty( messageTypes ) )
		{
			if ( !messageTypes.contains( incomeMessageType ))
			{
				satisfied = false;
			}
		}
		
		if ( satisfied && null != remotenessType )
		{
			if ( !checkRemotenessType( jobBatchContext ) )
				satisfied = false;
		}
		
		if ( satisfied )
		{
			Edecl_Messages incomeMessage = jobBatchContext.getIncomeMessage( );
			if ( null != initialMessageType )
			{
				if ( null == incomeMessage )
					satisfied = false;
				else if ( !initialMessageType.equalsIgnoreCase( incomeMessage.getMessageType( ) ) )
				satisfied = false;
			}
			else if ( !CollectionHelper.isNullOrEmpty( initialMessageTypes ) )
			{
				if ( !initialMessageTypes.contains( incomeMessage.getMessageType( ) ))
				{
					satisfied = false;
				}
			}
		}
		
		if ( satisfied && null != sendingSystem )
		{
			boolean clause = sendingSystem.equalsIgnoreCase( env.getSenderSystem( ) );
			
			if ( null != sendingSystemNegate && sendingSystemNegate.booleanValue( ) )
			clause = !clause;
			
			if ( !clause )
				satisfied = false;
		}
		
		return satisfied;
	}
	
	private boolean checkRemotenessType( JobBatchContext jobBatchContext )
	{
		return remotenessType.equalsIgnoreCase( 
				jobBatchContext.getString( ContextConstants.REMOTENESS_TYPE ) );
	}
}
