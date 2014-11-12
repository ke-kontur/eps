package ru.acs.fts.eps2.ws.eps.serviceModel.objects;

import java.util.List;

public class Procedure
{
	private String _processId;
	private Integer _custCode;
	private Integer _borderCustCode;
	private Integer _udFlag;
	private String _participantId;
	private Integer _weAreOn;
	private List< Envelope > _envelopes;
	
	// @formatter:off
	public void setProcessId( String processId ) { _processId = processId; }
	public String getProcessId( ) { return _processId; }
	
	public void setCustCode( Integer custCode ) { _custCode = custCode; }
	public Integer getCustCode( ) { return _custCode; }
	
	public void setBorderCustCode( Integer borderCustCode ) { _borderCustCode = borderCustCode; }
	public Integer getBorderCustCode( ) { return _borderCustCode; }
	
	public void setUdFlag( Integer udFlag ) { _udFlag = udFlag; }
	public Integer getUdFlag( ) { return _udFlag; }
	
	public void setParticipantId( String participantId ) { _participantId = participantId; }
	public String getParticipantId( ) { return _participantId; }
	
	public void setWeAreOn( Integer weAreOn ) { _weAreOn = weAreOn; }
	public Integer getWeAreOn( ) { return _weAreOn; }
	
	public void setEnvelopes( List< Envelope > envelopes ) { _envelopes = envelopes; }
	public List< Envelope > getEnvelopes( ) { return _envelopes; }
	// @formatter:on
}
