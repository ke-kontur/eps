package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;

/**
 * Бизнес процесс для обработки сообщения MSG.11022 в удаленном РТУ
 * TODO: Удалить этот БП нафиг
 */
@Deprecated
public class MessageMSG11022RemoteEpsBusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		// do nothing
	}
}
