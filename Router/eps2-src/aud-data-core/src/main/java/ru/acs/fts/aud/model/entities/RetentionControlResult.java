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
@Table( name = "RETENTION_CONTROL_RESULT" )
public class RetentionControlResult
{
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID

	@Column( name = "FORDELETE", nullable = true )
	private Short forDelete;

	@Column( name = "EXPIRED", nullable = true )
	private Short expired;

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
	private RetentionControlRegister register;

	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setForDelete( Short forDelete ) { this.forDelete = forDelete; }
	public Short getForDelete( ) { return forDelete; }
	
	public void setExpired( Short expired ) { this.expired = expired; }
	public Short getExpired( ) { return expired; }
	
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
	public void setRegister( RetentionControlRegister register ) { this.register = register; }
	public RetentionControlRegister getRegister( ) { return register; }
	// @formatter:on
}
