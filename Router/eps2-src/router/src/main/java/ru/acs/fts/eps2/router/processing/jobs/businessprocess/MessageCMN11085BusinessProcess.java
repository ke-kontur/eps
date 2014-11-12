package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.Calendar;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;

public class MessageCMN11085BusinessProcess extends BusinessProcess
{
	private final static String PROC_STATE_AEO_CMT_REGISTRATED = "AEO_Cmt_Registrated";

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		String processId = recvEnv.getProcessID( );
		ProcedureService procedureService = _serviceHolder.getProcedureService( );
		Edecl_Proc_Information procInfo = procedureService.getProcInformation( processId );

		if ( PROC_STATE_AEO_CMT_REGISTRATED.equalsIgnoreCase( procInfo.getCurrentState( ) ) )
		{

			if ( null == procInfo.getDeadline( ) || 
				 procInfo.getDeadline( ).compareTo( Calendar.getInstance( ) ) > 0 )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00108_01, 
					ProcessingConstants.ERROR_TYPE_BUSINESS 
				);
			}
		}
	}
}
