package ru.acs.fts.aud.model.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "ML_DOCUMENT_KIND" )
public class DocumentKind
{
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID

	@Column( name = "DOCUMENT_MODE_ID", nullable = false, length = 255 )
	private String documentModeId;

	@Column( name = "REGISTERED", nullable = false )
	private short registered;

	@Column( name = "DESCRIPTION", nullable = false, length = 255 )
	private String description;

	@Column( name = "RETENTION_PERIOD", nullable = false )
	private int retentionPeriod;
	
	@OneToMany( mappedBy = "documentKind" )
	private List< ClientPermission > clientPermissions;
	
	@OneToMany( mappedBy = "documentKind" )
	private List< Attribute > attributes;
	
	@OneToMany( mappedBy = "documentKind" )
	private List< DocumentKindVersion > documentKindVersions;
	
	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setDocumentModeId( String documentModeId ) { this.documentModeId = documentModeId; }
	public String getDocumentModeId( ) { return documentModeId; }
	
	public void setRegistered( short registered ) { this.registered = registered; }
	public short getRegistered( ) { return registered; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	
	public void setRetentionPeriod( int retentionPeriod ) { this.retentionPeriod = retentionPeriod; }
	public int getRetentionPeriod( ) { return retentionPeriod; }
	
	public void setClientPermissions( List< ClientPermission > clientPermissions ) { this.clientPermissions = clientPermissions; }
	public List< ClientPermission > getClientPermissions( ) { return clientPermissions; }
	
	public void setAttributes( List< Attribute > attributes ) { this.attributes = attributes; }
	public List< Attribute > getAttributes( ) { return attributes; }
	
	public void setDocumentKindVersions( List< DocumentKindVersion > documentKindVersions ) { this.documentKindVersions = documentKindVersions; }
	public List< DocumentKindVersion > getDocumentKindVersions( ) { return documentKindVersions; }
	// @formatter:on
}
