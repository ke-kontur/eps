package ru.acs.monitoring.dao.jpa;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.monitoring.dao.MessageProcessingStatDAO;
import ru.acs.monitoring.domain.MessageKind;
import ru.acs.monitoring.domain.MessageProcessingStat;
import ru.acs.monitoring.domain.MessageProcessingSystem;

/**
 * jpa реализация MessageProcessingStatDAO
 * @author fmv
 *
 */
public class MessageProcessingStatDAOJpa extends JpaBaseDAO<MessageProcessingStat> implements MessageProcessingStatDAO {

	@SuppressWarnings("unchecked")
	public MessageProcessingStat find(MessageKind kind, Date date) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("messageKind", kind);
		params.put("statDate", date);
		List<MessageProcessingStat> result = getJpaTemplate().findByNamedParams(
				"from " + MessageProcessingStat.class.getName() + " as t where t.messageKind=:messageKind and t.statDate=:statDate", params);
		if (result != null && result.size() > 0) {
			return result.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<MessageProcessingStat> find(Date from, Date to, MessageProcessingSystem system) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("system", system);
		params.put("from", from);
		params.put("to", to);		
		return getJpaTemplate().findByNamedParams(
				"from " + MessageProcessingStat.class.getName() + " as t where t.statDate>=:from and t.statDate<=:to and system=:system", params);
	}
}
