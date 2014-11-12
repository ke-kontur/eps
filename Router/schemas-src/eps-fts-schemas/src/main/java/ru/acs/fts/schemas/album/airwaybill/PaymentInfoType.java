
package ru.acs.fts.schemas.album.airwaybill;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� �� ��������
 */
public class PaymentInfoType
{
    private String taxCode;
    private String weightValuePrepaidFlag;
    private String otherChargesPrepaidFlag;
    private String currencyRate;
    private String chargesDestCurrency;
    private String chargesDestination;
    private String totalCollectCharges;
    private List<OtherChargesType> otherChargeList = new ArrayList<OtherChargesType>();
    private ChargesSummaryType prepaydCharge;
    private ChargesSummaryType collectCharge;

    /** 
     * Get the 'TaxCode' element value. ���� ������ (������ ��� ������������� ������������)
     * 
     * @return value
     */
    public String getTaxCode() {
        return taxCode;
    }

    /** 
     * Set the 'TaxCode' element value. ���� ������ (������ ��� ������������� ������������)
     * 
     * @param taxCode
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    /** 
     * Get the 'WeightValuePrepaidFlag' element value. ������� ����������  ��� ������ �� ����/����������� ���������
     * 
     * @return value
     */
    public String getWeightValuePrepaidFlag() {
        return weightValuePrepaidFlag;
    }

    /** 
     * Set the 'WeightValuePrepaidFlag' element value. ������� ����������  ��� ������ �� ����/����������� ���������
     * 
     * @param weightValuePrepaidFlag
     */
    public void setWeightValuePrepaidFlag(String weightValuePrepaidFlag) {
        this.weightValuePrepaidFlag = weightValuePrepaidFlag;
    }

    /** 
     * Get the 'OtherChargesPrepaidFlag' element value. ������� ����������  ��� ������ ������
     * 
     * @return value
     */
    public String getOtherChargesPrepaidFlag() {
        return otherChargesPrepaidFlag;
    }

    /** 
     * Set the 'OtherChargesPrepaidFlag' element value. ������� ����������  ��� ������ ������
     * 
     * @param otherChargesPrepaidFlag
     */
    public void setOtherChargesPrepaidFlag(String otherChargesPrepaidFlag) {
        this.otherChargesPrepaidFlag = otherChargesPrepaidFlag;
    }

    /** 
     * Get the 'CurrencyRate' element value. ���� ��������� � ��������� ����������
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. ���� ��������� � ��������� ����������
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'ChargesDestCurrency' element value. ����� ������ � ������ ������ ����������
     * 
     * @return value
     */
    public String getChargesDestCurrency() {
        return chargesDestCurrency;
    }

    /** 
     * Set the 'ChargesDestCurrency' element value. ����� ������ � ������ ������ ����������
     * 
     * @param chargesDestCurrency
     */
    public void setChargesDestCurrency(String chargesDestCurrency) {
        this.chargesDestCurrency = chargesDestCurrency;
    }

    /** 
     * Get the 'ChargesDestination' element value. ����� ������ � ��������� ����������
     * 
     * @return value
     */
    public String getChargesDestination() {
        return chargesDestination;
    }

    /** 
     * Set the 'ChargesDestination' element value. ����� ������ � ��������� ����������
     * 
     * @param chargesDestination
     */
    public void setChargesDestination(String chargesDestination) {
        this.chargesDestination = chargesDestination;
    }

    /** 
     * Get the 'TotalCollectCharges' element value. ����� ������ � ������
     * 
     * @return value
     */
    public String getTotalCollectCharges() {
        return totalCollectCharges;
    }

    /** 
     * Set the 'TotalCollectCharges' element value. ����� ������ � ������
     * 
     * @param totalCollectCharges
     */
    public void setTotalCollectCharges(String totalCollectCharges) {
        this.totalCollectCharges = totalCollectCharges;
    }

    /** 
     * Get the list of 'OtherCharges' element items. ������ �����
     * 
     * @return list
     */
    public List<OtherChargesType> getOtherChargeList() {
        return otherChargeList;
    }

    /** 
     * Set the list of 'OtherCharges' element items. ������ �����
     * 
     * @param list
     */
    public void setOtherChargeList(List<OtherChargesType> list) {
        otherChargeList = list;
    }

    /** 
     * Get the 'PrepaydCharge' element value. �������������� �������
     * 
     * @return value
     */
    public ChargesSummaryType getPrepaydCharge() {
        return prepaydCharge;
    }

    /** 
     * Set the 'PrepaydCharge' element value. �������������� �������
     * 
     * @param prepaydCharge
     */
    public void setPrepaydCharge(ChargesSummaryType prepaydCharge) {
        this.prepaydCharge = prepaydCharge;
    }

    /** 
     * Get the 'CollectCharge' element value. ������ �� ��������
     * 
     * @return value
     */
    public ChargesSummaryType getCollectCharge() {
        return collectCharge;
    }

    /** 
     * Set the 'CollectCharge' element value. ������ �� ��������
     * 
     * @param collectCharge
     */
    public void setCollectCharge(ChargesSummaryType collectCharge) {
        this.collectCharge = collectCharge;
    }
}
