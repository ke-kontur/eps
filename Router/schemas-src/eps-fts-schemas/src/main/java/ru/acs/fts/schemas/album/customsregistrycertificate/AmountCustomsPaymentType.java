
package ru.acs.fts.schemas.album.customsregistrycertificate;

/** 
 * Сведения об обеспечении уплаты таможенных платежей
 */
public class AmountCustomsPaymentType
{
    private String paymentWayCode;
    private String amount;
    private String currency;

    /** 
     * Get the 'PaymentWayCode' element value. Код способа обеспечения уплаты таможенных платежей в соответствии с классификатором способов обеспечения уплаты таможенных пошлин, налогов
     * 
     * @return value
     */
    public String getPaymentWayCode() {
        return paymentWayCode;
    }

    /** 
     * Set the 'PaymentWayCode' element value. Код способа обеспечения уплаты таможенных платежей в соответствии с классификатором способов обеспечения уплаты таможенных пошлин, налогов
     * 
     * @param paymentWayCode
     */
    public void setPaymentWayCode(String paymentWayCode) {
        this.paymentWayCode = paymentWayCode;
    }

    /** 
     * Get the 'Amount' element value. Сумма обеспечения
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма обеспечения
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'Currency' element value. Код валюты
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. Код валюты
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
