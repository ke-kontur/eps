package ru.acs.fts.aud.management.model.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "EDARCH_ARCHIVE" )
public class EdarchArchive
{
	@Id
	@Column( name = "ARCH_IDINTERNAL", length = 41 )
	private String idInternal;

	@Column( name = "ARCH_ARCHNAME", nullable = true, length = 250 )
	private String archName;

	@Column( name = "ARCH_CREATEDATE", nullable = false )
	private Date createDate;

	@Column( name = "ARCH_DECL", nullable = false, length = 100 )
	private String decl;

	@Column( name = "ARCH_STAGESTATUS", nullable = true, length = 255 )
	private String stageStatus;
	
	@OneToMany( mappedBy = "archive", cascade = { CascadeType.ALL } )
	private List< EdarchDocument > documents = new ArrayList< EdarchDocument >( );	

	// @formatter:off
	public void setIdInternal( String idInternal ) { this.idInternal = idInternal; }
	public String getIdInternal( ) { return idInternal; }
	
	public void setArchName( String archName ) { this.archName = archName; }
	public String getArchName( ) { return archName; }
	
	public void setCreateDate( Date createDate ) { this.createDate = createDate; }
	public Date getCreateDate( ) { return createDate; }
	
	public void setDecl( String decl ) { this.decl = decl; }
	public String getDecl( ) { return decl; }
	
	public void setStageStatus( String stageStatus ) { this.stageStatus = stageStatus; }
	public String getStageStatus( ) { return stageStatus; }
	
	public void setDocuments( List< EdarchDocument > documents ) { this.documents = documents; }
	public List< EdarchDocument > getDocuments( ) { return documents; }
	// @formatter:on
}
