
package ru.acs.fts.schemas.album.customsbrokercertificate;

/** 
 * Обеспечение уплаты таможенных платежей
 */
public class PaymentGuaranteeType
{
    private String paymentModeCode;
    private String paymentMode;
    private String paymentAmount;

    /** 
     * Get the 'PaymentModeCode' element value. Код вида таможенного платежа по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. Код вида таможенного платежа по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'PaymentMode' element value. Форма обеспечения уплаты таможенных платежей (залог имущества, банковская гарантия, денежный залог, поручительство, договор страхования)
     * 
     * @return value
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /** 
     * Set the 'PaymentMode' element value. Форма обеспечения уплаты таможенных платежей (залог имущества, банковская гарантия, денежный залог, поручительство, договор страхования)
     * 
     * @param paymentMode
     */
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    /** 
     * Get the 'PaymentAmount' element value. Сумма обеспечения
     * 
     * @return value
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /** 
     * Set the 'PaymentAmount' element value. Сумма обеспечения
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
