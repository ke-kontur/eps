
package ru.acs.fts.schemas.album.dealpassport;

/** 
 * Общие сведения о контракте
 */
public class ContractTermsType extends TermsType
{
    private String amount;
    private String currencyCode;
    private String WS;
    private String currencyName;

    /** 
     * Get the 'Amount' element value. Общая сумма сделки
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Общая сумма сделки
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты контракта (цены)
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты контракта (цены)
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'WS' element value. 1 - "Без суммы"
     * 
     * @return value
     */
    public String getWS() {
        return WS;
    }

    /** 
     * Set the 'WS' element value. 1 - "Без суммы"
     * 
     * @param WS
     */
    public void setWS(String WS) {
        this.WS = WS;
    }

    /** 
     * Get the 'CurrencyName' element value. Краткое наименование валюты контракта
     * 
     * @return value
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /** 
     * Set the 'CurrencyName' element value. Краткое наименование валюты контракта
     * 
     * @param currencyName
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }
}
