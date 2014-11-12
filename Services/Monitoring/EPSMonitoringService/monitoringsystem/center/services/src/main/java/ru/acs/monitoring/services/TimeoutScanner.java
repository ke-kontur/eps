package ru.acs.monitoring.services;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.monitoring.dao.ConnectionDAO;
import ru.acs.monitoring.dao.TimerDAO;
import ru.acs.monitoring.domain.CommonSettings;
import ru.acs.monitoring.domain.Connection;
import ru.acs.monitoring.domain.MonitoringInf;
import ru.acs.monitoring.domain.Timer;

/**
 * Сканер запросов с таймаутом
 * 
 * @author fmv
 * 
 */
public class TimeoutScanner {
	final static Logger log = LoggerFactory.getLogger(TimeoutScanner.class);
	TimerDAO timerDao;
	ConnectionDAO connectionDAO;
	CommonSettings settings;
	MonitoringInfoProcessor monitoringInfoProcessor;

	/**
	 * проверить все отправленные запросы на таймаут
	 */
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void scan() {
		log.info("Запущен сканер запросов с таймаутом.");
		List<Timer> timerList = timerDao.findAll();
		if (timerList==null || timerList.size()==0){
			log.info("Запущенных таймеров не найдено.");
			return;
		}
		Date now = new Date();		
		for (Timer timer : timerList) {
			if (timer.getEndDate() != null && now.after(timer.getEndDate())) {
				log.warn("Найден устаревший таймер. Запрос был отправлен в '"+timer.getReceiver()+"' в '"+timer.getStatDate()+"', RequestID='"+timer.getRequestId()+"', тип сообщения '"+timer.getMessageKind()+"'");
				processTimeOut(timer);
			}
		}
	}

	private void processTimeOut(Timer timer) {		
		if (settings.getMonitoringInqMessageKind().equals(timer.getMessageKind()) && timer.getConnectionId()!=null) {
			Connection connection = connectionDAO.findById(timer.getConnectionId());
			if (connection != null) {
				MonitoringInf inf = new MonitoringInf();
				inf.setConnection(connection);
				inf.setError("Истекло время ожидания ответа от агента");
				inf.setSeverity(Severity.ERROR.toString());
				inf.setSystemName(connection.getName());
				inf.setUpdateDate(new Date());
				monitoringInfoProcessor.processMonitoringInfo(inf);
			}
		}
		timerDao.remove(timer);
	}

	@Autowired
	public void setTimerDao(TimerDAO timerDao) {
		this.timerDao = timerDao;
	}

	@Autowired
	public void setSettings(CommonSettings settings) {
		this.settings = settings;
	}

	@Autowired
	public void setConnectionDAO(ConnectionDAO connectionDAO) {
		this.connectionDAO = connectionDAO;
	}

	@Autowired
	public void setMonitoringInfoProcessor(MonitoringInfoProcessor monitoringInfoProcessor) {
		this.monitoringInfoProcessor = monitoringInfoProcessor;
	}
}
