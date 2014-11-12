
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

/** 
 * Основа для расчета по методу 6
 */
public class Method6BasisType
{
    private String currencyAmount;
    private String currencyCode;
    private String nationalAmount;
    private String currencyRate;

    /** 
     * Get the 'CurrencyAmount' element value. Цена в валюте счета.
     * 
     * @return value
     */
    public String getCurrencyAmount() {
        return currencyAmount;
    }

    /** 
     * Set the 'CurrencyAmount' element value. Цена в валюте счета.
     * 
     * @param currencyAmount
     */
    public void setCurrencyAmount(String currencyAmount) {
        this.currencyAmount = currencyAmount;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты счета
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты счета
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'NationalAmount' element value. Цена сделки в национальной валюте
     * 
     * @return value
     */
    public String getNationalAmount() {
        return nationalAmount;
    }

    /** 
     * Set the 'NationalAmount' element value. Цена сделки в национальной валюте
     * 
     * @param nationalAmount
     */
    public void setNationalAmount(String nationalAmount) {
        this.nationalAmount = nationalAmount;
    }

    /** 
     * Get the 'CurrencyRate' element value. Курс пересчета
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. Курс пересчета
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }
}
