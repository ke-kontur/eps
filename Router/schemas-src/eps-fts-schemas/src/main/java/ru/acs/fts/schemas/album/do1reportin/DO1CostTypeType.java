
package ru.acs.fts.schemas.album.do1reportin;

/** 
 * Сведения об общей стоимости товаров в отчете
 */
public class DO1CostTypeType
{
    private String amount;
    private String currencyCode;

    /** 
     * Get the 'Amount' element value. Общая фактурная стоимость
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Общая фактурная стоимость
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'CurrencyCode' element value. Буквенный код валюты фактурной стоимости
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Буквенный код валюты фактурной стоимости
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
