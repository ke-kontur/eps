
package ru.acs.fts.schemas.album.serviceinvoice;

/** 
 * Параметры оплаты услуг
 */
public class PaymentDetailsType
{
    private String amount;
    private String currency;

    /** 
     * Get the 'Amount' element value. Сумма
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма
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
