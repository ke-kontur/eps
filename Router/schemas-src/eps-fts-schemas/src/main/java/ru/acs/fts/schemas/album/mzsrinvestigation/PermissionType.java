
package ru.acs.fts.schemas.album.mzsrinvestigation;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Разрешение
 */
public class PermissionType extends DocumentBaseType
{
    private String issuePeriod;
    private String status;
    private LocalDate endDate;

    /** 
     * Get the 'IssuePeriod' element value. Период действия разрешения
     * 
     * @return value
     */
    public String getIssuePeriod() {
        return issuePeriod;
    }

    /** 
     * Set the 'IssuePeriod' element value. Период действия разрешения
     * 
     * @param issuePeriod
     */
    public void setIssuePeriod(String issuePeriod) {
        this.issuePeriod = issuePeriod;
    }

    /** 
     * Get the 'Status' element value. Статус разрешения: 1 - Действующее, 2 - Приостановленное, 3 - Аннулированное, 4 - Находится на переоформлении
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Статус разрешения: 1 - Действующее, 2 - Приостановленное, 3 - Аннулированное, 4 - Находится на переоформлении
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'EndDate' element value. Дата аннулирования разрешения
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата аннулирования разрешения
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
