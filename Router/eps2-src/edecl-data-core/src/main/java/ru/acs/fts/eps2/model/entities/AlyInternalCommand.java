package ru.acs.fts.eps2.model.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

@Entity
@Table( name = "EDECL_ALY_INT_COMMAND" )
public class AlyInternalCommand
{
	public AlyInternalCommand( )
	{

	}

	@Id
	@GeneratedValue( generator = "alyCmdIntIdSeq" )
	@SequenceGenerator( name = "alyCmdIntIdSeq", sequenceName = "ALYCMD_INT_ID_SEQ", allocationSize = 1 )
	@Column( name = "AICMD_RECID", length = 12 )
	private Long recordId;

	@Column( name = "AICMD_DOCUMENTID", length = 36 )
	private String documentId;

	@Column( name = "AICMD_MSGCODE", length = 9 )
	private String messageCode;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "AICMD_DATETIME", length = 9, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE" )
	private Calendar dateTime;

	@Column( name = "AICMD_STATE", length = 15 )
	private String state;

	@Lob
	@Column( name = "AICMD_INTERROR" )
	private byte[ ] internalError;

	@Column( name = "AICMD_PROCESSID", length = 36 )
	private String processId;

	@Column( name = "AICMD_ENVELOPEID", length = 36 )
	private String envelopeId;

	@Column( name = "AICMD_REGID", length = 36 )
	private String regId;

	// @formatter:off
	public void setRecordId( Long recordId ) { this.recordId = recordId; }
	public Long getRecordId( ) { return recordId; }
	
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	
	public void setMessageCode( String messageCode ) { this.messageCode = messageCode; }
	public String getMessageCode( ) { return messageCode; }
	
	public void setDateTime( Calendar dateTime ) { this.dateTime = dateTime; }
	public Calendar getDateTime( ) { return dateTime; }
	
	public void setState( String state ) { this.state = state; }
	public String getState( ) { return state; }
	
	public void setInternalError( byte[ ] internalError ) { this.internalError = internalError; }
	public byte[] getInternalError( ) { return internalError; }
	
	public void setProcessId( String processId ) { this.processId = processId; }
	public String getProcessId( ) { return processId; }
	
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }
	
	public void setRegId( String regId ) { this.regId = regId; }
	public String getRegId( ) { return regId; }
	// @formatter:on
}
