package ru.acs.fts.aud.rest.service.model.objects;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

public class AudCommand
{
	private int _recId;
	private DateTime _dateTime;
	private String _state;
	private String _errCode;
	private String _errDescription;
	private Integer _eadFlag;
	private Integer _intCmd;
	private String _guid;
	private String _envelopeId;
	private String _softVersion;
	
	private AudProcInfo _procInfo; // TODO: получать из процедуры
	private List< DocInfo > _docInfos = new ArrayList< DocInfo >( );
	
	// @formatter:off
	public void setRecId( int recId ) { _recId = recId; }
	public int getRecId( ) { return _recId; }
	
	public void setDateTime( DateTime dateTime ) { _dateTime = dateTime; }
	public DateTime getDateTime( ) { return _dateTime; }
	
	public void setState( String state ) { _state = state; }
	public String getState( ) { return _state; }
	
	public void setErrCode( String errCode ) { _errCode = errCode; }
	public String getErrCode( ) { return _errCode; }
	
	public void setErrDescription( String errDescription ) { _errDescription = errDescription; }
	public String getErrDescription( ) { return _errDescription; }
	
	public void setEadFlag( Integer eadFlag ) { _eadFlag = eadFlag; }
	public Integer getEadFlag( ) { return _eadFlag; }

	public void setIntCmd( Integer intCmd ) { _intCmd = intCmd; }
	public Integer getIntCmd( ) { return _intCmd; }
	
	public void setGuid( String guid ) { _guid = guid; }
	public String getGuid( ) { return _guid; }
	
	public void setEnvelopeId( String envelopeId ) { _envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return _envelopeId; }

	public void setProcInfo( AudProcInfo procInfo ) { _procInfo = procInfo; }
	public AudProcInfo getProcInfo( ) { return _procInfo; }
	
	public void setDocInfos( List< DocInfo > docInfos ) { _docInfos = docInfos; }
	public List< DocInfo > getDocInfos( ) { return _docInfos; }
	
	public void setSoftVersion( String softVersion ) { _softVersion = softVersion; }
	public String getSoftVersion( ) { return _softVersion; }
	// @formatter:on

}
