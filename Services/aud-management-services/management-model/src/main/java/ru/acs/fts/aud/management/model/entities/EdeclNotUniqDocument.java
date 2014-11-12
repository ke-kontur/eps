package ru.acs.fts.aud.management.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "EDECL_NOTUNIQ_MSG_DOC" )
public class EdeclNotUniqDocument
{
	@Id
	@Column( name = "NUDOC_RECORDID", length = 36, nullable = false )
	private String recordId;
	
	/*
	@Column( name = "NUDOC_DOCUMENTID", length = 36, nullable = true )
	private String documentId;
	*/
	@ManyToOne
	@JoinColumn( name = "NUDOC_DOCUMENTID", nullable = true )
	private EdeclDocument document;
	
	/*
	@Column( name = "NUDOC_REFMAINDOC", length = 36, nullable = true )
	private String refMainDoc;
	*/
	@ManyToOne
	@JoinColumn( name = "NUDOC_REFMAINDOC", nullable = true )
	private EdeclDocument mainDocument;
	
	@Column( name = "NUDOC_DOCUMENTMODEID", length = 30, nullable = true )
	private String documentModeId;
	
	@Column( name = "NUDOC_REFDOCUMENTID", length = 36, nullable = true )
	private String refDocumentId;

	// @formatter:off
	public void setRecordId( String recordId ) { this.recordId = recordId; }
	public String getRecordId( ) { return recordId; }

	/*
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	*/
	public void setDocument( EdeclDocument document ) { this.document = document; }
	public EdeclDocument getDocument( ) { return document; }

	/*
	public void setRefMainDoc( String refMainDoc ) { this.refMainDoc = refMainDoc; }
	public String getRefMainDoc( ) { return refMainDoc; }
	*/
	public void setMainDocument( EdeclDocument mainDocument ) { this.mainDocument = mainDocument; }
	public EdeclDocument getMainDocument( ) { return mainDocument; }

	public void setDocumentModeId( String documentModeId ) { this.documentModeId = documentModeId; }
	public String getDocumentModeId( ) { return documentModeId; }

	public void setRefDocumentId( String refDocumentId ) { this.refDocumentId = refDocumentId; }
	public String getRefDocumentId( ) { return refDocumentId; }
	// @formatter:on
	
}
