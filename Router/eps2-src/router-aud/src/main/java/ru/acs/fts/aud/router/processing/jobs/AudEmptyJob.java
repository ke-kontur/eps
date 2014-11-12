package ru.acs.fts.aud.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.engine.processing.Job;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;

public class AudEmptyJob extends Job
{
	private static final Logger log = LoggerFactory.getLogger( AudEmptyJob.class );
	
	@Override
	public void execute( JobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		log.info( "Выполняется пустой джоб." );
	}

	@Override
	public String getAction( )
	{
		return "Пустой джоб (АЮД). Ничего не произойдет.";
	}

}
