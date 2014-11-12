package ru.acs.fts.aud.router.processing;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobBatchContextFactory;

public class AudJobBatchContextFactory extends JobBatchContextFactory
{
	@Override
	public JobBatchContext create( byte[ ] message ) 
		throws BaseProcessingException
	{
		AudJobBatchContext jobBatchContext = new AudJobBatchContext( getConfigurator( ), getServiceHolder( ) );
		jobBatchContext.setMessage( message );
		
		return jobBatchContext;
	}
}
