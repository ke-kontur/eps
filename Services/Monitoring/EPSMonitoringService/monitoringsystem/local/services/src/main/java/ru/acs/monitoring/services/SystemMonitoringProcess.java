package ru.acs.monitoring.services;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileSystemUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ru.acs.fts.dto.adapters.DateUtilities;
import ru.acs.fts.dto.monitoring.DiskSpaceInfo;
import ru.acs.fts.dto.monitoring.MemoryInfo;
import ru.acs.fts.dto.monitoring.MonitoringAttribute;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.fts.dto.monitoring.SystemInfo;
import ru.acs.monitoring.common.utils.SeverityUtils;
import ru.acs.monitoring.settings.DiskSettings;
import ru.acs.monitoring.utils.MemoryInfoProvider;
import ru.acs.monitoring.utils.SystemInfoMemoryInfoProvider;
import ru.acs.monitoring.utils.WMIMemoryInfoProvider;

/**
 * Мониторинг системных ресурсов
 * 
 * @author fmv
 * 
 */
public class SystemMonitoringProcess implements MonitoringProcess {
	final static Logger log = LoggerFactory.getLogger(SystemMonitoringProcess.class);

	List<DiskSettings> diskSettings;
	SystemSettings systemSettings = new SystemSettings();

	private SystemInfo getSysInfo() {
		SystemInfo sysInfo = new SystemInfo();
		if (systemSettings.isMemoryMonitoringDisabled()) 
			log.info("Мониторинг оперативной памяти отключен в конфигурации");
		else
			try {
				sysInfo.setMemoryInfo(getMonitoringMemoryInfo());
			} catch (Exception exc) {
				setErrorInfo(sysInfo, exc);
			}
		if (systemSettings.isDiskMonitoringDisabled())
			log.info("Мониторинг дисков отключен в конфигурации");
		else
			fillDisksInfo(sysInfo);
		sysInfo.setSeverity(SeverityUtils.getMaxSeverity(sysInfo));
		sysInfo.setUpdateTime(DateUtilities.xmlCalendar());
		return sysInfo;
	}
	
	private void setErrorInfo(SystemInfo sysInfo, Exception exc) {
		String error = "Ошибка: " + exc.getMessage();
		log.error(error, exc);
		sysInfo.setSeverity(Severity.ERROR);
		sysInfo.setAdditionalInfo(error);	
	}

	private void fillDisksInfo(SystemInfo sysInfo) {
		if (diskSettings != null && diskSettings.size() > 0) {
			for (DiskSettings disk : diskSettings) {
				
				if (!disk.getDiskName().endsWith(":")) 
					disk.setDiskName(disk.getDiskName() + ":");
				
				sysInfo.getDiskInfos().add(getSpaceInfo(disk));
			}
		}
	}

	@Override
	public MonitoringAttribute getAddedOrDefaultAtribute(MonitoringInfo info) {
		if (info.getSystemInfo() == null) 
			info.setSystemInfo(new SystemInfo());		
		return info.getSystemInfo();
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ru.acs.monitoring.services.MonitoringProcess#getMonitoringInfo(ru.acs
	 * .monitoring.types.MonitoringInfo)
	 */
	public void fillMonitoringInfo(MonitoringInfo info) {
		log.info("Запущен: " + getProcessName());
		
		if (systemSettings.isDisabled()) {
			log.info(getProcessName() + " отключен в конфигурации");
			return;
		}
		info.setSystemInfo(getSysInfo());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ru.acs.monitoring.services.MonitoringProcess#getProcessName()
	 */
	public String getProcessName() {
		return "Сервис мониторинга системных ресурсов";
	}

	/**
	 * Информация мониторинга системной памяти
	 * 
	 * @return
	 */
	public MemoryInfo getMonitoringMemoryInfo() {
		MemoryInfoProvider memoryInfoProvider = getMemoryInfoProvider();		
		MemoryInfo genMemoryInfo = memoryInfoProvider.getMemoryInfo();
		double freePercent = 100 * genMemoryInfo.getFreeMemoryMb() / genMemoryInfo.getTotalMemoryMb();
		if (10 > freePercent) {
			genMemoryInfo.setSeverity(Severity.WARNING);
		} else {
			genMemoryInfo.setSeverity(Severity.INFO);
		}
		return genMemoryInfo;
	}

	private MemoryInfoProvider getMemoryInfoProvider() {		
		try {
			return new WMIMemoryInfoProvider();
		} catch (Throwable th) {
			log.error("Сбой при создании WMI-провайдера информации о памяти", th);
			return new SystemInfoMemoryInfoProvider();
		}
	}
	

	/**
	 * Получить информацию мониторинга свободного места на диске
	 * 
	 * @param disk
	 * @return
	 */
	private DiskSpaceInfo getSpaceInfo(DiskSettings disk) {
		DiskSpaceInfo diskSpace = new DiskSpaceInfo();
		diskSpace.setDiskName(disk.getDiskName());
		diskSpace.setSeverity(Severity.INFO);
		File file = new File(disk.getDiskName());
		if (file.exists()) {
			try {
				diskSpace.setFreeSizeMb(FileSystemUtils.freeSpaceKb(disk.getDiskName()) / 1024);
				if (disk.getWarningLevelMB() > diskSpace.getFreeSizeMb()) {
					diskSpace.setSeverity(Severity.WARNING);
				}
				if (disk.getErrorLevelMB() > diskSpace.getFreeSizeMb()) {
					diskSpace.setSeverity(Severity.ERROR);
				}
			} catch (IOException ex) {
				diskSpace.setSeverity(Severity.ERROR);
				diskSpace.setAdditionalInfo("Ошибка определения свободного места:" + ex.getMessage());
			}
			// TODO get TotalSpace
			long total = file.getTotalSpace();
			diskSpace.setTotalSizeMb(total / 1024 / 1024);
			// long used = total - file.getFreeSpace();
		} else {
			diskSpace.setSeverity(Severity.ERROR);
			diskSpace.setAdditionalInfo("Диск '" + disk.getDiskName() + "' не найден");
		}
		return diskSpace;
	}

	
	/**
	 * Установить список мониторуемых дисков
	 *
	 */
	@Autowired(required = false)
	public void setDiskSettings(List<DiskSettings> diskSettings) {
		this.diskSettings = diskSettings;
	}

	@Autowired(required = false)
	public void setSystemSettings(SystemSettings systemSettings) {
		this.systemSettings = systemSettings;
	}		
}
