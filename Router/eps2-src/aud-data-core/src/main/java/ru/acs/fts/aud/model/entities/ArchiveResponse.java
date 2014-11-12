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
@Table( name = "ARCHIVE_RESPONSE" )
public class ArchiveResponse
{
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID
	
	@Lob
	@Column( name = "CONTENT", length = 4000, nullable = true )
	private byte[ ] content;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "SENDINGDATE", length = 6, nullable = true, columnDefinition = "TIMESTAMP(6) NULL" )
	private Timestamp sendingDate;
	
	@Column( name = "MESSAGEKIND", length = 255, nullable = true )
	private String messageKind;
	
	@Column( name = "REFDOCUMENTID", nullable = true )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String refDocumentId;
	
	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setContent( byte[ ] content ) { this.content = content; }
	public byte[ ] getContent( ) { return content; }
	
	public void setSendingDate( Timestamp sendingDate ) { this.sendingDate = sendingDate; }
	public Timestamp getSendingDate( ) { return sendingDate; }
	
	public void setMessageKind( String messageKind ) { this.messageKind = messageKind; }
	public String getMessageKind( ) { return messageKind; }
	
	public void setRefDocumentId( String refDocumentId ) { this.refDocumentId = refDocumentId; }
	public String getRefDocumentId( ) { return refDocumentId; }
	// @formatter:on
}
