package ru.acs.fts.eps2.engine.processing.jobs;

import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.Job;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;

public class ClearSignature extends Job
{
	protected final String action = "Очистка сообщения от подписи";
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_FATAL;

	@Override
	public void execute( JobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		Envelope envelope = ( Envelope )jobBatchContext.get( 
			jobContext.getString( ContextConstants.ENVELOPE_NAME )
		);
		
		// boolean cleanSignSubDocuments = jobContext.getBoolean( ContextConstants.CLEAR_SIGN_SUB_DOCUMENTS );
		envelope.setDocument( CryptoHelper.removeSignature( envelope ) );
		
		jobBatchContext.getProcessingResult( ).addOKProcessingInfo( action );
	}

	@Override
	public String getAction( )
	{
		return action;
	}
}
