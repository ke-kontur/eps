
package ru.acs.fts.schemas.album.resulttk;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения об оплате штрафа с ПК
 */
public class PostPenaltyType
{
    private String isPaid;
    private String violatorID;
    private String penaltySum;
    private DocumentBaseType resolution;
    private PenaltyType penalty;

    /** 
     * Get the 'IsPaid' element value. Отметка об оплате
     * 
     * @return value
     */
    public String getIsPaid() {
        return isPaid;
    }

    /** 
     * Set the 'IsPaid' element value. Отметка об оплате
     * 
     * @param isPaid
     */
    public void setIsPaid(String isPaid) {
        this.isPaid = isPaid;
    }

    /** 
     * Get the 'ViolatorID' element value. Идентификатор записи в реестре нарушителей
     * 
     * @return value
     */
    public String getViolatorID() {
        return violatorID;
    }

    /** 
     * Set the 'ViolatorID' element value. Идентификатор записи в реестре нарушителей
     * 
     * @param violatorID
     */
    public void setViolatorID(String violatorID) {
        this.violatorID = violatorID;
    }

    /** 
     * Get the 'PenaltySum' element value. Сумма штрафа в рублях
     * 
     * @return value
     */
    public String getPenaltySum() {
        return penaltySum;
    }

    /** 
     * Set the 'PenaltySum' element value. Сумма штрафа в рублях
     * 
     * @param penaltySum
     */
    public void setPenaltySum(String penaltySum) {
        this.penaltySum = penaltySum;
    }

    /** 
     * Get the 'Resolution' element value. Постановление
     * 
     * @return value
     */
    public DocumentBaseType getResolution() {
        return resolution;
    }

    /** 
     * Set the 'Resolution' element value. Постановление
     * 
     * @param resolution
     */
    public void setResolution(DocumentBaseType resolution) {
        this.resolution = resolution;
    }

    /** 
     * Get the 'Penalty' element value. Сведения об оплате штрафа
     * 
     * @return value
     */
    public PenaltyType getPenalty() {
        return penalty;
    }

    /** 
     * Set the 'Penalty' element value. Сведения об оплате штрафа
     * 
     * @param penalty
     */
    public void setPenalty(PenaltyType penalty) {
        this.penalty = penalty;
    }
}
