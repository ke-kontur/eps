package ru.acs.fts.aud.rest.service.model.objects;

import org.joda.time.DateTime;

public class AudProcInfo
{
	private String _processId;
	private String _gtdCustomsCode;
	private DateTime _gtdRegistrationDate;
	private String _gtdNumber;
	private String _packetId;
	private DateTime _pkCreateDateTime;
	private DateTime _pkChangeDateTime;

	// @formatter:off
	public void setProcessId( String processId ) { _processId = processId; }
	public String getProcessId( ) { return _processId; }

	public void setGtdCustomsCode( String gtdCustomsCode ) { _gtdCustomsCode = gtdCustomsCode; }
	public String getGtdCustomsCode( ) { return _gtdCustomsCode; }

	public void setGtdRegistrationDate( DateTime gtdRegistrationDate ) { _gtdRegistrationDate = gtdRegistrationDate; }
	public DateTime getGtdRegistrationDate( ) { return _gtdRegistrationDate; }

	public void setGtdNumber( String gtdNumber ) { _gtdNumber = gtdNumber; }
	public String getGtdNumber( ) { return _gtdNumber; }

	public void setPacketId( String packetId ) { _packetId = packetId; }
	public String getPacketId( ) { return _packetId; }

	public void setPkCreateDateTime( DateTime pkCreateDateTime ) { _pkCreateDateTime = pkCreateDateTime; }
	public DateTime getPkCreateDateTime( ) { return _pkCreateDateTime; }

	public void setPkChangeDateTime( DateTime pkChangeDateTime ) { _pkChangeDateTime = pkChangeDateTime; }
	public DateTime getPkChangeDateTime( ) { return _pkChangeDateTime; }
	// @formatter:off
}
