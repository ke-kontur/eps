
package ru.acs.fts.schemas.album.custpaymentsdk;

import org.joda.time.LocalDate;

/** 
 * ��������, ���������
 */
public class PaymentDelayType
{
    private String customsPaymentSign;
    private String paymentModeCode;
    private String paymentDelayAmount;
    private String customsPaymentSubspecies;
    private String paymentCurrencyCode;
    private String paymentEnsuringModeCodeType;
    private String delayPremitNumber;
    private LocalDate delayPaymentDate;
    private String rate;
    private String postponementProcent;

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
     * Get the 'PaymentModeCode' element value. ��� ���� �������  �� �������������� ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������.
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. ��� ���� �������  �� �������������� ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������.
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'PaymentDelayAmount' element value. ����� ��������/���������
     * 
     * @return value
     */
    public String getPaymentDelayAmount() {
        return paymentDelayAmount;
    }

    /** 
     * Set the 'PaymentDelayAmount' element value. ����� ��������/���������
     * 
     * @param paymentDelayAmount
     */
    public void setPaymentDelayAmount(String paymentDelayAmount) {
        this.paymentDelayAmount = paymentDelayAmount;
    }

    /** 
     * Get the 'CustomsPaymentSubspecies' element value. ������  ����������� �������.
     * 
     * @return value
     */
    public String getCustomsPaymentSubspecies() {
        return customsPaymentSubspecies;
    }

    /** 
     * Set the 'CustomsPaymentSubspecies' element value. ������  ����������� �������.
     * 
     * @param customsPaymentSubspecies
     */
    public void setCustomsPaymentSubspecies(String customsPaymentSubspecies) {
        this.customsPaymentSubspecies = customsPaymentSubspecies;
    }

    /** 
     * Get the 'PaymentCurrencyCode' element value. �������� ��� ������ ����� �������.
     * 
     * @return value
     */
    public String getPaymentCurrencyCode() {
        return paymentCurrencyCode;
    }

    /** 
     * Set the 'PaymentCurrencyCode' element value. �������� ��� ������ ����� �������.
     * 
     * @param paymentCurrencyCode
     */
    public void setPaymentCurrencyCode(String paymentCurrencyCode) {
        this.paymentCurrencyCode = paymentCurrencyCode;
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
     * Get the 'DelayPaymentDate' element value. ���� ������
     * 
     * @return value
     */
    public LocalDate getDelayPaymentDate() {
        return delayPaymentDate;
    }

    /** 
     * Set the 'DelayPaymentDate' element value. ���� ������
     * 
     * @param delayPaymentDate
     */
    public void setDelayPaymentDate(LocalDate delayPaymentDate) {
        this.delayPaymentDate = delayPaymentDate;
    }

    /** 
     * Get the 'Rate' element value. ������ �������.
     * 
     * @return value
     */
    public String getRate() {
        return rate;
    }

    /** 
     * Set the 'Rate' element value. ������ �������.
     * 
     * @param rate
     */
    public void setRate(String rate) {
        this.rate = rate;
    }

    /** 
     * Get the 'PostponementProcent' element value. ������� �� �������������� �������� / ��������� (����������� ��� 91, 93 ����� ���. ��������)
     * 
     * @return value
     */
    public String getPostponementProcent() {
        return postponementProcent;
    }

    /** 
     * Set the 'PostponementProcent' element value. ������� �� �������������� �������� / ��������� (����������� ��� 91, 93 ����� ���. ��������)
     * 
     * @param postponementProcent
     */
    public void setPostponementProcent(String postponementProcent) {
        this.postponementProcent = postponementProcent;
    }
}
