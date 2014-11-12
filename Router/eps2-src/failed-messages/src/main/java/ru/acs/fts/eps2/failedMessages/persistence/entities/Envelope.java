package ru.acs.fts.eps2.failedMessages.persistence.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

@Entity
@Table(name = "EDECL_MESSAGES")
public class Envelope
{
	@Id
	@Column( name = "MSG_ENVELOPEID", length = 36, nullable = false )
	private String envelopeId;
	
	@Column( name = "MSG_INCOMEENVELOPEID", length = 36 )
	private String incomeEnvelopeId;
	
	@Column( name = "MSG_INITIALENVELOPEID", length = 36 )
	private String initialEnvelopeId;
	
	@Column( name = "MSG_SENDERINFORMATION", length = 100, nullable = false )
	private String senderInformation;
	
	@Column( name = "MSG_RECEIVERINFORMATION", length = 100, nullable = false )
	private String receiverInformation;
	
	@Column( name = "MSG_PRIORITY", length = 1 )
	private Integer priority;
	
	@Column( name = "MSG_EXPIRATION" )
	private Integer expiration;
	
	@Column( name = "MSG_COD", length = 1 )
	private String cod;
	
	@Column( name = "MSG_SOFTKIND", length = 100 )
	private String softKind;
	
	@Column( name = "MSG_SOFTVERSION", length = 100 )
	private String softVersion;
	
	@Column( name = "MSG_MESSAGEKIND", length = 30 )
	private String messageKind;
	
	@Column( name = "MSG_MESSAGETYPE", length = 9 )
	private String messageType;
	
	@Column( name = "MSG_PARTICIPANTID", length = 100 )
	private String participantId;
	
	@Column( name = "MSG_PROCESSID", length = 36 )
	private String processId;
	
	@Column( name = "MSG_DOCUMENTID", length = 36 )
	private String documentId;
	
	@Column( name = "MSG_RCVCUSTOMSCODE", length = 8 )
	private Integer rcvCustomCode = null;
	
	@Column( name = "MSG_RCVEXCHTYPE", length = 8 )
	private Integer rcvExchangeType = null;
	
	@Column( name = "MSG_SENDCUSTOMSCODE", length = 8 )
	private Integer senderCustomCode = null;
	
	@Column( name = "MSG_SENDEXCHTYPE", length = 8 )
	private Integer senderExchangeType = null;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "MSG_PREPARATIONDATETIME", length = 9, nullable = false, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NOT NULL" )
	private Calendar preparationDatetime;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "MSG_RECVDATE", length = 9, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE" )
	private Calendar receiveDate;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "MSG_SENDDATE", length = 9, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE" )
	private Calendar sendDate;
	
	@Column( name = "MSG_AJD_ARCHIVECLIENTID", length = 100 )
	private String ajdArchiveClientId;
	
	@Column( name = "MSG_AJD_CUSTOMSCODE", length = 8 )
	private Integer customsCode;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "MSG_COA_DATETIME", length = 9, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE" )
	private Calendar coaDatetime;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "MSG_COA_SAVE_DATETIME", length = 9, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE" )
	private Calendar coaSaveDatetime;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "MSG_COD_SAVE_DATETIME", length = 9, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE" )
	private Calendar codSaveDatetime;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "MSG_COD_DATETIME", length = 9, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE" )
	private Calendar codDatetime;
	
	@Column( name = "MSG_COMPRESSTYPE", length = 15 )
	private String compresstype;

	@Transient
	private Boolean needSave;

	public String getEnvelopeId( ) { return envelopeId; }
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }

	public String getIncomeEnvelopeId( ) { return incomeEnvelopeId; } 
	public void setIncomeEnvelopeId( String incomeEnvelopeId ) { this.incomeEnvelopeId = incomeEnvelopeId; }

	public String getInitialEnvelopeId( ) { return initialEnvelopeId; }
	public void setInitialEnvelopeId( String initialEnvelopeId ) { this.initialEnvelopeId = initialEnvelopeId; }

	public String getSenderInformation( ) { return senderInformation; }
	public void setSenderInformation( String senderInformation ) { this.senderInformation = senderInformation; }

	public String getReceiverInformation( ) { return receiverInformation; }
	public void setReceiverInformation( String receiverInformation ) { this.receiverInformation = receiverInformation; }

	public Integer getPriority( ) { return priority; }
	public void setPriority( Integer priority ) { this.priority = priority; }

	public Integer getExpiration( ) { return expiration; }
	public void setExpiration( Integer expiration ) { this.expiration = expiration; }

	public String getCod( ) { return cod; }
	public void setCod( String cod ) { this.cod = cod; }

	public String getSoftKind( ) { return softKind; }
	public void setSoftKind( String softKind ) { this.softKind = softKind; }

	public String getSoftVersion( ) { return softVersion; }
	public void setSoftVersion( String softVersion ) { this.softVersion = softVersion; }

	public String getMessageKind( ) { return messageKind; }
	public void setMessageKind( String messageKind ) { this.messageKind = messageKind; }

	public String getMessageType( ) { return messageType; }
	public void setMessageType( String messageType ) { this.messageType = messageType; }

	public String getParticipantId( ) { return participantId; }
	public void setParticipantId( String participantId ) { this.participantId = participantId; }

	public String getProcessId( ) { return processId; }
	public void setProcessId( String processId ) { this.processId = processId; }

	public Integer getRcvCustomCode( ) { return rcvCustomCode; }
	public void setRcvCustomCode( Integer rcvCustomMode ) { this.rcvCustomCode = rcvCustomMode; }

	public Integer getRcvExchangeType( ) { return rcvExchangeType; }
	public void setRcvExchangeType( Integer rcvExchangeType ) { this.rcvExchangeType = rcvExchangeType; }

	public Integer getSenderCustomCode( ) { return senderCustomCode; }
	public void setSenderCustomCode( Integer senderCustomCode ) { this.senderCustomCode = senderCustomCode; }

	public Integer getSenderExchangeType( ) { return senderExchangeType; }
	public void setSenderExchangeType( Integer senderExchangeType ) { this.senderExchangeType = senderExchangeType; }

	public Calendar getPreparationDatetime( ) { return preparationDatetime; }
	public void setPreparationDatetime( Calendar preparationDatetime ) { this.preparationDatetime = preparationDatetime; }

	public Calendar getReceiveDate( ) { return receiveDate; }
	public void setReceiveDate( Calendar receiveDate ) { this.receiveDate = receiveDate; }

	public Calendar getSendDate( ) { return sendDate; }
	public void setSendDate( Calendar sendDate ) { this.sendDate = sendDate; }

	public String getAjdArchiveClientId( ) { return ajdArchiveClientId; }
	public void setAjdArchiveClientId( String ajdArchiveClientId ) { this.ajdArchiveClientId = ajdArchiveClientId; }

	public Integer getCustomsCode( ) { return customsCode; }
	public void setCustomsCode( Integer customsCode ) { this.customsCode = customsCode; }

	public Calendar getCoaDatetime( ) { return coaDatetime; }
	public void setCoaDatetime( Calendar coaDatetime ) { this.coaDatetime = coaDatetime; }

	public Calendar getCoaSaveDatetime( ) { return coaSaveDatetime; }
	public void setCoaSaveDatetime( Calendar coaSaveDatetime ) { this.coaSaveDatetime = coaSaveDatetime; }

	public Calendar getCodSaveDatetime( ) { return codSaveDatetime; }
	public void setCodSaveDatetime( Calendar codSaveDatetime ) { this.codSaveDatetime = codSaveDatetime; }

	public Calendar getCodDatetime( ) { return codDatetime; }
	public void setCodDatetime( Calendar codDatetime ) { this.codDatetime = codDatetime; }

	public String getCompresstype( ) { return compresstype; }
	public void setCompresstype( String compresstype ) { this.compresstype = compresstype; }

	public String getDocumentId( ) { return documentId; }
	public void setDocumentId( String documentId ) { this.documentId = documentId; }

	public Boolean isNeedSave( ) { return needSave; } // NO_UCD (unused code)
	public void setNeedSave( Boolean needSave ) { this.needSave = needSave; }
}
