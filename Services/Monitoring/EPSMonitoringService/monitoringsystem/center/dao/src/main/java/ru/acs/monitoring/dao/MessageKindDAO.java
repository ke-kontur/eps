package ru.acs.monitoring.dao;

import ru.acs.monitoring.domain.MessageKind;
import ru.acs.monitoring.domain.MessageProcessingSystem;

/**
 * dao для работы с MessageKind
 * @author fmv
 *
 */
public interface MessageKindDAO extends BaseDAO<MessageKind> {
		public MessageKind find(String code,MessageProcessingSystem system);
}
