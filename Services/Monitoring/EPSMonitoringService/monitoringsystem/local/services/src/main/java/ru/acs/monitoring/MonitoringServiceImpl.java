package ru.acs.monitoring;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ru.acs.fts.dto.monitoring.MonitoringAttribute;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.monitoring.common.utils.RandomGUID;
import ru.acs.monitoring.common.utils.SeverityUtils;
import ru.acs.monitoring.domain.CommonSettings;
import ru.acs.monitoring.domain.MonitoringInfoWrapper;
import ru.acs.monitoring.notification.NotificationExecutor;
import ru.acs.monitoring.notification.NotificationStrategy;
import ru.acs.monitoring.notification.NotificationStrategyProvider;
import ru.acs.monitoring.notification.Notifier;
import ru.acs.monitoring.notification.NotifierUtils;
import ru.acs.monitoring.services.MonitoringProcess;

/**
 * Релизация сервиса мониторинга
 * 
 * @author fmv
 * 
 */
@WebService(endpointInterface = "ru.acs.monitoring.MonitoringService")
public class MonitoringServiceImpl implements MonitoringService {
	final static Logger log = LoggerFactory.getLogger(MonitoringServiceImpl.class);
	private ExecutorService executorService = Executors.newFixedThreadPool(100);

	/**
	 * Список процессов мониторинга
	 */
	List<MonitoringProcess> monitoringProcesses;

	/**
	 * Список уведомителей
	 */
	List<Notifier> notificators;

	CommonSettings settings;
	
	NotificationStrategyProvider notificationStrategyProvider;
	
	private CachedMonitoringInfo cachedInfo;

	public MonitoringServiceImpl() {
		notificationStrategyProvider = new NotificationStrategyProvider(
				NotificationStrategy.EveryTime);		
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see ru.acs.monitoring.MonitoringService#getMonitoringInfo()
	 */
	public MonitoringInfo getMonitoringInfo() {
		log.info("Вызван метод получения мониторингуемой информации");
		MonitoringInfo resp = new MonitoringInfo();
		resp.setSystemName(settings.getSystemName());
		resp.setSystemId(settings.getSystemId());
		resp.setDocumentID(new RandomGUID().toString());
		if (monitoringProcesses != null) {
			//Многопоточное выполнение процеесов мониторинга
			Set<Future<?>> taskFutures = new HashSet<Future<?>>();
			for (MonitoringProcess process : monitoringProcesses)
				taskFutures.add(executorService.submit(new MonitoringProcessRunner(
						resp, process), null));
			for (Future<?> future : taskFutures)
				try {
					future.get();
				} catch (Exception exc) {
					log.error("Ошибка выполнения процесса мониторинга", exc);
				}
		}
		resp.setSeverity(SeverityUtils.getMaxSeverity(resp));
		log.debug("Метод получения мониторуемой информации заверщен. Severity=" + resp.getSeverity());
		setCachedInfo(new CachedMonitoringInfo(resp));
		return resp;
	}
	
	private class MonitoringProcessRunner implements Runnable {
		private MonitoringInfo resp;
		private MonitoringProcess process;		
		
		public MonitoringProcessRunner(MonitoringInfo resp,
				MonitoringProcess process) {
			super();
			this.resp = resp;
			this.process = process;
		}
		
		public void run() {
			try {
				log.debug("Запущен процесс мониторинга -  " + process.getProcessName());
				process.fillMonitoringInfo(resp);
				log.debug("Процесс мониторинга -  " + process.getProcessName() + " завершен");
			} catch (Exception e) { // так должно быть, так как ни одно
				// исключение не должно обрушивать
				// процесс мониторинга
				String error = "Ошибка во время мониторинга. Процесс: " + process.getProcessName() + ". Ошибка: "
						+ e.getMessage();
				log.error(error, e);
				MonitoringAttribute attribute = process.getAddedOrDefaultAtribute(resp);
				if (attribute != null) {
					attribute.setSeverity(Severity.ERROR);
					attribute.setAdditionalInfo(error);					
				} else {
					resp.getErrors().add(error);
					resp.setSeverity(Severity.ERROR);
				}
			}
		}
	}

	
	@Override
	public MonitoringInfo getCachedMonitoringInfo() {
		CachedMonitoringInfo cachedInfo = getCachedInfo();
		if (cachedInfo == null)
			return getMonitoringInfo();
		else
			return cachedInfo.getMonitoringInfo();		
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see ru.acs.monitoring.MonitoringService#scan()
	 */
	public void scan() {		
		if (!notificationStrategyProvider.getStrategy().equals(
				NotificationStrategy.EveryTime)) {
			log.debug("Сканирование производиться не будет, выбрана иная стратегия уведомления");
			return;
		}
		
		log.debug("Запущен принудительный опрос ресурсов мониторинга");
		MonitoringInfo prevInfo = null;
		if (cachedInfo != null)
			prevInfo = cachedInfo.getMonitoringInfo();
		MonitoringInfo info = getMonitoringInfo();
		if (notificationStrategyProvider.getStrategy().equals(
				NotificationStrategy.EveryTime))
			notify(info, prevInfo);
	}
	
	private void notify(MonitoringInfo newInfo, MonitoringInfo prevInfo) {
		NotificationExecutor notifier = new NotificationExecutor(notificators, new MonitoringInfoWrapper(newInfo, prevInfo));
		executorService.submit(notifier);
	}

	public List<MonitoringProcess> getMonitoringProcesses() {
		return monitoringProcesses;
	}

	public void setMonitoringProcesses(List<MonitoringProcess> monitoringProcesses) {
		this.monitoringProcesses = monitoringProcesses;
	}

	@Autowired
	public void setNotificators(List<Notifier> notificators) {
		this.notificators = notificators;
	}
	
	@Autowired(required=false)
	public void setNotificationStrategyProvider(
			NotificationStrategyProvider notificationStrategyProvider) {
		this.notificationStrategyProvider = notificationStrategyProvider;
	}

	public CommonSettings getSettings() {
		return settings;
	}

	@Autowired
	public void setSettings(CommonSettings settings) {
		this.settings = settings;
	}
	

	public synchronized CachedMonitoringInfo getCachedInfo() {
		return cachedInfo;
	}


	public synchronized void setCachedInfo(CachedMonitoringInfo cachedInfo) {
		if (this.cachedInfo != null && isNotificationNeeded(this.cachedInfo.getMonitoringInfo(),cachedInfo.getMonitoringInfo()))
			notify(cachedInfo.getMonitoringInfo(), this.cachedInfo.getMonitoringInfo());
		this.cachedInfo = cachedInfo;
	}
	
	private boolean isNotificationNeeded(MonitoringInfo oldOne, MonitoringInfo newOne) {
		if (!notificationStrategyProvider.getStrategy().equals(
				NotificationStrategy.CacheStateChange))
			return false;
		int oldErrCount = NotifierUtils.getMonitoringInfoErrorsCount(oldOne);
		int newErrCount = NotifierUtils.getMonitoringInfoErrorsCount(newOne);
		log.info("Количество ошибок при предыдущем мониторинге: " + oldErrCount);
		log.info("Количество ошибок при последнем мониторинге: " + newErrCount);
		//Необходимо посылать уведомления, если количество ошибок увеличилось или
		// стало равным 0 (MON-5)
		return oldErrCount < newErrCount || (oldErrCount > 0 && newErrCount == 0);
	}
	
	
}
