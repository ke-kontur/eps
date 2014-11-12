package ru.acs.fts.eps2.ws.event.database.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "EDECL_EVENT" )
public class Event
{
	@Id
	@Column( name = "EVT_EVENTID", nullable = false )
	@GeneratedValue( generator = "InvSeq" )
    @SequenceGenerator( name = "InvSeq", sequenceName = "EVENT_ID_SEQ", allocationSize = 1 )
	private BigDecimal eventId;
	
	@Column( name = "EVT_EVENTDATETIME", nullable = false )
	@Temporal( TemporalType.TIMESTAMP )
	private Date eventDateTime;
	
	@Column( name = "EVT_LOGDATETIME", nullable = true )
	@Temporal( TemporalType.TIMESTAMP )
	private Date logDateTime;

	@Column( name = "EVT_EVENTCODE", nullable = false )
	private BigDecimal eventCode;
	
	@Lob
	@Column( name = "EVT_EVENTDESCRIPTION", nullable = false )
	private String description;
	
	@Column( name = "EVT_ENVELOPEID", length = 36, nullable = true )
	private String envelopeId;
	
	@Column( name = "EVT_DOCUMENTID", length = 36, nullable = true )
	private String documentId;
	
	@Column( name = "SRC_SOURCEID", nullable = true )
	private BigDecimal sourceId;
	
	@Column( name = "CAT_CATEGORYID", nullable = true )
	private BigDecimal categoryId;
	
	@Column( name = "EVT_PROCCESSID", length = 36, nullable = true )
	private String processId;

	// @formatter:off
	/*
	public void setEventId( BigDecimal eventId ) { this.eventId = eventId; }
	public BigDecimal getEventId( ) { return eventId; }
	*/
	
	public void setEventDateTime( Date eventDateTime ) { this.eventDateTime = eventDateTime; }
	public Date getEventDateTime( ) { return eventDateTime; }
	
	public void setLogDateTime( Date logDateTime ) { this.logDateTime = logDateTime; }
	public Date getLogDateTime( ) { return logDateTime; }
	
	public void setEventCode( BigDecimal eventCode ) { this.eventCode = eventCode; }
	public BigDecimal getEventCode( ) { return eventCode; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }
	
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	
	public void setSourceId( BigDecimal sourceId ) { this.sourceId = sourceId; }
	public BigDecimal getSourceId( ) { return sourceId; }
	
	public void setCategoryId( BigDecimal categoryId ) { this.categoryId = categoryId; }
	public BigDecimal getCategoryId( ) { return categoryId; }
	
	public void setProcessId( String processId ) { this.processId = processId; }
	public String getProcessId( ) { return processId; }
	// @formatter:on
	
	public Event( )
	{
		
	}
}
