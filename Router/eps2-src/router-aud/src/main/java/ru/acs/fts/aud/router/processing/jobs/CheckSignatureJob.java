package ru.acs.fts.aud.router.processing.jobs;

import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;

/**
 * (mrdekk)
 * Задача проверена. Здесь как и в CheckSignedEnvelope в электричке стоит бы облегчить обработку 
 * исключительных ситуаций 
 */
public class CheckSignatureJob extends AudJob
{
	private static final String ACTION = "Проверка подписи конверта.";
	
	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		AudEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		if ( CryptoHelper.checkSignEnvelope( recvEnv ) )
			jobBatchContext.getProcessingResult( ).addOKProcessingInfo( ACTION );				
	}
	
	@Override
	public String getAction( )
	{
		return ACTION;
	}
}
