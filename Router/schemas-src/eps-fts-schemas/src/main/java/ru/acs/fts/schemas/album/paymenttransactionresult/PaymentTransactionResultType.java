
package ru.acs.fts.schemas.album.paymenttransactionresult;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.cardcommonaggregatetypes.BaseDocType;

/** 
 * ��������� � ����������� ���������
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
     * Get the 'DocumentStatusFlag' element value. ���� ��������� ���������. 1 - ����� �������� (������������ �������), 2 - ����������� ��������� (������������ ������ ���������)
     * 
     * @return value
     */
    public String getDocumentStatusFlag() {
        return documentStatusFlag;
    }

    /** 
     * Set the 'DocumentStatusFlag' element value. ���� ��������� ���������. 1 - ����� �������� (������������ �������), 2 - ����������� ��������� (������������ ������ ���������)
     * 
     * @param documentStatusFlag
     */
    public void setDocumentStatusFlag(String documentStatusFlag) {
        this.documentStatusFlag = documentStatusFlag;
    }

    /** 
     * Get the 'DocumentDate' element value. ���� ����
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. ���� ����
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    /** 
     * Get the 'DocumentNumber' element value. ����� ���������
     * 
     * @return value
     */
    public DocumentNumberType getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. ����� ���������
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(DocumentNumberType documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'PaymentInformation' element value. �������� � �������
     * 
     * @return value
     */
    public PaymentInformationType getPaymentInformation() {
        return paymentInformation;
    }

    /** 
     * Set the 'PaymentInformation' element value. �������� � �������
     * 
     * @param paymentInformation
     */
    public void setPaymentInformation(PaymentInformationType paymentInformation) {
        this.paymentInformation = paymentInformation;
    }

    /** 
     * Get the 'ErrorInfo' element value. �������� �� ������
     * 
     * @return value
     */
    public ErrorInfoType getErrorInfo() {
        return errorInfo;
    }

    /** 
     * Set the 'ErrorInfo' element value. �������� �� ������
     * 
     * @param errorInfo
     */
    public void setErrorInfo(ErrorInfoType errorInfo) {
        this.errorInfo = errorInfo;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
