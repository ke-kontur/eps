package ru.acs.monitoring.dao;

import ru.acs.monitoring.domain.Timer;

/**
 * Интерфейс DAO для таймеов
 * @author fmv
 *
 */
public interface TimerDAO extends BaseDAO<Timer> {
	/**
	 * ПОиск таймера
	 * @param requestId - id запроса
	 * @return Таймер
	 */
	public Timer findByRequestID(String requestId);
}
