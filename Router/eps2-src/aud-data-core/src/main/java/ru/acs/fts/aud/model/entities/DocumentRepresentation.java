package ru.acs.fts.aud.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "ML_DOCUMENT_REPRESENTATION" )
public class DocumentRepresentation
{
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id;
	
	@Column( name = "TYPE", length = 255, nullable = false )
	private String type;
	
	@Lob
	@Column( name = "XSLT_CONTENT", nullable = false, length = 4000 )
	private byte[ ] xsltContent;
	
	@ManyToOne
	@JoinColumn( name = "DOCUMENT_KIND_VERSION_ID" )
	private DocumentKindVersion documentKindVersion;
	
	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setType( String type ) { this.type = type; }
	public String getType( ) { return type; }
	
	public void setXsltContent( byte[ ] xsltContent ) { this.xsltContent = xsltContent; }
	public byte[ ] getXsltContent( ) { return xsltContent; }
	
	public void setDocumentKindVersion( DocumentKindVersion documentKindVersion ) { this.documentKindVersion = documentKindVersion; }
	public DocumentKindVersion getDocumentKindVersion( ) { return documentKindVersion; }
	// @formatter:on
}
