package ru.acs.fts.aly.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.aly.router.processing.AlyJobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;

public class AlyEmptyJob extends AlyJob
{
	private static final Logger log = LoggerFactory.getLogger( AlyEmptyJob.class );
	
	@Override
	public void alyExecute( AlyJobBatchContext jobBatchContext, JobContext jobContext ) 
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
