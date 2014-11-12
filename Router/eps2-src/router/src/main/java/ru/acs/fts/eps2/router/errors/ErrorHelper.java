package ru.acs.fts.eps2.router.errors;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.model.services.ErrListService;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.ResultEnvelopeHelper;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.album.result.ResultType;

public final class ErrorHelper 
{
	private static ErrListService _errListService;
	
	// @formatter:off
	@Required public void setErrListService( ErrListService errListService ) { _errListService = errListService; }
	public ErrListService getErrListService( ) { return _errListService; }
	// @formatter:on
	
	/**
	 * Deprecation с этого метода снято, однако следует помнить, что его можно
	 * использовать только тогда, когда JobBatchContext не доступен, в противном
	 * случае надо пользоваться версией с JobBatchContext 
	 * @throws DatabaseException 
	 */
	public static ResultTypeException createException(  // NO_UCD (use private)
			String message, String documentId,
			String resultCode, String errorType ) 
		throws DatabaseException
	{
		ResultType res = ResultEnvelopeHelper.getResultDocument( 
			documentId, resultCode, _errListService 
		);
				
		return new ResultTypeException( message, resultCode, res, errorType );		
	}

	public static void throwException( 
			String message, String documentId, 
			String resultCode, String errorType )
		throws ResultTypeException, DatabaseException
	{
		throw createException( message, documentId, resultCode, errorType );
	}
		
	public static ResultTypeException createException( EDJobBatchContext jobBatchContext, String resultCode ) 
		throws DatabaseException
	{
		ResultType res = ResultEnvelopeHelper.getResultDocument( jobBatchContext, resultCode );
		
		return new ResultTypeException( 
			String.format( "Ошибка с кодом %s!", resultCode ),
			resultCode, res 
		);
	}
	
	public static void throwException( 
			EDJobBatchContext jobBatchContext, 
			String resultCode, String errorType ) 
		throws ResultTypeException, DatabaseException
	{
		ResultTypeException exc = createException( jobBatchContext, resultCode );
		exc.setErrorType( errorType );
		
		throw exc;
	}
}
