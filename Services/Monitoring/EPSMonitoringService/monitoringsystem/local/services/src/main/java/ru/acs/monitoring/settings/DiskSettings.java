package ru.acs.monitoring.settings;

import org.springframework.beans.factory.annotation.Required;

public class DiskSettings {

	private String diskName;
	
	private int errorLevelMB = 20;
	
	private int warningLevelMB = 200;

	public String getDiskName() {
		return diskName;
	}

	@Required
	public void setDiskName(String diskName) {
		this.diskName = diskName;
	}

	public int getErrorLevelMB() {
		return errorLevelMB;
	}

	public void setErrorLevelMB(int errorLevelMB) {
		this.errorLevelMB = errorLevelMB;
	}

	public int getWarningLevelMB() {
		return warningLevelMB;
	}

	public void setWarningLevelMB(int warningLevelMB) {
		this.warningLevelMB = warningLevelMB;
	}

}
