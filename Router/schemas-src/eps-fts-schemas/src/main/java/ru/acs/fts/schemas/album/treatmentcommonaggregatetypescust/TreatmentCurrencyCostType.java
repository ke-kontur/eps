
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

/** 
 * Сведения о стоимости в валюте
 */
public class TreatmentCurrencyCostType
{
    private String currencyCost;
    private String currencyCode;
    private String currencyRate;

    /** 
     * Get the 'CurrencyCost' element value. Стоимость  товара в валюте
     * 
     * @return value
     */
    public String getCurrencyCost() {
        return currencyCost;
    }

    /** 
     * Set the 'CurrencyCost' element value. Стоимость  товара в валюте
     * 
     * @param currencyCost
     */
    public void setCurrencyCost(String currencyCost) {
        this.currencyCost = currencyCost;
    }

    /** 
     * Get the 'CurrencyCode' element value. Буквенный код валюты
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Буквенный код валюты
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
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
