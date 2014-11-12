package ru.acs.fts.eps2.model.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

@Entity
@IdClass( ProcParticipantAccessIds.class )
@Table( name = "EDECL_PROC_PARTICIPANT_ACCESS" )
public class ProcParticipantAccess
{
	@Id
	@Column( name = "PPA_PROCESSID", length = 36, nullable = false )
	private String processId;
	
	@Id
	@Column( name = "PPA_PARTICIPANTID", length = 100, nullable = false )
	private String participantId;
	
	@Id
	@Column( name = "PPA_SOFTVERSION", length = 100, nullable = false )
	private String softVersion;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "PPA_GRANTED", length = 9, nullable = false, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NOT NULL" )
	private Calendar granted;
	
	@Column( name = "PPA_ISSUER", length = 100, nullable = false )
	private String issuer;
	
	// @formatter:off
	public void setProcessId( String processId ) { this.processId = processId; }
	public String getProcessId( ) { return processId; }
	
	public void setParticipantId( String participantId ) { this.participantId = participantId; }
	public String getParticipantId( ) { return participantId; }
	
	public void setSoftVersion( String softVersion ) { this.softVersion = softVersion; }
	public String getSoftVersion( ) { return softVersion; }
	
	public void setGranted( Calendar granted ) { this.granted = granted; }
	public Calendar getGranted( ) { return granted; }
	
	public void setIssuer( String issuer ) { this.issuer = issuer; }
	public String getIssuer( ) { return issuer; }
	// @formatter:on
}
