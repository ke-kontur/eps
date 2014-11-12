package ru.acs.monitoring.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.dto.monitoring.Attribute;

/**
 * Информация о хосте
 * 
 * @author bad
 * 
 */
public class HostSettings extends Attribute {

	private String address;
	private int timeout = 2000;	
	private List<ScannedPort> scannedPorts = new LinkedList<ScannedPort>();

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public String getAddress() {
		return address;
	}

	@Required
	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<ScannedPort> getScannedPorts() {
		return scannedPorts;
	}

	public void setScannedPorts(List<ScannedPort> scannedPorts) {
		this.scannedPorts = scannedPorts;
	}

	public static class ScannedPort extends Attribute {
		private int port;
		private int timeout = 2000;

		public int getPort() {
			return port;
		}

		@Required
		public void setPort(int port) {
			this.port = port;
		}

		public int getTimeout() {
			return timeout;
		}

		public void setTimeout(int timeout) {
			this.timeout = timeout * 1000;
		}
	}
}
