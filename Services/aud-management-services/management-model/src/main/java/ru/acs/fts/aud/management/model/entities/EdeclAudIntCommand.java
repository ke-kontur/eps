package ru.acs.fts.aud.management.model.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

@Entity
@Table( name = "EDECL_AUD_INT_COMMAND" )
public class EdeclAudIntCommand
{
	@Id
	@Column( name = "AICMD_RECID", nullable = false )
	@GeneratedValue( generator = "AudCmdIntIdSeq" )
	@SequenceGenerator( name = "AudCmdIntIdSeq", sequenceName = "AUDCMD_INT_ID_SEQ", allocationSize = 1 )
	private Integer recId;
	
	@Column( name = "AICMD_DOCUMENTID", length = 36, nullable = true )
	private String documentId;
	
	@Column( name = "AICMD_MSGCODE", length = 9, nullable = true )
	private String msgCode;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "AICMD_DATETIME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar dateTime;
	
	@Column( name = "AICMD_STATE", length = 15, nullable = true )
	private String state;
	
	@Lob
	@Column( name = "AICMD_INTERROR", nullable = true )
	private byte[ ] intError;
	
	@Column( name = "AICMD_PROCESSID", length = 36, nullable = true )
	private String processId;
	
	@Column( name = "AICMD_ENVELOPEID", length = 36, nullable = true )
	private String envelopeId;
	
	@Column( name = "AICMD_REGID", length = 36, nullable = true )
	private String regId;
	
	@OneToMany( mappedBy = "intCmd", cascade = { CascadeType.ALL } )
	private List< EdeclAudCommand > audCommands = new ArrayList< EdeclAudCommand >( );
	
	// @formatter:off
	public void setRecId( int recId ) { this.recId = recId; }
	public Integer getRecId( ) { return recId; }
	
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	
	public void setMsgCode( String msgCode ) { this.msgCode = msgCode; } 
	public String getMsgCode( ) { return msgCode; }
	
	public void setDateTime( Calendar dateTime ) { this.dateTime = dateTime; }
	public Calendar getDateTime( ) { return dateTime; }
	
	public void setState( String state ) { this.state = state; }
	public String getState( ) { return state; }
	
	public void setIntError( byte[ ] intError ) { this.intError = intError; }
	public byte[ ] getIntError( ) { return intError; }
	
	public void setProcessId( String processId ) { this.processId = processId; }
	public String getProcessId( ) { return processId; }
	
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }
	
	public void setRegId( String regId ) { this.regId = regId; }
	public String getRegId( ) { return regId; }
	// @formatter:on
}
