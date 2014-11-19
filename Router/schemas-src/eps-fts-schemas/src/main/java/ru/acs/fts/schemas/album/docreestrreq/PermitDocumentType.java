
package ru.acs.fts.schemas.album.docreestrreq;

import org.joda.time.LocalDate;

/** 
 * ����������
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
     * Get the 'TransitPermitKind' element value. ��� ��������������� ���������
     * 
     * @return value
     */
    public String getTransitPermitKind() {
        return transitPermitKind;
    }

    /** 
     * Set the 'TransitPermitKind' element value. ��� ��������������� ���������
     * 
     * @param transitPermitKind
     */
    public void setTransitPermitKind(String transitPermitKind) {
        this.transitPermitKind = transitPermitKind;
    }

    /** 
     * Get the 'PermitNumber' element value. ����� ����������
     * 
     * @return value
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /** 
     * Set the 'PermitNumber' element value. ����� ����������
     * 
     * @param permitNumber
     */
    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }

    /** 
     * Get the 'IssueDateTime' element value. ����/����� ������
     * 
     * @return value
     */
    public String getIssueDateTime() {
        return issueDateTime;
    }

    /** 
     * Set the 'IssueDateTime' element value. ����/����� ������
     * 
     * @param issueDateTime
     */
    public void setIssueDateTime(String issueDateTime) {
        this.issueDateTime = issueDateTime;
    }

    /** 
     * Get the 'Duration' element value. ���� ��������� ��������
     * 
     * @return value
     */
    public String getDuration() {
        return duration;
    }

    /** 
     * Set the 'Duration' element value. ���� ��������� ��������
     * 
     * @param duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /** 
     * Get the 'StopCancelDate' element value. ���� ���������������, �������������
     * 
     * @return value
     */
    public LocalDate getStopCancelDate() {
        return stopCancelDate;
    }

    /** 
     * Set the 'StopCancelDate' element value. ���� ���������������, �������������
     * 
     * @param stopCancelDate
     */
    public void setStopCancelDate(LocalDate stopCancelDate) {
        this.stopCancelDate = stopCancelDate;
    }

    /** 
     * Get the 'Status' element value. ������: 1 - ACTIVE - ���������; 2 - EXPIRED - ����� ���� ��������; 3 - SUSPENDED - ��������������; 4 - CANCELED - ������������
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. ������: 1 - ACTIVE - ���������; 2 - EXPIRED - ����� ���� ��������; 3 - SUSPENDED - ��������������; 4 - CANCELED - ������������
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
