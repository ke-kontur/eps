package ru.acs.monitoring.app.log.client.model;

/**
 * Уровень важности события.
 *
 * @author Алексей Селиванов
 */
public enum LogLevel {

    /**
     * Все события.
     */
    ALL("Все"),

    /**
     * Детализированный уровень протоколирования.
     */
    INFO("Детализированный уровень протоколирования"),

    /**
     * Предупреждения при обработке.
     */
    WARNING("Предупреждения при обработке"),

    /**
     * Ошибки обработки.
     */
    ERROR("Ошибки обработки");

    private final String title;

    LogLevel(String title) { this.title = title; }

    /**
     * Возвращает описание уровня важности.
     * @return описание уровня важности.
     */
    public String description() { return title; }

    /** {@inheritDoc} */
    @Override public String toString() { return title; }
}
