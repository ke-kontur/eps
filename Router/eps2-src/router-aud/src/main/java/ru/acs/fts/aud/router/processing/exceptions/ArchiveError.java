package ru.acs.fts.aud.router.processing.exceptions;

import ru.acs.fts.aud.router.processing.helpers.MessageResolver;

public class ArchiveError
{
	private String _code;
	private Object[ ] _params;
	public String _description = null;
	
	// @formatter:off
	public String getCode( ) { return _code; }
	public Object[ ] getParams( ) { return _params; }
	// @formatter:on
	
	public ArchiveError( String code, Object[ ] params ) // NO_UCD (use default)
	{
		_params = params;
		_code = code;
	}
	
	public String getDescription( )
	{
		if ( null == _description )
			_description = MessageResolver.resolveErrorMessage( this );
		
		return _description;
	}
}
