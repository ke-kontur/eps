
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * ���������� �������.
 */
public class CustomsPaymentType
{
    private String customsPaymentSign;
    private String paymentModeCode;
    private String paymentAmount;
    private String paymentCurrencyCode;
    private String currencyRate;
    private String paymentEnsuringModeCodeType;
    private String returnSign;
    private LocalDate delayPaymentDate;
    private String paymentParticularitySign;
    private String delayPremitNumber;
    private LocalDate delayPremitDate;

    /** 
     * Get the 'CustomsPaymentSign' element value. ������� ����������� �������.
     * 
     * @return value
     */
    public String getCustomsPaymentSign() {
        return customsPaymentSign;
    }

    /** 
     * Set the 'CustomsPaymentSign' element value. ������� ����������� �������.
     * 
     * @param customsPaymentSign
     */
    public void setCustomsPaymentSign(String customsPaymentSign) {
        this.customsPaymentSign = customsPaymentSign;
    }

    /** 
     * Get the 'PaymentModeCode' element value. ��� ���� ����������� ������� �� �������������� ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������.
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. ��� ���� ����������� ������� �� �������������� ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������.
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'PaymentAmount' element value. ����� ������� / �����������
     * 
     * @return value
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /** 
     * Set the 'PaymentAmount' element value. ����� ������� / �����������
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /** 
     * Get the 'PaymentCurrencyCode' element value. �������� ��� ������ ����� ������� / �����������
     * 
     * @return value
     */
    public String getPaymentCurrencyCode() {
        return paymentCurrencyCode;
    }

    /** 
     * Set the 'PaymentCurrencyCode' element value. �������� ��� ������ ����� ������� / �����������
     * 
     * @param paymentCurrencyCode
     */
    public void setPaymentCurrencyCode(String paymentCurrencyCode) {
        this.paymentCurrencyCode = paymentCurrencyCode;
    }

    /** 
     * Get the 'CurrencyRate' element value. ���� ������ ������� / �����������
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. ���� ������ ������� / �����������
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'PaymentEnsuringModeCodeType' element value. ��� ���� ����������� ������
     * 
     * @return value
     */
    public String getPaymentEnsuringModeCodeType() {
        return paymentEnsuringModeCodeType;
    }

    /** 
     * Set the 'PaymentEnsuringModeCodeType' element value. ��� ���� ����������� ������
     * 
     * @param paymentEnsuringModeCodeType
     */
    public void setPaymentEnsuringModeCodeType(
            String paymentEnsuringModeCodeType) {
        this.paymentEnsuringModeCodeType = paymentEnsuringModeCodeType;
    }

    /** 
     * Get the 'ReturnSign' element value. ������� �������� �������� �������
     * 
     * @return value
     */
    public String getReturnSign() {
        return returnSign;
    }

    /** 
     * Set the 'ReturnSign' element value. ������� �������� �������� �������
     * 
     * @param returnSign
     */
    public void setReturnSign(String returnSign) {
        this.returnSign = returnSign;
    }

    /** 
     * Get the 'DelayPaymentDate' element value. ���� �������� ������
     * 
     * @return value
     */
    public LocalDate getDelayPaymentDate() {
        return delayPaymentDate;
    }

    /** 
     * Set the 'DelayPaymentDate' element value. ���� �������� ������
     * 
     * @param delayPaymentDate
     */
    public void setDelayPaymentDate(LocalDate delayPaymentDate) {
        this.delayPaymentDate = delayPaymentDate;
    }

    /** 
     * Get the 'PaymentParticularitySign' element value. ����������� ������ ���������� ��������:1-��� �����������
     * 
     * @return value
     */
    public String getPaymentParticularitySign() {
        return paymentParticularitySign;
    }

    /** 
     * Set the 'PaymentParticularitySign' element value. ����������� ������ ���������� ��������:1-��� �����������
     * 
     * @param paymentParticularitySign
     */
    public void setPaymentParticularitySign(String paymentParticularitySign) {
        this.paymentParticularitySign = paymentParticularitySign;
    }

    /** 
     * Get the 'DelayPremitNumber' element value. ����� ���������� �� �������� �������.
     * 
     * @return value
     */
    public String getDelayPremitNumber() {
        return delayPremitNumber;
    }

    /** 
     * Set the 'DelayPremitNumber' element value. ����� ���������� �� �������� �������.
     * 
     * @param delayPremitNumber
     */
    public void setDelayPremitNumber(String delayPremitNumber) {
        this.delayPremitNumber = delayPremitNumber;
    }

    /** 
     * Get the 'DelayPremitDate' element value. ���� ���������� �� �������� �������.
     * 
     * @return value
     */
    public LocalDate getDelayPremitDate() {
        return delayPremitDate;
    }

    /** 
     * Set the 'DelayPremitDate' element value. ���� ���������� �� �������� �������.
     * 
     * @param delayPremitDate
     */
    public void setDelayPremitDate(LocalDate delayPremitDate) {
        this.delayPremitDate = delayPremitDate;
    }
}
