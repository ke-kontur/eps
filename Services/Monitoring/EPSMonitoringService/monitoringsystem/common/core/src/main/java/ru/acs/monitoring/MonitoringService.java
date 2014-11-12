package ru.acs.monitoring;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ru.acs.fts.dto.monitoring.MonitoringInfo;

/**
 * Основной интерфейс для работы с системой мониторига. Используется и для публикации в WS
 * @author fmv
 *
 */
@WebService
public interface MonitoringService {
	
	/**
	 * Получить информацию мониторинга
	 * @return Собранная информация 
	 */
	@WebMethod
    public MonitoringInfo getMonitoringInfo();
    
	/**
	 * Получить скэшированную информацию мониторинга
	 * @return Собранная информация 
	 */
	@WebMethod
    public MonitoringInfo getCachedMonitoringInfo();
	
    /**
	 * Запуск опроса и запуск зарегистрированных уведомителей 
	 */
	public void scan();
}
