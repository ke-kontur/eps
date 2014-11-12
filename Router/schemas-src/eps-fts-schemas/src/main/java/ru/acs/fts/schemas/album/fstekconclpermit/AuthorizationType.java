
package ru.acs.fts.schemas.album.fstekconclpermit;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Разрешение/Заключение
 */
public class AuthorizationType extends DocumentBaseType
{
    private String status;

    /** 
     * Get the 'Status' element value. Состояние разрешения: 1 - действует, 2 - приостановлено, 3 - возобновлено действие
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Состояние разрешения: 1 - действует, 2 - приостановлено, 3 - возобновлено действие
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
