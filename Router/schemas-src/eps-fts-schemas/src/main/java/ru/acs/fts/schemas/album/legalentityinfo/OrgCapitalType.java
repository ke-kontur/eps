
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;

/** 
 * Сведения о размере указанного в учредительных документах коммерческой организации уставного капитала (складочного капитала, уставного фонда, паевого фонда)
 */
public class OrgCapitalType
{
    private String orgCapitalAmount;
    private String orgCapitalName;
    private String reduceWay;
    private String currencyCode;
    private LocalDate decisionDate;
    private RecordDataType recordData;

    /** 
     * Get the 'OrgCapitalAmount' element value. Размер уставного капитала / Величина, на которую уменьшается уставный капитал
     * 
     * @return value
     */
    public String getOrgCapitalAmount() {
        return orgCapitalAmount;
    }

    /** 
     * Set the 'OrgCapitalAmount' element value. Размер уставного капитала / Величина, на которую уменьшается уставный капитал
     * 
     * @param orgCapitalAmount
     */
    public void setOrgCapitalAmount(String orgCapitalAmount) {
        this.orgCapitalAmount = orgCapitalAmount;
    }

    /** 
     * Get the 'OrgCapitalName' element value. Наименование вида капитала
     * 
     * @return value
     */
    public String getOrgCapitalName() {
        return orgCapitalName;
    }

    /** 
     * Set the 'OrgCapitalName' element value. Наименование вида капитала
     * 
     * @param orgCapitalName
     */
    public void setOrgCapitalName(String orgCapitalName) {
        this.orgCapitalName = orgCapitalName;
    }

    /** 
     * Get the 'ReduceWay' element value. Способ уменьшения уставного капитала общества: 0 - путем уменьшения номинальной стоимости акций; 1 - путем сокращения общего количества акций
     * 
     * @return value
     */
    public String getReduceWay() {
        return reduceWay;
    }

    /** 
     * Set the 'ReduceWay' element value. Способ уменьшения уставного капитала общества: 0 - путем уменьшения номинальной стоимости акций; 1 - путем сокращения общего количества акций
     * 
     * @param reduceWay
     */
    public void setReduceWay(String reduceWay) {
        this.reduceWay = reduceWay;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'DecisionDate' element value. Дата принятия решения об уменьшении уставного капитала
     * 
     * @return value
     */
    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    /** 
     * Set the 'DecisionDate' element value. Дата принятия решения об уменьшении уставного капитала
     * 
     * @param decisionDate
     */
    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    /** 
     * Get the 'RecordData' element value. Сведения о записи
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. Сведения о записи
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }
}
