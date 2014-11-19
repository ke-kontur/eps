
package ru.acs.fts.schemas.album.applicationreturncreditingcash;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BankInformationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ��������� � �������� (������) �������� �������
 */
public class ApplicationReturnCreditingCashType extends BaseDocType
{
    private List<String> articleList = new ArrayList<String>();
    private String returnCrediting;
    private String cashType;
    private String reasonReturningCrediting;
    private String conditionCrediting;
    private String amountCash;
    private String currency;
    private OrganizationType applicantInfo;
    private CustomsType customs;
    private List<DocumentBaseType> paymentDocumentList = new ArrayList<DocumentBaseType>();
    private DocumentBaseType customsReceipt;
    private BankInformationType bankInformation;
    private List<DocumentBaseType> attachedDocumentList = new ArrayList<DocumentBaseType>();
    private PersonSignatureType applicantSignature;
    private List<GTDIDType> GTDIDList = new ArrayList<GTDIDType>();
    private String documentModeID;

    /** 
     * Get the list of 'Article' element items. ����� ������ ������������ ������
     * 
     * @return list
     */
    public List<String> getArticleList() {
        return articleList;
    }

    /** 
     * Set the list of 'Article' element items. ����� ������ ������������ ������
     * 
     * @param list
     */
    public void setArticleList(List<String> list) {
        articleList = list;
    }

    /** 
     * Get the 'ReturnCrediting' element value. ��������� �: 0 - ��������, 1 - ������
     * 
     * @return value
     */
    public String getReturnCrediting() {
        return returnCrediting;
    }

    /** 
     * Set the 'ReturnCrediting' element value. ��������� �: 0 - ��������, 1 - ������
     * 
     * @param returnCrediting
     */
    public void setReturnCrediting(String returnCrediting) {
        this.returnCrediting = returnCrediting;
    }

    /** 
     * Get the 'CashType' element value. ����������� �������� ��������, ���������� �������� (������), � ������: ������� ���������� ���������� �������, ������; ������� ���������� ���������� �������, ������; ���������� �������, ������, ���������� �������� � �������, ������������� ������� 356 ����������� ������� ���������� ���������; ��������� �������; �������� �����
     * 
     * @return value
     */
    public String getCashType() {
        return cashType;
    }

    /** 
     * Set the 'CashType' element value. ����������� �������� ��������, ���������� �������� (������), � ������: ������� ���������� ���������� �������, ������; ������� ���������� ���������� �������, ������; ���������� �������, ������, ���������� �������� � �������, ������������� ������� 356 ����������� ������� ���������� ���������; ��������� �������; �������� �����
     * 
     * @param cashType
     */
    public void setCashType(String cashType) {
        this.cashType = cashType;
    }

    /** 
     * Get the 'ReasonReturningCrediting' element value. ��������� ��� ���������� �������� (������)
     * 
     * @return value
     */
    public String getReasonReturningCrediting() {
        return reasonReturningCrediting;
    }

    /** 
     * Set the 'ReasonReturningCrediting' element value. ��������� ��� ���������� �������� (������)
     * 
     * @param reasonReturningCrediting
     */
    public void setReasonReturningCrediting(String reasonReturningCrediting) {
        this.reasonReturningCrediting = reasonReturningCrediting;
    }

    /** 
     * Get the 'ConditionCrediting' element value. ����������� ��������������, � ����� � �������� ������������ �����: ��������� ������������� �� ������ ���������� ��������, ����� � ���� ������� ��������, ����������� ������ ���������� �������� � �.�.
     * 
     * @return value
     */
    public String getConditionCrediting() {
        return conditionCrediting;
    }

    /** 
     * Set the 'ConditionCrediting' element value. ����������� ��������������, � ����� � �������� ������������ �����: ��������� ������������� �� ������ ���������� ��������, ����� � ���� ������� ��������, ����������� ������ ���������� �������� � �.�.
     * 
     * @param conditionCrediting
     */
    public void setConditionCrediting(String conditionCrediting) {
        this.conditionCrediting = conditionCrediting;
    }

    /** 
     * Get the 'AmountCash' element value. ����� �������� �������
     * 
     * @return value
     */
    public String getAmountCash() {
        return amountCash;
    }

    /** 
     * Set the 'AmountCash' element value. ����� �������� �������
     * 
     * @param amountCash
     */
    public void setAmountCash(String amountCash) {
        this.amountCash = amountCash;
    }

    /** 
     * Get the 'Currency' element value. ������
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. ������
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'ApplicantInfo' element value. �������� � ���������
     * 
     * @return value
     */
    public OrganizationType getApplicantInfo() {
        return applicantInfo;
    }

    /** 
     * Set the 'ApplicantInfo' element value. �������� � ���������
     * 
     * @param applicantInfo
     */
    public void setApplicantInfo(OrganizationType applicantInfo) {
        this.applicantInfo = applicantInfo;
    }

    /** 
     * Get the 'Customs' element value. ����������� ������, �������� ���� ������� �������� ��������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ����������� ������, �������� ���� ������� �������� ��������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the list of 'PaymentDocument' element items. ��������� ���������� ���������
     * 
     * @return list
     */
    public List<DocumentBaseType> getPaymentDocumentList() {
        return paymentDocumentList;
    }

    /** 
     * Set the list of 'PaymentDocument' element items. ��������� ���������� ���������
     * 
     * @param list
     */
    public void setPaymentDocumentList(List<DocumentBaseType> list) {
        paymentDocumentList = list;
    }

    /** 
     * Get the 'CustomsReceipt' element value. ��������� ���������� ��������
     * 
     * @return value
     */
    public DocumentBaseType getCustomsReceipt() {
        return customsReceipt;
    }

    /** 
     * Set the 'CustomsReceipt' element value. ��������� ���������� ��������
     * 
     * @param customsReceipt
     */
    public void setCustomsReceipt(DocumentBaseType customsReceipt) {
        this.customsReceipt = customsReceipt;
    }

    /** 
     * Get the 'BankInformation' element value. ���������� � ���������� ������
     * 
     * @return value
     */
    public BankInformationType getBankInformation() {
        return bankInformation;
    }

    /** 
     * Set the 'BankInformation' element value. ���������� � ���������� ������
     * 
     * @param bankInformation
     */
    public void setBankInformation(BankInformationType bankInformation) {
        this.bankInformation = bankInformation;
    }

    /** 
     * Get the list of 'AttachedDocuments' element items. �������� ����������� ����������
     * 
     * @return list
     */
    public List<DocumentBaseType> getAttachedDocumentList() {
        return attachedDocumentList;
    }

    /** 
     * Set the list of 'AttachedDocuments' element items. �������� ����������� ����������
     * 
     * @param list
     */
    public void setAttachedDocumentList(List<DocumentBaseType> list) {
        attachedDocumentList = list;
    }

    /** 
     * Get the 'ApplicantSignature' element value. ������ ���������
     * 
     * @return value
     */
    public PersonSignatureType getApplicantSignature() {
        return applicantSignature;
    }

    /** 
     * Set the 'ApplicantSignature' element value. ������ ���������
     * 
     * @param applicantSignature
     */
    public void setApplicantSignature(PersonSignatureType applicantSignature) {
        this.applicantSignature = applicantSignature;
    }

    /** 
     * Get the list of 'GTDID' element items. ����� ����������� ���������
     * 
     * @return list
     */
    public List<GTDIDType> getGTDIDList() {
        return GTDIDList;
    }

    /** 
     * Set the list of 'GTDID' element items. ����� ����������� ���������
     * 
     * @param list
     */
    public void setGTDIDList(List<GTDIDType> list) {
        GTDIDList = list;
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
