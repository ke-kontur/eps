
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
     * Get the 'PaymentID' element value. ����� ���������� ���������
     * 
     * @return value
     */
    public String getPaymentID() {
        return paymentID;
    }

    /** 
     * Set the 'PaymentID' element value. ����� ���������� ���������
     * 
     * @param paymentID
     */
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ���������� ���������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ���������� ���������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'PaymentAmount' element value. ����� ����� ���������� ���������
     * 
     * @return value
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /** 
     * Set the 'PaymentAmount' element value. ����� ����� ���������� ���������
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ ��
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ ��
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'Balance' element value. ���������������� ������� ������� �� ��
     * 
     * @return value
     */
    public String getBalance() {
        return balance;
    }

    /** 
     * Set the 'Balance' element value. ���������������� ������� ������� �� ��
     * 
     * @param balance
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }

    /** 
     * Get the 'PaymentModeCode' element value. ��� ���� ������� 
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. ��� ���� ������� 
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'ReceiptDate' element value. ���� ����������� �������
     * 
     * @return value
     */
    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    /** 
     * Set the 'ReceiptDate' element value. ���� ����������� �������
     * 
     * @param receiptDate
     */
    public void setReceiptDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
    }

    /** 
     * Get the 'PaymentIndication' element value. �������� ��
     * 
     * @return value
     */
    public PaymentIndicationType getPaymentIndication() {
        return paymentIndication;
    }

    /** 
     * Set the 'PaymentIndication' element value. �������� ��
     * 
     * @param paymentIndication
     */
    public void setPaymentIndication(PaymentIndicationType paymentIndication) {
        this.paymentIndication = paymentIndication;
    }
}
