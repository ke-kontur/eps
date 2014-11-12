package ru.acs.fts.eps2.router.errors;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.schemas.album.result.ResultType;

public class ResultTypeException extends BaseProcessingException
{
	private static final long serialVersionUID = 1L;
	
	private ResultType _result;
	
	// @formatter:off
	public void setResult( ResultType result ) { _result = result; }
	public ResultType getResult( ) { return _result; }
	// @formatter:on

	public ResultTypeException( String message, String resultCode, ResultType result )
	{
		super( message );
		
		setResultCode( resultCode );
		setResult( result );
		setErrorType( ProcessingConstants.ERROR_TYPE_UNKNOWN );
	}
	
	public ResultTypeException( String message, String resultCode, ResultType result, String errorType  )
	{
		super( message );
		
		setResultCode( resultCode );
		setResult( result );
		setErrorType( errorType );
	}
}
