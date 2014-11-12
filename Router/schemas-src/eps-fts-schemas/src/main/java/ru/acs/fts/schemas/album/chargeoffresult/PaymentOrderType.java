
package ru.acs.fts.schemas.album.chargeoffresult;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.exchangecommonaggregatetypescust.PaymentIndicationType;

/** 
 * Платежные поручения.
 */
public class PaymentOrderType
{
    private String paymentID;
    private String currencyCode;
    private String balance;
    private String shortageAssets;
    private LocalDate paymentDate;
    private PaymentIndicationType paymentIndication;

    /** 
     * Get the 'PaymentID' element value. Номер платежного поручения
     * 
     * @return value
     */
    public String getPaymentID() {
        return paymentID;
    }

    /** 
     * Set the 'PaymentID' element value. Номер платежного поручения
     * 
     * @param paymentID
     */
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты ПП
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты ПП
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'Balance' element value. Остаток средств на ПП после списания
     * 
     * @return value
     */
    public String getBalance() {
        return balance;
    }

    /** 
     * Set the 'Balance' element value. Остаток средств на ПП после списания
     * 
     * @param balance
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }

    /** 
     * Get the 'ShortageAssets' element value. Сумма нехватки средств после списания (только для статуса ответа D)
     * 
     * @return value
     */
    public String getShortageAssets() {
        return shortageAssets;
    }

    /** 
     * Set the 'ShortageAssets' element value. Сумма нехватки средств после списания (только для статуса ответа D)
     * 
     * @param shortageAssets
     */
    public void setShortageAssets(String shortageAssets) {
        this.shortageAssets = shortageAssets;
    }

    /** 
     * Get the 'PaymentDate' element value. Дата платежного поручения
     * 
     * @return value
     */
    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    /** 
     * Set the 'PaymentDate' element value. Дата платежного поручения
     * 
     * @param paymentDate
     */
    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    /** 
     * Get the 'PaymentIndication' element value. Признаки ПП
     * 
     * @return value
     */
    public PaymentIndicationType getPaymentIndication() {
        return paymentIndication;
    }

    /** 
     * Set the 'PaymentIndication' element value. Признаки ПП
     * 
     * @param paymentIndication
     */
    public void setPaymentIndication(PaymentIndicationType paymentIndication) {
        this.paymentIndication = paymentIndication;
    }
}
