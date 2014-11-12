package ru.acs.fts.aud.model.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMP;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.TypeConverter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "ARCHIVE_REQUEST" )
public class ArchiveRequest
{
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID

	@Column( name = "DESCRIPTION", length = 255, nullable = true )
	private String description;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "RECEIVINGDATE", length = 6, nullable = true, columnDefinition = "TIMESTAMP(6) NULL" )
	private Timestamp receivingDate;

	@Lob
	@Column( name = "CONTENT", nullable = true )
	private byte[ ] content;

	@Column( name = "ENVELOPEID", length = 255, nullable = true )
	private String envelopeId;

	@Column( name = "MESSAGEKIND", length = 255, nullable = true )
	private String messageKind;

	@Column( name = "DOCUMENTID", nullable = true )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String documentId;
	/*
	@ManyToOne
	@JoinColumn( name = "DOCUMENTID", nullable = true )
	private Document document;
	*/

	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	
	public void setReceivingDate( Timestamp receivingDate ) { this.receivingDate = receivingDate; }
	public Timestamp getReceivingDate( ) { return receivingDate; }
	
	public void setContent( byte[ ] content ) { this.content = content; }
	public byte[ ] getContent( ) { return content; }
	
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }
	
	public void setMessageKind( String messageKind ) { this.messageKind = messageKind; }
	public String getMessageKind( ) { return messageKind; }
	
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	/*
	public void setDocument( Document document ) { this.document = document; }
	public Document getDocument( ) { return document; }
	*/
	// @formatter:on
}
