package ru.acs.fts.eps2.failedMessages.persistence.entities;

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
@Table( name = "EDECL_ERROR_MSG" )
public class ErrorMessage
{
	public static final int QUEUE_ERROR_AUTH = 1; // NO_UCD (unused code)
	public static final int QUEUE_ERROR_DBSAVE = 2; // NO_UCD (unused code)
	public static final int QUEUE_ERROR_FATAL = 3; // NO_UCD (unused code)
	public static final int QUEUE_ERROR_RECV = 4; // NO_UCD (unused code)
	public static final int QUEUE_ERROR_EAD = 5; // NO_UCD (unused code)
	public static final int QUEUE_ERROR_AUD = 6; // NO_UCD (unused code)

	@Id
	@GeneratedValue( generator = "InvSeq" )
	@SequenceGenerator( name = "InvSeq", sequenceName = "EDECL_ERROR_MSG_SEQ", allocationSize = 1 )
	@Column( name = "EMSGL_ERRORID", length = 36, nullable = false )
	private int errorId;
	
	@Column( name = "EMSGL_ENVELOPEID", length = 36, nullable = true )
	private String envelopeId;
	
	@Column( name = "EMSGL_INITIALENVELOPEID", length = 36, nullable = true )
	private String initialEnvelopeId;
	
	@Column( name = "EMSGL_SENDERINFORMATION", length = 100, nullable = true )
	private String senderInformation;
	
	@Column( name = "EMSGL_RECEIVERINFORMATION", length = 100, nullable = true )
	private String receiverInformation;
	
	@Column( name = "EMSGL_SOFTKIND", length = 100, nullable = true )
	private String softKind;
	
	@Column( name = "EMSGL_SOFTVERSION", length = 100, nullable = true )
	private String softVersion;
	
	@Column( name = "EMSGL_MESSAGEKIND", length = 30, nullable = true )
	private String messageKind;
	
	@Column( name = "EMSGL_MESSAGETYPE", length = 9, nullable = true )
	private String messageType;
	
	@Column( name = "EMSGL_PARTICIPANTID", length = 100, nullable = true )
	private String participantId;
	
	@Column( name = "EMSGL_PROCESSID", length = 36, nullable = true )
	private String processId;
	
	@Column( name = "EMSGL_DOCUMENTID", length = 36, nullable = true )
	private String documentId;
	
	@Column( name = "EMSGL_RCVCUSTOMSCODE", length = 8, nullable = true )
	private String receiverCustomsCode;
	
	@Column( name = "EMSGL_RCVEXCHTYPE", length = 6, nullable = true )
	private String receiverExchType;
	
	@Column( name = "EMSGL_SENDCUSTOMSCODE", length = 8, nullable = true )
	private String senderCustomsCode;
	
	@Column( name = "EMSGL_SENDEXCHTYPE", length = 6, nullable = true )
	private String senderExchType;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "EMSGL_PREPARATIONDATETIME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar preparationDateTime;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "EMSGL_RECVDATETIME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar receiveDateTime;
		
	@Lob
	@Column( name = "EMSGL_BODY", length = 4000, nullable = true )
	private byte[ ] body;
	
	@Column( name = "EMSGL_QUEUE", length = 1, nullable = false )
	private int queue;
	
	// @formatter:off
	public void setErrorId( int errorId ) { this.errorId = errorId; }
	public int getErrorId( ) { return errorId; }

	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }
	
	public void setInitialEnvelopeId( String initialEnvelopeId ) { this.initialEnvelopeId = initialEnvelopeId; }
	public String getInitialEnvelopeId( ) { return initialEnvelopeId; }
	
	public void setSenderInformation( String senderInformation ) { this.senderInformation = senderInformation; }
	public String getSenderInformation( ) { return senderInformation; }
	
	public void setReceiverInformation( String receiverInformation ) { this.receiverInformation = receiverInformation; }
	public String getReceiverInformation( ) { return receiverInformation; }
	
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
	
	public void setProcessId( String processId ) { this.processId = processId; }
	public String getProcessId( ) { return processId; }
	
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	
	public void setReceiverCustomsCode( String receiverCustomsCode ) { this.receiverCustomsCode = receiverCustomsCode; }
	public String getReceiverCustomsCode( ) { return receiverCustomsCode; }
	
	public void setReceiverExchType( String receiverExchType ) { this.receiverExchType = receiverExchType; }
	public String getReceiverExchType( ) { return receiverExchType; }
	
	public void setSenderCustomsCode( String senderCustomsCode ) { this.senderCustomsCode = senderCustomsCode; }
	public String getSenderCustomsCode( ) { return senderCustomsCode; }
	
	public void setSenderExchType( String senderExchType ) { this.senderExchType = senderExchType; }
	public String getSenderExchType( ) { return senderExchType; }
	
	public void setPreparationDateTime( Calendar preparationDateTime ) { this.preparationDateTime = preparationDateTime; }
	public Calendar getPreparationDateTime( ) { return preparationDateTime; }
	
	public void setReceiveDateTime( Calendar receiveDateTime ) { this.receiveDateTime = receiveDateTime; }
	public Calendar getReceiveDateTime( ) { return receiveDateTime; }
	
	public void setBody( byte[ ] body ) { this.body = body; }
	public byte[ ] getBody( ) { return body; }
	
	public void setQueue( int queue ) { this.queue = queue; }
	public int getQueue( ) { return queue; }
	// @formatter:on
}
