package ru.acs.monitoring.bo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.monitoring.BusinessObject;
import ru.acs.monitoring.dao.ConnectionDAO;
import ru.acs.monitoring.dao.TimerDAO;
import ru.acs.monitoring.domain.Connection;
import ru.acs.monitoring.domain.Timer;
import ru.acs.monitoring.services.MonitoringInfoProcessor;

/**
 * Обработчик сообщения с {@link MonitoringInfo}
 * @author fmv
 *
 */
public class MIProcessingStrategy {
	private static final Logger log = LoggerFactory.getLogger(MIProcessingStrategy.class);
	ConnectionDAO connDao;
	TimerDAO timerDao;
	protected MonitoringInfoProcessor miProcessor;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void run(BusinessObject bo) {
		String initialRequestId = bo.getContext().getRoutingInf().getInitialEnvelopeID();
		if (initialRequestId == null) {
			log.error("В сообщении отсутствует InitialEnvelopeID - документ не будет обработан!");
			return;
		}
		Timer timer = getTimer(initialRequestId);
		if (timer == null) {
			log.error("Не найден таймер [requestId=" + initialRequestId
					+ "] инициировавшего запрос сообщения - документ не будет обработан!");
			return;
		}
		log.info("Найден таймер. connnectionId=" + timer.getConnectionId());
		Connection connection = connDao.findById(timer.getConnectionId());
		if (connection == null) {
			log.error("Не найдено подключение [id=" + timer.getConnectionId()
					+ "] локального агента - документ не будет обработан!");
			return;
		}
		miProcessor.processMonitoringInfo((MonitoringInfo) bo.getContext().getDoc(), connection);
		try {
			removeTimer(timer);
		} catch (DataAccessException e) {
			log.error("Ошибка при удалении таймера с ID="+timer.getId()+". Ошибка:"+e.getMessage(),e);
		}
	}

	private Timer getTimer(String requestId) {
		return timerDao.findByRequestID(requestId);
	}

	private void removeTimer(Timer timer) {
		timerDao.remove(timer);
	}

	@Autowired
	public void setMiProcessor(MonitoringInfoProcessor miProcessor) {
		this.miProcessor = miProcessor;
	}

	@Autowired
	public void setConnDao(ConnectionDAO connDao) {
		this.connDao = connDao;
	}

	@Autowired
	public void setTimerDao(TimerDAO timerDao) {
		this.timerDao = timerDao;
	}

}
