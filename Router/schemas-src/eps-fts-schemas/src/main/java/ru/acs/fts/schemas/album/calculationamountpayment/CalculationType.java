
package ru.acs.fts.schemas.album.calculationamountpayment;

/** 
 * Расчет размера обеспечения
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
     * Get the 'PaymentModeCode' element value. Код вида платежа  по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. Код вида платежа  по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'TaxBase' element value. Основа начисления
     * 
     * @return value
     */
    public String getTaxBase() {
        return taxBase;
    }

    /** 
     * Set the 'TaxBase' element value. Основа начисления
     * 
     * @param taxBase
     */
    public void setTaxBase(String taxBase) {
        this.taxBase = taxBase;
    }

    /** 
     * Get the 'TaxBaseCurrencyCode' element value. Цифровой код валюты основы начисления (адвалорная ставка)
     * 
     * @return value
     */
    public String getTaxBaseCurrencyCode() {
        return taxBaseCurrencyCode;
    }

    /** 
     * Set the 'TaxBaseCurrencyCode' element value. Цифровой код валюты основы начисления (адвалорная ставка)
     * 
     * @param taxBaseCurrencyCode
     */
    public void setTaxBaseCurrencyCode(String taxBaseCurrencyCode) {
        this.taxBaseCurrencyCode = taxBaseCurrencyCode;
    }

    /** 
     * Get the 'Rate' element value. Ставка.
     * 
     * @return value
     */
    public String getRate() {
        return rate;
    }

    /** 
     * Set the 'Rate' element value. Ставка.
     * 
     * @param rate
     */
    public void setRate(String rate) {
        this.rate = rate;
    }

    /** 
     * Get the 'RateTypeCode' element value. Вид ставки (адвалорная -"%", специфическая - "*")
     * 
     * @return value
     */
    public String getRateTypeCode() {
        return rateTypeCode;
    }

    /** 
     * Set the 'RateTypeCode' element value. Вид ставки (адвалорная -"%", специфическая - "*")
     * 
     * @param rateTypeCode
     */
    public void setRateTypeCode(String rateTypeCode) {
        this.rateTypeCode = rateTypeCode;
    }

    /** 
     * Get the 'RateCurrencyCode' element value. Цифровой код валюты ставки (специфическая ставка)
     * 
     * @return value
     */
    public String getRateCurrencyCode() {
        return rateCurrencyCode;
    }

    /** 
     * Set the 'RateCurrencyCode' element value. Цифровой код валюты ставки (специфическая ставка)
     * 
     * @param rateCurrencyCode
     */
    public void setRateCurrencyCode(String rateCurrencyCode) {
        this.rateCurrencyCode = rateCurrencyCode;
    }

    /** 
     * Get the 'WeightingFactor' element value. Весовой коэффициент единицы измерения (специфическая ставка)
     * 
     * @return value
     */
    public String getWeightingFactor() {
        return weightingFactor;
    }

    /** 
     * Set the 'WeightingFactor' element value. Весовой коэффициент единицы измерения (специфическая ставка)
     * 
     * @param weightingFactor
     */
    public void setWeightingFactor(String weightingFactor) {
        this.weightingFactor = weightingFactor;
    }

    /** 
     * Get the 'RateTNVEDQualifierCode' element value. Код единицы измерения ставки (специфическая ставка)
     * 
     * @return value
     */
    public String getRateTNVEDQualifierCode() {
        return rateTNVEDQualifierCode;
    }

    /** 
     * Set the 'RateTNVEDQualifierCode' element value. Код единицы измерения ставки (специфическая ставка)
     * 
     * @param rateTNVEDQualifierCode
     */
    public void setRateTNVEDQualifierCode(String rateTNVEDQualifierCode) {
        this.rateTNVEDQualifierCode = rateTNVEDQualifierCode;
    }

    /** 
     * Get the 'Amount' element value. Сумма 
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма 
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}
