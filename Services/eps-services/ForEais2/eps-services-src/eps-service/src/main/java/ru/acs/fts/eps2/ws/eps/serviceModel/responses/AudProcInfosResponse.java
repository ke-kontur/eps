package ru.acs.fts.eps2.ws.eps.serviceModel.responses;

import java.util.List;

import ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudProcInfo;

public class AudProcInfosResponse extends Response
{
	private List< AudProcInfo > _procInfos;
	private long _totalRecords;
	
	// @formatter:off
	public void setProcInfos( List< AudProcInfo > procInfos ) { _procInfos = procInfos; }
	public List< AudProcInfo > getProcInfos( ) { return _procInfos; }
	
	public void setTotalRecords( long totalRecords ) { _totalRecords = totalRecords; }
	public long getTotalRecords( ) { return _totalRecords; }
	// @formatter:on
}
