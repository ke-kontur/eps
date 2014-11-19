
package ru.acs.fts.schemas.album.customsbrokercertificate;

/** 
 * ќбеспечение уплаты таможенных платежей
 */
public class PaymentGuaranteeType
{
    private String paymentModeCode;
    private String paymentMode;
    private String paymentAmount;

    /** 
     * Get the 'PaymentModeCode' element value.  од вида таможенного платежа по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value.  од вида таможенного платежа по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'PaymentMode' element value. ‘орма обеспечени€ уплаты таможенных платежей (залог имущества, банковска€ гаранти€, денежный залог, поручительство, договор страховани€)
     * 
     * @return value
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /** 
     * Set the 'PaymentMode' element value. ‘орма обеспечени€ уплаты таможенных платежей (залог имущества, банковска€ гаранти€, денежный залог, поручительство, договор страховани€)
     * 
     * @param paymentMode
     */
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    /** 
     * Get the 'PaymentAmount' element value. —умма обеспечени€
     * 
     * @return value
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /** 
     * Set the 'PaymentAmount' element value. —умма обеспечени€
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
