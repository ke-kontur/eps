package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Substatus_State;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;

public class MessageCMN11009BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnvelope = jobBatchContext.getReceivedEnvelope( );
		String processId = recvEnvelope.getProcessID( );
		
		List< Edecl_Substatus_State > substatuses = _serviceHolder.getProcedureService( ).getProcSubStatuses( processId );
		
		if ( substatuses != null && ! substatuses.isEmpty( ) )
		{
			ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00021_03, 
					ProcessingConstants.ERROR_TYPE_BUSINESS 
				);
		}
	}
}
