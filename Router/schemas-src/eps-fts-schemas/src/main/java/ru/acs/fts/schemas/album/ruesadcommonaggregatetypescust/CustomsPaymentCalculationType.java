
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Исчисление таможенных платежей.
 */
public class CustomsPaymentCalculationType
{
    private String customsPaymentSign;
    private String paymentModeCode;
    private String paymentAmount;
    private String paymentCurrencyCode;
    private String taxBase;
    private String taxBaseCurrencyCode;
    private String rate;
    private String rateTypeCode;
    private String rateCurrencyCode;
    private String rateTNVEDQualifierCode;
    private String weightingFactor;
    private String additionalRateSign;
    private String paymentWayCode;
    private String comparisonOperationsSign;
    private String rate2;
    private String rateTypeCode2;
    private String rateCurrencyCode2;
    private String rateTNVEDQualifierCode2;
    private String weightingFactor2;
    private String operationsSign;
    private String rate3;
    private String rateTypeCode3;
    private String rateCurrencyCode3;
    private String rateTNVEDQualifierCode3;
    private String weightingFactor3;
    private String comparisonResult;
    private LocalDate currencyUseDate;
    private LocalDate rateUseDate;

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
     * Get the 'AdditionalRateSign' element value. Резерв. Признак дополнительной ставки:    0 - основная ставка;    1 - дополнительная ставка акциза на экспорт
     * 
     * @return value
     */
    public String getAdditionalRateSign() {
        return additionalRateSign;
    }

    /** 
     * Set the 'AdditionalRateSign' element value. Резерв. Признак дополнительной ставки:    0 - основная ставка;    1 - дополнительная ставка акциза на экспорт
     * 
     * @param additionalRateSign
     */
    public void setAdditionalRateSign(String additionalRateSign) {
        this.additionalRateSign = additionalRateSign;
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
     * Get the 'ComparisonOperationsSign' element value. Знак операции сравнения (1 - меньше, 2 - больше)
     * 
     * @return value
     */
    public String getComparisonOperationsSign() {
        return comparisonOperationsSign;
    }

    /** 
     * Set the 'ComparisonOperationsSign' element value. Знак операции сравнения (1 - меньше, 2 - больше)
     * 
     * @param comparisonOperationsSign
     */
    public void setComparisonOperationsSign(String comparisonOperationsSign) {
        this.comparisonOperationsSign = comparisonOperationsSign;
    }

    /** 
     * Get the 'Rate2' element value. Ставка.
     * 
     * @return value
     */
    public String getRate2() {
        return rate2;
    }

    /** 
     * Set the 'Rate2' element value. Ставка.
     * 
     * @param rate2
     */
    public void setRate2(String rate2) {
        this.rate2 = rate2;
    }

    /** 
     * Get the 'RateTypeCode2' element value. Вид ставки (адвалорная -"%", специфическая - "*")
     * 
     * @return value
     */
    public String getRateTypeCode2() {
        return rateTypeCode2;
    }

    /** 
     * Set the 'RateTypeCode2' element value. Вид ставки (адвалорная -"%", специфическая - "*")
     * 
     * @param rateTypeCode2
     */
    public void setRateTypeCode2(String rateTypeCode2) {
        this.rateTypeCode2 = rateTypeCode2;
    }

    /** 
     * Get the 'RateCurrencyCode2' element value. Цифровой код валюты ставки (специфическая ставка)
     * 
     * @return value
     */
    public String getRateCurrencyCode2() {
        return rateCurrencyCode2;
    }

    /** 
     * Set the 'RateCurrencyCode2' element value. Цифровой код валюты ставки (специфическая ставка)
     * 
     * @param rateCurrencyCode2
     */
    public void setRateCurrencyCode2(String rateCurrencyCode2) {
        this.rateCurrencyCode2 = rateCurrencyCode2;
    }

    /** 
     * Get the 'RateTNVEDQualifierCode2' element value. Код единицы измерения ставки (специфическая ставка)
     * 
     * @return value
     */
    public String getRateTNVEDQualifierCode2() {
        return rateTNVEDQualifierCode2;
    }

    /** 
     * Set the 'RateTNVEDQualifierCode2' element value. Код единицы измерения ставки (специфическая ставка)
     * 
     * @param rateTNVEDQualifierCode2
     */
    public void setRateTNVEDQualifierCode2(String rateTNVEDQualifierCode2) {
        this.rateTNVEDQualifierCode2 = rateTNVEDQualifierCode2;
    }

    /** 
     * Get the 'WeightingFactor2' element value. Весовой коэффициент единицы измерения (специфическая ставка)
     * 
     * @return value
     */
    public String getWeightingFactor2() {
        return weightingFactor2;
    }

    /** 
     * Set the 'WeightingFactor2' element value. Весовой коэффициент единицы измерения (специфическая ставка)
     * 
     * @param weightingFactor2
     */
    public void setWeightingFactor2(String weightingFactor2) {
        this.weightingFactor2 = weightingFactor2;
    }

    /** 
     * Get the 'OperationsSign' element value. Знак операции
     * 
     * @return value
     */
    public String getOperationsSign() {
        return operationsSign;
    }

    /** 
     * Set the 'OperationsSign' element value. Знак операции
     * 
     * @param operationsSign
     */
    public void setOperationsSign(String operationsSign) {
        this.operationsSign = operationsSign;
    }

    /** 
     * Get the 'Rate3' element value. Ставка.
     * 
     * @return value
     */
    public String getRate3() {
        return rate3;
    }

    /** 
     * Set the 'Rate3' element value. Ставка.
     * 
     * @param rate3
     */
    public void setRate3(String rate3) {
        this.rate3 = rate3;
    }

    /** 
     * Get the 'RateTypeCode3' element value. Вид ставки (адвалорная -"%", специфическая - "*")
     * 
     * @return value
     */
    public String getRateTypeCode3() {
        return rateTypeCode3;
    }

    /** 
     * Set the 'RateTypeCode3' element value. Вид ставки (адвалорная -"%", специфическая - "*")
     * 
     * @param rateTypeCode3
     */
    public void setRateTypeCode3(String rateTypeCode3) {
        this.rateTypeCode3 = rateTypeCode3;
    }

    /** 
     * Get the 'RateCurrencyCode3' element value. Цифровой код валюты ставки (специфическая ставка)
     * 
     * @return value
     */
    public String getRateCurrencyCode3() {
        return rateCurrencyCode3;
    }

    /** 
     * Set the 'RateCurrencyCode3' element value. Цифровой код валюты ставки (специфическая ставка)
     * 
     * @param rateCurrencyCode3
     */
    public void setRateCurrencyCode3(String rateCurrencyCode3) {
        this.rateCurrencyCode3 = rateCurrencyCode3;
    }

    /** 
     * Get the 'RateTNVEDQualifierCode3' element value. Код единицы измерения ставки (специфическая ставка)
     * 
     * @return value
     */
    public String getRateTNVEDQualifierCode3() {
        return rateTNVEDQualifierCode3;
    }

    /** 
     * Set the 'RateTNVEDQualifierCode3' element value. Код единицы измерения ставки (специфическая ставка)
     * 
     * @param rateTNVEDQualifierCode3
     */
    public void setRateTNVEDQualifierCode3(String rateTNVEDQualifierCode3) {
        this.rateTNVEDQualifierCode3 = rateTNVEDQualifierCode3;
    }

    /** 
     * Get the 'WeightingFactor3' element value. Весовой коэффициент единицы измерения (специфическая ставка)
     * 
     * @return value
     */
    public String getWeightingFactor3() {
        return weightingFactor3;
    }

    /** 
     * Set the 'WeightingFactor3' element value. Весовой коэффициент единицы измерения (специфическая ставка)
     * 
     * @param weightingFactor3
     */
    public void setWeightingFactor3(String weightingFactor3) {
        this.weightingFactor3 = weightingFactor3;
    }

    /** 
     * Get the 'ComparisonResult' element value. Результат выполнения операции сравнения:-	1 - истина;-	0 - ложь.
     * 
     * @return value
     */
    public String getComparisonResult() {
        return comparisonResult;
    }

    /** 
     * Set the 'ComparisonResult' element value. Результат выполнения операции сравнения:-	1 - истина;-	0 - ложь.
     * 
     * @param comparisonResult
     */
    public void setComparisonResult(String comparisonResult) {
        this.comparisonResult = comparisonResult;
    }

    /** 
     * Get the 'CurrencyUseDate' element value. Дата применения курса валюты
     * 
     * @return value
     */
    public LocalDate getCurrencyUseDate() {
        return currencyUseDate;
    }

    /** 
     * Set the 'CurrencyUseDate' element value. Дата применения курса валюты
     * 
     * @param currencyUseDate
     */
    public void setCurrencyUseDate(LocalDate currencyUseDate) {
        this.currencyUseDate = currencyUseDate;
    }

    /** 
     * Get the 'RateUseDate' element value. Дата применения ставки таможенного платежа.
     * 
     * @return value
     */
    public LocalDate getRateUseDate() {
        return rateUseDate;
    }

    /** 
     * Set the 'RateUseDate' element value. Дата применения ставки таможенного платежа.
     * 
     * @param rateUseDate
     */
    public void setRateUseDate(LocalDate rateUseDate) {
        this.rateUseDate = rateUseDate;
    }
}
