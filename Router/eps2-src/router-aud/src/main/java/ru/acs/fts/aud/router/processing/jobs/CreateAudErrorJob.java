package ru.acs.fts.aud.router.processing.jobs;

import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.AudContextConstants;
import ru.acs.fts.aud.router.processing.definitions.MessageKinds;
import ru.acs.fts.aud.router.processing.exceptions.BaseAudException;
import ru.acs.fts.aud.router.processing.helpers.DocumentCreator;
import ru.acs.fts.aud.router.processing.helpers.MessageCreator;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.schemas.aud.aud_error.AUDErrorType;

/**
 * OUTPUT:<p>
 * JobBatchContext:<p>
 * <b>audErrorEnvelope</b> - конверт ошибочного сообщения
 * <p>
 * <b>inTransaction</b> - в транзакции ли?
 * <b>audErrorEnvelope</b> - имя ошибочного конверта (в контексте батча обработки)
 */
public class CreateAudErrorJob extends AudJob
{
	private static final String action = "Создание сообщения об ошибке в работе АЮДа";
	
	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		AudEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		BaseAudException exc = jobBatchContext.getContextException( );
		boolean isRethrow = ( null == exc ) ? false : exc.getIsRethrow( );		
		
		AUDErrorType audError = DocumentCreator.createAudError( 
			recvEnv.getDocument( ).getDocumentID( ),
			exc, ! isRethrow 
		);
		
		AudEnvelope audErrorEnvelope = MessageCreator.createNotificationEnvelope( 
			MessageKinds.AUD_ERROR, recvEnv, 
			audError, jobBatchContext.getConfigurator( ) 
		);
		
		String audErrorEnvelopeName = jobContext.getString( AudContextConstants.ENVELOPE_NAME );
		if ( null == audErrorEnvelopeName )
			audErrorEnvelopeName = AudContextConstants.AUD_ERROR_ENVELOPE;
		
		jobBatchContext.put( audErrorEnvelopeName, audErrorEnvelope );
		jobBatchContext.put( AudContextConstants.IN_TRANSACTION, isRethrow );
		
		jobBatchContext.getServerStatistics( ).increaseErrorsCount( );
	}
	
	@Override
	public String getAction( )
	{
		return action;
	}
}
