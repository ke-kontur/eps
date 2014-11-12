package ru.acs.fts.eps2.ws.eps.serviceModel.objects;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

public class AudCommand
{
	private int _recId;
	private DateTime _dateTime;
	private String _state;
	private String _errorCode;
	private String _errorDescription;
	private AudMessage _outEnvelope;
	private AudMessage _inEnvelope;
	private Integer _eadFlag;
	private String _internalError;
	private String _guid;
	private String _envelopeId;
	private List< AudDocInfo > _docInfos = new ArrayList< AudDocInfo >( );
	
	// @formatter:off
	public void setRecId( int recId ) { _recId = recId; }
	public int getRecId( ) { return _recId; }
	
	public void setDateTime( DateTime dateTime ) { _dateTime = dateTime; }
	public DateTime getDateTime( ) { return _dateTime; }
	
	public void setState( String state ) { _state = state; }
	public String getState( ) { return _state; }
	
	public void setErrorCode( String errorCode ) { _errorCode = errorCode; }
	public String getErrorCode( ) { return _errorCode; }
	
	public void setErrorDescription( String errorDescription ) { _errorDescription = errorDescription; }
	public String getErrorDescription( ) { return _errorDescription; }
	
	public void setOutEnvelope( AudMessage outEnvelope ) { _outEnvelope = outEnvelope; }
	public AudMessage getOutEnvelope( ) { return _outEnvelope; }
	
	public void setInEnvelope( AudMessage inEnvelope ) { _inEnvelope = inEnvelope; }
	public AudMessage getInEnvelope( ) { return _inEnvelope; }
	
	public void setEadFlag( Integer eadFlag ) { _eadFlag = eadFlag; }
	public Integer getEadFlag( ) { return _eadFlag; }
	
	public void setInternalError( String internalError ) { _internalError = internalError; }
	public String getInternalError( ) { return _internalError; }
		
	public void setGuid( String guid ) { _guid = guid; }
	public String getGuid( ) { return _guid; }
	
	public void setEnvelopeId( String envelopeId ) { _envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return _envelopeId; }
	
	public void setDocInfos( List< AudDocInfo > docInfos ) { _docInfos = docInfos; }
	public List< AudDocInfo > getDocInfos( ) { return _docInfos; }
	// @formatter:on

}
