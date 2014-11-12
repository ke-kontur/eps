package ru.acs.monitoring.domain;

import ru.acs.fts.dto.monitoring.MonitoringInfo;

public class MonitoringInfoWrapper {	
	
	public MonitoringInfoWrapper(MonitoringInfo info, MonitoringInfo previousInfo) {
		this.info = info;
		this.previousInfo = previousInfo;
	}

	private MonitoringInfo info;
	
	private MonitoringInfo previousInfo;

	public MonitoringInfo getInfo() {
		return info;
	}

	public void setInfo(MonitoringInfo info) {
		this.info = info;
	}

	public MonitoringInfo getPreviousInfo() {
		return previousInfo;
	}

	public void setPreviousInfo(MonitoringInfo previousInfo) {
		this.previousInfo = previousInfo;
	}
}
