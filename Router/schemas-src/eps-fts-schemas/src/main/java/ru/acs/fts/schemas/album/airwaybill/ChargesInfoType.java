
package ru.acs.fts.schemas.album.airwaybill;

/** 
 * Платеж
 */
public class ChargesInfoType
{
    private String paymentCode;
    private String amount;

    /** 
     * Get the 'PaymentCode' element value. Идентификатор платежа
     * 
     * @return value
     */
    public String getPaymentCode() {
        return paymentCode;
    }

    /** 
     * Set the 'PaymentCode' element value. Идентификатор платежа
     * 
     * @param paymentCode
     */
    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    /** 
     * Get the 'Amount' element value. Сумма платежа
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма платежа
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}
