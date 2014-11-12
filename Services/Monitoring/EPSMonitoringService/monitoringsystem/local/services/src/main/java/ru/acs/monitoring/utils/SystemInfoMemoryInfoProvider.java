package ru.acs.monitoring.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.dto.monitoring.MemoryInfo;

import com.sun.management.OperatingSystemMXBean;

public class SystemInfoMemoryInfoProvider implements MemoryInfoProvider{

	final static Logger log = LoggerFactory.getLogger(SystemInfoMemoryInfoProvider.class);
	
	/**
	 * Информация о системной памяти
	 * 
	 * @return
	 */
	public MemoryInfo getMemoryInfo() {
		MemoryInfo memoryInfo = new MemoryInfo();
		OperatingSystemMXBean operatingSystemMXBean = (OperatingSystemMXBean) ManagementFactory
				.getOperatingSystemMXBean();
		List<String> sysInfo = null;
		try {
			Process p = Runtime.getRuntime().exec("systeminfo.exe");
			sysInfo = readProcessOut(p);
		} catch (Exception err) {
			log.error("Ошибка получения списка процессов: " + err.getMessage(), err);
		}
				
		String sysMemory =null;
		String freeMemory =null;
		if (sysInfo!=null){
			sysMemory=extractTotalMemory(sysInfo);
			freeMemory=extractFreeMemory(sysInfo);
		}
		if (sysMemory != null && sysMemory.length() > 0) {
			try {
				memoryInfo.setTotalMemoryMb(new Long(sysMemory));
			} catch (NumberFormatException e) {
				setTotalMemoryByJava(memoryInfo, operatingSystemMXBean);
			}
		} else {
			setTotalMemoryByJava(memoryInfo, operatingSystemMXBean);
		}
		if (freeMemory != null && freeMemory.length() > 0) {
			try {
				memoryInfo.setFreeMemoryMb(new Long(freeMemory));
			} catch (NumberFormatException e) {
				setFreeMemoryByJava(memoryInfo, operatingSystemMXBean);
			}
		} else {
			setFreeMemoryByJava(memoryInfo, operatingSystemMXBean);
		}

	
		return memoryInfo;
	}

	private void setFreeMemoryByJava(MemoryInfo memoryInfo, OperatingSystemMXBean operatingSystemMXBean) {
		memoryInfo.setFreeMemoryMb(Math.round(operatingSystemMXBean.getFreePhysicalMemorySize() / 1024.0 / 1024.0));
	}

	private void setTotalMemoryByJava(MemoryInfo memoryInfo, OperatingSystemMXBean operatingSystemMXBean) {
		memoryInfo.setTotalMemoryMb(Math.round(operatingSystemMXBean.getTotalPhysicalMemorySize() / 1024.0 / 1024.0));
	}
	

	private static String extractTotalMemory(List<String> info) {
		return extractNumberValueFromSysInfo(info, "Total Physical Memory:", "Полный объем физической памяти:");
	}

	private static String extractNumberValueFromSysInfo(List<String> info, String enConst, String ruConst) {
		for (String str : info) {
			if (str.startsWith(enConst) || str.startsWith(ruConst)) {
				int indexOf = str.indexOf(":");
				if (indexOf > 0) {
					String memory = str.substring(indexOf + 1, str.length()).trim();
					String result = "";
					for (int i = 0; i < memory.length(); i++) {
						char c = memory.charAt(i);
						if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7'
								|| c == '8' || c == '9' || c == '0') {
							result += c;
						}
					}
					return result;
				}
			}
		}
		return null;
	}

	private static String extractFreeMemory(List<String> info) {
		return extractNumberValueFromSysInfo(info, "Available Physical Memory:", "Доступная физическая память:");
	}
	
	private static List<String> readProcessOut(Process p) throws IOException {
		List<String> lines = new ArrayList<String>();
		String line;
		BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream(), Charset.forName("CP866")));
		while ((line = input.readLine()) != null) {
			if (!line.trim().equals("")) {
				lines.add(line);
			}

		}
		input.close();
		return lines;
	}
}
