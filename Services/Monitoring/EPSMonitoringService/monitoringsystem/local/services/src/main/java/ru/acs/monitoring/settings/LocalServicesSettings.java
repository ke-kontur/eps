package ru.acs.monitoring.settings;

import java.util.List;

public class LocalServicesSettings {

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

}
