
package ru.acs.fts.schemas.album.rspconfirmationtarget;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Подтверждение
 */
public class ConfirmationType extends DocumentBaseType
{
    private String status;
    private String lastChangeDate;

    /** 
     * Get the 'Status' element value. Текущий статус подтверждения: 1 - Действующее, 2 - Приостановленное, 3 - Аннулированное, 4 - Находится на оформлении
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Текущий статус подтверждения: 1 - Действующее, 2 - Приостановленное, 3 - Аннулированное, 4 - Находится на оформлении
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'LastChangeDate' element value. Информация о дате и времени последнего изменения
     * 
     * @return value
     */
    public String getLastChangeDate() {
        return lastChangeDate;
    }

    /** 
     * Set the 'LastChangeDate' element value. Информация о дате и времени последнего изменения
     * 
     * @param lastChangeDate
     */
    public void setLastChangeDate(String lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }
}
