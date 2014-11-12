package ru.acs.fts.eps2.router.processing.selectors;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.processing.JobBatch;
import ru.acs.fts.eps2.engine.processing.selectors.BaseSelector;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

/**
 * Содержит в себе JobBatch и условие его отдачи. При вызове метода select проверяет условие
 * и если оно удовлетворяется, отдает свой JobBatch. В противном случае - возвращает null.
 */
public class JobBatchSelector extends BaseSelector< JobBatch, EDJobBatchContext >
{
	private EDSelectorCondition condition;
	private JobBatch jobBatch;
	
	@Required
	public void setCondition( EDSelectorCondition condition ) { this.condition = condition; }
	public EDSelectorCondition getCondition( ) { return condition; }
	
	@Required
	public void setJobBatch( JobBatch jobBatch ) { this.jobBatch = jobBatch; }
	public JobBatch getJobBatch( ) { return jobBatch; }
	
	/**
	 * Проверяет jobBatchContext на внутреннее условие и при его удовлетворении возвращает свой
	 * JobBatch
	 * 
	 * @param jobBatchContext контекст для проверки внутреннего условия
	 * @return jobBatch если условие ( condition ) выполняется, null - в противном случае
	 * @throws Exception 
	 */
	public JobBatch select( EDJobBatchContext jobBatchContext )
		throws BaseProcessingException, DatabaseException
	{
		if ( null != condition && condition.check( jobBatchContext ) )
			return jobBatch;
		
		return null;
	}
}
