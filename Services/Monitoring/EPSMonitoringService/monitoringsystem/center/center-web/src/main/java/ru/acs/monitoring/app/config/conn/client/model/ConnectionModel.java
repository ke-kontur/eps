package ru.acs.monitoring.app.config.conn.client.model;

import com.extjs.gxt.ui.client.data.BeanModelTag;
import java.io.Serializable;

/**
 * Модель подключения, адаптирует
 * {@link ru.acs.monitoring.domain.Connection Connection}.
 *
 * @author Алексей Селиванов
 * @see ru.acs.monitoring.domain.Connection
 */
public class ConnectionModel implements Serializable, BeanModelTag {

    private Long id;
    private String name;
    private RequestType requestType;
    private String requestAddress;
    private boolean active;
    private boolean display;
    private boolean useCache;

    /**
     * Возвращает идентификатор.
     * @return идентификатор.
     */
    public Long getId() { return id; }

    /**
     * Устанваливает идентификатор.
     * @param id идентификатор.
     */
    public void setId(Long id) { this.id = id; }

    /**
     * Возвращает название.
     * @return название.
     */
    public String getName() { return name; }

    /**
     * Устанавливает название.
     * @param name название.
     */
    public void setName(String name) { this.name = name; }

    /**
     * Возвращает тип запроса.
     * @return тип запроса.
     */
    public RequestType getRequestType() { return requestType; }

    /**
     * Устанавливает тип запроса.
     * @param requestType тип запроса.
     */
    public void setRequestType(RequestType requestType) 
    { this.requestType = requestType; }

    /**
     * Возвращает адрес запроса.
     * @return адрес запроса.
     */
    public String getRequestAddress() { return requestAddress; }

    /**
     * Устанавливает адрес запроса.
     * @param requestUrl адрес запроса.
     */
    public void setRequestAddress(String url)
    { this.requestAddress = url; }

    /**
     * Возвращает {@code true} тогда и только тогда, когда следует отображать
     * информацию мониторинга.
     *
     * @return {@code true} тогда и только тогда, когда следует отображать
     *         информацию мониторинга.
     */
    public boolean isDisplay() { return display; }

    /**
     * Устанавливает флаг отображения информации мониторинга:
     * {@code true}&nbsp;&mdash; отображать, {@code false}&nbsp;&mdash; нет.
     *
     * @param display флаг отображение информации мониторинга.
     */
    public void setDisplay(boolean display) { this.display = display; }

    /**
     * Возвращает {@code true} тогда и только тогда, когда подключение активно.
     * @return {@code true} тогда и только тогда, когда подключение активно.
     */
    public boolean isActive() { return active; }

    /**
     * Устанавливает флаг активности данного подключения.
     * @param active флаг активности данного подключения.
     */
    public void setActive(boolean active) { this.active = active; }

    /**
     * Выполняет валидацию и возвращает {@code true} в случае успешной
     * проверки.
     *
     * @return {@code true} в случае успешного прохождения валидации.
     */
    public boolean isValid() {
        if (name == null || "".equals(name)) return false;
        if (requestType == null) return false;

        return true;
    }
    
    /**
	 * Возвращает {@code true} тогда и только тогда, когда следует запрашивать
	 * с клиента скэшированную информацию
	 * 
	 * @return {@code true} тогда и только тогда, когда следует запрашивать
	 * с клиента скэшированную информацию.
	 */
    public boolean isUseCache() { return useCache; }

    /**
	 * Указывает, следует запрашивать с клиента скэшированную информацию
	 * 
	 * @param useCache
	 *            флаг запроса с клиента скэшированной информации
	 */
    public void setUseCache(boolean useCache) { this.useCache = useCache; }
}
