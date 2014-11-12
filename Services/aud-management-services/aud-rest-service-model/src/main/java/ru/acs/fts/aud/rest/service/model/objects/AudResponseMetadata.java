package ru.acs.fts.aud.rest.service.model.objects;

import java.util.Map;

public class AudResponseMetadata
{
	private String _documentType;
	private AudRegistry _audRegistry;
	private AudPutDocumentResponse _audPutDocumentResponse;
	private AudError _audError;
	private Map< String, String > _context;
	
	// @formatter:off
	public void setDocumentType( String documentType ) { _documentType = documentType; }
	public String getDocumentType( ) { return _documentType; }
	
	public void setAudRegistry( AudRegistry audRegistry ) { _audRegistry = audRegistry; }
	public AudRegistry getAudRegistry( ) { return _audRegistry; }
	
	public void setAudPutDocumentResponse( AudPutDocumentResponse audPutDocumentResponse ) { _audPutDocumentResponse = audPutDocumentResponse; }
	public AudPutDocumentResponse getAudPutDocumentResponse( ) { return _audPutDocumentResponse; }
	
	public void setAudError( AudError audError ) { _audError = audError; }
	public AudError getAudError( ) { return _audError; }
	
	public void setContext( Map< String, String > context ) { _context = context; }
	public Map< String, String > getContext( ) { return _context; }
	// @formatter:on
	
	public boolean contextGetBoolean( String key )
	{
		if ( null == _context || ! _context.containsKey( key ) )
			return false;
		
		return Boolean.parseBoolean( _context.get( key ) );
	}
}
