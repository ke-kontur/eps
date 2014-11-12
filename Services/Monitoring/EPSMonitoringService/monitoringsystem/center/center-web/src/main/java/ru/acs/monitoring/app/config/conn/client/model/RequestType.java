package ru.acs.monitoring.app.config.conn.client.model;

/**
 * Тип запроса.
 *
 * @author Алексей Селиванов
 */
public enum RequestType {

    WEB_SERVICE((byte) 0, "Веб-сервис"),
    MESSAGE_QUEUE((byte) 1, "MQ");

    RequestType(Byte value, String title) {
        this.value = value;
        this.title = title;
    }

    private final Byte value;
    private final String title;

    public Byte value() { return value; }

    public String title() { return title; }

    public static RequestType findByValue(Byte value) {
        if (value == null) return null;

        for (RequestType type : values())
            if (type.value().equals(value)) return type;

        return null;
    }

    @Override public String toString() { return title; }
}