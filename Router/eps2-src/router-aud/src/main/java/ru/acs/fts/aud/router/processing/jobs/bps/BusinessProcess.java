package ru.acs.fts.aud.router.processing.jobs.bps;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.router.model.AudServiceHolder;
import ru.acs.fts.aud.router.model.managers.ArchiveManager;
import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.AudContextConstants;
import ru.acs.fts.aud.router.utils.StringUtil;
import ru.acs.fts.eps2.engine.processing.JobContext;

public abstract class BusinessProcess
{
	protected AudServiceHolder _serviceHolder;
	protected ArchiveManager _archiveManager; // NO_UCD (use private)
	
	// @formatter:off
	@Required
	public void setServiceHolder( AudServiceHolder serviceHolder ) { _serviceHolder = serviceHolder; }
	public AudServiceHolder getServiceHolder( ) { return _serviceHolder; }
	
	@Required
	public void setArchiveManager( ArchiveManager archiveManager ) { _archiveManager = archiveManager; }
	public ArchiveManager getArchiveManager( ) { return _archiveManager; }
	// @formatter:on
	
	abstract public void process( AudJobBatchContext jobBatchContext, JobContext jobContext ) throws Exception;
	
	protected void putEnvelopeIntoContext( AudJobBatchContext jobBatchContext, JobContext jobContext, AudEnvelope envelope )
	{
		String envelopeName = jobContext.getString( AudContextConstants.ENVELOPE_NAME );
		if ( StringUtil.isNullOrEmpty( envelopeName ) )
			envelopeName = AudContextConstants.ENVELOPE;
		
		jobBatchContext.put( envelopeName, envelope );
	}
	
	@SuppressWarnings( "unchecked" )
	protected < T > T getProperty( AudJobBatchContext jobBatchContext, JobContext jobContext, String key ) // NO_UCD (unused code)
	{
		T value = null;
		
		if ( null != key )
		{
			String contextKey = jobContext.getString( key );
			if ( null != contextKey )
				value = ( T ) jobBatchContext.get( contextKey );
		}
		
		return value;
	}
}
