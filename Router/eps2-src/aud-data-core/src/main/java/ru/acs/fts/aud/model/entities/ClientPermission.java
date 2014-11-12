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
@Table( name = "CLIENT_PERMISSION" )
public class ClientPermission
{
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID
	
	@Column( name = "PERMISSIONTYPE", nullable = false, length = 255 )
	private String permissionType;
	
	/*
	@Column( name = "DOCUMENTKIND_ID", nullable = false )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String documentKindId;
	*/
	@ManyToOne
	@JoinColumn( name = "DOCUMENTKIND_ID", nullable = false )
	private DocumentKind documentKind;

	/*
	@Column( name = "CLIENT_ID", nullable = false )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String clientId;
	*/
	@ManyToOne
	@JoinColumn( name = "CLIENT_ID", nullable = false )
	private Client client;

	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setPermissionType( String permissionType ) { this.permissionType = permissionType; }
	public String getPermissionType( ) { return permissionType; }
	
	/*
	public void setDocumentKindId( String documentKindId ) { this.documentKindId = documentKindId; }
	public String getDocumentKindId( ) { return documentKindId; }
	*/
	public void setDocumentKind( DocumentKind documentKind ) { this.documentKind = documentKind; }
	public DocumentKind getDocumentKind( ) { return documentKind; }
	
	/*
	public void setClientId( String clientId ) { this.clientId = clientId; }
	public String getClientId( ) { return clientId; }
	*/
	public void setClient( Client client ) { this.client = client; }
	public Client getClient( ) { return client; }
	// @formatter:on
}
