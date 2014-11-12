package ru.acs.fts.eps2.engine.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.engine.processing.Job;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;

public class EmptyJob extends Job
{
    protected final Logger log = LoggerFactory.getLogger( EmptyJob.class );
    protected final String action = "Пустое задание";

	@Override
	public void execute( JobBatchContext jobBatchContext, JobContext jobContext )
			throws Exception
	{
		// do nothing yet
	}

	@Override
	public String getAction( )
	{
		return action;
	}

}
