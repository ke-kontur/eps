
package ru.acs.fts.schemas.album.commercialact;

import org.joda.time.LocalDate;

/** 
 * �������� �� ����
 */
public class ActDetailsType
{
    private String actName;
    private String actNumber;
    private LocalDate actDate;
    private String actOrderNumber;

    /** 
     * Get the 'ActName' element value. ������������ ���� (���, ������������ ���, ��� ����� ����� � �.�.)
     * 
     * @return value
     */
    public String getActName() {
        return actName;
    }

    /** 
     * Set the 'ActName' element value. ������������ ���� (���, ������������ ���, ��� ����� ����� � �.�.)
     * 
     * @param actName
     */
    public void setActName(String actName) {
        this.actName = actName;
    }

    /** 
     * Get the 'ActNumber' element value. ����� ����
     * 
     * @return value
     */
    public String getActNumber() {
        return actNumber;
    }

    /** 
     * Set the 'ActNumber' element value. ����� ����
     * 
     * @param actNumber
     */
    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }

    /** 
     * Get the 'ActDate' element value. ���� ����
     * 
     * @return value
     */
    public LocalDate getActDate() {
        return actDate;
    }

    /** 
     * Set the 'ActDate' element value. ���� ����
     * 
     * @param actDate
     */
    public void setActDate(LocalDate actDate) {
        this.actDate = actDate;
    }

    /** 
     * Get the 'ActOrderNumber' element value. ���������� ����� ���� (��� ������� ������� � �������), ������������� � ��������� ������� ���������� ������ � ��������, ������� � ������� ������ ������
     * 
     * @return value
     */
    public String getActOrderNumber() {
        return actOrderNumber;
    }

    /** 
     * Set the 'ActOrderNumber' element value. ���������� ����� ���� (��� ������� ������� � �������), ������������� � ��������� ������� ���������� ������ � ��������, ������� � ������� ������ ������
     * 
     * @param actOrderNumber
     */
    public void setActOrderNumber(String actOrderNumber) {
        this.actOrderNumber = actOrderNumber;
    }
}
