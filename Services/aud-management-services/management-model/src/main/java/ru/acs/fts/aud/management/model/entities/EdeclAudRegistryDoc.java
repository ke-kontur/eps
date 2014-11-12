package ru.acs.fts.aud.management.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "EDECL_AJD_REGISTRY_DOC" )
public class EdeclAudRegistryDoc
{
	@Id
	@Column( name = "AJDRD_ARCH_DOCUMENTID", length = 36, nullable = false )
	private String archDocumentId;
	
	@Column( name = "AJDRD_ARCHPACKETID", length = 36, nullable = true )
	private String archPacketId;
	
	@Column( name = "AJDRD_ARCH_VERSION", nullable = false )
	private int archVersion;
	
	@Column( name = "AJDRD_ACTUAL_FLAG", nullable = true )
	private Integer actualFlag;
	
	@Column( name = "AJDRD_ARCHREFMAINDOC", length = 36, nullable = true )
	private String archRefMainDoc;
	
	@Column( name = "AJDRD_APP_DOCUMENTID", length = 100, nullable = true )
	private String appDocumentId;
	
	@Column( name = "AJDRD_APP_DOCUMENTMODEID", length = 30, nullable = true )
	private String appDocumentModeId;
	
	@Column( name = "AJDRD_APP_DOCDESCR", length = 500, nullable = true )
	private String appDocDescr;
	
	// @formatter:off
	public void setArchDocumentId( String archDocumentId ) { this.archDocumentId = archDocumentId; }
	public String getArchDocumentId( ) { return archDocumentId; }

	public void setArchPacketId( String archPacketId ) { this.archPacketId = archPacketId; }
	public String getArchPacketId( ) { return archPacketId; }

	public void setArchVersion( int archVersion ) { this.archVersion = archVersion; }
	public int getArchVersion( ) { return archVersion; }

	public void setActualFlag( Integer actualFlag ) { this.actualFlag = actualFlag; }
	public Integer getActualFlag( ) { return actualFlag; }

	public void setArchRefMainDoc( String archRefMainDoc ) { this.archRefMainDoc = archRefMainDoc; }
	public String getArchRefMainDoc( ) { return archRefMainDoc; }

	public void setAppDocumentId( String appDocumentId ) { this.appDocumentId = appDocumentId; }
	public String getAppDocumentId( ) { return appDocumentId; }

	public void setAppDocumentModeId( String appDocumentModeId ) { this.appDocumentModeId = appDocumentModeId; }
	public String getAppDocumentModeId( ) { return appDocumentModeId; }

	public void setAppDocDescr( String appDocDescr ) { this.appDocDescr = appDocDescr; }
	public String getAppDocDescr( ) { return appDocDescr; }
	// @formatter:on
}
