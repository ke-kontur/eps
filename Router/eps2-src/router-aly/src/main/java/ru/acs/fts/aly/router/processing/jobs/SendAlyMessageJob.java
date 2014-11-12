package ru.acs.fts.aly.router.processing.jobs;

import ru.acs.fts.aly.router.objects.AlyEnvelope;
import ru.acs.fts.aly.router.processing.AlyJobBatchContext;
import ru.acs.fts.aly.router.processing.definitions.AlyContextConstants;
import ru.acs.fts.aly.router.processing.helpers.MessageSender;
import ru.acs.fts.eps2.engine.processing.JobContext;

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
public class SendAlyMessageJob extends AlyJob
{
	private static final String action = "Отправка сообщения.";
	
	@Override
	public void alyExecute( AlyJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		AlyEnvelope envelope = ( AlyEnvelope )jobBatchContext.get( jobContext.getString( AlyContextConstants.ENVELOPE_NAME ) );		
		MessageSender.send( jobBatchContext, jobContext, envelope );
	}

	@Override
	public String getAction( )
	{
		return action;
	}
}
