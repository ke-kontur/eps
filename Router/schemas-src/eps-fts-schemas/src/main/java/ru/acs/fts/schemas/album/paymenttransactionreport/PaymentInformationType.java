
package ru.acs.fts.schemas.album.paymenttransactionreport;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.cardcommonaggregatetypes.DocumentBaseType;
import ru.acs.fts.schemas.album.cardcommonaggregatetypes.OrganizationBaseType;

/** 
 * Сведения о платеже
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
     * Get the 'PaymentDocumentKind' element value. Тип платежного документа: 01 - таможенная платежная карта; 02 - банковская карта; 03 - наличные денежные средства; 04 - зарезервировано
     * 
     * @return value
     */
    public String getPaymentDocumentKind() {
        return paymentDocumentKind;
    }

    /** 
     * Set the 'PaymentDocumentKind' element value. Тип платежного документа: 01 - таможенная платежная карта; 02 - банковская карта; 03 - наличные денежные средства; 04 - зарезервировано
     * 
     * @param paymentDocumentKind
     */
    public void setPaymentDocumentKind(String paymentDocumentKind) {
        this.paymentDocumentKind = paymentDocumentKind;
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
     * Get the 'PaymentAsgmtIndicator' element value. Показатель основания платежа
     * 
     * @return value
     */
    public String getPaymentAsgmtIndicator() {
        return paymentAsgmtIndicator;
    }

    /** 
     * Set the 'PaymentAsgmtIndicator' element value. Показатель основания платежа
     * 
     * @param paymentAsgmtIndicator
     */
    public void setPaymentAsgmtIndicator(String paymentAsgmtIndicator) {
        this.paymentAsgmtIndicator = paymentAsgmtIndicator;
    }

    /** 
     * Get the 'CBC' element value. Код бюджетной классификации
     * 
     * @return value
     */
    public String getCBC() {
        return CBC;
    }

    /** 
     * Set the 'CBC' element value. Код бюджетной классификации
     * 
     * @param CBC
     */
    public void setCBC(String CBC) {
        this.CBC = CBC;
    }

    /** 
     * Get the 'PaymentKind' element value. Код вида платежа
     * 
     * @return value
     */
    public String getPaymentKind() {
        return paymentKind;
    }

    /** 
     * Set the 'PaymentKind' element value. Код вида платежа
     * 
     * @param paymentKind
     */
    public void setPaymentKind(String paymentKind) {
        this.paymentKind = paymentKind;
    }

    /** 
     * Get the 'PaymentBaseDocument' element value. Документ, являющийся основанием для совершения платежа
     * 
     * @return value
     */
    public DocumentBaseType getPaymentBaseDocument() {
        return paymentBaseDocument;
    }

    /** 
     * Set the 'PaymentBaseDocument' element value. Документ, являющийся основанием для совершения платежа
     * 
     * @param paymentBaseDocument
     */
    public void setPaymentBaseDocument(DocumentBaseType paymentBaseDocument) {
        this.paymentBaseDocument = paymentBaseDocument;
    }

    /** 
     * Get the 'SystemOperator' element value. Оператор системы, в которой оформлен платеж
     * 
     * @return value
     */
    public OrganizationBaseType getSystemOperator() {
        return systemOperator;
    }

    /** 
     * Set the 'SystemOperator' element value. Оператор системы, в которой оформлен платеж
     * 
     * @param systemOperator
     */
    public void setSystemOperator(OrganizationBaseType systemOperator) {
        this.systemOperator = systemOperator;
    }
}
