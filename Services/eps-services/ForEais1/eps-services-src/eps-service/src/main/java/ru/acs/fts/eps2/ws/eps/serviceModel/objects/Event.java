package ru.acs.fts.eps2.ws.eps.serviceModel.objects;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Event
{
	private int _eventCode;
	private DateTime _dateTime;
	private DateTime logDateTime;
	private String _description;
	private int _sourceId;
	private int _categoryId;
	private String _envelopeId;
	private String _documentId;
	private String _processId;
	
	// @formatter:off
	public void setEventCode( int eventCode ) { _eventCode = eventCode; }
	public int getEventCode( ) { return _eventCode; }
	
	public void setDateTime( DateTime dateTime ) { _dateTime = dateTime; }
	public DateTime getDateTime( ) { return _dateTime; }
	
	public DateTime getLogDateTime( ) { return logDateTime; }
	public void setLogDateTime( DateTime logDateTime ) { this.logDateTime = logDateTime; }
	
	public void setDescription( String description ) { _description = description; }
	public String getDescription( ) { return _description; }
	
	public void setSourceId( int sourceId ) { _sourceId = sourceId; }
	public int getSourceId( ) { return _sourceId; }
	
	public void setCategoryId( int categoryId ) { _categoryId = categoryId; }
	public int getCategoryId( ) { return _categoryId; }
	
	public void setEnvelopeId( String envelopeId ) { _envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return _envelopeId; }
	
	public void setDocumentId( String documentId ) { _documentId = documentId; }
	public String getDocumentId( ) { return _documentId; }
	
	public void setProcessId( String processId ) { _processId = processId; }
	public String getProcessId( ) { return _processId; }
	// @formatter:on
	
	public String dateToString( )
	{
		DateTimeFormatter fmt = DateTimeFormat.forPattern( "dd.MM.yyyy HH:mm:ss" );
		return fmt.print( _dateTime );
	}
}
