package ru.acs.monitoring.app.config.conn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.RollbackException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ru.acs.monitoring.app.config.conn.client.ConnectionsService;
import ru.acs.monitoring.app.config.conn.client.model.ConnectionModel;
import ru.acs.monitoring.app.config.conn.client.model.RequestType;
import ru.acs.monitoring.domain.Connection;

/**
 * Реализация {@code ConnectionSettingService}.
 *
 * @author Алексей Селиванов
 */
public class ConnectionsServiceImpl        
        implements ConnectionsService {

    private static final Logger LOG = LoggerFactory.getLogger(ConnectionsServiceImpl.class);

    private ru.acs.monitoring.services.ConnectionsService service;

    /** {@inheritDoc} */
    public List<ConnectionModel> getConnections() {
        Collection<Connection> connections = service.getAll();
        List<ConnectionModel>  models      =
                new ArrayList<ConnectionModel>(connections.size());

        for (Connection connection : connections) models.add(convert(connection));

        return models;
    }

    /** {@inheritDoc} */
    public boolean replaceConnections(Collection<ConnectionModel> models) {
        Collection<Connection>
        connections = new ArrayList<Connection>(models.size());

        for (ConnectionModel model : models) connections.add(convert(model));

        try {
            service.replaceAllWith(connections);
            return true;
        } catch (RollbackException ex) {
        LOG.error("Exception while commiting changes.", ex);
            return false;
        }
    }

    // Connection -> ConnectionModel
    private ConnectionModel convert(Connection connection) {
        ConnectionModel model = new ConnectionModel();

        model.setId(connection.getId());
        model.setName(connection.getName());

        RequestType requestType = RequestType.findByValue(connection.getRequestType());
        model.setRequestType(requestType);
        model.setRequestAddress(requestType == RequestType.WEB_SERVICE ?
            connection.getWsUrl() :
            connection.getRoutingAddr());
        
        model.setActive(connection.isActive());
        model.setDisplay(connection.isDisplay());
        model.setUseCache(connection.getUseCache());

        return model;
    }

    // ConnectionModel -> Connection
    private Connection convert(ConnectionModel model) {
        Connection connection = new Connection();

        connection.setId(model.getId());
        connection.setName(model.getName());

        switch (model.getRequestType()) {
            case WEB_SERVICE:
                connection.setWsUrl(model.getRequestAddress());
                break;
            case MESSAGE_QUEUE:
                connection.setRoutingAddr(model.getRequestAddress());
        }
        connection.setRequestType(model.getRequestType().value());
        connection.setActive(model.isActive());
        connection.setDisplay(model.isDisplay());
        connection.setUseCache(model.isUseCache());

        return connection;
    }
    @Autowired
	public void setService(ru.acs.monitoring.services.ConnectionsService service) {
		this.service = service;
	}

}
