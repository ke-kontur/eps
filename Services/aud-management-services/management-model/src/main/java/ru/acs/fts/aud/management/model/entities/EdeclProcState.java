package ru.acs.fts.aud.management.model.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

@Entity
@Table( name = "EDECL_PROCSTATE" )
public class EdeclProcState
{
	@Id
	@Column( name = "PRST_ID", nullable = false )
	@GeneratedValue( generator = "PrstIdSeq" )
	@SequenceGenerator( name = "PrstIdSeq", sequenceName = "PRST_ID_SEQ", allocationSize = 1 )
	private Integer id;
	
	/*
	@Column( name = "PRST_ENVELOPEID", length = 36, nullable = true )
	private String envelopeId;
	*/
	@ManyToOne
	@JoinColumn( name = "PRST_ENVELOPEID", nullable = true )
	private EdeclEnvelope envelope;
	
	@Column( name = "PRST_ST_CODE", length = 30, nullable = false )
	private String stateCode;
	
	/*
	@Column( name = "PRST_PROCESSID", length = 36, nullable = false )
	private String processId;
	*/
	@ManyToOne
	@JoinColumn( name = "PRST_PROCESSID", nullable = false )
	private EdeclProcInformation process;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "PRST_SETSTATUSTIME", length = 9, nullable = false, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NOT NULL" )
	private Calendar setStatusTime;

	// @formatter:off
	public void setId( int id ) { this.id = id; }
	public int getId( ) { return id; }

	/*
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }
	*/
	public void setEnvelope( EdeclEnvelope envelope ) { this.envelope = envelope; }
	public EdeclEnvelope getEnvelope( ) { return envelope; }

	public void setStateCode( String stateCode ) { this.stateCode = stateCode; }
	public String getStateCode( ) { return stateCode; }

	/*
	public void setProcessId( String processId ) { this.processId = processId; }
	public String getProcessId( ) { return processId; }
	*/
	public void setProcess( EdeclProcInformation process ) { this.process = process; }
	public EdeclProcInformation getProcess( ) { return process; }

	public void setSetStatusTime( Calendar setStatusTime ) { this.setStatusTime = setStatusTime; }
	public Calendar getSetStatusTime( ) { return setStatusTime; }
	// @formatter:on
	
}
