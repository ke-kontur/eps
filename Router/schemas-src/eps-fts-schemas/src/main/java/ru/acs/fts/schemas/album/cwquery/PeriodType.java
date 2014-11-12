
package ru.acs.fts.schemas.album.cwquery;

import org.joda.time.LocalDate;

/** 
 * Период, за который запрашиваются документы
 */
public class PeriodType
{
    private LocalDate periodBegin;
    private LocalDate periodEnd;

    /** 
     * Get the 'PeriodBegin' element value. Начало периода
     * 
     * @return value
     */
    public LocalDate getPeriodBegin() {
        return periodBegin;
    }

    /** 
     * Set the 'PeriodBegin' element value. Начало периода
     * 
     * @param periodBegin
     */
    public void setPeriodBegin(LocalDate periodBegin) {
        this.periodBegin = periodBegin;
    }

    /** 
     * Get the 'PeriodEnd' element value. Окончание периода
     * 
     * @return value
     */
    public LocalDate getPeriodEnd() {
        return periodEnd;
    }

    /** 
     * Set the 'PeriodEnd' element value. Окончание периода
     * 
     * @param periodEnd
     */
    public void setPeriodEnd(LocalDate periodEnd) {
        this.periodEnd = periodEnd;
    }
}
