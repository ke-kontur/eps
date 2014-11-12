package ru.acs.fts.eps2.engine.error;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.objects.Document;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.restWs.crypto.responses.CheckSignResponse;
import ru.acs.fts.eps2.engine.restWs.struct.responses.DocumentValidationResponse;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public abstract class Errors
{
	 public abstract void throwException( 
			 String message, String documentId,
			 String resultCode, String errorType ) 
		throws BaseProcessingException, DatabaseException;
	 
	 public abstract void throwException(
			 String message, String resultCode,
			 Object document, String errorType )
	 	throws BaseProcessingException, DatabaseException;
	 
	 public abstract BaseProcessingException convert( 
			 DatabaseException exc, 
			 JobBatchContext jobBatchContext );
	 
	 public abstract BaseProcessingException convert(
			 NullPointerException exc,
			 JobBatchContext jobBatchContext );
	 
	 public abstract void throwStructControlException( DocumentValidationResponse response, Envelope env )
	 	throws BaseProcessingException, DatabaseException;
	 
	 public abstract void throwStructControlException( Document document, String message, String resultCode )
			 	throws BaseProcessingException, DatabaseException;
	 
	 public abstract void throwCheckSignException( CheckSignResponse response, Envelope envelope )
	 	throws BaseProcessingException, DatabaseException;
	 
	 public abstract void throwCheckSignException( Document document, String message, String resultCode )
			 	throws BaseProcessingException, DatabaseException;
	 
	 public abstract void throwGenericRestException( Exception exc, Envelope env, String message, String resultCode )
	 	throws BaseProcessingException, DatabaseException;
}
