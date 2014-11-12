package ru.acs.monitoring.domain;

import ru.acs.monitoring.common.utils.NetUtils;

public class CommonSettings {
	/**
	 * Описание мониторуемой системы/имя
	 */
	String systemName;
	
	/**
	 * ИД. системы, например IP
	 */
	String systemId;

	/**
	 * Информация об отправителе
	 */
	String routingSenderInfo = "MONITORING";

	/**
	 * Информация о получателе
	 */
	String routingDefaultReceiverInfo = "MONITORING-CENTER";
	
	/**
	 * Тип сообщения для MonitoringInfo
	 */
	String monitoringInfoMessageKind = "MONITORING.INFO";
	
	/**
	 * Тип сообщения для запроса MI
	 */
	String monitoringInqMessageKind = "MONITORING.INQ";
	
	/**
	 * Таймаут вызова WS - в сек
	 */
	Long webServiceTimeout = 120l;

	/**
	 * Время ожидания ответа от агента
	 */
	int requestWaitTime =2;
	
	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getSystemId() {
		if (systemId==null){
			systemId = NetUtils.getLocalHostName();
		}
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	public String getRoutingSenderInfo() {
		return routingSenderInfo;
	}

	public void setRoutingSenderInfo(String routingSenderInfo) {
		this.routingSenderInfo = routingSenderInfo;
	}

	public String getRoutingDefaultReceiverInfo() {
		return routingDefaultReceiverInfo;
	}

	public void setRoutingDefaultReceiverInfo(String routingDefaultReceiverInfo) {
		this.routingDefaultReceiverInfo = routingDefaultReceiverInfo;
	}

	public String getMonitoringInfoMessageKind() {
		return monitoringInfoMessageKind;
	}

	public void setMonitoringInfoMessageKind(String monitoringInfoMessageKind) {
		this.monitoringInfoMessageKind = monitoringInfoMessageKind;
	}

	public String getMonitoringInqMessageKind() {
		return monitoringInqMessageKind;
	}

	public void setMonitoringInqMessageKind(String monitoringInqMessageKind) {
		this.monitoringInqMessageKind = monitoringInqMessageKind;
	}

	public int getRequestWaitTime() {
		return requestWaitTime;
	}

	public void setRequestWaitTime(int requestWaitTime) {
		this.requestWaitTime = requestWaitTime;
	}

	public Long getWebServiceTimeout() {
		return webServiceTimeout;
	}

	public void setWebServiceTimeout(Long webServiceTimeout) {
		this.webServiceTimeout = webServiceTimeout;
	}
}
