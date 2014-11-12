
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * Сведения об остатке квоты в денежном выражении. Заполняется в случае, если квота установлена в денежном выражении
 */
public class ESADCurrencyQuotaType
{
    private String quotaCurrencyQuantity;
    private String quotaCurrencyCode;
    private String quotaCurrencyName;

    /** 
     * Get the 'QuotaCurrencyQuantity' element value. Остаток квоты в валюте
     * 
     * @return value
     */
    public String getQuotaCurrencyQuantity() {
        return quotaCurrencyQuantity;
    }

    /** 
     * Set the 'QuotaCurrencyQuantity' element value. Остаток квоты в валюте
     * 
     * @param quotaCurrencyQuantity
     */
    public void setQuotaCurrencyQuantity(String quotaCurrencyQuantity) {
        this.quotaCurrencyQuantity = quotaCurrencyQuantity;
    }

    /** 
     * Get the 'QuotaCurrencyCode' element value. Цифровой код валюты квоты в соответствии с классификатором кодов валют
     * 
     * @return value
     */
    public String getQuotaCurrencyCode() {
        return quotaCurrencyCode;
    }

    /** 
     * Set the 'QuotaCurrencyCode' element value. Цифровой код валюты квоты в соответствии с классификатором кодов валют
     * 
     * @param quotaCurrencyCode
     */
    public void setQuotaCurrencyCode(String quotaCurrencyCode) {
        this.quotaCurrencyCode = quotaCurrencyCode;
    }

    /** 
     * Get the 'QuotaCurrencyName' element value. Наименование валюты квоты
     * 
     * @return value
     */
    public String getQuotaCurrencyName() {
        return quotaCurrencyName;
    }

    /** 
     * Set the 'QuotaCurrencyName' element value. Наименование валюты квоты
     * 
     * @param quotaCurrencyName
     */
    public void setQuotaCurrencyName(String quotaCurrencyName) {
        this.quotaCurrencyName = quotaCurrencyName;
    }
}
