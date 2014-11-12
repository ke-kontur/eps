package ru.acs.monitoring.settings;

import java.util.List;


/**
 * Настройки удаленных сервисов
 * @author fmv
 *
 */
public class RemoteServicesSettings{
	String host;
	String userName;
	String password;
	List<String> processNames;

	public List<String> getProcessNames() {
		return processNames;
	}

	/**
	 * Устновить список процессов
	 * @param processNames д.б. типа List<String>
	 */
	public void setProcessNames(List<String> processNames) {
		this.processNames = processNames;
	}
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
