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
@Table( name = "ML_ATTRIBUTE_VERSION" )
public class AttributeVersion
{
	// public static final short NO = ( short )0;
	// public static final short YES = ( short )1;
	
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( value = "uuidConverter" )
	private String id;
	
	@Column( name = "XPATH", nullable = false, length = 255 )
	private String xPath;
	
	@ManyToOne
	@JoinColumn( name = "DOCUMENT_KIND_VERSION_ID" )
	private DocumentKindVersion documentKindVersion;
	
	@ManyToOne
	@JoinColumn( name = "ATTRIBUTE_ID", nullable = false )
	private Attribute attribute;
	
	@Column( name = "HAS_CHANGED", nullable = false )
	private short hasChanged;
	
	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; } 
	
	public void setXPath( String xPath ) { this.xPath = xPath; }
	public String getXPath( ) { return xPath; }
	
	public void setDocumentKindVersion( DocumentKindVersion documentKindVersion ) { this.documentKindVersion = documentKindVersion; }
	public DocumentKindVersion getDocumentKindVersion( ) { return documentKindVersion; }
	
	public void setAttribute( Attribute attribute ) { this.attribute = attribute; }
	public Attribute getAttribute( ) { return attribute; }
	
	public void setHasChanged( short hasChanged ) { this.hasChanged = hasChanged; }
	public short getHasChanged( ) { return hasChanged; }
	// @formatter:on
}
