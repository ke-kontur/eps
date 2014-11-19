
package ru.acs.fts.schemas.album.rtnrequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ����������/��������
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
     * Get the 'IssueTime' element value. ����� ������
     * 
     * @return value
     */
    public String getIssueTime() {
        return issueTime;
    }

    /** 
     * Set the 'IssueTime' element value. ����� ������
     * 
     * @param issueTime
     */
    public void setIssueTime(String issueTime) {
        this.issueTime = issueTime;
    }

    /** 
     * Get the 'PermitKind' element value. ��� ���������� ��/��������: 1 - ���; 2 - ���; 3 - ���; 4 - ���; 5 - ����������� ���������� ���; 6 - ����������� ���������� ��
     * 
     * @return value
     */
    public String getPermitKind() {
        return permitKind;
    }

    /** 
     * Set the 'PermitKind' element value. ��� ���������� ��/��������: 1 - ���; 2 - ���; 3 - ���; 4 - ���; 5 - ����������� ���������� ���; 6 - ����������� ���������� ��
     * 
     * @param permitKind
     */
    public void setPermitKind(String permitKind) {
        this.permitKind = permitKind;
    }

    /** 
     * Get the 'BeginDateTime' element value. ����/����� ������ ��������
     * 
     * @return value
     */
    public String getBeginDateTime() {
        return beginDateTime;
    }

    /** 
     * Set the 'BeginDateTime' element value. ����/����� ������ ��������
     * 
     * @param beginDateTime
     */
    public void setBeginDateTime(String beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    /** 
     * Get the 'EndDateTime' element value. ����/����� ��������� ��������
     * 
     * @return value
     */
    public String getEndDateTime() {
        return endDateTime;
    }

    /** 
     * Set the 'EndDateTime' element value. ����/����� ��������� ��������
     * 
     * @param endDateTime
     */
    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    /** 
     * Get the 'Status' element value. ������: 1 - �����������; 2 - �������������; 3 - �����������; 4 - ����� ���� ��������
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. ������: 1 - �����������; 2 - �������������; 3 - �����������; 4 - ����� ���� ��������
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'StopDateTime' element value. ����/����� ������������/�������������/ ����������� �������� ����������
     * 
     * @return value
     */
    public String getStopDateTime() {
        return stopDateTime;
    }

    /** 
     * Set the 'StopDateTime' element value. ����/����� ������������/�������������/ ����������� �������� ����������
     * 
     * @param stopDateTime
     */
    public void setStopDateTime(String stopDateTime) {
        this.stopDateTime = stopDateTime;
    }
}
