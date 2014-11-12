
package ru.acs.fts.schemas.album.permitcustprocessing;

import org.joda.time.LocalDate;

/** 
 * ������� � ��������  ���������� �� ����������� �������.
 */
public class DecisionTransferType
{
    private String numberDecision;
    private LocalDate dateDecision;

    /** 
     * Get the 'NumberDecision' element value. ����� ������� � ��������
     * 
     * @return value
     */
    public String getNumberDecision() {
        return numberDecision;
    }

    /** 
     * Set the 'NumberDecision' element value. ����� ������� � ��������
     * 
     * @param numberDecision
     */
    public void setNumberDecision(String numberDecision) {
        this.numberDecision = numberDecision;
    }

    /** 
     * Get the 'DateDecision' element value. ����
     * 
     * @return value
     */
    public LocalDate getDateDecision() {
        return dateDecision;
    }

    /** 
     * Set the 'DateDecision' element value. ����
     * 
     * @param dateDecision
     */
    public void setDateDecision(LocalDate dateDecision) {
        this.dateDecision = dateDecision;
    }
}
