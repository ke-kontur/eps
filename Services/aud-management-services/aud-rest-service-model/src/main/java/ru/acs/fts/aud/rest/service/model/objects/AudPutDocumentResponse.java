package ru.acs.fts.aud.rest.service.model.objects;

import java.util.List;

import org.joda.time.DateTime;

public class AudPutDocumentResponse
{
	private String _archiveDocumentId;
	private int _documentVersion;
	private DateTime _archiveDocumentPutDateTime;
	
	private String _archivePacketId;
	private DateTime _archivePacketPutDateTime;

	private String _documentId;
	private String _refDocumentId;
	private String _documentModeId;
	private DateTime _documentDateTime;

	private List< AudEmbeddedDocumentArchiveInfo > _embeddedDocumentInfos;
	
	// @formatter:off
	public void setArchiveDocumentId( String archiveDocumentId ) { _archiveDocumentId = archiveDocumentId; }
	public String getArchiveDocumentId( ) { return _archiveDocumentId; }
	
	public void setDocumentVersion( int documentVersion ) { _documentVersion = documentVersion; }
	public int getDocumentVersion( ) { return _documentVersion; }
	
	public void setArchiveDocumentPutDateTime( DateTime archiveDocumentPutDateTime ) { _archiveDocumentPutDateTime = archiveDocumentPutDateTime; }
	public DateTime getArchiveDocumentPutDateTime( ) { return _archiveDocumentPutDateTime; }
	
	public void setArchivePacketId( String archivePacketId ) { _archivePacketId = archivePacketId; }
	public String getArchivePacketId( ) { return _archivePacketId; }
	
	public void setArchivePacketPutDateTime( DateTime archivePacketPutDateTime ) { _archiveDocumentPutDateTime = archivePacketPutDateTime; }
	public DateTime getArchivePacketPutDateTime( ) { return _archivePacketPutDateTime; }
	
	public void setDocumentId( String documentId ) { _documentId = documentId; }
	public String getDocumentId( ) { return _documentId; }
	
	public void setRefDocumentId( String refDocumentId ) { _refDocumentId = refDocumentId; }
	public String getRefDocumentId( ) { return _refDocumentId; }
	
	public void setDocumentModeId( String documentModeId ) { _documentModeId = documentModeId; }
	public String getDocumentModeId( ) { return _documentModeId; }
	
	public void setDocumentDateTime( DateTime documentDateTime ) { _documentDateTime = documentDateTime; }
	public DateTime getDocumentDateTime( ) { return _documentDateTime; }
	
	public void setEmbeddedDocumentInfos( List< AudEmbeddedDocumentArchiveInfo > embeddedDocumentInfos ) { _embeddedDocumentInfos = embeddedDocumentInfos; }
	public List< AudEmbeddedDocumentArchiveInfo > getEmbeddedDocumentInfos( ) { return _embeddedDocumentInfos; }
	// @formatter:on
}
