
package ru.acs.fts.schemas.album.custpaymentsdk;

/** 
 * Исчисление таможенных платежей.
 */
public class PaymentCalculationType
{
    private String customsPaymentSign;
    private String paymentModeCode;
    private String paymentAmount;
    private String paymentCurrencyCode;
    private String taxBase;
    private String rate;
    private String rateTypeCode;
    private String rateCurrencyCode;
    private String rateTNVEDQualifierCode;
    private String paymentWayCode;
    private String customsPaymentSubspecies;

    /** 
     * Get the 'CustomsPaymentSign' element value. Признак таможенного платежа.
     * 
     * @return value
     */
    public String getCustomsPaymentSign() {
        return customsPaymentSign;
    }

    /** 
     * Set the 'CustomsPaymentSign' element value. Признак таможенного платежа.
     * 
     * @param customsPaymentSign
     */
    public void setCustomsPaymentSign(String customsPaymentSign) {
        this.customsPaymentSign = customsPaymentSign;
    }

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
     * Get the 'PaymentAmount' element value. Сумма платежа
     * 
     * @return value
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /** 
     * Set the 'PaymentAmount' element value. Сумма платежа
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /** 
     * Get the 'PaymentCurrencyCode' element value. Цифровой код валюты суммы платежа.
     * 
     * @return value
     */
    public String getPaymentCurrencyCode() {
        return paymentCurrencyCode;
    }

    /** 
     * Set the 'PaymentCurrencyCode' element value. Цифровой код валюты суммы платежа.
     * 
     * @param paymentCurrencyCode
     */
    public void setPaymentCurrencyCode(String paymentCurrencyCode) {
        this.paymentCurrencyCode = paymentCurrencyCode;
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
     * Get the 'PaymentWayCode' element value. Способ платежа
     * 
     * @return value
     */
    public String getPaymentWayCode() {
        return paymentWayCode;
    }

    /** 
     * Set the 'PaymentWayCode' element value. Способ платежа
     * 
     * @param paymentWayCode
     */
    public void setPaymentWayCode(String paymentWayCode) {
        this.paymentWayCode = paymentWayCode;
    }

    /** 
     * Get the 'CustomsPaymentSubspecies' element value. Подвид  таможенного платежа.
     * 
     * @return value
     */
    public String getCustomsPaymentSubspecies() {
        return customsPaymentSubspecies;
    }

    /** 
     * Set the 'CustomsPaymentSubspecies' element value. Подвид  таможенного платежа.
     * 
     * @param customsPaymentSubspecies
     */
    public void setCustomsPaymentSubspecies(String customsPaymentSubspecies) {
        this.customsPaymentSubspecies = customsPaymentSubspecies;
    }
}
