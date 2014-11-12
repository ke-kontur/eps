package ru.acs.fts.eps2.engine.restWs.shared.serviceModel;

import java.util.List;

public class DocumentToCheck
{
	private String _envelopeId;
	private String _documentId;
	private String _processId;
	private boolean _isContainer;
	private String _document;
	private List< String > _xPath;
	
	// @formatter:off
	public void setEnvelopeId( String envelopeId ) { _envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return _envelopeId; }
	
	public void setDocumentId( String documentId ) { _documentId = documentId; }
	public String getDocumentId( ) { return _documentId; }
	
	public void setProcessId( String processId ) { _processId = processId; }
	public String getProcessId( ) { return _processId; }
	
	public void setIsContainer( boolean isContainer ) { _isContainer = isContainer; }
	public boolean getIsContainer( ) { return _isContainer; }
	
	public void setDocument( String document ) { _document = document; }
	public String getDocument( ) { return _document; }
	
	public void setXPath( List< String > xPath ) { _xPath = xPath; }
	public List< String > getXPath( ) { return _xPath; }
	// @formatter:on
}
