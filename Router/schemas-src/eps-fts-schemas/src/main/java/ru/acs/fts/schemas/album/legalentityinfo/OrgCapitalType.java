
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;

/** 
 * �������� � ������� ���������� � ������������� ���������� ������������ ����������� ��������� �������� (����������� ��������, ��������� �����, ������� �����)
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
     * Get the 'OrgCapitalAmount' element value. ������ ��������� �������� / ��������, �� ������� ����������� �������� �������
     * 
     * @return value
     */
    public String getOrgCapitalAmount() {
        return orgCapitalAmount;
    }

    /** 
     * Set the 'OrgCapitalAmount' element value. ������ ��������� �������� / ��������, �� ������� ����������� �������� �������
     * 
     * @param orgCapitalAmount
     */
    public void setOrgCapitalAmount(String orgCapitalAmount) {
        this.orgCapitalAmount = orgCapitalAmount;
    }

    /** 
     * Get the 'OrgCapitalName' element value. ������������ ���� ��������
     * 
     * @return value
     */
    public String getOrgCapitalName() {
        return orgCapitalName;
    }

    /** 
     * Set the 'OrgCapitalName' element value. ������������ ���� ��������
     * 
     * @param orgCapitalName
     */
    public void setOrgCapitalName(String orgCapitalName) {
        this.orgCapitalName = orgCapitalName;
    }

    /** 
     * Get the 'ReduceWay' element value. ������ ���������� ��������� �������� ��������: 0 - ����� ���������� ����������� ��������� �����; 1 - ����� ���������� ������ ���������� �����
     * 
     * @return value
     */
    public String getReduceWay() {
        return reduceWay;
    }

    /** 
     * Set the 'ReduceWay' element value. ������ ���������� ��������� �������� ��������: 0 - ����� ���������� ����������� ��������� �����; 1 - ����� ���������� ������ ���������� �����
     * 
     * @param reduceWay
     */
    public void setReduceWay(String reduceWay) {
        this.reduceWay = reduceWay;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'DecisionDate' element value. ���� �������� ������� �� ���������� ��������� ��������
     * 
     * @return value
     */
    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    /** 
     * Set the 'DecisionDate' element value. ���� �������� ������� �� ���������� ��������� ��������
     * 
     * @param decisionDate
     */
    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    /** 
     * Get the 'RecordData' element value. �������� � ������
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. �������� � ������
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }
}
