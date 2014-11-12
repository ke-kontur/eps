package ru.acs.fts.eps2.engine.error;

import ru.acs.fts.eps2.engine.processing.JobBatch;

public class EmergencyBatchException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	private final JobBatch _emergencyBatch;
	
	// @formatter:off
	public JobBatch getEmergencyBatch( ) { return _emergencyBatch; }
	// @formetter:on
	
	public EmergencyBatchException( JobBatch emergencyBatch )
	{
		_emergencyBatch = emergencyBatch;
	}
}
