
package ru.acs.fts.schemas.album.chargeoffresult;

/** 
 * Список валют.
 */
public class CurrencyType
{
    private String currencyCode;
    private String amount;

    /** 
     * Get the 'CurrencyCode' element value. Код валюты
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'Amount' element value. Сумма нехватки средств в валюте
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма нехватки средств в валюте
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}
