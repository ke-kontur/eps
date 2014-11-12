
package ru.acs.fts.schemas.album.paymentdocument;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * �������� ������ ���������� � ���� �������� 
 */
public class PaymentDocumentType extends BaseDocType
{
    private String PDKind;
    private String PDParticular;
    private String numberPD;
    private RegistrationNumberType registrationNumber;
    private List<PayerInfoType> payerInfoList = new ArrayList<PayerInfoType>();
    private List<PrecedingDocumentType> precedingDocumentList = new ArrayList<PrecedingDocumentType>();
    private List<PayableAmountType> payableAmountList = new ArrayList<PayableAmountType>();
    private List<PaidType> paidList = new ArrayList<PaidType>();
    private List<ExcessPaymentAmountType> excessPaymentAmountList = new ArrayList<ExcessPaymentAmountType>();
    private List<OutstandingBalancesType> outstandingBalanceList = new ArrayList<OutstandingBalancesType>();
    private FledgingType fledging;
    private PersonSignatureType receiptPD;
    private String documentModeID;

    /** 
     * Get the 'PDKind' element value. ��� ��: "1" - ��/��; "2" - ��/���; "3" - ��/��.
     * 
     * @return value
     */
    public String getPDKind() {
        return PDKind;
    }

    /** 
     * Set the 'PDKind' element value. ��� ��: "1" - ��/��; "2" - ��/���; "3" - ��/��.
     * 
     * @param PDKind
     */
    public void setPDKind(String PDKind) {
        this.PDKind = PDKind;
    }

    /** 
     * Get the 'PDParticular' element value. ����������� �� : ��/��:- ��� ����������� �������������� ������� (��. 7 ��) ��/���:- ��� ������ (��. 1 ���) ��/��:- ��� �������� (��. 1 ��)
     * 
     * @return value
     */
    public String getPDParticular() {
        return PDParticular;
    }

    /** 
     * Set the 'PDParticular' element value. ����������� �� : ��/��:- ��� ����������� �������������� ������� (��. 7 ��) ��/���:- ��� ������ (��. 1 ���) ��/��:- ��� �������� (��. 1 ��)
     * 
     * @param PDParticular
     */
    public void setPDParticular(String PDParticular) {
        this.PDParticular = PDParticular;
    }

    /** 
     * Get the 'NumberPD' element value. ����� �� �� �������
     * 
     * @return value
     */
    public String getNumberPD() {
        return numberPD;
    }

    /** 
     * Set the 'NumberPD' element value. ����� �� �� �������
     * 
     * @param numberPD
     */
    public void setNumberPD(String numberPD) {
        this.numberPD = numberPD;
    }

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� ����� ��/���������� ����� ���/���������� ����� ��.
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� ����� ��/���������� ����� ���/���������� ����� ��.
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the list of 'PayerInfo' element items. �������� � �����������
     * 
     * @return list
     */
    public List<PayerInfoType> getPayerInfoList() {
        return payerInfoList;
    }

    /** 
     * Set the list of 'PayerInfo' element items. �������� � �����������
     * 
     * @param list
     */
    public void setPayerInfoList(List<PayerInfoType> list) {
        payerInfoList = list;
    }

    /** 
     * Get the list of 'PrecedingDocument' element items. "�� - �������������� ��/�������������� ���/ �������������� ��"
     * 
     * @return list
     */
    public List<PrecedingDocumentType> getPrecedingDocumentList() {
        return precedingDocumentList;
    }

    /** 
     * Set the list of 'PrecedingDocument' element items. "�� - �������������� ��/�������������� ���/ �������������� ��"
     * 
     * @param list
     */
    public void setPrecedingDocumentList(List<PrecedingDocumentType> list) {
        precedingDocumentList = list;
    }

    /** 
     * Get the list of 'PayableAmount' element items. �� - ����� � ������/������������� �����
     * 
     * @return list
     */
    public List<PayableAmountType> getPayableAmountList() {
        return payableAmountList;
    }

    /** 
     * Set the list of 'PayableAmount' element items. �� - ����� � ������/������������� �����
     * 
     * @param list
     */
    public void setPayableAmountList(List<PayableAmountType> list) {
        payableAmountList = list;
    }

    /** 
     * Get the list of 'Paid' element items. �� - ��������
     * 
     * @return list
     */
    public List<PaidType> getPaidList() {
        return paidList;
    }

    /** 
     * Set the list of 'Paid' element items. �� - ��������
     * 
     * @param list
     */
    public void setPaidList(List<PaidType> list) {
        paidList = list;
    }

    /** 
     * Get the list of 'ExcessPaymentAmount' element items. �� - ����� �������� ������, ������ � �����
     * 
     * @return list
     */
    public List<ExcessPaymentAmountType> getExcessPaymentAmountList() {
        return excessPaymentAmountList;
    }

    /** 
     * Set the list of 'ExcessPaymentAmount' element items. �� - ����� �������� ������, ������ � �����
     * 
     * @param list
     */
    public void setExcessPaymentAmountList(List<ExcessPaymentAmountType> list) {
        excessPaymentAmountList = list;
    }

    /** 
     * Get the list of 'OutstandingBalances' element items. �� - ������������� �������
     * 
     * @return list
     */
    public List<OutstandingBalancesType> getOutstandingBalanceList() {
        return outstandingBalanceList;
    }

    /** 
     * Set the list of 'OutstandingBalances' element items. �� - ������������� �������
     * 
     * @param list
     */
    public void setOutstandingBalanceList(List<OutstandingBalancesType> list) {
        outstandingBalanceList = list;
    }

    /** 
     * Get the 'Fledging' element value. ������������ ��
     * 
     * @return value
     */
    public FledgingType getFledging() {
        return fledging;
    }

    /** 
     * Set the 'Fledging' element value. ������������ ��
     * 
     * @param fledging
     */
    public void setFledging(FledgingType fledging) {
        this.fledging = fledging;
    }

    /** 
     * Get the 'ReceiptPD' element value. ��������� ��
     * 
     * @return value
     */
    public PersonSignatureType getReceiptPD() {
        return receiptPD;
    }

    /** 
     * Set the 'ReceiptPD' element value. ��������� ��
     * 
     * @param receiptPD
     */
    public void setReceiptPD(PersonSignatureType receiptPD) {
        this.receiptPD = receiptPD;
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
