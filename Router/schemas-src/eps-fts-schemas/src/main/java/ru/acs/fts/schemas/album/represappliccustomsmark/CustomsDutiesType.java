
package ru.acs.fts.schemas.album.represappliccustomsmark;

/** 
 * Таможенные платежи, подлежащие уплате
 */
public class CustomsDutiesType
{
    private String duties;
    private String taxes;
    private String currencyCode;

    /** 
     * Get the 'Duties' element value. Таможенные пошлины, налоги
     * 
     * @return value
     */
    public String getDuties() {
        return duties;
    }

    /** 
     * Set the 'Duties' element value. Таможенные пошлины, налоги
     * 
     * @param duties
     */
    public void setDuties(String duties) {
        this.duties = duties;
    }

    /** 
     * Get the 'Taxes' element value. Таможенные сборы
     * 
     * @return value
     */
    public String getTaxes() {
        return taxes;
    }

    /** 
     * Set the 'Taxes' element value. Таможенные сборы
     * 
     * @param taxes
     */
    public void setTaxes(String taxes) {
        this.taxes = taxes;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты таможенного платежа
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты таможенного платежа
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
