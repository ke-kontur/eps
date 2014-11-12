package ru.acs.fts.aud.router.processing.jobs;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.exceptions.BaseAudException;
import ru.acs.fts.aud.router.processing.ArchiveErrorQueueTypes;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.eps2.engine.error.DiscardMessageException;
import ru.acs.fts.eps2.engine.persistence.embedded.EnvelopeManager;
import ru.acs.fts.eps2.engine.persistence.embedded.EnvelopeProcessInfo;
import ru.acs.fts.eps2.engine.processing.JobContext;

public class SaveToAudInnerDbJob extends AudJob
{
	private static final Logger log = LoggerFactory.getLogger( SaveToAudInnerDbJob.class );
	
	protected final String action = "Сохранение в Inner DB";

	private EnvelopeManager _envelopeManager;

	// @formatter:off
	@Required public void setEnvelopeManager( EnvelopeManager envelopeManager ) { this._envelopeManager = envelopeManager; }
	public EnvelopeManager getEnvelopeManager( ) { return _envelopeManager; }
	// @formatter:on
	
	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		try
		{
			AudEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

			String incomeEnvelopeId = recvEnv.getEnvelopeID( );

			EnvelopeProcessInfo procInfo = _envelopeManager.getProcessInfoByEnvelopeId( incomeEnvelopeId );
			if ( null == procInfo )
				procInfo = new EnvelopeProcessInfo( incomeEnvelopeId );

			procInfo.setFailScenario( jobBatchContext.getFailScenario( ) );
			procInfo.setIsIncome( false );
			procInfo.setIsOutcome( true );
			procInfo.setIsRolledBack( true ); 
			procInfo.setRunningMode( jobBatchContext.getRunningMode( ) );
			procInfo.setProcessDateTime( new Date( ) );
			procInfo.setProcessingResult( jobBatchContext.getInitialFailedResultCode( ) );
			if ( jobBatchContext.getContextException( ) instanceof BaseAudException )
				procInfo.setPreviousException( ( BaseAudException ) jobBatchContext.getContextException( ) );
			
			_envelopeManager.saveEnvelopeInfo( procInfo );
		}
		catch ( Exception e )
		{
			String errorMsg = String.format( 
				"Ошибка сохранения во внутреннюю БД. Упс. %s\n",
				e.getMessage( )
			);
			
			log.error( errorMsg, e );
			
			throw new DiscardMessageException( jobBatchContext.getMessage( ), ArchiveErrorQueueTypes.AUD_SERVER_ERRORS );
		}
	}

	@Override
	public String getAction( )
	{
		return action;
	}
}
