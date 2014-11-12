
package ru.acs.fts.schemas.album.paymenttransactionreport;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.cardcommonaggregatetypes.BaseDocType;

/** 
 * ����������� ��� ������������� ������
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
     * Get the 'RemotePaymentSign' element value. ������� ��������� ������. 0 - ������ ����� ����������� ��������, ��������� ��������, ��������, ������������� �� ���������� ��. 1 - ������ ����� ����������� ��������, ��������� ��������, ��������, ������������� ��� ���������� �� (������� �������� 0)
     * 
     * @return value
     */
    public String getRemotePaymentSign() {
        return remotePaymentSign;
    }

    /** 
     * Set the 'RemotePaymentSign' element value. ������� ��������� ������. 0 - ������ ����� ����������� ��������, ��������� ��������, ��������, ������������� �� ���������� ��. 1 - ������ ����� ����������� ��������, ��������� ��������, ��������, ������������� ��� ���������� �� (������� �������� 0)
     * 
     * @param remotePaymentSign
     */
    public void setRemotePaymentSign(String remotePaymentSign) {
        this.remotePaymentSign = remotePaymentSign;
    }

    /** 
     * Get the 'ResendingFlag' element value. ���� ��������� ��������. 0 - �������� ������������ �������. 1 - �������� ��� �����������
     * 
     * @return value
     */
    public String getResendingFlag() {
        return resendingFlag;
    }

    /** 
     * Set the 'ResendingFlag' element value. ���� ��������� ��������. 0 - �������� ������������ �������. 1 - �������� ��� �����������
     * 
     * @param resendingFlag
     */
    public void setResendingFlag(String resendingFlag) {
        this.resendingFlag = resendingFlag;
    }

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
     * Get the 'ProcessID' element value. ���������� ������������� ��������� �� (GUID)
     * 
     * @return value
     */
    public String getProcessID() {
        return processID;
    }

    /** 
     * Set the 'ProcessID' element value. ���������� ������������� ��������� �� (GUID)
     * 
     * @param processID
     */
    public void setProcessID(String processID) {
        this.processID = processID;
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
     * Get the 'PayerInfo' element value. ���������� � �����������
     * 
     * @return value
     */
    public PayerType getPayerInfo() {
        return payerInfo;
    }

    /** 
     * Set the 'PayerInfo' element value. ���������� � �����������
     * 
     * @param payerInfo
     */
    public void setPayerInfo(PayerType payerInfo) {
        this.payerInfo = payerInfo;
    }

    /** 
     * Get the 'Recipient' element value. �������� � ����������
     * 
     * @return value
     */
    public OrganizationInfoType getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. �������� � ����������
     * 
     * @param recipient
     */
    public void setRecipient(OrganizationInfoType recipient) {
        this.recipient = recipient;
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
