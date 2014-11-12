package ru.acs.monitoring.dao;

import ru.acs.monitoring.domain.Connection;

/**
 * дао интерфейс для Connection
 * 
 * @author fmv
 * 
 */
public interface ConnectionDAO extends BaseDAO<Connection> {
	/**
	 * Поиск Connection по URL веб сервиса
	 * @param wsUrl
	 * @return
	 */
	public Connection findByWsUrl(String wsUrl);
}
