
package ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust;

/** 
 * Перерасчет платежей
 */
public class KTSPaymentsReCalcType
{
    private String paymentModeCode;
    private String paymentAmount;
    private String precedingPaymentAmount;
    private String changeAmount;
    private String paymentCurrencyCode;

    /** 
     * Get the 'PaymentModeCode' element value. Код вида платежа  по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. Код вида платежа  по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы
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
     * Get the 'PrecedingPaymentAmount' element value. Предыдущая сумма платежа
     * 
     * @return value
     */
    public String getPrecedingPaymentAmount() {
        return precedingPaymentAmount;
    }

    /** 
     * Set the 'PrecedingPaymentAmount' element value. Предыдущая сумма платежа
     * 
     * @param precedingPaymentAmount
     */
    public void setPrecedingPaymentAmount(String precedingPaymentAmount) {
        this.precedingPaymentAmount = precedingPaymentAmount;
    }

    /** 
     * Get the 'ChangeAmount' element value. Изменение
     * 
     * @return value
     */
    public String getChangeAmount() {
        return changeAmount;
    }

    /** 
     * Set the 'ChangeAmount' element value. Изменение
     * 
     * @param changeAmount
     */
    public void setChangeAmount(String changeAmount) {
        this.changeAmount = changeAmount;
    }

    /** 
     * Get the 'PaymentCurrencyCode' element value. Цифровой код валюты суммы платежа
     * 
     * @return value
     */
    public String getPaymentCurrencyCode() {
        return paymentCurrencyCode;
    }

    /** 
     * Set the 'PaymentCurrencyCode' element value. Цифровой код валюты суммы платежа
     * 
     * @param paymentCurrencyCode
     */
    public void setPaymentCurrencyCode(String paymentCurrencyCode) {
        this.paymentCurrencyCode = paymentCurrencyCode;
    }
}
