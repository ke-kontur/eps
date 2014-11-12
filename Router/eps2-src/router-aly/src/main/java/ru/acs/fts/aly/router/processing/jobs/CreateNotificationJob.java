package ru.acs.fts.aly.router.processing.jobs;

import ru.acs.fts.aly.router.objects.AlyEnvelope;
import ru.acs.fts.aly.router.processing.AlyJobBatchContext;
import ru.acs.fts.aly.router.processing.helpers.MessageCreator;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;

public class CreateNotificationJob extends AlyJob
{
	private static final String ACTION = "Создание уведомления";
	
	@Override
	public void alyExecute( AlyJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		AlyEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String messageType = jobContext.getString( ContextConstants.MESSAGE_TYPE );
	
		String resultCode = getResultCode( jobBatchContext, messageType );

		AlyEnvelope notifEnvelope = MessageCreator.createNotificationMessage( messageType, recvEnv, resultCode, jobBatchContext.getConfigurator( ) );

		jobBatchContext.put( jobContext.getString( ContextConstants.ENVELOPE_NAME ), notifEnvelope );
	}

	@Override
	public String getAction( )
	{
		return ACTION;
	}
	
	private String getResultCode( JobBatchContext jobBatchContext, String messageType )
	{
		String resultCode = ResultCodes._00_00000_00;
		
		if ( ! MessageType.isOkNotification( messageType ) )
			resultCode = jobBatchContext.getInitialFailedResultCode( );
		
		return resultCode;
	}
}
