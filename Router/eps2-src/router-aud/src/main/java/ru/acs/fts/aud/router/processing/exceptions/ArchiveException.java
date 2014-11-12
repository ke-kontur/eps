package ru.acs.fts.aud.router.processing.exceptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArchiveException extends BaseAudException
{
	private static final long serialVersionUID = -3202865040095456797L;
	
	private Map< String, List< ArchiveError > > _documentErrors = new HashMap< String, List< ArchiveError > >( );
	private List< ArchiveError > _requestErrors = new ArrayList< ArchiveError >( );
	private String _message;
	
	public static ArchiveException createWithDocumentError( String documentId, String code, Object... params )
	{
		ArchiveException exc = new ArchiveException( String.format( "Ошибка в работе сервера: %s", code ) );
		exc.addDocumentError( documentId, code, params );
		
		return exc;
	}
	
	public ArchiveException( String code, Object... params )
	{
		super( code );
		_message = String.format( "Ошибка в работе сервера: %s", code );
		addRequestError( code, params );
	}
	
	@Override
	public String getMessage( )
	{
		return _message;
	}
	
	public void setMessage( String message )
	{
		_message = message;
	}
	
	public void addDocumentError( String documentId, String code, Object[ ] params )
	{
		ArchiveError error = new ArchiveError( code, params );
		List< ArchiveError > errors = _documentErrors.get( documentId );
		
		if ( null == errors )
		{
			errors = new ArrayList< ArchiveError >( );
			_documentErrors.put( documentId, errors );
		}
		
		errors.add( error );
	}
	
	public void addRequestError( String code, Object[ ] params ) // NO_UCD (use private)
	{
		_requestErrors.add( new ArchiveError( code, params ) );
	}
	
	public List< ArchiveError > getRequestErrors( )
	{
		return _requestErrors;
	}
	
	public Map< String, List< ArchiveError > > getDocumentErrors( )
	{
		return _documentErrors;
	}
	
	public boolean hasRequestErrors( )
	{
		return ! _requestErrors.isEmpty( );
	}
	
	public boolean hasDocumentErrors( )
	{
		return ! _documentErrors.isEmpty( );
	}
	
	/*
	public ArchiveException copyWithMessage( String newMessage )
	{
		ArchiveException copy = new ArchiveException( newMessage );
		copy.setErrorCode( getErrorCode( ) );
		copy.setErrorType( getErrorType( ) );
		copy.setFailScenario( getFailScenario( ) );
		copy.setIsRethrow( getIsRethrow( ) );
		copy.setNeedRollBack( getNeedRollBack( ) );
		copy.setResultCode( getResultCode( ) );
		copy.setStackTrace( getStackTrace( ) );
		copy.setWarningLevel( getWarningLevel( ) );
		copy.setDocumentErrors( getDocumentErrors( ) );
		copy.setRequestErrors( getRequestErrors( ) );
		
		return copy;
	}
	
	private void setDocumentErrors( Map< String, List< ArchiveError > > documentErrors )
	{
		_documentErrors = documentErrors;
	}
	
	private void setRequestErrors( List< ArchiveError > requestErrors )
	{
		_requestErrors = requestErrors;
	}
	*/
}
