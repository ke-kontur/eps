package ru.acs.fts.aud.management.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table( name = "EDECL_RESULT_INFO" )
public class EdeclResultInfo
{
	@Id
	@Column( name = "RES_ID", nullable = false )
	@GeneratedValue( generator = "EdeclResultInfoIdSeq" )
	@SequenceGenerator( name = "EdeclResultInfoIdSeq", sequenceName = "RES_ID_SEQ", allocationSize = 1 )
	private Integer resId;
	
	@Column( name = "RES_RESULTCODE", length = 12, nullable = false )
	private String resultCode;
	
	/*
	@Column( name = "RES_ENVELOPEID", length = 36, nullable = false )
	private String envelopeId;
	*/
	@ManyToOne
	@JoinColumn( name = "RES_ENVELOPEID", nullable = false )
	private EdeclEnvelope envelope;
	
	/*
	@Column( name = "RES_DOCUMENTID", length = 36, nullable = true )
	private String documentId;
	*/
	@ManyToOne
	@JoinColumn( name = "RES_DOCUMENTID", nullable = true )
	private EdeclDocument document;
	
	// @formatter:off
	public void setResId( Integer resId ) { this.resId = resId; }
	public Integer getResId( ) { return resId; }
	
	public void setResultCode( String resultCode ) { this.resultCode = resultCode; }
	public String getResultCode( ) { return resultCode; }
	
	/*
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }
	*/
	public void setEnvelope( EdeclEnvelope envelope ) { this.envelope = envelope; }
	public EdeclEnvelope getEnvelope( ) { return envelope; }
	
	/*
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	*/
	public void setDocument( EdeclDocument document ) { this.document = document; }
	public EdeclDocument getDocument( ) { return document; }
	// @formatter:on
}
