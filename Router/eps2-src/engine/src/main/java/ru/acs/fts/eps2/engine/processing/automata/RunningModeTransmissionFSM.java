package ru.acs.fts.eps2.engine.processing.automata;

import java.util.List;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;

public class RunningModeTransmissionFSM
{
	private List< RunningModeTransmission > _transmissions;
	
	// @formatter:off
	public void setTransmissions( List< RunningModeTransmission > transmissions ) { _transmissions = transmissions; }
	public List< RunningModeTransmission > getTransmissions( ) { return _transmissions; }
	// @formatter:on
	
	public RunningModeTransmission select( String runningMode, String errorType )
	{
		for ( RunningModeTransmission transmission : _transmissions )
		{
			if ( transmission.select( runningMode, errorType ) )
				return transmission;
		}
		
		RunningModeTransmission transmission = new RunningModeTransmission( );
		transmission.setRunningMode( runningMode );
		transmission.setErrorType( errorType );
		transmission.setFailScenario( ProcessingConstants.FAIL_SCENARIO_KILL ); 
		
		return transmission;
	}
}
