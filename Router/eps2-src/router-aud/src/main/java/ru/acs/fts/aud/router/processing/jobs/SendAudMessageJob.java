package ru.acs.fts.aud.router.processing.jobs;

import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.AudContextConstants;
import ru.acs.fts.aud.router.processing.helpers.MessageSender;
import ru.acs.fts.eps2.engine.processing.JobContext;

/**
 * (mrdekk)
 * Проверено. Недостатки исправлены
 */
/**
 * <h2><strong>JobContext:</strong></h2>
 * <ul>
 * <li><b>inTransaction</b> - в транзакции ли отправляем сообщения? Если не указан, то смотрится аналогичное значение в контексте сценария</li>
 * <li><b>queueKey</b> - ключ очереди в словаре очередей</li>
 * <li><b>envelopeName</b> - имя конверта в контексте сценария</li>
 * </ul>
 * <h2><strong>JobBatchContext:</strong></h2>
 * <ul>
 * <li><b>inTransaction</b> - если указан в контексте задачи, то игнорируется. Если не указан ни в одном контексте, то берется значение по умоланию.</li>
 * </ul>
 */
public class SendAudMessageJob extends AudJob
{
	private static final String action = "Отправка сообщения.";
	
	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		// String queueKey = jobContext.getString( AudContextConstants.QUEUE_KEY );
		
		AudEnvelope envelope = ( AudEnvelope )jobBatchContext.get( jobContext.getString( AudContextConstants.ENVELOPE_NAME ) );		
		MessageSender.send( jobBatchContext, jobContext, envelope );
	}

	@Override
	public String getAction( )
	{
		return action;
	}
}
