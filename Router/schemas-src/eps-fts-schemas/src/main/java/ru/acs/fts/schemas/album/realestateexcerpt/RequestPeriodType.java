
package ru.acs.fts.schemas.album.realestateexcerpt;

import org.joda.time.LocalDate;

/** 
 * ������ �������, �� ������� ���������� ������������ ��������
 */
public class RequestPeriodType
{
    private LocalDate startDate;
    private LocalDate endDate;

    /** 
     * Get the 'StartDate' element value. ������ �������
     * 
     * @return value
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** 
     * Set the 'StartDate' element value. ������ �������
     * 
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /** 
     * Get the 'EndDate' element value. ����� �������
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ����� �������
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
