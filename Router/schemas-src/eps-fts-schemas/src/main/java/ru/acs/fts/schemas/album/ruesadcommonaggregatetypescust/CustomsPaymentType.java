
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Таможенные платежи.
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
     * Get the 'PaymentModeCode' element value. Код вида таможенного платежа по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. Код вида таможенного платежа по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'PaymentAmount' element value. Сумма платежа / обеспечения
     * 
     * @return value
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /** 
     * Set the 'PaymentAmount' element value. Сумма платежа / обеспечения
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /** 
     * Get the 'PaymentCurrencyCode' element value. Цифровой код валюты суммы платежа / обеспечения
     * 
     * @return value
     */
    public String getPaymentCurrencyCode() {
        return paymentCurrencyCode;
    }

    /** 
     * Set the 'PaymentCurrencyCode' element value. Цифровой код валюты суммы платежа / обеспечения
     * 
     * @param paymentCurrencyCode
     */
    public void setPaymentCurrencyCode(String paymentCurrencyCode) {
        this.paymentCurrencyCode = paymentCurrencyCode;
    }

    /** 
     * Get the 'CurrencyRate' element value. Курс валюты платежа / обеспечения
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. Курс валюты платежа / обеспечения
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'PaymentEnsuringModeCodeType' element value. Код вида обеспечения уплаты
     * 
     * @return value
     */
    public String getPaymentEnsuringModeCodeType() {
        return paymentEnsuringModeCodeType;
    }

    /** 
     * Set the 'PaymentEnsuringModeCodeType' element value. Код вида обеспечения уплаты
     * 
     * @param paymentEnsuringModeCodeType
     */
    public void setPaymentEnsuringModeCodeType(
            String paymentEnsuringModeCodeType) {
        this.paymentEnsuringModeCodeType = paymentEnsuringModeCodeType;
    }

    /** 
     * Get the 'ReturnSign' element value. Признак возврата денежных средств
     * 
     * @return value
     */
    public String getReturnSign() {
        return returnSign;
    }

    /** 
     * Set the 'ReturnSign' element value. Признак возврата денежных средств
     * 
     * @param returnSign
     */
    public void setReturnSign(String returnSign) {
        this.returnSign = returnSign;
    }

    /** 
     * Get the 'DelayPaymentDate' element value. Дата отсрочки уплаты
     * 
     * @return value
     */
    public LocalDate getDelayPaymentDate() {
        return delayPaymentDate;
    }

    /** 
     * Set the 'DelayPaymentDate' element value. Дата отсрочки уплаты
     * 
     * @param delayPaymentDate
     */
    public void setDelayPaymentDate(LocalDate delayPaymentDate) {
        this.delayPaymentDate = delayPaymentDate;
    }

    /** 
     * Get the 'PaymentParticularitySign' element value. Особенность уплаты таможенных платежей:1-ПОД ОБЕСПЕЧЕНИЕ
     * 
     * @return value
     */
    public String getPaymentParticularitySign() {
        return paymentParticularitySign;
    }

    /** 
     * Set the 'PaymentParticularitySign' element value. Особенность уплаты таможенных платежей:1-ПОД ОБЕСПЕЧЕНИЕ
     * 
     * @param paymentParticularitySign
     */
    public void setPaymentParticularitySign(String paymentParticularitySign) {
        this.paymentParticularitySign = paymentParticularitySign;
    }

    /** 
     * Get the 'DelayPremitNumber' element value. Номер разрешения на отсрочку платежа.
     * 
     * @return value
     */
    public String getDelayPremitNumber() {
        return delayPremitNumber;
    }

    /** 
     * Set the 'DelayPremitNumber' element value. Номер разрешения на отсрочку платежа.
     * 
     * @param delayPremitNumber
     */
    public void setDelayPremitNumber(String delayPremitNumber) {
        this.delayPremitNumber = delayPremitNumber;
    }

    /** 
     * Get the 'DelayPremitDate' element value. Дата разрешения на отсрочку платежа.
     * 
     * @return value
     */
    public LocalDate getDelayPremitDate() {
        return delayPremitDate;
    }

    /** 
     * Set the 'DelayPremitDate' element value. Дата разрешения на отсрочку платежа.
     * 
     * @param delayPremitDate
     */
    public void setDelayPremitDate(LocalDate delayPremitDate) {
        this.delayPremitDate = delayPremitDate;
    }
}
