package ru.acs.fts.eps2.model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "EDECL_EVENT" )
public class Edecl_Event
{
	public Edecl_Event( )
	{

	}

	@Id
	@Column( name = "EVT_EVENTID", length = 38, nullable = false )
	private String eventID;

	@Column( name = "EVT_ENVELOPEID", length = 36 )
	private String envelopeId;

	@Column( name = "EVT_DOCUMENTID", length = 36 )
	private String documentId;

	@Column( name = "EVT_PROCCESSID", length = 36 )
	private String processId;

	@Column( name = "EVT_EVENTCODE", length = 38 )
	private String eventCode;

	@Temporal( TemporalType.DATE )
	@Column( name = "EVT_EVENTDATETIME" )
	private Date eventDateTime;

	@Temporal( TemporalType.DATE )
	@Column( name = "EVT_LOGDATETIME" )
	private Date logDateTime;

	public String getEventID( )
	{
		return eventID;
	}

	public void setEventID( String eventID )
	{
		this.eventID = eventID;
	}

	public String getEnvelopeId( )
	{
		return envelopeId;
	}

	public void setEnvelopeId( String envelopeId )
	{
		this.envelopeId = envelopeId;
	}

	public String getDocumentId( )
	{
		return documentId;
	}

	public void setDocumentId( String documentId )
	{
		this.documentId = documentId;
	}

	public String getProcessId( )
	{
		return processId;
	}

	public void setProcessId( String processId )
	{
		this.processId = processId;
	}

	public String getEventCode( )
	{
		return eventCode;
	}

	public void setEventCode( String eventCode )
	{
		this.eventCode = eventCode;
	}

	public Date getEventDateTime( )
	{
		return eventDateTime;
	}

	public void setEventDateTime( Date eventDateTime )
	{
		this.eventDateTime = eventDateTime;
	}

	public Date getLogDateTime( )
	{
		return logDateTime;
	}

	public void setLogDateTime( Date logDateTime )
	{
		this.logDateTime = logDateTime;
	}

	public String getDescription( )
	{
		return description;
	}

	public void setDescription( String description )
	{
		this.description = description;
	}

	public Integer getSourceId( )
	{
		return sourceId;
	}

	public void setSourceId( Integer sourceId )
	{
		this.sourceId = sourceId;
	}

	public Integer getCategoryId( )
	{
		return categoryId;
	}

	public void setCategoryId( Integer categoryId )
	{
		this.categoryId = categoryId;
	}

	@Column( name = "EVT_EVENTDESCRIPTION", length = 38 )
	private String description;

	@Column( name = "SRC_SOURCEID", length = 38 )
	private Integer sourceId;

	@Column( name = "CAT_CATEGORYID", length = 38 )
	private Integer categoryId = 2;
}
