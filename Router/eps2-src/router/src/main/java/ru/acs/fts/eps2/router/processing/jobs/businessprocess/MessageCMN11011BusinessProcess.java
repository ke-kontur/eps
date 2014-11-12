package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Substatus_State;
import ru.acs.fts.eps2.router.defines.SpecialProcedureSubStates;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;

import java.util.List;

/**
 * Бизнес процесс для обработки сообщения CMN.11011
 * ( Обращение об отзыве таможенной декларации )
 */
public class MessageCMN11011BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String processId = recvEnv.getProcessID( );
		
		List< Edecl_Substatus_State > substatuses = _serviceHolder.getProcedureService( ).getProcSubStatuses( processId );
		for ( Edecl_Substatus_State substatus : substatuses )
		{
			if ( substatus.getStCode( ).equalsIgnoreCase( SpecialProcedureSubStates.GTD_RECALLING ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00021_03, 
					ProcessingConstants.ERROR_TYPE_BUSINESS 
				);
			}
		}
		
		Edecl_Substatus_State substatus = new Edecl_Substatus_State( );
		substatus.setStCode( SpecialProcedureSubStates.GTD_RECALLING );
		substatus.setProcessId( processId );
		substatus.setDocumentId( recvEnv.getDocument( ).getDocumentID( ) );
		
		_serviceHolder.getProcedureService( ).persist( substatus );
	}
}
