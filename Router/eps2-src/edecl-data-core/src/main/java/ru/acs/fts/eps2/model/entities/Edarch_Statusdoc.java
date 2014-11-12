package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name = "EDARCH_STATUSDOC" )
public class Edarch_Statusdoc // NO_UCD (for future use)
{
	public Edarch_Statusdoc( )
	{

	}

	@Id
	@Column( name = "ARSTDOC_ID", length = 38, nullable = false )
	private Long id;
	
	@Column( name = "ARSTDOC_DOCID", length = 36, nullable = false )
	private String docId;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Column( name = "ARSTDOC_CHDATE", length = 6, columnDefinition = "TIMESTAMP(6) NOT NULL", nullable = false )
	private Date changeDate;
	
	@Column( name = "ARSTDOC_ARCHID", length = 41, nullable = false )
	private String archId;
	
	@Column( name = "ARSTDOC_DOCSTATUS", length = 30, nullable = false )
	private String docStatus;
	
	@Column( name = "ARSTDOC_ARCHDOCID", length = 41, nullable = false )
	private String archDocId;

	public Long getId( ) { return id; }
	public void setId( Long id ) { this.id = id; }

	public String getDocId( ) { return docId; }
	public void setDocId( String docId ) { this.docId = docId; }

	public Date getChangeDate( ) { return changeDate; }
	public void setChangeDate( Date changeDate ) { this.changeDate = changeDate; }

	public String getArchId( ) { return archId; }
	public void setArchId( String archId ) { this.archId = archId; }

	public String getDocStatus( ) { return docStatus; }
	public void setDocStatus( String docStatus ) { this.docStatus = docStatus; }

	public String getArchDocId( ) { return archDocId; }
	public void setArchDocId( String archDocId ) { this.archDocId = archDocId; }
}
