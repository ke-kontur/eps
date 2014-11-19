
package ru.acs.fts.schemas.album.customsregistrycertificate;

/** 
 * —ведени€ об обеспечении уплаты таможенных платежей
 */
public class AmountCustomsPaymentType
{
    private String paymentWayCode;
    private String amount;
    private String currency;

    /** 
     * Get the 'PaymentWayCode' element value.  од способа обеспечени€ уплаты таможенных платежей в соответствии с классификатором способов обеспечени€ уплаты таможенных пошлин, налогов
     * 
     * @return value
     */
    public String getPaymentWayCode() {
        return paymentWayCode;
    }

    /** 
     * Set the 'PaymentWayCode' element value.  од способа обеспечени€ уплаты таможенных платежей в соответствии с классификатором способов обеспечени€ уплаты таможенных пошлин, налогов
     * 
     * @param paymentWayCode
     */
    public void setPaymentWayCode(String paymentWayCode) {
        this.paymentWayCode = paymentWayCode;
    }

    /** 
     * Get the 'Amount' element value. —умма обеспечени€
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. —умма обеспечени€
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'Currency' element value.  од валюты
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value.  од валюты
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
