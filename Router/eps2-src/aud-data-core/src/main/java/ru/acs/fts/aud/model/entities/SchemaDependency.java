package ru.acs.fts.aud.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "ML_SCHEMA_DEPENDENCIES" )
public class SchemaDependency
{
	@Id
	@Column( name = "SCHEMA_ID", length = 16 )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String schemaId;
	
	@Id
	@Column( name = "IMPORT_SCHEMA_ID", length = 16 )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String importSchemaId;
	
	// @formatter:off
	public void setSchemaId( String schemaId ) { this.schemaId = schemaId; }
	public String getSchemaId( ) { return schemaId; }
	
	public void setImportSchemaId( String importSchemaId ) { this.importSchemaId = importSchemaId; }
	public String getImportSchemaId( ) { return importSchemaId; }
	// @formatter:on
}
