
package ru.acs.fts.schemas.album.paymentdocument;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �� - ��������
 */
public class PaidType extends DocumentBaseType
{
    private String BCC;
    private String paymentDocumentType;
    private String totalAmount;
    private String writeOffs;
    private LocalDate datewWiting;
    private String serialNumber;
    private String currencyCode;
    private String kindAccrual;
    private String paymentCurrCode;
    private String paymentModeCode;
    private List<DocumentBaseType> agreementList = new ArrayList<DocumentBaseType>();
    private PayerOrgDataType payerOrgData;

    /** 
     * Get the 'BCC' element value. ��� ��������� ������������� (���) �������� ��������������  ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������.
     * 
     * @return value
     */
    public String getBCC() {
        return BCC;
    }

    /** 
     * Set the 'BCC' element value. ��� ��������� ������������� (���) �������� ��������������  ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������.
     * 
     * @param BCC
     */
    public void setBCC(String BCC) {
        this.BCC = BCC;
    }

    /** 
     * Get the 'PaymentDocumentType' element value. ��� ���������� ���������: "1" - "��" (��� ����������� ������ �������� �������); "2" - "���" (��� �������� �������� ������� � ����� ����������� ������); "3" - "����." (��� �������� �������� ������� � ����� ��������� ����������� ��� �� ������������ ������������ �� ���� ������������ ������������); "4" - "���" (��� ������ ���������� �������� ����������� ����������������� ����������� ����); "5" - "����." (��� ���������������� ������ ���������� ��������).
     * 
     * @return value
     */
    public String getPaymentDocumentType() {
        return paymentDocumentType;
    }

    /** 
     * Set the 'PaymentDocumentType' element value. ��� ���������� ���������: "1" - "��" (��� ����������� ������ �������� �������); "2" - "���" (��� �������� �������� ������� � ����� ����������� ������); "3" - "����." (��� �������� �������� ������� � ����� ��������� ����������� ��� �� ������������ ������������ �� ���� ������������ ������������); "4" - "���" (��� ������ ���������� �������� ����������� ����������������� ����������� ����); "5" - "����." (��� ���������������� ������ ���������� ��������).
     * 
     * @param paymentDocumentType
     */
    public void setPaymentDocumentType(String paymentDocumentType) {
        this.paymentDocumentType = paymentDocumentType;
    }

    /** 
     * Get the 'TotalAmount' element value. ����� ����� �� ���������� ���������
     * 
     * @return value
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /** 
     * Set the 'TotalAmount' element value. ����� ����� �� ���������� ���������
     * 
     * @param totalAmount
     */
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /** 
     * Get the 'WriteOffs' element value. ��/��, ��/���: - ����� �������� (������) �������� ������� � ���� ������ ���������� ��������; ��/��: - ����� �������� (������) �������� ������� � ���� ����������� ������ ���������� ������, �������
     * 
     * @return value
     */
    public String getWriteOffs() {
        return writeOffs;
    }

    /** 
     * Set the 'WriteOffs' element value. ��/��, ��/���: - ����� �������� (������) �������� ������� � ���� ������ ���������� ��������; ��/��: - ����� �������� (������) �������� ������� � ���� ����������� ������ ���������� ������, �������
     * 
     * @param writeOffs
     */
    public void setWriteOffs(String writeOffs) {
        this.writeOffs = writeOffs;
    }

    /** 
     * Get the 'DatewWiting' element value. ��/��, ��/���: - ���� �������� (������) �������� ������� � ���� ������ ���������� ��������; ��/��: - ���� �������� (������) �������� ������� � ���� ����������� ������ ���������� ������, �������
     * 
     * @return value
     */
    public LocalDate getDatewWiting() {
        return datewWiting;
    }

    /** 
     * Set the 'DatewWiting' element value. ��/��, ��/���: - ���� �������� (������) �������� ������� � ���� ������ ���������� ��������; ��/��: - ���� �������� (������) �������� ������� � ���� ����������� ������ ���������� ������, �������
     * 
     * @param datewWiting
     */
    public void setDatewWiting(LocalDate datewWiting) {
        this.datewWiting = datewWiting;
    }

    /** 
     * Get the 'SerialNumber' element value. ��/��: - ���������� ����� ��� (���), �� ������� ����������� ������������ �������� 
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. ��/��: - ���������� ����� ��� (���), �� ������� ����������� ������������ �������� 
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /** 
     * Get the 'CurrencyCode' element value. �������� ��� ������ ������� / ������������� �����
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. �������� ��� ������ ������� / ������������� �����
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'KindAccrual' element value. ��/��:  - ��� ���������, ������� �������� ���������� ��� ������������ ��������: "2" - "���"; "3" - "���".
     * 
     * @return value
     */
    public String getKindAccrual() {
        return kindAccrual;
    }

    /** 
     * Set the 'KindAccrual' element value. ��/��:  - ��� ���������, ������� �������� ���������� ��� ������������ ��������: "2" - "���"; "3" - "���".
     * 
     * @param kindAccrual
     */
    public void setKindAccrual(String kindAccrual) {
        this.kindAccrual = kindAccrual;
    }

    /** 
     * Get the 'PaymentCurrCode' element value. �������� ��� ������ ����� �� ���������� ���������
     * 
     * @return value
     */
    public String getPaymentCurrCode() {
        return paymentCurrCode;
    }

    /** 
     * Set the 'PaymentCurrCode' element value. �������� ��� ������ ����� �� ���������� ���������
     * 
     * @param paymentCurrCode
     */
    public void setPaymentCurrCode(String paymentCurrCode) {
        this.paymentCurrCode = paymentCurrCode;
    }

    /** 
     * Get the 'PaymentModeCode' element value. ��� ���� ������� � ������������ � ���������������  ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. ��� ���� ������� � ������������ � ���������������  ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the list of 'Agreement' element items. C��������� � ���������� ����������������� ������� ������ ���������� ������, �������
     * 
     * @return list
     */
    public List<DocumentBaseType> getAgreementList() {
        return agreementList;
    }

    /** 
     * Set the list of 'Agreement' element items. C��������� � ���������� ����������������� ������� ������ ���������� ������, �������
     * 
     * @param list
     */
    public void setAgreementList(List<DocumentBaseType> list) {
        agreementList = list;
    }

    /** 
     * Get the 'PayerOrgData' element value. �������� � ����������� �� ���������� ���������
     * 
     * @return value
     */
    public PayerOrgDataType getPayerOrgData() {
        return payerOrgData;
    }

    /** 
     * Set the 'PayerOrgData' element value. �������� � ����������� �� ���������� ���������
     * 
     * @param payerOrgData
     */
    public void setPayerOrgData(PayerOrgDataType payerOrgData) {
        this.payerOrgData = payerOrgData;
    }
}
