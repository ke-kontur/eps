package ru.acs.monitoring.common.mail;

public class MailMonitoringInfo {
	
	public static String VALUE_NOT_SET = "-1";
	
	String severity;
	String serviceName;
	String serviceId;
	String zipName;
	State dbState;	
	State mqState;
	State hostState;
	State eventLogState;
	State systemState;
	State mpState;
	State servicesState;
	State signState;
	
	public MailMonitoringInfo(String severity, String serviceName, String serviceId, String zipName) {
		super();
		this.severity = severity;
		this.serviceName = serviceName;
		this.serviceId = serviceId;
		this.zipName = zipName;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getZipName() {
		return zipName;
	}

	public void setZipName(String zipName) {
		this.zipName = zipName;
	}

	public State getDbState() {
		return dbState;
	}

	public void setDbState(State dbState) {
		this.dbState = dbState;
	}

	public State getMqState() {
		return mqState;
	}

	public void setMqState(State mqState) {
		this.mqState = mqState;
	}

	public State getHostState() {
		return hostState;
	}

	public void setHostState(State hostState) {
		this.hostState = hostState;
	}

	public State getEventLogState() {
		return eventLogState;
	}

	public void setEventLogState(State eventLogState) {
		this.eventLogState = eventLogState;
	}

	public State getSystemState() {
		return systemState;
	}

	public void setSystemState(State systemState) {
		this.systemState = systemState;
	}

	public State getMpState() {
		return mpState;
	}

	public void setMpState(State mpState) {
		this.mpState = mpState;
	}

	public State getServicesState() {
		return servicesState;
	}

	public void setServicesState(State servicesState) {
		this.servicesState = servicesState;
	}

	public State getSignState() {
		return signState;
	}

	public void setSignState(State signState) {
		this.signState = signState;
	}
	
	public static class State {
		String severity;
		boolean changed;

		public State(String severity, boolean changed) {
			this.severity = severity;
			this.changed = changed;
		}
		public String getSeverity() {
			return severity;
		}
		public void setSeverity(String severity) {
			this.severity = severity;
		}
		public boolean isChanged() {
			return changed;
		}
		public void setChanged(boolean changed) {
			this.changed = changed;
		}		
	}
}
