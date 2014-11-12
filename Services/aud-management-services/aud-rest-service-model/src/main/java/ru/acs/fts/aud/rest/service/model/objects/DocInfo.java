package ru.acs.fts.aud.rest.service.model.objects;

import org.joda.time.DateTime;

public class DocInfo
{
	private String _documentId;
	private String _refMainDoc;
	private String _refDocumentId;
	private String _documentModeId;
	private String _archDocId;
	private DateTime _putDateTime;
	private String _state;
	private String _eadDocumentId;
	private String _eadArchiveId;
	private String _description;
	private String _audExtPacketId;
	private String _audExtDocId;
	private String _processId;
	private Integer _needPrevVersion;
	private String _prevVersion;
	private String _version;
	private String _errorCode;
	private String _errorDescription;
	
	private String _documentBody; // TODO: заполнять Base64 encoded !!! в том числе из ЭАДа при EadArchiveId и EadDocumentId, см. Восстановить в MessageConstructor
	
	// @formatter:off
	public void setDocumentId( String documentId ) { _documentId = documentId; }
	public String getDocumentId( ) { return _documentId; }
	
	public void setRefMainDoc( String refMainDoc ) { _refMainDoc = refMainDoc; }
	public String getRefMainDoc( ) { return _refMainDoc; }
	
	public void setRefDocumentId( String refDocumentId ) { _refDocumentId = refDocumentId; }
	public String getRefDocumentId( ) { return _refDocumentId; }
	
	public void setDocumentModeId( String documentModeId ) { _documentModeId = documentModeId; }
	public String getDocumentModeId( ) { return _documentModeId; }
	
	public void setArchDocId( String archDocId ) { _archDocId = archDocId; }
	public String getArchDocId( ) { return _archDocId; }
	
	public void setPutDateTime( DateTime putDateTime ) { _putDateTime = putDateTime; }
	public DateTime getPutDateTime( ) { return _putDateTime; }
	
	public void setState( String state ) { _state = state; }
	public String getState( ) { return _state; }
	
	public void setEadDocumentId( String eadDocumentId ) { _eadDocumentId = eadDocumentId; }
	public String getEadDocumentId( ) { return  _eadDocumentId; }
	
	public void setEadArchiveId( String eadArchiveId ) { _eadArchiveId = eadArchiveId; }
	public String getEadArchiveId( ) { return _eadArchiveId; }
	
	public void setDescription( String description ) { _description = description; }
	public String getDescription( ) { return _description; }
	
	public void setAudExtPacketId( String audExtPacketId ) { _audExtPacketId = audExtPacketId; }
	public String getAudExtPacketId( ) { return _audExtPacketId; }
	
	public void setAudExtDocId( String audExtDocId ) { _audExtDocId = audExtDocId; }
	public String getAudExtDocId( ) { return _audExtDocId; }
	
	public void setProcessId( String processId ) { _processId = processId; }
	public String getProcessId( ) { return _processId; }
	
	public void setNeedPrevVersion( Integer needPrevVersion ) { _needPrevVersion = needPrevVersion; }
	public Integer getNeedPrevVersion( ) { return _needPrevVersion; }
	
	public void setPrevVersion( String prevVersion ) { _prevVersion = prevVersion; }
	public String getPrevVersion( ) { return _prevVersion; }
	
	public void setVersion( String version ) { _version = version; }
	public String getVersion( ) { return _version; }
	
	public void setErrorCode( String errorCode ) { _errorCode = errorCode; }
	public String getErrorCode( ) { return _errorCode; }
	
	public void setErrorDescription( String errorDescription ) { _errorDescription = errorDescription; }
	public String getErrorDescription( ) { return _errorDescription; }
	
	public void setDocumentBody( String documentBody ) { _documentBody = documentBody; }
	public String getDocumentBody( ) { return _documentBody; }
	// @formatter:on

}
