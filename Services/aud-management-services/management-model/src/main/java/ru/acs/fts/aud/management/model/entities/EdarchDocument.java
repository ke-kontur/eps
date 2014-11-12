package ru.acs.fts.aud.management.model.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "EDARCH_ARCHIVE_DOCS" )
public class EdarchDocument
{
	@Id
	@Column( name = "ARDOC_IDINTERNAL", length = 41, nullable = false )
	private String idInternal;
	
	@Column( name = "ARDOC_DOCNAME", length = 255, nullable = true )
	private String docName;
	
	@Column( name = "MISTAKESTATUS", length = 255, nullable = true )
	private String mistakeStatus;
	
	@Column( name = "ARDOC_STAGESTATUS", length = 255, nullable = true )
	private String stageStatus;
	
	@Column( name = "ARDOC_TODATE", nullable = true )
	private Date toDate;
	
	@Column( name = "ARDOC_DOCTYPE", length = 255, nullable = true )
	private String docType;
	
	@Column( name = "ARDOC_CREATEDATE", nullable = false )
	private Date createDate;
	
	@Column( name = "ARDOC_FROMDATE", nullable = true )
	private Date fromDate;
	
	@Column( name = "ARDOC_REFDOCUMENTID", length = 36, nullable = true )
	private String refDocumentId;
	
	@Column( name = "ARDOC_DOCUMENTID", length = 36, nullable = true )
	private String documentId;
	
	@Lob
	@Column( name = "ARDOC_DOCUMENT", nullable = true )
	private String document;
	
	@Lob
	@Column( name = "ARDOC_DSDATA", nullable = true )
	private byte[ ] dsData;
	
	/*
	@Column( name = "ARDOC_ARCH_IDINTERNAL", length = 41, nullable = false )
	private String archIdInternal;
	*/
	
	@ManyToOne
	@JoinColumn( name = "ARDOC_ARCH_IDINTERNAL", nullable = false )
	private EdarchArchive archive;
	
	@Column( name = "ARDOC_PRDOCUMENTNUMBER", length = 4000, nullable = true )
	private String prDocumentNumber;
	
	@Column( name = "ARDOC_REFNEXTDOCUMENTID", length = 36, nullable = true )
	private String refNextDocumentId;
	
	@Column( name = "ARDOC_DOCCODE", length = 5, nullable = true )
	private String docCode;
	
	@Column( name = "ARDOC_ALBUMVERSION", length = 6, nullable = true )
	private String albumVersion;
	
	@Column( name = "ARDOC_AUDDOCUMENTID", length = 36, nullable = true )
	private String audDocumentId;
	
	@Column( name = "ARDOC_AUDPACKETID", length = 36, nullable = true )
	private String audPacketId;
	
	@Column( name = "ARDOC_DOCUMENT_DATE", nullable = true )
	private Date documentDate;
	
	// @formatter:off
	public void setIdInternal( String idInternal ) { this.idInternal = idInternal; }
	public String getIdInternal( ) { return idInternal; }

	public void setDocName( String docName ) { this.docName = docName; }
	public String getDocName( ) { return docName; }

	public void setMistakeStatus( String mistakeStatus ) { this.mistakeStatus = mistakeStatus; }
	public String getMistakeStatus( ) { return mistakeStatus; }

	public void setStageStatus( String stageStatus ) { this.stageStatus = stageStatus; }
	public String getStageStatus( ) { return stageStatus; }

	public void setToDate( Date toDate ) { this.toDate = toDate; }
	public Date getToDate( ) { return toDate; }

	public void setDocType( String docType ) { this.docType = docType; }
	public String getDocType( ) { return docType; }

	public void setCreateDate( Date createDate ) { this.createDate = createDate; }
	public Date getCreateDate( ) { return createDate; }

	public void setFromDate( Date fromDate ) { this.fromDate = fromDate; }
	public Date getFromDate( ) { return fromDate; }

	public void setRefDocumentId( String refDocumentId ) { this.refDocumentId = refDocumentId; }
	public String getRefDocumentId( ) { return refDocumentId; }

	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }

	public void setDocument( String document ) { this.document = document; }
	public String getDocument( ) { return document; }

	public void setDsData( byte[ ] dsData ) { this.dsData = dsData; }
	public byte[ ] getDsData( ) { return dsData; }

	/*
	public void setArchIdInternal( String archIdInternal ) { this.archIdInternal = archIdInternal; }
	public String getArchIdInternal( ) { return archIdInternal; }
	*/
	public void setArchive( EdarchArchive archive ) { this.archive = archive; }
	public EdarchArchive getArchive( ) { return archive; }

	public void setPrDocumentNumber( String prDocumentNumber ) { this.prDocumentNumber = prDocumentNumber; }
	public String getPrDocumentNumber( ) { return prDocumentNumber; }

	public void setRefNextDocumentId( String refNextDocumentId ) { this.refNextDocumentId = refNextDocumentId; }
	public String getRefNextDocumentId( ) { return refNextDocumentId; }

	public void setDocCode( String docCode ) { this.docCode = docCode; }
	public String getDocCode( ) { return docCode; }

	public void setAlbumVersion( String albumVersion ) { this.albumVersion = albumVersion; }
	public String getAlbumVersion( ) { return albumVersion; }

	public void setAudDocumentId( String audDocumentId ) { this.audDocumentId = audDocumentId; }
	public String getAudDocumentId( ) { return audDocumentId; }

	public void setAudPacketId( String audPacketId ) { this.audPacketId = audPacketId; }
	public String getAudPacketId( ) { return audPacketId; }

	public void setDocumentDate( Date documentDate ) { this.documentDate = documentDate; }
	public Date getDocumentDate( ) { return documentDate; }
	// @formatter:on
}
