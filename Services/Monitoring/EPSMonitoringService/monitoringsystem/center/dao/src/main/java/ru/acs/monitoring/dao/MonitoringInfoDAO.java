package ru.acs.monitoring.dao;

import java.util.Date;
import java.util.List;

import ru.acs.monitoring.domain.Connection;
import ru.acs.monitoring.domain.MonitoringInf;

/**
 * дао интерфейс для объектов  MonitoringInf
 * @author fmv
 *
 */
public interface MonitoringInfoDAO extends BaseDAO<MonitoringInf> {

	/**
	 * Поиск последней информации по всем мониторуемым объектам 
	 * @return
	 */
	public List<MonitoringInf> findLast();
	
	/**
	 * Поиск предпоследней информации по всем мониторуемым объектам 
	 * @return
	 */
	public List<MonitoringInf> findPreLast();
	
	public List<MonitoringInf> find(Date from, Date to,Connection  connection, String severity ,int limit,int offset);
	
	public int delete(final Date to);
	
	public String getXML(MonitoringInf inf);
}
