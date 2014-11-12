
package ru.acs.fts.schemas.album.paymenttransactionreport;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.cardcommonaggregatetypes.DocumentBaseType;
import ru.acs.fts.schemas.album.cardcommonaggregatetypes.OrganizationBaseType;

/** 
 * �������� � �������
 */
public class PaymentInformationType
{
    private LocalDate processingDate;
    private String currencyCode;
    private String amount;
    private String paymentDocumentKind;
    private String bankTransactionID;
    private String customsCode;
    private LocalDate paymentDate;
    private String paymentTime;
    private String paymentAsgmtIndicator;
    private String CBC;
    private String paymentKind;
    private DocumentBaseType paymentBaseDocument;
    private OrganizationBaseType systemOperator;

    /** 
     * Get the 'ProcessingDate' element value. ���� ��������� ���������� ���������� �������� �������� ������ ���������� � ���� ��������
     * 
     * @return value
     */
    public LocalDate getProcessingDate() {
        return processingDate;
    }

    /** 
     * Set the 'ProcessingDate' element value. ���� ��������� ���������� ���������� �������� �������� ������ ���������� � ���� ��������
     * 
     * @param processingDate
     */
    public void setProcessingDate(LocalDate processingDate) {
        this.processingDate = processingDate;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ �������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ �������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'Amount' element value. ����� �������
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. ����� �������
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'PaymentDocumentKind' element value. ��� ���������� ���������: 01 - ���������� ��������� �����; 02 - ���������� �����; 03 - �������� �������� ��������; 04 - ���������������
     * 
     * @return value
     */
    public String getPaymentDocumentKind() {
        return paymentDocumentKind;
    }

    /** 
     * Set the 'PaymentDocumentKind' element value. ��� ���������� ���������: 01 - ���������� ��������� �����; 02 - ���������� �����; 03 - �������� �������� ��������; 04 - ���������������
     * 
     * @param paymentDocumentKind
     */
    public void setPaymentDocumentKind(String paymentDocumentKind) {
        this.paymentDocumentKind = paymentDocumentKind;
    }

    /** 
     * Get the 'BankTransactionID' element value. ���������� ������������� ���������� ��������
     * 
     * @return value
     */
    public String getBankTransactionID() {
        return bankTransactionID;
    }

    /** 
     * Set the 'BankTransactionID' element value. ���������� ������������� ���������� ��������
     * 
     * @param bankTransactionID
     */
    public void setBankTransactionID(String bankTransactionID) {
        this.bankTransactionID = bankTransactionID;
    }

    /** 
     * Get the 'CustomsCode' element value. ��� ����������� ������ - ���������� �������
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� ������ - ���������� �������
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'PaymentDate' element value. ���� ���������� �������
     * 
     * @return value
     */
    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    /** 
     * Set the 'PaymentDate' element value. ���� ���������� �������
     * 
     * @param paymentDate
     */
    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    /** 
     * Get the 'PaymentTime' element value. ����� ���������� �������
     * 
     * @return value
     */
    public String getPaymentTime() {
        return paymentTime;
    }

    /** 
     * Set the 'PaymentTime' element value. ����� ���������� �������
     * 
     * @param paymentTime
     */
    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    /** 
     * Get the 'PaymentAsgmtIndicator' element value. ���������� ��������� �������
     * 
     * @return value
     */
    public String getPaymentAsgmtIndicator() {
        return paymentAsgmtIndicator;
    }

    /** 
     * Set the 'PaymentAsgmtIndicator' element value. ���������� ��������� �������
     * 
     * @param paymentAsgmtIndicator
     */
    public void setPaymentAsgmtIndicator(String paymentAsgmtIndicator) {
        this.paymentAsgmtIndicator = paymentAsgmtIndicator;
    }

    /** 
     * Get the 'CBC' element value. ��� ��������� �������������
     * 
     * @return value
     */
    public String getCBC() {
        return CBC;
    }

    /** 
     * Set the 'CBC' element value. ��� ��������� �������������
     * 
     * @param CBC
     */
    public void setCBC(String CBC) {
        this.CBC = CBC;
    }

    /** 
     * Get the 'PaymentKind' element value. ��� ���� �������
     * 
     * @return value
     */
    public String getPaymentKind() {
        return paymentKind;
    }

    /** 
     * Set the 'PaymentKind' element value. ��� ���� �������
     * 
     * @param paymentKind
     */
    public void setPaymentKind(String paymentKind) {
        this.paymentKind = paymentKind;
    }

    /** 
     * Get the 'PaymentBaseDocument' element value. ��������, ���������� ���������� ��� ���������� �������
     * 
     * @return value
     */
    public DocumentBaseType getPaymentBaseDocument() {
        return paymentBaseDocument;
    }

    /** 
     * Set the 'PaymentBaseDocument' element value. ��������, ���������� ���������� ��� ���������� �������
     * 
     * @param paymentBaseDocument
     */
    public void setPaymentBaseDocument(DocumentBaseType paymentBaseDocument) {
        this.paymentBaseDocument = paymentBaseDocument;
    }

    /** 
     * Get the 'SystemOperator' element value. �������� �������, � ������� �������� ������
     * 
     * @return value
     */
    public OrganizationBaseType getSystemOperator() {
        return systemOperator;
    }

    /** 
     * Set the 'SystemOperator' element value. �������� �������, � ������� �������� ������
     * 
     * @param systemOperator
     */
    public void setSystemOperator(OrganizationBaseType systemOperator) {
        this.systemOperator = systemOperator;
    }
}
