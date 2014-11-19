
package ru.acs.fts.schemas.album.do2reportin;

import org.joda.time.LocalDate;

/** 
 * �������� � ����� �������� �������
 */
public class DO2KeepingLimitType
{
    private LocalDate acceptDate;
    private String acceptTime;
    private String storingDateType;
    private LocalDate deadLineDate;

    /** 
     * Get the 'AcceptDate' element value. ���� ������ ������ �� �������� 
     * 
     * @return value
     */
    public LocalDate getAcceptDate() {
        return acceptDate;
    }

    /** 
     * Set the 'AcceptDate' element value. ���� ������ ������ �� �������� 
     * 
     * @param acceptDate
     */
    public void setAcceptDate(LocalDate acceptDate) {
        this.acceptDate = acceptDate;
    }

    /** 
     * Get the 'AcceptTime' element value. ����� ������ ������ �� ��������
     * 
     * @return value
     */
    public String getAcceptTime() {
        return acceptTime;
    }

    /** 
     * Set the 'AcceptTime' element value. ����� ������ ������ �� ��������
     * 
     * @param acceptTime
     */
    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }

    /** 
     * Get the 'StoringDateType' element value. ��� ����� ��������  �� �����������
     * 
     * @return value
     */
    public String getStoringDateType() {
        return storingDateType;
    }

    /** 
     * Set the 'StoringDateType' element value. ��� ����� ��������  �� �����������
     * 
     * @param storingDateType
     */
    public void setStoringDateType(String storingDateType) {
        this.storingDateType = storingDateType;
    }

    /** 
     * Get the 'DeadLineDate' element value. ���� ��������� ����� ��������
     * 
     * @return value
     */
    public LocalDate getDeadLineDate() {
        return deadLineDate;
    }

    /** 
     * Set the 'DeadLineDate' element value. ���� ��������� ����� ��������
     * 
     * @param deadLineDate
     */
    public void setDeadLineDate(LocalDate deadLineDate) {
        this.deadLineDate = deadLineDate;
    }
}
