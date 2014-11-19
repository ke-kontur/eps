
package ru.acs.fts.schemas.album.dealpassport;

import java.util.ArrayList;
import java.util.List;

/** 
 * Дополнительные сведения о контракте
 */
public class AddContractTermsType extends TermsType
{
    private String amount;
    private String currencyCode;
    private List<String> additionalInformationList = new ArrayList<String>();
    private String WS;

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
     * Get the list of 'AdditionalInformation' element items. Дополнительная информация. Указывается только в электронном виде.
     * 
     * @return list
     */
    public List<String> getAdditionalInformationList() {
        return additionalInformationList;
    }

    /** 
     * Set the list of 'AdditionalInformation' element items. Дополнительная информация. Указывается только в электронном виде.
     * 
     * @param list
     */
    public void setAdditionalInformationList(List<String> list) {
        additionalInformationList = list;
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
}
