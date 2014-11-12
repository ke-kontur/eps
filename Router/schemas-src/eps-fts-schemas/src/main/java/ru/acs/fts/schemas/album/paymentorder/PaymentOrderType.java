
package ru.acs.fts.schemas.album.paymentorder;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.PayCustomerType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ��������� ���������
 */
public class PaymentOrderType extends BaseDocType
{
    private String paymentModeCode;
    private String paymentAmount;
    private String transactionKind;
    private String priority;
    private LocalDate receiptDate;
    private LocalDate chargeOffDate;
    private String purpose;
    private String valueSpelledOut;
    private DocumentBaseType documentReference;
    private PayerType payer;
    private PayCustomerType payee;
    private DepartmentalDetailsType departmentalInfo;
    private List<PersonSignatureType> payerSignList = new ArrayList<PersonSignatureType>();
    private PersonSignatureType bankSign;
    private String documentModeID;

    /** 
     * Get the 'PaymentModeCode' element value. ��� ���� ������� (0 - �� ���������, 1 - ����������, 2 - ������, 3 - ����������)
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. ��� ���� ������� (0 - �� ���������, 1 - ����������, 2 - ������, 3 - ����������)
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'PaymentAmount' element value. �����
     * 
     * @return value
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /** 
     * Set the 'PaymentAmount' element value. �����
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /** 
     * Get the 'TransactionKind' element value. ��� ��������. ������������� �������� "01"
     * 
     * @return value
     */
    public String getTransactionKind() {
        return transactionKind;
    }

    /** 
     * Set the 'TransactionKind' element value. ��� ��������. ������������� �������� "01"
     * 
     * @param transactionKind
     */
    public void setTransactionKind(String transactionKind) {
        this.transactionKind = transactionKind;
    }

    /** 
     * Get the 'Priority' element value. ����������� �������
     * 
     * @return value
     */
    public String getPriority() {
        return priority;
    }

    /** 
     * Set the 'Priority' element value. ����������� �������
     * 
     * @param priority
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /** 
     * Get the 'ReceiptDate' element value. ���� ����������� ���������� ��������� � ���� �����������. ����������� ��� �������� ������� ��������� �����������
     * 
     * @return value
     */
    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    /** 
     * Set the 'ReceiptDate' element value. ���� ����������� ���������� ��������� � ���� �����������. ����������� ��� �������� ������� ��������� �����������
     * 
     * @param receiptDate
     */
    public void setReceiptDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
    }

    /** 
     * Get the 'ChargeOffDate' element value. ���� �������� �������� ������� �� ����� �����������. ����������� ��� �������� ������� ��������� �����������
     * 
     * @return value
     */
    public LocalDate getChargeOffDate() {
        return chargeOffDate;
    }

    /** 
     * Set the 'ChargeOffDate' element value. ���� �������� �������� ������� �� ����� �����������. ����������� ��� �������� ������� ��������� �����������
     * 
     * @param chargeOffDate
     */
    public void setChargeOffDate(LocalDate chargeOffDate) {
        this.chargeOffDate = chargeOffDate;
    }

    /** 
     * Get the 'Purpose' element value. ���������� �������
     * 
     * @return value
     */
    public String getPurpose() {
        return purpose;
    }

    /** 
     * Set the 'Purpose' element value. ���������� �������
     * 
     * @param purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /** 
     * Get the 'ValueSpelledOut' element value. ����� ��������
     * 
     * @return value
     */
    public String getValueSpelledOut() {
        return valueSpelledOut;
    }

    /** 
     * Set the 'ValueSpelledOut' element value. ����� ��������
     * 
     * @param valueSpelledOut
     */
    public void setValueSpelledOut(String valueSpelledOut) {
        this.valueSpelledOut = valueSpelledOut;
    }

    /** 
     * Get the 'DocumentReference' element value. ��������� ���������� ���������
     * 
     * @return value
     */
    public DocumentBaseType getDocumentReference() {
        return documentReference;
    }

    /** 
     * Set the 'DocumentReference' element value. ��������� ���������� ���������
     * 
     * @param documentReference
     */
    public void setDocumentReference(DocumentBaseType documentReference) {
        this.documentReference = documentReference;
    }

    /** 
     * Get the 'Payer' element value. ��������� �����������
     * 
     * @return value
     */
    public PayerType getPayer() {
        return payer;
    }

    /** 
     * Set the 'Payer' element value. ��������� �����������
     * 
     * @param payer
     */
    public void setPayer(PayerType payer) {
        this.payer = payer;
    }

    /** 
     * Get the 'Payee' element value. ��������� ����������
     * 
     * @return value
     */
    public PayCustomerType getPayee() {
        return payee;
    }

    /** 
     * Set the 'Payee' element value. ��������� ����������
     * 
     * @param payee
     */
    public void setPayee(PayCustomerType payee) {
        this.payee = payee;
    }

    /** 
     * Get the 'DepartmentalInfo' element value. ������������� ����������
     * 
     * @return value
     */
    public DepartmentalDetailsType getDepartmentalInfo() {
        return departmentalInfo;
    }

    /** 
     * Set the 'DepartmentalInfo' element value. ������������� ����������
     * 
     * @param departmentalInfo
     */
    public void setDepartmentalInfo(DepartmentalDetailsType departmentalInfo) {
        this.departmentalInfo = departmentalInfo;
    }

    /** 
     * Get the list of 'PayerSign' element items. �������  �����������
     * 
     * @return list
     */
    public List<PersonSignatureType> getPayerSignList() {
        return payerSignList;
    }

    /** 
     * Set the list of 'PayerSign' element items. �������  �����������
     * 
     * @param list
     */
    public void setPayerSignList(List<PersonSignatureType> list) {
        payerSignList = list;
    }

    /** 
     * Get the 'BankSign' element value. ������� �����
     * 
     * @return value
     */
    public PersonSignatureType getBankSign() {
        return bankSign;
    }

    /** 
     * Set the 'BankSign' element value. ������� �����
     * 
     * @param bankSign
     */
    public void setBankSign(PersonSignatureType bankSign) {
        this.bankSign = bankSign;
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
