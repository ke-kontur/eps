
package ru.acs.fts.schemas.album.tpo;

/** 
 * ѕодробности уплаты
 */
public class PaymentDetailsType
{
    private String factPaidAmount;
    private String paymentMethodCode;
    private PresentedDocumentType paymentDocument;

    /** 
     * Get the 'FactPaidAmount' element value. —ведени€ о фактически уплаченной сумме
     * 
     * @return value
     */
    public String getFactPaidAmount() {
        return factPaidAmount;
    }

    /** 
     * Set the 'FactPaidAmount' element value. —ведени€ о фактически уплаченной сумме
     * 
     * @param factPaidAmount
     */
    public void setFactPaidAmount(String factPaidAmount) {
        this.factPaidAmount = factPaidAmount;
    }

    /** 
     * Get the 'PaymentMethodCode' element value. —пособ платежа в соответствии с классификатором способов и особенностей уплаты таможенных и иных платежей
     * 
     * @return value
     */
    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }

    /** 
     * Set the 'PaymentMethodCode' element value. —пособ платежа в соответствии с классификатором способов и особенностей уплаты таможенных и иных платежей
     * 
     * @param paymentMethodCode
     */
    public void setPaymentMethodCode(String paymentMethodCode) {
        this.paymentMethodCode = paymentMethodCode;
    }

    /** 
     * Get the 'PaymentDocument' element value. ƒокумент, по которому произведена уплата
     * 
     * @return value
     */
    public PresentedDocumentType getPaymentDocument() {
        return paymentDocument;
    }

    /** 
     * Set the 'PaymentDocument' element value. ƒокумент, по которому произведена уплата
     * 
     * @param paymentDocument
     */
    public void setPaymentDocument(PresentedDocumentType paymentDocument) {
        this.paymentDocument = paymentDocument;
    }
}
