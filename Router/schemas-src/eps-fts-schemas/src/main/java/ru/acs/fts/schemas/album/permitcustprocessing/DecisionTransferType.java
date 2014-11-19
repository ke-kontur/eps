
package ru.acs.fts.schemas.album.permitcustprocessing;

import org.joda.time.LocalDate;

/** 
 * Решение о передаче  разрешения на переработку товаров.
 */
public class DecisionTransferType
{
    private String numberDecision;
    private LocalDate dateDecision;

    /** 
     * Get the 'NumberDecision' element value. Номер решения о передаче
     * 
     * @return value
     */
    public String getNumberDecision() {
        return numberDecision;
    }

    /** 
     * Set the 'NumberDecision' element value. Номер решения о передаче
     * 
     * @param numberDecision
     */
    public void setNumberDecision(String numberDecision) {
        this.numberDecision = numberDecision;
    }

    /** 
     * Get the 'DateDecision' element value. Дата
     * 
     * @return value
     */
    public LocalDate getDateDecision() {
        return dateDecision;
    }

    /** 
     * Set the 'DateDecision' element value. Дата
     * 
     * @param dateDecision
     */
    public void setDateDecision(LocalDate dateDecision) {
        this.dateDecision = dateDecision;
    }
}
