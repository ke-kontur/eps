package ru.acs.monitoring;

import java.util.Calendar;

import ru.acs.fts.dto.monitoring.MonitoringInfo;

public class CachedMonitoringInfo {

	private MonitoringInfo monitoringInfo;
	private Calendar cacheDateTime;
	
	public CachedMonitoringInfo(MonitoringInfo monitoringInfo) {
		super();
		this.monitoringInfo = monitoringInfo;
		cacheDateTime = Calendar.getInstance();
	}
	
	public MonitoringInfo getMonitoringInfo() {
		return monitoringInfo;
	}
	public void setMonitoringInfo(MonitoringInfo monitoringInfo) {
		this.monitoringInfo = monitoringInfo;
	}
	public Calendar getCacheDateTime() {
		return cacheDateTime;
	}
	public void setCacheDateTime(Calendar cacheDateTime) {
		this.cacheDateTime = cacheDateTime;
	}	
}
