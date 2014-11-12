package ru.acs.fts.eps2.router.processing.jobs;

import java.util.List;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.defines.ActionEvents;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.Edecl_State_Transmissions;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.model.services.StateTransmissionService;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.EDServiceHolder;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

/**
 * Этот джоб извлекает процедуру, указанную в конверте
 * @author SAA
 * <p>
 * JobContext:<p>
 * <b>eventName</b> - имя сообщения для поиска статусного перехода.
 */
public class CheckProcessTransmission extends EDJob
{	
	private static final String _action = "Проверка наличия статусных переходов у процедуры";
	
	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext )
			throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String processId = recvEnv.getProcessID( );
		
		EDServiceHolder serviceHolder = jobBatchContext.getServiceHolder( );
		ProcedureService procedureService = serviceHolder.getProcedureService( );
		Edecl_Proc_Information process = procedureService.getProcInformation( processId );
		
		if ( null != process )
		{
			List< Edecl_State_Transmissions > transmissions = 
				getTransmissions( jobBatchContext, jobContext, process );
			
			if ( null == transmissions || transmissions.isEmpty( ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._02_00081_01, 
					ProcessingConstants.ERROR_TYPE_BUSINESS 
				);
			}
		}
	}

	@Override
	public String getAction( )
	{
		return _action;
	}
	
	private List< Edecl_State_Transmissions > getTransmissions( 
			EDJobBatchContext jobBatchContext,
			JobContext jobContext, Edecl_Proc_Information process ) 
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String currentState = process.getCurrentState( );
		String messageType = recvEnv.getMessageType( );
		String eventName = getEventName( jobContext, jobBatchContext, recvEnv );
		String softVersion = process.getSoftVersion( );
		
		StateTransmissionService transService = 
			jobBatchContext.getServiceHolder( ).getStateTransmissionService( );
		
		List< Edecl_State_Transmissions > transmissions = transService.getStateTransmissions( 
			currentState, softVersion, 
			messageType, eventName 
		);
		
		if ( null == transmissions || transmissions.isEmpty( ) )
		{
			transmissions = transService.getStateTransmissions( 
				currentState, softVersion,
				messageType, ActionEvents.NO_EVENT
			);
		}
		
		return transmissions;
	}
	
	private String getEventName( JobContext jobContext, EDJobBatchContext jobBatchContext, EDEnvelope recvEnv ) 
		throws ResultTypeException, DatabaseException
	{
		String eventName = jobContext.getString( ContextConstants.EVENT_NAME );
		
		return ( StringUtil.isNullOrEmpty( eventName ) ) 
			? getDefaultEventName( recvEnv, jobBatchContext ) 
			: eventName;
	}
	
	private String getDefaultEventName( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		String defaultEventName = ActionEvents.NO_EVENT;
		
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
			defaultEventName = ActionEvents.DIFF_RTU_EVENT;
		}
		
		return defaultEventName;
	}

}
