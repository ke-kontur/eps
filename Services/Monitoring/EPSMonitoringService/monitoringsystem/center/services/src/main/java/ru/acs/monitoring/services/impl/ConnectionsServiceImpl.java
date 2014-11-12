package ru.acs.monitoring.services.impl;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.acs.monitoring.dao.ConnectionDAO;
import ru.acs.monitoring.domain.Connection;
import ru.acs.monitoring.services.ConnectionsService;

/**
 * Сервис управления соединениями с локальными агентами.
 *
 * @author Алексей Селиванов
 * @see    ru.acs.monitoring.domain.Connection
 */
public class ConnectionsServiceImpl implements ConnectionsService {

    private ConnectionDAO dao;

    /** {@inheritDoc} */
    public Connection findById(Long id) {
    return dao.findById(id);
    }

    /** {@inheritDoc} */
    @Transactional(propagation=Propagation.REQUIRED)
    public Collection<Connection> getAll() {
    	Collection<Connection> all = dao.findAll();
    	for (Connection conn: all)
    		if (conn.getUseCache() == null)
    			conn.setUseCache(false);
    	return all;
    }
    
    /** {@inheritDoc} */
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public void remove(Connection connection) {
        dao.remove(connection);
    }

    /** {@inheritDoc} */
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public void save(Connection connection) {
        dao.save(connection);
    }

    /** {@inheritDoc} */
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public void update(Connection connecton) {
        dao.update(connecton);
    }

    /** {@inheritDoc} */
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public void replaceAllWith(Collection<Connection> connections) {
        Collection<Connection> persisted = dao.findAll();

        // Update already persisted entities & persist news
        for (Connection connection : connections) {
            if (persisted.contains(connection)) {
                dao.update(connection);
            } else {
                dao.save(connection);
            }
        }

        // Delete remaining persisted connections        
        persisted.removeAll(connections);

        for (Connection connection : persisted)
            dao.remove(connection);
    }

    /** {@inheritDoc} */
    public boolean contains(Connection connection) {
    return dao.contains(connection);
    }

// Configuration
    
    /**
     * Устанавливает объект доступа к хранилищу соединений.
     *
     * @param dao объект доступа к хранилищу соединений.
     */
    @Autowired public void setConnectionDAO(ConnectionDAO dao) {
        this.dao = dao;
    }
}
