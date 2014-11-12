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
@Table( name = "EDECL_AUD_PROCINFO" )
public class EdeclAudProcInfo
{
	@Id
	@Column( name = "AUDPROC_PROCESSID", length = 36, nullable = false )
	private String processId;
	
	@Column( name = "AUDPROC_GTD_CUSTCODE", length = 8, nullable = true )
	private String gtdCustomsCode;
	
	@Column( name = "AUDPROC_GTD_DATE", nullable = true )
	private Date gtdRegistrationDate;
	
	@Column( name = "AUDPROC_GTD_NUM", length = 7, nullable = true )
	private String gtdNumber;
	
	@Column( name = "AUDPROC_PACKETID", length = 36, nullable = true )
	private String packetId;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "AUDPROC_PK_CREATEDATETIME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar pkCreateDateTime;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "AUDPROC_PK_CH_DATETIME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar pkChangeDateTime;
	
	@OneToMany( mappedBy = "procInfo", cascade = { CascadeType.ALL } )
	private List< EdeclAudCommand > audCommands = new ArrayList< EdeclAudCommand >( );
	
	@OneToMany( mappedBy = "procInfo", cascade = { CascadeType.ALL } )
	private List< EdeclAudDocInfo > audDocInfos = new ArrayList< EdeclAudDocInfo >( );

	// @formatter:off
	public void setProcessId( String processId ) { this.processId = processId; }
	public String getProcessId( ) { return processId; }

	public void setGtdCustomsCode( String gtdCustomsCode ) { this.gtdCustomsCode = gtdCustomsCode; }
	public String getGtdCustomsCode( ) { return gtdCustomsCode; }

	public void setGtdRegistrationDate( Date gtdRegistrationDate ) { this.gtdRegistrationDate = gtdRegistrationDate; }
	public Date getGtdRegistrationDate( ) { return gtdRegistrationDate; }

	public void setGtdNumber( String gtdNumber ) { this.gtdNumber = gtdNumber; }
	public String getGtdNumber( ) { return gtdNumber; }

	public void setPacketId( String packetId ) { this.packetId = packetId; }
	public String getPacketId( ) { return packetId; }

	public void setPkCreateDateTime( Calendar pkCreateDateTime ) { this.pkCreateDateTime = pkCreateDateTime; }
	public Calendar getPkCreateDateTime( ) { return pkCreateDateTime; }

	public void setPkChangeDateTime( Calendar pkChangeDateTime ) { this.pkChangeDateTime = pkChangeDateTime; }
	public Calendar getPkChangeDateTime( ) { return pkChangeDateTime; }
	
	public void setAudCommands( List< EdeclAudCommand > audCommands ) { this.audCommands = audCommands; }
	public List< EdeclAudCommand > getAudCommands( ) { return audCommands; }
	
	public void setAudDocInfos( List< EdeclAudDocInfo > audDocInfos ) { this.audDocInfos = audDocInfos; }
	public List< EdeclAudDocInfo > getAudDocInfos( ) { return audDocInfos; }
	// @formatter:off

}
