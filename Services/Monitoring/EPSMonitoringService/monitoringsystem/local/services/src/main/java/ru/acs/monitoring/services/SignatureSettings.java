package ru.acs.monitoring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.dto.monitoring.Attribute;

public class SignatureSettings extends Attribute{
	String serverName;
	int port=1099;
	String serviceName="SignatureProcessor";
	List<String> certificates;
	
	public String getServerName() {
		return serverName;
	}
	
	@Required
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	
	public List<String> getCertificates() {
		return certificates;
	}
	
	@Required
	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}

}
