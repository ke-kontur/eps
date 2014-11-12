package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;

public class EmptyBusinessProcess extends BusinessProcess
{
	private static final Logger log = LoggerFactory.getLogger( EmptyBusinessProcess.class );

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		log.info( "Бизнес обработка не содержит действий, пропускаем." );
	}

}
