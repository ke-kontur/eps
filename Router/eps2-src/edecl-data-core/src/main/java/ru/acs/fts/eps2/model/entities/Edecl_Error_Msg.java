package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

import java.util.Date;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@Table( name = "EDECL_ERROR_MSG" )
public class Edecl_Error_Msg
{
	public Edecl_Error_Msg( )
	{
	}

	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE )
	@Column( name = "EMSGL_ERRORID", length = 36, nullable = false )
	private Integer errorId;
	
	@Column( name = "EMSGL_ENVELOPEID", length = 36 )
	private String envelopeId;
	
	@Column( name = "EMSGL_INITIALENVELOPEID", length = 36 )
	private String initialEnvelopeId;
	
	@Column( name = "EMSGL_SENDERINFORMATION", length = 100 )
	private String senderInformation;
	
	@Column( name = "EMSGL_RECEIVERINFORMATION", length = 100 )
	private String receiverInformation;
	
	@Column( name = "EMSGL_SOFTKIND", length = 100 )
	private String softKind;
	
	@Column( name = "EMSGL_SOFTVERSION", length = 100 )
	private String softVersion;
	
	@Column( name = "EMSGL_MESSAGEKIND", length = 30 )
	private String messageKind;
	
	@Column( name = "EMSGL_MESSAGETYPE", length = 9 )
	private String messageType;
	
	@Column( name = "EMSGL_PARTICIPANTID", length = 100 )
	private String participantId;
	
	@Column( name = "EMSGL_PROCESSID", length = 36 )
	private String processId;
	
	@Column( name = "EMSGL_DOCUMENTID", length = 36 )
	private String documentId;
	
	@Column( name = "EMSGL_RCVCUSTOMSCODE", length = 8 )
	private String rsvCustomCode;
	
	@Column( name = "EMSGL_RCVEXCHTYPE", length = 6 )
	private String rsvExchangeType;
	
	@Column( name = "EMSGL_SENDCUSTOMSCODE", length = 8 )
	private String sendCustomCode;
	
	@Column( name = "EMSGL_SENDEXCHTYPE", length = 6 )
	private String senderExchangeType;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "EMSGL_PREPARATIONDATETIME", length = 9, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE" )
	private Date preparationDatetime;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "EMSGL_RECVDATETIME", length = 9, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE" )
	private Date receiveDatetime;
	
	@Lob
	@Column( name = "EMSGL_BODY" )
	private byte[ ] body;
	
	@Column( name = "EMSGL_QUEUE", nullable = false, length = 1 )
	// 1 - ERROR_AUTH; 2 - ERROR_DBSAVE 3 - ERROR_FATAL; 4 - ERROR_RECV; 
	// 5 - ERROR_EAD; 6 - ERROR_AUD'
	private Integer queue;

	public void setErrorId( Integer errorId ) { this.errorId = errorId; }
	public Integer getErrorId( ) { return errorId; }
	
	public String getEnvelopeId( ) { return envelopeId; }
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }

	public String getInitialEnvelopeId( ) { return initialEnvelopeId; }
	public void setInitialEnvelopeId( String initialEnvelopeId ) { this.initialEnvelopeId = initialEnvelopeId; }

	public String getSenderInformation( ) { return senderInformation; }
	public void setSenderInformation( String senderInformation ) { this.senderInformation = senderInformation; }

	public String getReceiverInformation( ) { return receiverInformation; }
	public void setReceiverInformation( String receiverInformation ) { this.receiverInformation = receiverInformation; }

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

	public String getDocumentId( ) { return documentId; }
	public void setDocumentId( String documentId ) { this.documentId = documentId; }

	public String getRsvCustomCode( ) { return rsvCustomCode; }
	public void setRsvCustomCode( String rsvCustomCode ) { this.rsvCustomCode = rsvCustomCode; }

	public String getRsvExchangeType( ) { return rsvExchangeType; }
	public void setRsvExchangeType( String rsvExchangeType ) { this.rsvExchangeType = rsvExchangeType; }

	public String getSendCustomCode( ) { return sendCustomCode; }
	public void setSendCustomCode( String sendCustomCode ) { this.sendCustomCode = sendCustomCode; }

	public String getSenderExchangeType( ) { return senderExchangeType; }
	public void setSenderExchangeType( String senderExchangeType ) { this.senderExchangeType = senderExchangeType; }

	public Date getPreparationDatetime( ) { return preparationDatetime; }
	public void setPreparationDatetime( Date preparationDatetime ) { this.preparationDatetime = preparationDatetime; }

	public Date getReceiveDatetime( ) { return receiveDatetime; }
	public void setReceiveDatetime( Date receiveDatetime ) { this.receiveDatetime = receiveDatetime; }

	public byte[ ] getBody( ) { return body; }
	public void setBody( byte[ ] body ) { this.body = body; }

	public Integer getQueue( ) { return queue; }
	public void setQueue( Integer queue ) { this.queue = queue; }
}
