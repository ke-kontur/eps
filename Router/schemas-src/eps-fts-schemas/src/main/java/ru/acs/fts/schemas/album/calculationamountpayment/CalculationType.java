
package ru.acs.fts.schemas.album.calculationamountpayment;

/** 
 * ������ ������� �����������
 */
public class CalculationType
{
    private String paymentModeCode;
    private String taxBase;
    private String taxBaseCurrencyCode;
    private String rate;
    private String rateTypeCode;
    private String rateCurrencyCode;
    private String weightingFactor;
    private String rateTNVEDQualifierCode;
    private String amount;

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
     * Get the 'TaxBase' element value. ������ ����������
     * 
     * @return value
     */
    public String getTaxBase() {
        return taxBase;
    }

    /** 
     * Set the 'TaxBase' element value. ������ ����������
     * 
     * @param taxBase
     */
    public void setTaxBase(String taxBase) {
        this.taxBase = taxBase;
    }

    /** 
     * Get the 'TaxBaseCurrencyCode' element value. �������� ��� ������ ������ ���������� (���������� ������)
     * 
     * @return value
     */
    public String getTaxBaseCurrencyCode() {
        return taxBaseCurrencyCode;
    }

    /** 
     * Set the 'TaxBaseCurrencyCode' element value. �������� ��� ������ ������ ���������� (���������� ������)
     * 
     * @param taxBaseCurrencyCode
     */
    public void setTaxBaseCurrencyCode(String taxBaseCurrencyCode) {
        this.taxBaseCurrencyCode = taxBaseCurrencyCode;
    }

    /** 
     * Get the 'Rate' element value. ������.
     * 
     * @return value
     */
    public String getRate() {
        return rate;
    }

    /** 
     * Set the 'Rate' element value. ������.
     * 
     * @param rate
     */
    public void setRate(String rate) {
        this.rate = rate;
    }

    /** 
     * Get the 'RateTypeCode' element value. ��� ������ (���������� -"%", ������������� - "*")
     * 
     * @return value
     */
    public String getRateTypeCode() {
        return rateTypeCode;
    }

    /** 
     * Set the 'RateTypeCode' element value. ��� ������ (���������� -"%", ������������� - "*")
     * 
     * @param rateTypeCode
     */
    public void setRateTypeCode(String rateTypeCode) {
        this.rateTypeCode = rateTypeCode;
    }

    /** 
     * Get the 'RateCurrencyCode' element value. �������� ��� ������ ������ (������������� ������)
     * 
     * @return value
     */
    public String getRateCurrencyCode() {
        return rateCurrencyCode;
    }

    /** 
     * Set the 'RateCurrencyCode' element value. �������� ��� ������ ������ (������������� ������)
     * 
     * @param rateCurrencyCode
     */
    public void setRateCurrencyCode(String rateCurrencyCode) {
        this.rateCurrencyCode = rateCurrencyCode;
    }

    /** 
     * Get the 'WeightingFactor' element value. ������� ����������� ������� ��������� (������������� ������)
     * 
     * @return value
     */
    public String getWeightingFactor() {
        return weightingFactor;
    }

    /** 
     * Set the 'WeightingFactor' element value. ������� ����������� ������� ��������� (������������� ������)
     * 
     * @param weightingFactor
     */
    public void setWeightingFactor(String weightingFactor) {
        this.weightingFactor = weightingFactor;
    }

    /** 
     * Get the 'RateTNVEDQualifierCode' element value. ��� ������� ��������� ������ (������������� ������)
     * 
     * @return value
     */
    public String getRateTNVEDQualifierCode() {
        return rateTNVEDQualifierCode;
    }

    /** 
     * Set the 'RateTNVEDQualifierCode' element value. ��� ������� ��������� ������ (������������� ������)
     * 
     * @param rateTNVEDQualifierCode
     */
    public void setRateTNVEDQualifierCode(String rateTNVEDQualifierCode) {
        this.rateTNVEDQualifierCode = rateTNVEDQualifierCode;
    }

    /** 
     * Get the 'Amount' element value. ����� 
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. ����� 
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}
