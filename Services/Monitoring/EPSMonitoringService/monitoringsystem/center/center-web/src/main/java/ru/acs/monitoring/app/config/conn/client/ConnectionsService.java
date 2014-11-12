package ru.acs.monitoring.app.config.conn.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import java.util.Collection;
import java.util.List;

import org.gwtwidgets.server.spring.GWTRequestMapping;

import ru.acs.monitoring.app.config.conn.client.model.ConnectionModel;


/**
 * Сервис настройки подключений.
 *
 * @author Алексей Селиванов
 */
@GWTRequestMapping("/config-connections")
@RemoteServiceRelativePath("../rpc/config-connections")
public interface ConnectionsService extends RemoteService {

    /**
     * Возвращает соединения.
     * @return соединения.
     */
    List<ConnectionModel> getConnections();

    /**
     * Заменяет все имеющиеся подключения на заданные.
     * @param models подключения.
     */
    boolean replaceConnections(Collection<ConnectionModel> models);
}
