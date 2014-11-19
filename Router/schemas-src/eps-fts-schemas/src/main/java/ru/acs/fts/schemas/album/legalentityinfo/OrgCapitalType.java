
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;

/** 
 * —ведени€ о размере указанного в учредительных документах коммерческой организации уставного капитала (складочного капитала, уставного фонда, паевого фонда)
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
     * Get the 'OrgCapitalAmount' element value. –азмер уставного капитала / ¬еличина, на которую уменьшаетс€ уставный капитал
     * 
     * @return value
     */
    public String getOrgCapitalAmount() {
        return orgCapitalAmount;
    }

    /** 
     * Set the 'OrgCapitalAmount' element value. –азмер уставного капитала / ¬еличина, на которую уменьшаетс€ уставный капитал
     * 
     * @param orgCapitalAmount
     */
    public void setOrgCapitalAmount(String orgCapitalAmount) {
        this.orgCapitalAmount = orgCapitalAmount;
    }

    /** 
     * Get the 'OrgCapitalName' element value. Ќаименование вида капитала
     * 
     * @return value
     */
    public String getOrgCapitalName() {
        return orgCapitalName;
    }

    /** 
     * Set the 'OrgCapitalName' element value. Ќаименование вида капитала
     * 
     * @param orgCapitalName
     */
    public void setOrgCapitalName(String orgCapitalName) {
        this.orgCapitalName = orgCapitalName;
    }

    /** 
     * Get the 'ReduceWay' element value. —пособ уменьшени€ уставного капитала общества: 0 - путем уменьшени€ номинальной стоимости акций; 1 - путем сокращени€ общего количества акций
     * 
     * @return value
     */
    public String getReduceWay() {
        return reduceWay;
    }

    /** 
     * Set the 'ReduceWay' element value. —пособ уменьшени€ уставного капитала общества: 0 - путем уменьшени€ номинальной стоимости акций; 1 - путем сокращени€ общего количества акций
     * 
     * @param reduceWay
     */
    public void setReduceWay(String reduceWay) {
        this.reduceWay = reduceWay;
    }

    /** 
     * Get the 'CurrencyCode' element value.  од валюты
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value.  од валюты
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'DecisionDate' element value. ƒата прин€ти€ решени€ об уменьшении уставного капитала
     * 
     * @return value
     */
    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    /** 
     * Set the 'DecisionDate' element value. ƒата прин€ти€ решени€ об уменьшении уставного капитала
     * 
     * @param decisionDate
     */
    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    /** 
     * Get the 'RecordData' element value. —ведени€ о записи
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. —ведени€ о записи
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }
}
