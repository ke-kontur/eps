package ru.acs.fts.eps2.engine.restWs.event.serviceModel;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Event
{
	private int _eventCode;
	private DateTime _dateTime;
	private String _eventInfo;
	private String _invokingSystemName;
	private int _sourceId;
	private int _categoryId;
	private String _envelopeId;
	private String _documentId;
	private String _processId;
	private String _messageId;
	private String _version;
	
	// @formatter:off
	public void setEventCode( int eventCode ) { _eventCode = eventCode; }
	public int getEventCode( ) { return _eventCode; }
	
	public void setDateTime( DateTime dateTime ) { _dateTime = dateTime; }
	public DateTime getDateTime( ) { return _dateTime; }
	
	public void setEventInfo( String eventInfo ) { _eventInfo = eventInfo; }
	public String getEventInfo( ) { return _eventInfo; }
	
	public void setInvokingSystemName( String invokingSystemName ) { _invokingSystemName = invokingSystemName; }
	public String getInvokingSystemName( ) { return _invokingSystemName; }
	
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
	
	public void setMessageId( String messageId ) { _messageId = messageId; }
	public String getMessageId( ) { return _messageId; }
	
	public void setVersion( String version ) { _version = version; }
	public String getVersion( ) { return _version; }
	// @formatter:on
	
	public String dateToString( ) // NO_UCD (unused code)
	{
		DateTimeFormatter fmt = DateTimeFormat.forPattern( "dd.MM.yyyy HH:mm:ss" );
		return fmt.print( _dateTime );
	}
}
