package ru.acs.fts.eps2.engine.processing.checks;

import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;

/**
 * Интерфейс для различных проверок в документе
 */
public interface ICheck // NO_UCD (use default)
{
	public boolean check( Envelope envelope, JobBatchContext jobBatchContext ) throws Exception;
}
