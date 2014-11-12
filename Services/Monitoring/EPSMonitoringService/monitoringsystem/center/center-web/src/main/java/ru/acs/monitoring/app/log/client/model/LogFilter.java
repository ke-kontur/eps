package ru.acs.monitoring.app.log.client.model;

import com.extjs.gxt.ui.client.data.BeanModelTag;
import java.io.Serializable;
import java.util.Date;

/**
 * Фильтр протокола.
 *
 * @author Алексей Селиванов
 */
public class LogFilter implements BeanModelTag, Serializable {

    private Long connectionId;
    private Date updateDateFrom;
    private Date updateDateTo;
    private LogLevel level;

    /**
     * Возвращает название подключения.
     * @return название подключения.
     */
    public Long getConnectionId() {
        return connectionId;
    }

    /**
     * Устанавливает название подключения.
     * @param id название подключения.
     */
    public void setConnectionId(Long connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * Возвращает уровень важности события.
     * @return уровень важности события.
     */
    public LogLevel getLevel() { 
        return level;
    }

    /**
     * Устанавливает уровень важности события.
     * @param level уровень важности события.
     */
    public void setLevel(LogLevel level) { 
        this.level = level;
    }

    /**
     * Возвращает нижнюю грань даты обновления.
     * @return нижнюю грань даты обновления.
     */
    public Date getUpdateDateFrom() {
        return updateDateFrom;
    }

    /**
     * Устанавливает нижнюю грань даты обновления.
     * @param date нижняя грань даты обновления.
     */
    public void setUpdateDateFrom(Date date) {
        this.updateDateFrom = date;
    }

    /**
     * Возвращает верхнюю грань даты обновления.
     * @return верхнюю грань даты обновления.
     */
    public Date getUpdateDateTo() {
        return updateDateTo;
    }

    /**
     * Устанавливает верхнюю грань даты обновления.
     * @param date верхняя грань даты обновления.
     */
    public void setUpdateDateTo(Date date) {
        this.updateDateTo = date;
    }


}
