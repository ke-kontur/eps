package ru.acs.monitoring.notification;

import java.util.List;

import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.monitoring.domain.MonitoringInfoWrapper;

/**
 * Интерфейс уведомителей 
 * @author fmv
 *
 */
public interface Notifier {
		/**
		 * Уведомить 
		 * @param info Информация мониторинга
		 */
		public void notify(MonitoringInfoWrapper info);

		/**
		 * Уведомление списком
		 * @param infos - список информации мониторинга
		 */
		public void notify(List<MonitoringInfoWrapper> infos);

		/**
		 * Уровень важности при котором нужно отправлять сообщения этому уведомителю
		 * @return Уровень важности 
		 */
		public Severity getSendSeverity();
		
		/**
		 *  Уровень важности при котором нужно отправлять сообщения этому уведомителю
		 * @param severity - устанавливаемый уровень важности 
		 */
		public void setSendSeverity(Severity severity);
		
		/**
		 * Имя уведомителя
		 * @return
		 */
		public String getNotifierName();
}
