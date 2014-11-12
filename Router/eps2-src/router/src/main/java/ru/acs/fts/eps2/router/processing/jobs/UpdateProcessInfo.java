package ru.acs.fts.eps2.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.utils.StringUtil;

public class UpdateProcessInfo extends EDJob
{
	protected final Logger log = LoggerFactory.getLogger( UpdateProcessInfo.class );
	
	protected final String action = "Обновление информации о процедуре";
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_DB_SAVE;
	
	private ProcedureService procedureService;

	@Required
	public void setProcedureService( ProcedureService procedureService ) { this.procedureService = procedureService; }
	public ProcedureService getProcedureService( ) { return procedureService; }

	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		boolean commitFlag = true;
		if ( ! jobContext.getBoolean( ContextConstants.NEED_FLUSH ) )
		{
			commitFlag = false;
			jobBatchContext.getProcessingResult( ).addOKProcessingInfo( action );
		}
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		if ( StringUtil.isNullOrEmpty( recvEnv.getProcessID( ) ) &&
			 ! jobBatchContext.contains( ContextConstants.KEEPED_PROC_INFO ) )
			return ;
		
		if ( null == jobBatchContext.getProcedureChangeInformation( ).getNewProcedureState( ) )
			return;
		
		Edecl_Proc_Information procInfo = null;
		if ( ! StringUtil.isNullOrEmpty( recvEnv.getProcessID( ) ) )
			procInfo = procedureService.getProcInformation( recvEnv.getProcessID( ) );
		else if ( jobBatchContext.contains( ContextConstants.KEEPED_PROC_INFO ) )
			procInfo = ( Edecl_Proc_Information )jobBatchContext.get( ContextConstants.KEEPED_PROC_INFO );
				
		jobBatchContext.getServiceHolder( ).getProcedureOperator( ).updateProcedureData( 
			procInfo,
			jobBatchContext.getProcedureChangeInformation( ),
			jobBatchContext.getReceivedEnvelope( ).getProcedureCreateState( ),
			commitFlag 
		);
	}

	@Override
	public String getAction( )
	{
		return action;
	}
}
