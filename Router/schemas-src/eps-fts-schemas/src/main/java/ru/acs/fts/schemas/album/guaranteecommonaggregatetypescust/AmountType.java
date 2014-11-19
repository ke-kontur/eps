
package ru.acs.fts.schemas.album.guaranteecommonaggregatetypescust;

/** 
 * Денежная сумма и код валюты
 */
public class AmountType
{
    private String amount;
    private String currencyCode;

    /** 
     * Get the 'Amount' element value. Сумма.
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма.
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'CurrencyCode' element value. Буквенный код валюты в соответствии с Классификатором валют.
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Буквенный код валюты в соответствии с Классификатором валют.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
