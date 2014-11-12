package ru.acs.fts.eps2.router.processing.jobs;

import java.util.List;

import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.utils.StringUtil;

/**
 * JobContext:<p>
 * <b>messageTypes</b> - не указанные в данном списке сообщения игнорируются джобом
 */
public class OptionalChangeProcessState extends ChangeProcessState
{
	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext )
			throws Exception
	{
		List< String > messageTypes = jobContext.getList( ContextConstants.MESSAGE_TYPES );
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		String messageType = recvEnv.getMessageType( );
		if ( messageTypes.contains( messageType ) && 
			 ! StringUtil.isNullOrEmpty( recvEnv.getProcessID( ) ) )
		{
			super.edExecute( jobBatchContext, jobContext );
		}
	}
}
