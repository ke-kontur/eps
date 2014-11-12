
package ru.acs.fts.schemas.album.docreestrreq;

import org.joda.time.LocalDate;

/** 
 * Разрешение
 */
public class PermitDocumentType
{
    private String transitPermitKind;
    private String permitNumber;
    private String issueDateTime;
    private String duration;
    private LocalDate stopCancelDate;
    private String status;

    /** 
     * Get the 'TransitPermitKind' element value. Вид разрешительного документа
     * 
     * @return value
     */
    public String getTransitPermitKind() {
        return transitPermitKind;
    }

    /** 
     * Set the 'TransitPermitKind' element value. Вид разрешительного документа
     * 
     * @param transitPermitKind
     */
    public void setTransitPermitKind(String transitPermitKind) {
        this.transitPermitKind = transitPermitKind;
    }

    /** 
     * Get the 'PermitNumber' element value. Номер разрешения
     * 
     * @return value
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /** 
     * Set the 'PermitNumber' element value. Номер разрешения
     * 
     * @param permitNumber
     */
    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }

    /** 
     * Get the 'IssueDateTime' element value. Дата/время выдачи
     * 
     * @return value
     */
    public String getIssueDateTime() {
        return issueDateTime;
    }

    /** 
     * Set the 'IssueDateTime' element value. Дата/время выдачи
     * 
     * @param issueDateTime
     */
    public void setIssueDateTime(String issueDateTime) {
        this.issueDateTime = issueDateTime;
    }

    /** 
     * Get the 'Duration' element value. Дата окончания действия
     * 
     * @return value
     */
    public String getDuration() {
        return duration;
    }

    /** 
     * Set the 'Duration' element value. Дата окончания действия
     * 
     * @param duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /** 
     * Get the 'StopCancelDate' element value. Дата приостановления, аннулирования
     * 
     * @return value
     */
    public LocalDate getStopCancelDate() {
        return stopCancelDate;
    }

    /** 
     * Set the 'StopCancelDate' element value. Дата приостановления, аннулирования
     * 
     * @param stopCancelDate
     */
    public void setStopCancelDate(LocalDate stopCancelDate) {
        this.stopCancelDate = stopCancelDate;
    }

    /** 
     * Get the 'Status' element value. Статус: 1 - ACTIVE - Действует; 2 - EXPIRED - Истек срок действия; 3 - SUSPENDED - Приостановлено; 4 - CANCELED - Аннулировано
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Статус: 1 - ACTIVE - Действует; 2 - EXPIRED - Истек срок действия; 3 - SUSPENDED - Приостановлено; 4 - CANCELED - Аннулировано
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
