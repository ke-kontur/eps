
package ru.acs.fts.schemas.album.paymentconfirmation;

/** 
 * Платеж
 */
public class PayingType
{
    private String paymentModeCode;
    private String CBC;
    private String amount;

    /** 
     * Get the 'PaymentModeCode' element value. Код вида таможенного платежа
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. Код вида таможенного платежа
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'CBC' element value. Код бюджетной классификации (КБК)
     * 
     * @return value
     */
    public String getCBC() {
        return CBC;
    }

    /** 
     * Set the 'CBC' element value. Код бюджетной классификации (КБК)
     * 
     * @param CBC
     */
    public void setCBC(String CBC) {
        this.CBC = CBC;
    }

    /** 
     * Get the 'Amount' element value. Сумма, подлежащая уплате
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма, подлежащая уплате
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}
