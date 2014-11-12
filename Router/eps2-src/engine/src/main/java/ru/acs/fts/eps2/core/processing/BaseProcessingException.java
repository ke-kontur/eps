package ru.acs.fts.eps2.core.processing;

public abstract class BaseProcessingException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	// TODO: Сделать private по человечески
	private boolean _needRollBack = false;
	private ErrorCode _errorCode = ErrorCode.FATAL_UNKNOWN_ERROR;
	private String _errorType = ProcessingConstants.ERROR_TYPE_NORMAL;
	private String _failScenario;
	private String _resultCode = ResultCodes._09_96669_99;
	private int _warningLevel = WarningLevels.INFO;

	public BaseProcessingException( String message )
	{
		super( message );
	}

	public BaseProcessingException( String message, Throwable throwable )
	{
		super( message, throwable );
	}
	
	// @formatter:off
	public void setNeedRollBack( boolean needRollBack ) { _needRollBack = needRollBack; }
	public boolean getNeedRollBack( ) { return _needRollBack; }

	public void setErrorCode( ErrorCode errorCode ) { _errorCode = errorCode; }
	public ErrorCode getErrorCode( ) { return _errorCode; }
	
	public void setErrorType( String errorType ) { _errorType = errorType; }
	public String getErrorType( ) { return _errorType; }

	public void setFailScenario( String failScenario ) { _failScenario = failScenario; }
	public String getFailScenario( ) { return _failScenario; }

	public void setResultCode( String resultCode ) { _resultCode = resultCode; }
	public String getResultCode( ) { return _resultCode; }

	public void setWarningLevel( int warningLevel ) { _warningLevel = warningLevel; }
	public int getWarningLevel( ) { return _warningLevel; }
	// @formatter:on
}
