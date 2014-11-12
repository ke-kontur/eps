package ru.acs.fts.aud.model.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMP;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.TypeConverter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "PROTOCOL_ITEM" )
public class ProtocolItem
{
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID

	@Column( name = "MESSAGEKIND", nullable = true, length = 255 )
	private String messageKind;

	/*
	@Column( name = "CLIENTID", nullable = true )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String clientId;
	*/
	
	@ManyToOne
	@JoinColumn( name = "CLIENTID", nullable = true )
	private Client client;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "EVENTDATE", length = 6, nullable = false, columnDefinition = "TIMESTAMP(6) NOT NULL" )
	private Timestamp eventDate;

	@Column( name = "APPLIEDCLIENTID", nullable = true, length = 255 )
	private String appliedClientId;

	@Column( name = "ENVELOPEID", nullable = true )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String envelopeId;

	@Column( name = "CUSTOMSCODE", nullable = true, length = 8 )
	private String customsCode;

	@Column( name = "DESCRIPTION", nullable = true, length = 4000 )
	private String description;

	@Column( name = "DOCUMENTID", nullable = true )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String documentId;

	@Column( name = "EVENTTYPE", nullable = false, length = 255 )
	private String eventType;
	
	/*
	@Column( name = "APPLIEDDOCUMENTID", nullable = true )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String appliedDocumentId;
	*/
	@ManyToOne
	@JoinColumn( name = "APPLIEDDOCUMENTID", nullable = true )
	private Document appliedDocument;
	
	/*
	@Column( name = "LOG_LEVEL", nullable = true )
	private Double logLevel;
	*/
	@ManyToOne
	@JoinColumn( name = "LOG_LEVEL", nullable = true )
	private ProtocolLogLevel logLevel;

	/*
	@Column( name = "CODE_TYPE", nullable = true )
	private Double codeType;
	*/
	@ManyToOne
	@JoinColumn( name = "CODE_TYPE", nullable = true )
	private ProtocolSource codeType;

	@Lob
	@Column( name = "STACKTRACE", nullable = true )
	private String stackTrace;

	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setMessageKind( String messageKind ) { this.messageKind = messageKind; }
	public String getMessageKind( ) { return messageKind; }
	
	/*
	public void setClientId( String clientId ) { this.clientId = clientId; }
	public String getClientId( ) { return clientId; }
	*/
	
	public void setClient( Client client ) { this.client = client; }
	public Client getClient( ) { return client; }
	
	public void setEventDate( Timestamp eventDate ) { this.eventDate = eventDate; }
	public Timestamp getEventDate( ) { return eventDate; }
	
	public void setAppliedClientId( String appliedClientId ) { this.appliedClientId = appliedClientId; }
	public String getAppliedClientId( ) { return appliedClientId; }
	
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }
	
	public void setCustomsCode( String customsCode ) { this.customsCode = customsCode; }
	public String getCustomsCode( ) { return customsCode; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	
	public void setEventType( String eventType ) { this.eventType = eventType; }
	public String getEventType( ) { return eventType; }
	
	/*
	public void setAppliedDocumentId( String appliedDocumentId ) { this.appliedDocumentId = appliedDocumentId; }
	public String getAppliedDocumentId( ) { return appliedDocumentId; }
	*/
	public void setAppliedDocument( Document appliedDocument ) { this.appliedDocument = appliedDocument; }
	public Document getAppliedDocument( ) { return appliedDocument; }
	
	/*
	public void setLogLevel( Double logLevel )  { this.logLevel = logLevel; }
	public Double getLogLevel( ) { return logLevel; }
	*/
	public void setLogLevel( ProtocolLogLevel logLevel ) { this.logLevel = logLevel; }
	public ProtocolLogLevel getLogLevel( ) { return logLevel; }
	
	/*
	public void setCodeType( Double codeType ) { this.codeType = codeType; }
	public Double getCodeType( ) { return codeType; }
	*/
	public void setCodeType( ProtocolSource codeType ) { this.codeType = codeType; }
	public ProtocolSource getCodeType( ) { return codeType; }
	
	public void setStackTrace( String stackTrace ) { this.stackTrace = stackTrace; }
	public String getStackTrace( ) { return stackTrace; }
	// @formatter:on
}
