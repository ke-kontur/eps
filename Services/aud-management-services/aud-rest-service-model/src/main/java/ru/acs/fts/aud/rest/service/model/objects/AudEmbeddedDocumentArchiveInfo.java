package ru.acs.fts.aud.rest.service.model.objects;

public class AudEmbeddedDocumentArchiveInfo
{
	private String _appliedDocumentId;
	private String _archiveDocumentId;
	private int _documentVersion;
	
	// @formatter:off
	public void setAppliedDocumentId( String appliedDocumentId ) { _appliedDocumentId = appliedDocumentId; }
	public String getAppliedDocumentId( ) { return _appliedDocumentId; }
	
	public void setArchiveDocumentId( String archiveDocumentId ) { _archiveDocumentId = archiveDocumentId; }
	public String getArchiveDocumentId( ) { return _archiveDocumentId; }
	
	public void setDocumentVersion( int documentVersion ) { _documentVersion = documentVersion; }
	public int getDocumentVersion( ) { return _documentVersion; }
	// @formatter:on
}
