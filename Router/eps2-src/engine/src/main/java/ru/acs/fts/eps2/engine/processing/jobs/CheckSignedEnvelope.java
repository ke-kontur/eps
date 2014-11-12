package ru.acs.fts.eps2.engine.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.Job;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;

public class CheckSignedEnvelope extends Job
{
	protected final Logger log = LoggerFactory.getLogger( CheckSignedEnvelope.class );
	
	protected final String action = "Проверка подписи конверта";
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_STRUCTURE;
		
	@Override
	public void execute( JobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		Envelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		if ( CryptoHelper.checkSignEnvelope( recvEnv ) )
			jobBatchContext.getProcessingResult( ).addOKProcessingInfo( action );				
	}		

	@Override
	public String getAction( )
	{
		return action;
	}
}
