package ru.acs.fts.eps2.router.processing.jobs;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.defines.ActionEvents;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.EDServiceHolder;
import ru.acs.fts.eps2.router.persistence.operators.ProcedureOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

/**
 * @author SAA
 * <p>JobContext:</p>
 * <p><b>eventName</b> - имя события, по которому производится переход статуса процедуры</p>
 * <p>JobBatchContext:</p>
 * <p><b>ignoreChangeState</b> - флаг из контекста сценария (выставляется в бизнес-обработке).
 * Если флаг выставлен, то данный джоб игнорируется. (костыль, но пока так)</p>
 * <p><b>ВНИМАНИЕ!</b> Ввиду несовершенства {@link RemotenessHelper} параметр 
 * <b>eventName</b> лучше указывать</p>
 */
public class ChangeProcessState extends EDJob // NO_UCD (use default)
{
	private static final String action = "Изменение состояния процедуры";

	private EDServiceHolder _serviceHolder;
	
	@Required
	public void setServiceHolder( EDServiceHolder serviceHolder ) { _serviceHolder = serviceHolder; }
	public EDServiceHolder getServiceHolder( ) { return _serviceHolder; }

	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext )
			throws Exception
	{
		String ignore = jobContext.getString( ContextConstants.IGNORE_CHANGE_STATE );
		if ( StringUtil.isNullOrEmpty( ignore ) || 
			 ! jobBatchContext.getBoolean( ignore ) )
		{
			ProcedureOperator procedureOperator = jobBatchContext.getServiceHolder( ).getProcedureOperator( );
			
			EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

			String processID = recvEnv.getProcessID( );
			String envelopeId = recvEnv.getEnvelopeID( );
			String messageType = recvEnv.getMessageType( );
	
			procedureOperator.setProcedureNewState( 
				jobBatchContext, envelopeId, processID, messageType, 
				getEvent( jobBatchContext, jobContext ) 
			);
		}

		/**
		 * Про этот финт ушами см. в ContextConstants.java в описании поля KEEPED_PROC_INFO
		 */
		if ( jobBatchContext.contains( ContextConstants.KEEPED_PROC_INFO ) &&
			 jobBatchContext.contains( ContextConstants.KEEPED_PROC_INFO_MSG_TYPE ) )
		{
			ProcedureOperator procedureOperator = jobBatchContext.getServiceHolder( ).getProcedureOperator( );
			
			Edecl_Proc_Information procInfo = 
				( Edecl_Proc_Information )jobBatchContext.get( ContextConstants.KEEPED_PROC_INFO );
			
			EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

			String processId = procInfo.getProcessId( );
			String envelopeId = recvEnv.getEnvelopeID( ); 
			String messageType = jobBatchContext.getString( ContextConstants.KEEPED_PROC_INFO_MSG_TYPE );
			
			procedureOperator.setProcedureNewState( 
				jobBatchContext, envelopeId, processId, messageType,
				getEventSpecCase( procInfo )
			);
		}
	}
	
	private String getEventSpecCase( Edecl_Proc_Information procInfo ) 
		throws ResultTypeException
	{
		String custCode = procInfo.getCustCode( );
		String borderCustCode = procInfo.getBorderCustCode( );
		
		String event = ActionEvents.NO_EVENT;
		
		if ( RemotenessHelper.areCustomsOnDifferentEps( custCode, borderCustCode ) )
		{
			event = ActionEvents.DIFF_RTU_EVENT;
		}
		
		return event;
	}

	@Override
	public String getAction( )
	{
		return action;
	}

	/**
	 * Из контекста задачи извлекается событие
	 * 
	 * @param jobContext контекст
	 * @return событие по строковому имени, либо null если имя не указано
	 * @throws ResultTypeException 
	 * @throws DatabaseException 
	 */
	private String getEvent( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws ResultTypeException, DatabaseException
	{
		String eventName = jobContext.getString( ContextConstants.EVENT_NAME );

		return StringUtil.isNullOrEmpty( eventName ) 
			? getDefaultEvent( jobBatchContext )
			: eventName;
	}

	private String getDefaultEvent( EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String defaultEvent = ActionEvents.NO_EVENT;
		
		Edecl_Proc_Information procInfo = jobBatchContext.getServiceHolder( )
			.getProcedureService( ).getProcInformation( recvEnv.getProcessID( ) );
		
		if ( null == procInfo )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._01_00049_03, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		String customsCode = procInfo.getCustCode( );
		String borderCustomsCode = procInfo.getBorderCustCode( );
		
		if ( ! StringUtil.isNullOrEmpty( customsCode ) &&
			 ! StringUtil.isNullOrEmpty( borderCustomsCode ) &&
			 RemotenessHelper.areCustomsOnDifferentEps( customsCode, borderCustomsCode ) )
		{
			defaultEvent = ActionEvents.DIFF_RTU_EVENT;
		}

		return defaultEvent;
	}
}
