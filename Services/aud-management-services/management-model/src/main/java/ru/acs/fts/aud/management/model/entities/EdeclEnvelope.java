package ru.acs.fts.aud.management.model.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

@Entity
@Table( name = "EDECL_MESSAGES" )
public class EdeclEnvelope
{
	@Id
	@Column( name = "MSG_ENVELOPEID", length = 36, nullable = false )
	private String envelopeId;
	
	/*
	@Column( name = "MSG_INCOMEENVELOPEID", length = 36, nullable = true )
	private String incomeEnvelopeId;
	*/
	@OneToOne
	@JoinColumn( name = "MSG_INCOMEENVELOPEID", nullable = true )
	private EdeclEnvelope incomeEnvelope;
	
	/*
	@Column( name = "MSG_INITIALENVELOPEID", length = 36, nullable = true )
	private String initialEnvelopeId;
	*/
	@OneToOne
	@JoinColumn( name = "MSG_INITIALENVELOPEID", nullable = true )
	private EdeclEnvelope initialEnvelope;
	
	@Column( name = "MSG_SENDERINFORMATION", length = 100, nullable = false )
	private String senderInformation;
	
	@Column( name = "MSG_RECEIVERINFORMATION", length = 100, nullable = false )
	private String receiverInformation;
	
	@Column( name = "MSG_PRIORITY", nullable = true )
	private Integer priority;
	
	@Column( name = "MSG_EXPIRATION", nullable = true )
	private Integer expiration;
	
	@Column( name = "MSG_COD", length = 1, nullable = true )
	private String cod;
	
	@Column( name = "MSG_SOFTKIND", length = 100, nullable = true )
	private String softKind;
	
	@Column( name = "MSG_SOFTVERSION", length = 100, nullable = true )
	private String softVersion;
	
	@Column( name = "MSG_MESSAGEKIND", length = 30, nullable = true )
	private String messageKind;
	
	@Column( name = "MSG_MESSAGETYPE", length = 9, nullable = true )
	private String messageType;
	
	@Column( name = "MSG_PARTICIPANTID", length = 100, nullable = true )
	private String participantId;
	
	/*
	@Column( name = "MSG_PROCESSID", length = 36, nullable = true )
	private String processId;
	*/
	@ManyToOne
	@JoinColumn( name = "MSG_PROCESSID", nullable = true )
	private EdeclProcInformation process;
	
	/*
	@Column( name = "MSG_DOCUMENTID", length = 36, nullable = true )
	private String documentId;
	*/
	@ManyToOne
	@JoinColumn( name = "MSG_DOCUMENTID", nullable = true )
	private EdeclDocument document;
	
	@Column( name = "MSG_RCVCUSTOMSCODE", nullable = true )
	private Integer receiverCustomsCode;
	
	@Column( name = "MSG_RCVEXCHTYPE", nullable = true )
	private Integer receiverExchType;
	
	@Column( name = "MSG_SENDCUSTOMSCODE", nullable = true )
	private Integer senderCustomsCode;
	
	@Column( name = "MSG_SENDEXCHTYPE", nullable = true )
	private Integer senderExchType;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "MSG_PREPARATIONDATETIME", length = 9, nullable = false, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NOT NULL" )
	private Calendar preparationDatetime;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "MSG_RECVDATE", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar receiveDate;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "MSG_SENDDATE", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar sendDate;

	@Column( name = "MSG_AJD_ARCHIVECLIENTID", length = 100, nullable = true )
	private String audArchiveClientId;
	
	@Column( name = "MSG_AJD_CUSTOMSCODE", nullable = true )
	private Integer audCustomsCode;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "MSG_COA_DATETIME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar coaDateTime;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "MSG_COA_SAVE_DATETIME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar coaSaveDateTime;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "MSG_COD_SAVE_DATETIME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar codSaveDateTime;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "MSG_COD_DATETIME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar codDateTime;
	
	@Column( name = "MSG_COMPRESSTYPE", length = 15, nullable = true )
	private String compressType;
	
	@OneToMany( mappedBy = "envelope", cascade = { CascadeType.ALL } )
	private List< EdeclProcState > procStates = new ArrayList< EdeclProcState >( );
	
	@OneToMany( mappedBy = "envelope", cascade = { CascadeType.ALL } )
	private List< EdeclResultInfo > results = new ArrayList< EdeclResultInfo >( );

	// @formatter:off
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }

	/*
	public void setIncomeEnvelopeId( String incomeEnvelopeId ) { this.incomeEnvelopeId = incomeEnvelopeId; }
	public String getIncomeEnvelopeId( ) { return incomeEnvelopeId; }
	*/
	public void setIncomeEnvelope( EdeclEnvelope incomeEnvelope ) { this.incomeEnvelope = incomeEnvelope; }
	public EdeclEnvelope getIncomeEnvelope( ) { return incomeEnvelope; }

	/*
	public void setInitialEnvelopeId( String initialEnvelopeId ) { this.initialEnvelopeId = initialEnvelopeId; }
	public String getInitialEnvelopeId( ) { return initialEnvelopeId; }
	*/
	public void setInitialEnvelope( EdeclEnvelope initialEnvelope ) { this.initialEnvelope = initialEnvelope; }
	public EdeclEnvelope getInitialEnvelope( ) { return initialEnvelope; }

	public void setSenderInformation( String senderInformation ) { this.senderInformation = senderInformation; }
	public String getSenderInformation( ) { return senderInformation; }

	public void setReceiverInformation( String receiverInformation ) { this.receiverInformation = receiverInformation; }
	public String getReceiverInformation( ) { return receiverInformation; }

	public void setPriority( Integer priority ) { this.priority = priority; }
	public Integer getPriority( ) { return priority; }

	public void setExpiration( Integer expiration ) { this.expiration = expiration; }
	public Integer getExpiration( ) { return expiration; }

	public void setCod( String cod ) { this.cod = cod; }
	public String getCod( ) { return cod; }

	public void setSoftKind( String softKind ) { this.softKind = softKind; }
	public String getSoftKind( ) { return softKind; }

	public void setSoftVersion( String softVersion ) { this.softVersion = softVersion; }
	public String getSoftVersion( ) { return softVersion; }

	public void setMessageKind( String messageKind ) { this.messageKind = messageKind; }
	public String getMessageKind( ) { return messageKind; }

	public void setMessageType( String messageType ) { this.messageType = messageType; }
	public String getMessageType( ) { return messageType; }

	public void setParticipantId( String participantId ) { this.participantId = participantId; }
	public String getParticipantId( ) { return participantId; }

	/*
	public void setProcessId( String processId ) { this.processId = processId; }
	public String getProcessId( ) { return processId; }
	*/
	public void setProcess( EdeclProcInformation process ) { this.process = process; }
	public EdeclProcInformation getProcess( ) { return process; }

	/*
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	*/
	public void setDocument( EdeclDocument document ) { this.document = document; }
	public EdeclDocument getDocument( ) { return document; }

	public void setReceiverCustomsCode( Integer receiverCustomsCode ) { this.receiverCustomsCode = receiverCustomsCode; }
	public Integer getReceiverCustomsCode( ) { return receiverCustomsCode; }

	public void setReceiverExchType( Integer receiverExchType ) { this.receiverExchType = receiverExchType; }
	public Integer getReceiverExchType( ) { return receiverExchType; }

	public void setSenderCustomsCode( Integer senderCustomsCode ) { this.senderCustomsCode = senderCustomsCode; }
	public Integer getSenderCustomsCode( ) { return senderCustomsCode; }

	public void setSenderExchType( Integer senderExchType ) { this.senderExchType = senderExchType; }
	public Integer getSenderExchType( ) { return senderExchType; }

	public void setPreparationDatetime( Calendar preparationDatetime ) { this.preparationDatetime = preparationDatetime; }
	public Calendar getPreparationDatetime( ) { return preparationDatetime; }

	public void setReceiveDate( Calendar receiveDate ) { this.receiveDate = receiveDate; }
	public Calendar getReceiveDate( ) { return receiveDate; }

	public void setSendDate( Calendar sendDate ) { this.sendDate = sendDate; }
	public Calendar getSendDate( ) { return sendDate; }

	public void setAudArchiveClientId( String audArchiveClientId ) { this.audArchiveClientId = audArchiveClientId; }
	public String getAudArchiveClientId( ) { return audArchiveClientId; }

	public void setAudCustomsCode( Integer audCustomsCode ) { this.audCustomsCode = audCustomsCode; }
	public Integer getAudCustomsCode( ) { return audCustomsCode; }

	public void setCoaDateTime( Calendar coaDateTime ) { this.coaDateTime = coaDateTime; }
	public Calendar getCoaDateTime( ) { return coaDateTime; }

	public void setCoaSaveDateTime( Calendar coaSaveDateTime ) { this.coaSaveDateTime = coaSaveDateTime; }
	public Calendar getCoaSaveDateTime( ) { return coaSaveDateTime; }

	public void setCodSaveDateTime( Calendar codSaveDateTime ) { this.codSaveDateTime = codSaveDateTime; }
	public Calendar getCodSaveDateTime( ) { return codSaveDateTime; }

	public void setCodDateTime( Calendar codDateTime ) { this.codDateTime = codDateTime; }
	public Calendar getCodDateTime( ) { return codDateTime; }

	public void setCompressType( String compressType ) { this.compressType = compressType; }
	public String getCompressType( ) { return compressType; }
	
	public void setProcStates( List< EdeclProcState > procStates ) { this.procStates = procStates; }
	public List< EdeclProcState > getProcStates( ) { return procStates; }
	
	public void setResults( List< EdeclResultInfo > results ) { this.results = results; }
	public List< EdeclResultInfo > getResults( ) { return results; }
	// @formatter:off
	
}
