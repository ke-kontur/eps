package ru.acs.fts.aud.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "EXPERT_RESULT" )
public class ExpertResult
{
	// public static final short NO = 0;
	// public static final short YES = 1;
	
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID

	@Column( name = "PROCESSED", nullable = true )
	private Short processed;

	@Column( name = "RETENTIONPERIOD", nullable = true )
	private Integer retentionPeriod;

	/*
	@Column( name = "DOCUMENT_ID", nullable = false )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String documentId;
	*/
	@ManyToOne
	@JoinColumn( name = "DOCUMENT_ID" )
	private Document document;	
    
	/*
	@Column( name = "REGISTER_ID", nullable = false )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String registerId;
	*/
	@ManyToOne
	@JoinColumn( name = "REGISTER_ID" )
	private ExpertRegister register;

	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }

	public void setProcessed( Short processed ) { this.processed = processed; }
	public Short getProcessed( ) { return processed; }
	
	public void setRetentionPeriod( Integer retentionPeriod ) { this.retentionPeriod = retentionPeriod; }
	public Integer getRetentionPeriod( ) { return retentionPeriod; }
	
	/*
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	*/
	public void setDocument( Document document ) { this.document = document; }
	public Document getDocument( ) { return document; }
	
	/*
	public void setRegisterId( String registerId ) { this.registerId = registerId; }
	public String getRegisterId( ) { return registerId; }
	*/
	public void setRegister( ExpertRegister register ) { this.register = register; }
	public ExpertRegister getRegister( ) { return register; }
	// @formatter:on

}
