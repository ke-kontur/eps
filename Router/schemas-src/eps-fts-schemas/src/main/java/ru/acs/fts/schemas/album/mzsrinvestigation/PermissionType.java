
package ru.acs.fts.schemas.album.mzsrinvestigation;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ����������
 */
public class PermissionType extends DocumentBaseType
{
    private String issuePeriod;
    private String status;
    private LocalDate endDate;

    /** 
     * Get the 'IssuePeriod' element value. ������ �������� ����������
     * 
     * @return value
     */
    public String getIssuePeriod() {
        return issuePeriod;
    }

    /** 
     * Set the 'IssuePeriod' element value. ������ �������� ����������
     * 
     * @param issuePeriod
     */
    public void setIssuePeriod(String issuePeriod) {
        this.issuePeriod = issuePeriod;
    }

    /** 
     * Get the 'Status' element value. ������ ����������: 1 - �����������, 2 - ����������������, 3 - ��������������, 4 - ��������� �� ��������������
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. ������ ����������: 1 - �����������, 2 - ����������������, 3 - ��������������, 4 - ��������� �� ��������������
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'EndDate' element value. ���� ������������� ����������
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� ������������� ����������
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
