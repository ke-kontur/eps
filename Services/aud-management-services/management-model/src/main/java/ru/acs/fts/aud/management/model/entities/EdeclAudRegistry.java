package ru.acs.fts.aud.management.model.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

@Entity
@Table( name = "EDECL_AJD_REGISTRY" )
public class EdeclAudRegistry
{
	@Id
	@Column( name = "AJDR_ID", length = 36, nullable = false )
	private String id;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "AJDR_DATETIME", length = 9, nullable = false, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NOT NULL" )
	private Calendar dateTime;
	
	@Column( name = "AJDR_NAME", length = 250, nullable = true )
	private String name;
	
	@Column( name = "AJDR_STARTDATE", nullable = false )
	private Date startDate;
	
	@Column( name = "AJDR_STOPDATE", nullable = true )
	private Date stopDate;
	
	@Column( name = "AJDR_DATEFLAG", length = 1, nullable = false )
	private String dateFlag;
	
	@Column( name = "AJDR_CURRSTATUS", length = 100, nullable = false )
	private String currStatus;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "AJDR_SETSTATUSDATE", length = 9, nullable = false, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NOT NULL" )
	private Calendar setStatusDate;
	
	@Column( name = "AJDR_ENVELOPEID", length = 36, nullable = true )
	private String envelopeId;
	
	@Column( name = "AJDRR_NULLFLAG", nullable = false )
	private int nullFlag;
	
	@OneToMany( mappedBy = "audRegistry", cascade = { CascadeType.ALL } )
	private List< EdeclAudRegistryResult > audRegistryResults = new ArrayList< EdeclAudRegistryResult >( );		
	
	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }

	public void setDateTime( Calendar dateTime ) { this.dateTime = dateTime; }
	public Calendar getDateTime( ) { return dateTime; }

	public void setName( String name ) { this.name = name; }
	public String getName( ) { return name; }

	public void setStartDate( Date startDate ) { this.startDate = startDate; }
	public Date getStartDate( ) { return startDate; }

	public void setStopDate( Date stopDate ) { this.stopDate = stopDate; }
	public Date getStopDate( ) { return stopDate; }

	public void setDateFlag( String dateFlag ) { this.dateFlag = dateFlag; }
	public String getDateFlag( ) { return dateFlag; }

	public void setCurrStatus( String currStatus ) { this.currStatus = currStatus; }
	public String getCurrStatus( ) { return currStatus; }

	public void setSetStatusDate( Calendar setStatusDate ) { this.setStatusDate = setStatusDate; }
	public Calendar getSetStatusDate( ) { return setStatusDate; }

	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }

	public void setNullFlag( int nullFlag ) { this.nullFlag = nullFlag; }
	public int getNullFlag( ) { return nullFlag; }
	
	public void setAudRegistryResults( List< EdeclAudRegistryResult > audRegistryResults ) { this.audRegistryResults = audRegistryResults; }
	public List< EdeclAudRegistryResult > getAudRegistryResults( ) { return audRegistryResults; }
	// @formatter:on
}
