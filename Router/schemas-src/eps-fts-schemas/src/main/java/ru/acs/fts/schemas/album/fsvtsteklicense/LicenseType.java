
package ru.acs.fts.schemas.album.fsvtsteklicense;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о лицензии
 */
public class LicenseType extends DocumentBaseType
{
    private LocalDate beginDate;
    private LocalDate endDate;
    private String status;
    private String lastDateChange;

    /** 
     * Get the 'BeginDate' element value. Начальная дата периода действия лицензии
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. Начальная дата периода действия лицензии
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'EndDate' element value. Конечная дата периода действия лицензии
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Конечная дата периода действия лицензии
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'Status' element value. Информация о текущем статусе лицензии: 1 - действует, 2 - аннулирована, 3 - действие приостановлено, 4 - действие возобновлено)
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Информация о текущем статусе лицензии: 1 - действует, 2 - аннулирована, 3 - действие приостановлено, 4 - действие возобновлено)
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'LastDateChange' element value. Информация о дате и времени последнего изменения
     * 
     * @return value
     */
    public String getLastDateChange() {
        return lastDateChange;
    }

    /** 
     * Set the 'LastDateChange' element value. Информация о дате и времени последнего изменения
     * 
     * @param lastDateChange
     */
    public void setLastDateChange(String lastDateChange) {
        this.lastDateChange = lastDateChange;
    }
}
