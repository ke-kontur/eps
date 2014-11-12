package ru.acs.fts.aly.router.errors;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;

public class AlyException extends BaseProcessingException
{
	private static final long serialVersionUID = 1L;

	public AlyException( String message )
	{
		super( message );
		
		setResultCode( "00.00000.00" );
		setErrorType( ProcessingConstants.ERROR_TYPE_UNKNOWN );
	}
	
	public AlyException( String message, String errorType  )
	{
		super( message );
		
		setResultCode( "00.00000.00" );
		setErrorType( errorType );
	}
}
