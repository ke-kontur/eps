package ru.acs.fts.aly.router.errors;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.error.Errors;
import ru.acs.fts.eps2.engine.objects.Document;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.restWs.crypto.responses.CheckSignResponse;
import ru.acs.fts.eps2.engine.restWs.struct.responses.DocumentValidationResponse;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class AlyErrors extends Errors
{	
	@Override
	public void throwException( String message, String documentId, String resultCode, String errorType ) 
		throws BaseProcessingException, DatabaseException
	{
		throw new AlyException( message, errorType );
	}

	@Override
	public void throwException( String message, String resultCode, Object document, String errorType ) 
		throws BaseProcessingException, DatabaseException
	{
		throw new AlyException( message, errorType );
	}

	@Override
	public BaseProcessingException convert( DatabaseException exc, JobBatchContext jobBatchContext )
	{
		return new AlyException( "Database Error" );
	}
	
	@Override
	public BaseProcessingException convert( NullPointerException exc, JobBatchContext jobBatchContext )
	{
		return new AlyException( "NPE" );
	}

	@Override
	public void throwStructControlException( DocumentValidationResponse response, Envelope env ) 
		throws BaseProcessingException, DatabaseException
	{
		throw new AlyException( "StructControl Error" );
	}

	@Override
	public void throwStructControlException( Document document, String message, String resultCode ) 
		throws BaseProcessingException, DatabaseException
	{
		throw new AlyException( "StructControl Error" );
	}

	@Override
	public void throwCheckSignException( CheckSignResponse response, Envelope envelope ) 
		throws BaseProcessingException, DatabaseException
	{
		throw new AlyException( "CryptoControl Error" );
	}

	@Override
	public void throwCheckSignException( Document document, String message, String resultCode ) 
		throws BaseProcessingException, DatabaseException
	{
		throw new AlyException( "CryptoControl Error" );
	}

	@Override
	public void throwGenericRestException( Exception exc, Envelope env, String message, String resultCode ) 
		throws BaseProcessingException, DatabaseException
	{
		throw new AlyException( "REST Call Error" );
	}

}
