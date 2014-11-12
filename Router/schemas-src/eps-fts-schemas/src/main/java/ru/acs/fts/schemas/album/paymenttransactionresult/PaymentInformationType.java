
package ru.acs.fts.schemas.album.paymenttransactionresult;

import org.joda.time.LocalDate;

/** 
 * Сведения о платеже
 */
public class PaymentInformationType
{
    private LocalDate processingDate;
    private String currencyCode;
    private String amount;
    private String bankTransactionID;
    private String customsCode;
    private LocalDate paymentDate;
    private String paymentTime;
    private String cardNumber;

    /** 
     * Get the 'ProcessingDate' element value. Дата обработки оператором таможенных платежей операции уплаты таможенных и иных платежей
     * 
     * @return value
     */
    public LocalDate getProcessingDate() {
        return processingDate;
    }

    /** 
     * Set the 'ProcessingDate' element value. Дата обработки оператором таможенных платежей операции уплаты таможенных и иных платежей
     * 
     * @param processingDate
     */
    public void setProcessingDate(LocalDate processingDate) {
        this.processingDate = processingDate;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты платежа
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты платежа
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'Amount' element value. Сумма платежа
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма платежа
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'BankTransactionID' element value. Уникальный идентификатор банковской операции
     * 
     * @return value
     */
    public String getBankTransactionID() {
        return bankTransactionID;
    }

    /** 
     * Set the 'BankTransactionID' element value. Уникальный идентификатор банковской операции
     * 
     * @param bankTransactionID
     */
    public void setBankTransactionID(String bankTransactionID) {
        this.bankTransactionID = bankTransactionID;
    }

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа - получателя платежа
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа - получателя платежа
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'PaymentDate' element value. Дата совершения платежа
     * 
     * @return value
     */
    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    /** 
     * Set the 'PaymentDate' element value. Дата совершения платежа
     * 
     * @param paymentDate
     */
    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    /** 
     * Get the 'PaymentTime' element value. Время совершения платежа
     * 
     * @return value
     */
    public String getPaymentTime() {
        return paymentTime;
    }

    /** 
     * Set the 'PaymentTime' element value. Время совершения платежа
     * 
     * @param paymentTime
     */
    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    /** 
     * Get the 'CardNumber' element value. Номер таможенной платежной карты, с использованием которой был осуществлен платеж
     * 
     * @return value
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /** 
     * Set the 'CardNumber' element value. Номер таможенной платежной карты, с использованием которой был осуществлен платеж
     * 
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
