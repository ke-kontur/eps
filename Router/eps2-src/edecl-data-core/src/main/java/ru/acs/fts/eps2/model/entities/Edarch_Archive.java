package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@Table( name = "EDARCH_ARCHIVE" )
public class Edarch_Archive
{
	public Edarch_Archive( )
	{

	}

	@Id
	@Column( name = "ARCH_IDINTERNAL", length = 41, nullable = false )
	private String idInternal;
	
	@Column( name = "ARCH_ARCHNAME", length = 250 )
	private String archName;
	
	@Temporal( TemporalType.DATE )
	@Column( name = "ARCH_CREATEDATE", nullable = false )
	private Date createDate;
	
	@Column( name = "ARCH_DECL", length = 100, nullable = false )
	private String decl;
	
	@Column( name = "ARCH_STAGESTATUS", length = 255 )
	private String stageStatus;

	public String getIdInternal( ) { return idInternal; }
	public void setIdInternal( String idInternal ) { this.idInternal = idInternal; }

	public String getArchName( ) { return archName; }
	public void setArchName( String archName ) { this.archName = archName; }

	public Date getCreateDate( ) { return createDate; }
	public void setCreateDate( Date createDate ) { this.createDate = createDate; }

	public String getDecl( ) { return decl; }
	public void setDecl( String decl ) { this.decl = decl; }

	public String getStageStatus( ) { return stageStatus; }
	public void setStageStatus( String stageStatus ) { this.stageStatus = stageStatus; }
}
