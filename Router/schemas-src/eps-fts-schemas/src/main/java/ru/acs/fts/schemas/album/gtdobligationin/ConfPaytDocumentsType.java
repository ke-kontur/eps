
package ru.acs.fts.schemas.album.gtdobligationin;

/** 
 * Документы, подтверждающие уплату таможенных платежей.
 */
public class ConfPaytDocumentsType
{
    private String payDocument;
    private String notRequiredPayment;
    private ObligDecisionType obligDecision;

    /** 
     * Get the 'PayDocument' element value. Признак принятия обеспечения уплаты таможенных платежей
     * 
     * @return value
     */
    public String getPayDocument() {
        return payDocument;
    }

    /** 
     * Set the 'PayDocument' element value. Признак принятия обеспечения уплаты таможенных платежей
     * 
     * @param payDocument
     */
    public void setPayDocument(String payDocument) {
        this.payDocument = payDocument;
    }

    /** 
     * Get the 'NotRequiredPayment' element value. Признак того, что обеспечение уплаты таможенных платежей не требуется
     * 
     * @return value
     */
    public String getNotRequiredPayment() {
        return notRequiredPayment;
    }

    /** 
     * Set the 'NotRequiredPayment' element value. Признак того, что обеспечение уплаты таможенных платежей не требуется
     * 
     * @param notRequiredPayment
     */
    public void setNotRequiredPayment(String notRequiredPayment) {
        this.notRequiredPayment = notRequiredPayment;
    }

    /** 
     * Get the 'ObligDecision' element value. Решение по выпуску товаров
     * 
     * @return value
     */
    public ObligDecisionType getObligDecision() {
        return obligDecision;
    }

    /** 
     * Set the 'ObligDecision' element value. Решение по выпуску товаров
     * 
     * @param obligDecision
     */
    public void setObligDecision(ObligDecisionType obligDecision) {
        this.obligDecision = obligDecision;
    }
}
