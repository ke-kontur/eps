package ru.acs.monitoring.services;

public class DbCleanerServiceSettings {
	
	
	public DbCleanerServiceSettings() {
	}

	public DbCleanerServiceSettings(int storingPeriod) {
		this.storingPeriod = storingPeriod;
	}

	int storingPeriod;

	public int getStoringPeriod() {
		return storingPeriod;
	}

	public void setStoringPeriod(int storingPeriod) {
		this.storingPeriod = storingPeriod;
	}	
}
