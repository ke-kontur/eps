package ru.acs.fts.eps2.engine.persistence.embedded;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;

import java.util.Date;

public class EnvelopeProcessInfo
{
	/**
	 * Именно столько попыток делается при обработке одного конкретного
	 * сообщения.
	 */
	public final static int COUNT_FOR_PROCESSING = 10;
	
	private String _envelopeId;
	private boolean _isRolledBack = false;
	private String _processingResult = ResultCodes._00_00000_00;
	private String _exception;
	private String _stackTrace;
	private String _description;
	private boolean _isIncome = true;
	private boolean _isOutcome = false;
	private String _runningMode = ProcessingConstants.ERROR_TYPE_NORMAL;
	private int _processingCount = 1;
	private int _countBeforeKill = 10;
	private Date _processDateTime = new Date( );
	private String _failScenario;
	private BaseProcessingException _previousException;
	
	// @formatter:off
	public void setEnvelopeId( String envelopeId ) { _envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return _envelopeId; }
	
	public void setIsRolledBack( boolean isRolledBack ) { _isRolledBack = isRolledBack; }
	public boolean getIsRolledBack( ) { return _isRolledBack; }
	
	public void setProcessingResult( String processingResult ) { _processingResult = processingResult; }
	public String getProcessingResult( ) { return _processingResult; }
	
	public void setException( String exception ) { _exception = exception; }
	public String getException( ) { return _exception; }
	
	public void setStackTrace( String stackTrace ) { _stackTrace = stackTrace; }
	public String getStackTrace( ) { return _stackTrace; }
	
	public void setDescription( String description ) { _description = description; }
	public String getDescription( ) { return _description; }
	
	public void setIsIncome( boolean isIncome ) { _isIncome = isIncome; }
	public boolean getIsIncome( ) { return _isIncome; }
	
	public void setIsOutcome( boolean isOutcome ) { _isOutcome = isOutcome; }
	public boolean getIsOutcome( ) { return _isOutcome; }
	
	public void setRunningMode( String runningMode ) { _runningMode = runningMode; }
	public String getRunningMode( ) { return _runningMode; }
	
	public void setProcessingCount( int processingCount ) { _processingCount = processingCount; }
	public int getProcessingCount( ) { return _processingCount; }
	
	public void setCountBeforeKill( int countBeforeKill ) { _countBeforeKill = countBeforeKill; }
	public int getCountBeforeKill( ) { return _countBeforeKill; }
	
	public void setProcessDateTime( Date processDateTime ) { _processDateTime = processDateTime; }
	public Date getProcessDateTime( ) { return _processDateTime; }
	
	public void setFailScenario( String failScenario ) { _failScenario = failScenario; }
	public String getFailScenario( ) { return _failScenario; }
	
	public void setPreviousException( BaseProcessingException previousException ) { _previousException = previousException; }
	public BaseProcessingException getPreviousException( ) { return _previousException; }
	// @formatter:on

	public EnvelopeProcessInfo( )
	{

	}

	public EnvelopeProcessInfo( String envelopeId )
	{
		_envelopeId = envelopeId;
	}
	
	public void set( EnvelopeProcessInfo other ) // NO_UCD (use default)
	{
		_isRolledBack = other._isRolledBack;
		_processingResult = other._processingResult;
		_exception = other._exception;
		_stackTrace = other._stackTrace;
		_description = other._description;
		_isIncome = other._isIncome;
		_isOutcome = other._isOutcome;
		_runningMode = other._runningMode;
		_processingCount = other._processingCount;
		_countBeforeKill = other._countBeforeKill;
		_processDateTime = other._processDateTime;
		_failScenario = other._failScenario;
		_previousException = other._previousException;
	}
	
	public void incrementProcessingCount( )
	{
		_processingCount++;
	}
}
