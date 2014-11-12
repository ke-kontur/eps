package ru.acs.monitoring.utils;

public class WMIProperty {
	private String name;
	private String description;	
	
	public WMIProperty(String name, String description) {		
		this.name = name;
		this.description = description;		
	}

	public String getName() {
		return name;
	}

	public String getDescription() {		
		return description;
	}	
}
