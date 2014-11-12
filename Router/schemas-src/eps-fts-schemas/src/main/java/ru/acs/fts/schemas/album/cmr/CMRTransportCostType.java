
package ru.acs.fts.schemas.album.cmr;

/** 
 * Информация о расходах, связанных с перевозкой груза (используется для заполнения графы 19).
 */
public class CMRTransportCostType
{
    private String transportCost;
    private String additionalCharges;
    private String otherCharges;
    private String totalCost;
    private String currencyCode;

    /** 
     * Get the 'TransportCost' element value. Стоимость услуг по перевозке
     * 
     * @return value
     */
    public String getTransportCost() {
        return transportCost;
    }

    /** 
     * Set the 'TransportCost' element value. Стоимость услуг по перевозке
     * 
     * @param transportCost
     */
    public void setTransportCost(String transportCost) {
        this.transportCost = transportCost;
    }

    /** 
     * Get the 'AdditionalCharges' element value. Дополнительные расходы, связанные с перевозкой грузов
     * 
     * @return value
     */
    public String getAdditionalCharges() {
        return additionalCharges;
    }

    /** 
     * Set the 'AdditionalCharges' element value. Дополнительные расходы, связанные с перевозкой грузов
     * 
     * @param additionalCharges
     */
    public void setAdditionalCharges(String additionalCharges) {
        this.additionalCharges = additionalCharges;
    }

    /** 
     * Get the 'OtherCharges' element value. Прочие расходы, связанные с транспортировкой груза
     * 
     * @return value
     */
    public String getOtherCharges() {
        return otherCharges;
    }

    /** 
     * Set the 'OtherCharges' element value. Прочие расходы, связанные с транспортировкой груза
     * 
     * @param otherCharges
     */
    public void setOtherCharges(String otherCharges) {
        this.otherCharges = otherCharges;
    }

    /** 
     * Get the 'TotalCost' element value. Общая сумма расходов, связанных с транспортировкой груза
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. Общая сумма расходов, связанных с транспортировкой груза
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты . Указывается, если стоимость услуг выражена в иностранной валюте
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты . Указывается, если стоимость услуг выражена в иностранной валюте
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
