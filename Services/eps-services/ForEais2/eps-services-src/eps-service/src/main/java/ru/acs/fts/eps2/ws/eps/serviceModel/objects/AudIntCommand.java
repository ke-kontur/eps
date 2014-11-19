package ru.acs.fts.eps2.ws.eps.serviceModel.objects;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

public class AudIntCommand
{
	private int _recId;
	private String _documentId;
	private String _messageCode;
	private DateTime _dateTime;
	private String _state;
	private String _internalError;
	private String _envelopeId;
	private String _regId;
	private List< AudCommand > _audCommands = new ArrayList< AudCommand >( );
	
	// @formatter:off
	public void setRecId( int recId ) { _recId = recId; }
	public Integer getRecId( ) { return _recId; }
	
	public void setDocumentId( String documentId ) { _documentId = documentId; }
	public String getDocumentId( ) { return _documentId; }
	
	public void setMessageCode( String messageCode ) { _messageCode = messageCode; } 
	public String getMessageCode( ) { return _messageCode; }
	
	public void setDateTime( DateTime dateTime ) { _dateTime = dateTime; }
	public DateTime getDateTime( ) { return _dateTime; }
	
	public void setState( String state ) { _state = state; }
	public String getState( ) { return _state; }
	
	public void setInternalError( String internalError ) { _internalError = internalError; }
	public String getInternalError( ) { return _internalError; }
	
	public void setEnvelopeId( String envelopeId ) { _envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return _envelopeId; }
	
	public void setRegId( String regId ) { _regId = regId; }
	public String getRegId( ) { return _regId; }
	
	public void setAudCommands( List< AudCommand > audCommands ) { _audCommands = audCommands; }
	public List< AudCommand > getAudCommands( ) { return _audCommands; }
	// @formatter:on	

}
