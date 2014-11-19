
package ru.acs.fts.schemas.album.paymenttransactionreport;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.cardcommonaggregatetypes.BaseDocType;

/** 
 * Электронный чек подтверждения уплаты
 */
public class PaymentTransactionReportType extends BaseDocType
{
    private LocalDate documentDate;
    private String remotePaymentSign;
    private String resendingFlag;
    private String documentStatusFlag;
    private String processID;
    private DocumentNumberType documentNumber;
    private PaymentInformationType paymentInformation;
    private PayerType payerInfo;
    private OrganizationInfoType recipient;
    private String documentModeID;

    /** 
     * Get the 'DocumentDate' element value. Дата чека
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. Дата чека
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    /** 
     * Get the 'RemotePaymentSign' element value. Признак удаленной оплаты. 0 - оплата через электронный терминал, платежный терминал, банкомат, расположенные на территории ТО. 1 - оплата через электронный терминал, платежный терминал, банкомат, расположенные вне территории ТО (текущее значение 0)
     * 
     * @return value
     */
    public String getRemotePaymentSign() {
        return remotePaymentSign;
    }

    /** 
     * Set the 'RemotePaymentSign' element value. Признак удаленной оплаты. 0 - оплата через электронный терминал, платежный терминал, банкомат, расположенные на территории ТО. 1 - оплата через электронный терминал, платежный терминал, банкомат, расположенные вне территории ТО (текущее значение 0)
     * 
     * @param remotePaymentSign
     */
    public void setRemotePaymentSign(String remotePaymentSign) {
        this.remotePaymentSign = remotePaymentSign;
    }

    /** 
     * Get the 'ResendingFlag' element value. Флаг повторной отправки. 0 - документ отправляется впервые. 1 - документ уже отправлялся
     * 
     * @return value
     */
    public String getResendingFlag() {
        return resendingFlag;
    }

    /** 
     * Set the 'ResendingFlag' element value. Флаг повторной отправки. 0 - документ отправляется впервые. 1 - документ уже отправлялся
     * 
     * @param resendingFlag
     */
    public void setResendingFlag(String resendingFlag) {
        this.resendingFlag = resendingFlag;
    }

    /** 
     * Get the 'DocumentStatusFlag' element value. Флаг состояния документа. 1 - новый документ (отправляется впервые), 2 - исправление документа (исправленная версия документа)
     * 
     * @return value
     */
    public String getDocumentStatusFlag() {
        return documentStatusFlag;
    }

    /** 
     * Set the 'DocumentStatusFlag' element value. Флаг состояния документа. 1 - новый документ (отправляется впервые), 2 - исправление документа (исправленная версия документа)
     * 
     * @param documentStatusFlag
     */
    public void setDocumentStatusFlag(String documentStatusFlag) {
        this.documentStatusFlag = documentStatusFlag;
    }

    /** 
     * Get the 'ProcessID' element value. Уникальный идентификатор процедуры ЭД (GUID)
     * 
     * @return value
     */
    public String getProcessID() {
        return processID;
    }

    /** 
     * Set the 'ProcessID' element value. Уникальный идентификатор процедуры ЭД (GUID)
     * 
     * @param processID
     */
    public void setProcessID(String processID) {
        this.processID = processID;
    }

    /** 
     * Get the 'DocumentNumber' element value. Номер документа
     * 
     * @return value
     */
    public DocumentNumberType getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер документа
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(DocumentNumberType documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'PaymentInformation' element value. Сведения о платеже
     * 
     * @return value
     */
    public PaymentInformationType getPaymentInformation() {
        return paymentInformation;
    }

    /** 
     * Set the 'PaymentInformation' element value. Сведения о платеже
     * 
     * @param paymentInformation
     */
    public void setPaymentInformation(PaymentInformationType paymentInformation) {
        this.paymentInformation = paymentInformation;
    }

    /** 
     * Get the 'PayerInfo' element value. Информация о плательщике
     * 
     * @return value
     */
    public PayerType getPayerInfo() {
        return payerInfo;
    }

    /** 
     * Set the 'PayerInfo' element value. Информация о плательщике
     * 
     * @param payerInfo
     */
    public void setPayerInfo(PayerType payerInfo) {
        this.payerInfo = payerInfo;
    }

    /** 
     * Get the 'Recipient' element value. Сведения о получателе
     * 
     * @return value
     */
    public OrganizationInfoType getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. Сведения о получателе
     * 
     * @param recipient
     */
    public void setRecipient(OrganizationInfoType recipient) {
        this.recipient = recipient;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
