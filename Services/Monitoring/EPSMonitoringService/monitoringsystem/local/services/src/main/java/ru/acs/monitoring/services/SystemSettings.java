package ru.acs.monitoring.services;

import ru.acs.fts.dto.monitoring.Attribute;

/**
 * Параметры мониторинга системных ресурсов
 * @author bad
 *
 */
public class SystemSettings extends Attribute{
	
	boolean disabled = false;
	boolean diskMonitoringDisabled = false;
	boolean memoryMonitoringDisabled = false;
	
	public boolean isDisabled() {
		return disabled;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public boolean isDiskMonitoringDisabled() {
		return diskMonitoringDisabled;
	}
	public void setDiskMonitoringDisabled(boolean diskMonitoringDisabled) {
		this.diskMonitoringDisabled = diskMonitoringDisabled;
	}
	public boolean isMemoryMonitoringDisabled() {
		return memoryMonitoringDisabled;
	}
	public void setMemoryMonitoringDisabled(boolean memoryMonitoringDisabled) {
		this.memoryMonitoringDisabled = memoryMonitoringDisabled;
	}	
}
