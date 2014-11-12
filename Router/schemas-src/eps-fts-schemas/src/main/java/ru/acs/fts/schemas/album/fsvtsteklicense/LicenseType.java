
package ru.acs.fts.schemas.album.fsvtsteklicense;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ��������
 */
public class LicenseType extends DocumentBaseType
{
    private LocalDate beginDate;
    private LocalDate endDate;
    private String status;
    private String lastDateChange;

    /** 
     * Get the 'BeginDate' element value. ��������� ���� ������� �������� ��������
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. ��������� ���� ������� �������� ��������
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'EndDate' element value. �������� ���� ������� �������� ��������
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. �������� ���� ������� �������� ��������
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'Status' element value. ���������� � ������� ������� ��������: 1 - ���������, 2 - ������������, 3 - �������� ��������������, 4 - �������� ������������)
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. ���������� � ������� ������� ��������: 1 - ���������, 2 - ������������, 3 - �������� ��������������, 4 - �������� ������������)
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'LastDateChange' element value. ���������� � ���� � ������� ���������� ���������
     * 
     * @return value
     */
    public String getLastDateChange() {
        return lastDateChange;
    }

    /** 
     * Set the 'LastDateChange' element value. ���������� � ���� � ������� ���������� ���������
     * 
     * @param lastDateChange
     */
    public void setLastDateChange(String lastDateChange) {
        this.lastDateChange = lastDateChange;
    }
}
