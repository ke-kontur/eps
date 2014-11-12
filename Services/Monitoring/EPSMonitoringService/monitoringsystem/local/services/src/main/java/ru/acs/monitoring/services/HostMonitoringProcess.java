package ru.acs.monitoring.services;

import java.net.InetAddress;
import java.util.GregorianCalendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ru.acs.fts.dto.adapters.DateUtilities;
import ru.acs.fts.dto.monitoring.HostMonitoringInfo;
import ru.acs.fts.dto.monitoring.HostMonitoringInfos;
import ru.acs.fts.dto.monitoring.MonitoringAttribute;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.fts.dto.monitoring.TCPPortOpenCheck;
import ru.acs.monitoring.common.utils.SeverityUtils;
import ru.acs.monitoring.services.HostSettings.ScannedPort;
import ru.acs.monitoring.utils.TCPPortChecker;

public class HostMonitoringProcess implements MonitoringProcess {
	final static Logger log = LoggerFactory
			.getLogger(HostMonitoringProcess.class);

	/**
	 * Список описаний хостов для мониторинга, тип должен быть HostSettings
	 */

	List<HostSettings> hostSettings;
	
	@Override
	public MonitoringAttribute getAddedOrDefaultAtribute(MonitoringInfo info) {	
		if (info.getHostInfos() == null)
			info.setHostInfos(new HostMonitoringInfos());
		return info.getHostInfos();
	}

	public void fillMonitoringInfo(MonitoringInfo info) {		

		if (hostSettings != null && hostSettings.size() > 0) {
			HostMonitoringInfos hostMonInfo = new HostMonitoringInfos();
			hostMonInfo.setName("Мониторинг хостов");
			hostMonInfo.setDescription("Информация мониторинга хостов");
			for (HostSettings host : hostSettings) {
				HostMonitoringInfo hostInfo = new HostMonitoringInfo();
				hostInfo.setName(host.getName());
				hostInfo.setDescription(host.getDescription());
				hostInfo.setSeverity(Severity.INFO);

				checkAvaiability(hostInfo, host);
				if (hostInfo.isAvailable())
					checkPotsOpen(hostInfo, host);

				hostInfo.setUpdateTime(DateUtilities
						.gregorianToXml(GregorianCalendar.getInstance()));
				hostMonInfo.getHostInfos().add(hostInfo);
			}
			hostMonInfo.setSeverity(SeverityUtils.getMaxSeverity(hostMonInfo));
			hostMonInfo.setUpdateTime(DateUtilities
					.gregorianToXml(GregorianCalendar.getInstance()));
			info.setHostInfos(hostMonInfo);
		} else {
			log
					.info(getProcessName()
							+ " не запущен, так как не настроен список хостов для проверки!");
		}

	}

	private void checkAvaiability(HostMonitoringInfo hostInfo,
			HostSettings host) {
		try {
			InetAddress address = InetAddress.getAllByName(host.getAddress())[0];
			boolean available = address.isReachable(host.getTimeout());					
			hostInfo.setAvailable(available);
			hostInfo.setSeverity(available?Severity.INFO:Severity.ERROR);
		} catch (Exception exc) {
			log.info("Сбой при определении доступности хоста " + host.getName()
					+ " c адресом " + host.getAddress(), exc);
			hostInfo.setAvailable(false);
			hostInfo.setSeverity(Severity.ERROR);
		}
	}

	private void checkPotsOpen(HostMonitoringInfo hostInfo, HostSettings host) {
		for (ScannedPort port : host.getScannedPorts()) {
			TCPPortOpenCheck check = new TCPPortOpenCheck();
			check.setName(port.getName());
			check.setSeverity(Severity.INFO);
			check.setDescription(port.getDescription());
			boolean portOpen = new TCPPortChecker().checkPortOpen(host
					.getAddress(), port.getPort(), port.getTimeout());
			check.setOpen(portOpen);
			if (!portOpen) {
				check.setSeverity(Severity.ERROR);
				hostInfo.setSeverity(Severity.ERROR);
			}
			check.setUpdateTime(DateUtilities.gregorianToXml(GregorianCalendar
					.getInstance()));
			hostInfo.getPortOpenChecks().add(check);
		}
	}

	@Autowired(required = false)
	public void setHostSettings(List<HostSettings> hostSettings) {
		this.hostSettings = hostSettings;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ru.acs.monitoring.services.MonitoringProcess#getProcessName()
	 */
	public String getProcessName() {
		return "Сервис мониторинга хостов";
	}

}
