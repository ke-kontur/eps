
package ru.acs.fts.schemas.album.realestateexcerpt;

import org.joda.time.LocalDate;

/** 
 * Период времени, за который необходимо предоставить сведения
 */
public class RequestPeriodType
{
    private LocalDate startDate;
    private LocalDate endDate;

    /** 
     * Get the 'StartDate' element value. Начало периода
     * 
     * @return value
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** 
     * Set the 'StartDate' element value. Начало периода
     * 
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /** 
     * Get the 'EndDate' element value. Конец периода
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Конец периода
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
