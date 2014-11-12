package ru.acs.monitoring.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ru.acs.fts.dto.adapters.DateUtilities;
import ru.acs.fts.dto.monitoring.MonitoringAttribute;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.ServiceInfo;
import ru.acs.fts.dto.monitoring.ServicesInfo;
import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.monitoring.common.utils.NetUtils;
import ru.acs.monitoring.common.utils.SeverityUtils;
import ru.acs.monitoring.settings.LocalServicesSettings;
import ru.acs.monitoring.settings.RemoteServicesSettings;
import ru.acs.monitoring.utils.WMI;

/**
 * Сервис мониторинга системных сервисов
 * @author fmv
 *
 */
public class ServicesMonitoringProcess implements MonitoringProcess {
	
	public final static Logger log = LoggerFactory.getLogger(ServicesMonitoringProcess.class);
	
	LocalServicesSettings localProcesses;

	
	List<RemoteServicesSettings> remoteServices;

	@Override
	public MonitoringAttribute getAddedOrDefaultAtribute(MonitoringInfo info) {
		if (info.getSytemServicesInfo() == null)
			info.setSytemServicesInfo(new ServicesInfo());
		return info.getSytemServicesInfo();
	}
	/*
	 * (non-Javadoc)
	 * @see ru.acs.monitoring.services.MonitoringProcess#getMonitoringInfo(ru.acs.fts.dto.monitoring.MonitoringInfo)
	 */
	public void fillMonitoringInfo(MonitoringInfo info) {
		if (localProcesses==null && remoteServices==null){
			log.info(getProcessName()+" не запущен, т.к. не настроен списоп процессов для проверки!");
			return;
		}
		info.setSytemServicesInfo(getServicesInfo());
	}

	private ServicesInfo getServicesInfo() {
		log.info("Запущен: "+getProcessName());
		ServicesInfo info = new ServicesInfo();		
		//info.setName("Информация о сервисах");
		info.setUpdateTime(DateUtilities.xmlCalendar());
		
		if (localProcesses != null
				&& localProcesses.getProcessNames() != null
				&& localProcesses.getProcessNames().size() > 0) {
			fillLocalServicesInfo(info);
		}
		if (remoteServices != null && remoteServices.size() > 0) {
			fillRemoteServicesInfo(info);
		}
		info.setSeverity(SeverityUtils.getMaxSeverity(info));
		
		return info;
	}

	/**
	 * Заполнить информацию мониторинга по процессам
	 * 
	 * @param info - информация мониторинга
	 * @param processes - список запущенных процессов
	 * @param localProcesses - список процессов, которые должны быть запущены
	 * @param host - имя хоста, на котором проверяются процессы
	 */
	private void fillServicesInfo(ServicesInfo info, List<String> processes, List<String> processNames, String host) {
		for (Iterator<String> iterator = processNames.iterator(); iterator.hasNext();) {
			String process = iterator.next();
			ServiceInfo serviceInfo = new ServiceInfo();
			serviceInfo.setServiceName(process);
			if (host != null) {
				serviceInfo.setHost(host);
			}
			ServiceInfo service =serviceInfo;
			if (isServiceRunnig(process, processes)) {
				serviceInfo.setRunning(true);
				service.setSeverity(Severity.INFO);
			} else {
				serviceInfo.setRunning(false);
				service.setSeverity(Severity.ERROR);
			}
			info.getServices().add(service);
		}
	}

	
	private void fillRemoteServicesInfo(ServicesInfo info) {
		for (Iterator<RemoteServicesSettings> iterator1 = remoteServices.iterator(); iterator1.hasNext();) {
			RemoteServicesSettings remoteServicesSettings = iterator1.next();
			if (remoteServicesSettings.getProcessNames()==null || remoteServicesSettings.getProcessNames().size()==0){
				log.debug("Для  хоста '" + remoteServicesSettings.getHost() + "' не настроен список процессов!");
				continue;
			}
			log.debug("Получение информации о сервисах запущенных на '" + remoteServicesSettings.getHost() + "'");
			List<String> processes = getRunningProcesses(remoteServicesSettings.getHost(), remoteServicesSettings.getUserName(),
					remoteServicesSettings.getPassword());
			if (processes != null) {
				fillServicesInfo(info, processes, remoteServicesSettings.getProcessNames(), remoteServicesSettings.getHost());
			}
		}
	}

	private void fillLocalServicesInfo(ServicesInfo info) {
		log.debug("Получение информации о локально запущенных сервисах");
		List<String> processes = getRunningProcesses();
		String localHost = NetUtils.getLocalHostName();
		if (processes != null) {
			fillServicesInfo(info, processes, localProcesses.getProcessNames(), localHost);
		}
	}

	private boolean isServiceRunnig(String process, List<String> processes) {
		for (String runningProcess : processes) {
			if (process.equals(runningProcess)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.acs.monitoring.services.MonitoringProcess#getProcessName()
	 */
	public String getProcessName() {
		return "Сервис мониторинга Windows сервисов";
	}


	public List<RemoteServicesSettings> getRemoteServices() {
		return remoteServices;
	}
	/**
	 * Установить список хостов и процессов для мониторинга
	 * @param remoteServices - список типа List<RemoteServicesSettings>
	 */
	@Autowired(required=false)
	public void setRemoteServices(List<RemoteServicesSettings> remoteProcesses) {
		this.remoteServices = remoteProcesses;
	}

	public LocalServicesSettings getLocalServices() {
		return localProcesses;
	}

	/**
	 * Установить список локально запущенных процессов
	 * @param localProcesses список типа List<String>
	 */
	@Autowired(required=false)
	public void setLocalServices(LocalServicesSettings processNames) {
		this.localProcesses = processNames;
	}


	public static List<String> getRunningProcesses() {
		try {
			return new WMI().getRunningServices();
		} catch (Throwable th) {
			log.error("Ошибка при обращении к WMI за списком запущенных процессов", th);
		}
		try {
			Process p = Runtime.getRuntime().exec("tasklist.exe /SVC /fo csv /nh");
			return extractrocessListFormProcess(p);
		} catch (Exception err) {
			log.error("Ошибка получения списка процессов: " + err.getMessage(), err);
		}
		return null;
	}

	private static List<String> extractrocessListFormProcess(Process p) throws IOException {
		List<String> processes = new ArrayList<String>();
		String line;
		BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream(), Charset.forName("CP866")));
		while ((line = input.readLine()) != null) {
			if (!line.trim().equals("")) {
				line = line.substring(1);
				line = line.substring(0, line.length() - 1);
				line = line.substring(line.lastIndexOf("\"") + 1);
				if (line.contains(",")) {
					StringTokenizer tok = new StringTokenizer(line, ",");
					while (tok.hasMoreTokens()) {
						processes.add(tok.nextToken());
					}
				} else {
					processes.add(line);
				}
			}

		}
		input.close();
		return processes;
	}

	public static List<String> getRunningProcesses(String host, String userName, String passowrd) {
		if (host == null || userName == null || passowrd == null) {
			return null;
		}
		try {
			Process p = Runtime.getRuntime().exec(
					"tasklist.exe /SVC /S " + host + " /U " + userName + " /P " + passowrd + " /fo csv /nh");
			return extractrocessListFormProcess(p);
		} catch (Exception err) {
			log.error("Ошибка получения списка процессов на удаленном хосте: " + err.getMessage(), err);
		}
		return null;
	}

}
