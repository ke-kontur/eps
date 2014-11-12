package ru.acs.fts.eps2.engine.transport.exceptions;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ErrorCode;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;

// TODO: Заменить ResultTypeException'ом
public class TransportException extends BaseProcessingException
{
	private static final long serialVersionUID = 1L;

	public TransportException( String message )
	{
		super( message );
		
		initiate( );
	}

	public TransportException( String message, Throwable exc )
	{
		super( message, exc );
		
		initiate( );
	}
	
	private void initiate( )
	{
		setErrorCode( ErrorCode.FATAL_UNKNOWN_ERROR );
		setErrorType( ProcessingConstants.ERROR_TYPE_TRANSPORT );
		setFailScenario( null );
		setResultCode( ResultCodes._09_96669_99 );
	}
}
