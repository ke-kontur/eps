package ru.acs.monitoring.app.monitoring.conn.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import java.util.List;

import org.gwtwidgets.server.spring.GWTRequestMapping;

import ru.acs.monitoring.app.monitoring.conn.client.model.CommonInfo;

/**
 * Сервис мониторинга ресурсов.
 *
 * @author Алексей Селиванов
 * @author fmv
 */
@RemoteServiceRelativePath("../rpc/monitoring-connections")
@GWTRequestMapping("/monitoring-connections")
public interface MonitoringService extends RemoteService {

    /**
     * Возвращает актуальную информацию о состоянии ресурсов.
     * @return актуальную информацию о состоянии ресурсов.
     */
    List<CommonInfo> getActualInfo();

    /**
     * Возвращает XML-данные о состоянии ресурса по идентификатору.
     *
     * @param id идентификатор.
     * @return XML-данные о состоянии ресурса по идентификатору.
     */
    String getXmlByMonitoringInfId(Long id);
}
