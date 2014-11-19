
package ru.acs.fts.schemas.album.resolutiondestinationexamination;

import org.joda.time.LocalDate;

/** 
 * Срок проведения экспертизы
 */
public class TermRealizationExaminationType
{
    private String termDay;
    private LocalDate beginDate;
    private LocalDate endDate;

    /** 
     * Get the 'TermDay' element value. Срок проведения экспертизы в днях
     * 
     * @return value
     */
    public String getTermDay() {
        return termDay;
    }

    /** 
     * Set the 'TermDay' element value. Срок проведения экспертизы в днях
     * 
     * @param termDay
     */
    public void setTermDay(String termDay) {
        this.termDay = termDay;
    }

    /** 
     * Get the 'BeginDate' element value. Дата начала проведения экспертизы
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. Дата начала проведения экспертизы
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'EndDate' element value. Дача окончания проведения экспертизы
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дача окончания проведения экспертизы
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
