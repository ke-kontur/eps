package ru.acs.monitoring.services;

import ru.acs.fts.dto.monitoring.MonitoringAttribute;
import ru.acs.fts.dto.monitoring.MonitoringInfo;

public class MonitoringBySendingMessageProcess implements MonitoringProcess{

	public void fillMonitoringInfo(MonitoringInfo info) {
		// TODO Auto-generated method stub
		
	}

	public String getProcessName() {
		return "Сервис проверки фукнкционирования приложений";
	}
	
	@Override
	public MonitoringAttribute getAddedOrDefaultAtribute(MonitoringInfo info) {		
		return null;
	}

}
