package ru.acs.monitoring.dao;

import java.util.Date;
import java.util.List;

import ru.acs.monitoring.domain.MessageKind;
import ru.acs.monitoring.domain.MessageProcessingStat;
import ru.acs.monitoring.domain.MessageProcessingSystem;

/**
 * интерфес дао для MessageProcessingStat
 * @author fmv
 *
 */
public interface MessageProcessingStatDAO extends BaseDAO<MessageProcessingStat> {
		/**
		 * Получение статистики
		 * @param kind - тип сообщения
		 * @param date - дата статистики
		 * @return
		 */
		public MessageProcessingStat find(MessageKind kind, Date date);
		
		/**
		 * Получение списка статистики
		 * @param from - с даты
		 * @param to - по дату
		 * @param system - подсистема
		 * @return
		 */
		public List<MessageProcessingStat> find(Date from, Date to, MessageProcessingSystem system);
}
