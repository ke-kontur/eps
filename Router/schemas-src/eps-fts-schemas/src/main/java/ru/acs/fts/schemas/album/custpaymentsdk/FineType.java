
package ru.acs.fts.schemas.album.custpaymentsdk;

/** 
 * Пени
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
     * Get the 'CustomsFineSign' element value. Признак пени.
     * 
     * @return value
     */
    public String getCustomsFineSign() {
        return customsFineSign;
    }

    /** 
     * Set the 'CustomsFineSign' element value. Признак пени.
     * 
     * @param customsFineSign
     */
    public void setCustomsFineSign(String customsFineSign) {
        this.customsFineSign = customsFineSign;
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
     * Get the 'PaymentAmount' element value. Сумма пени
     * 
     * @return value
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /** 
     * Set the 'PaymentAmount' element value. Сумма пени
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
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
     * Get the 'CurrencyRate' element value. Курс валюты
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. Курс валюты
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }
}
