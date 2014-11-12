package ru.acs.monitoring.dao.jpa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.monitoring.dao.ConnectionDAO;
import ru.acs.monitoring.domain.Connection;

/**
 * JPA реализация ConnectionDAO
 * @author fmv
 *
 */
public class ConnectionDAOJpa extends JpaBaseDAO<Connection> implements ConnectionDAO{

	/*
	 * (non-Javadoc)
	 * @see ru.acs.monitoring.dao.ConnectionDAO#findByWsUrl(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public Connection findByWsUrl(String wsUrl) {
		Map<String, String> params = new HashMap<String, String>();
        params.put("wsUrl", wsUrl);
        List<Connection> result = getJpaTemplate().findByNamedParams("from Connection as c where c.wsUrl = :wsUrl", params);
        if (result!=null && result.size()>0){
        	return result.get(0);
        }	
		return null;
	}
		
}
