package ru.acs.monitoring.utils;

import ru.acs.fts.dto.monitoring.MemoryInfo;

public class WMIMemoryInfoProvider implements MemoryInfoProvider{

	WMI wmi;
	
	public WMIMemoryInfoProvider() {
		wmi = new WMI();
	}

	@Override
	public MemoryInfo getMemoryInfo() {
		MemoryInfo memoryInfo = new MemoryInfo();				
		memoryInfo.setTotalMemoryMb(wmi.getTotalMemorySize() >> 20);
		memoryInfo.setFreeMemoryMb(wmi.getWindowsFreeMemorySize() >> 20);	
		return memoryInfo;
	}

}
