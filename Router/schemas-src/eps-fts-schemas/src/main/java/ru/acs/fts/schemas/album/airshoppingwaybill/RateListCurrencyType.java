
package ru.acs.fts.schemas.album.airshoppingwaybill;

/** 
 * Список курсов валют
 */
public class RateListCurrencyType
{
    private String currencyName;
    private String currency;
    private String currencyRate;

    /** 
     * Get the 'CurrencyName' element value. Наименование валюты
     * 
     * @return value
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /** 
     * Set the 'CurrencyName' element value. Наименование валюты
     * 
     * @param currencyName
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    /** 
     * Get the 'Currency' element value. Валюта
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. Валюта
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'CurrencyRate' element value. Курс валюты
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. Курс валюты
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }
}
