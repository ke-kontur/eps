
package ru.acs.fts.schemas.album.rtnrequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Разрешение/карточка
 */
public class PermitInfoType extends DocumentBaseType
{
    private String issueTime;
    private String permitKind;
    private String beginDateTime;
    private String endDateTime;
    private String status;
    private String stopDateTime;

    /** 
     * Get the 'IssueTime' element value. Время выдачи
     * 
     * @return value
     */
    public String getIssueTime() {
        return issueTime;
    }

    /** 
     * Set the 'IssueTime' element value. Время выдачи
     * 
     * @param issueTime
     */
    public void setIssueTime(String issueTime) {
        this.issueTime = issueTime;
    }

    /** 
     * Get the 'PermitKind' element value. Тип разрешения ОГ/карточки: 1 - МНГ; 2 - МКП; 3 - МНП; 4 - МКГ; 5 - Специальное разрешение МАП; 6 - Специальное разрешение РФ
     * 
     * @return value
     */
    public String getPermitKind() {
        return permitKind;
    }

    /** 
     * Set the 'PermitKind' element value. Тип разрешения ОГ/карточки: 1 - МНГ; 2 - МКП; 3 - МНП; 4 - МКГ; 5 - Специальное разрешение МАП; 6 - Специальное разрешение РФ
     * 
     * @param permitKind
     */
    public void setPermitKind(String permitKind) {
        this.permitKind = permitKind;
    }

    /** 
     * Get the 'BeginDateTime' element value. Дата/время начала действия
     * 
     * @return value
     */
    public String getBeginDateTime() {
        return beginDateTime;
    }

    /** 
     * Set the 'BeginDateTime' element value. Дата/время начала действия
     * 
     * @param beginDateTime
     */
    public void setBeginDateTime(String beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    /** 
     * Get the 'EndDateTime' element value. Дата/время окончания действия
     * 
     * @return value
     */
    public String getEndDateTime() {
        return endDateTime;
    }

    /** 
     * Set the 'EndDateTime' element value. Дата/время окончания действия
     * 
     * @param endDateTime
     */
    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    /** 
     * Get the 'Status' element value. Статус: 1 - Действующий; 2 - Приостановлен; 3 - Аннулирован; 4 - Истек срок действия
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Статус: 1 - Действующий; 2 - Приостановлен; 3 - Аннулирован; 4 - Истек срок действия
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'StopDateTime' element value. Дата/время приостановки/аннулирования/ прекращения действия разрешения
     * 
     * @return value
     */
    public String getStopDateTime() {
        return stopDateTime;
    }

    /** 
     * Set the 'StopDateTime' element value. Дата/время приостановки/аннулирования/ прекращения действия разрешения
     * 
     * @param stopDateTime
     */
    public void setStopDateTime(String stopDateTime) {
        this.stopDateTime = stopDateTime;
    }
}
