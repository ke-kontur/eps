package ru.acs.fts.aud.model.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "ML_DOCUMENT_KIND_VERSION" )
public class DocumentKindVersion
{
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID

	/*
	@Column( name = "SCHEMA_ID", nullable = false )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String schemaId; // GUID
	*/
	
	@ManyToOne( optional = false )
	@JoinColumn( name = "SCHEMA_ID", nullable = false )
	private Schema schema;

	/*
	@Column( name = "DOCUMENT_KIND_ID", nullable = false )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String documentKindId;
	*/
	
	@ManyToOne
	@JoinColumn( name = "DOCUMENT_KIND_ID", nullable = false )
	private DocumentKind documentKind;
	
	@OneToMany( mappedBy = "documentKindVersion" )
	private List< AttributeVersion > attributeVersions;
	
	@OneToMany( mappedBy = "documentKindVersion" )
	private List< DocumentRepresentation > representations;

	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	/*
	public void setSchemaId( String schemaId ) { this.schemaId = schemaId; }
	public String getSchemaId( ) { return schemaId; }
	*/
	
	public void setSchema( Schema schema ) { this.schema = schema; }
	public Schema getSchema( ) { return schema; }
	
	/*
	public void setDocumentKindId( String documentKindId ) { this.documentKindId = documentKindId; }
	public String getDocumentKindId( ) { return documentKindId; }
	*/
	public void setDocumentKind( DocumentKind documentKind ) { this.documentKind = documentKind; }
	public DocumentKind getDocumentKind( ) { return documentKind; }
	
	public void setAttributeVersions( List< AttributeVersion > attributeVersions ) { this.attributeVersions = attributeVersions; }
	public List< AttributeVersion > getAttributeVersions( ) { return attributeVersions; }
	
	public void setRepresentations( List< DocumentRepresentation > representations ) { this.representations = representations; }
	public List< DocumentRepresentation > getRepresentations( ) { return representations; }
	// @formatter:on	
}
