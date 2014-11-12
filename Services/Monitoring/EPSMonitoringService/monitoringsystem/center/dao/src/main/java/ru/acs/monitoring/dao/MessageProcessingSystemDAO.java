package ru.acs.monitoring.dao;

import java.util.List;

import ru.acs.monitoring.domain.Connection;
import ru.acs.monitoring.domain.MessageProcessingSystem;

public interface MessageProcessingSystemDAO extends BaseDAO<MessageProcessingSystem> {
	public MessageProcessingSystem find(String name,Connection connection);
	public List<MessageProcessingSystem> find(Connection connection);
}
