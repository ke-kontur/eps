package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass( Edarch_Reqinfo_Ids.class )
@Table( name = "EDARCH_REQINFO" )
public class Edarch_Reqinfo
{
	public Edarch_Reqinfo( )
	{

	}

	@Id
	@Column( name = "ARRI_REQENVID", nullable = false, length = 36 )
	private String reqEnvId;
	
	@Id
	@Column( name = "ARRI_IDINTERNAL", length = 41 )
	private String idInternal;
	
	@Id
	@Column( name = "ARRI_ADOC_IDINTERNAL", length = 41 )
	private String ardocIdInternal;

	@Column( name = "ARRI_RESENVID", length = 36 )
	private String resSenVid;
	
	@Column( name = "ARRI_SVHREGNUM_CUSTCODE", length = 8 )
	private String svhRegNumberCustCode;
	
	@Temporal( TemporalType.DATE )
	@Column( name = "ARRI_SVHREGNUM_DATE" )
	private Date svhRegNumberDate;
	
	@Column( name = "ARRI_SVHREGNUM_NUMBER", length = 7 )
	private String svhRegNumberNumber;
	
	@Column( name = "ARRI_REQDOCID", length = 36, nullable = false )
	private String reqDocId;

	public String getReqEnvId( ) { return reqEnvId; }
	public void setReqEnvId( String reqEnvId ) { this.reqEnvId = reqEnvId; }

	public String getIdInternal( ) { return idInternal; }
	public void setIdInternal( String idInternal ) { this.idInternal = idInternal; }

	public String getArdocIdInternal( ) { return ardocIdInternal; }
	public void setArdocIdInternal( String ardocIdInternal ) { this.ardocIdInternal = ardocIdInternal; }

	public String getResSenVid( ) { return resSenVid; }
	public void setResSenVid( String resSenVid ) { this.resSenVid = resSenVid; }

	public String getSvhRegNumberCustCode( ) { return svhRegNumberCustCode; }
	public void setSvhRegNumberCustCode( String svhRegNumberCustCode ) { this.svhRegNumberCustCode = svhRegNumberCustCode; }

	public Date getSvhRegNumberDate( ) { return svhRegNumberDate; }
	public void setSvhRegNumberDate( Date svhRegNumberDate ) { this.svhRegNumberDate = svhRegNumberDate; }

	public String getSvhRegNumberNumber( ) { return svhRegNumberNumber; } 
	public void setSvhRegNumberNumber( String svhRegNumberNumber ) { this.svhRegNumberNumber = svhRegNumberNumber;}

	public String getReqDocId( ) { return reqDocId; }
	public void setReqDocId( String reqDocId ) { this.reqDocId = reqDocId; }
}
