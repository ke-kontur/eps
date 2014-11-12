package ru.acs.monitoring.app.monitoring.conn.client.model;

import com.extjs.gxt.ui.client.data.BaseModel;
import java.util.Date;

/**
 * Информация об обновлении.
 *
 * @author Алексей Селиванов
 */
public class UpdateInfo extends BaseModel {

    public UpdateInfo(Date lastUpdate, long timeToUpdate) {
    set("lastUpdate", lastUpdate);
    set("timeToUpdate", timeToUpdate);
    }

    public UpdateInfo() {
    this(null, 0);
    }

    public Date getLastUpdate() { return get("lastUpdate"); }

    public void setLastUpdate(Date date) { set("lastUpdate", date); }

    public long getTimeToUpdate() {
        Long timeToUpdate = get("timeToUpdate");
        return (timeToUpdate == null) ? 0 : timeToUpdate;
    }

    public void setTimeToUpdate(long timeToUpdate) {
        set("timeToUpdate", timeToUpdate);
    }
}
