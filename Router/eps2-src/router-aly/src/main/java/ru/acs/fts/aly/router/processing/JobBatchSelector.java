package ru.acs.fts.aly.router.processing;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.processing.JobBatch;
import ru.acs.fts.eps2.engine.processing.selectors.BaseSelector;

public class JobBatchSelector extends BaseSelector< JobBatch, AlyJobBatchContext > // NO_UCD (use default)
{
	private JobBatchSelectorCondition _condition;
	private JobBatch _jobBatch;
	
	// @formatter:off
	@Required
	public void setCondition( JobBatchSelectorCondition condition ) { _condition = condition; }
	public JobBatchSelectorCondition getCondition( ) { return _condition; }
	
	@Required
	public void setJobBatch( JobBatch jobBatch ) { _jobBatch = jobBatch; }
	public JobBatch getJobBatch( ) { return _jobBatch; }
	// @formatter:on
	
	public JobBatch select( AlyJobBatchContext jobBatchContext ) // NO_UCD (use default)
	{
		if ( null != _condition && _condition.check( jobBatchContext ) )
			return _jobBatch;
		
		return null;
	}
}
