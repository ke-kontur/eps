package ru.acs.fts.eps2.engine.processing.automata;

import ru.acs.fts.eps2.engine.processing.JobBatchContext;

public class RunningModeTransmission
{
	private String _runningMode;
	private String _errorType;	
	private String _failScenario;
	
	// @formatter:off
	public void setRunningMode( String runningMode ) { _runningMode = runningMode; }
	public String getRunningMode( ) { return _runningMode; }
	
	public void setErrorType( String errorType ) { _errorType = errorType; }
	public String getErrorType( ) { return _errorType; }
	
	public void setFailScenario( String failScenario ) { _failScenario = failScenario; }
	public String getFailScenario( ) { return _failScenario; }
	// @formatter:on
	
	public boolean select( String runningMode, String errorType ) // NO_UCD (use default)
	{
		return ( _runningMode.equalsIgnoreCase( runningMode ) && 
				 _errorType.equalsIgnoreCase( errorType ) );
	}
	
	public void process( JobBatchContext jobBatchContext )
	{
		jobBatchContext.setRunningMode( _errorType );
		jobBatchContext.setFailScenario( _failScenario ); 
	}
}
