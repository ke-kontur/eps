
package ru.acs.fts.schemas.album.custpaymentsdk;

/** 
 * ����
 */
public class FineType
{
    private String customsFineSign;
    private String paymentModeCode;
    private String paymentAmount;
    private String customsPaymentSubspecies;
    private String paymentCurrencyCode;
    private String currencyRate;

    /** 
     * Get the 'CustomsFineSign' element value. ������� ����.
     * 
     * @return value
     */
    public String getCustomsFineSign() {
        return customsFineSign;
    }

    /** 
     * Set the 'CustomsFineSign' element value. ������� ����.
     * 
     * @param customsFineSign
     */
    public void setCustomsFineSign(String customsFineSign) {
        this.customsFineSign = customsFineSign;
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
     * Get the 'PaymentAmount' element value. ����� ����
     * 
     * @return value
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /** 
     * Set the 'PaymentAmount' element value. ����� ����
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
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
     * Get the 'CurrencyRate' element value. ���� ������
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. ���� ������
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }
}
