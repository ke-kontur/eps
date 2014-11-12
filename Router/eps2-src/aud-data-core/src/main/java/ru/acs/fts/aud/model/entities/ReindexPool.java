package ru.acs.fts.aud.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "ML_REINDEX_POOL" )
public class ReindexPool
{
	@Id
	@Column( name = "ATTRIBUTE_VERSION_ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String attributeVersionId;
	
	@Id
	@Column( name = "DOCUMENT_KIND_VERSION_ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String documentKindVersionId;
	
	// @formatter:off
	public void setAttributeVersionId( String attributeVersionId ) { this.attributeVersionId = attributeVersionId; }
	public String getAttributeVersionId( ) { return attributeVersionId; }
	
	public void setDocumentKindVersionId( String documentKindVersionId ) { this.documentKindVersionId = documentKindVersionId; }
	public String getDocumentKindVersionId( ) { return documentKindVersionId; }
	// @formatter:on
}
