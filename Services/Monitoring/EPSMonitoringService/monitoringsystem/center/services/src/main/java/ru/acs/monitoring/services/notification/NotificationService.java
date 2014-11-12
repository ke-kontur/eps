package ru.acs.monitoring.services.notification;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ru.acs.fts.dto.OXMConverter;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.monitoring.MonitoringRuntimeException;
import ru.acs.monitoring.domain.Connection;
import ru.acs.monitoring.domain.MonitoringInf;
import ru.acs.monitoring.domain.MonitoringInfoWrapper;
import ru.acs.monitoring.notification.NotificationStrategy;
import ru.acs.monitoring.notification.NotificationStrategyProvider;
import ru.acs.monitoring.notification.Notifier;
import ru.acs.monitoring.notification.NotifierUtils;
import ru.acs.monitoring.services.ConnectionsService;
import ru.acs.monitoring.services.MonitoringInfoService;

/**
 * Сервис рассылки уведомлений для центра
 * 
 * @author fmv
 * 
 */
public class NotificationService {
	private static final Logger log = LoggerFactory.getLogger(NotificationService.class);
	private MonitoringInfoService service;
	private ConnectionsService connService;
	OXMConverter converter = new OXMConverter();
	List<Notifier> notificators;
	Map<Long, MonitoringInf> previousScanInfos = new HashMap<Long, MonitoringInf>();
	NotificationStrategyProvider notificationStrategyProvider;
	
	public NotificationService() {
		notificationStrategyProvider = new NotificationStrategyProvider(
				NotificationStrategy.EveryTime);		
	}

	public void run() {
		log.info("Запущен сервис уведомлений");
		if (notificators != null) {
			runNotify();
		} else {
			log.info("Нет зарегистрированных уведомителей");
		}
		log.info("Завершен сервис уведомлений");
	}

	private void runNotify() {
		Collection<MonitoringInf> infs = service.getLastMonitoringInf();
		Collection<Connection> connections = connService.getAll();
		List<MonitoringInfoWrapper> monInfoList = new ArrayList<MonitoringInfoWrapper>();
		for (Connection connection : connections) {
            if (!connection.isDisplay()){
                continue;
            }
			MonitoringInf inf = getMonitoringInfByConnectionId(infs, connection
					.getId());			
			
			if (inf == null) {
				//В базе нет записи, но возможно, что агент недоступен
				continue;
			}
			MonitoringInfo previousInfo = getFromCache(inf);

			if (!needToNotify(inf)) {
				cache(inf);
				continue;
			}
			cache(inf);
			if (service.getMonitoringXML(inf) != null) {
				byte[] mon;
				try {
					mon = service.getMonitoringXML(inf).getBytes("UTF-8");
				} catch (UnsupportedEncodingException e) {
					throw new MonitoringRuntimeException(
							"В системе не поддерживается UTF-8");
				}
				MonitoringInfo info = (MonitoringInfo) converter.unmarshall(mon);
				monInfoList.add(new MonitoringInfoWrapper(info, previousInfo));
			} else {
				MonitoringInfo info = new MonitoringInfo();
				info.setSeverity(Severity.valueOf(inf.getSeverity()));
				info.setSystemName(inf.getSystemName());
				if (inf.getSystemId() != null) {
					info.setSystemId(inf.getSystemId());
				} else {
					info.setSystemId(" ");
				}
				info.getErrors().add(inf.getError());
				monInfoList.add(new MonitoringInfoWrapper(info, previousInfo));
			}
		}
		if (monInfoList != null && monInfoList.size() > 0) {
			for (Notifier notificator : notificators) {
				notificator.notify(monInfoList);
			}
		}else{
			log.info("Информации по мониторингу в БД нет. Уведомления не отправлены.");
		}
	}
	
	private MonitoringInf getMonitoringInfByConnectionId(Collection<MonitoringInf> infs, Long id) {
		for (MonitoringInf inf : infs)
			if (inf.getConnection().getId().equals(id))
				return inf;
		return null;
	}

	private void cache(MonitoringInf inf) {
		previousScanInfos.put(inf.getConnection().getId(), inf);
	}
	
	private MonitoringInfo getFromCache(MonitoringInf inf) {
		MonitoringInf prev = previousScanInfos.get(inf.getConnection().getId());
		if (prev == null)
			return null;
		try {
			String xml = service.getMonitoringXML(prev);
			if (xml == null)
				return null;
			byte[] mon = xml.getBytes("UTF-8");
			return (MonitoringInfo) converter.unmarshall(mon);
		} catch (UnsupportedEncodingException e) {
			return null;
		}		
	}
	
	private boolean needToNotify(MonitoringInf inf) {
		if (notificationStrategyProvider.getStrategy().equals(
				NotificationStrategy.EveryTime))
			return true;

		MonitoringInf prevInf = previousScanInfos.get(inf.getConnection()
				.getId());
		if (prevInf == null)
			return true;

		int oldErrCount = NotifierUtils.getMonitoringInfoErrorsCount(getMonitoringInfo(prevInf));
		int newErrCount = NotifierUtils.getMonitoringInfoErrorsCount(getMonitoringInfo(inf));
		log.info("Количество ошибок при предыдущем мониторинге "
				+ inf.getConnection().getName() + ": " + oldErrCount);
		log.info("Количество ошибок при последнем мониторинге "
				+ inf.getConnection().getName() + ": " + newErrCount);
		// Необходимо посылать уведомления, если количество ошибок увеличилось
		// или
		// стало равным 0 (MON-5)
		return oldErrCount < newErrCount
				|| (oldErrCount > 0 && newErrCount == 0);

	}
	
	private MonitoringInfo getMonitoringInfo(MonitoringInf inf) {
		if (service.getMonitoringXML(inf) != null) {
			byte[] mon;
			try {
				mon = service.getMonitoringXML(inf).getBytes("UTF-8");
			} catch (UnsupportedEncodingException e) {
				throw new MonitoringRuntimeException(
						"В системе не поддерживается UTF-8");
			}	
			return (MonitoringInfo) converter.unmarshall(mon);
		}
		return new MonitoringInfo();		
	}
	
	@Autowired
	public void setService(MonitoringInfoService service) {
		this.service = service;
	}

	@Autowired
	public void setConnService(ConnectionsService connService) {
		this.connService = connService;
	}

	@Autowired(required = false)
	public void setNotificators(List<Notifier> notificators) {
		this.notificators = notificators;
	}

	@Autowired(required = false)
	public void setNotificationStrategyProvider(
			NotificationStrategyProvider notificationStrategyProvider) {
		this.notificationStrategyProvider = notificationStrategyProvider;
	}
}
