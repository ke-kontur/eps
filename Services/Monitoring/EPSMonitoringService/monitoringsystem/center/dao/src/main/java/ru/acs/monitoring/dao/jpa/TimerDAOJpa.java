package ru.acs.monitoring.dao.jpa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.monitoring.dao.TimerDAO;
import ru.acs.monitoring.domain.Timer;

/**
 * JPA раелизация {@link TimerDAO} 
 * @author fmv
 *
 */
public class TimerDAOJpa extends JpaBaseDAO<Timer> implements TimerDAO {
	final static Logger log= LoggerFactory.getLogger(TimerDAOJpa.class); 
	
	/*
	 * (non-Javadoc)
	 * @see ru.acs.monitoring.dao.TimerDAO#findByRequestID(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public Timer findByRequestID(String requestId) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("requestId", requestId);
		List<Timer> result = getJpaTemplate().findByNamedParams(
				"from " + Timer.class.getName() + " as t where t.requestId = :requestId", params);
		if (result != null && result.size() > 0) {
			return result.get(0);
		}
		return null;
	}

}
