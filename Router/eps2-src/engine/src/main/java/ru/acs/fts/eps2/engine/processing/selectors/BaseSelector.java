package ru.acs.fts.eps2.engine.processing.selectors;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

/**
 * 
 * @author saa
 *
 * @param <T> Тип селектируемых объектов
 * @param <C> Тип реализации JobBatchContext'а
 */
public abstract class BaseSelector< T, C extends JobBatchContext >
{
	public abstract T select( C jobBatchContext ) throws BaseProcessingException, DatabaseException;
}
