package ru.acs.fts.aud.rest.service.model.objects;

import java.util.List;

import org.joda.time.DateTime;

public class AudError
{
	private String _documentId;
	private String _refDocumentId;
	private String _documentModeId;
	private DateTime _documentDateTime;
	
	private List< AudResultInfo > _resultInfos;
	private List< AudEmbeddedDocumentResultInfo > _embeddedDocsResultInfos;
	
	// @formatter:off
	public void setDocumentId( String documentId ) { _documentId = documentId; }
	public String getDocumentId( ) { return _documentId; }
	
	public void setRefDocumentId( String refDocumentId ) { _refDocumentId = refDocumentId; }
	public String getRefDocumentId( ) { return _refDocumentId; }
	
	public void setDocumentModeId( String documentModeId ) { _documentModeId = documentModeId; }
	public String getDocumentModeId( ) { return _documentModeId; }
	
	public void setDocumentDateTime( DateTime documentDateTime ) { _documentDateTime = documentDateTime; }
	public DateTime getDocumentDateTime( ) { return _documentDateTime; }
	
	public void setResultInfos( List< AudResultInfo > resultInfos ) { _resultInfos = resultInfos; }
	public List< AudResultInfo > getResultInfos( ) { return _resultInfos; }
	
	public void setEmbeddedDocsResultInfos( List< AudEmbeddedDocumentResultInfo > embeddedDocsResultInfos ) { _embeddedDocsResultInfos = embeddedDocsResultInfos; }
	public List< AudEmbeddedDocumentResultInfo > getEmbeddedDocsResultInfos( ) { return _embeddedDocsResultInfos; }
	// @formatter:on
}
