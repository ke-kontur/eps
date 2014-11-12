
package ru.acs.fts.schemas.album.indulgencestatement;

import org.joda.time.LocalDate;

/** 
 * Условия контракта
 */
public class ContractTermsType
{
    private LocalDate lastDate;
    private String currencyCode;

    /** 
     * Get the 'LastDate' element value. Дата окончания расчетов по контракту
     * 
     * @return value
     */
    public LocalDate getLastDate() {
        return lastDate;
    }

    /** 
     * Set the 'LastDate' element value. Дата окончания расчетов по контракту
     * 
     * @param lastDate
     */
    public void setLastDate(LocalDate lastDate) {
        this.lastDate = lastDate;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты контракта
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты контракта
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
