
package ru.acs.fts.schemas.album.prohibitedgoods;

/** 
 * Информация о валюте и валютных ценностях
 */
public class CurrencyInfoType
{
    private String amout;
    private String currencyCode;

    /** 
     * Get the 'Amout' element value. Сумма
     * 
     * @return value
     */
    public String getAmout() {
        return amout;
    }

    /** 
     * Set the 'Amout' element value. Сумма
     * 
     * @param amout
     */
    public void setAmout(String amout) {
        this.amout = amout;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код вида валюты
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код вида валюты
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
