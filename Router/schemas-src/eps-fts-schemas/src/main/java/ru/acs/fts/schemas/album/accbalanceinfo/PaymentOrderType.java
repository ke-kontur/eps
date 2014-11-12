
package ru.acs.fts.schemas.album.accbalanceinfo;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.exchangecommonaggregatetypescust.PaymentIndicationType;

public class PaymentOrderType
{
    private String paymentID;
    private LocalDate issueDate;
    private String paymentAmount;
    private String currencyCode;
    private String balance;
    private String paymentModeCode;
    private LocalDate receiptDate;
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
     * Get the 'IssueDate' element value. Дата платежного документа
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата платежного документа
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'PaymentAmount' element value. Общая сумма платежного документа
     * 
     * @return value
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /** 
     * Set the 'PaymentAmount' element value. Общая сумма платежного документа
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
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
     * Get the 'Balance' element value. Неиспользованный остаток средств на ПП
     * 
     * @return value
     */
    public String getBalance() {
        return balance;
    }

    /** 
     * Set the 'Balance' element value. Неиспользованный остаток средств на ПП
     * 
     * @param balance
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }

    /** 
     * Get the 'PaymentModeCode' element value. Код вида платежа 
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. Код вида платежа 
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'ReceiptDate' element value. Срок поступления средств
     * 
     * @return value
     */
    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    /** 
     * Set the 'ReceiptDate' element value. Срок поступления средств
     * 
     * @param receiptDate
     */
    public void setReceiptDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
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
