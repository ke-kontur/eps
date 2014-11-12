package ru.acs.fts.eps2.router.processing.jobs;

import ru.acs.fts.eps2.engine.processing.Job;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;

public abstract class EDJob extends Job
{
	@Override
	public void execute( JobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		if ( ! ( jobBatchContext instanceof EDJobBatchContext ) )
		{
			// TODO: Подобрать правильный Exception
			throw new Exception( "Что-то не так с jobBatchContext - не тот класс" );
		}
		
		edExecute( ( EDJobBatchContext )jobBatchContext, jobContext );
	}
	
	protected abstract void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext )
		throws Exception;
}
