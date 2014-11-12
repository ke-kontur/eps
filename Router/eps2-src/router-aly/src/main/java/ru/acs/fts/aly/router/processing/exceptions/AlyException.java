package ru.acs.fts.aly.router.processing.exceptions;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;

public class AlyException extends BaseProcessingException
{
	private static final long serialVersionUID = 1L;

	public AlyException( String message )
	{
		super( message );
	}
	
	public AlyException( String message, Throwable t )
	{
		super( message, t );
	}
}
