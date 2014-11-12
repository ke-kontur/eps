package ru.acs.monitoring.dao.jpa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.monitoring.dao.MessageKindDAO;
import ru.acs.monitoring.domain.MessageKind;
import ru.acs.monitoring.domain.MessageProcessingSystem;

/**
 * jpa реализация для MessageKindDAO
 * 
 * @author fmv
 * 
 */
public class MessageKindDAOJpa extends JpaBaseDAO<MessageKind> implements MessageKindDAO {

	@SuppressWarnings("unchecked")
	public MessageKind find(String code, MessageProcessingSystem system) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("system", system);
		params.put("code", code);
		List<MessageKind> result = getJpaTemplate().findByNamedParams(
				"from " + MessageKind.class.getName() + " as t where t.code=:code and t.system=:system", params);
		if (result != null && result.size() > 0) {
			return result.get(0);
		}
		return null;
	}

}
