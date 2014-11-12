package ru.acs.fts.eps2.core.processing;

public class ErrorCode // NO_UCD (used by spring IoC Context)
{
	protected final String _description; // NO_UCD (use private)
	protected final String _errorType; // NO_UCD (use private)

	// @formatter:off
	public final static ErrorCode NONE = new ErrorCode( "Ошибки нет", ProcessingConstants.ERROR_TYPE_NORMAL ); // NO_UCD (unused code)
	public final static ErrorCode FATAL_UNKNOWN_ERROR = new ErrorCode( "Неизвестная ошибка", ProcessingConstants.ERROR_TYPE_UNKNOWN ); // NO_UCD (use default)
	// @formatter:on

	protected ErrorCode( String description, String errorType ) // NO_UCD (use private)
	{
		_description = description;
		_errorType = errorType;
	}

	// @formatter:off
	public String getDescription( ) { return _description; }
	
	public String getErrorType( ) { return _errorType; }
	// @formatter:on
}
