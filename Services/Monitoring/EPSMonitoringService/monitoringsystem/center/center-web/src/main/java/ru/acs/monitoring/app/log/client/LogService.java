package ru.acs.monitoring.app.log.client;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import java.util.Map;
import ru.acs.monitoring.app.log.client.model.LogFilter;

/* TODO
 * Чтобы переделать сервис с использованием FilteringDataService, требуется
 * прямой доступ к базе через DataSource (см. логи в webconsole-transit).
 */

/**
 * Сервис протоколирования.
 *
 * @author Алексей Селиванов
 */
@RemoteServiceRelativePath("log")
public interface LogService extends RemoteService {

    /**
     * Производит поиск записи журнала по идентификатору и возвращает 
     * XML-данные этой записи или {@code null}, если такая запись не найдена.
     * 
     * @param  id идентификатор.
     * @return XML-данные заданной записи или {@code null}, если такая запись 
     *         не найдена.
     */
    String findXmlById(Long id);

    Map<Long, String> getConnectionOptions() throws Exception;

    /**
     * Выполняет фильтрованную выборку с возможностью указания дополнительных 
     * параметров.
     * 
     * @param  config конфигурация.
     * @param  filter фильтр.
     * @return выборка.
     */
    PagingLoadResult<ModelData> getData(PagingLoadConfig config, 
            LogFilter filter) throws Exception;

    /* TODO
     PagingLoadResult<ModelData> getData(FilteringLoadConfig config)
            throws Exception;
     */
}
