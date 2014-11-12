package ru.acs.fts.eps2.router.processing.jobs;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.error.DiscardMessageException;
import ru.acs.fts.eps2.engine.persistence.embedded.EnvelopeManager;
import ru.acs.fts.eps2.engine.persistence.embedded.EnvelopeProcessInfo;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;

public class SaveToInnerDbJob extends EDJob
{
	protected final Logger log = LoggerFactory.getLogger( SaveToInnerDbJob.class );

	protected final String action = "Вызов web-сервиса Event";

	private EnvelopeManager envelopeManager;

	@Required
	public void setEnvelopeManager( EnvelopeManager envelopeManager ) { this.envelopeManager = envelopeManager; }
	public EnvelopeManager getEnvelopeManager( ) { return envelopeManager; }

	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		/**
		 * Здесь rollback всегда передается как true потому, что предполагается
		 * использование этой задачи в ветке, где происходит откат транзакции 
		 * 
		 * Если вдруг когда-то понадобится использовать эту задачу в ветке, где
		 * отката не происходит - надо будет ввести в JobContext соответствующий 
		 * параметр
		 */
		saveResultOfProcessingToInnerDb( jobBatchContext, true );
	}

	@Override
	public String getAction( )
	{
		return action;
	}

	private void saveResultOfProcessingToInnerDb( EDJobBatchContext jobBatchContext, Boolean rollBack ) 
		throws DiscardMessageException
	{
		try
		{
			EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

			String incomeEnvelopeId = recvEnv.getEnvelopeID( );

			EnvelopeProcessInfo procInfo = 
					envelopeManager.getProcessInfoByEnvelopeId( incomeEnvelopeId );
			if ( procInfo == null )
				procInfo = new EnvelopeProcessInfo( incomeEnvelopeId );

			procInfo.setFailScenario( jobBatchContext.getFailScenario( ) );
			procInfo.setIsIncome( false );
			procInfo.setIsOutcome( true );
			procInfo.setIsRolledBack( rollBack );
			procInfo.setRunningMode( jobBatchContext.getRunningMode( ) );
			procInfo.setProcessDateTime( new Date( ) );
			procInfo.setProcessingResult( jobBatchContext.getInitialFailedResultCode( ) );
			if ( jobBatchContext.getContextException( ) instanceof ResultTypeException )
				procInfo.setPreviousException( jobBatchContext.getContextException( ) );
			
			envelopeManager.saveEnvelopeInfo( procInfo );
		}
		catch ( Exception e )
		{
			String errorMsg = String.format( 
				"ошибка сохранения во внутреннюю БД. Упс. %s\n",
				e.getMessage( )
			);
			
			log.error( errorMsg, e );
			
			throw new DiscardMessageException( jobBatchContext.getMessage( ), ErrorQueueTypes.ERROR_FATAL );
		}
	}

}
