package ru.acs.fts.aud.router.processing.jobs;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.router.model.AudServiceHolder;
import ru.acs.fts.aud.router.model.managers.ArchiveManager;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.eps2.engine.processing.Job;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;

public abstract class AudJob extends Job // NO_UCD (use default)
{
	protected AudServiceHolder _serviceHolder;
	protected ArchiveManager _archiveManager;
	
	// @formatter:off
	@Required
	public void setServiceHolder( AudServiceHolder serviceHolder ) { _serviceHolder = serviceHolder; }
	public AudServiceHolder getServiceHolder( ) { return _serviceHolder; }
	
	@Required
	public void setArchiveManager( ArchiveManager archiveManager ) { _archiveManager = archiveManager; }
	public ArchiveManager getArchiveManager( ) { return _archiveManager; }
	// @formatter:on
	
	@Override
	public void execute( JobBatchContext jobBatchContext, JobContext jobContext ) throws Exception
	{
		audExecute( ( AudJobBatchContext )jobBatchContext, jobContext );
	}
	
	public abstract void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception;
}
