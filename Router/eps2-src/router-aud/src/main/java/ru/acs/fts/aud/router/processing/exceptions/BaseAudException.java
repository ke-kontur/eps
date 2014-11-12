package ru.acs.fts.aud.router.processing.exceptions;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;

public class BaseAudException extends BaseProcessingException
{
	private static final long serialVersionUID = 1L;
	
	protected boolean isRethrow = false; // NO_UCD (use private)
	
	// @formatter:off
	public void setIsRethrow( boolean isRethrow) { this.isRethrow = isRethrow; }
	public boolean getIsRethrow( ) { return isRethrow; }
	// @formatter:on
	
	public BaseAudException( String message ) // NO_UCD (use default)
	{
		super( message );
	}
}
