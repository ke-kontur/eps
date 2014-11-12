package ru.acs.fts.aud.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "ML_SCHEMA" )
public class Schema
{
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id;
	
	@Lob
	@Column( name = "CONTENT", length = 4000, nullable = false )
	private byte[ ] content;
	
	@Column( name = "NAMESPACE", length = 255, nullable = false )
	private String namespace;
	
	@Column( name = "VERSION", length = 255, nullable = true )
	private String version;
	
	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setContent( byte[ ] content ) { this.content = content; }
	public byte[ ] getContent( ) { return content; }
	
	public void setNamespace( String namespace ) { this.namespace = namespace; }
	public String getNamespace( ) { return namespace; }
	
	public void setVersion( String version ) { this.version = version; }
	public String getVersion( ) { return version; }
	// @formatter:on
}
