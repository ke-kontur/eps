package ru.acs.fts.eps2.router.processing.jobs;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Substatus_State;
import ru.acs.fts.eps2.model.services.ErrListService;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.utils.StringUtil;

public class CheckProcessSubstatus extends EDJob
{
	private static final String action = "Проверка наличия или отсутствия субстатуса процедуры";
	
	private ProcedureService _procedureService;
	
	private ErrListService _errListService;
	
	@Required
	public void setProcedureService( ProcedureService procedureService ) { _procedureService = procedureService; }
	public ProcedureService getProcedureService( ) { return _procedureService; }
	
	@Required
	public void setErrListService( ErrListService errListService ) { _errListService = errListService; }
	public ErrListService getErrListService( ) { return _errListService; }
	
	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String processId = recvEnv.getProcessID( );
		if ( StringUtil.isNullOrEmpty( processId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00049_01, 
				ProcessingConstants.ERROR_TYPE_AUTH 
			);
		}

		String errorCodeStr = jobContext.getString( ContextConstants.ERROR_CODE );
		String rcode = errorCodeStr;
		
		if ( jobContext.contains( ContextConstants.NEED_PROCESS_SUB_STATUSES ) )
		{
			String needSubStatuses = jobContext.getString( ContextConstants.NEED_PROCESS_SUB_STATUSES );
			String[] subStatuses = needSubStatuses.split( "," );
			
			List< Edecl_Substatus_State > states = _procedureService.getProcSubStatuses( processId );
			boolean subStatusFound = false;
			for ( Edecl_Substatus_State ss : states )
			{
				for ( String subStatus : subStatuses )
				{
					if ( ss.getStCode( ).equalsIgnoreCase( subStatus ) )
						subStatusFound = true;
				}
			}
			
			if ( ! subStatusFound )
			{
				ErrorHelper.throwException( 
					jobBatchContext, rcode, 
					ProcessingConstants.ERROR_TYPE_AUTH 
				);
			}
		}
		
		if ( jobContext.contains( ContextConstants.FORBID_PROCESS_SUB_STATUSES ) )
		{
			String forbidSubStatuses = jobContext.getString( ContextConstants.FORBID_PROCESS_SUB_STATUSES );
			String[] subStatuses = forbidSubStatuses.split( "," );
			
			List< Edecl_Substatus_State > states = _procedureService.getProcSubStatuses( processId );
			boolean subStatusFound = false;
			for ( Edecl_Substatus_State ss : states )
			{
				for ( String subStatus : subStatuses )
				{
					if ( ss.getStCode( ).equalsIgnoreCase( subStatus ) )
						subStatusFound = true;
				}
			}
			
			if ( subStatusFound )
			{
				ErrorHelper.throwException( 
					jobBatchContext, rcode, 
					ProcessingConstants.ERROR_TYPE_AUTH 
				);
			}
		}
		
		jobBatchContext.getProcessingResult( ).addOKProcessingInfo( action );
	}

	@Override
	public String getAction( )
	{
		return action;
	}
}
