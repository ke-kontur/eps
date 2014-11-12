package ru.acs.fts.eps2.ws.data.model.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

@Entity
@Table( name = "EDECL_AUD_COMMAND" )
public class AudCommand
{
	@Id
	@Column( name = "AUDCMD_RECID", nullable = false )
	@GeneratedValue( generator = "AudCmdIdSeq" )
	@SequenceGenerator( name = "AudCmdIdSeq", sequenceName = "AUDCMD_ID_SEQ", allocationSize = 1 )
	private Integer recId;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "AUDCMD_DATETYME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar dateTime;
	
	@Column( name = "AUDCMD_STATE", length = 15, nullable = true )
	private String state;
	
	@Column( name = "AUDCMD_ERRCODE", length = 15, nullable = true )
	private String errCode;
	
	@Column( name = "AUDCMD_ERRDESCRIPTION", length = 250, nullable = true )
	private String errDescription;
	
	/*
	@Column( name = "AUDCMD_OUTENVELOPEID", length = 36, nullable = true )
	private String outEnvelopeId;
	*/
	
	@ManyToOne
	@JoinColumn( name = "AUDCMD_OUTENVELOPEID", nullable = true )
	private AudMessage outEnvelope;
	
	/*
	@Column( name = "AUDCMD_INENVELOPEID", length = 36, nullable = true )
	private String inEnvelopeId;
	*/
	
	@ManyToOne( cascade = { CascadeType.ALL } )
	@JoinColumn( name = "AUDCMD_INENVELOPEID", nullable = true )
	private AudMessage inEnvelope;
	
	@Column( name = "AUDCMD_EADFLAG", nullable = true )
	private Integer eadFlag;
	
	/*
	@Column( name = "AUDCMD_PROCESSID", length = 36, nullable = true )
	private String processId;
	*/
	
	@ManyToOne
	@JoinColumn( name = "AUDCMD_PROCESSID", nullable = true )
	private AudProcInfo procInfo;
	
	@Lob
	@Column( name = "AUDCMD_INTERROR", nullable = true )
	private byte[ ] intError;
	
	/*
	@Column( name = "AUDCMD_INTCMD", nullable = true )
	private Integer intCmd;
	*/
	
	@ManyToOne
	@JoinColumn( name = "AUDCMD_INTCMD", nullable = true )
	private AudIntCommand intCmd;
	
	@Column( name = "AUDCMD_GUID", length = 36, nullable = false )
	private String guid;
	
	@Column( name = "AUDCMD_ENVELOPEID", length = 36, nullable = true )
	private String envelopeId;
	
	/*
	@OneToMany( mappedBy = "refCmd", cascade = { CascadeType.ALL } )
	private List< AudDocInfo > audDocInfos = new ArrayList< AudDocInfo >( );
	*/
	
	// @formatter:off
	public void setRecId( int recId ) { this.recId = recId; }
	public int getRecId( ) { return recId; }
	
	public void setDateTime( Calendar dateTime ) { this.dateTime = dateTime; }
	public Calendar getDateTime( ) { return dateTime; }
	
	public void setState( String state ) { this.state = state; }
	public String getState( ) { return state; }
	
	public void setErrCode( String errCode ) { this.errCode = errCode; }
	public String getErrCode( ) { return errCode; }
	
	public void setErrDescription( String errDescription ) { this.errDescription = errDescription; }
	public String getErrDescription( ) { return errDescription; }
	
	/*
	public void setOutEnvelopeId( String outEnvelopeId ) { this.outEnvelopeId = outEnvelopeId; }
	public String getOutEnvelopeId( ) { return outEnvelopeId; }
	*/
	public void setOutEnvelope( AudMessage outEnvelope ) { this.outEnvelope = outEnvelope; }
	public AudMessage getOutEnvelope( ) { return outEnvelope; }
	
	/*
	public void setInEnvelopeId( String inEnvelopeId ) { this.inEnvelopeId = inEnvelopeId; }
	public String getInEnvelopeId( ) { return inEnvelopeId; }
	*/
	
	public void setInEnvelope( AudMessage inEnvelope ) { this.inEnvelope = inEnvelope; }
	public AudMessage getInEnveope( ) { return inEnvelope; }
	
	public void setEadFlag( Integer eadFlag ) { this.eadFlag = eadFlag; }
	public Integer getEadFlag( ) { return eadFlag; }
	
	/*
	public void setProcessId( String processId ) { this.processId = processId; }
	public String getProcessId( ) { return processId; }
	*/
	public void setProcInfo( AudProcInfo procInfo ) { this.procInfo = procInfo; }
	public AudProcInfo getProcInfo( ) { return procInfo; }
	
	public void setIntError( byte[ ] intError ) { this.intError = intError; }
	public byte[ ] getIntError( ) { return intError; }
	
	/*
	public void setIntCmd( Integer intCmd ) { this.intCmd = intCmd; }
	public Integer getIntCmd( ) { return intCmd; }
	*/
	
	public void setIntCmd( AudIntCommand intCmd ) { this.intCmd = intCmd; }
	public AudIntCommand getIntCmd( ) { return intCmd; }
	
	public void setGuid( String guid ) { this.guid = guid; }
	public String getGuid( ) { return guid; }
	
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }

	/*
	public void setAudDocInfos( List< AudDocInfo > audDocInfos ) { this.audDocInfos = audDocInfos; }
	public List< AudDocInfo > getAudDocInfos( ) { return audDocInfos; }
	*/
	// @formatter:on
}
