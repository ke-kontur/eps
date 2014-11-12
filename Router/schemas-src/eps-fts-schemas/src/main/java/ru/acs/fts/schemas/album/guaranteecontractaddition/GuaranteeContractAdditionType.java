
package ru.acs.fts.schemas.album.guaranteecontractaddition;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ���������� � �������� ��������������
 */
public class GuaranteeContractAdditionType extends BaseDocType
{
    private String dutyAmount;
    private String currencyCode;
    private LocalDate validityDate;
    private OrganizationInfoType guarantor;
    private OrganizationInfoType paymentProvider;
    private OrganizationInfoType declarant;
    private DocumentInfoType transportDocument;
    private DocumentBaseType guaranteeDocument;
    private List<DocumentInfoType> commercialDocumentList = new ArrayList<DocumentInfoType>();
    private CUCustomsType arrivalCustoms;
    private CUCustomsType depatureCustoms;
    private GTDIDType regNumberDT;
    private String documentModeID;

    /** 
     * Get the 'DutyAmount' element value. ����� ����������� ���������� ������ � �������
     * 
     * @return value
     */
    public String getDutyAmount() {
        return dutyAmount;
    }

    /** 
     * Set the 'DutyAmount' element value. ����� ����������� ���������� ������ � �������
     * 
     * @param dutyAmount
     */
    public void setDutyAmount(String dutyAmount) {
        this.dutyAmount = dutyAmount;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ �����������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ �����������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'ValidityDate' element value. C���, �� ��������� �������� �������� ������������� ���������� � ����� ����������� ������ ���������� ������, ������� ��� ���������� �������� �������.
     * 
     * @return value
     */
    public LocalDate getValidityDate() {
        return validityDate;
    }

    /** 
     * Set the 'ValidityDate' element value. C���, �� ��������� �������� �������� ������������� ���������� � ����� ����������� ������ ���������� ������, ������� ��� ���������� �������� �������.
     * 
     * @param validityDate
     */
    public void setValidityDate(LocalDate validityDate) {
        this.validityDate = validityDate;
    }

    /** 
     * Get the 'Guarantor' element value. �������� � ����������
     * 
     * @return value
     */
    public OrganizationInfoType getGuarantor() {
        return guarantor;
    }

    /** 
     * Set the 'Guarantor' element value. �������� � ����������
     * 
     * @param guarantor
     */
    public void setGuarantor(OrganizationInfoType guarantor) {
        this.guarantor = guarantor;
    }

    /** 
     * Get the 'PaymentProvider' element value. �������� � ����, �������������� ����������� ������ ���������� ������, ������� 
     * 
     * @return value
     */
    public OrganizationInfoType getPaymentProvider() {
        return paymentProvider;
    }

    /** 
     * Set the 'PaymentProvider' element value. �������� � ����, �������������� ����������� ������ ���������� ������, ������� 
     * 
     * @param paymentProvider
     */
    public void setPaymentProvider(OrganizationInfoType paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    /** 
     * Get the 'Declarant' element value. �������� � ����������
     * 
     * @return value
     */
    public OrganizationInfoType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. �������� � ����������
     * 
     * @param declarant
     */
    public void setDeclarant(OrganizationInfoType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'TransportDocument' element value. �������� � ������������ (������������) ���������
     * 
     * @return value
     */
    public DocumentInfoType getTransportDocument() {
        return transportDocument;
    }

    /** 
     * Set the 'TransportDocument' element value. �������� � ������������ (������������) ���������
     * 
     * @param transportDocument
     */
    public void setTransportDocument(DocumentInfoType transportDocument) {
        this.transportDocument = transportDocument;
    }

    /** 
     * Get the 'GuaranteeDocument' element value. C������� � �������� ��������������
     * 
     * @return value
     */
    public DocumentBaseType getGuaranteeDocument() {
        return guaranteeDocument;
    }

    /** 
     * Set the 'GuaranteeDocument' element value. C������� � �������� ��������������
     * 
     * @param guaranteeDocument
     */
    public void setGuaranteeDocument(DocumentBaseType guaranteeDocument) {
        this.guaranteeDocument = guaranteeDocument;
    }

    /** 
     * Get the list of 'CommercialDocument' element items. �������� � ������������ ���������
     * 
     * @return list
     */
    public List<DocumentInfoType> getCommercialDocumentList() {
        return commercialDocumentList;
    }

    /** 
     * Set the list of 'CommercialDocument' element items. �������� � ������������ ���������
     * 
     * @param list
     */
    public void setCommercialDocumentList(List<DocumentInfoType> list) {
        commercialDocumentList = list;
    }

    /** 
     * Get the 'ArrivalCustoms' element value. ���������� ����� ����������
     * 
     * @return value
     */
    public CUCustomsType getArrivalCustoms() {
        return arrivalCustoms;
    }

    /** 
     * Set the 'ArrivalCustoms' element value. ���������� ����� ����������
     * 
     * @param arrivalCustoms
     */
    public void setArrivalCustoms(CUCustomsType arrivalCustoms) {
        this.arrivalCustoms = arrivalCustoms;
    }

    /** 
     * Get the 'DepatureCustoms' element value. ���������� ����� �����������
     * 
     * @return value
     */
    public CUCustomsType getDepatureCustoms() {
        return depatureCustoms;
    }

    /** 
     * Set the 'DepatureCustoms' element value. ���������� ����� �����������
     * 
     * @param depatureCustoms
     */
    public void setDepatureCustoms(CUCustomsType depatureCustoms) {
        this.depatureCustoms = depatureCustoms;
    }

    /** 
     * Get the 'RegNumberDT' element value. ��������������� ����� ���������� ����������
     * 
     * @return value
     */
    public GTDIDType getRegNumberDT() {
        return regNumberDT;
    }

    /** 
     * Set the 'RegNumberDT' element value. ��������������� ����� ���������� ����������
     * 
     * @param regNumberDT
     */
    public void setRegNumberDT(GTDIDType regNumberDT) {
        this.regNumberDT = regNumberDT;
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
