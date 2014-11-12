package ru.acs.fts.eps2.engine.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.Job;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.checks.ChecksSentence;

public class CompoundChecks extends Job
{
    protected final Logger log = LoggerFactory.getLogger( CompoundChecks.class );
    protected final String action = "Джоб сложных проверок задаваемых из конфигов";
        
	@Override
	public void execute( JobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		log.info( "Начали задачу сложных проверок" );
		
		Object objChecksSentence = jobContext.get( ContextConstants.CHECK_SENTENCE );
		if ( null == objChecksSentence || ! ( objChecksSentence instanceof ChecksSentence ) )
			throw new Exception( "В контексте задачи не найдено проверочное выражение" );
		
		String resultCode = jobContext.getString( ContextConstants.RESULT_CODE );
		if ( null == resultCode )
			resultCode = ResultCodes._09_96669_99;
		
		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		
		Envelope envelope = ( null != envelopeName ) 
			? ( Envelope )jobBatchContext.get( envelopeName ) 
			: jobBatchContext.getReceivedEnvelope( );
			
		ChecksSentence sentence = ( ChecksSentence )objChecksSentence;
		
		if ( ! sentence.check( envelope, jobBatchContext ) )
		{
			String errorMsg = String.format(
				"Проверка конверта %s по сложным проверкам не прошла",
				( null != envelopeName ) ? envelopeName : "received"
			);
			
			log.error( errorMsg );
			
			jobBatchContext.getErrors( ).throwException( 
				errorMsg, envelope.getDocument( ).getDocumentID( ), 
				resultCode, ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		log.info( "Закончили задачу сложных проверок" );
	}

	@Override
	public String getAction( )
	{
		return action;
	}

}
