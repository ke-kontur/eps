
package ru.acs.fts.schemas.album.resolutiondestinationexamination;

import org.joda.time.LocalDate;

/** 
 * ���� ���������� ����������
 */
public class TermRealizationExaminationType
{
    private String termDay;
    private LocalDate beginDate;
    private LocalDate endDate;

    /** 
     * Get the 'TermDay' element value. ���� ���������� ���������� � ����
     * 
     * @return value
     */
    public String getTermDay() {
        return termDay;
    }

    /** 
     * Set the 'TermDay' element value. ���� ���������� ���������� � ����
     * 
     * @param termDay
     */
    public void setTermDay(String termDay) {
        this.termDay = termDay;
    }

    /** 
     * Get the 'BeginDate' element value. ���� ������ ���������� ����������
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. ���� ������ ���������� ����������
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'EndDate' element value. ���� ��������� ���������� ����������
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� ��������� ���������� ����������
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
