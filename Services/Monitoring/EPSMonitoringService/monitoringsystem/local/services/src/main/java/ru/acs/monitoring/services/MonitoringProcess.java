package ru.acs.monitoring.services;

import ru.acs.fts.dto.monitoring.MonitoringAttribute;
import ru.acs.fts.dto.monitoring.MonitoringInfo;

/**
 *
 * Интерфейс для процессов, осуществляющих мониторинг 
 * @author fmv
 *
 */
public interface MonitoringProcess {
		
		/**
		 * Информация по мониторингу конкретного процесса, заполяется непосредственно в MonitoringInfo
		 * @param info
		 */
		public void fillMonitoringInfo(MonitoringInfo info);
		
		/**
		 * Имя (описание) процесса мониторинга
		 * @return
		 */
		public String getProcessName();
		
		/**
		 * Добавленный процессом MonitoringAttribute
		 * @return
		 */
		public MonitoringAttribute getAddedOrDefaultAtribute(MonitoringInfo info);
		
}
