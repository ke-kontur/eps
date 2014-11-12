package ru.acs.fts.aud.management.model.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

import ru.acs.fts.aud.management.model.pks.EdeclAudDocInfoPK;

@Entity
@Table( name = "EDECL_AUD_DOC_INFO" )
@IdClass( EdeclAudDocInfoPK.class )
public class EdeclAudDocInfo
{
	@Id
	@Column( name = "AUDDOC_DOCUMENTID", length = 36, nullable = false )
	private String documentId;
	
	@Id
	@Column( name = "AUDDOC_REFMAINDOC", length = 36, nullable = false )
	private String refMainDoc;
	
	@Column( name = "AUDDOC_REFDOCUMENTID", length = 36, nullable = true )
	private String refDocumentId;
	
	@Column( name = "AUDDOC_DOCUMENTMODEID", length = 30, nullable = false )
	private String documentModeId;
	
	@Column( name = "AUDDOC_ARCHDOCID", length = 36, nullable = true )
	private String archDocId;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "AUDDOC_PUTDATETIME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar putDateTime;
	
	@Column( name = "AUDDOC_STATE", length = 50, nullable = true )
	private String state;
	
	@Column( name = "AUDDOC_EADID", length = 41, nullable = true )
	private String eadDocumentId;
	
	@Column( name = "AUDDOC_EADARCHID", length = 36, nullable = true )
	private String eadArchiveId;
	
	@Column( name = "AUDDOC_DESCRIPTION", length = 250, nullable = true )
	private String description;
	
	@Column( name = "AUDDOC_AUDEXTPACKETID", length = 36, nullable = true )
	private String audExtPacketId;
	
	@Column( name = "AUDDOC_AUDEXTDOCID", length = 36, nullable = true )
	private String audExtDocId;
	
	/*
	@Column( name = "AUDDOC_PROCESSID", length = 36, nullable = true )
	private String processId;
	*/
	
	@ManyToOne
	@JoinColumn( name = "AUDDOC_PROCESSID", nullable = true )
	private EdeclAudProcInfo procInfo;
	
	@Id
	@Column( name = "AUDDOC_CMDREFGUID", length = 36, nullable = false )
	private String cmdRefGuid;
	
	@Column( name = "AUDDOC_NEEDPREVVERSION", nullable = true )
	private Integer needPrevVersion;
	
	@Column( name = "AUDDOC_PREVVERSION", length = 36, nullable = true )
	private String prevVersion;
	
	@Column( name = "AUDDOC_VERSION", length = 36, nullable = true )
	private String version;
	
	@Column( name = "AUDDOC_ERRORCODE", length = 100, nullable = true )
	private String errorCode;
	
	@Column( name = "AUDDOC_ERRORDESCRIPTION", length = 200, nullable = true )
	private String errorDescription;
	
	// @formatter:off
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	
	public void setRefMainDoc( String refMainDoc ) { this.refMainDoc = refMainDoc; }
	public String getRefMainDoc( ) { return refMainDoc; }
	
	public void setRefDocumentId( String refDocumentId ) { this. refDocumentId = refDocumentId; }
	public String getRefDocumentId( ) { return refDocumentId; }
	
	public void setDocumentModeId( String documentModeId ) { this.documentModeId = documentModeId; }
	public String getDocumentModeId( ) { return documentModeId; }
	
	public void setArchDocId( String archDocId ) { this.archDocId = archDocId; }
	public String getArchDocId( ) { return archDocId; }
	
	public void setPutDateTime( Calendar putDateTime ) { this.putDateTime = putDateTime; }
	public Calendar getPutDateTime( ) { return putDateTime; }
	
	public void setState( String state ) { this.state = state; }
	public String getState( ) { return state; }
	
	public void setEadDocumentId( String eadDocumentId ) { this.eadDocumentId = eadDocumentId; }
	public String getEadDocumentId( ) { return  eadDocumentId; }
	
	public void setEadArchiveId( String eadArchiveId ) { this.eadArchiveId = eadArchiveId; }
	public String getEadArchiveId( ) { return eadArchiveId; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	
	public void setAudExtPacketId( String audExtPacketId ) { this.audExtPacketId = audExtPacketId; }
	public String getAudExtPacketId( ) { return audExtPacketId; }
	
	public void setAudExtDocId( String audExtDocId ) { this.audExtDocId = audExtDocId; }
	public String getAudExtDocId( ) { return audExtDocId; }
	
	/*
	public void setProcessId( String processId ) { this.processId = processId; }
	public String getProcessId( ) { return processId; }
	*/
	public void setProcInfo( EdeclAudProcInfo procInfo ) { this.procInfo = procInfo; }
	public EdeclAudProcInfo getProcInfo( ) { return procInfo; }
	
	public void setCmdRefGuid( String cmdRefGuid ) { this.cmdRefGuid = cmdRefGuid; }
	public String getCmdRefGuid( ) { return cmdRefGuid; }
	
	public void setNeedPrevVersion( Integer needPrevVersion ) { this.needPrevVersion = needPrevVersion; }
	public Integer getNeedPrevVersion( ) { return needPrevVersion; }
	
	public void setPrevVersion( String prevVersion ) { this.prevVersion = prevVersion; }
	public String getPrevVersion( ) { return prevVersion; }
	
	public void setVersion( String version ) { this.version = version; }
	public String getVersion( ) { return version; }
	
	public void setErrorCode( String errorCode ) { this.errorCode = errorCode; }
	public String getErrorCode( ) { return errorCode; }
	
	public void setErrorDescription( String errorDescription ) { this.errorDescription = errorDescription; }
	public String getErrorDescription( ) { return errorDescription; }
	// @formatter:on
}
