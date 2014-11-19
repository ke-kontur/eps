
package ru.acs.fts.schemas.album.paymenttransactionresult;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.cardcommonaggregatetypes.BaseDocType;

/** 
 * Сообщение о результатах обработки
 */
public class PaymentTransactionResultType extends BaseDocType
{
    private String documentStatusFlag;
    private LocalDate documentDate;
    private DocumentNumberType documentNumber;
    private PaymentInformationType paymentInformation;
    private ErrorInfoType errorInfo;
    private String documentModeID;

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
     * Get the 'ErrorInfo' element value. Сведения об ошибке
     * 
     * @return value
     */
    public ErrorInfoType getErrorInfo() {
        return errorInfo;
    }

    /** 
     * Set the 'ErrorInfo' element value. Сведения об ошибке
     * 
     * @param errorInfo
     */
    public void setErrorInfo(ErrorInfoType errorInfo) {
        this.errorInfo = errorInfo;
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
