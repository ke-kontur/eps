package ru.acs.fts.aud.router.errors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.aud.router.processing.definitions.ErrorMessageSourceKeys;
import ru.acs.fts.aud.router.processing.helpers.ExceptionHelper;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.error.Errors;
import ru.acs.fts.eps2.engine.objects.Document;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.restWs.crypto.responses.CheckSignResponse;
import ru.acs.fts.eps2.engine.restWs.struct.responses.DocumentValidationResponse;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class AudErrors extends Errors
{
	private static final Logger log = LoggerFactory.getLogger( AudErrors.class );
	
	/**
	 * @deprecated реализация непродумана
	 */
	@Override
	@Deprecated
	public void throwException( String message, String documentId, String resultCode, String errorType ) 
		throws BaseProcessingException
	{
		ExceptionHelper.throwArchiveException( errorType, resultCode );
	}

	/**
	 * @deprecated реализация продумана
	 */
	@Override
	@Deprecated
	public void throwException( String message, String resultCode, Object document, String errorType ) 
		throws BaseProcessingException
	{
		ExceptionHelper.throwArchiveException( errorType, resultCode );
	}

	@Override
	public BaseProcessingException convert( DatabaseException exc, JobBatchContext jobBatchContext )
	{
		log.info( "DB Exception", exc );
		
		return ExceptionHelper.createArchiveException( ProcessingConstants.ERROR_TYPE_DATA, ErrorMessageSourceKeys.ERROR_DATABASE_1000, ( Object[ ] )null );
	}
	
	@Override
	public BaseProcessingException convert( NullPointerException exc, JobBatchContext jobBatchContext )
	{
		 log.info( "NPE", exc );
		 
		 return ExceptionHelper.createArchiveException( ProcessingConstants.ERROR_TYPE_DATA, ErrorMessageSourceKeys.ERROR_DATABASE_1000, ( Object[ ] )null );
	}

	@Override
	public void throwStructControlException( DocumentValidationResponse response, Envelope env ) 
		throws BaseProcessingException, DatabaseException
	{
		ExceptionHelper.throwValidationException( ErrorMessageSourceKeys.ERROR_FORMAT_1001, ( Object[ ] )null );
	}
	
	@Override
	public void throwStructControlException( Document document, String message, String resultCode )
		 	throws BaseProcessingException, DatabaseException
 	{
		log.info( message );
		ExceptionHelper.throwValidationException( ErrorMessageSourceKeys.ERROR_FORMAT_1001, ( Object[ ] )null );
 	}
	
	@Override
	public void throwCheckSignException( Document document, String message, String resultCode ) 
		throws BaseProcessingException, DatabaseException
	{
		log.info( message );
		ExceptionHelper.throwWrongDsigException( ErrorMessageSourceKeys.ERROR_WDSIG_1002, ( Object[ ] )null );
	}

	@Override
	public void throwCheckSignException( CheckSignResponse response, Envelope envelope ) 
		throws BaseProcessingException, DatabaseException
	{
		ExceptionHelper.throwWrongDsigException( ErrorMessageSourceKeys.ERROR_WDSIG_1002, ( Object[ ] )null );
	}

	@Override
	public void throwGenericRestException( Exception exc, Envelope env, String message, String resultCode ) 
		throws BaseProcessingException, DatabaseException
	{
		if ( resultCode.equals( ResultCodes._01_00071_01 ) )
		{
			ExceptionHelper.throwValidationException( ErrorMessageSourceKeys.ERROR_FORMAT_1001, ( Object[ ] )null );			
		}
		else if ( resultCode.equals( ResultCodes._01_00050_01 ) )
		{
			ExceptionHelper.throwWrongDsigException( ErrorMessageSourceKeys.ERROR_WDSIG_1002, ( Object[ ] )null );
		}
	}

}
