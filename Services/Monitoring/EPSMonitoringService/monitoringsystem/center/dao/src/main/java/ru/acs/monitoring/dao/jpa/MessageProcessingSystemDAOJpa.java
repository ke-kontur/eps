package ru.acs.monitoring.dao.jpa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.monitoring.dao.MessageProcessingSystemDAO;
import ru.acs.monitoring.domain.Connection;
import ru.acs.monitoring.domain.MessageProcessingSystem;

public class MessageProcessingSystemDAOJpa extends JpaBaseDAO<MessageProcessingSystem> implements
		MessageProcessingSystemDAO {
	@SuppressWarnings("unchecked")
	public MessageProcessingSystem find(String name, Connection connection) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("connection", connection);
		params.put("name", name);
		List<MessageProcessingSystem> result = getJpaTemplate().findByNamedParams(
				"from " + MessageProcessingSystem.class.getName()
						+ " as t where t.name=:name and t.connection=:connection", params);
		if (result != null && result.size() > 0) {
			return result.get(0);
		}
		return null;
	}

	
	@SuppressWarnings("unchecked")
	public List<MessageProcessingSystem> find(Connection connection) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("connection", connection);
		return getJpaTemplate().findByNamedParams(
				"from " + MessageProcessingSystem.class.getName()
						+ " as t where t.connection=:connection", params);
	}
}
