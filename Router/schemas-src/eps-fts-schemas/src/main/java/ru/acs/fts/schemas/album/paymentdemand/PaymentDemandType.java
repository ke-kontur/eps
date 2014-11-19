
package ru.acs.fts.schemas.album.paymentdemand;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.BankMarkType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.PartPaymentType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.PayCustomerType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ��������� ����������
 */
public class PaymentDemandType extends BaseDocType
{
    private String paymentAmount;
    private String transactionKind;
    private LocalDate receiptDateCollectBank;
    private LocalDate receiptDate;
    private LocalDate chargeOffDate;
    private LocalDate maturiryDate;
    private String acceptanceAmount;
    private LocalDate docDispatchDate;
    private String acceptanceTerm;
    private String paymentCondition;
    private String priority;
    private String purpose;
    private String valueSpelledOut;
    private String paymentModeCode;
    private LocalDate finCardDate;
    private DocumentBaseType documentReference;
    private PayCustomerType payer;
    private PayCustomerType payee;
    private DocumentBaseType paymentConditionRef;
    private List<PersonSignatureType> documentSignList = new ArrayList<PersonSignatureType>();
    private List<BankMarkType> recipBankMarkList = new ArrayList<BankMarkType>();
    private List<BankMarkType> payBankMarkList = new ArrayList<BankMarkType>();
    private List<PartPaymentType> partPaymentList = new ArrayList<PartPaymentType>();
    private String documentModeID;

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
     * Get the 'ReceiptDateCollectBank' element value. ���� ������������� ���������� ����������� � ������������� ��� ���� 
     * 
     * @return value
     */
    public LocalDate getReceiptDateCollectBank() {
        return receiptDateCollectBank;
    }

    /** 
     * Set the 'ReceiptDateCollectBank' element value. ���� ������������� ���������� ����������� � ������������� ��� ���� 
     * 
     * @param receiptDateCollectBank
     */
    public void setReceiptDateCollectBank(LocalDate receiptDateCollectBank) {
        this.receiptDateCollectBank = receiptDateCollectBank;
    }

    /** 
     * Get the 'ReceiptDate' element value. ���� ����������� ���������� ��������� � ���� �����������. ����������� ��� �������� ������� ��������� �����������  (������. � ����. ����)
     * 
     * @return value
     */
    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    /** 
     * Set the 'ReceiptDate' element value. ���� ����������� ���������� ��������� � ���� �����������. ����������� ��� �������� ������� ��������� �����������  (������. � ����. ����)
     * 
     * @param receiptDate
     */
    public void setReceiptDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
    }

    /** 
     * Get the 'ChargeOffDate' element value. ���� �������� �������� ������� �� ����� �����������. ����������� ��� �������� ������� ��������� ����������� (������� �� ��. ����.)
     * 
     * @return value
     */
    public LocalDate getChargeOffDate() {
        return chargeOffDate;
    }

    /** 
     * Set the 'ChargeOffDate' element value. ���� �������� �������� ������� �� ����� �����������. ����������� ��� �������� ������� ��������� ����������� (������� �� ��. ����.)
     * 
     * @param chargeOffDate
     */
    public void setChargeOffDate(LocalDate chargeOffDate) {
        this.chargeOffDate = chargeOffDate;
    }

    /** 
     * Get the 'MaturiryDate' element value. ��������� ����� �������
     * 
     * @return value
     */
    public LocalDate getMaturiryDate() {
        return maturiryDate;
    }

    /** 
     * Set the 'MaturiryDate' element value. ��������� ����� �������
     * 
     * @param maturiryDate
     */
    public void setMaturiryDate(LocalDate maturiryDate) {
        this.maturiryDate = maturiryDate;
    }

    /** 
     * Get the 'AcceptanceAmount' element value. ����� ��������� ���������� ���������, �������������� � �������. ����������� ��� ��������� ������� (������ ������������� �����, ���������� � ������)
     * 
     * @return value
     */
    public String getAcceptanceAmount() {
        return acceptanceAmount;
    }

    /** 
     * Set the 'AcceptanceAmount' element value. ����� ��������� ���������� ���������, �������������� � �������. ����������� ��� ��������� ������� (������ ������������� �����, ���������� � ������)
     * 
     * @param acceptanceAmount
     */
    public void setAcceptanceAmount(String acceptanceAmount) {
        this.acceptanceAmount = acceptanceAmount;
    }

    /** 
     * Get the 'DocDispatchDate' element value. ���� ������� (��������) ����������� ��������������� ��������� ����������. ������������� � ������, ���� ��� ��������� ���� �������� (�������) ����������� ������� �����������
     * 
     * @return value
     */
    public LocalDate getDocDispatchDate() {
        return docDispatchDate;
    }

    /** 
     * Set the 'DocDispatchDate' element value. ���� ������� (��������) ����������� ��������������� ��������� ����������. ������������� � ������, ���� ��� ��������� ���� �������� (�������) ����������� ������� �����������
     * 
     * @param docDispatchDate
     */
    public void setDocDispatchDate(LocalDate docDispatchDate) {
        this.docDispatchDate = docDispatchDate;
    }

    /** 
     * Get the 'AcceptanceTerm' element value. ���������� ���� ��� �������, �������������� ���������, � ������, ���� ������ ������������ ��� ������� ������� ���������� ���������� ������������
     * 
     * @return value
     */
    public String getAcceptanceTerm() {
        return acceptanceTerm;
    }

    /** 
     * Set the 'AcceptanceTerm' element value. ���������� ���� ��� �������, �������������� ���������, � ������, ���� ������ ������������ ��� ������� ������� ���������� ���������� ������������
     * 
     * @param acceptanceTerm
     */
    public void setAcceptanceTerm(String acceptanceTerm) {
        this.acceptanceTerm = acceptanceTerm;
    }

    /** 
     * Get the 'PaymentCondition' element value. ������� ������ ����������� ��� ���������� ���������� (1 - � ��������, 2 - ��� �������)
     * 
     * @return value
     */
    public String getPaymentCondition() {
        return paymentCondition;
    }

    /** 
     * Set the 'PaymentCondition' element value. ������� ������ ����������� ��� ���������� ���������� (1 - � ��������, 2 - ��� �������)
     * 
     * @param paymentCondition
     */
    public void setPaymentCondition(String paymentCondition) {
        this.paymentCondition = paymentCondition;
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
     * Get the 'FinCardDate' element value. ���� ��������� � ���������
     * 
     * @return value
     */
    public LocalDate getFinCardDate() {
        return finCardDate;
    }

    /** 
     * Set the 'FinCardDate' element value. ���� ��������� � ���������
     * 
     * @param finCardDate
     */
    public void setFinCardDate(LocalDate finCardDate) {
        this.finCardDate = finCardDate;
    }

    /** 
     * Get the 'DocumentReference' element value. ��������� ���������
     * 
     * @return value
     */
    public DocumentBaseType getDocumentReference() {
        return documentReference;
    }

    /** 
     * Set the 'DocumentReference' element value. ��������� ���������
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
    public PayCustomerType getPayer() {
        return payer;
    }

    /** 
     * Set the 'Payer' element value. ��������� �����������
     * 
     * @param payer
     */
    public void setPayer(PayCustomerType payer) {
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
     * Get the 'PaymentConditionRef' element value. ������� ������. ��� �������� ������� ��� ������� ����������� - ������ �� �����, ���� �������� � ������ ������ ��� �����, ���� � ����� �������� � ����� ������������� ��������
     * 
     * @return value
     */
    public DocumentBaseType getPaymentConditionRef() {
        return paymentConditionRef;
    }

    /** 
     * Set the 'PaymentConditionRef' element value. ������� ������. ��� �������� ������� ��� ������� ����������� - ������ �� �����, ���� �������� � ������ ������ ��� �����, ���� � ����� �������� � ����� ������������� ��������
     * 
     * @param paymentConditionRef
     */
    public void setPaymentConditionRef(DocumentBaseType paymentConditionRef) {
        this.paymentConditionRef = paymentConditionRef;
    }

    /** 
     * Get the list of 'DocumentSign' element items. �������
     * 
     * @return list
     */
    public List<PersonSignatureType> getDocumentSignList() {
        return documentSignList;
    }

    /** 
     * Set the list of 'DocumentSign' element items. �������
     * 
     * @param list
     */
    public void setDocumentSignList(List<PersonSignatureType> list) {
        documentSignList = list;
    }

    /** 
     * Get the list of 'RecipBankMark' element items. ������� ����� ����������
     * 
     * @return list
     */
    public List<BankMarkType> getRecipBankMarkList() {
        return recipBankMarkList;
    }

    /** 
     * Set the list of 'RecipBankMark' element items. ������� ����� ����������
     * 
     * @param list
     */
    public void setRecipBankMarkList(List<BankMarkType> list) {
        recipBankMarkList = list;
    }

    /** 
     * Get the list of 'PayBankMark' element items. ������� ����� �����������
     * 
     * @return list
     */
    public List<BankMarkType> getPayBankMarkList() {
        return payBankMarkList;
    }

    /** 
     * Set the list of 'PayBankMark' element items. ������� ����� �����������
     * 
     * @param list
     */
    public void setPayBankMarkList(List<BankMarkType> list) {
        payBankMarkList = list;
    }

    /** 
     * Get the list of 'PartPayment' element items. �������� � ��������� �������
     * 
     * @return list
     */
    public List<PartPaymentType> getPartPaymentList() {
        return partPaymentList;
    }

    /** 
     * Set the list of 'PartPayment' element items. �������� � ��������� �������
     * 
     * @param list
     */
    public void setPartPaymentList(List<PartPaymentType> list) {
        partPaymentList = list;
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
