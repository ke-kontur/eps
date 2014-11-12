package ru.acs.fts.eps2.engine.processing;

import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;

public abstract class Job
{
	public abstract void execute( JobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception;

	public abstract String getAction( );

	protected String errorQueueToSend = ErrorQueueTypes.ERROR_RECV;

	public String getQueueToSendError( )
	{
		return errorQueueToSend;
	}
}
