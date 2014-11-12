package ru.acs.fts.aly.router.processing;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobBatchContextFactory;

public class AlyJobBatchContextFactory extends JobBatchContextFactory
{
	@Override
	public JobBatchContext create( byte[ ] message ) 
		throws BaseProcessingException
	{
		AlyJobBatchContext jobBatchContext = new AlyJobBatchContext( getConfigurator( ), getServiceHolder( ) );
		jobBatchContext.setMessage( message );
		
		return jobBatchContext;
	}

}
