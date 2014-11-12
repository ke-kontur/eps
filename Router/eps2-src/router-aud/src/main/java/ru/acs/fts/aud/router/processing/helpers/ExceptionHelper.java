package ru.acs.fts.aud.router.processing.helpers;

import ru.acs.fts.aud.router.processing.exceptions.ArchiveException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;

public class ExceptionHelper
{
	// @formatter:off
	private ExceptionHelper( ) { }
	// @formatter:on
	
	public static void throwException( String messageFormat, Object... args )  // NO_UCD (unused code)
		throws Exception
	{
		throwException( String.format( messageFormat, args ) );
	}
	
	public static void throwException( String message )  // NO_UCD (use default)
		throws Exception
	{
		throw new Exception( message );
	}
	
	public static ArchiveException createArchiveException( String errorType, String code, Object... params ) // NO_UCD (use private)
	{
		ArchiveException exc = new ArchiveException( code, params );
		exc.setErrorType( errorType );
		
		return exc;
	}
	
	public static ArchiveException createArchiveDocException( String documentId, String errorType, String code, Object... params ) // NO_UCD (use private)
	{
		ArchiveException exc = ArchiveException.createWithDocumentError( documentId, code, params );
		exc.setErrorType( errorType );
		
		return exc;
	}
	
	public static ArchiveException createDataException( String code, Object... params )
	{
		return createArchiveException( ProcessingConstants.ERROR_TYPE_DATA, code, params );
	}
	
	public static ArchiveException createDataDocException( String documentId, String code, Object... params ) // NO_UCD (use private)
	{
		return createArchiveDocException( documentId, ProcessingConstants.ERROR_TYPE_DATA, code, params );
	}
	
	public static ArchiveException createValidationException( String code, Object... params ) // NO_UCD (use private)
	{
		return createArchiveException( ProcessingConstants.ERROR_TYPE_CHECK, code, params );
	}
	
	public static ArchiveException createAccessException( String code, Object... params ) // NO_UCD (use private)
	{
		return createArchiveException( ProcessingConstants.ERROR_TYPE_BUSINESS, code, params );
	}
	
	public static ArchiveException createWrongDsigException( String code, Object...params ) // NO_UCD (use private)
	{
		return createArchiveException( ProcessingConstants.ERROR_TYPE_CHECK,  code, params );
	}
	
	public static ArchiveException createXmlException( String code, Object... params ) // NO_UCD (use private)
	{
		return createArchiveException( ProcessingConstants.ERROR_TYPE_CHECK, code, params );
	}
	
	public static void throwArchiveException( String errorType, String code, Object... params )  // NO_UCD (unused code)
		throws ArchiveException
	{
		throw createArchiveException( errorType, code, params );
	}
	
	public static void throwDataException( String code, Object... params ) 
		throws ArchiveException
	{
		throw createDataException( code, params );
	}
	
	public static void throwDataDocException( String documentId, String code, Object... params ) 
		throws ArchiveException
	{
		throw createDataDocException( documentId, code, params );
	}
	
	public static void throwValidationException( String code, Object... params )
		throws ArchiveException 
	{
		throw createValidationException( code, params );
	}	
	
	public static void throwAccessException( String code, Object... params )
		throws ArchiveException
	{
		throw createAccessException( code, params );
	}
	
	public static void throwWrongDsigException( String code, Object... params ) // NO_UCD (use default)
		throws ArchiveException
	{
		throw createWrongDsigException( code, params );
	}
	
	public static void throwXmlException( String code, Object... params ) // NO_UCD (use default)
		throws ArchiveException
	{
		throw createXmlException( code, params );
	}
}
