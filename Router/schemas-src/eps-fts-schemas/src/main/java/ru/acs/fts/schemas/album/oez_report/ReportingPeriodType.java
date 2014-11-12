
package ru.acs.fts.schemas.album.oez_report;

import org.joda.time.LocalDate;

/** 
 * Отчётный период
 */
public class ReportingPeriodType
{
    private LocalDate startDate;
    private LocalDate endDate;

    /** 
     * Get the 'StartDate' element value. Дата начала отчётного периода
     * 
     * @return value
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** 
     * Set the 'StartDate' element value. Дата начала отчётного периода
     * 
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /** 
     * Get the 'EndDate' element value. Дата окончания отчётного периода
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата окончания отчётного периода
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
