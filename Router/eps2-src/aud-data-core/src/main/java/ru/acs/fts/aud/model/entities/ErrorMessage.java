package ru.acs.fts.aud.model.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

@Entity
@Table( name = "ERROR_MESSAGES" )
public class ErrorMessage
{
	@Id
	@Column( name = "ID", length = 12 )
	private long id; // GUID
	
	@Column( name = "ENVELOPEID", length = 36, nullable = true )
	private String envelopeId;
	
	@Column( name = "INITIALENVELOPEID", length = 36, nullable = true )
	private String initialEnvelopeId;
	
	@Column( name = "SENDER", length = 100, nullable = true )
	private String sender;
	
	@Column( name = "RECEIVER", length = 100, nullable = true )
	private String receiver;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "PREPARATIONDATETIME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE" )
	private Calendar preparationDateTime;
	
	@Column( name = "SOFTKIND", length = 100, nullable = true )
	private String softKind;
	
	@Column( name = "SOFTVERSION", length = 100, nullable = true )
	private String softVersion;
	
	@Column( name = "MESSAGEKIND", length = 30, nullable = true )
	private String messageKind;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "RECEIVEDATETIME", length = 9, nullable = false, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE" )
	private Calendar receiveDateTime;
	
	@Column( name = "DOCUMENTID", nullable = true, length = 36 )
	private String documentId;
	
	@Column( name = "CUSTCODE", nullable = true, length = 8 )
	private String custCode;
	
	@Column( name = "CLIENT_ID", nullable = true, length = 36 )
	private String clientId;
	
	@Lob
	@Column( name = "RAW_MESSAGE", nullable = true, length = 4000 )
	private byte[ ] rawMessage;
	
	// @formatter:off
	public void setId( long id ) { this.id = id; }
	public long getId( ) { return id; }
	
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }
	
	public void setInitialEnvelopeId( String initialEnvelopeId ) { this.initialEnvelopeId = initialEnvelopeId; }
	public String getInitialEnvelopeId( ) { return initialEnvelopeId; }
	
	public void setSender( String sender ) { this.sender = sender; }
	public String getSender( ) { return sender; }
	
	public void setReceiver( String receiver ) { this.receiver = receiver; }
	public String getReceiver( ) { return receiver; }
	
	public void setPreparationDateTime( Calendar preparationDateTime ) { this.preparationDateTime = preparationDateTime; }
	public Calendar getPreparationDateTime( ) { return preparationDateTime; }
	
	public void setSoftKind( String softKind ) { this.softKind = softKind; }
	public String getSoftKind( ) { return softKind; }
	
	public void setSoftVersion( String softVersion ) { this.softVersion = softVersion; }
	public String getSoftVersion( ) { return softVersion; }
	
	public void setMessageKind( String messageKind ) { this.messageKind = messageKind; }
	public String getMessageKind( ) { return messageKind; }
	
	public void setReceiveDateTime( Calendar receiveDateTime ) { this.receiveDateTime = receiveDateTime; }
	public Calendar getReceiveDateTime( ) { return receiveDateTime; }
	
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	
	public void setCustCode( String custCode ) { this.custCode = custCode; }
	public String getCustCode( ) { return custCode; }
	
	public void setClientId( String clientId ) { this.clientId = clientId; }
	public String getClientId( ) { return this.clientId; }
	
	public void setRawMessage( byte[ ] rawMessage ) { this.rawMessage = rawMessage; }
	public byte[ ] getRawMessage( ) { return rawMessage; }
	// @formatter:on
}
