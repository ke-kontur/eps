package ru.acs.fts.aud.router.processing.helpers;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;

import ru.acs.fts.aud.router.processing.exceptions.ArchiveError;

public class MessageResolver
{
	private static MessageSource _logMessageSource;
	private static MessageSource _errorMessageSource;
	
	// @formatter:off
	@Required
	public void setLogMessageSource( MessageSource messageSource ) { _logMessageSource = messageSource; }
	public MessageSource getLogMessageSource( ) { return _logMessageSource; }
	
	@Required
	public void setErrorMessageSource( MessageSource messageSource ) { _errorMessageSource = messageSource; }
	public MessageSource getErrorMessageSource( ) { return _errorMessageSource; }
	// @formatter:on
	
	public static String resolveLogMessage( String code, Object[ ] params )
	{
		return _logMessageSource.getMessage( code, params, null );
	}
	
	public static String resolveErrorMessage( String code, Object[ ] params ) // NO_UCD (use private)
	{
		return _errorMessageSource.getMessage( code, params, null );
	}
	
	public static String resolveErrorMessage( ArchiveError error ) // NO_UCD (use default)
	{
		return resolveErrorMessage( error.getCode( ), error.getParams( ) );
	}
}
