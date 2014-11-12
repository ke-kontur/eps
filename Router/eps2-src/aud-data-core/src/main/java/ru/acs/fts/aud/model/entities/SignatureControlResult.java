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
@Table( name = "SIGNATURE_CONTROL_RESULT" )
public class SignatureControlResult
{
	// public static final short NO = 0;
	// public static final short YES = 1;
	
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID

	@Column( name = "VERIFIED", nullable = true )
	private Short verified;

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
	private SignatureControlRegister register;

	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setVerified( Short verified ) { this.verified = verified; }
	public Short getVerified( ) { return verified; }
	
	public void setDocument( Document document ) { this.document = document; }
	public Document getDocument( ) { return document; }
	
	public void setRegister( SignatureControlRegister register ) { this.register = register; }
	public SignatureControlRegister getRegister( ) { return register; }
	// @formatter:on
}
